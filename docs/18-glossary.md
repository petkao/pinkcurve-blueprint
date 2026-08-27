# Glossary

## Document Status

| Field | Value |
|-------|-------|
| **Status** | Draft |
| **Version** | 0.3 |
| **Owner** | PinkCurve Product Team |
| **Last Reviewed** | 2026-08-22 |
| **Related Components** | All documentation |

---

## Overview

This glossary defines the key terms used throughout PinkCurve documentation.

Consistent terminology is important because PinkCurve brings together discovery, artificial intelligence, trust, creative capabilities, analytics, learning, and business concepts that can otherwise be interpreted differently by different people.

The glossary serves as the terminology authority for the PinkCurve Blueprint.

When new concepts become important enough to appear across multiple PinkCurve components or documents, they should be defined here.

PinkCurve terminology should remain understandable to Buyers, Sellers, designers, engineers, business stakeholders, and future team members.

The terminology should also remain stable enough that PinkCurve can adopt new technologies without unnecessarily redefining its fundamental product concepts.

---

## Terminology Principles

### Keep Core Concepts Stable

PinkCurve should maintain a small number of stable concepts even as implementation technologies change.

Important core concepts include:

- Buyer
- Seller
- Offering
- Offering Knowledge
- Discovery
- Meaningful Discovery
- Trust
- Learning

Technologies such as Large Language Models, embedding models, vector databases, AI agents, and future interfaces may change.

The fundamental discovery concepts should remain understandable.

### Use Offering Rather Than Product

**Offering** is PinkCurve's fundamental discovery object.

A Product is one type of Offering.

PinkCurve therefore uses **Offering** when describing platform-wide architecture, discovery, analytics, learning, trust, and intelligence.

### Discovery Platform, Not Social Platform

PinkCurve is a **Discovery Platform**.

It should not be described as a Social Platform, Social Media Platform, Social Commerce Platform, or other terminology that incorrectly suggests that social interaction is PinkCurve's primary purpose.

PinkCurve may include features such as ratings, comments, saves, sharing, and feedback when those capabilities improve discovery, learning, or trust.

Those features support discovery.

They do not redefine PinkCurve as a social platform.

### Buyer and Seller Are Platform Roles

PinkCurve uses the terms **Buyer** and **Seller** because they are simple and broadly understandable.

However, these terms describe platform roles.

A Seller does not necessarily sell something.

For example, a nonprofit organization may provide a free service, a community organization may announce an event, or a public organization may publish a useful resource.

Similarly, a Buyer may discover an Offering without purchasing anything.

### Prefer Meaningful Terms Over Technology Terms

PinkCurve should describe what the platform accomplishes rather than defining itself by a particular technology.

For example:

**Meaningful Discovery** is a durable platform concept.

A particular embedding model, LLM, vector database, or ranking algorithm is an implementation choice that may change.

---

## Core Platform Concepts

### Discovery Platform

**Definition:** A platform designed primarily to help Buyers discover relevant, useful, interesting, timely, trustworthy, or otherwise worthwhile Offerings that they may or may not already know to search for.

PinkCurve uses Offering Knowledge, Buyer intent, Buyer interests, context, Adaptive Metadata Navigation, trust, AI, and continuous learning to support discovery.

PinkCurve is a Discovery Platform rather than a social platform, marketplace, advertising network, or transaction platform.

**Purpose:** Provide a trusted destination for Meaningful Discovery.

**Related:** [Vision and Mission](01-vision-and-mission.md), [Competitive Positioning](16-competitive-positioning.md), [Long-Term Vision](17-long-term-vision.md)

---

### Discovery

**Definition:** The process through which a Buyer encounters, explores, evaluates, or navigates toward an Offering that may be worthwhile.

Discovery may begin with an explicit Buyer need or may occur while the Buyer is simply exploring what is available.

Discovery is broader than search.

Search generally begins with something the Buyer already knows how to ask for.

Discovery can also help Buyers find worthwhile things they did not previously know existed.

**Purpose:** Connect Buyers with worthwhile Offerings.

