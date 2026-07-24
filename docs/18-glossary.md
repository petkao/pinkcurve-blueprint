# Glossary

## Document Status

| Field | Value |
|-------|-------|
| **Status** | Draft |
| **Version** | 0.1 |
| **Owner** | PinkCurve Product Team |
| **Last Reviewed** | 2026-07-23 |
| **Related Components** | All documentation |

---

## Overview

This glossary defines key terms used throughout PinkCurve documentation. Consistent terminology enables clear communication. When introducing new terms, add them here.

---

## Core Platform Concepts

### Product Knowledge

**Definition:** Rich, structured data about a product that goes beyond basic listings. Includes features, benefits, target audiences, unique selling points, brand voice, and competitive positioning.

**Purpose:** Enables intelligent discovery matching and compelling content generation.

**Related:** [Product Knowledge](04-product-knowledge.md)

---

### Creative Studio

**Definition:** PinkCurve's AI-powered content generation system that transforms Product Knowledge into creative assets—briefs, scripts, storyboards, and (planned) video content.

**Purpose:** Lower the barrier to compelling product storytelling.

**Related:** [Creative Studio](05-creative-studio.md)

---

### Discovery Engine

**Definition:** The intelligent matching system that connects buyers with relevant products based on intent, preferences, and context—prioritizing relevance over ad spend.

**Purpose:** Enable proactive, personalized product discovery.

**Related:** [Discovery Engine](06-discovery-engine.md)

---

### Discovery Event

**Definition:** A structured record of a buyer interaction with product discovery. Includes impressions, views, engagements, and click-throughs.

**Purpose:** Capture signals for analytics and learning.

**Related:** [Discovery Analytics](07-discovery-analytics.md)

---

### Buyer Intent

**Definition:** Understanding of why a buyer is engaging with the platform—what problem they're solving, what preferences they have, and what context they're in.

**Purpose:** Enable relevant product matching beyond keyword matching.

**Related:** [Discovery Engine](06-discovery-engine.md)

---

### Qualified Product Visit (QPV)

**Definition:** A click-through to the seller's website that meets quality criteria: not bot traffic, verified session, and (optionally) minimum engagement.

**Purpose:** The primary unit of value PinkCurve delivers to sellers.

**Related:** [Business Model](13-business-model.md)

---

### Discovery Score

**Definition:** An experimental composite metric measuring overall discovery effectiveness. Combines view rate, engagement rate, click-through rate, and QPV rate.

**Status:** Experimental; not yet validated as industry standard.

**Purpose:** Provide a single metric for discovery quality.

**Related:** [Discovery Analytics](07-discovery-analytics.md)

---

### Learning Engine

**Definition:** The system that processes discovery signals to continuously improve platform performance. Transforms interactions into ranking improvements, content optimization, and seller insights.

**Purpose:** Create compounding value through continuous learning.

**Related:** [Learning Engine](08-learning-engine.md)

---

### Seller Intelligence

**Definition:** Actionable insights delivered to sellers based on platform learnings. Includes performance analytics, competitive benchmarks, and optimization recommendations.

**Purpose:** Help sellers improve products and positioning.

**Related:** [Seller Intelligence](09-seller-intelligence.md)

---

### Return on Discovery (ROD)

**Definition:** A seller-calculated metric measuring the value delivered by PinkCurve relative to cost.

**Formula:** ROD = (QPV × Estimated Conversion × AOV) / Platform Cost

**Purpose:** Help sellers understand platform value.

**Related:** [Seller Intelligence](09-seller-intelligence.md)

---

## Technical Concepts

### Embedding

**Definition:** A dense vector representation of text or content that captures semantic meaning. Enables similarity search and matching.

**Related:** [AI Platform](10-ai-platform.md)

---

### Vector Search

**Definition:** Finding similar items by comparing embedding vectors. Returns items closest in semantic space.

**Related:** [AI Platform](10-ai-platform.md), [Discovery Engine](06-discovery-engine.md)

---

### Completeness Score

**Definition:** A 0-100 score indicating how much Product Knowledge has been captured for a product. Higher scores enable better discovery.

**Related:** [Product Knowledge](04-product-knowledge.md)

---

### Campaign

**Definition:** A container entity that groups related creative artifacts (briefs, scripts, storyboards) for a product.

**Related:** [Creative Studio](05-creative-studio.md)

---

## Business Concepts

### QPV Rate

**Definition:** The rate at which impressions convert to qualified product visits. A key efficiency metric.

**Formula:** QPV Rate = QPV / Impressions

---

### Customer Acquisition Cost (CAC)

**Definition:** The cost to acquire a new customer. PinkCurve aims to lower seller CAC through efficient discovery.

---

### Lifetime Value (LTV)

**Definition:** The total revenue expected from a seller over their relationship with PinkCurve.

---

### Active Seller

**Definition:** A seller with at least one active product and activity within the trailing 30 days.

---

### Active Buyer

**Definition:** A buyer who has engaged with product discovery within the trailing 30 days.

---

## Document Status Terms

### Draft

**Definition:** Initial content, not yet reviewed. May change significantly.

---

### In Review

**Definition:** Content is complete and under review by stakeholders.

---

### Approved

**Definition:** Content has been reviewed and approved for the current version.

---

### Deprecated

**Definition:** Content is no longer current but kept for reference.

---

## Acronyms

| Acronym | Full Term |
|---------|-----------|
| AOV | Average Order Value |
| ARPS | Average Revenue Per Seller |
| CAC | Customer Acquisition Cost |
| CTR | Click-Through Rate |
| LLM | Large Language Model |
| LTV | Lifetime Value |
| ML | Machine Learning |
| NPS | Net Promoter Score |
| PII | Personally Identifiable Information |
| QPV | Qualified Product Visit |
| ROD | Return on Discovery |
| ROI | Return on Investment |
| SDK | Software Development Kit |
| SLA | Service Level Agreement |
| USP | Unique Selling Point |

---

## Related Documents

- [All chapters](../README.md#document-index)
