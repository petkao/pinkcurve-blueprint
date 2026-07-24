# Contributing to PinkCurve Blueprint

Thank you for your interest in contributing to the PinkCurve Blueprint.

## Document Status

| Field | Value |
|-------|-------|
| **Status** | Draft |
| **Version** | 0.1 |
| **Owner** | PinkCurve Product Team |
| **Last Reviewed** | 2026-07-23 |
| **Related Components** | All documentation |

---

## Contribution Guidelines

### Who Can Contribute

This blueprint is maintained by the PinkCurve core team. Contributions are welcome from:

- Engineering team members
- Product team members
- Design team members
- Strategic advisors and partners (with coordination)

### Types of Contributions

1. **Content Updates:** Corrections, clarifications, and additions to existing chapters
2. **New Chapters:** Proposals for new documentation sections
3. **Diagram Updates:** Improvements to architecture diagrams
4. **Schema Changes:** Updates to JSON Schema definitions
5. **ADRs:** New Architecture Decision Records

### Contribution Process

1. **Create a Branch:** Branch from `main` with a descriptive name
   - `docs/update-discovery-engine`
   - `adr/add-embedding-strategy`
   - `schema/update-product-knowledge`

2. **Make Changes:** Follow the style guidelines below

3. **Update Changelog:** Add an entry to CHANGELOG.md

4. **Submit for Review:** Open a pull request with:
   - Clear description of changes
   - Rationale for the changes
   - Any open questions or decisions needed

5. **Review and Merge:** Changes require review before merging

---

## Style Guidelines

### Markdown Formatting

- Use ATX-style headers (`#`, `##`, `###`)
- Use fenced code blocks with language identifiers
- Use tables for structured information
- Use Mermaid for diagrams (not images)

### Document Structure

Every chapter document should include:

1. **Title:** Clear, descriptive title
2. **Document Status Block:** Status, Version, Owner, Last Reviewed, Related Components
3. **Overview:** Brief summary of the chapter
4. **Content Sections:** Main content with clear headings
5. **Related Documents:** Links to related chapters

### Terminology

- Use consistent terminology as defined in the [Glossary](docs/18-glossary.md)
- When introducing new terms, add them to the Glossary
- Use title case for product names and features (e.g., "Discovery Engine")

### Clarity Guidelines

- **Current vs. Planned:** Clearly distinguish between what exists today and what is planned
- **Hypotheses:** Mark unvalidated assumptions as hypotheses
- **Open Decisions:** Document unresolved questions in [Open Decisions](docs/19-open-decisions.md)
- **Avoid Superlatives:** Do not claim "world's first" or similar unless clearly marked as aspiration

### Diagram Guidelines

- Use Mermaid for all diagrams
- Include diagram source in markdown files
- Keep diagrams focused and readable
- Use consistent styling across diagrams

---

## Review Checklist

Before submitting changes, verify:

- [ ] Document status block is updated
- [ ] CHANGELOG.md is updated
- [ ] Terminology matches the Glossary
- [ ] Current vs. planned capabilities are clearly distinguished
- [ ] No fabricated implementation details
- [ ] Links to related documents are correct
- [ ] Mermaid diagrams render correctly

---

## Questions

For questions about contributing, contact the PinkCurve Product Team.