**Related:** [Discovery Engine](06-discovery-engine.md)

---

### Meaningful Discovery

**Definition:** A discovery outcome in which a Buyer encounters an Offering that is genuinely relevant, useful, interesting, timely, trustworthy, or otherwise worthwhile.

Meaningful Discovery emphasizes the **value of discovery rather than the quantity of Offerings shown, clicks generated, or time spent on the platform**.

A Buyer who quickly discovers one worthwhile Offering may have a more successful experience than a Buyer who views many Offerings without finding anything useful.

Similarly, a Seller receiving a smaller number of highly relevant Buyer visits may receive more value than receiving large numbers of low-quality clicks.

**Purpose:** Define the fundamental value PinkCurve seeks to create.

**Related:** [Success Metrics](14-success-metrics.md), [Competitive Positioning](16-competitive-positioning.md), [Long-Term Vision](17-long-term-vision.md)

---

### Offering

**Definition:** The fundamental discovery object within PinkCurve.

An Offering is anything PinkCurve can present to a Buyer for discovery.

Current and planned Offering types include:

- Product
- Commercial Service
- Promotion
- Event
- Community Service
- Public Service
- Free Offering
- Other future discoverable resources

An Offering does not necessarily involve a commercial transaction.

**Purpose:** Provide a common abstraction that allows PinkCurve's discovery architecture to support many types of worthwhile resources without redesigning the platform for each new type.

**Related:** [Offering Knowledge](04-offering-knowledge.md)

---

### Offering Type

**Definition:** A classification describing the general type of an Offering.

Examples include Product, Commercial Service, Promotion, Event, Community Service, and Public Service.

**Purpose:** Allow PinkCurve to support different kinds of discovery while maintaining Offering as the common discovery object.

**Related:** [Offering Knowledge](04-offering-knowledge.md), [Data Architecture](11-data-architecture.md)

---

### Product

**Definition:** A commercial product offered for discovery.

A Product is one type of Offering.

**Purpose:** Represent physical or digital commercial goods while maintaining Offering as the broader platform abstraction.

**Related:** [Offering Knowledge](04-offering-knowledge.md)

---

### Seller

**Definition:** The PinkCurve role for a verified organization or entity that publishes and manages Offerings.

A Seller may include:

- Commercial businesses
- Service providers
- Brands
- Nonprofit organizations
- Community organizations
- Public-service organizations
- Other approved Offering providers

The term **Seller** describes the PinkCurve platform role and does not necessarily imply that an Offering is sold or that a commercial transaction occurs.

**Purpose:** Identify the organization or entity responsible for an Offering.

**Related:** [Seller Intelligence](09-seller-intelligence.md), [Security, Privacy, and Trust](12-security-privacy-and-trust.md)

---

### Buyer

**Definition:** A registered PinkCurve user who discovers, explores, evaluates, saves, responds to, or follows Offerings through the platform.

A Buyer may use PinkCurve with or without an immediate intention to purchase something.

Buyers may discover commercial Offerings, free Offerings, events, community resources, public services, or other worthwhile information.

**Purpose:** Represent the person receiving and navigating the PinkCurve discovery experience.

**Related:** [Discovery Engine](06-discovery-engine.md), [Buyer Experience](20-buyer-experience.md)

---

### Offering Knowledge

**Definition:** Rich, structured knowledge describing an Offering beyond a basic listing.

Offering Knowledge may include:

- Name
- Category
- Description
- Features
- Benefits
- Target audiences
- Unique selling points
- Brand information
- Price
- Images
- Videos
- Specifications
- FAQs
- Reviews
- Keywords
- Location
- Availability
- Timing
- Offering URL
- Other relevant metadata

**Purpose:** Provide the knowledge foundation required for intelligent discovery, Adaptive Metadata Navigation, creative generation, trust evaluation, ranking, analytics, and learning.

**Related:** [Offering Knowledge](04-offering-knowledge.md)

---

### Buyer Discovery Profile

