# Open Decisions

## Document Status

| Field | Value |
|-------|-------|
| **Status** | Draft |
| **Version** | 0.1 |
| **Owner** | PinkCurve Product Team |
| **Last Reviewed** | 2026-07-23 |
| **Related Components** | All platform components |

---

## Overview

This document tracks open decisions, unresolved questions, and hypotheses that need validation. Rather than silently making assumptions, we explicitly document uncertainty here.

---

## How to Use This Document

1. **Add new items** when you encounter unresolved questions
2. **Update status** as decisions are made
3. **Link to ADRs** when decisions are documented
4. **Remove resolved items** only after ADR is complete

---

## Decision Status Legend

| Status | Meaning |
|--------|---------|
| **Open** | Question raised, no resolution yet |
| **In Discussion** | Actively being evaluated |
| **Tentative** | Preliminary decision, not final |
| **Decided** | Resolution reached, pending ADR |
| **Resolved** | ADR created, item can be removed |

---

## Technical Decisions

### TD-001: Vector Database Selection

**Status:** Open

**Question:** Which vector database should we use for similarity search?

**Options:**
| Option | Pros | Cons |
|--------|------|------|
| pgvector | Simple, same DB | Performance limits at scale |
| Pinecone | Managed, scales well | Additional service, cost |
| Weaviate | Open source, flexible | Operational complexity |

**Considerations:**
- Current scale vs. anticipated scale
- Operational complexity tolerance
- Cost implications
- Integration complexity

**Decision needed by:** Before Phase 2B (Embedding Infrastructure)

---

### TD-002: Embedding Model Choice

**Status:** Open

**Question:** Should we use Claude API for embeddings or a specialized model?

**Options:**
- Claude API embeddings (if available)
- OpenAI embeddings
- Sentence transformers (self-hosted)
- Cohere embeddings

**Considerations:**
- Cost per embedding
- Quality for product matching
- Latency requirements
- Vendor concentration

---

### TD-003: Event Processing Architecture

**Status:** Open

**Question:** How should we process discovery events at scale?

**Options:**
- Direct database writes (simple, limited scale)
- Cloud Pub/Sub + Cloud Functions
- Managed streaming (Dataflow)
- Kafka-based (more control, more complexity)

**Considerations:**
- Current event volume
- Growth projections
- Latency requirements
- Operational complexity

---

### TD-004: Machine Learning Infrastructure

**Status:** Open

**Question:** Where should we train and serve ML models?

**Options:**
- Vertex AI (managed)
- Self-hosted on Compute Engine
- Third-party ML platform
- Serverless inference

**Considerations:**
- Model types we'll use
- Training frequency
- Serving latency
- Cost at scale

---

## Product Decisions

### PD-001: Completeness Score Weighting

**Status:** Open

**Question:** How should we weight different factors in completeness scoring?

**Current hypothesis:**
- Required fields: 40%
- Rich knowledge (features, benefits): 30%
- Audience definition: 15%
- Brand/competitive context: 15%

**Needs validation:** Correlate completeness factors with discovery performance.

---

### PD-002: Multiple Knowledge Versions

**Status:** Open

**Question:** Should we support multiple active knowledge versions per product?

**Implications:**
- A/B testing different knowledge
- Complexity in discovery matching
- UI/UX for version management

**Leaning:** No for MVP; evaluate later.

---

### PD-003: Free Tier Limits

**Status:** Open

**Question:** What should be included in the free tier?

**Considerations:**
- Enough value to demonstrate platform
- Incentive to upgrade
- Cost to serve free users
- Competitive positioning

**Options being considered:**
- X products, Y creative generations, Z analytics views

---

### PD-004: Discovery Feed Personalization Defaults

**Status:** Open

**Question:** What should be the default personalization level for new buyers?

**Options:**
- No personalization (anonymous)
- Session-only personalization
- Consent prompt on first visit

**Privacy implications:** Default should be privacy-protective.

---

## Business Decisions

### BD-001: QPV Pricing Validation

**Status:** Open

**Question:** What is the right price point for qualified product visits?

**Approach:** Need to validate willingness-to-pay with early sellers.

**Variables:**
- Per-visit rate
- Volume tiers
- Category differences
- Geographic differences

---

### BD-002: Enterprise Pricing Model

**Status:** Open

**Question:** How should enterprise plans be priced?

**Options:**
- Volume-based (more QPV, lower rate)
- Feature-based (premium features)
- Custom (negotiated)
- Combination

---

### BD-003: Payment Processing Partner

**Status:** Open

**Question:** Which payment processor should we use?

**Options:**
- Stripe (familiar, feature-rich)
- Others (based on specific needs)

**Current state:** Stripe is configured but not actively used.

---

## Hypotheses to Validate

### H-001: Discovery Score Validity

**Hypothesis:** Discovery Score is a meaningful metric that predicts seller value.

**Validation approach:** Correlate Discovery Score with seller-reported outcomes (if available) or retention.

**Status:** Not yet testable (Discovery Engine not built).

---

### H-002: AI Creative Performance

**Hypothesis:** AI-generated creative performs comparably to professionally-produced content for discovery purposes.

**Validation approach:** A/B test AI vs. professional creative on engagement metrics.

**Status:** Not yet testable (limited creative live).

---

### H-003: Learning Engine Impact

**Hypothesis:** The Learning Engine can meaningfully improve discovery over time.

**Validation approach:** Measure discovery metrics before/after learning model updates.

**Status:** Not yet testable (Learning Engine not built).

---

### H-004: Offering Knowledge Correlation

**Hypothesis:** Higher completeness scores correlate with better discovery performance.

**Validation approach:** Correlate completeness with QPV rate across products.

**Status:** Not yet testable.

---

## Compliance and Legal

### CL-001: GDPR Implementation Timeline

**Status:** Open

**Question:** When and how should we implement GDPR compliance?

**Considerations:**
- Current EU user base
- Growth plans
- Implementation complexity
- Legal risk

---

### CL-002: Cookie Consent Approach

**Status:** Open

**Question:** What cookie consent mechanism should we use?

**Options:**
- Build custom
- Use CMP (Consent Management Platform)
- Minimal cookies (avoid need)

---

## Process for Resolution

1. **Discuss:** Bring to relevant stakeholders
2. **Evaluate:** Weigh options against criteria
3. **Decide:** Make and document decision
4. **ADR:** Create Architecture Decision Record if significant
5. **Implement:** Execute on decision
6. **Remove from this doc:** After ADR is created

---

## Recently Resolved

*Items that have been decided and have ADRs:*

| ID | Decision | ADR |
|----|----------|-----|
| TD-000 | Separate blueprint repository | [ADR-0001](../decisions/ADR-0001-separate-blueprint-repository.md) |

---

## Related Documents

- [Design Principles](02-design-principles.md) — Principles that guide decisions
- [Architecture Decision Records](../decisions/) — Documented decisions
