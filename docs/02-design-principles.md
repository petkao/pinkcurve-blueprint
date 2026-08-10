# Design Principles

## Document Status

| Field | Value |
|-------|-------|
| **Status** | Draft |
| **Version** | 0.2 |
| **Owner** | PinkCurve Product Team |
| **Last Reviewed** | 2026-08-09 |
| **Related Components** | All platform components |

---

## Overview

These principles guide product, engineering, and design decisions across PinkCurve. When facing tradeoffs, these principles help us choose.

---

## Core Principles

### 1. Discovery First

**The platform exists to facilitate discovery, not transactions.**

We focus on the moment a buyer discovers an offering worth exploring. The transaction, when applicable, happens on the seller's site—we optimize for qualified discovery, not conversion.

**Implications:**
- Success metrics focus on discovery quality, not GMV
- Buyer experience prioritizes relevance over engagement tricks
- Revenue models align with discovery value, not transaction volume

### 2. Visual First

**Buyers discover through graphics, video, and visual stories rather than text-heavy listings.**

PinkCurve is designed primarily for mobile and small-screen experiences. Buyers should be able to quickly see, understand, and navigate offerings without reading lengthy descriptions or searching through traditional product catalogs.

**Implications:**

* Graphics, images, short videos, and visual stories are the primary discovery experience
* Text supports visual content rather than dominating it
* Buyer interactions should favor simple actions such as see, swipe, tap, and explore
* Visual content should remain the primary focus of the screen

### 3. Metadata Without Clutter

**Rich metadata powers discovery and navigation while only essential signals appear on screen.**

PinkCurve may maintain extensive metadata about products, services, sellers, offers, location, relevance, trust, and other discovery signals. Buyers should benefit from this intelligence without being overwhelmed by it.

**Implications:**

* Only high-value metadata is immediately visible to buyers
* Metadata should not substantially obstruct graphics or video
* Additional information is progressively disclosed when requested
* Metadata such as Nearby, Deals, New, categories, and trust signals can also serve as navigation
* Rich metadata remains available to PinkCurve's discovery and learning systems behind the experience

### 4. Sophisticated Underneath, Simple on the Surface

**PinkCurve's AI, ranking, trust, and learning systems remain behind an intuitive buyer experience.**

Buyers should not need to understand PinkCurve's underlying technology to benefit from it. The platform can become increasingly sophisticated while the buyer experience remains simple.

**Implications:**

* Technical complexity should not become buyer complexity
* AI should improve the experience without requiring buyers to understand AI
* Discovery, personalization, ranking, and trust systems should operate primarily behind the scenes
* New capabilities should not add unnecessary steps to the buyer journey
* As PinkCurve grows, simplicity remains a product requirement


### 5. Knowledge as Foundation

**Rich offering knowledge enables everything else.**

Better offering knowledge leads to better matching, better creative, and better insights. We invest in capturing and enriching offering knowledge as a foundational capability.

**Implications:**
- Offering Knowledge is a first-class entity, not just metadata
- We help sellers articulate what makes their products valuable
- Knowledge gaps are visible and addressable

### 6. Learning is Continuous

**Relevant interactions can generate privacy-conscious signals that improve the platform.**

We design systems to capture learning signals and apply them to improve discovery. The platform should get smarter over time.

**Implications:**
- Relevant buyer interactions generate privacy-conscious structured events
- Learning Engine processes signals to improve matching
- Insights flow back to sellers to improve their products

### 7. Trust Through Transparency

**We build trust by being transparent about how discovery works.**

Buyers should understand why they see certain products. Sellers should understand how their products are matched. We don't use dark patterns.

**Implications:**
- Discovery logic is explainable, even if simplified
- Seller dashboards show why products perform as they do
- We don't artificially boost products without disclosure

### 8. Privacy by Design

**We collect only what we need and protect what we collect.**

Privacy isn't an afterthought. We design data collection, storage, and processing with privacy as a constraint from the start.

**Implications:**
- Data minimization in all collection
- Clear consent for personalization
- No selling of buyer data to third parties

### 9. Seller Success = Platform Success

**We succeed when sellers succeed at reaching qualified buyers.**

Our incentives should align with seller outcomes. If sellers aren't getting value, we're not creating sustainable value.

**Implications:**
- Revenue tied to discovery value, not vanity metrics
- Seller intelligence helps sellers improve, not just pay more
- We don't create artificial scarcity to drive ad spend

### 10. Simplicity Over Cleverness

**Simple systems that work beat clever systems that don't.**

We prefer straightforward solutions that are easy to understand, debug, and improve. Complexity should be justified by clear value.

**Implications:**
- Start simple, add complexity only when proven necessary
- Code and architecture should be understandable
- Avoid premature optimization and over-engineering

---

## Technical Principles

### 11. Data as Asset

**Structured, well-modeled data is a platform asset.**

We invest in data modeling, quality, and governance. Good data enables good features; bad data creates compounding problems.

### 12. API-First Design

**Internal systems communicate through well-defined APIs.**

This enables flexibility, testability, and future evolution. Services can be replaced or scaled independently.

### 13. Observability Built In

**Systems should be observable by default.**

Logging, metrics, and tracing are not afterthoughts. We should be able to understand system behavior in production.

### 14. Fail Gracefully

**Systems should degrade gracefully under failure conditions.**

Partial functionality is better than complete failure. Error handling and fallbacks are part of the design.

### 15. Security as Constraint

**Security is a design constraint, not a feature to add later.**

Authentication, authorization, input validation, and secure defaults are part of initial design.

---

## Decision Framework

When principles conflict, use this priority order:

1. **Trust and Privacy** — Never compromise user trust or privacy for other goals
2. **Discovery Quality** — Prioritize genuine discovery over metrics gaming
3. **Simplicity** — Prefer simple solutions unless complexity is clearly justified
4. **Learning** — Design for continuous improvement
5. **Revenue** — Revenue enables sustainability but doesn't override other principles

---

## Anti-Patterns

Things we explicitly avoid:

- **Dark patterns** — Manipulative UI/UX that tricks users
- **Information overload** — Allowing metadata, controls, or text to obscure the visual discovery experience
- **Pay-to-win** — Discovery quality determined solely by ad spend
- **Data hoarding** — Collecting data we don't need
- **Feature creep** — Adding features without clear value
- **Premature optimization** — Optimizing before understanding the problem
- **Not-invented-here** — Rebuilding what we could use or buy
- **Hero culture** — Depending on individuals rather than systems

---

## Related Documents

- [Vision and Mission](01-vision-and-mission.md)
- [Product Architecture](03-product-architecture.md)
- [Security, Privacy, and Trust](12-security-privacy-and-trust.md)
- [Buyer Experience](20-buyer-experience.md)
