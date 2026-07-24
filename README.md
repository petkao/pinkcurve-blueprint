# PinkCurve Blueprint

**Version:** 0.1 Draft
**Status:** Living Architecture Document
**Last Updated:** 2026-07-23

---

## Overview

PinkCurve is an AI-powered product discovery platform that helps sellers connect with qualified buyers through rich product knowledge, AI-generated product storytelling, personalized discovery, continuous learning, and seller intelligence.

**PinkCurve does not process transactions.** Buyers discover products on PinkCurve and click through to the seller's own website to complete their purchase.

This repository serves as the living product vision, product architecture, AI strategy, data architecture, business model, and engineering blueprint for PinkCurve.

---

## What PinkCurve Is

- An AI-powered product discovery platform
- A rich product knowledge system that captures what makes products valuable
- A creative studio for AI-generated product storytelling
- A personalized discovery engine that matches buyers with relevant products
- A learning system that improves over time through buyer interactions
- A seller intelligence platform that provides actionable insights

## What PinkCurve Is Not

PinkCurve is **not** primarily:

- **A transaction marketplace.** We do not process payments or handle fulfillment. Buyers click through to sellers' websites to purchase.
- **A traditional advertising network.** We do not sell impressions or run banner ads. Value comes from qualified discovery, not ad placement.
- **Only a video-generation tool.** Creative Studio is one component; the platform's value is in the complete discovery loop.
- **A replacement for sellers' websites.** We augment seller reach and discovery; sellers maintain their own storefronts and customer relationships.

---

## Platform Flow

```
Seller
  → Product Knowledge
    → Creative Studio
      → Discovery Engine
        → Buyer Interaction
          → Discovery Analytics
            → Learning Engine
              → Seller Intelligence
                → improved Product Knowledge, creative, and discovery
```

This continuous loop creates compounding value: better product knowledge leads to better creative, which leads to better discovery, which generates learning signals that improve everything upstream.

---

## Document Index

### Core Documentation

| Chapter | Title | Description |
|---------|-------|-------------|
| [00](docs/00-executive-summary.md) | Executive Summary | High-level overview for stakeholders |
| [01](docs/01-vision-and-mission.md) | Vision and Mission | Why PinkCurve exists |
| [02](docs/02-design-principles.md) | Design Principles | Guiding principles for decisions |
| [03](docs/03-product-architecture.md) | Product Architecture | System components and interactions |
| [04](docs/04-product-knowledge.md) | Product Knowledge | The foundation: rich product data |
| [05](docs/05-creative-studio.md) | Creative Studio | AI-powered content generation |
| [06](docs/06-discovery-engine.md) | Discovery Engine | Matching buyers with products |
| [07](docs/07-discovery-analytics.md) | Discovery Analytics | Measuring discovery effectiveness |
| [08](docs/08-learning-engine.md) | Learning Engine | Continuous improvement through signals |
| [09](docs/09-seller-intelligence.md) | Seller Intelligence | Actionable insights for sellers |
| [10](docs/10-ai-platform.md) | AI Platform | AI/ML infrastructure and strategy |
| [11](docs/11-data-architecture.md) | Data Architecture | Data models, flows, and storage |
| [12](docs/12-security-privacy-and-trust.md) | Security, Privacy, and Trust | Privacy-by-design, fraud prevention |
| [13](docs/13-business-model.md) | Business Model | How PinkCurve creates and captures value |
| [14](docs/14-success-metrics.md) | Success Metrics | How we measure success |
| [15](docs/15-product-roadmap.md) | Product Roadmap | Planned development phases |
| [16](docs/16-competitive-positioning.md) | Competitive Positioning | Market context and differentiation |
| [17](docs/17-long-term-vision.md) | Long-Term Vision | Where we're heading |
| [18](docs/18-glossary.md) | Glossary | Key terms and definitions |
| [19](docs/19-open-decisions.md) | Open Decisions | Unresolved questions and hypotheses |

### Architecture Diagrams

| Diagram | Description |
|---------|-------------|
| [Platform Architecture](diagrams/platform-architecture.md) | High-level system architecture |
| [Discovery Flywheel](diagrams/discovery-flywheel.md) | The learning loop that creates compounding value |
| [Product Knowledge Flow](diagrams/product-knowledge-flow.md) | How product knowledge is captured and enriched |
| [Creative Studio Flow](diagrams/creative-studio-flow.md) | Content generation pipeline |
| [Discovery Event Flow](diagrams/discovery-event-flow.md) | How discovery events are captured and processed |
| [Learning Engine Flow](diagrams/learning-engine-flow.md) | How the system learns and improves |
| [Seller Intelligence Flow](diagrams/seller-intelligence-flow.md) | How insights reach sellers |

### Data Schemas

| Schema | Description |
|--------|-------------|
| [Product Knowledge](schemas/product-knowledge.schema.json) | Product knowledge entity structure |
| [Discovery Event](schemas/discovery-event.schema.json) | Discovery interaction events |
| [Creative Campaign](schemas/creative-campaign.schema.json) | Creative campaign and artifact structure |
| [Discovery Score](schemas/discovery-score.schema.json) | Discovery effectiveness scoring |

### Architecture Decision Records

| ADR | Title |
|-----|-------|
| [ADR-0001](decisions/ADR-0001-separate-blueprint-repository.md) | Separate Blueprint Repository |

---

## Repository Structure

```
pinkcurve-blueprint/
├── README.md                 # This file
├── CONTRIBUTING.md           # Contribution guidelines
├── CHANGELOG.md              # Version history
├── LICENSE                   # License information
├── .gitignore                # Git ignore rules
├── docs/                     # Main documentation chapters
├── diagrams/                 # Mermaid architecture diagrams
├── schemas/                  # JSON Schema definitions
├── decisions/                # Architecture Decision Records
├── scripts/                  # Build scripts for export
├── export/                   # Generated artifacts (Word, PDF)
└── assets/                   # Images and other static assets
```

---

## Document Status Legend

Each chapter includes a status block:

| Status | Meaning |
|--------|---------|
| **Draft** | Initial content, not yet reviewed |
| **In Review** | Content complete, under review |
| **Approved** | Reviewed and approved for current version |
| **Deprecated** | No longer current, kept for reference |

---

## Building Exports

Generate Word and PDF versions:

```bash
# Generate Word document
./scripts/build-docx.sh

# Generate PDF
./scripts/build-pdf.sh
```

Generated files appear in the `export/` directory.

---

## Contributing

See [CONTRIBUTING.md](CONTRIBUTING.md) for guidelines on contributing to this blueprint.

---

## License

See [LICENSE](LICENSE) for license information.

---

*PinkCurve Blueprint v0.1 Draft — A living architecture document*