**Definition:** A progressively evolving representation of a Buyer's explicitly provided interests, discovery preferences, relevant context, and permitted discovery interactions used to improve Meaningful Discovery.

The Buyer Discovery Profile may incorporate:

- Buyer-provided interests
- Discovery preferences
- Search activity
- Adaptive Metadata Navigation choices
- Offering views
- Saves
- Click-throughs
- Ratings
- "Not Interested" feedback
- Other permitted discovery signals

The Buyer Discovery Profile should not permanently define the Buyer.

Buyer interests and circumstances change.

Buyers should remain able to influence, correct, reset, or control their discovery experience.

**Purpose:** Improve discovery relevance while maintaining Buyer control.

**Related:** [Discovery Engine](06-discovery-engine.md), [Learning Engine](08-learning-engine.md), [Buyer Experience](20-buyer-experience.md)

---

## Discovery Concepts

### Intentional Discovery

**Definition:** Discovery in which the Buyer begins with a particular need, interest, question, category, or objective.

Examples include:

- Looking for a particular product
- Finding a nearby service
- Searching for an event
- Finding a community resource
- Looking for a promotion

**Purpose:** Help Buyers efficiently navigate toward worthwhile Offerings when they have an identifiable discovery objective.

**Related:** [Discovery Engine](06-discovery-engine.md), [Long-Term Vision](17-long-term-vision.md)

---

### Exploratory Discovery

**Definition:** Discovery in which the Buyer does not necessarily know what they are looking for and instead explores worthwhile possibilities.

The Buyer may simply be asking:

> **"What is worthwhile out there?"**

Exploratory Discovery should remain Buyer-controlled and should not overwhelm the Buyer with unnecessary content.

**Purpose:** Help Buyers discover worthwhile Offerings they may not have known existed.

**Related:** [Discovery Engine](06-discovery-engine.md), [Long-Term Vision](17-long-term-vision.md)

---

### Timely Discovery

**Definition:** Discovery of an Offering whose usefulness, relevance, or importance is influenced by time.

Examples include:

- Sales
- Limited-time promotions
- Seasonal Offerings
- Events
- Newly available services
- Free Offerings
- Registration periods
- Community programs
- Public announcements
- Other time-sensitive opportunities

Timely Discovery is not simply news.

It identifies something worthwhile because it is relevant to know about **now**.

**Purpose:** Help Buyers discover worthwhile opportunities when timing matters.

**Related:** [Discovery Engine](06-discovery-engine.md), [Long-Term Vision](17-long-term-vision.md)

---

### Adaptive Metadata Navigation (AMN)

**Definition:** A Buyer-controlled discovery mechanism that dynamically presents useful metadata-based navigation choices based on the available Offering space, Buyer intent, Buyer interests, context, and previous navigation choices.

Rather than requiring Buyers to understand complex filters or know exactly which search terms to enter, AMN helps Buyers progressively navigate toward relevant Offerings.

The available navigation choices can adapt as the Buyer moves through the discovery journey.

**Purpose:** Help Buyers navigate large numbers of Offerings without overwhelming interfaces, rigid filtering systems, or precise search terminology.

**Related:** [Discovery Engine](06-discovery-engine.md), [Buyer Experience](20-buyer-experience.md)

---

### Buyer Intent

**Definition:** PinkCurve's understanding of what a Buyer may currently be trying to discover, accomplish, investigate, or explore.

Buyer Intent may be informed by:

- Explicit Buyer input
- Search queries
- Adaptive Metadata Navigation
- Current discovery context
- Buyer-provided interests
- Permitted interaction signals

Buyer Intent may change from one discovery session to another.

**Purpose:** Improve discovery relevance beyond simple keyword matching.

**Related:** [Discovery Engine](06-discovery-engine.md)

---

### Discovery Signal

**Definition:** A concise Buyer-facing interpretation of metadata, context, trust information, timing, or discovery intelligence that helps a Buyer quickly understand why an Offering may be relevant or worth exploring.

Examples may include:

- Nearby
- Trending
- Limited-time
- Verified Seller
- New
- Relevant to a selected interest

