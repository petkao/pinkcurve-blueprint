# Design Principles

## Document Status

| Field | Value |
|-------|-------|
| **Status** | Draft |
| **Version** | 0.3 |
| **Owner** | PinkCurve Product Team |
| **Last Reviewed** | 2026-08-16 |
| **Related Components** | All platform components |

---

## Overview

These principles translate PinkCurve's philosophy into practical
guidance for product, engineering, AI, data, trust, business, and
experience design.

When facing tradeoffs, these principles help determine how PinkCurve
should be designed and built.

The enduring philosophy is defined in
[PinkCurve Philosophy](21-pinkcurve-philosophy.md).

---

## Living Discovery

Every visit to PinkCurve should have the potential to reveal something
new, relevant, useful, or trustworthy.

PinkCurve should not require Buyers to search for everything themselves.

Discovery may include new Offerings, relevant Offerings, nearby
Offerings, trends, promotions, Brand Discovery, events, community
bulletins, and other useful opportunities.

Freshness alone is not enough.

**Discovery should be fresh because it remains useful, not merely
because the content changes.**

---

# Core Principles

## 1. Discovery First

**PinkCurve exists to facilitate discovery, not transactions.**

We focus on the moment a Buyer discovers an Offering worth exploring.

The transaction, when applicable, occurs at the Seller's destination.
PinkCurve optimizes for meaningful and qualified discovery rather than
owning the transaction.

### Implications

- Success metrics focus on discovery quality rather than GMV.
- Buyer Experience prioritizes relevance over engagement tricks.
- Seller value is tied to useful discovery outcomes.
- PinkCurve should not become a marketplace merely because transactions
  are easier to measure.
- Click-through should preserve the Seller's relationship with the
  Buyer.

---

## 2. Buyer-Directed Discovery

**The Buyer should remain in control of discovery.**

PinkCurve may learn, recommend, rank, organize, and anticipate, but the
Buyer must be able to influence where discovery goes.

### Implications

Buyers should be able to:

- Express intent.
- Navigate through meaningful choices.
- Change direction.
- Reject irrelevant Offerings.
- Provide positive and negative feedback.
- Explore outside learned preferences.
- Reset appropriate personalization or learned preferences.

AI should assist Buyer decisions rather than silently replace them.

---

## 3. Visual First

**Buyers should be able to discover through graphics, video, and visual
stories rather than text-heavy listings.**

PinkCurve is designed primarily for mobile and small-screen
experiences.

Buyers should be able to quickly see, understand, and navigate
Offerings without reading lengthy descriptions or searching through
traditional catalogs.

### Implications

- Graphics, images, short videos, and visual stories are primary
  discovery surfaces.
- Text supports visual content rather than dominating it.
- Buyer interactions favor simple actions such as see, swipe, tap,
  navigate, and explore.
- Visual content remains the primary focus of the screen.
- Important trust or decision information must still remain accessible.

---

## 4. Metadata Should Illuminate Choices

**Metadata should help Buyers navigate rather than simply provide more
information.**

PinkCurve may maintain extensive metadata about Offerings, Sellers,
location, relevance, trust, availability, categories, and other
discovery signals.

The Buyer should benefit from that structure without needing to
understand PinkCurve's underlying data model.

### Implications

- Metadata should reveal meaningful directions for discovery.
- Navigation choices should reflect the current discovery context.
- Only high-value metadata should be immediately visible.
- Additional information should be progressively disclosed.
- Metadata should not substantially obstruct graphics or video.
- Metadata such as Nearby, Deals, New, category, characteristics, and
  trust signals may become discovery/navigation dimensions.
- Rich metadata remains available to discovery, analytics, learning,
  and intelligence systems behind the experience.

Adaptive Metadata Navigation is the primary architecture for applying
this principle and is defined in
[Adaptive Metadata Navigation](23-adaptive-metadata-navigation.md).

---

## 5. Progressive Disclosure

**Show Buyers what is useful now and reveal additional complexity when
it becomes useful.**

PinkCurve may possess far more information than should appear on a
single screen.

### Implications

- Do not display every available metadata dimension simultaneously.
- Reveal navigation choices according to discovery context.
- Keep secondary information available without making it dominant.
- Avoid forcing Buyers through unnecessary configuration before they
  can begin discovery.
- Advanced capabilities should not make basic discovery difficult.

---

## 6. Sophisticated Underneath, Simple on the Surface

**PinkCurve's AI, ranking, trust, learning, and data systems should
remain behind an understandable experience.**

Buyers and Sellers should not need to understand PinkCurve's underlying
technology to benefit from it.

### Implications

- Technical complexity should not become user complexity.
- AI should improve the experience without requiring users to understand
  AI.
- Ranking, personalization, trust, and learning systems should normally
  operate behind simple interfaces.
- New capabilities should not automatically add new steps.
- Simplicity remains a product requirement as PinkCurve becomes more
  sophisticated.

---

## 7. Knowledge as Foundation

**Rich Offering Knowledge enables better discovery, creative,
intelligence, and trust.**

