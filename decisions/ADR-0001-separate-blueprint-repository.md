# ADR-0001: Separate Blueprint Repository

## Status

**Accepted**

## Date

2026-07-23

## Context

PinkCurve is developing an AI-powered product discovery platform. The engineering team maintains the `ad-engine` repository containing the production codebase (backend API and frontend application).

As the platform matures, we need comprehensive documentation covering:
- Product vision and strategy
- Architecture decisions
- Data models and schemas
- Business model and success metrics
- Roadmap and competitive positioning

The question is: **Should this documentation live within the `ad-engine` repository or in a separate repository?**

## Decision

We will create a **separate repository** called `pinkcurve-blueprint` for product and architecture documentation.

## Rationale

### Arguments for Separation

1. **Different audiences**
   - `ad-engine`: Engineers working on implementation
   - `pinkcurve-blueprint`: Engineers, product leaders, partners, investors
   - Separation allows appropriate access control and presentation

2. **Different cadences**
   - Code changes daily or weekly
   - Architecture documents change monthly or quarterly
   - Separate version histories reduce noise

3. **Different tooling**
   - Code requires linting, testing, CI/CD
   - Documentation requires markdown rendering, PDF export, diagram support
   - Separate toolchains avoid complexity

4. **Cleaner boundaries**
   - Blueprint describes "what" and "why"
   - Code repository handles "how"
   - Clear separation of concerns

5. **Independent sharing**
   - Can share blueprint with partners without code access
   - Can share with non-technical stakeholders
   - Export to Word/PDF for external distribution

6. **Prevents documentation rot**
   - Documentation alongside code often becomes outdated
   - Separate repository encourages explicit documentation updates
   - Clear ownership and review process

### Arguments Against (Considered and Rejected)

1. **Single source of truth**
   - Concern: Documentation might drift from implementation
   - Mitigation: Reference specific versions; periodic reconciliation

2. **Developer convenience**
   - Concern: Developers must check two repositories
   - Mitigation: Implementation details remain in code; blueprint is reference

3. **Additional maintenance**
   - Concern: Another repository to manage
   - Mitigation: Lighter maintenance burden than code; quarterly updates

## Consequences

### Positive

- Clean separation between strategic documentation and implementation
- Appropriate access control for different stakeholders
- Focused review processes for each repository
- Professional presentation for external audiences

### Negative

- Risk of documentation-code drift (requires discipline)
- Additional repository to maintain
- Developers must reference two sources

### Mitigations

- Quarterly blueprint review aligned with roadmap planning
- Cross-reference implementation PRs with blueprint sections
- Blueprint includes explicit "Current Status" sections

## Alternatives Considered

### 1. Documentation in `ad-engine/docs/`

Rejected because:
- Mixes strategic documentation with technical documentation
- Harder to share externally
- Code-centric review process inappropriate for strategy documents

### 2. Wiki (Notion, Confluence, etc.)

Rejected because:
- Harder to version control
- Less portable
- Vendor lock-in
- Harder to export cleanly

### 3. Documentation site (GitBook, ReadTheDocs)

Considered for future:
- May add documentation site that reads from this repository
- Markdown source of truth enables this later
- Not needed for initial version

## Related

- [README](../README.md) - Repository overview
- [Contributing](../CONTRIBUTING.md) - Contribution guidelines
