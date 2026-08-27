# Open Decisions

## Document Status

| Field | Value |
|-------|-------|
| **Status** | Draft |
| **Version** | 0.3 |
| **Owner** | PinkCurve Product Team |
| **Last Reviewed** | 2026-08-22 |
| **Related Components** | All platform components |

---

## Overview

This document tracks important decisions, unresolved questions, and hypotheses that require additional research, experimentation, evidence, or operational experience before PinkCurve should make a final commitment.

The purpose of this document is not simply to maintain a list of unanswered questions.

Chapter 19 provides a structured process for turning uncertainty into:

**Evidence → Decisions → Documentation → Implementation → Validation**

PinkCurve should not silently turn assumptions into product behavior, architecture, business policy, or operational practice.

Important uncertainty should be visible.

Important decisions should be made at the appropriate time.

Important decisions should be documented.

And important decisions should ultimately be validated through implementation and real-world evidence.

Not every decision needs to be made immediately.

Some decisions must be made before Alpha.

Some should be informed by Alpha.

Others should wait until Beta, production scale, or actual market evidence exists.

The objective is therefore not to eliminate uncertainty prematurely.

The objective is to **manage uncertainty deliberately**.

---

## Decision Management Principles

### 1. Decide When the Decision Is Needed

PinkCurve should avoid making decisions prematurely when additional evidence will materially improve the decision.

Every significant Open Decision should therefore identify:

> **Decision Needed By**

Where possible, this should reference a milestone or dependency rather than an arbitrary calendar date.

Examples:

- Before Alpha Buyer registration implementation
- Before Discovery Event instrumentation
- Before Alpha begins
- Before paid Seller Beta
- Before production scaling
- Before international expansion

---

### 2. Decisions Should Be Evidence-Informed

Some decisions can be made through engineering analysis or product judgment.

Others require:

- Research
- Prototypes
- Experiments
- Alpha testing
- Beta testing
- Buyer feedback
- Seller feedback
- Operational experience
- Market validation
- Financial evidence

The required evidence should be documented before making major decisions whenever practical.

---

### 3. Decisions Must Lead to Implementation

A decision is not complete merely because PinkCurve has selected an option.

The decision must eventually be reflected in:

- Product requirements
- Architecture
- Data models
- User experience
- Security controls
- Business processes
- Operational procedures
- Engineering implementation
- Testing
- Measurement

---

### 4. Decisions Are Not Necessarily Permanent

A previously correct decision may become incorrect as PinkCurve changes.

Decisions may be reopened when there are material changes in:

- Buyer behavior
- Seller needs
- Technology
- AI capabilities
- Cost
- Market conditions
- Competitive conditions
- Regulation
- Security risks
- Fraud patterns
- Operational experience
- Business economics

PinkCurve should remain consistent in its principles while remaining flexible in implementation.

---

### 5. Preserve Decision History

Resolved decisions should remain traceable.

Future PinkCurve team members should be able to understand:

- What was decided
- Why it was decided
- What evidence supported it
- Where it was implemented
- Whether the result worked
- Whether the decision was later changed

---

## How to Use This Document

Each significant Open Decision should identify:

- What needs to be decided
- Why the decision matters
- What options are being considered
- What work is required before making the decision
- What evidence is needed
- When the decision must be made
- Who owns the decision
- Which Blueprint chapters are affected
- What implementation work depends on the decision
- What final decision was made
- Why the decision was made
- Whether implementation later validated the decision

Not every decision requires the same amount of documentation.

Major decisions affecting PinkCurve architecture, discovery, Buyers, Sellers, trust, privacy, economics, or operations should use the full decision format.

Smaller implementation decisions may use a shorter record.

Significant decisions should generally follow this lifecycle:

```text
Open Question
      ↓
Determine Why It Matters
      ↓
Identify Options
      ↓
Define Work Required
      ↓
Research / Prototype / Experiment
      ↓
Collect Evidence
      ↓
Make Decision
      ↓
Record Decision + Rationale
      ↓
Update Affected Blueprint Chapters
      ↓
Create Implementation Requirements
      ↓
Implement
      ↓
Validate
      ↓
Revisit When Necessary
```

---

## Where Final Decisions Are Documented

Chapter 19 is the decision-management location.

It should not become the permanent specification for every part of PinkCurve.

Once a decision is made, the final decision should also be reflected in the appropriate permanent documentation.

| Decision Type | Permanent Documentation |
|---------------|-------------------------|
| Architecture | ADR + relevant architecture chapter |
| Product | Relevant product chapter |
| Discovery | Discovery Engine / Buyer Experience |
| Data | Data Architecture / schema |
| AI / ML | AI Platform / relevant implementation documentation |
| Security / Trust | Security, Privacy, and Trust |
| Business / Pricing | Business Model |
| Metrics | Success Metrics |
| Buyer Experience | Buyer Experience / design documentation |
| Seller Experience | Relevant Seller documentation |
| Operations | Operational procedure or policy |
| Experiment | Experiment record and results |

Not every decision requires an Architecture Decision Record.

ADRs should primarily be used for significant architectural and technical decisions.

---

## Decision Status Legend

| Status | Meaning |
|--------|---------|
| **Open** | Question identified; evaluation has not started |
| **Researching** | Information and alternatives are being investigated |
| **Testing** | Prototype, experiment, Alpha, Beta, or other validation is underway |
| **Tentative** | Preliminary direction exists but additional evidence is required |
| **Decided** | Final decision has been made and documented |
| **Implementing** | Decision is being implemented |
| **Validated** | Implementation results support the decision |
| **Reopened** | New evidence or circumstances require reconsideration |

---

# Technical Decisions

## TD-001: Vector Database Selection

**Status:** Open

**Question:** Which vector storage and search technology should PinkCurve use for semantic Offering retrieval and similarity search?

**Why This Matters:**

Vector retrieval may become an important part of the Discovery Engine.

The choice affects:

- Discovery performance
- Infrastructure complexity
- Cost
- Scalability
- Operational burden
- Vendor dependency

**Options:**

| Option | Advantages | Considerations |
|--------|------------|----------------|
| pgvector | Simple, PostgreSQL integration | May require scaling strategy at high volume |
| Pinecone | Managed vector infrastructure | Additional service and cost |
| Weaviate | Flexible vector platform | Additional operational complexity |
| Other future solutions | May provide better capabilities | Requires evaluation |

**Work Required:**

- Estimate Alpha and Beta Offering volume
- Benchmark retrieval quality
- Benchmark latency
- Estimate operational cost
- Evaluate scaling requirements
- Evaluate migration difficulty

**Evidence Required:**

- Retrieval benchmarks
- Cost estimates
- Alpha performance requirements
- Operational complexity assessment

**Decision Needed By:**

Before vector infrastructure becomes a production dependency.

Alpha may begin with the simplest solution that satisfies requirements.

**Decision Owner:**

Engineering / AI Platform

**Affected Chapters:**

- 06-discovery-engine.md
- 10-ai-platform.md
- 11-data-architecture.md
- 15-product-roadmap.md

**Final Decision:** TBD

**Decision Rationale:** TBD

**Validation Result:** TBD

---

## TD-002: Embedding Strategy

**Status:** Open

**Question:** Which embedding model or embedding strategy should PinkCurve use for Offering representation and semantic discovery?

**Why This Matters:**

Embedding quality may directly affect discovery relevance.

The strategy also affects:

- Cost
- Latency
- Multimodal support
- Vendor dependency
- Model migration
- International expansion

**Options:**

- Managed commercial embedding model
- Specialized embedding provider
- Open-source/self-hosted model
- Multimodal embedding model
- Hybrid approach

**Work Required:**

- Build representative Offering test dataset
- Define retrieval evaluation metrics
- Compare candidate models
- Measure latency
- Measure cost
- Test semantic Offering matching
- Evaluate multimodal requirements

**Evidence Required:**

- Retrieval-quality benchmark
- Cost comparison
- Latency comparison
- Discovery relevance evaluation

**Decision Needed By:**

Before embedding infrastructure becomes a dependency for Alpha or Beta discovery.

**Decision Owner:**

AI Platform