PinkCurve should invest in capturing, validating, enriching, and
maintaining useful Offering Knowledge.

### Implications

- Offering Knowledge is a first-class domain capability.
- Sellers should be helped to describe what makes their Offerings
  valuable.
- Knowledge gaps should be visible and addressable.
- Metadata should be structured enough to support discovery and AMN.
- Knowledge provenance and confidence should be available where
  important.
- More knowledge is useful only when its quality is sufficient.

---

## 8. Relevance Over Seller Spending

**Seller spending must not override Buyer relevance.**

Sellers may pay PinkCurve for legitimate services, campaign scope,
Brand Discovery, creative capabilities, analytics, or other defined
value.

Payment should not purchase the right to make irrelevant Offerings
important to Buyers.

### Implications

- Ranking should not become simple pay-to-win placement.
- Brand Discovery must still respect relevance and trust.
- Campaign eligibility and discovery relevance are separate concepts.
- Seller budgets may affect legitimate service scope without overriding
  Buyer intent.
- Monetization decisions must be tested against discovery quality.

---

## 9. Learning Is Continuous — and Signal Quality Matters

**Relevant interactions can generate privacy-conscious signals that
improve PinkCurve.**

The platform should become more useful as it learns.

But PinkCurve should not learn indiscriminately from every event.

### Implications

- Relevant Buyer and Seller interactions generate structured events.
- Explicit and implicit signals should remain distinguishable.
- Valid and invalid traffic should remain distinguishable.
- Bots, fraud, manipulation, and suspicious traffic should not silently
  train discovery systems.
- Learning should improve measurable outcomes.
- Learning should support Buyer Intelligence and Seller Intelligence.
- Learning should respect privacy, consent, and retention requirements.

---

## 10. Trust Is Designed In

**Trust is part of the product architecture, not a feature added after
the platform is built.**

PinkCurve must protect both Buyers and Sellers.

### Implications

Design should account for:

- Seller verification.
- Buyer verification where appropriate.
- Offering verification and approval.
- Fraud and scam detection.
- Bot and invalid-traffic detection.
- Review/rating manipulation.
- Abuse prevention.
- Reporting.
- Reverification.
- Appeals.
- Human review.
- Continuous monitoring.

Trust signals should influence discovery where appropriate.

Seller spending must never override verification or trust requirements.

---

## 11. Transparency Without Unnecessary Exposure

**PinkCurve should provide enough explanation for Buyers and Sellers to
understand important outcomes without exposing systems in ways that
enable manipulation or compromise intellectual property.**

Transparency does not require publishing ranking algorithms or
proprietary implementation details.

### Implications

- Buyers should receive understandable explanations where useful.
- Sellers should understand major factors affecting performance.
- Verification and enforcement outcomes should be appropriately
  explainable.
- Paid participation should be identifiable where appropriate.
- PinkCurve should not use deceptive ranking or dark patterns.
- Detailed algorithms, fraud controls, and proprietary mechanisms need
  not be disclosed merely in the name of transparency.

---

## 12. Privacy by Design

**Collect only what PinkCurve has a legitimate reason to use, and
protect what is collected.**

Privacy is a design constraint from the beginning.

### Implications

- Apply data minimization.
- Distinguish session data from persistent Buyer Intelligence.
- Use meaningful consent where required.
- Provide appropriate personalization controls.
- Define retention rather than storing information indefinitely by
  default.
- Do not sell Buyer personal data to third parties.
- Separate data required for security from data used for
  personalization where appropriate.

---

## 13. AI Assists; Humans Remain Accountable

**Automation should provide speed and scale without eliminating
appropriate human judgment.**

### Implications

Human escalation should be available for consequential or ambiguous
situations such as:

- Verification.
- Fraud investigation.
- Appeals.
- Customer Support.
- Billing disputes.
- Content review.
- Security incidents.
- AI/model evaluation.

AI should not become a barrier between PinkCurve and the people it
serves.

---

## 14. Buyer Value and Seller Value Reinforce Each Other

**PinkCurve succeeds when better Buyer discovery produces sustainable
Seller value.**

Seller success alone is insufficient if Buyer Experience deteriorates.

Buyer engagement alone is insufficient if Sellers receive no measurable
value.

### Implications

- Optimize for mutual value.
- Seller Intelligence should help Sellers improve rather than merely
  encourage spending.
- Buyer Experience should not be sacrificed for short-term revenue.
- Seller outcomes should be measured using trustworthy signals.
- More quality Sellers and Offerings should improve Buyer discovery.
- Better Buyer discovery should improve Seller outcomes.

---

## 15. Simplicity Over Cleverness

**Simple systems that work beat clever systems that do not.**

Complexity should be justified by measurable value.

### Implications

- Start simple.
- Add complexity when evidence justifies it.
- Code and architecture should remain understandable.
- Avoid premature optimization.
- Avoid unnecessary infrastructure.
- Prefer solutions that a small team can operate reliably when they
  satisfy requirements.

---

# Technical Principles

