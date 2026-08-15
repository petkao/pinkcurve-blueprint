# Business Model

## Document Status

| Field | Value |
|-------|-------|
| **Status** | Draft |
| **Version** | 0.2 |
| **Owner** | PinkCurve Product Team |
| **Last Reviewed** | 2026-08-11 |
| **Related Components** | All platform components |

---

## Overview

PinkCurve's business model aligns platform success with Seller success and Buyer value.

PinkCurve generates revenue by helping Sellers reach qualified Buyers through meaningful discovery rather than selling advertising impressions or processing transactions.

The platform succeeds when Buyers discover worthwhile Offerings and Sellers receive qualified discovery that leads to real business outcomes.

This alignment ensures that PinkCurve's incentives remain consistent with its mission:

> **Help people discover what matters.**
---

## Value Proposition

### For Sellers

| Value | Description |
|-------|-------------|
| Qualified discovery | Reach buyers who are likely to value your Offerings |
| Lower CAC | Cost-effective customer acquisition |
| Offering intelligence | Insights to improve Offering positioning and discovery |
| Creative tools | AI-powered content at lower cost |

### For Buyers

| Value | Description |
|-------|-------------|
| Relevant discovery | Discover Offerings that matter to you |
| Trusted platform | Verified Sellers and trustworthy Offerings |
| No spam | Quality over quantity |
| Privacy respected | Personalization with consent |

### For PinkCurve

| Value | Description |
|-------|-------------|
| Network effects | More sellers → better matching → more buyers |
| Data asset | Discovery signals improve platform |
| Sustainable revenue | Value-aligned pricing |

---

## Revenue Model

### Primary Revenue: Qualified Offering Visits (QOV)

Sellers pay only when PinkCurve delivers meaningful discovery that results in a qualified visit to the Seller's destination.

```
QOV Fee = Qualified Visits × Per-Visit Rate
```

**What qualifies a visit:**
- Buyer clicks through to seller's site
- Not flagged as bot traffic
- Meets minimum engagement criteria

**Pricing structure (hypothetical):**
| Tier | Per-QOV Rate | Volume |
|------|-------------|--------|
| Starter | $0.50 | First 100/month |
| Growth | $0.35 | 101-1,000/month |
| Scale | $0.25 | 1,000+/month |

*Note: Pricing is illustrative. Actual pricing to be determined based on market validation.*

### Secondary Revenue: Subscriptions

Monthly/annual subscriptions for platform access:

| Plan | Features | Price Range |
|------|----------|-------------|
| **Free** | Basic listing, limited creative | $0 |
| **Pro** | Full creative suite, basic analytics | TBD |
| **Business** | Advanced analytics, priority support | TBD |
| **Enterprise** | Custom integrations, dedicated support | Custom |

### Tertiary Revenue: Premium Services (Future)

- Enhanced creative packages
- Priority placement in relevant contexts
- Advanced analytics and insights
- API access for integrations

---

## Pricing Principles

### 1. Value Alignment

Revenue should correlate with value delivered:
- Sellers pay for qualified engagement, not impressions
- Better discovery → more value → more revenue

### 2. Accessibility

Lower barriers to entry:
- Free tier for getting started
- Transparent pricing
- No hidden fees

### 3. Fairness

Consistent treatment:
- Same QOV rates within tiers
- No arbitrary advantages for big spenders
- Clear policies

### 4. Sustainability

Revenue must support the business:
- Cover infrastructure costs
- Fund continued development
- Enable team growth

---

## Unit Economics

### Key Metrics

| Metric | Definition |
|--------|------------|
| **CAC** | Cost to acquire a seller |
| **LTV** | Lifetime value of a seller |
| **QOV Rate** | Qualified visits per offering |
| **ARPS** | Average revenue per seller |
| **Gross Margin** | Revenue - Direct costs |

### Target Ratios

| Ratio | Target | Rationale |
|-------|--------|-----------|
| LTV:CAC | >3:1 | Sustainable acquisition |
| Gross Margin | >70% | SaaS benchmark |
| Payback | <12 months | Reasonable recovery |

*Note: Targets are aspirational; actual ratios will depend on validated pricing and costs.*

---

## Cost Structure

### Variable Costs

| Cost | Driver | Notes |
|------|--------|-------|
| LLM API | Creative generation | Per-token |
| Cloud compute | Traffic volume | Auto-scaling |
| Bandwidth | Data transfer | CDN optimization |

### Fixed Costs

| Cost | Category | Notes |
|------|----------|-------|
| Infrastructure | Base platform | Minimum footprint |
| Team | Engineering, product | Scales with growth |
| Tools | SaaS subscriptions | Development tools |

---

## Go-to-Market

### Target Segments

**Phase 1: Early Sellers**
- Small businesses with compelling offerings
- Limited marketing budget
- Value quality over volume

**Phase 2: Growth Sellers**
- Established businesses
- Looking for new acquisition channels
- Budget for experimentation

**Phase 3: Enterprise**
- Larger brands
- Large Offering portfolios
- Custom needs

### Acquisition Channels

| Channel | Approach |
|---------|----------|
| Content | SEO, thought leadership |
| Direct | Outbound to target sellers |
| Referral | Seller referral program |
| Partners | E-commerce platform integrations |

---

## Competitive Dynamics

### Differentiation

| Competitor Type | Their Model | Our Differentiation |
|-----------------|-------------|-------------------|
| Public directories | Static listings | Personalized visual discovery |
| Ad networks | Sell impressions | Sell qualified engagement |
| Marketplaces | Take transaction fee | Don't process transactions |
| Agencies | Bill for services | Self-serve platform |

### Defensibility

| Asset | Moat Type |
|-------|-----------|
| Offering Knowledge | Structured knowledge graph |
| Discovery Intelligence | Data network effect |
| Learning Engine | Improving models |
| Seller network | Supply-side network |
| Buyer trust | Brand/quality reputation |

---

## Risks and Mitigations

| Risk | Impact | Mitigation |
|------|--------|------------|
| Poor discovery quality | Continuous Learning Engine |
| Loss of buyer trust | Trust Signals + Verification |
| Low QOV volume | Revenue shortfall | Focus on discovery quality |
| High CAC | Unsustainable growth | Improve activation, retention |
| Platform competition | Market pressure | Differentiation, switching costs |
| Fraud | Trust erosion | Detection, prevention |

---

## Financial Projections

*Financial projections are not included in this document. They require market validation and are maintained separately.*

---

## Open Questions

See [Open Decisions](19-open-decisions.md) for:
- QOV pricing validation approach
- Free tier limits
- Pricing model for public and community organizations
- Payment processing partner

---

## Business Philosophy

PinkCurve succeeds when Buyers discover Offerings that matter and Sellers receive meaningful opportunities to connect with those Buyers.

The platform does not optimize for impressions, clicks, or transactions alone.

It optimizes for meaningful discovery.

This alignment creates sustainable value for Buyers, Sellers, and PinkCurve.

---

## Related Documents

- [Executive Summary](00-executive-summary.md)
- [Success Metrics](14-success-metrics.md)
- [Competitive Positioning](16-competitive-positioning.md)