**Affected Chapters:**

- 04-offering-knowledge.md
- 06-discovery-engine.md
- 10-ai-platform.md
- 15-product-roadmap.md

**Final Decision:** TBD

**Decision Rationale:** TBD

**Validation Result:** TBD

---

## TD-003: Discovery Event Processing Architecture

**Status:** Open

**Question:** How should PinkCurve capture, process, store, and analyze Discovery Events as the platform grows?

**Why This Matters:**

Discovery Events are the evidence foundation for:

- Discovery Analytics
- Learning Engine
- Buyer Discovery Profiles
- Seller Intelligence
- QOV
- Brand Recognition measurement
- Fraud detection
- Trust
- Operational investigation

PinkCurve must also be able to reconstruct meaningful portions of a Buyer Discovery Journey.

**Core Event Information May Include:**

- Event ID
- Event type
- Timestamp
- Buyer ID
- Session ID
- Offering ID when applicable
- Seller ID when applicable
- Discovery source
- Device context
- Permitted location context
- Event metadata
- Trace or correlation ID

**Options:**

- Direct database writes
- Cloud Pub/Sub
- Managed streaming
- Dataflow
- Kafka-based architecture
- Hybrid architecture

**Work Required:**

- Define canonical Discovery Event schema
- Estimate Alpha event volume
- Define reliability requirements
- Define event ordering requirements
- Define retention requirements
- Define privacy requirements
- Define real-time versus batch requirements
- Determine Learning Engine requirements

**Evidence Required:**

- Alpha instrumentation requirements
- Load estimates
- Cost analysis
- Latency requirements
- Reliability testing

**Decision Needed By:**

The Alpha Discovery Event schema must be decided before Alpha instrumentation implementation.

Production-scale processing architecture can evolve later.

**Decision Owner:**

Data / Engineering

**Affected Chapters:**

- 06-discovery-engine.md
- 07-discovery-analytics.md
- 08-learning-engine.md
- 10-ai-platform.md
- 11-data-architecture.md
- 12-security-privacy-and-trust.md

**Final Decision:** TBD

**Decision Rationale:** TBD

**Validation Result:** TBD

---

## TD-004: AI and Machine Learning Infrastructure

**Status:** Open

**Question:** How should PinkCurve train, evaluate, deploy, and serve AI and machine-learning capabilities?

**Why This Matters:**

PinkCurve may eventually use:

- LLMs
- Embeddings
- Ranking models
- Recommendation models
- Fraud detection models
- Trust models
- Creative models
- Other future AI systems

Different capabilities may require different infrastructure.

**Options:**

- Managed AI platform
- Serverless inference
- Cloud-hosted models
- External AI APIs
- Self-hosted models
- Hybrid architecture

**Work Required:**

- Identify Alpha model requirements
- Estimate inference volume
- Define latency targets
- Define evaluation requirements
- Compare infrastructure cost
- Define model monitoring
- Define fallback strategies

**Decision Needed By:**

Incrementally as Alpha AI capabilities are implemented.

PinkCurve does not need to select one permanent AI infrastructure architecture before Alpha.

**Decision Owner:**

AI Platform / Engineering

**Final Decision:** TBD

**Decision Rationale:** TBD

**Validation Result:** TBD

---

# Product Decisions

## PD-001: Offering Knowledge Completeness and Discovery Readiness

**Status:** Open

**Question:**

How should PinkCurve determine whether Offering Knowledge is sufficiently
complete, useful, reliable, and relevant to support Meaningful Discovery,
and how should that determination be implemented before Alpha?

**Why This Matters:**

Offering Knowledge is foundational to PinkCurve.

The Discovery Engine, Adaptive Metadata Navigation, AI matching,
Creative Studio, Learning Engine, Seller Intelligence, and trust
processes depend on having sufficient high-quality knowledge about
each Offering.

Completeness must therefore measure more than whether database fields
contain values.

A technically populated Offering may still contain incomplete,
low-quality, irrelevant, misleading, or unusable information.

PinkCurve must distinguish between:

- Field presence
- Information completeness
- Information quality
- Offering-type requirements
- Trust and verification requirements
- Discovery readiness

**Key Principle:**

> The Offering Knowledge Completeness Score measures whether PinkCurve
> has sufficient useful, reliable, and relevant knowledge about an
> Offering to understand it and support Meaningful Discovery.

The score should not simply represent the percentage of populated
database fields.

**Potential Evaluation Dimensions:**

- Offering identity
- Category and classification
- Description and purpose
- Features or characteristics
- Buyer benefits
- Target audience
- Price or cost information where applicable
- Location where applicable
- Timing where applicable
- Images and visual assets
- Destination URL
- Seller information
- Trust and verification information
- Discovery metadata
- Offering-type-specific information

**Discovery Readiness:**

Completeness Score and Discovery Readiness should be treated as related
but potentially separate concepts.

An Offering may have a high Completeness Score but still be blocked from
discovery because of a critical issue such as:

- Seller verification incomplete
- Offering verification incomplete
- Invalid destination URL
- Required information missing
- Fraud or trust concern
- Policy violation
- Critical Offering-type requirement missing

Therefore PinkCurve may represent Offering readiness as:

Completeness Score + Blocking Conditions → Discovery Readiness

---

## PD-002: Multiple Offering Knowledge Versions

**Status:** Tentative

**Question:** Should PinkCurve support multiple active Offering Knowledge versions for the same Offering?

**Potential Benefits:**

- A/B testing
- Alternative positioning
- Different audiences
- Seasonal variations

**Complexities:**

- Discovery matching
- Seller user experience
- Analytics attribution
- Learning Engine interpretation

**Tentative Direction:**

Do not support multiple simultaneously active versions for Alpha unless testing demonstrates a clear requirement.

**Decision Needed By:**

After initial Alpha discovery workflow is validated.

**Decision Owner:**

Product

**Final Decision:** TBD

**Decision Rationale:** TBD

**Validation Result:** TBD

---

## PD-003: Free Tier Limits

**Status:** Open

**Question:** What should Sellers receive through PinkCurve's free tier?

**Why This Matters:**

The free tier must provide enough value for Sellers to understand PinkCurve without creating unsustainable operating costs.

**Considerations:**

- Number of Offerings
- Creative generation limits
- Analytics
- Discovery exposure
- AI costs
- Support costs
- Upgrade incentives

**Work Required:**

- Determine actual operating cost
- Study early Seller behavior
- Test willingness to pay
- Compare competitive alternatives

**Decision Needed By:**

Before paid Seller Beta or commercial launch.

**Decision Owner:**

Product / Business

**Final Decision:** TBD

**Decision Rationale:** TBD

**Validation Result:** TBD

---

## PD-004: Pre-Registration Buyer Discovery Experience

**Status:** Tentative

**Question:** What should prospective Buyers be able to experience before registering for PinkCurve?

**Why This Matters:**

A new Buyer may want to understand PinkCurve's value before creating an account.

At the same time, the full discovery experience benefits from Buyer identity, preferences, continuity, trust, and learning.

**Tentative Direction:**

Allow a limited visual discovery experience before registration that demonstrates how PinkCurve works.

Require registration for the full personalized and persistent discovery experience.

**Work Required:**

- Design desktop preview experience
- Design mobile preview experience
- Determine what discovery capabilities are available
- Define transition to registration
- Test registration conversion
- Test whether preview communicates PinkCurve's value

**Evidence Required:**

- Alpha usability testing
- Preview-to-registration conversion
- Buyer feedback
- Registration abandonment

**Decision Needed By:**

Before Alpha public-facing Buyer experience.

**Decision Owner:**

Product / Buyer Experience

**Affected Chapters:**

- 06-discovery-engine.md
- 12-security-privacy-and-trust.md
- 15-product-roadmap.md
- 20-buyer-experience.md

**Final Decision:** TBD

**Decision Rationale:** TBD

**Validation Result:** TBD

---

## PD-005: Buyer Registration Model

**Status:** Tentative

**Question:** What information should PinkCurve require when a Buyer registers, and how should the Buyer Discovery Profile develop after registration?

**Why This Matters:**

Buyer registration affects:

