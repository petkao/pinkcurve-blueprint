#!/bin/bash
#
# build-pdf.sh - Generate PDF from blueprint documentation
#
# Prerequisites:
#   - pandoc (https://pandoc.org/installing.html)
#   - A LaTeX distribution (e.g., MacTeX, TeX Live)
#     OR use --pdf-engine=wkhtmltopdf with wkhtmltopdf installed
#
# Usage:
#   ./scripts/build-pdf.sh
#
# Output:
#   export/pinkcurve-blueprint.pdf
#

set -e

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
ROOT_DIR="$(dirname "$SCRIPT_DIR")"
OUTPUT_DIR="$ROOT_DIR/export"
OUTPUT_FILE="$OUTPUT_DIR/pinkcurve-blueprint.pdf"

# Check for pandoc
if ! command -v pandoc &> /dev/null; then
    echo "Error: pandoc is required but not installed."
    echo "Install with: brew install pandoc (macOS) or apt install pandoc (Ubuntu)"
    exit 1
fi

# Determine PDF engine
PDF_ENGINE=""
if command -v xelatex &> /dev/null; then
    PDF_ENGINE="xelatex"
elif command -v pdflatex &> /dev/null; then
    PDF_ENGINE="pdflatex"
elif command -v wkhtmltopdf &> /dev/null; then
    PDF_ENGINE="wkhtmltopdf"
else
    echo "Warning: No PDF engine found. Attempting with default..."
    echo "For best results, install a LaTeX distribution or wkhtmltopdf."
fi

# Ensure output directory exists
mkdir -p "$OUTPUT_DIR"

# Build list of markdown files in order
DOCS=(
    "$ROOT_DIR/README.md"
    "$ROOT_DIR/docs/00-executive-summary.md"
    "$ROOT_DIR/docs/01-vision-and-mission.md"
    "$ROOT_DIR/docs/02-design-principles.md"
    "$ROOT_DIR/docs/03-product-architecture.md"
    "$ROOT_DIR/docs/04-product-knowledge.md"
    "$ROOT_DIR/docs/05-creative-studio.md"
    "$ROOT_DIR/docs/06-discovery-engine.md"
    "$ROOT_DIR/docs/07-discovery-analytics.md"
    "$ROOT_DIR/docs/08-learning-engine.md"
    "$ROOT_DIR/docs/09-seller-intelligence.md"
    "$ROOT_DIR/docs/10-ai-platform.md"
    "$ROOT_DIR/docs/11-data-architecture.md"
    "$ROOT_DIR/docs/12-security-privacy-and-trust.md"
    "$ROOT_DIR/docs/13-business-model.md"
    "$ROOT_DIR/docs/14-success-metrics.md"
    "$ROOT_DIR/docs/15-product-roadmap.md"
    "$ROOT_DIR/docs/16-competitive-positioning.md"
    "$ROOT_DIR/docs/17-long-term-vision.md"
    "$ROOT_DIR/docs/18-glossary.md"
    "$ROOT_DIR/docs/19-open-decisions.md"
)

echo "Building PDF document..."
echo "Input files: ${#DOCS[@]}"

# Build pandoc command
PANDOC_CMD=(
    pandoc "${DOCS[@]}"
    --from markdown
    --to pdf
    --output "$OUTPUT_FILE"
    --table-of-contents
    --toc-depth=2
    --metadata title="PinkCurve Blueprint"
    --metadata subtitle="v0.1 Draft"
    --metadata date="$(date +%Y-%m-%d)"
    -V geometry:margin=1in
    -V fontsize=11pt
)

# Add PDF engine if detected
if [ -n "$PDF_ENGINE" ]; then
    PANDOC_CMD+=(--pdf-engine="$PDF_ENGINE")
fi

# Run pandoc
"${PANDOC_CMD[@]}"

echo "Generated: $OUTPUT_FILE"
echo "Done!"