Discovery Signals should simplify discovery rather than add visual clutter.

**Purpose:** Help Buyers quickly understand why an Offering may matter.

**Related:** [Discovery Engine](06-discovery-engine.md), [Discovery Analytics](07-discovery-analytics.md)

---

### Discovery Event

**Definition:** A structured record of a Buyer interaction within the PinkCurve discovery experience.

Examples include:

- Impression
- View
- Save
- Share
- Metadata navigation selection
- Click-through
- Rating
- Hide
- Not Interested
- Report

**Purpose:** Capture discovery signals for analytics, learning, trust, and platform improvement.

**Related:** [Discovery Analytics](07-discovery-analytics.md), [Learning Engine](08-learning-engine.md)

---

### Discovery Journey

**Definition:** The sequence of interactions through which a Buyer moves from initial exploration or intent toward discovering, evaluating, saving, sharing, or exploring an Offering further.

A Discovery Journey may be short or may involve multiple navigation steps.

**Purpose:** Describe discovery as a process rather than a single click or impression.

**Related:** [Discovery Engine](06-discovery-engine.md), [Buyer Experience](20-buyer-experience.md)

---

### Discovery Destination

**Definition:** A platform or experience that Buyers naturally choose when they want to discover what is worthwhile.

PinkCurve's long-term aspiration is to become a trusted Discovery Destination.

**Purpose:** Describe PinkCurve's long-term role in Buyer behavior.

**Related:** [Long-Term Vision](17-long-term-vision.md)

---

## Creative Concepts

### Creative Studio

**Definition:** PinkCurve's AI-assisted system for transforming Offering Knowledge into compelling creative materials that help Buyers understand and discover Offerings.

Creative outputs may include:

- Creative briefs
- Scripts
- Storyboards
- Visual stories
- Future multimedia content

**Purpose:** Help Sellers communicate the value of their Offerings through visual storytelling.

**Related:** [Creative Studio](05-creative-studio.md)

---

### Creative Campaign

**Definition:** A container that organizes related creative artifacts and activities associated with an Offering or discovery objective.

A Creative Campaign may contain:

- Creative briefs
- Scripts
- Storyboards
- Visual assets
- Video assets
- Variants
- Performance information

**Purpose:** Organize creative work around a specific Offering or discovery objective.

**Related:** [Creative Studio](05-creative-studio.md)

---

### Brand Recognition

**Definition:** A Seller objective focused on increasing appropriate Buyer awareness, familiarity, or recognition of a Seller, brand, organization, or family of Offerings rather than generating an immediate Qualified Offering Visit for a specific Offering.

Brand Recognition may therefore require different success metrics from QOV-based Offering discovery.

**Purpose:** Help Sellers establish awareness among Buyers who may value their Offerings now or in the future.

**Related:** [Business Model](13-business-model.md), [Success Metrics](14-success-metrics.md)

---

## Discovery Intelligence Concepts

### Discovery Engine

**Definition:** PinkCurve's intelligent discovery system that retrieves, matches, ranks, and presents relevant Offerings using Offering Knowledge, Buyer intent, Buyer interests, context, trust, metadata, AI, and learning.

The Discovery Engine prioritizes meaningful relevance rather than simply advertising spend.

**Purpose:** Help Buyers efficiently discover worthwhile Offerings.

**Related:** [Discovery Engine](06-discovery-engine.md)

---

### Discovery Analytics

**Definition:** The measurement and analysis system that transforms discovery events into insights about Buyer behavior, Offering performance, discovery quality, trust, and platform effectiveness.

**Purpose:** Provide evidence for decision-making, Seller Intelligence, Learning Engine improvement, and Success Metrics.

**Related:** [Discovery Analytics](07-discovery-analytics.md)

---

### Learning Engine

**Definition:** The system that processes discovery signals, outcomes, feedback, and other permitted data to continuously improve PinkCurve.

The Learning Engine may improve:

- Discovery ranking
- Offering understanding
- Buyer relevance
- Creative effectiveness
- Trust and fraud detection
- Seller recommendations
- Platform decision-making