- Meaningful Discovery
- Buyer Discovery Profile
- Personalization
- Brand Recognition
- Trust
- Fraud prevention
- Bot and abuse prevention
- Privacy
- Learning Engine
- Buyer continuity across sessions
- Buyer Experience

PinkCurve currently expects Buyer registration to become an important part of the discovery experience.

However, registration should not unnecessarily burden Buyers or require information before its value has been demonstrated.

**Options:**

- Minimal registration
- Registration with basic discovery interests
- Progressive profiling after registration
- Combination of minimal registration followed by progressive profiling

**Tentative Direction:**

Require Buyer registration for the full PinkCurve discovery experience while keeping initial registration simple.

Allow limited discovery before registration where useful for demonstrating PinkCurve's value.

Build the Buyer Discovery Profile progressively through:

- Buyer-provided information
- Buyer-selected interests
- Adaptive Metadata Navigation
- Explicit preferences
- Permitted discovery interactions
- Buyer feedback

Buyers should be able to view, modify, or reset appropriate discovery preferences.

**Work Required:**

- Define minimum required Buyer registration information
- Define optional Buyer profile information
- Define initial discovery-interest collection
- Define progressive profiling strategy
- Define privacy and consent requirements
- Define Buyer verification requirements
- Define pre-registration discovery experience
- Design registration UX
- Design Buyer Discovery Profile controls
- Determine what information the Discovery Engine may use
- Determine what information the Learning Engine may use
- Determine what information may support Brand Recognition
- Determine what Buyers can view, change, remove, or reset
- Test registration friction during Alpha
- Test whether additional profile information materially improves discovery

**Evidence Required:**

- Alpha usability testing
- Registration completion rate
- Registration abandonment rate
- Buyer feedback
- Buyer return rate
- Discovery-quality comparison
- AMN effectiveness
- Trust and abuse observations
- Effect of progressive profile information on Meaningful Discovery

**Decision Needed By:**

Initial registration requirements must be decided before Alpha Buyer registration implementation.

The broader progressive profiling model may continue to evolve during Alpha and Beta.

**Decision Owner:**

Product

**Affected Chapters:**

- 06-discovery-engine.md
- 07-discovery-analytics.md
- 08-learning-engine.md
- 10-ai-platform.md
- 11-data-architecture.md
- 12-security-privacy-and-trust.md
- 14-success-metrics.md
- 15-product-roadmap.md
- 20-buyer-experience.md

**Implementation Impact:**

- Buyer database schema
- Buyer registration UI
- Authentication and verification
- Buyer Discovery Profile
- Discovery Engine
- Adaptive Metadata Navigation
- Discovery Events
- Learning Engine
- Brand Recognition
- Privacy and consent controls
- Trust and fraud systems

**Final Decision:** TBD

**Decision Rationale:** TBD

**Validation Result:** TBD

---

## PD-006: Adaptive Metadata Navigation Initial Design

**Status:** Open

**Question:** What should the first Alpha implementation of Adaptive Metadata Navigation (AMN) include?

**Why This Matters:**

AMN is a central part of PinkCurve's approach to helping Buyers navigate large numbers of Offerings without becoming overwhelmed.

The first implementation must be useful enough to test the fundamental hypothesis without becoming unnecessarily complex.

**Work Required:**

- Define metadata sources
- Define metadata hierarchy
- Define AI role in generating navigation choices
- Define Buyer control
- Define interaction design
- Define mobile presentation
- Define Discovery Events generated by AMN
- Define fallback behavior
- Prototype with representative Offering datasets

**Evidence Required:**

- Buyer usability testing
- Navigation completion
- Time to worthwhile Offering
- Buyer confusion or abandonment
- Discovery-quality improvement
- Comparison with conventional filters/search where useful

**Decision Needed By:**

Before Alpha Discovery Experience implementation.

**Decision Owner:**

Product / Discovery / AI

**Affected Chapters:**

- 04-offering-knowledge.md
- 06-discovery-engine.md
- 07-discovery-analytics.md
- 08-learning-engine.md
- 10-ai-platform.md
- 20-buyer-experience.md

**Final Decision:** TBD

**Decision Rationale:** TBD

**Validation Result:** TBD

---

## PD-007: Seller and Offering Approval Model

**Status:** Open

**Question:** What approval and reapproval process should PinkCurve use for Sellers and Offerings?

**Why This Matters:**

Buyer trust depends heavily on preventing fake Sellers, fraudulent Offerings, misleading destinations, and deteriorating Seller quality.

Approval should not be considered permanent.

**Work Required:**

- Define Seller approval checklist
- Define Offering approval checklist
- Define destination website checks
- Define mobile destination quality requirements
- Define AI-assisted review
- Define human approval responsibilities
- Define reverification triggers
- Define periodic review
- Define suspension and appeal process

**Evidence Required:**

- Alpha approval workload
- False-positive rate
- Fraud detection results
- Human review time
- Buyer reports
- Seller support cases

**Decision Needed By:**

Initial approval requirements must be established before external Sellers enter Alpha.

**Decision Owner:**

Trust / Product / Operations

**Affected Chapters:**

- 04-offering-knowledge.md
- 10-ai-platform.md
- 11-data-architecture.md
- 12-security-privacy-and-trust.md
- 15-product-roadmap.md

**Final Decision:** TBD

**Decision Rationale:** TBD

**Validation Result:** TBD

---

## PD-007: Buyer Minimum Age and Teen Experience

**Status:** Tentative

**Question:**

What minimum age should PinkCurve require for Buyer accounts,
and what additional protections should apply to Buyers under 18?

**Tentative Direction:**

PinkCurve Buyer accounts should initially require Buyers to be
at least 13 years old.

Buyers under 13 should not be permitted to create PinkCurve accounts
during Alpha, Beta, or initial U.S. production.

Buyers ages 13–17 should be treated as Teen Buyers and may require
additional privacy, safety, personalization, data-use, and discovery
protections.

**Why This Matters:**

PinkCurve collects information used for Meaningful Discovery,
including Buyer identity, Buyer Discovery Profiles, interests,
Discovery Events, preferences, and potentially location and device
information.

Age therefore affects:

- Privacy
- Registration
- Consent
- Buyer Discovery Profiles
- Personalization
- Location use
- Discovery Events
- Advertising and Brand Recognition
- Data retention
- Safety
- Trust
- Legal compliance

**Work Required:**

- Confirm applicable U.S. federal requirements
- Confirm applicable state requirements
- Define minimum account age
- Define Teen Buyer protections
- Define neutral age-screening method
- Determine what age information must be stored
- Minimize retention of date-of-birth information
- Define permitted Teen Buyer profile information
- Define Teen Buyer personalization rules
- Define location-data rules
- Define Brand Recognition rules for Teen Buyers
- Define Seller interaction restrictions where appropriate
- Define handling when PinkCurve learns a Buyer is under 13
- Design registration UX
- Obtain appropriate legal review
- Implement and test before Alpha

**Evidence Required:**

- Legal/compliance review
- Registration UX testing
- Age-screen testing
- Privacy review
- Security review
- Teen Buyer protection testing

**Decision Needed By:**

Final policy, registration rules, and required protections must be
decided, implemented, and tested before external Alpha Buyer
registration begins.

**Decision Owner:**

Product / Legal / Security / Trust

**Affected Chapters:**

- 06-discovery-engine.md
- 07-discovery-analytics.md
- 08-learning-engine.md
- 10-ai-platform.md
- 11-data-architecture.md
- 12-security-privacy-and-trust.md
- 15-product-roadmap.md
- 20-buyer-experience.md

**Related Open Decisions:**

- PD-005: Buyer Registration Model
- CL-001: U.S. Privacy and Regulatory Compliance
- CL-002: Cookie, Tracking, and Consent Approach

**Final Decision:**

TBD

**Decision Rationale:**

TBD

**Validation Result:**

TBD

---

## PD-008: Adult-Only and Age-Restricted Offering Policy

**Status:** Tentative

**Question:**

Should PinkCurve permit adult-only, age-restricted, or other
Offerings that require Buyer age verification?

**Tentative Direction:**

