# Success Metrics

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

This document defines how we measure success at PinkCurve. Metrics should drive good decisions, not just good numbers. We prioritize metrics that reflect genuine value creation.

---

## Metric Principles

### 1. Measure What Matters
Focus on outcomes, not just outputs. QPV matters more than impressions.

### 2. Avoid Goodhart's Law
"When a measure becomes a target, it ceases to be a good measure."
Use multiple metrics; don't over-optimize any single one.

### 3. Leading and Lagging
Track leading indicators (predictive) and lagging indicators (outcomes).

### 4. Honest Assessment
Report metrics honestly, including when they're bad. Learning requires truth.

---

## Metric Categories

### North Star Metric

**Qualified Product Visits (QPV)**

The primary unit of value we deliver.

| Dimension | Metric |
|-----------|--------|
| Volume | Total QPV / period |
| Growth | QPV growth rate |
| Quality | QPV-to-conversion estimate |

Why QPV:
- Represents genuine buyer interest
- Aligns seller value with platform success
- Measurable without transaction data

### Discovery Metrics

| Metric | Definition | Target |
|--------|------------|--------|
| Discovery Score | Composite discovery effectiveness | Track trend |
| Impression-to-View Rate | % impressions that become views | >5% |
| View-to-Click Rate | % views that become clicks | >10% |
| Click-to-QPV Rate | % clicks that qualify | >80% |

*Note: Discovery Score is experimental; targets are hypotheses.*

### Seller Metrics

| Metric | Definition | Target |
|--------|------------|--------|
| Active Sellers | Sellers with active products | Growth |
| Seller Retention | 30/60/90 day retention | >80% |
| Product Coverage | Products with complete knowledge | >70% |
| ARPS | Average revenue per seller | Track trend |

### Buyer Metrics

| Metric | Definition | Target |
|--------|------------|--------|
| Monthly Active Buyers | Unique buyers engaging | Growth |
| Session Depth | Products viewed per session | >3 |
| Return Rate | Buyers returning within 30 days | >30% |
| NPS | Buyer satisfaction | >40 |

### Platform Health Metrics

| Metric | Definition | Target |
|--------|------------|--------|
| Uptime | System availability | >99.9% |
| API Latency | p95 response time | <200ms |
| Error Rate | Failed requests | <0.1% |
| Data Quality | Schema validation pass rate | >99% |

---

## Metric Hierarchy

```mermaid
flowchart TB
    subgraph North["North Star"]
        QPV[Qualified Product Visits]
    end

    subgraph Primary["Primary Metrics"]
        Discovery[Discovery Score]
        Sellers[Active Sellers]
        Buyers[Active Buyers]
        Revenue[Revenue]
    end

    subgraph Secondary["Secondary Metrics"]
        Funnel[Funnel Metrics]
        Engagement[Engagement]
        Retention[Retention]
        Health[Platform Health]
    end

    QPV --> Discovery
    QPV --> Sellers
    QPV --> Buyers
    QPV --> Revenue

    Discovery --> Funnel
    Sellers --> Retention
    Buyers --> Engagement
    Revenue --> Health
```

---

## Measurement Framework

### Instrumentation

| Layer | What We Track |
|-------|--------------|
| Frontend | Page views, clicks, engagement |
| Backend | API calls, processing times |
| Database | Query patterns, data quality |
| Infrastructure | Availability, performance |

### Data Pipeline

```
Events → Collection → Processing → Storage → Analysis → Dashboards
```

### Reporting Cadence

| Report | Frequency | Audience |
|--------|-----------|----------|
| Real-time dashboard | Continuous | Engineering |
| Daily metrics | Daily | Team |
| Weekly review | Weekly | Leadership |
| Monthly report | Monthly | Stakeholders |

---

## Anti-Metrics

Things we explicitly do NOT optimize for:

| Anti-Metric | Why We Avoid |
|-------------|--------------|
| Total impressions | Encourages spam, not quality |
| Time on site (alone) | Can indicate confusion, not value |
| Vanity followers | Doesn't translate to value |
| Feature count | More isn't better |

---

## Experimentation

### A/B Testing

For significant changes:
- Define hypothesis and metrics
- Determine sample size for significance
- Run for sufficient duration
- Analyze results honestly

### Guardrail Metrics

Metrics that should not degrade during experiments:
- Platform reliability
- Seller retention
- Buyer trust indicators
- Data quality

---

## Dashboards

### Executive Dashboard (Planned)
- North star trend
- Primary metrics summary
- Key alerts

### Product Dashboard (Planned)
- Discovery funnel
- Feature adoption
- Quality metrics

### Engineering Dashboard (Planned)
- System health
- Performance metrics
- Error rates

---

## Current Status

### Implemented
- Basic page view tracking
- Server-side logging

### Planned
- Full event tracking
- Dashboard infrastructure
- A/B testing framework
- Automated reporting

---

## Related Documents

- [Business Model](13-business-model.md)
- [Discovery Analytics](07-discovery-analytics.md)
- [Seller Intelligence](09-seller-intelligence.md)