**Purpose:** Create compounding platform value through continuous learning.

**Related:** [Learning Engine](08-learning-engine.md)

---

### Seller Intelligence

**Definition:** Actionable insights delivered to Sellers based on discovery analytics and platform learning.

Seller Intelligence may include:

- Performance analytics
- Audience insights
- Benchmarking
- Offering Knowledge recommendations
- Creative recommendations
- Discovery opportunities
- Trust improvements
- Optimization recommendations

**Purpose:** Help Sellers improve how Buyers discover and understand their Offerings.

**Related:** [Seller Intelligence](09-seller-intelligence.md)

---

### Discovery Score

**Definition:** An experimental composite metric intended to measure overall discovery effectiveness.

The score may combine multiple discovery indicators rather than rely on a single engagement metric.

**Status:** Experimental and subject to validation.

**Purpose:** Provide a high-level indicator of discovery quality while avoiding dependence on a single metric.

**Related:** [Discovery Analytics](07-discovery-analytics.md), [Success Metrics](14-success-metrics.md)

---

### Qualified Offering Visit (QOV)

**Definition:** A Buyer click-through from PinkCurve to a Seller destination that meets PinkCurve's defined quality criteria.

A QOV should exclude known bot traffic, artificial engagement, and other invalid activity.

Additional qualification criteria may evolve through testing and validation.

**Purpose:** Represent a primary unit of measurable value PinkCurve delivers to Sellers for Offering-oriented discovery.

**Related:** [Business Model](13-business-model.md), [Success Metrics](14-success-metrics.md)

---

### QOV Rate

**Definition:** A metric describing the rate at which discovery activity results in Qualified Offering Visits.

The exact denominator should be explicitly stated when the metric is reported.

For example:

```text
Impression-to-QOV Rate = QOV / Impressions
```

or:

```text
Click-to-QOV Rate = QOV / Clicks
```

**Purpose:** Measure the efficiency with which PinkCurve converts discovery activity into qualified Seller visits.

---

### Return on Discovery (ROD)

**Definition:** A Seller-oriented metric intended to estimate the business value generated through PinkCurve discovery relative to platform cost.

An illustrative calculation is:

```text
ROD = (QOV × Estimated Conversion × AOV) / Platform Cost
```

Where:

- QOV = Qualified Offering Visits
- Estimated Conversion = Seller-provided or benchmark conversion estimate
- AOV = Average Order Value
- Platform Cost = Relevant PinkCurve cost to the Seller

ROD is an estimate because PinkCurve does not necessarily observe transactions occurring on Seller destinations.

**Purpose:** Help Sellers evaluate the economic value of PinkCurve discovery.

**Related:** [Seller Intelligence](09-seller-intelligence.md)

---

## Trust Concepts

### Trust

**Definition:** The confidence Buyers, Sellers, and organizations can reasonably place in PinkCurve's discovery environment, processes, information, and safeguards.

PinkCurve treats trust as something continuously earned rather than permanently assumed.

**Purpose:** Make Meaningful Discovery safer and more dependable.

**Related:** [Security, Privacy, and Trust](12-security-privacy-and-trust.md)

---

### Trust Signal

**Definition:** A Buyer-facing indicator communicating relevant verification, trust, quality, risk, or contextual information about a Seller or Offering.

Examples may include:

- Verified Seller
- Identity Verified
- Business Verified
- Nearby
- Newly Registered Seller
- Limited Verification
- Other approved trust indicators

Trust Signals should communicate useful information without implying guarantees PinkCurve cannot make.

**Purpose:** Help Buyers make more informed discovery decisions.

**Related:** [Security, Privacy, and Trust](12-security-privacy-and-trust.md)

---

### Seller Verification

**Definition:** The process through which PinkCurve evaluates information about a Seller to establish reasonable confidence in identity, legitimacy, business information, and other applicable trust requirements.

Verification may include:

- Email verification
- Phone verification
- OTP
- Organization verification
- Domain verification
- Business registration
- Website verification
- Other risk-based checks