PinkCurve will not accept adult-only or age-restricted Offerings
for the foreseeable future.

PinkCurve is intended to be a general-audience Discovery Platform
focused on Meaningful Discovery.

PinkCurve does not need adult-only or age-restricted Offerings to
fulfill this mission.

Excluding these Offerings reduces unnecessary legal, safety,
privacy, trust, age-verification, Seller-approval, and operational
risks while creating a more broadly appropriate discovery
environment for Buyers.

**Core Principle:**

> A legitimate Seller does not automatically make every Offering
> from that Seller eligible for PinkCurve.

Seller approval and Offering approval are separate decisions.

**Initial Excluded Categories:**

The policy should evaluate and define categories including:

- Adult-oriented and sexually explicit Offerings
- Alcohol
- Tobacco and nicotine products
- Cannabis and controlled substances
- Gambling-related Offerings
- Weapons and other highly regulated products
- Products or services legally requiring minimum-age verification
- Other Offerings presenting comparable age-related regulatory risk

The precise prohibited-category definitions must receive appropriate
legal and compliance review.

**Offering Approval Requirement:**

Every Offering submitted to PinkCurve should be evaluated against
the prohibited and restricted Offering policy before publication.

AI may perform initial classification and risk screening.

Uncertain or potentially restricted Offerings should be escalated
for human review.

**Ongoing Monitoring:**

Approval is not permanent.

PinkCurve should periodically reevaluate approved Offerings and
Seller destinations to identify:

- Offering changes
- Category changes
- Misclassification
- Seller destination changes
- Attempts to bypass Offering restrictions
- New legal or regulatory concerns

An Offering that becomes inconsistent with PinkCurve policy should
be suspended or removed pending review.

**Decision Needed By:**

The prohibited Offering policy, classification rules, approval
workflow, and enforcement procedures must be finalized,
implemented, and tested before external Alpha.

**Long-Term Direction:**

PinkCurve intends to exclude adult-only and age-restricted
Offerings for the foreseeable future.

Any future proposal to permit such Offerings should require a new
formal Open Decision, legal review, risk assessment, technical
assessment, and explicit approval before the existing policy is
changed.

**Decision Owner:**

Product / Trust / Legal / Seller Operations

**Related Open Decisions:**

- PD-007: Buyer Minimum Age and Teen Experience
- CL-001: U.S. Privacy and Regulatory Compliance

**Final Decision:**

TBD — pending legal/compliance review before Alpha

**Decision Rationale:**

Protect Buyers and PinkCurve from unnecessary age-related,
regulatory, privacy, trust, and operational risks while keeping
the platform focused on its core mission of Meaningful Discovery.

**Validation Result:**

TBD

---

# Business Decisions

## BD-001: QOV Pricing Validation

**Status:** Open

**Question:** What is the appropriate price for Qualified Offering Visits?

**Why This Matters:**

QOV pricing must create measurable value for Sellers while generating sustainable revenue for PinkCurve.

**Variables:**

- Per-QOV rate
- Volume tiers
- Category
- Geography
- Seller size
- QOV quality
- PinkCurve operating cost

**Work Required:**

- Interview early Sellers
- Measure Seller value
- Estimate conversion economics
- Compare alternative acquisition costs
- Test pricing during Beta

**Evidence Required:**

- Seller willingness to pay
- Seller retention
- Estimated ROD
- PinkCurve gross margin
- Competitive acquisition costs

**Decision Needed By:**

Before paid Seller Beta.

**Decision Owner:**

Business / Product

**Final Decision:** TBD

**Decision Rationale:** TBD

**Validation Result:** TBD

---

## BD-002: Enterprise Pricing Model

**Status:** Open

**Question:** How should Enterprise Sellers be priced?

**Options:**

- Volume-based
- Feature-based
- Subscription
- Custom negotiated pricing
- Combination

**Decision Needed By:**

Before Enterprise offering development.

**Decision Owner:**

Business

**Final Decision:** TBD

**Decision Rationale:** TBD

**Validation Result:** TBD

---

## BD-003: Payment Processing and Seller Billing

**Status:** Tentative

**Question:**

Which payment processor and billing architecture should PinkCurve use
for Seller payments, and what minimum billing capability must be
implemented and validated during Alpha?

**Why This Matters:**

Seller billing is a fundamental part of PinkCurve's ability to become
a sustainable business.

Although Alpha primarily validates whether PinkCurve's approach to
Meaningful Discovery works, PinkCurve should also validate that the
economic path from discovery activity to Seller billing is technically
workable.

Billing may eventually include:

- Seller subscriptions
- Qualified Offering Visit (QOV) charges
- Brand Recognition programs
- Campaign charges
- Credits
- Adjustments
- Refunds
- Free-tier allowances
- Promotional credits
- Invoices
- Payment history

The payment processor should therefore be evaluated as part of a larger
Seller billing architecture rather than as an isolated payment API.

**Current State:**

Stripe has previously been configured but is not actively used.

**Tentative Direction:**

Evaluate Stripe as the initial payment-processing solution because
PinkCurve already has some experience with it.

The final decision should depend on PinkCurve's billing requirements
rather than prior configuration alone.

**Work Required:**

- Define Alpha Seller billing requirements
- Define Seller billing-account model
- Define invoice data model
- Define QOV accounting requirements
- Define subscription requirements if applicable
- Define free-tier and promotional-credit handling
- Define Brand Recognition billing requirements
- Define credits, adjustments, and refund handling
- Define payment-failure handling
- Define billing audit trail
- Define Seller billing UI requirements
- Evaluate Stripe against these requirements
- Evaluate alternatives if significant requirements are not met
- Implement payment processor in test/sandbox mode
- Implement basic Seller billing workflow
- Test end-to-end billing
- Define Beta production-payment requirements
- Define security and financial controls

**Evidence Required:**

- Successful end-to-end Alpha billing tests
- Accurate QOV accounting where applicable
- Accurate invoice generation
- Correct credits and adjustments
- Successful test payment processing
- Seller billing usability feedback
- Billing auditability
- Cost assessment
- Operational complexity assessment

**Decision Needed By:**

Payment processor and initial Seller billing architecture must be
decided before Alpha billing implementation.

A minimum end-to-end billing workflow should be implemented and tested
during Alpha.

Production charging, final pricing rules, tax handling, and broader
commercial billing capabilities must be ready before paid Beta.

**Decision Owner:**

Business / Finance / Engineering

**Affected Chapters:**

- 07-discovery-analytics.md
- 09-seller-intelligence.md
- 11-data-architecture.md
- 12-security-privacy-and-trust.md
- 13-business-model.md
- 14-success-metrics.md
- 15-product-roadmap.md

**Implementation Impact:**

- Seller accounts
- Seller billing accounts
- QOV accounting
- Invoice generation
- Payment processor integration
- Credits and adjustments
- Seller billing history
- Financial reporting
- Audit logs
- Seller Intelligence
- Customer support

**Final Decision:**

TBD

**Decision Rationale:**

TBD

**Validation Result:**

TBD

---

## BD-004: Brand Recognition Business Model

**Status:** Open

**Question:** How should PinkCurve price and measure Seller Brand Recognition programs?

**Why This Matters:**

Brand Recognition may not be tied directly to a specific Offering or immediate QOV.

Sellers may want to build awareness among relevant Buyers based on:

- Geography
- Category
- Buyer interests
- Timing
- Other appropriate discovery contexts

Brand Recognition therefore requires its own value model and metrics.

**Work Required:**

- Define Brand Recognition Offering structure
- Define targeting options
- Define geographic options
- Define Seller controls
- Define Buyer relevance safeguards
- Define metrics
- Define pricing models
- Test Seller demand

**Evidence Required:**

- Buyer response
- Relevant audience reach
- Recognition or recall indicators
- Seller willingness to pay
- Buyer trust impact

**Decision Needed By:**

Before Brand Recognition becomes a paid Seller capability.

**Decision Owner:**

Business / Product

**Affected Chapters:**

- 06-discovery-engine.md
- 07-discovery-analytics.md
- 09-seller-intelligence.md
- 13-business-model.md
- 14-success-metrics.md

**Final Decision:** TBD