## 16. Data as an Asset — With Responsibility

**Structured, well-modeled, trustworthy data is a platform asset.**

PinkCurve should invest in data modeling, quality, lineage, governance,
and lifecycle management.

### Implications

- Important data should have identifiable ownership and purpose.
- Raw and validated events should remain distinguishable.
- Data lineage should support Seller and Buyer Intelligence.
- Retention should be intentional.
- Poor-quality data should not silently propagate through learning and
  analytics.

---

## 17. API-First, Not API-Only

**Platform capabilities should expose clear interfaces where separation
creates useful architectural boundaries.**

API-first design supports flexibility, testability, integration, and
future evolution.

It does not require turning every capability into an independent
service.

### Implications

- Define clear contracts between major capabilities.
- Avoid unnecessary microservices.
- Preserve the ability to replace or scale components when needed.
- Prefer architectural boundaries based on responsibilities rather than
  technology fashion.

---

## 18. Observability Built In

**PinkCurve should be able to understand what its systems are doing.**

Logging, metrics, tracing, audit events, model monitoring, and
operational signals should be designed alongside the systems they
observe.

### Implications

PinkCurve should be able to investigate:

- Failures.
- Performance degradation.
- Discovery anomalies.
- Fraud.
- Invalid traffic.
- AI/model degradation.
- Verification decisions.
- Operational incidents.

Observability should respect privacy and security boundaries.

---

## 19. Fail Gracefully

**Failures should minimize harm and preserve useful functionality where
possible.**

### Implications

- Critical workflows should define failure behavior.
- Partial functionality may be preferable to complete failure.
- AI failure should not automatically become platform failure.
- Human fallback should exist where appropriate.
- Users should receive understandable status information.
- Recovery should be observable and testable.

---

## 20. Security as a Constraint

**Security is a design constraint, not a capability added later.**

### Implications

- Authentication and authorization should be designed from the start.
- Inputs and external content should be treated appropriately as
  untrusted.
- Secure defaults should be preferred.
- Sensitive operations should be auditable.
- Abuse and fraud should be considered during feature design.
- Security requirements apply to AI systems as well as conventional
  software.

---

# Decision Framework

When principles conflict, use the following priority order as a guide:

1. **Safety, Trust and Privacy**
   Protect Buyers, Sellers, and the integrity of PinkCurve.

2. **Buyer Control and Discovery Quality**
   Preserve meaningful, relevant, understandable discovery.

3. **Mutual Buyer/Seller Value**
   Prefer decisions that create sustainable value for both sides.

4. **Simplicity**
   Avoid unnecessary product and technical complexity.

5. **Learning**
   Improve through trustworthy evidence.

6. **Revenue**
   Revenue enables PinkCurve to survive and grow, but should not
   override the principles above.

This ordering is guidance rather than a substitute for judgment.
Material conflicts should be documented explicitly.

---

# Anti-Patterns

PinkCurve should explicitly avoid:

- **Dark patterns** — Manipulative experiences that trick users.
- **Information overload** — Metadata, controls, text, or Offerings
  obscuring the discovery experience.
- **Pay-to-win discovery** — Seller spending overriding relevance.
- **Hidden manipulation** — Steering Buyers without appropriate
  transparency or control.
- **AI overreach** — Automation making consequential decisions without
  appropriate safeguards or escalation.
- **Blind personalization** — Assuming historical behavior permanently
  defines Buyer intent.
- **Invalid-signal learning** — Allowing bots, fraud, or manipulation to
  silently influence learning and intelligence.
- **Data hoarding** — Collecting or retaining data without sufficient
  purpose.
- **Feature creep** — Adding features without clear value.
- **Premature optimization** — Optimizing before understanding the
  problem.
- **Technology-first architecture** — Choosing technology before
  defining the capability.
- **Not-invented-here** — Rebuilding mature capabilities without a good
  reason.
- **Hero culture** — Depending on individuals instead of repeatable
  systems and accountable processes.

---

# Design Review Questions

Before approving a significant PinkCurve capability, ask:

1. What discovery problem does this solve?
2. Does the Buyer remain in control?
3. Does it simplify or complicate the experience?
4. What Offering Knowledge or metadata does it require?
5. Could Seller spending improperly influence the outcome?
6. What could be manipulated, abused, or automated by bots?
7. What data does it collect and why?
8. What does PinkCurve learn from it?
9. How will invalid signals be excluded?
10. What happens when AI is wrong?
11. Is human escalation required?
12. How will we measure whether it creates value?
13. What happens when the capability fails?
14. Can a simpler design accomplish the same objective?

---

## Related Documents

- [Vision and Mission](01-vision-and-mission.md)
- [Product Architecture](03-product-architecture.md)
- [Security, Privacy, and Trust](12-security-privacy-and-trust.md)
- [Buyer Experience](20-buyer-experience.md)
- [PinkCurve Philosophy](21-pinkcurve-philosophy.md)
- [Adaptive Metadata Navigation](23-adaptive-metadata-navigation.md)