Verification does not imply permanent approval.

**Purpose:** Reduce fraud and improve Buyer trust.

**Related:** [Security, Privacy, and Trust](12-security-privacy-and-trust.md)

---

### Offering Verification

**Definition:** The process through which PinkCurve evaluates an Offering for authenticity, policy compliance, consistency with Seller information, destination quality, and other applicable trust requirements.

**Purpose:** Reduce fake, misleading, fraudulent, or harmful Offerings.

**Related:** [Security, Privacy, and Trust](12-security-privacy-and-trust.md)

---

### Continuous Monitoring

**Definition:** Ongoing automated and human-assisted evaluation of Sellers, Buyers, Offerings, destinations, platform activity, and risk signals after initial approval.

Initial verification should not be treated as permanent trust.

**Purpose:** Detect changes in risk or legitimacy after initial approval.

**Related:** [Security, Privacy, and Trust](12-security-privacy-and-trust.md)

---

### Human-in-the-Loop (HITL)

**Definition:** A process in which AI or automation assists with analysis, recommendations, detection, or routine work while a human retains responsibility for decisions that require judgment, accountability, or review.

PinkCurve may use Human-in-the-Loop processes for:

- Seller approval
- Offering approval
- Fraud investigation
- Content review
- Customer support
- AI quality assurance
- Development
- Financial operations
- Other high-impact decisions

**Purpose:** Combine the scalability of automation with human judgment and accountability.

---

## AI and Technical Concepts

### AI Platform

**Definition:** PinkCurve's shared artificial-intelligence capabilities, services, models, evaluation systems, and infrastructure supporting Offering understanding, Creative Studio, Discovery Engine, Learning Engine, trust, and Seller Intelligence.

**Purpose:** Provide reusable intelligence across PinkCurve while allowing individual platform components to evolve.

**Related:** [AI Platform](10-ai-platform.md)

---

### Artificial Intelligence (AI)

**Definition:** Computational systems used by PinkCurve to assist with understanding, generation, prediction, ranking, matching, fraud detection, learning, and other intelligent platform capabilities.

AI is an enabling capability.

It is not the product itself.

**Purpose:** Improve Meaningful Discovery and platform operations where AI provides measurable value.

---

### Large Language Model (LLM)

**Definition:** An AI model trained to understand and generate language and, in some cases, other forms of content.

PinkCurve may use LLMs for tasks such as:

- Offering understanding
- Knowledge extraction
- Creative generation
- Intent understanding
- Seller assistance
- Buyer discovery assistance
- Operational support

LLM providers and models may change over time.

---

### Embedding

**Definition:** A numerical vector representation of content that captures aspects of semantic meaning.

Embeddings can represent:

- Offerings
- Queries
- Creative content
- Other discovery information

**Purpose:** Enable semantic similarity, retrieval, clustering, and intelligent matching.

**Related:** [AI Platform](10-ai-platform.md)

---

### Vector Search

**Definition:** A retrieval technique that finds semantically similar items by comparing vector representations such as embeddings.

**Purpose:** Support semantic Offering retrieval and similarity-based discovery.

**Related:** [AI Platform](10-ai-platform.md), [Discovery Engine](06-discovery-engine.md)

---

### Ranking

**Definition:** The process of ordering candidate Offerings according to estimated relevance, quality, trust, context, and other discovery considerations.

PinkCurve ranking should prioritize Meaningful Discovery rather than simply advertising spend.

**Purpose:** Present the most potentially worthwhile Offerings efficiently.

**Related:** [Discovery Engine](06-discovery-engine.md)

---

### Personalization

**Definition:** Adapting the discovery experience based on permitted Buyer information, interests, context, intent, and discovery history.

Personalization should remain transparent enough to understand and subject to appropriate Buyer control.

**Purpose:** Improve discovery relevance without unnecessarily compromising privacy or Buyer autonomy.

---

### Completeness Score

**Definition:** A score indicating how much relevant Offering Knowledge has been captured for an Offering.

A higher Completeness Score may improve PinkCurve's ability to understand, match, explain, and create content for the Offering.