**Decision Rationale:** TBD

**Validation Result:** TBD

---

## BD-005: Cold-Start Strategy and Initial Acquisition Budget

**Status:** Open

**Question:** How should PinkCurve obtain enough initial Sellers, Offerings, and Buyers to create a useful discovery ecosystem without unsustainable acquisition spending?

**Why This Matters:**

PinkCurve faces a two-sided cold-start problem.

Without enough worthwhile Offerings, Buyers may not return.

Without enough Buyers, Sellers may not see sufficient value.

Awareness of PinkCurve itself must also be created.

**Work Required:**

- Define initial geography
- Define initial Offering categories
- Identify early Seller segments
- Define Seller recruitment strategy
- Define Buyer acquisition strategy
- Estimate advertising requirements
- Explore referrals and partnerships
- Determine Alpha and Beta acquisition budgets
- Measure acquisition economics

**Evidence Required:**

- Seller acquisition cost
- Buyer acquisition cost
- Buyer return behavior
- Seller activation
- Offering density
- Discovery quality
- QOV volume
- Retention

**Decision Needed By:**

Initial strategy must be defined before external Alpha recruitment.

Larger acquisition-budget decisions should follow Alpha evidence.

**Decision Owner:**

Business / Product

**Affected Chapters:**

- 13-business-model.md
- 14-success-metrics.md
- 15-product-roadmap.md
- 16-competitive-positioning.md

**Final Decision:** TBD

**Decision Rationale:** TBD

**Validation Result:** TBD

---

# Alpha and Beta Validation Decisions

## AV-001: Alpha Scope

**Status:** Open

**Question:** What exact capabilities, Buyers, Sellers, Offering categories, and geographic scope should be included in PinkCurve Alpha?

**Guiding Purpose:**

> **The purpose of Alpha is to determine whether PinkCurve's approach to discovery works.**

Alpha should therefore remain focused enough to produce understandable evidence.

**Work Required:**

- Define Alpha Buyer population
- Define Alpha Seller population
- Define Offering categories
- Define geographic scope
- Define required AI capabilities
- Define AMN scope
- Define trust controls
- Define instrumentation
- Define support process

**Decision Needed By:**

Before Alpha implementation scope is finalized.

**Decision Owner:**

Product

**Final Decision:** TBD

**Decision Rationale:** TBD

**Validation Result:** TBD

---

## AV-002: Alpha Success Criteria

**Status:** Open

**Question:** What evidence will demonstrate that PinkCurve's Alpha discovery approach is working well enough to proceed to Beta?

**Potential Measures:**

- Buyers discover worthwhile Offerings
- Buyers can navigate without excessive confusion
- Buyers return
- AMN improves discovery
- AI improves relevance
- Sellers perceive value
- Trust remains strong
- Fraud is manageable
- Discovery Events are reliable
- Platform performance is acceptable

Success should not be based simply on the number of impressions or Offerings viewed.

A Buyer who quickly discovers one worthwhile Offering may represent a better outcome than a Buyer who views many irrelevant Offerings.

**Work Required:**

- Define quantitative metrics
- Define qualitative feedback
- Define minimum sample sizes
- Define test duration
- Define failure criteria
- Define Beta readiness criteria

**Decision Needed By:**

Before Alpha begins.

**Decision Owner:**

Product / Analytics

**Affected Chapters:**

- 07-discovery-analytics.md
- 14-success-metrics.md
- 15-product-roadmap.md

**Final Decision:** TBD

**Decision Rationale:** TBD

**Validation Result:** TBD

---

## AV-003: Test Data Strategy

**Status:** Open

**Question:** What data should PinkCurve use for development, offline testing, Alpha validation, and AI evaluation?

**Why This Matters:**

Discovery quality cannot be evaluated without representative Offering and Buyer scenarios.

**Work Required:**

- Define synthetic test data
- Define real Seller Offering data
- Define Buyer test profiles
- Define expected discovery outcomes
- Define fraud and trust test cases
- Define AMN test cases
- Define AI evaluation datasets
- Define privacy protections

**Decision Needed By:**

Before systematic Discovery Engine and Alpha testing.

**Decision Owner:**

Product / Data / AI

**Final Decision:** TBD

**Decision Rationale:** TBD

**Validation Result:** TBD

---

# Hypotheses to Validate

Hypotheses differ from Open Decisions.

An Open Decision asks:

> **What should PinkCurve do?**

A hypothesis asks:

> **What does PinkCurve believe may be true, and what evidence is required to determine whether it is actually true?**

PinkCurve should not treat an important hypothesis as fact simply because it appears reasonable.

Important hypotheses should be tested through evidence from prototypes, experiments, Alpha, Beta, Buyer behavior, Seller behavior, platform measurements, or other appropriate validation methods.

Each significant hypothesis should identify:

- Why the hypothesis matters
- How it will be validated
- What evidence is required
- When validation is needed
- Who owns the validation
- Which Blueprint chapters may be affected
- What the validation actually found
- What PinkCurve should do as a result

Hypotheses should generally follow this lifecycle:

```text
Hypothesis
    ↓
Why It Matters
    ↓
Define Validation Approach
    ↓
Define Evidence Required
    ↓
Experiment / Alpha / Beta
    ↓
Collect Evidence
    ↓
Analyze Results
    ↓
Validation Result
    ↓
Determine Outcome
    ↓
Update Affected Decisions / Chapters
    ↓
Implement Improvements
    ↓
Continue Monitoring
```

Possible hypothesis outcomes include:

- **Supported**
- **Partially Supported**
- **Not Supported**
- **Inconclusive**
- **Continue Testing**

A hypothesis that is not supported should not be treated as a failure of the project.

Discovering that an assumption is incorrect before PinkCurve invests heavily in it is itself valuable learning.

---

## H-001: Discovery Score Validity

**Status:** Not Yet Validated

**Hypothesis:**

Discovery Score can provide a meaningful high-level measure of discovery effectiveness and may correlate with Buyer and Seller value.

**Why This Matters:**

PinkCurve needs reliable ways to understand whether discovery is actually improving.

A composite Discovery Score could provide a useful high-level indicator, but only if the score reflects Meaningful Discovery rather than simply combining convenient engagement metrics.

A Buyer viewing many Offerings does not necessarily represent successful discovery.

Likewise, a high click rate does not necessarily mean Sellers are receiving valuable Buyer interest.

Discovery Score should therefore not become an important platform KPI until its relationship to meaningful outcomes has been tested.

**Validation Approach:**

Compare Discovery Score with independent indicators of discovery value, including:

- Qualified Offering Visits
- Buyer satisfaction
- Buyer feedback
- Buyer return behavior
- Successful discovery outcomes
- Seller retention
- Seller-reported value
- Other Meaningful Discovery indicators

Test whether changes in Discovery Score correspond to actual improvements in Buyer and Seller outcomes.

**Evidence Required:**

- Discovery Event data
- QOV data
- Buyer feedback
- Buyer return behavior
- Seller feedback
- Seller retention
- Sufficient Alpha/Beta discovery activity
- Statistical or analytical evidence of meaningful correlation

**Validation Needed By:**

Initial validation should occur during Alpha.

Stronger validation is required before Discovery Score is treated as a major Beta, business, or executive KPI.

Discovery Score should continue to be recalibrated as PinkCurve accumulates more evidence.

**Validation Owner:**

Product / Discovery Analytics

**Affected Chapters:**

- 06-discovery-engine.md
- 07-discovery-analytics.md
- 08-learning-engine.md
- 09-seller-intelligence.md
- 14-success-metrics.md

**Validation Result:**

TBD

**Outcome:**

TBD — Supported / Partially Supported / Not Supported / Inconclusive / Continue Testing

---

## H-002: AI Creative Performance

**Status:** Not Yet Validated

**Hypothesis:**

AI-assisted creative can produce sufficiently effective visual storytelling and creative assets for PinkCurve discovery.

**Why This Matters:**

Creative presentation affects whether Buyers understand and become interested in Offerings.

PinkCurve's Creative Studio may help Sellers create useful discovery content, but AI-generated creative should not be assumed to perform well simply because it can be generated quickly or inexpensively.

The objective is not to maximize AI-generated content.

The objective is to help Buyers understand worthwhile Offerings and support Meaningful Discovery.

**Validation Approach:**

Compare different creative approaches using controlled discovery experiments where practical.

Possible comparisons include:

- AI-assisted creative
- Seller-provided creative
- Professionally produced creative
- Different AI-generated variants
- Different storytelling formats

Evaluate both quantitative performance and qualitative Buyer response.

**Evidence Required:**

- Offering views
- Buyer engagement
- QOV
- Buyer feedback
- Seller feedback
- Creative-quality review
- Discovery effectiveness
- Cost of creative generation
- Time required to create usable content

**Validation Needed By:**

Initial validation should occur during Alpha where sufficient creative content exists.

Stronger validation should occur during Beta before PinkCurve treats AI Creative Studio performance as a proven Seller value proposition.

AI creative performance should continue to be evaluated as models and creative technologies improve.

**Validation Owner:**

Creative Studio / Product / Discovery Analytics

**Affected Chapters:**

- 04-offering-knowledge.md
- 05-creative-studio.md
- 07-discovery-analytics.md
- 09-seller-intelligence.md
- 10-ai-platform.md
- 14-success-metrics.md

**Validation Result:**

TBD

**Outcome:**

TBD — Supported / Partially Supported / Not Supported / Inconclusive / Continue Testing

---

## H-003: Learning Engine Impact

**Status:** Not Yet Validated

**Hypothesis:**

The Learning Engine can materially improve Meaningful Discovery over time by learning from Buyer, Seller, Offering, and Discovery Event signals.

**Why This Matters:**

Continuous learning is one of PinkCurve's fundamental platform capabilities.

PinkCurve expects discovery to improve as the platform learns from real interactions.

If the Learning Engine does not produce measurable improvement, PinkCurve must understand whether the problem lies in:

- Signal quality
- Discovery Event quality
- Buyer profile quality
- Offering Knowledge
- Ranking
- Model selection
- Feedback interpretation
- Insufficient data
- Learning methodology

PinkCurve should not claim that the platform continuously improves unless that improvement can be demonstrated.

**Validation Approach:**

Measure discovery performance before and after learning-driven changes.

Where practical:

- Establish baseline discovery performance
- Apply Learning Engine improvements
- Use controlled comparisons
- Measure changes in discovery relevance
- Measure changes in Buyer outcomes
- Measure changes in Seller outcomes
- Evaluate unintended effects

**Evidence Required:**

- Reliable Discovery Events
- Baseline discovery measurements
- Model or ranking versions
- Buyer feedback
- QOV
- Buyer return behavior
- Seller outcomes
- Before/after or controlled comparison results
- Sufficient interaction volume

**Validation Needed By:**

Initial validation should begin during Alpha as soon as sufficient interaction data exists.

Meaningful evidence of Learning Engine improvement should be available before PinkCurve makes strong Beta or market claims that discovery continuously improves through learning.

Validation should continue throughout the life of the platform.

**Validation Owner:**

Learning Engine / AI Platform / Discovery Analytics

**Affected Chapters:**

- 06-discovery-engine.md
- 07-discovery-analytics.md
- 08-learning-engine.md
- 09-seller-intelligence.md
- 10-ai-platform.md
- 14-success-metrics.md
- 15-product-roadmap.md

**Validation Result:**

TBD

**Outcome:**

TBD — Supported / Partially Supported / Not Supported / Inconclusive / Continue Testing

---

## H-004: Offering Knowledge Correlation

**Status:** Not Yet Validated

**Hypothesis:**

Higher-quality and more complete Offering Knowledge improves PinkCurve's ability to understand Offerings and produce better Meaningful Discovery.

**Why This Matters:**

Offering Knowledge is foundational to PinkCurve.

It supports:

- AI understanding
- Discovery matching
- Adaptive Metadata Navigation
- Creative generation
- Ranking
- Seller Intelligence
- Learning

However, PinkCurve should not assume that simply collecting more information produces better discovery.

The quality, relevance, reliability, and usefulness of the information may matter more than raw quantity.

This hypothesis is closely related to PD-001: Offering Knowledge Completeness and Discovery Readiness.

**Validation Approach:**

Compare Offering Knowledge completeness and quality with discovery outcomes.

Evaluate whether Offerings with stronger Offering Knowledge demonstrate improvements in:

- Discovery relevance
- AMN usefulness
- Buyer understanding
- Buyer engagement
- QOV
- Buyer satisfaction
- Seller value

Test individual knowledge dimensions where possible rather than relying only on the overall Completeness Score.

**Evidence Required:**

- Completeness Score
- Offering Knowledge quality measures
- Offering-type information
- Discovery Event data
- QOV
- Buyer feedback
- Discovery relevance measurements
- Seller feedback
- Sufficient Offering diversity

**Validation Needed By:**

Initial validation should occur during Alpha.

Evidence should be available before the Completeness Score is treated as a validated predictor of discovery performance.

The scoring methodology should be recalibrated as Alpha and Beta evidence becomes available.

**Validation Owner:**

Offering Knowledge / Discovery Analytics / Product

**Affected Chapters:**

- 04-offering-knowledge.md
- 05-creative-studio.md
- 06-discovery-engine.md
- 07-discovery-analytics.md
- 08-learning-engine.md
- 14-success-metrics.md
- 19-open-decisions.md

**Related Open Decision:**

PD-001: Offering Knowledge Completeness and Discovery Readiness

**Validation Result:**

TBD

**Outcome:**

TBD — Supported / Partially Supported / Not Supported / Inconclusive / Continue Testing

---

## H-005: Adaptive Metadata Navigation Effectiveness

**Status:** Not Yet Validated

**Hypothesis:**

Adaptive Metadata Navigation helps Buyers discover worthwhile Offerings more effectively and with less confusion than conventional navigation alone.

**Why This Matters:**

Adaptive Metadata Navigation is a core part of PinkCurve's approach to Meaningful Discovery.

PinkCurve expects Buyers to encounter potentially large numbers of Offerings.

Simply presenting more Offerings does not necessarily create value and may instead create information overload.

AMN is intended to give Buyers understandable and adaptive tools for navigating Offerings based on relevant metadata, Buyer intent, context, interests, and discovery progress.

If AMN does not materially help Buyers discover worthwhile Offerings, PinkCurve must understand why and improve, modify, or reconsider the approach before scaling it.

**Validation Approach:**

Evaluate AMN during Alpha using representative:

- Buyers
- Buyer Discovery Profiles
- Offerings
- Offering categories
- Discovery tasks
- Browsing scenarios
- Mobile experiences
- Desktop experiences

Where practical, compare AMN with conventional approaches such as:

- Search
- Static filters
- Category navigation
- Conventional browsing

Evaluate both purposeful discovery and relaxed browsing where Buyers may not initially know exactly what they want.

**Evidence Required:**

- Successful discovery rate
- Time to worthwhile Offering
- Navigation abandonment
- Number of unnecessary navigation steps
- Buyer satisfaction
- Buyer feedback
- Buyer return behavior
- Discovery quality
- AMN interaction events
- QOV
- Comparison with conventional navigation where appropriate
- Mobile usability results

**Validation Needed By:**

Initial AMN validation must be completed before the Alpha-to-Beta readiness decision.

Because AMN is a core part of PinkCurve's discovery approach, Alpha should provide sufficient evidence to determine whether the approach is promising enough to continue, requires significant modification, or should be reconsidered.

AMN should continue to be evaluated and improved during Beta and production.

**Validation Owner:**

Product / Discovery Engine / Discovery Analytics / AI Platform

**Affected Chapters:**

- 04-offering-knowledge.md
- 06-discovery-engine.md
- 07-discovery-analytics.md
- 08-learning-engine.md
- 10-ai-platform.md
- 14-success-metrics.md
- 15-product-roadmap.md
- 20-buyer-experience.md

**Related Open Decision:**

PD-006: Adaptive Metadata Navigation Initial Design

**Validation Result:**

TBD

**Outcome:**

TBD — Supported / Partially Supported / Not Supported / Inconclusive / Continue Testing