Completeness does not by itself imply Offering quality.

**Purpose:** Identify missing Offering Knowledge and encourage better information quality.

**Related:** [Offering Knowledge](04-offering-knowledge.md)

---

## Business Concepts

### Customer Acquisition Cost (CAC)

**Definition:** The total cost required to acquire a new customer.

For PinkCurve, the context should specify whether CAC refers to PinkCurve acquiring a Seller, a Seller acquiring a customer, or another acquisition relationship.

PinkCurve aims to help Sellers reduce their customer acquisition costs through more efficient discovery.

---

### Lifetime Value (LTV)

**Definition:** The estimated total economic value generated by a customer over the duration of their relationship with a business.

For PinkCurve business metrics, LTV commonly refers to the expected value of a Seller relationship with PinkCurve.

---

### Average Order Value (AOV)

**Definition:** The average monetary value of an order or transaction.

PinkCurve does not necessarily observe Seller transactions directly, so AOV may be Seller-provided or estimated when used in PinkCurve calculations.

---

### Average Revenue Per Seller (ARPS)

**Definition:** The average revenue PinkCurve receives from active Sellers over a defined period.

**Purpose:** Help measure business sustainability and Seller economics.

---

### Active Seller

**Definition:** A Seller meeting PinkCurve's defined activity criteria during a specified measurement period.

Criteria may include having at least one active Offering or other meaningful Seller activity.

The exact definition should be stated when reported.

---

### Active Buyer

**Definition:** A Buyer who has engaged in meaningful PinkCurve discovery activity during a specified measurement period.

The exact activity and measurement period should be stated when reported.

---

### Return on Investment (ROI)

**Definition:** A general measure comparing economic benefit with the cost of an investment.

ROI is broader than PinkCurve's discovery-specific ROD metric.

---

## Product Development Concepts

### Minimum Viable Product (MVP)

**Definition:** The smallest practical version of PinkCurve that delivers meaningful value to Buyers and Sellers, validates the core discovery experience with real users, and produces reliable evidence for improving future versions of the platform.

PinkCurve's MVP is intended to evolve through Alpha and Beta validation rather than represent a finished product.

**Purpose:** Test whether PinkCurve's core approach to Meaningful Discovery works before attempting large-scale expansion.

**Related:** [Product Roadmap](15-product-roadmap.md)

---

### Alpha

**Definition:** An early testing stage in which PinkCurve validates the fundamental discovery experience with a limited number of controlled or invited Buyers and Sellers.

Alpha focuses on learning rather than scale.

Typical objectives include:

- Validate Offering ingestion
- Validate AI-assisted discovery
- Validate Buyer navigation
- Validate Adaptive Metadata Navigation
- Identify usability problems
- Identify trust and fraud issues
- Test data collection
- Gather early feedback

**Purpose:** Determine whether the fundamental PinkCurve discovery experience works well enough to continue toward broader testing.

**Related:** [Product Roadmap](15-product-roadmap.md)

---

### Beta

**Definition:** A broader testing stage following successful Alpha validation.

Beta introduces PinkCurve to a larger and more diverse group of Buyers and Sellers under more realistic operating conditions.

Typical objectives include:

- Validate Buyer return behavior
- Validate Seller value
- Test discovery quality at larger scale
- Evaluate Learning Engine improvement
- Evaluate trust operations
- Test customer support
- Validate business assumptions
- Identify operational weaknesses

**Purpose:** Determine whether PinkCurve is ready for broader launch and scaling.

**Related:** [Product Roadmap](15-product-roadmap.md)

---

### Experiment

**Definition:** A structured test designed to evaluate a specific hypothesis using defined data, procedures, metrics, and success criteria.

Experiments may include offline evaluation, controlled testing, A/B testing, Alpha testing, Beta testing, or other validation methods.

**Purpose:** Replace assumptions with evidence.

---

### A/B Test

**Definition:** An experiment comparing two or more variants to determine whether a change produces a measurable difference in defined outcomes.