---

## H-006: Buyer Discovery Profile Improves Discovery

**Status:** Not Yet Validated

**Hypothesis:**

A progressively developed Buyer Discovery Profile materially improves discovery relevance and Meaningful Discovery without creating unacceptable registration, privacy, or Buyer Experience friction.

**Why This Matters:**

PinkCurve expects the Buyer Discovery Profile to help the platform understand what may matter to each Buyer.

The profile may incorporate appropriate information from:

- Buyer-provided information
- Buyer-selected interests
- Explicit preferences
- Adaptive Metadata Navigation
- Permitted discovery interactions
- Buyer feedback
- Other consented discovery signals

However, collecting more Buyer information is not automatically beneficial.

PinkCurve should collect and use Buyer information only when it provides sufficient discovery, trust, continuity, or Buyer Experience value to justify the additional complexity and privacy responsibility.

**Validation Approach:**

Compare discovery performance at different levels of Buyer Discovery Profile completeness.

Evaluate:

- Minimal Buyer profile
- Basic interests
- Progressively enriched profile
- Explicit Buyer preferences
- Permitted behavioral discovery signals

Measure whether additional profile information produces meaningful improvement in discovery.

Also measure whether additional profile requirements create:

- Registration abandonment
- Buyer discomfort
- Reduced trust
- Profile-management burden
- Reduced platform usage

**Evidence Required:**

- Registration completion rate
- Registration abandonment rate
- Buyer profile completeness
- Discovery relevance
- Successful discovery rate
- QOV
- Buyer feedback
- Buyer trust indicators
- Buyer return behavior
- AMN effectiveness
- Comparison across different profile levels

**Validation Needed By:**

Initial validation should occur during Alpha.

Evidence should inform the Buyer registration and progressive profiling model before Beta.

PinkCurve should not significantly expand mandatory Buyer profile requirements without evidence that the additional information materially improves the discovery experience or platform trust.

**Validation Owner:**

Product / Buyer Experience / Discovery Engine / Discovery Analytics

**Affected Chapters:**

- 06-discovery-engine.md
- 07-discovery-analytics.md
- 08-learning-engine.md
- 10-ai-platform.md
- 11-data-architecture.md
- 12-security-privacy-and-trust.md
- 14-success-metrics.md
- 20-buyer-experience.md

**Related Open Decision:**

PD-005: Buyer Registration Model

**Validation Result:**

TBD

**Outcome:**

TBD — Supported / Partially Supported / Not Supported / Inconclusive / Continue Testing

---

## Hypothesis Review and Resolution

Hypotheses should be reviewed as part of PinkCurve's regular planning and Open Decision review process.

The Planning Lead should identify:

- Hypotheses approaching their Validation Needed By milestone
- Experiments or instrumentation that have not yet been implemented
- Missing evidence
- Insufficient sample sizes
- Conflicting results
- Hypotheses that affect upcoming roadmap decisions
- Hypotheses that should be modified or divided into smaller hypotheses

When sufficient evidence exists, the Validation Owner should document:

1. **Validation Result** — What did the evidence actually show?
2. **Outcome** — Supported, Partially Supported, Not Supported, Inconclusive, or Continue Testing.
3. **Implications** — What should PinkCurve change because of the result?
4. **Affected Decisions** — Which Open Decisions should now be resolved or reopened?
5. **Affected Chapters** — Which Blueprint documents need updating?
6. **Implementation Actions** — What product, technical, business, or operational changes are required?

A hypothesis should not disappear after validation.

Its result becomes part of PinkCurve's institutional knowledge and provides evidence for future decisions.

---

## Alpha Hypothesis Priority

Not all hypotheses have equal importance for Alpha.

The primary purpose of Alpha is:

> **To determine whether PinkCurve's approach to discovery works.**

Therefore, Alpha should place particular emphasis on validating hypotheses directly related to Meaningful Discovery.

The initial priority should be:

1. **H-005 — Adaptive Metadata Navigation Effectiveness**
2. **H-004 — Offering Knowledge Correlation**
3. **H-006 — Buyer Discovery Profile Improves Discovery**
4. **H-001 — Discovery Score Validity**
5. **H-003 — Learning Engine Impact**
6. **H-002 — AI Creative Performance**

This ordering does not mean lower-priority hypotheses are unimportant.

It means PinkCurve should first establish whether the fundamental discovery system creates value for Buyers and Sellers before optimizing supporting capabilities.

---

# Compliance and Legal Decisions

## CL-001: U.S. Privacy and Regulatory Compliance

**Status:** Open

**Question:**

What federal and applicable U.S. state privacy, consumer protection,
data security, accessibility, and other regulatory requirements must
PinkCurve implement before Alpha?

**Why This Matters:**

PinkCurve will collect and process information relating to Buyers,
Sellers, Offerings, Discovery Events, Buyer Discovery Profiles,
payments, trust, fraud prevention, and platform operations.

Compliance cannot be postponed until Beta or production.

Privacy, security, consent, data handling, and applicable consumer
rights should be incorporated into PinkCurve's architecture and
Buyer/Seller experiences before external Alpha users begin using
the platform.

PinkCurve currently expects to operate only in the United States
for the foreseeable future.

Therefore, the initial compliance program should focus on applicable
U.S. federal and state requirements rather than international
requirements such as GDPR.

**Initial Areas to Evaluate:**

- Federal privacy and consumer-protection requirements
- Applicable state privacy laws
- California privacy requirements where applicable
- Data security requirements and reasonable safeguards
- Privacy notices
- Buyer and Seller data rights
- Data access
- Data correction
- Data deletion
- Data retention
- Sale/sharing and applicable opt-out requirements
- Sensitive personal information
- Location information
- Cookies and tracking technologies
- Children's privacy and age requirements
- Marketing communications
- Payment-related requirements
- Website and mobile accessibility
- AI-assisted processing and automated decision-making requirements
- Seller and Buyer terms of service
- Third-party service-provider requirements

**Work Required:**

- Identify PinkCurve's initial U.S. operating jurisdictions
- Inventory personal information PinkCurve collects
- Document why each category of information is collected
- Map data flows
- Identify applicable federal requirements
- Identify applicable state requirements
- Determine whether and when state-law applicability thresholds are met
- Define privacy notices
- Define Buyer and Seller rights-request procedures
- Define data access procedures
- Define correction procedures
- Define deletion procedures
- Define retention policies
- Define consent requirements
- Define sensitive-data handling
- Define location-data handling
- Define third-party data-processing requirements
- Define security safeguards
- Define age requirements
- Define accessibility requirements
- Obtain qualified legal review before external Alpha where necessary
- Create compliance test cases
- Verify implementation before Alpha launch

**Evidence Required:**

- Data inventory completed
- Data-flow documentation completed
- Applicable-law assessment completed
- Required privacy notices implemented
- Required Buyer/Seller controls implemented
- Data-rights workflows tested
- Consent mechanisms tested where required
- Security controls tested
- Compliance checklist completed
- Legal review completed where appropriate

**Decision Needed By:**

Applicable U.S. compliance requirements must be identified,
documented, and incorporated into implementation before external Alpha.

Required controls must be implemented and tested before affected
Buyers or Sellers participate in Alpha.

Compliance must continue to be reviewed as PinkCurve changes,
enters additional U.S. states, introduces new data uses, or laws change.

**Decision Owner:**

Legal / Security / Product / Operations

**Affected Chapters:**

- 06-discovery-engine.md
- 07-discovery-analytics.md
- 08-learning-engine.md
- 10-ai-platform.md
- 11-data-architecture.md
- 12-security-privacy-and-trust.md
- 13-business-model.md
- 15-product-roadmap.md
- 20-buyer-experience.md

**Implementation Impact:**

- Buyer registration
- Seller registration
- Buyer Discovery Profile
- Discovery Events
- Consent management
- Privacy notices
- Data retention
- Data deletion
- Buyer/Seller account controls
- Location processing
- AI processing
- Security controls
- Audit logging
- Third-party integrations

**Final Decision:**

TBD

**Decision Rationale:**

TBD

**Validation Result:**

TBD

---

## CL-002: Cookie, Tracking, and Consent Approach

**Status:** Open

**Question:**

What cookies, device technologies, analytics, tracking mechanisms,
and consent controls should PinkCurve use during Alpha?

**Why This Matters:**

PinkCurve's discovery experience depends on understanding interactions,
but PinkCurve should not collect information simply because it is
technically possible.

Tracking should have a defined purpose and should support Meaningful
Discovery, security, trust, analytics, learning, or necessary platform
operations.

The approach must comply with applicable U.S. federal and state
requirements and PinkCurve's privacy principles.

**Key Principle:**

> Collect and retain only information PinkCurve has a legitimate
> reason to use, explain its purpose clearly, protect it appropriately,
> and provide required Buyer controls.

**Work Required:**

- Inventory all cookies
- Inventory analytics technologies
- Inventory SDKs and third-party trackers
- Classify essential versus nonessential technologies
- Document the purpose of each
- Identify information collected by each
- Identify third parties receiving information
- Determine applicable notice requirements
- Determine applicable consent requirements
- Determine applicable opt-out requirements
- Determine treatment of advertising or cross-context tracking
- Determine treatment of device identifiers
- Determine treatment of location information
- Define retention periods
- Design Buyer privacy controls
- Implement consent/choice mechanisms where required
- Test controls on mobile and desktop
- Verify third-party behavior

**Evidence Required:**

- Tracking inventory completed
- Data purposes documented
- Third-party review completed
- Required notices implemented
- Required consent/choice controls implemented
- Opt-out behavior tested where applicable
- Mobile testing completed
- Desktop testing completed
- Analytics verified after privacy controls are applied

**Decision Needed By:**

The Alpha cookie, tracking, analytics, and consent architecture must
be decided before external Alpha.

Required notices and controls must be implemented and tested before
tracking affected Alpha Buyers.

**Decision Owner:**

Product / Security / Legal / Engineering

**Affected Chapters:**

- 06-discovery-engine.md
- 07-discovery-analytics.md
- 08-learning-engine.md
- 10-ai-platform.md
- 11-data-architecture.md
- 12-security-privacy-and-trust.md
- 20-buyer-experience.md

**Implementation Impact:**

- Web application
- Mobile experience
- Discovery Events
- Buyer Discovery Profile
- Analytics
- Learning Engine
- Consent records
- Privacy controls
- Third-party integrations

**Final Decision:**

TBD

**Decision Rationale:**

TBD

**Validation Result:**

TBD

---

# Operational and Governance Decisions

## OG-001: Risk Register Process

**Status:** Open

**Question:** How should PinkCurve maintain and review its ongoing Risk Register?

**Why This Matters:**

Risks identified in the Blueprint should not be forgotten after planning.

Risk management must become part of PinkCurve's operating discipline.

**Work Required:**

- Define Risk Register format
- Define risk categories
- Define severity and probability
- Define owners
- Define early-warning indicators
- Define review cadence
- Define escalation process

**Decision Needed By:**

Before regular PinkCurve operating reviews begin.

**Decision Owner:**

Operations / Leadership

**Final Decision:** TBD

**Decision Rationale:** TBD

**Validation Result:** TBD

---

## OG-002: Human-in-the-Loop Responsibilities

**Status:** Open

**Question:** Which PinkCurve decisions and operations must require human review rather than fully automated AI action?

**Potential Areas:**

- Seller approval
- Offering approval
- Fraud investigation
- Account suspension
- Appeals
- Customer support escalation
- AI quality assurance
- Financial operations
- Security incidents

**Work Required:**

- Classify decision risk
- Define AI assistance boundaries
- Define human approval authority
- Define audit requirements
- Define escalation procedures

**Decision Needed By:**

Initial responsibilities must be established before external Alpha operations.

**Decision Owner:**

Operations / Product / Security

**Final Decision:** TBD

**Decision Rationale:** TBD

**Validation Result:** TBD

---

## OG-003: Operational Controls and Separation of Responsibilities

**Status:** Open

**Question:** What controls should PinkCurve establish as the organization grows to protect financial, technical, intellectual-property, security, and administrative responsibilities?

**Why This Matters:**

PinkCurve should not depend solely on personal trust as the organization grows.

Appropriate governance should protect:

- Company assets
- Financial accounts
- Intellectual property
- Source code
- Production systems
- Seller and Buyer data
- Administrative privileges

**Work Required:**

- Define access controls
- Define financial approval controls
- Define administrative roles
- Define IP ownership requirements
- Define code and production permissions
- Define audit logging
- Define role changes and access removal procedures

**Decision Needed By:**

Controls should evolve before additional personnel receive significant financial, administrative, production, or intellectual-property authority.

**Decision Owner:**

Leadership / Operations / Security

**Final Decision:** TBD

**Decision Rationale:** TBD

**Validation Result:** TBD

---

# Process for Resolution

1. **Identify:** Clearly state the unresolved question.

2. **Prioritize:** Determine when the decision must be made.

3. **Research:** Gather technical, product, business, legal, operational, Buyer, or Seller information.

4. **Prototype or Experiment:** Test assumptions when evidence is required.

5. **Evaluate:** Compare alternatives against PinkCurve principles, risks, costs, and evidence.

6. **Decide:** Make the decision when sufficient evidence exists.

7. **Document:** Record the Final Decision and Decision Rationale.

8. **Update:** Modify all affected Blueprint chapters and permanent decision records.

9. **Implement:** Convert the decision into engineering, product, operational, or business work.

10. **Validate:** Measure whether the implemented decision produces the intended result.

11. **Revisit:** Reopen the decision when meaningful new evidence or circumstances justify reconsideration.

A decision is not complete simply because it has been marked **Decided**.

The decision must eventually be reflected in implementation and, where appropriate, validated through actual results.

---

# Decision History

Resolved, implemented, and validated decisions should remain traceable.

| ID | Decision | Outcome | Date | Permanent Record |
|----|----------|---------|------|------------------|
| TD-000 | Separate Blueprint repository | Separate repository adopted | Completed | [ADR-0001](../decisions/ADR-0001-separate-blueprint-repository.md) |

Additional decisions should be added as they are completed.

---

## Using Chapter 19 During Development

Chapter 19 should become an active document once PinkCurve moves from Blueprint planning into implementation.

Before beginning a major roadmap milestone:

1. Review the milestone in the Product Roadmap.
2. Identify Open Decisions that block the milestone.
3. Prioritize those decisions.
4. Perform the required research, prototypes, or experiments.
5. Make the decisions that must be made before implementation.
6. Update the affected Blueprint chapters.
7. Convert the decisions into implementation requirements.
8. Build and test.
9. Record validation results.
10. Revisit decisions when evidence requires it.

For Alpha, PinkCurve should prioritize decisions that directly affect the ability to test whether Meaningful Discovery works.

Later decisions should remain open until they become necessary or sufficient evidence exists.

---

## Guiding Principle

PinkCurve should neither rush important decisions nor postpone them until they block progress.

The objective is to make the **right decision at the right stage with the best evidence reasonably available**.

Open Decisions make uncertainty visible.

Experiments turn uncertainty into evidence.

Decisions turn evidence into direction.

Implementation turns direction into reality.

Validation determines whether the decision actually worked.

This discipline helps PinkCurve continue moving forward while remaining willing to learn and change.

---

## Related Documents

- [Design Principles](02-design-principles.md)
- [Product Architecture](03-product-architecture.md)
- [Discovery Engine](06-discovery-engine.md)
- [Discovery Analytics](07-discovery-analytics.md)
- [Learning Engine](08-learning-engine.md)
- [AI Platform](10-ai-platform.md)
- [Data Architecture](11-data-architecture.md)
- [Security, Privacy, and Trust](12-security-privacy-and-trust.md)
- [Business Model](13-business-model.md)
- [Success Metrics](14-success-metrics.md)
- [Product Roadmap](15-product-roadmap.md)
- [Competitive Positioning](16-competitive-positioning.md)
- [Long-Term Vision](17-long-term-vision.md)
- [Glossary](18-glossary.md)
- [Buyer Experience](20-buyer-experience.md)
- [Architecture Decision Records](../decisions/)