**Purpose:** Evaluate product, discovery, creative, ranking, or other changes using evidence rather than intuition alone.

---

## Operational Concepts

### Operating Discipline

**Definition:** The continuous practice of operating PinkCurve with attention to execution, measurement, risk, accountability, learning, and corrective action.

Operating discipline includes repeatedly asking:

> **What are we trying to accomplish?**

> **What could go wrong?**

> **What are the early warning signals?**

> **What are we doing about it?**

**Purpose:** Help PinkCurve make progress safely, deliberately, and sustainably.

---

### Risk Register

**Definition:** A living operational record of significant risks facing PinkCurve.

A Risk Register may include:

- Risk description
- Category
- Probability
- Potential impact
- Early warning indicators
- Mitigation
- Owner
- Current status
- Review date

**Purpose:** Turn "What Could Go Wrong" from a planning exercise into an ongoing operating discipline.

**Related:** [Competitive Positioning](16-competitive-positioning.md), [Long-Term Vision](17-long-term-vision.md)

---

### Service Level Agreement (SLA)

**Definition:** A defined expectation for service performance, availability, support response, resolution, or another measurable operational commitment.

Not every internal target is necessarily a contractual SLA.

**Purpose:** Establish clear and measurable service expectations.

---

## Document Status Terms

### Draft

**Definition:** Content that is still being developed and may change significantly.

---

### In Review

**Definition:** Content considered sufficiently complete for structured review but not yet approved.

---

### Approved

**Definition:** Content that has been reviewed and accepted for the current document version.

Approval does not prevent future revisions.

---

### Deprecated

**Definition:** Content that is no longer current or recommended but is retained for historical reference.

---

## Acronyms

| Acronym | Full Term |
|---------|-----------|
| AI | Artificial Intelligence |
| AMN | Adaptive Metadata Navigation |
| AOV | Average Order Value |
| ARPS | Average Revenue Per Seller |
| CAC | Customer Acquisition Cost |
| CTR | Click-Through Rate |
| HITL | Human-in-the-Loop |
| LLM | Large Language Model |
| LTV | Lifetime Value |
| ML | Machine Learning |
| MVP | Minimum Viable Product |
| NPS | Net Promoter Score |
| PII | Personally Identifiable Information |
| QOV | Qualified Offering Visit |
| ROD | Return on Discovery |
| ROI | Return on Investment |
| SDK | Software Development Kit |
| SLA | Service Level Agreement |
| USP | Unique Selling Point |

---

## Terminology Summary

The most important PinkCurve concepts can be summarized as:

```text
Seller
  ↓
Offering
  ↓
Offering Knowledge
  ↓
Creative + Trust
  ↓
Discovery Platform
  ↓
Buyer
  ↓
Meaningful Discovery
  ↓
Discovery Analytics
  ↓
Learning Engine
  ↓
Better Discovery
```

PinkCurve's technology will continue to evolve.

Its terminology should continue to reinforce the fundamental relationship the platform exists to serve:

> **Buyers need help discovering what is worthwhile.**

> **Sellers need effective ways for the right Buyers to discover what they offer.**

PinkCurve exists to improve that relationship through Meaningful Discovery.

---

## Related Documents

- [Executive Summary](00-executive-summary.md)
- [Vision and Mission](01-vision-and-mission.md)
- [Offering Knowledge](04-offering-knowledge.md)
- [Discovery Engine](06-discovery-engine.md)
- [Discovery Analytics](07-discovery-analytics.md)
- [Learning Engine](08-learning-engine.md)
- [Seller Intelligence](09-seller-intelligence.md)
- [AI Platform](10-ai-platform.md)
- [Security, Privacy, and Trust](12-security-privacy-and-trust.md)
- [Business Model](13-business-model.md)
- [Success Metrics](14-success-metrics.md)
- [Product Roadmap](15-product-roadmap.md)
- [Competitive Positioning](16-competitive-positioning.md)
- [Long-Term Vision](17-long-term-vision.md)
- [Buyer Experience](20-buyer-experience.md)
- [All Chapters](../README.md#document-index)