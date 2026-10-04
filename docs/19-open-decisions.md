# Open Decisions

## Document Status

| Field | Value |
|-------|-------|
| **Status** | Draft |
| **Version** | 0.3 |
| **Owner** | PinkCurve Product Team |
| **Last Reviewed** | 2026-09-30 |
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
- Qualified positive Buyer actions, including Qualified Offering Visits where applicable
- Brand Recognition measurement
- Fraud detection
- Trust
- Operational investigation

PinkCurve must also be able to reconstruct meaningful portions of a Buyer Discovery Journey.

**Core Event Information May Include:**

- Event ID
- Event type
- Timestamp
- Actor identity ID
- Actor type
- Buyer ID when the actor is or represents a Buyer, where applicable
- Delegation or authorization context where applicable
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
- Define Discovery Event actor identity and actor-type representation
- Define how direct human Buyer events remain distinguishable from
  agent-mediated or other automated events
- Define delegation and attribution requirements where applicable

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

## TD-005: AI Inference and Model Cost Strategy

**Status:** Tentative

**Question:**

How should PinkCurve select and use AI models and other computational
methods so that required quality, safety, trust, and latency are achieved
without unnecessary inference cost?

**Why This Matters:**

PinkCurve may eventually process large volumes of:

- Seller submissions
- Offering Knowledge
- Discovery requests
- Discovery Events
- Creative generation
- Verification and approval activity
- Buyer and Seller interactions
- Learning and analytical workloads

Using the most capable or expensive AI model for every operation would
create unnecessary cost and may make PinkCurve economically difficult
to scale.

At the same time, selecting computational methods based only on cost
could reduce Discovery quality, safety, trust, or reliability.

PinkCurve therefore needs an explicit strategy for choosing the least
expensive computational method that can satisfy the requirements of each
task.

**Core Principle:**

> PinkCurve should use the least expensive computational method that
> satisfies the required quality, safety, trust, reliability, and latency
> for the task.

Cost optimization must not override required safety, trust, or quality
thresholds.

**Method Selection Direction:**

AI models should not automatically be the default solution for every
PinkCurve capability.

Depending on the task, PinkCurve may use:

- Deterministic application logic
- Rules and heuristics
- Database queries
- Metadata filtering
- Search indexes
- Caching
- Embeddings
- Vector retrieval
- Traditional machine-learning models
- Ranking models
- Classifiers
- Smaller or lower-cost AI models
- Larger or more capable AI models
- Human review

The appropriate method depends on the requirements and risk of the
specific capability.

**Escalation Strategy:**

Where appropriate, PinkCurve should use progressive escalation rather
than immediately invoking the most expensive model or human process.

A conceptual escalation path may be:

```text
Deterministic checks
        ↓
Rules / heuristics
        ↓
Lower-cost model or classifier
        ↓
More capable model when uncertainty or complexity requires it
        ↓
Human review when risk or uncertainty justifies it
```

Not every workflow must use every level.

Capabilities should define the appropriate escalation path for their
own requirements.

**Precomputation and Reuse:**

PinkCurve should avoid repeatedly computing expensive intelligence that
can safely be derived once and reused.

For example, when an Offering is submitted or materially changed,
PinkCurve may perform appropriate processing such as:

```text
Offering submission
        ↓
Understand
        ↓
Classify
        ↓
Extract or validate metadata
        ↓
Generate embeddings
        ↓
Verify
        ↓
Store approved derived intelligence
```

The resulting intelligence may then be reused by Discovery and other
authorized capabilities until a change, expiration, confidence issue,
policy requirement, or other trigger requires recomputation.

This is particularly important for Offering Knowledge because the same
Offering may participate in many Buyer discovery interactions.

**Discovery Request Path:**

The high-volume Buyer Discovery path should avoid unnecessary LLM
inference where lower-cost methods can satisfy the requirement.

A conceptual request path may use:

```text
Buyer request / context
        ↓
Intent and context interpretation where required
        ↓
Candidate retrieval
        ↓
Metadata and policy filtering
        ↓
Ranking
        ↓
Feed composition
        ↓
Buyer experience
```

Embeddings, retrieval systems, metadata filters, learned ranking models,
rules, caches, and other efficient methods should perform high-volume
work where appropriate.

LLMs or other expensive models should be used when their reasoning,
language understanding, multimodal understanding, generation, or other
capabilities provide sufficient incremental value to justify their cost.

**Seller-Side Processing:**

Seller submission and approval workflows may tolerate somewhat more
processing latency than interactive Buyer Discovery.

This allows PinkCurve to perform more Offering understanding,
classification, verification, creative processing, and risk analysis
before an Offering participates in Discovery.

However, Real-Time Discovery introduces stronger latency requirements.

For Real-Time Offerings, PinkCurve should balance:

- Publication speed
- Verification quality
- Trust and safety
- AI processing cost
- Human review cost
- Offering lifetime
- Seller value

The model and workflow selected should reflect the risk and time
sensitivity of the Offering.

**Offline and Online Processing:**

Where practical, PinkCurve should separate expensive offline or
background intelligence from latency-sensitive online Discovery.

Examples of work that may be performed outside the Buyer request path
include:

- Offering classification
- Offering embeddings
- Metadata enrichment
- Creative analysis
- Verification analysis
- Risk scoring
- Seller intelligence
- Model training
- Aggregate analytics
- Learning Engine processing

Precomputed results may then support faster and less expensive online
Discovery.

**Caching and Reuse:**

PinkCurve should use caching where doing so does not create unacceptable
freshness, privacy, security, or correctness risks.

Caching strategy must respect:

- Offering changes
- Real-Time Offering expiration
- Availability changes
- Buyer privacy
- Authorization boundaries
- Trust decisions
- Policy changes
- Model-version changes where relevant

Real-Time Discovery must not continue serving stale cached information
after an Offering is no longer valid or available.

**Model Independence:**

PinkCurve capabilities should avoid unnecessary dependence on a single
AI model or provider where practical.

Capabilities should consume AI functionality through defined platform
interfaces rather than embedding provider-specific assumptions
throughout product logic.

This allows PinkCurve to evaluate models based on:

- Capability
- Quality
- Cost
- Latency
- Reliability
- Privacy
- Security
- Availability
- Operational requirements

Model selection may therefore change over time without requiring major
changes to consuming PinkCurve products.

**Cost Measurement:**

PinkCurve should measure AI and computational cost at meaningful
operational boundaries.

At minimum, PinkCurve should be able to estimate or measure:

- AI cost per Seller submission
- AI cost per Offering approval
- AI cost per creative-generation workflow
- AI cost per Buyer Discovery interaction
- AI cost per Real-Time Offering
- AI cost per Seller
- AI cost per Buyer where meaningful
- Human review cost
- Infrastructure cost associated with major AI workloads

Aggregate model-provider invoices alone are insufficient for
understanding PinkCurve unit economics.

**Quality and Cost Evaluation:**

Lower cost is useful only when required capability is preserved.

PinkCurve should evaluate model or method choices using both quality and
cost measures.

A lower-cost model may replace a more expensive model when evidence
shows that it satisfies the required task thresholds.

A more capable model may be justified when evidence shows meaningful
improvement in Discovery quality, safety, trust, operational efficiency,
or Seller/Buyer value.

**Work Required:**

- Define AI capability interfaces
- Define task-specific quality thresholds
- Define task-specific latency requirements
- Define task-specific safety and trust requirements
- Define model escalation rules
- Define fallback behavior
- Define precomputation strategy
- Define caching strategy
- Define model-routing strategy
- Define cost telemetry
- Define model-quality evaluation
- Define human-escalation criteria
- Define model/provider substitution requirements
- Define Real-Time Discovery latency and cost requirements
- Establish cost monitoring by major PinkCurve capability

**Evidence Required:**

- Model-quality evaluations
- Latency measurements
- AI inference cost
- Infrastructure cost
- Human review cost
- Failure and fallback rates
- Discovery-quality impact
- Seller workflow impact
- Buyer experience impact
- Real-Time Discovery publication latency
- Evidence that lower-cost alternatives satisfy required thresholds

**Decision Needed By:**

The basic cost-measurement, model-routing, and capability-interface
strategy should be established before Alpha implementation creates
unnecessary dependencies on specific expensive models or providers.

Exact model selections and routing thresholds may evolve continuously as
models, costs, workloads, and PinkCurve requirements change.

**Decision Owner:**

AI Platform / Engineering / Product / Operations

**Affected Chapters:**

- 03-product-architecture.md
- 04-offering-knowledge.md
- 05-creative-studio.md
- 06-discovery-engine.md
- 07-discovery-analytics.md
- 08-learning-engine.md
- 09-seller-intelligence.md
- 10-ai-platform.md
- 11-data-architecture.md
- 12-security-privacy-and-trust.md
- 13-business-model.md
- 14-success-metrics.md
- 15-product-roadmap.md

**Related Open Decisions:**

- TD-002: Embedding Strategy
- TD-004: AI and Machine Learning Infrastructure
- PD-007: Seller and Offering Approval Model
- PD-011: Real-Time Discovery Model

**Final Decision:**

TBD — PinkCurve will optimize AI and computational cost through
task-appropriate method selection, precomputation, reuse, routing, and
progressive escalation while preserving required quality, safety, trust,
reliability, and latency.

**Decision Rationale:**

PinkCurve's economic scalability depends not only on what AI can do but
on how efficiently AI is used.

High-volume operations should not repeatedly invoke expensive models
when equivalent or sufficient results can be produced through
precomputation, retrieval, deterministic processing, smaller models, or
other lower-cost methods.

Establishing these boundaries early reduces operating cost and avoids
architectural dependence on unnecessarily expensive inference while
preserving the ability to use more capable models where they create
meaningful additional value.

**Validation Result:**

TBD

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
- Timing and validity period where applicable
- Freshness where applicable
- Current availability or availability status where applicable
- Quantity or capacity where relevant
- Expiration conditions where applicable
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

Discovery Readiness requirements should depend on the Offering type,
lifecycle, and Discovery context.

PinkCurve should not require every Offering to satisfy every possible
Offering Knowledge dimension. Instead, each Offering should satisfy the
information, trust, validity, and operational requirements necessary for
its particular form of Discovery.

For time-sensitive and Real-Time Offerings, Discovery Readiness must also
reflect whether the Offering is still timely, valid, available, and
appropriate to present to a Buyer.

Additional blocking conditions may include:

- Discovery period has not yet started
- Discovery period has expired
- Seller has ended Discovery early
- Offering is no longer available
- Required location information is missing or invalid
- Required time or validity information is missing or invalid
- Required availability information is missing or stale
- Quantity or capacity has been exhausted where applicable
- PinkCurve has suspended the Offering because of trust, policy, safety,
  or operational concerns

A Real-Time Offering may therefore transition from Discovery Ready to
Not Discovery Ready without any change to its underlying descriptive
Completeness Score.

Freshness, validity, availability, and lifecycle state should be evaluated
as operational Discovery Readiness conditions rather than being treated
only as static completeness attributes.

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

## PD-003: Free Seller Tier Limits

**Status:** Open

**Question:** What limits should apply to PinkCurve's free Seller tier,
including the number of Offerings and qualified Buyer actions or
discoveries available before the Seller must upgrade or pause?

**Why This Matters:**

The free tier must provide enough value for Sellers to understand PinkCurve without creating unsustainable operating costs.

**Considerations:**

- Number of Offerings permitted in the free tier
- Number of qualified Buyer actions or discoveries included
- How free-tier usage is counted and tracked
- Seller notification as limits are approached
- Seller options when a limit is reached
- Pause behavior when the free-tier limit is reached
- Upgrade path to a paid tier
- Creative generation limits where applicable
- Seller analytics and insights available in the free tier
- AI and infrastructure costs
- Support costs
- Abuse-prevention controls

**Work Required:**

- Determine sustainable free-tier limits
- Measure actual operating costs
- Study early Seller usage and behavior
- Determine appropriate Offering limits
- Determine appropriate qualified Buyer action or discovery limits
- Define free-tier usage tracking
- Define Seller notifications and limit enforcement
- Test the upgrade and pause experience
- Measure Seller conversion from free to paid tiers

**Decision Needed By:**

Before paid Seller Beta or commercial launch.

**Decision Owner:**

Product / Business

**Final Decision:** TBD

**Decision Rationale:** TBD

**Validation Result:** TBD

---

## PD-004: Pre-Registration Buyer Discovery Experience

**Status:** Decided

**Question:** What should prospective Buyers be able to experience before registering for PinkCurve?

**Why This Matters:**

A new Buyer may want to understand PinkCurve's value before creating an account.

At the same time, the full discovery experience benefits from Buyer identity, preferences, continuity, trust, and learning.

**Final Direction:**

Buyer registration is required before a Buyer may participate in PinkCurve Discovery during MVP.

PinkCurve may provide public informational or demonstration content before registration, but this does not constitute participation in the Buyer Discovery experience.

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

**Final Decision:**

Buyer registration is required before participation in PinkCurve Discovery during MVP.

Public informational or demonstration content may be available before registration, but it does not constitute participation in the Buyer Discovery experience.

**Decision Rationale:**

Requiring registration establishes a known Buyer identity before Discovery participation and supports Buyer continuity, personalization, trust, learning, fraud prevention, and abuse prevention.

Public informational or demonstration content may still communicate PinkCurve's value without allowing unregistered participation in Discovery.

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

Buyer registration is required before participation in PinkCurve Discovery during MVP.

Public informational or demonstration content may be available before registration, but it does not constitute participation in the Buyer Discovery experience.

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
- Define pre-registration public informational or demonstration experience
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
- Define how AMN supports PinkCurve's visual-first discovery experience
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

**Question:**

What approval, reapproval, monitoring, and risk-proportional review process
should PinkCurve use for Sellers and Offerings?

**Why This Matters:**

Buyer trust depends heavily on preventing fake Sellers, fraudulent
Offerings, misleading destinations, unsafe or deceptive content, and
deteriorating Seller quality.

Approval should not be considered permanent.

At the same time, requiring the same approval process for every Seller
action or Offering submission could create unnecessary operational cost
and make time-sensitive Discovery impractical.

This is particularly important for Real-Time Discovery, where an
Offering may remain useful for only a few hours.

PinkCurve therefore needs an approval model that preserves required
trust and safety while adjusting review effort according to risk,
uncertainty, Seller history, and material change.

**Core Principle:**

> Approval rigor should be proportional to risk, uncertainty, and
> material change—not simply whether a submission is new.

Risk-proportional approval does not mean lowering PinkCurve's trust
standards.

It means using the appropriate verification and review process for the
risk presented by the Seller, Offering, change, and context.

**Seller and Offering Approval Separation:**

Seller approval and Offering approval are separate trust decisions.

Approval of a Seller does not automatically approve every Offering
submitted by that Seller.

However, verified Seller identity, history, behavior, previous approval
results, and risk profile may become inputs to the review process for
subsequent Offerings.

**Initial Seller Approval:**

A new Seller should receive appropriate verification and approval before
participating in Discovery.

The approval process should evaluate factors such as:

- Seller identity
- Seller legitimacy
- Required business information
- Ownership and authorized actors
- Destination legitimacy
- Relevant policy requirements
- Fraud indicators
- Risk indicators
- Other verification requirements defined by PinkCurve

Higher-risk or uncertain cases should receive additional review.

**Initial Offering Approval:**

A new Offering should be evaluated before participating in Discovery.

The review should determine, where applicable:

- Whether the Offering complies with PinkCurve policy
- Whether required Offering Knowledge is present
- Whether Seller-provided claims are sufficiently supported
- Whether media is appropriate and consistent with the Offering
- Whether destination information is legitimate
- Whether location information is credible
- Whether time and availability information is internally consistent
- Whether the Offering presents fraud, safety, trust, or regulatory risk
- Whether additional human review is required

**Material Change Principle:**

PinkCurve should distinguish between routine changes and material
changes.

Examples of potentially material changes may include:

- Destination URL changes
- Seller identity changes
- Seller ownership changes
- Significant Offering-category changes
- Location changes
- Material changes to Offering claims
- Changes affecting legal or regulatory treatment
- Changes affecting trust or safety
- Changes to previously verified information

Material changes may require reverification or additional approval before
the changed Offering participates in Discovery.

Routine changes may qualify for a faster review path when risk remains
low.

**Real-Time Offering Approval:**

Real-Time Discovery requires an approval process capable of operating
within the useful lifetime of the Offering.

For example, a previously verified restaurant publishing a lunch special
for the next several hours may present a different approval problem from
a new Seller submitting its first Offering.

Where appropriate, PinkCurve should consider factors such as:

- Seller verification status
- Seller approval history
- Seller violation history
- Offering category
- Whether the Offering is new or a variation of an approved Offering
- Whether Seller identity changed
- Whether location changed
- Whether destination URL changed
- Whether important factual claims changed
- Whether Seller-provided media is new
- Whether the Offering is unusually high risk
- AI review confidence
- Fraud and anomaly signals

A verified Seller with a strong history submitting a low-risk,
time-sensitive Offering with no material changes to trusted identity,
location, or destination information may qualify for a faster approval
path.

A faster path does not eliminate required checks.

**Risk-Proportional Review:**

PinkCurve should use progressive review where appropriate.

A conceptual review path may be:

```text id="90tjjr"
Deterministic verification and policy checks
        ↓
AI-assisted classification and risk analysis
        ↓
Additional AI analysis when uncertainty requires it
        ↓
Human review when risk, uncertainty, or policy requires it
        ↓
Approval / rejection / suspension
```

Not every submission must pass through every stage.

Review depth should depend on the risk and uncertainty associated with
the specific Seller, Offering, or change.

**Approval Checklists and Audit Evidence:**

PinkCurve should define an explicit approval checklist for each approval,
verification, or reverification service where appropriate.

Examples may include:

- Seller approval
- Offering approval
- Real-Time Offering approval
- Destination URL verification and reverification
- Seller ownership change
- Seller account recovery
- Material Offering change
- Other trust-sensitive approval workflows

Each checklist should define the checks required for that particular
service.

Individual checklist items should identify the required review method,
which may include:

- Deterministic system check
- AI-assisted review
- Human review required
- Human approval required
- Conditional escalation based on risk or uncertainty

A checklist may combine multiple review methods.

For example, AI may perform an initial evaluation while a particular
check still requires explicit human approval before the overall approval
can be completed.

Checklist requirements should be determined by the risk and trust
requirements of the service rather than by a general assumption that
all checks can be automated.

**Checklist Versioning:**

Approval checklists should be versioned.

PinkCurve should be able to determine which checklist and checklist
version governed a particular approval decision.

Changes to approval requirements should create a new checklist version
rather than silently changing the historical meaning of previous
approval records.

**Executed Checklist Record:**

PinkCurve should retain an auditable record of the checklist executed
for an approval decision.

Where applicable, the record should capture:

- Approval or review identifier
- Seller identifier
- Offering identifier where applicable
- Approval service or workflow type
- Checklist identifier
- Checklist version
- Checklist items executed
- Result of each check
- Review method used for each check
- Evidence or evidence references
- AI model or automated capability used where relevant
- Confidence or risk result where relevant
- Human reviewer where required
- Human approver where required
- Escalations
- Exceptions
- Submission timestamp
- Review timestamps
- Final decision
- Decision timestamp
- Reason for rejection, suspension, or escalation where applicable

Sensitive information should be retained and accessed according to
PinkCurve privacy, security, retention, and access-control requirements.

**Audit Principle:**

> PinkCurve should be able to reconstruct how a trust-sensitive approval
> decision was made.

The audit record should support:

- Fraud investigation
- Scam investigation
- Security incidents
- Buyer complaints
- Seller disputes and appeals
- Internal quality review
- Approval-process improvement
- AI evaluation
- Human-review evaluation
- Compliance and legal review where required

**Approval Completion:**

An approval should not be considered complete until all mandatory
checklist requirements for the applicable checklist version have been
satisfied.

A required human-approval item must not be bypassed merely because AI
produces a high-confidence result.

Similarly, a failed or uncertain automated check should follow the
escalation rules defined by the checklist rather than being silently
ignored.

**Checklist Evolution:**

Approval checklists should improve as PinkCurve learns from:

- Fraud attempts
- Scams
- Security incidents
- False positives
- False negatives
- Buyer reports
- Seller disputes
- Human reviewer findings
- AI evaluation results
- Operational experience
- Changes in PinkCurve policy
- Changes in legal or regulatory requirements

When a new fraud or scam pattern is discovered, PinkCurve should
evaluate whether the relevant approval checklist, monitoring controls,
or both should be updated.

**Human Review:**

Human review remains an important PinkCurve trust control.

Human reviewers should focus especially on:

- Uncertain cases
- Higher-risk Sellers or Offerings
- Material changes
- Conflicting evidence
- Suspected fraud
- Policy ambiguity
- Appeals
- Cases where automated systems cannot reach sufficient confidence

The objective of AI-assisted review is not necessarily to eliminate
human review.

The objective is to allow human attention to be concentrated where it
provides the greatest trust and risk-reduction value.

**Destination URL Integrity:**

PinkCurve should define and enforce destination controls including:

- Destination legitimacy
- URL integrity
- Redirect behavior
- Change detection
- Reverification after material URL changes
- Detection of suspicious redirect behavior
- Phishing and malicious destination detection
- Mobile destination quality requirements where applicable

A previously approved Offering should not remain trusted automatically
after its destination materially changes.

**Continuous Monitoring:**

Approval is not permanent.

PinkCurve should continuously monitor and risk-assess Sellers,
Offerings, and destination URLs where appropriate.

Monitoring should look for conditions such as:

- Seller fraud
- Compromised Seller accounts
- Malicious redirects
- Destination changes after approval
- Previously legitimate destinations becoming malicious
- Phishing
- Offering-policy violations
- Suspicious Seller behavior
- Repeated Buyer complaints
- Material Offering changes
- Other trust or abuse signals

Detected risk may trigger:

- Additional verification
- Reapproval
- Temporary suspension
- Offering removal
- Seller restriction
- Human review
- Other appropriate protective action

**Reverification Triggers:**

PinkCurve should define explicit triggers for Seller and Offering
reverification.

Potential triggers include:

- Seller identity changes
- Ownership changes
- Destination URL changes
- Material Offering changes
- Significant location changes
- Suspicious behavior
- Fraud signals
- Security incidents
- Buyer reports
- Policy changes
- Extended inactivity where appropriate
- Changes in legal or regulatory requirements

**Approval Latency:**

Approval latency is a product and operational requirement, not only an
internal operations metric.

PinkCurve should measure:

```text id="ld9j0y"
Approval latency =
publication approval time - submission time
```

Acceptable latency may differ by Offering type and risk.

Real-Time Offerings require especially careful latency measurement
because excessive approval time may eliminate the value of the Offering
before Discovery begins.

**Approval Cost:**

PinkCurve should measure the complete cost of approval.

A conceptual measure is:

```text id="s12b30"
Approval Cost per Published Offering =
AI processing cost
+ human review cost
+ attributable verification and operational cost
```

Approval cost should be measured separately for different review paths
so PinkCurve can determine whether risk-proportional review reduces cost
without weakening trust.

**Work Required:**

- Define Seller approval checklist
- Define Offering approval checklist
- Define Real-Time Offering approval requirements
- Define routine versus material changes
- Define risk classification
- Define fast-path eligibility
- Define destination URL legitimacy, integrity, redirect,
  change-detection, and reverification checks
- Define mobile destination quality requirements
- Define AI-assisted review
- Define AI review confidence thresholds
- Define risk-proportional human review and approval responsibilities
- Define human escalation criteria
- Define reverification triggers
- Define continuous monitoring and risk-based reapproval triggers for
  Sellers, Offerings, and destination URLs
- Define approval latency requirements
- Define approval-cost measurement
- Define suspension and appeal process
- Define approval-service-specific checklists
- Define checklist versioning and change control
- Define executed-checklist audit records and retention

**Evidence Required:**

- Alpha approval workload
- Approval latency
- Approval cost per published Offering
- AI processing cost
- Human review rate
- Human review time
- Fast-path approval rate
- Escalation rate
- False-positive rate
- False-negative findings where measurable
- Fraud detection results
- Buyer reports
- Seller support cases
- Real-Time Offering expiration before or shortly after approval
- Trust incidents associated with different approval paths

**Decision Needed By:**

Initial approval requirements must be established before external Sellers
enter Alpha.

The minimum Real-Time Offering approval path must be established before
Real-Time Discovery is tested with external Sellers.

Approval thresholds and escalation rules may be refined during Alpha and
Beta using operational evidence.

**Decision Owner:**

Trust / Product / Operations / AI Platform

**Affected Chapters:**

- 04-offering-knowledge.md
- 05-creative-studio.md
- 06-discovery-engine.md
- 07-discovery-analytics.md
- 09-seller-intelligence.md
- 10-ai-platform.md
- 11-data-architecture.md
- 12-security-privacy-and-trust.md
- 14-success-metrics.md
- 15-product-roadmap.md
- Seller Experience documentation

**Related Open Decisions:**

- TD-005: AI Inference and Model Cost Strategy
- PD-001: Offering Knowledge Completeness and Discovery Readiness
- PD-009: Adult-Only and Age-Restricted Offering Policy
- PD-011: Real-Time Discovery Model
- PD-012: Real-Time Discovery Pricing Model

**Final Decision:**

TBD — PinkCurve will use risk-proportional Seller and Offering approval
with continuous monitoring, while specific approval thresholds,
fast-path eligibility rules, and escalation criteria remain to be
validated.

**Decision Rationale:**

PinkCurve requires strong Seller and Offering trust controls, but
applying maximum review effort to every submission would create
unnecessary cost and may make time-sensitive Discovery impractical.

Risk-proportional approval allows PinkCurve to preserve required trust
standards while concentrating AI and human review resources on material,
uncertain, or higher-risk cases.

This approach is particularly important for Real-Time Discovery, where
approval must be sufficiently fast for the Offering to remain useful.

**Validation Result:**

TBD

---

## PD-008: Buyer Minimum Age and Teen Experience

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

## PD-009: Adult-Only and Age-Restricted Offering Policy

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

PinkCurve should continuously monitor and risk-assess approved Offerings
and Seller destinations, with reevaluation triggered when appropriate, to identify:

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

- PD-008: Buyer Minimum Age and Teen Experience
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

## PD-010: Delegated Buyer Agent Access

**Status:** Tentative

**Question:**

Should PinkCurve eventually allow an AI agent or other automated system
to participate in Discovery on behalf of an authorized Buyer, and if so,
under what identity, authorization, security, discovery, learning, and
commercial rules?

**Why This Matters:**

PinkCurve's MVP requires Buyer registration before participation in
Discovery.

This remains the correct MVP direction.

However, AI agents may increasingly act on behalf of people by helping
them discover products, services, events, opportunities, and other
useful resources.

PinkCurve should therefore distinguish legitimate delegated Buyer agents
from unauthorized automated traffic rather than treating all automated
access as equivalent.

The architectural distinction may become important even if delegated
Buyer agents are not permitted during MVP.

**Actor Distinction:**

PinkCurve should distinguish among at least:

- Registered Human Buyer
- Unauthorized bot or automated traffic
- Crawler or indexer governed by PinkCurve policy
- Authorized Delegated Buyer Agent
- Seller Agent
- PinkCurve Internal Agent

These actors may require different identities, permissions, capabilities,
rate limits, trust controls, data-access boundaries, and Discovery
policies.

**Tentative Direction:**

Registered Human Buyers remain the only Buyer actors permitted to
participate directly in PinkCurve Discovery during MVP.

Unauthorized bots and automated traffic should remain blocked or
restricted according to PinkCurve security and abuse-prevention policy.

Crawler and indexer access, if permitted, should be explicitly governed
by PinkCurve policy.

Authorized Delegated Buyer Agents are a possible future Discovery
channel but are outside MVP scope.

PinkCurve should preserve architectural boundaries that allow this
future capability to be evaluated without requiring fundamental redesign
of Buyer identity, authorization, Discovery Events, Offering Knowledge,
Learning Engine signals, or Seller value measurement.

An authorized Delegated Buyer Agent should not automatically receive all
capabilities available to the human Buyer it represents.

Agent permissions should be explicitly defined and limited.

PinkCurve Discovery should remain focused on helping Buyers discover
worthwhile Offerings.

Allowing delegated agents in the future would not by itself change
PinkCurve into an autonomous purchasing or transaction platform.

**Potential Future Discovery Flow:**

```text
Seller
   ↓
PinkCurve
   ↓
Authorized Delegated Buyer Agent
   ↓
Human Buyer
   ↓
Seller
```

The human Buyer remains the beneficiary of Discovery.

**Work Required:**

- Define Delegated Buyer Agent identity
- Define Buyer authorization and revocation
- Define agent authentication
- Define agent capabilities and permission boundaries
- Define rate limits and abuse controls
- Define data-access boundaries
- Define privacy and consent requirements
- Define Discovery Event attribution
- Separate agent-mediated signals from direct human Buyer signals
- Determine how agent-mediated signals may be used by the Learning Engine
- Determine what Offering Knowledge agents may access
- Determine Seller visibility into agent-mediated Discovery
- Determine whether agent-referred Seller value requires a distinct
  measurement or billing model
- Define monitoring, audit, suspension, and incident-response requirements
- Evaluate emerging agent protocols and industry standards before
  implementation

**Evidence Required:**

- Buyer demand for delegated-agent discovery
- Seller acceptance
- Security and fraud assessment
- Privacy assessment
- Agent ecosystem maturity
- Relevant technical standards
- Evidence that delegated-agent access improves Meaningful Discovery
- Operational-cost assessment
- Business-model impact
- Evidence that agent-mediated signals can be interpreted without
  degrading human Buyer learning

**Decision Trigger:**

PinkCurve should formally reconsider Delegated Buyer Agent access when
one or more of the following becomes material:

- Buyers increasingly use personal AI agents for discovery
- Major AI platforms establish practical delegated-agent standards
- Sellers expect discovery platforms to support agent-mediated demand
- Agent-mediated discovery becomes competitively important
- PinkCurve receives meaningful Buyer or Seller demand for such access
- PinkCurve can establish sufficiently strong identity, authorization,
  security, privacy, trust, and abuse controls

**Decision Needed By:**

No final decision is required for MVP.

Architectural boundaries required to avoid expensive future redesign
should be established before Alpha implementation creates dependencies
that assume every Discovery actor must always be a human Buyer.

**Decision Owner:**

Product / AI Platform / Security / Trust

**Affected Chapters:**

- 03-product-architecture.md
- 04-offering-knowledge.md
- 06-discovery-engine.md
- 07-discovery-analytics.md
- 08-learning-engine.md
- 09-seller-intelligence.md
- 10-ai-platform.md
- 11-data-architecture.md
- 12-security-privacy-and-trust.md
- 13-business-model.md
- 14-success-metrics.md
- 15-product-roadmap.md
- 16-competitive-positioning.md
- 20-buyer-experience.md

**Final Decision:**

TBD — Delegated Buyer Agents are outside MVP scope.

**Decision Rationale:**

Human-first Discovery provides the clearest and safest MVP environment
for validating PinkCurve's fundamental Meaningful Discovery hypothesis.

At the same time, preserving explicit actor, identity, authorization,
event-attribution, and signal boundaries now reduces the risk of
expensive architectural redesign if delegated Buyer agents become an
important future Discovery channel.

**Validation Result:**

TBD

---

## PD-011: Real-Time Discovery Model

**Status:** Tentative

**Question:**

How should PinkCurve support Real-Time Discovery of worthwhile Offerings
whose value depends strongly on location, availability, freshness, or time?

**Why This Matters:**

Many worthwhile Offerings have a short useful lifetime.

Examples may include:

- Restaurant specials
- New or limited menu items
- Excess food or inventory
- Flash discounts
- Free products or services
- Last-minute appointments
- Local events
- Community giveaways
- Public announcements
- Time-sensitive community resources
- Other temporary or rapidly changing opportunities

These Offerings may lose much or all of their value if Buyers discover
them too late.

The information may exist on Seller websites, social media, signs,
messages, or other fragmented channels, but Buyers often do not know
that the Offering exists and therefore may not know to search for it.

PinkCurve has an opportunity to help close this discovery gap.

**Core Principle:**

> Real-Time Discovery should help relevant Buyers discover worthwhile
> Offerings while those Offerings are still useful.

The objective is not simply to publish information quickly.

The objective is to connect timely, trustworthy Offering information
with appropriate Buyers before the opportunity expires.

**MVP Direction:**

Real-Time Discovery should be included in PinkCurve MVP.

The MVP should test whether PinkCurve can support a simple flow such as:

```text
Something worthwhile becomes available
        ↓
Seller submits the Offering quickly
        ↓
PinkCurve understands and verifies the Offering
        ↓
Discovery media is prepared or accepted
        ↓
Seller approves where required
        ↓
Offering becomes discoverable
        ↓
Relevant Buyers discover it
        ↓
Buyer may take a positive action
        ↓
Offering expires or is ended
```

Real-Time Discovery should not require the same creative complexity as
long-lived Offering discovery.

Speed, truth, locality, relevance, freshness, trust, and cost efficiency
are more important than creative sophistication for short-lived
Offerings.

**Seller Submission Direction:**

PinkCurve should make Real-Time Offering submission simple enough to be
practical from a mobile device.

A Seller may provide information such as:

- Photo or approved visual asset
- Short description
- Price or discount where applicable
- Availability or quantity where applicable
- Location
- Valid-from time
- Valid-until or expiration time
- Destination or contact action where applicable

PinkCurve may use Creative Studio capabilities to transform Seller-
provided information into clear visual discovery media.

A possible workflow is:

```text
Seller phone
    ↓
Photo + essential Offering facts
    ↓
PinkCurve-generated visual presentation
    ↓
Seller approval
    ↓
Verification / approval
    ↓
Publish
    ↓
Real-Time Discovery
    ↓
Automatic expiration or Seller termination
```

**Truth and Presentation Principle:**

> Seller supplies truth. PinkCurve supplies presentation.

PinkCurve should not invent factual characteristics of an Offering merely
to make discovery media more attractive.

For example, PinkCurve should not generate an image depicting a specific
food item, product, condition, quantity, or other factual characteristic
as though it were the actual Offering when the Seller has not supplied
or verified that information.

Where appropriate, PinkCurve may create typography, layout, graphics,
branding, or other presentation elements around verified Seller-
provided content.

An existing Seller poster or other approved media may also be used
directly where appropriate.

**Media Richness Principle:**

> The richness of discovery media should be proportional to the lifetime,
> purpose, and expected value of the Offering.

Short-lived Offerings should generally favor inexpensive, fast visual
presentation.

Longer-lived Offerings may justify richer creative development,
including more sophisticated graphics, storytelling, or video.

Visual-first does not mean video-only.

**Freshness and Lifecycle:**

Freshness should be treated as a first-class property of Real-Time
Offerings.

PinkCurve should be able to understand and enforce, where applicable:

- When an Offering becomes valid
- When it expires
- Whether availability remains current
- Whether the Seller ended it early
- Whether quantity or availability changed
- Whether the Offering should remain discoverable
- Whether stale information must be removed from active Discovery

Real-Time Offerings should automatically stop participating in active
Discovery when their validity period ends.

Sellers should be able to end Discovery earlier when the Offering is no
longer available.

**Discovery Period:**

A Real-Time Offering has a defined Discovery period during which it is
eligible for active distribution to relevant Buyers.

The Discovery period may begin immediately or at a defined future time
and ends when:

- The defined expiration time is reached
- The Seller ends Discovery early
- The Offering is no longer available
- PinkCurve suspends or removes the Offering for trust, policy, or
  operational reasons

The Discovery period is part of the value delivered to the Seller and
may therefore become an input to the Real-Time Discovery pricing model.

However, duration alone should not be assumed to determine price.

Pricing should be evaluated together with qualified Buyer reach,
Seller-controlled budget, targeting or discovery context, PinkCurve
operating cost, and demonstrated Seller value.

### Real-Time Discovery Timing

For MVP, Sellers should submit a Real-Time Offering at least 30 minutes
before the requested Discovery start time.

The 30-minute advance-submission period gives PinkCurve time to perform
required automated checks, AI-assisted review, human review where
required, and other approval processes.

The 30-minute period is an advance-submission requirement and does not
represent a guaranteed approval or publication time.

A Real-Time Offering cannot begin active Discovery until all required
approval requirements have been completed.

A Seller may specify a requested Discovery start time, but the actual
Discovery start time is:

Actual Discovery Start Time =
later of (Requested Discovery Start Time, Approval Time)

For MVP, a Real-Time Offering should have at least three hours of usable
Discovery time after the Actual Discovery Start Time.

PinkCurve should calculate:

Remaining Usable Discovery Period =
Discovery End Time - Actual Discovery Start Time

The Seller should be informed of this timing policy before submission.
By submitting the Real-Time Offering, the Seller accepts the timing
policy. PinkCurve should not require another Seller approval merely
because approval delay changes the Actual Discovery Start Time.

Where the Offering's stated availability permits it, PinkCurve may
automatically adjust the Discovery End Time according to the disclosed
timing policy so that the three-hour minimum usable Discovery period is
preserved.

PinkCurve must not automatically extend Discovery beyond a hard
real-world expiration or availability deadline specified by the Seller.

If a hard expiration or availability deadline leaves fewer than three
hours of usable Discovery time after approval, the Offering is not
eligible for Real-Time Discovery under the MVP three-hour minimum rule.

The Seller submission experience should clearly communicate:

- Submit at least 30 minutes before the requested Discovery start time
- Approval and publication time are not guaranteed
- Discovery cannot begin before required approval is completed
- Approval delay may change the Actual Discovery Start Time
- PinkCurve may automatically adjust the Discovery period according to
  the disclosed timing policy where the Offering's availability permits
- At least three hours of usable Discovery time is required for MVP
- A hard real-world expiration or availability deadline will not be
  automatically extended

The 30-minute advance-submission requirement and three-hour minimum usable
Discovery period are MVP operating assumptions and should be validated
using actual approval latency, Buyer response, Seller experience, and
Real-Time Discovery performance.

**Offering Knowledge Boundary:**

Real-Time discovery media is presentation.

It should not become the authoritative source of Offering truth.

The underlying Offering Knowledge should remain the structured source
for facts such as:

- Seller identity
- Offering identity
- Offering type
- Location
- Price or cost where applicable
- Availability where applicable
- Valid-from time
- Valid-until time
- Destination information
- Media provenance
- Verification status
- Approval status
- Other Offering-type-specific knowledge

This separation allows PinkCurve to change presentation without changing
the underlying truth about the Offering.

**Approval Direction:**

Real-Time Discovery must not eliminate PinkCurve's trust and approval
requirements merely because an Offering is short-lived.

However, applying the same review process to every Offering may make
Real-Time Discovery too slow or too expensive.

PinkCurve should therefore investigate risk-proportional approval.

Potential factors include:

- Seller verification status
- Seller history
- Offering category
- Whether the Offering is new or a variation of an existing Offering
- Whether location changed
- Whether destination URL changed
- Whether the Seller-provided media is new
- Whether important factual claims changed
- AI review confidence
- Fraud or policy risk
- Previous Seller violations

Trusted Sellers publishing low-risk Real-Time Offerings may eventually
qualify for faster approval paths while uncertain or higher-risk
Offerings receive additional AI or human review.

Human review should remain available where risk or uncertainty justifies
it.

**Cost-Efficiency Direction:**

Real-Time Discovery must be economically practical for both PinkCurve
and Sellers.

PinkCurve should use the least expensive computational method that
satisfies required quality, safety, trust, and latency.

Expensive AI models should not automatically be used for every step.

Where appropriate, processing may escalate through:

```text
Deterministic checks
        ↓
Low-cost model or classifier
        ↓
More capable model when needed
        ↓
Human review when necessary
```

Expensive Offering understanding should be computed once where practical
and reused across subsequent Buyer discovery interactions.

Real-Time Discovery should avoid unnecessary LLM use in high-volume
Buyer request paths where retrieval, metadata filtering, embeddings,
ranking models, rules, caching, or other lower-cost methods can satisfy
the requirement.

**Measurement Requirements:**

The MVP should measure at least:

- Seller submission-to-publication time
- Approval latency
- AI approval cost
- Human review time and cost
- Total approval cost per published Real-Time Offering
- Real-Time Offering lifetime
- Qualified Buyer reach
- Buyer interactions
- Qualified positive Buyer actions
- Qualified Offering Visits where applicable
- Time to first meaningful Buyer response
- Seller early termination because availability ended
- Automatic expiration
- Buyer reports
- Trust and fraud incidents
- Seller repeat use
- Seller-perceived value

Qualified Offering Visits remain useful measurements for Real-Time
Discovery even if they are not the primary billing unit.

**Work Required:**

- Define Real-Time Offering eligibility
- Define minimum required Offering Knowledge
- Define Real-Time Offering lifecycle
- Define freshness and expiration semantics
- Define Seller mobile submission experience
- Define Creative Studio quick-presentation workflow
- Define Seller approval requirements
- Define risk-proportional PinkCurve approval
- Define automatic expiration
- Define Seller early termination
- Define availability-update behavior
- Define Discovery Engine freshness and locality treatment
- Define Discovery Events
- Define Real-Time Discovery analytics
- Define trust and fraud controls
- Define AI cost controls
- Define operational review workflow
- Define MVP Real-Time Discovery test scenarios
- Define Seller and Buyer success measures

**Evidence Required:**

- Seller ability to submit Real-Time Offerings quickly
- Acceptable submission-to-publication latency
- Acceptable approval cost
- Reliable expiration and freshness handling
- Buyer discovery of Offerings before they lose usefulness
- Buyer response
- Seller-perceived value
- Seller repeat use
- Trust and fraud results
- Operating-cost evidence
- Evidence that Real-Time Discovery contributes to Meaningful Discovery

**Decision Needed By:**

The minimum Real-Time Discovery model must be defined before MVP scope
and implementation are finalized.

Detailed operational processes, approval thresholds, AI model choices,
and commercial pricing may continue to evolve through Alpha, Beta, and
real-world evidence.

**Decision Owner:**

Product / Discovery / Seller Experience / Trust / Operations

**Affected Chapters:**

- 02-design-principles.md
- 03-product-architecture.md
- 04-offering-knowledge.md
- 05-creative-studio.md
- 06-discovery-engine.md
- 07-discovery-analytics.md
- 08-learning-engine.md
- 09-seller-intelligence.md
- 10-ai-platform.md
- 11-data-architecture.md
- 12-security-privacy-and-trust.md
- 13-business-model.md
- 14-success-metrics.md
- 15-product-roadmap.md
- 16-competitive-positioning.md
- 20-buyer-experience.md
- Seller Experience documentation

**Related Open Decisions:**

- PD-001: Offering Knowledge Completeness and Discovery Readiness
- PD-007: Seller and Offering Approval Model
- BD-001: Standard Discovery Qualified Buyer Action Pricing Validation
- AV-001: Alpha Scope
- AV-002: Alpha Success Criteria
- PD-012: Real-Time Discovery Pricing Model

**Final Decision:**

TBD — Real-Time Discovery is included in MVP direction, while detailed
implementation, approval, measurement, and commercial rules remain to
be validated.

**Decision Rationale:**

Many worthwhile Offerings are useful only within a limited time,
location, or availability window.

Traditional search and fragmented information channels may fail to
connect these Offerings with relevant Buyers before their value
disappears.

Including Real-Time Discovery in MVP allows PinkCurve to test whether
its visual, knowledge-driven, trustworthy discovery model can create
meaningful value in situations where freshness and timing are essential.

**Validation Result:**

TBD

---

## PD-012: Real-Time Discovery Pricing Model

**Status:** Tentative

**Question:**

What billing unit and unit price should PinkCurve use for Real-Time
Discovery while keeping Seller pricing simple, understandable, and
economically sustainable?

PinkCurve intends to keep Real-Time Discovery pricing simple and
understandable for Sellers.

**Tentative Direction:**

**Why This Matters:**

Real-Time Discovery creates a different form of Seller value from
Standard Discovery.

Its purpose is to help relevant Buyers discover a time-sensitive
Offering while the Offering is still useful, available, and actionable.

Qualified Offering Visits and other Buyer actions should still be
measured, but they may not be the appropriate primary billing unit for
Real-Time Discovery.

PinkCurve therefore needs a pricing model that is simple for Sellers to
understand, reflects measurable value, supports Seller-controlled
spending, and can remain economically sustainable as Real-Time Discovery
usage grows.

The current direction is a unit-based pricing model using a consistent
unit price across the United States rather than different prices by
industry, Offering type, Seller size, or geography.

The specific billable unit and unit price remain to be validated.

PinkCurve should initially evaluate pricing economics using a major
Real-Time Discovery Buyer use case with sufficient potential Buyer demand
to provide meaningful evidence. This provides a practical baseline for
understanding Seller value, PinkCurve operating cost, Buyer response, and
sustainable unit economics before introducing unnecessary pricing
complexity.

The pricing model should allow Sellers to estimate their expected cost
using a simple relationship:

Seller Cost = Billable Real-Time Discovery Units × Unit Price

Where Seller-controlled spending limits are supported, the Seller may
also define a maximum amount PinkCurve is permitted to spend for the
Real-Time Discovery activity.

A nationally consistent unit price does not imply uniform Discovery
distribution. Discovery relevance, ranking, geographic applicability,
freshness, availability, and Buyer context remain responsibilities of the
Discovery Engine and are independent of pricing.

The MVP should collect evidence needed to determine and validate the
appropriate unit definition and unit price, including Buyer response,
Seller value, Seller willingness to pay, operating cost, fraud and invalid
traffic, and repeat Seller usage.

PinkCurve should prefer pricing simplicity unless market evidence later
demonstrates that additional pricing differentiation creates sufficient
Seller or platform value to justify the added complexity.

**Work Required:**

- Define the candidate billable Real-Time Discovery unit.
- Define qualification, deduplication, fraud, and invalid-traffic rules for that unit.
- Determine an initial unit price for MVP validation.
- Define Seller-controlled spending limits and related notifications.
- Measure Real-Time Discovery operating cost, including approval, AI, infrastructure, and monitoring costs.
- Measure Buyer response and meaningful Buyer actions, including Qualified Offering Visits where applicable.
- Measure Seller-perceived value, willingness to pay, and repeat Real-Time Discovery usage.
- Validate whether a nationally consistent unit price remains practical across representative Real-Time Discovery use cases.
- Validate whether the pricing model can remain simple for Sellers while supporting sustainable PinkCurve unit economics.

**Evidence Required:**

- Buyer response to representative Real-Time Discovery Offerings
- Qualified Real-Time Discovery unit volume under candidate definitions
- Qualified positive Buyer actions and Qualified Offering Visits where applicable
- Seller-perceived value of Real-Time Discovery
- Seller willingness to pay through actual or simulated pricing tests
- Seller repeat usage and retention
- Seller spending behavior under defined budget limits
- Approval and publication cost per Real-Time Offering
- AI, infrastructure, monitoring, and operational cost attributable to Real-Time Discovery
- Cost per candidate billable Real-Time Discovery unit
- Revenue potential per candidate billable unit
- Fraud, invalid-traffic, duplicate, and measurement-error rates
- Evidence from representative Real-Time Discovery use cases sufficient to evaluate whether nationally consistent unit pricing remains practical

**Decision Needed By:**

Before production Real-Time Discovery charging begins.

Alpha may measure and simulate candidate billing units and pricing without
charging Sellers.

The final MVP pricing decision should use evidence from Alpha and, where
necessary, controlled Beta validation rather than assuming the initial
pricing hypothesis is correct.

**Owner:**

Product / Business Model / Discovery Analytics / Seller Experience / Finance

**Related Open Decisions:**

- PD-007: Seller and Offering Approval Model
- PD-011: Real-Time Discovery Model
- BD-001: Standard Discovery Qualified Buyer Action Pricing Validation
- BD-003: Payment Processing and Seller Billing
- AV-001: Alpha Scope
- AV-002: Alpha Success Criteria
- AV-003: Test Data Strategy
- H-007: Real-Time Discovery Validity

**Final Decision:**

TBD — PinkCurve currently intends to use a simple unit-based pricing
model for Real-Time Discovery, but the exact billable unit and unit price
remain to be validated before production charging begins.

**Decision Rationale:**

Real-Time Discovery creates value differently from Standard Discovery,
so PinkCurve should not assume that Qualified Offering Visit billing is
the appropriate primary commercial model.

A simple unit-based model is the current direction because it can make
Seller cost easier to understand, calculate, budget, and control.

However, PinkCurve does not yet have sufficient market and operating
evidence to finalize the billable unit or unit price. Those decisions
should be based on measured Buyer response, Seller value, willingness to
pay, operating cost, fraud and measurement quality, and sustainable unit
economics.

**Validation Result:**

TBD

---

# Business Decisions

## BD-001: Standard Discovery Qualified Buyer Action Pricing Validation

**Status:** Open

**Question:** What should Sellers pay for qualified positive Buyer actions generated through Standard Discovery, and how should PinkCurve validate that pricing through actual Seller behavior and market evidence?

**Scope:**

This decision applies to Standard Discovery where Seller value is measured
through qualified positive Buyer actions, including Qualified Offering
Visits where applicable.

Real-Time Discovery may require a different commercial model because the
Seller's objective may be timely qualified awareness or reach before an
Offering expires rather than only a subsequent Buyer action.

Real-Time Discovery pricing is intentionally not decided by BD-001.

Qualified Offering Visits and other Buyer actions should still be measured
for Real-Time Discovery where applicable, even when they are not the
billing unit.

PinkCurve should not assume that a single billing unit is appropriate for
all forms of Discovery.

Pricing and billing rules must remain separate from Discovery relevance
and ranking. The Discovery Engine should determine what is worthwhile and
relevant to a Buyer rather than favoring an Offering because of its
pricing or billing model.

**Why This Matters:**

Pricing for qualified positive Buyer actions must create measurable value
for Sellers while generating sustainable revenue for PinkCurve.

Different qualified actions, Offering types, Seller businesses, and market
contexts may create different levels of Seller value.

PinkCurve should not assume that one universal price for every qualified
positive Buyer action will be economically appropriate across all Seller
categories.

**Variables:**

- Type of qualified positive Buyer action
- Subscription tier
- Included action volume
- Optional per-action pricing
- Volume
- Category
- Geography
- Seller size
- Action quality
- PinkCurve operating cost

**Work Required:**

- Interview early Sellers
- Measure Seller value from qualified positive Buyer actions
- Estimate conversion and Seller-value economics
- Compare alternative Seller acquisition and discovery costs
- Test subscription tiers and included action volumes
- Test optional per-action pricing where appropriate
- Validate the 24-hour qualified-action billing rule
- Test pricing during Beta
- Measure cost per billable qualified action
- Measure revenue per billable qualified action
- Measure free-to-paid Seller conversion
- Measure invalid, fraudulent, and duplicate billable actions
- Test Seller willingness to pay using actual paid behavior where practical
- Evaluate Seller-controlled spending and budget limits

**Evidence Required:**

- Seller-perceived value of qualified positive Buyer actions
- Seller willingness to pay for qualified positive Buyer actions
- Actual paid usage where available
- Seller renewal and retention
- Qualified Offering Visit volume where applicable
- Free-to-paid Seller conversion
- Seller acquisition or conversion outcomes where measurable
- Invalid, fraudulent, or duplicate billable-action rate
- PinkCurve cost per billable qualified action
- PinkCurve revenue per billable qualified action
- PinkCurve gross margin
- Competitive Seller acquisition and discovery costs

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

**Status:** Decided

**Question:**

What minimum Seller billing capability and Stripe integration must
PinkCurve implement and validate during Alpha?

**Why This Matters:**

Seller billing is a fundamental part of PinkCurve's ability to become
a sustainable business.

Although Alpha primarily validates whether PinkCurve's approach to
Meaningful Discovery works, PinkCurve should also validate that the
economic path from discovery activity to Seller billing is technically
workable.

MVP Seller billing includes:

- Paid Seller tiers for Standard Discovery based on qualified positive Buyer actions
- Qualified action accounting by Buyer, Offering, action type, and time
- Enforcement of the rolling 24-hour billing rule where qualified-action billing applies
- Ability to support additional PinkCurve billing models without requiring fundamental redesign of the billing architecture
- Free-tier usage and limits tracked separately from paid usage
- Seller notification when applicable usage or spending limits are approached or reached
- Seller upgrade or pause behavior when applicable limits are reached
- Optional per-action pricing where applicable
- Seller-controlled spending limits where applicable
- Credits
- Adjustments
- Refunds
- Taxes
- Invoices
- Payment records and history

Real-Time Discovery may eventually use a billing basis different from
qualified positive Buyer actions.

The Real-Time Discovery billing unit, unit price, budget rules, duplicate
treatment, and other commercial rules remain unresolved and should not be
implicitly determined by the initial Standard Discovery billing
implementation.

The Seller billing architecture should therefore separate general billing
capabilities from the rules used by a particular Discovery billing model.

Stripe integration should therefore be implemented and validated as part
of PinkCurve's larger Seller billing architecture rather than treated as
an isolated payment API.

**Current State:**

Stripe has previously been configured but is not actively used.

**Final Direction:**

PinkCurve will use Stripe as the MVP payment processor.

PinkCurve retains responsibility for its Seller billing model, including
billable-usage determination, pricing and subscription-tier application,
free-tier usage and limits, Seller-controlled spending limits where
applicable, invoice calculation, billing records, adjustments, credits,
refunds, and billing auditability.

For Standard Discovery, this includes qualified positive Buyer action
accounting and application of the rolling 24-hour billing rule where
applicable.

The billing architecture should allow additional Discovery billing models
to define their own billable event or usage rules without changing
PinkCurve's underlying payment-processing architecture.

Stripe provides the external payment-processing capability, including
payment-method handling, payment execution, processor-side retry behavior,
and refund execution.

**Work Required:**

- Define Alpha Seller billing requirements
- Define Seller billing-account model
- Define invoice data model
- Define qualified positive Buyer action accounting requirements
- Define rolling 24-hour billing-window accounting requirements
- Define free-tier usage, limit, and upgrade handling
- Define promotional-credit handling where applicable
- Define credits, adjustments, and refund handling
- Define payment-failure handling
- Define billing audit trail
- Define Seller billing UI requirements
- Validate Stripe integration against PinkCurve's MVP billing requirements
- Implement Stripe in test/sandbox mode
- Implement basic Seller billing workflow
- Test end-to-end billing
- Define Beta production-payment requirements
- Define security and financial controls
- Define separation between Discovery Events, billable usage, and financial records
- Define billing-policy interfaces so different Discovery billing models can coexist
- Define Seller-controlled budget and spending-limit enforcement
- Define how future Real-Time Discovery billing rules can be introduced without changing the underlying payment-processing architecture

**Evidence Required:**

- Successful end-to-end Alpha billing tests
- Accurate qualified positive Buyer action accounting
- Correct application of the rolling 24-hour billing rule
- Accurate free-tier usage and limit accounting
- Accurate invoice generation
- Correct credits and adjustments
- Successful test payment processing through Stripe
- Seller billing usability feedback
- Billing auditability
- Cost assessment
- Operational complexity assessment
- Correct separation of Discovery Events from billable usage
- Correct enforcement of Seller-controlled spending limits
- Evidence that billing rules can change without corrupting historical billing records
- Evidence that multiple billing models can be supported without changing the underlying payment-processing integration

**Decision Needed By:**

The initial Seller billing architecture and Stripe integration requirements
must be defined before Alpha billing implementation.

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
- Qualified positive Buyer action accounting
- Rolling 24-hour billing-window accounting
- Free-tier usage and limit accounting
- Invoice generation
- Stripe payment-processing integration
- Credits and adjustments
- Seller billing history
- Financial reporting
- Audit logs
- Seller Intelligence
- Customer support
- Billable usage records
- Billing-policy evaluation
- Billing-rule versioning
- Seller spending controls
- Separation of Discovery Events from financial billing records
- Support for multiple Discovery billing models

**Final Decision:**

PinkCurve will use Stripe as the MVP payment processor.

PinkCurve owns the Seller billing model and financial records. Stripe provides payment-processing capabilities and handles sensitive payment-method information and payment execution.

**Decision Rationale:**

Stripe has already been configured and represents an existing investment. It is a widely-used and well-supported platform for payment processing, which reduces operational risk. While PinkCurve will implement its own Seller billing model and financial logic, offloading the complexity of payment-method handling, payment execution, and processor-side retry behavior to Stripe is a sensible architectural choice for MVP.

**Validation Result:**

TBD

---

## BD-004: Brand Recognition Billing

**Status:** Decided

**Question:** Should Brand Recognition and Quality Brand Exposures be
billable Seller actions?

**Final Direction:**

Brand Recognition and Quality Brand Exposures are not billable Seller
actions.

PinkCurve may measure Brand Recognition and Quality Brand Exposures for
analytics, Seller Intelligence, discovery evaluation, and evidence of
Seller value, but these measurements do not create billing events.

**Scope Clarification:**

This decision applies specifically to Brand Recognition and Quality Brand
Exposure as awareness-oriented Seller value signals.

It does not determine whether another explicitly defined Discovery metric,
such as a future qualified Real-Time Discovery impression, may become a
billable usage unit.

A Real-Time Discovery impression, if PinkCurve later defines and validates
one for billing, would require its own qualification, relevance,
deduplication, fraud-prevention, measurement, and commercial rules.

Real-Time Discovery pricing remains unresolved.

**Why This Matters:**

Brand Recognition may create value for Sellers even when it is not tied
directly to a specific Offering or an immediate qualified positive Buyer
action.

PinkCurve may help Sellers build awareness among relevant Buyers based on:

- Geography
- Category
- Buyer interests
- Timing
- Other appropriate discovery contexts

However, Brand Recognition value is less directly attributable than a
qualified positive Buyer action.

PinkCurve will therefore measure Brand Recognition where useful for
analytics, Seller Intelligence, discovery evaluation, and Seller value
evidence without treating Brand Recognition or Quality Brand Exposures
as billable events.

**Work Required:**

- Define how Brand Recognition and Quality Brand Exposures are measured
- Define the evidence required for a valid Quality Brand Exposure
- Measure Seller value associated with Brand Recognition
- Evaluate PinkCurve's cost of delivering and measuring Brand Recognition
- Determine how Brand Recognition evidence is presented through Seller Intelligence
- Monitor whether Brand Recognition contributes to later qualified positive Buyer actions
- Validate Brand Recognition measurement during Beta

**Evidence Required:**

- Buyer response
- Relevant audience reach
- Recognition or recall indicators
- Seller-perceived value of Brand Recognition
- Buyer trust impact

**Decision Needed By:**

Decided for the current PinkCurve business model.

The decision may be formally revisited in the future if PinkCurve develops
new evidence that supports a different Brand Recognition business model.

**Decision Owner:**

Business / Product

**Affected Chapters:**

- 06-discovery-engine.md
- 07-discovery-analytics.md
- 09-seller-intelligence.md
- 13-business-model.md
- 14-success-metrics.md

**Final Decision:**

Brand Recognition and Quality Brand Exposures will not be directly
billable Seller actions under the current PinkCurve business model.

They may still be measured and used as evidence for Seller Intelligence,
discovery evaluation, and Seller value analysis.

**Decision Rationale:**

For Standard Discovery, PinkCurve's current billing direction is based on
qualified positive Buyer actions that provide clearer evidence of Buyer
interest and Seller value.

Brand Recognition and Quality Brand Exposures are different because their
primary purpose is awareness rather than evidence of a specific
intentional Buyer action.

Keeping Brand Recognition non-billable simplifies the initial Seller
billing model while allowing PinkCurve to measure its value and learn
from actual Seller and Buyer behavior.

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

- Define initial U.S. launch geography and geographic concentration
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
- Qualified positive Buyer action volume, including Qualified Offering Visits where applicable
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

**Question:** What exact capabilities, Buyers, Sellers, Offering categories, and initial U.S. geographic concentration should be included in PinkCurve Alpha?

**Guiding Purpose:**

**Real-Time Discovery Alpha Scope:**

Because Real-Time Discovery is part of PinkCurve's MVP direction, Alpha
should include a constrained end-to-end Real-Time Discovery capability.

The purpose of the Alpha Real-Time Discovery scope is not to validate
every possible Real-Time Offering type or commercial model. It is to
determine whether PinkCurve can reliably complete the core Real-Time
Discovery lifecycle:

Seller submits time-sensitive Offering
→ PinkCurve validates and reviews it
→ required approval is completed
→ actual Discovery start time is established
→ Offering becomes discoverable to relevant Buyers
→ Buyer response is measured
→ Offering expires or is ended early
→ Discovery stops

Alpha should use a limited number of Real-Time Offering scenarios,
Sellers, Buyers, and geographic areas so that PinkCurve can understand
the resulting evidence.

The Alpha should test at minimum:

- Mobile-friendly Seller submission
- Seller-supplied truthful Offering information and media
- Required Offering Knowledge for Real-Time Discovery
- Approval workflow and approval latency
- Requested versus actual Discovery start time
- Minimum usable Discovery-period enforcement
- Freshness and current availability
- Geographic relevance
- Real-Time Discovery ranking and distribution
- Automatic expiration
- Seller early termination when an Offering becomes unavailable
- Buyer response measurement
- Qualified Offering Visit measurement where applicable
- Real-Time Discovery operating cost
- Trust, fraud, and audit controls
- Seller and Buyer experience

Real-Time Discovery pricing may be simulated or measured during Alpha
without requiring production charging. The purpose is to collect evidence
needed to validate the eventual billable unit, unit price, Seller value,
and sustainable unit economics.

> **The purpose of Alpha is to determine whether PinkCurve's approach to discovery works.**

Alpha should therefore remain focused enough to produce understandable evidence.

**Work Required:**

- Define Alpha Buyer population
- Define representative discovery scenarios required to validate Meaningful Discovery
- Define Alpha Seller population
- Define Offering categories
- Define initial U.S. geographic concentration
- Define required AI capabilities
- Define minimum visual-first Buyer discovery experience
- Define AMN scope
- Define trust controls
- Define instrumentation
- Define support process
- Define constrained Alpha Real-Time Discovery scenarios
- Define Real-Time Seller submission and approval scope
- Define Real-Time Offering lifecycle and expiration testing
- Define initial minimum usable Discovery period for Alpha
- Define Real-Time geographic and Buyer-population scope
- Define Real-Time instrumentation and measurement
- Define Real-Time pricing and billing simulation requirements

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

- Buyers discover worthwhile Offerings relevant to their interests, needs, intent, or context
- Qualified positive Buyer actions, including Qualified Offering Visits where applicable
- Buyers can navigate without excessive confusion
- Buyers return
- AMN improves discovery
- AI improves relevance
- Sellers perceive value
- Trust remains strong
- Fraud is manageable
- Discovery Events are reliable
- Platform performance is acceptable
- Real-Time Offerings reach relevant Buyers while the Offerings are still useful and available
- Real-Time Offerings begin Discovery only after required approval and with sufficient usable Discovery time remaining
- Real-Time Offering expiration and Seller early termination reliably stop further Discovery
- Buyers take meaningful actions on relevant Real-Time Offerings where appropriate
- Time from Real-Time publication to meaningful Buyer response is measurable and useful
- Sellers perceive sufficient value from Real-Time Discovery to consider using it again
- Real-Time approval latency and operating cost are manageable
- Real-Time fraud, invalid traffic, stale information, and availability errors are manageable
- PinkCurve can reliably measure candidate Real-Time billable units without requiring production charging during Alpha

Success should not be based simply on the number of impressions or Offerings viewed.

A Buyer who quickly discovers one worthwhile Offering may represent a better outcome than a Buyer who views many irrelevant Offerings.

For Real-Time Discovery, success should similarly not be measured by
impression volume alone.

A successful Real-Time Discovery occurs when PinkCurve helps a relevant
Buyer discover a worthwhile time-sensitive Offering while that Offering
is still valid and useful.

Real-Time Discovery evaluation should therefore consider relevance,
freshness, timeliness, Buyer response, Seller value, trust, and delivery
cost together rather than optimizing any single activity metric.

High impression volume with low relevance, expired availability, weak
Buyer response, or poor Seller value should not be interpreted as
successful Real-Time Discovery.

**Work Required:**

- Define quantitative metrics
- Define qualitative feedback
- Define minimum sample sizes
- Define test duration
- Define criteria for success, significant modification, reconsideration, or inconclusive results
- Define Beta readiness criteria
- Define Real-Time Discovery Alpha success criteria
- Define Real-Time relevance, freshness, and availability measures
- Define approval-latency and publication-latency measures
- Define time-to-meaningful-Buyer-response measures
- Define Real-Time Seller repeat-use and perceived-value measures
- Define Real-Time operating-cost and unit-economics measures
- Define candidate billable-unit measurement for PD-012 validation
- Define stale, expired, unavailable, fraudulent, and invalid Real-Time Discovery measures

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

**Time-Dependent Test Data Principle:**

Real-Time Discovery testing requires time-dependent test data rather than
only static Offering records.

Test data should allow PinkCurve to simulate Offering lifecycle changes,
approval delays, changing availability, expiration, Seller early
termination, and Buyer activity at different points in the Discovery
period.

Testing should verify not only whether PinkCurve selects the correct
Offering, but also whether PinkCurve stops selecting an Offering when it
is no longer valid, available, approved, or eligible for Discovery.

**Work Required:**

- Define synthetic test data
- Define real Seller Offering data
- Define Buyer test profiles
- Define representative purposeful and exploratory discovery scenarios
- Define expected discovery outcomes
- Define unsuccessful, irrelevant, ambiguous, and no-suitable-Offering discovery outcomes
- Define fraud and trust test cases
- Define AMN test cases
- Define representative visual Offering assets and visual-quality test cases
- Define AI evaluation datasets
- Define privacy protections
- Define representative Real-Time Offering test data
- Define Real-Time Offering lifecycle and state-transition test cases
- Define requested start time, approval time, actual Discovery start time, and expiration test cases
- Define minimum usable Discovery-period test cases
- Define future-start, active, expired, ended-early, unavailable, and suspended Offering scenarios
- Define Real-Time location and geographic-relevance test cases
- Define availability, quantity, and capacity-change scenarios where applicable
- Define stale or conflicting Offering-information scenarios
- Define Real-Time approval-delay scenarios
- Define Real-Time Buyer response and no-response scenarios
- Define candidate Real-Time billable-unit measurement data without requiring production charging
- Define duplicate, invalid, automated, and fraudulent Real-Time activity test cases

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

## H-000: Meaningful Discovery Validity

**Status:** Not Yet Validated

**Hypothesis:**

PinkCurve can help Buyers discover worthwhile Offerings that are relevant
to their interests, needs, intent, or context through a simple, visual,
and trustworthy discovery experience.

**Why This Matters:**

Meaningful Discovery is the fundamental value PinkCurve intends to create.

Individual capabilities such as Adaptive Metadata Navigation, Offering
Knowledge, Buyer Discovery Profiles, AI matching, ranking, and the
Learning Engine are mechanisms intended to support that objective.

Those capabilities may function technically without demonstrating that
PinkCurve itself creates meaningful value for Buyers.

Alpha should therefore test the broader question:

> Does PinkCurve help Buyers discover worthwhile Offerings they might
> reasonably want to explore or act upon?

Success should not be measured primarily by the number of Offerings
shown, impressions generated, navigation steps completed, or time spent
on the platform.

A Buyer who quickly discovers a worthwhile Offering may represent a
better discovery outcome than a Buyer who views many irrelevant
Offerings.

**Validation Approach:**

Evaluate whether representative Buyers can use PinkCurve to discover
Offerings they consider worthwhile across representative discovery
scenarios.

Evaluate both:

- Purposeful discovery where the Buyer has an identifiable need or intent
- Exploratory discovery where the Buyer may not initially know exactly
  what they want

Observe the contribution of supporting capabilities including:

- Offering Knowledge
- Adaptive Metadata Navigation
- Buyer Discovery Profile
- AI matching and ranking
- Visual discovery experience
- Buyer feedback
- Learning Engine where sufficient interaction data exists

**Evidence Required:**

- Successful discovery outcomes
- Buyer feedback
- Buyer satisfaction
- Qualified positive Buyer actions
- Qualified Offering Visits where applicable
- Buyer return behavior
- Discovery relevance
- Discovery abandonment
- Trust indicators
- Evidence from representative discovery scenarios
- Evidence that Buyers discover Offerings they consider worthwhile

**Validation Needed By:**

Meaningful Discovery must be a primary Alpha validation objective.

Alpha should produce sufficient evidence to determine whether PinkCurve's
fundamental discovery approach is promising enough to proceed to Beta,
requires significant modification, or requires reconsideration.

Validation should continue during Beta and production as PinkCurve
expands to additional Buyers, Sellers, Offering types, and discovery
contexts.

**Validation Owner:**

Product / Discovery Engine / Buyer Experience / Discovery Analytics

**Affected Chapters:**

- 01-vision-and-mission.md
- 02-design-principles.md
- 03-product-architecture.md
- 04-offering-knowledge.md
- 06-discovery-engine.md
- 07-discovery-analytics.md
- 08-learning-engine.md
- 10-ai-platform.md
- 14-success-metrics.md
- 15-product-roadmap.md
- 20-buyer-experience.md

**Related Open Decisions:**

- PD-001: Offering Knowledge Completeness and Discovery Readiness
- PD-005: Buyer Registration Model
- PD-006: Adaptive Metadata Navigation Initial Design
- AV-001: Alpha Scope
- AV-002: Alpha Success Criteria

**Validation Result:**

TBD

**Outcome:**

TBD — Supported / Partially Supported / Not Supported / Inconclusive / Continue Testing

---

## H-001: Discovery Score Validity

**Status:** Not Yet Validated

**Hypothesis:**

Discovery Score can provide a meaningful high-level measure of Meaningful Discovery and discovery effectiveness and may correlate with Buyer and Seller value.

**Why This Matters:**

PinkCurve needs reliable ways to understand whether discovery is actually improving.

A composite Discovery Score could provide a useful high-level indicator, but only if the score reflects Meaningful Discovery rather than simply combining convenient engagement metrics.

A Buyer viewing many Offerings does not necessarily represent successful discovery.

Likewise, a high click rate does not necessarily mean Sellers are receiving valuable Buyer interest.

Discovery Score should therefore not become an important platform KPI until its relationship to meaningful outcomes has been tested.

**Validation Approach:**

Compare Discovery Score with independent indicators of discovery value, including:

- Qualified positive Buyer actions, including Qualified Offering Visits where applicable
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
- Qualified positive Buyer action data, including Qualified Offering Visit data where applicable
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

## H-002: Creative Studio Effectiveness

**Status:** Not Yet Validated

**Hypothesis:**

AI-assisted creative guidance, evaluation, and recommendations can help Sellers produce more effective visual storytelling and discovery media for PinkCurve.

**Why This Matters:**

Creative presentation affects whether Buyers understand and become interested in Offerings.

PinkCurve's Creative Studio may help Sellers improve discovery content through AI-assisted guidance, evaluation, and recommendations, but those capabilities should not be assumed to improve discovery effectiveness until validated through Buyer and Seller evidence.

The objective is not to maximize AI-generated content.

The objective is to help Buyers understand worthwhile Offerings and support Meaningful Discovery.

**Validation Approach:**

Compare different creative approaches using controlled discovery experiments where practical.

Possible comparisons include:

- Seller discovery media before and after Creative Studio guidance
- Seller-produced media using PinkCurve recommendations
- Externally produced media using PinkCurve recommendations
- Media that receives different Creative Studio recommendations
- Different storytelling approaches recommended by Creative Studio

Evaluate both quantitative performance and qualitative Buyer response.

**Evidence Required:**

- Offering views
- Buyer engagement
- Qualified positive Buyer actions, including Qualified Offering Visits where applicable
- Buyer feedback
- Seller feedback
- Creative-quality review
- Discovery effectiveness
- Cost of using Creative Studio guidance and evaluation
- Time required for Sellers to improve discovery media using Creative Studio recommendations

**Validation Needed By:**

Initial validation should occur during Alpha where sufficient creative content exists.

Stronger validation should occur during Beta before PinkCurve treats Creative Studio guidance, evaluation, and recommendations as a proven Seller value proposition.

Creative Studio effectiveness should continue to be evaluated as AI models, creative technologies, and Seller needs evolve.

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
- Qualified positive Buyer actions, including Qualified Offering Visits where applicable
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
- Creative guidance and evaluation
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
- Qualified positive Buyer actions, including Qualified Offering Visits where applicable
- Buyer satisfaction
- Seller value

Test individual knowledge dimensions where possible rather than relying only on the overall Completeness Score.

**Evidence Required:**

- Completeness Score
- Offering Knowledge quality measures
- Offering-type information
- Discovery Event data
- Qualified positive Buyer actions, including Qualified Offering Visits where applicable
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

Evaluate both purposeful discovery and exploratory discovery where Buyers may not initially know exactly what they want.

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
- Qualified positive Buyer actions, including Qualified Offering Visits where applicable
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
- Qualified positive Buyer actions, including Qualified Offering Visits where applicable
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

## H-007: Real-Time Discovery Validity

**Status:** Not Yet Validated

**Hypothesis:**

PinkCurve can help relevant Buyers discover worthwhile time-sensitive
Offerings while those Offerings are still valid, available, and useful,
creating meaningful value for both Buyers and Sellers.

**Why This Matters:**

Real-Time Discovery is now part of PinkCurve's MVP direction.

Its value depends not only on relevance but also on whether PinkCurve can
understand, approve, publish, distribute, and stop distributing
time-sensitive Offerings at the appropriate time.

A highly relevant Offering discovered after it expires or becomes
unavailable does not represent successful Real-Time Discovery.

Likewise, generating large numbers of impressions does not by itself
demonstrate Real-Time Discovery value.

PinkCurve must validate whether Real-Time Discovery can connect relevant
Buyers with worthwhile opportunities within their useful lifetime while
maintaining trust and economically manageable operations.

**Validation Approach:**

Evaluate representative Real-Time Discovery scenarios using constrained
Alpha Seller, Buyer, Offering, and geographic populations.

Evaluate whether PinkCurve can:

- Accept Real-Time Offerings through a practical Seller workflow
- Complete required approval with workable latency
- Begin Discovery only after required approval
- Maintain the MVP minimum usable Discovery period
- Present Real-Time Offerings to relevant Buyers while still useful
- Apply location and freshness appropriately
- Respond correctly to availability changes
- Stop Discovery when an Offering expires, becomes unavailable, is ended
  early, or is suspended
- Produce meaningful Buyer response within the useful Discovery period
- Provide Sellers with sufficient value to consider repeated use
- Operate Real-Time Discovery at manageable cost
- Maintain acceptable trust, fraud, and information-quality outcomes

**Evidence Required:**

- Seller submission-to-publication time
- Approval latency
- Actual Discovery start time
- Usable Discovery-period data
- Buyer relevance
- Qualified Buyer reach
- Time to first meaningful Buyer response
- Qualified positive Buyer actions where applicable
- Qualified Offering Visits where applicable
- Expiration and early-termination accuracy
- Stale or unavailable Offering incidents
- Buyer feedback
- Seller-perceived value
- Seller repeat use
- Trust and fraud results
- Real-Time Discovery operating cost
- Evidence from representative Real-Time Discovery scenarios

Impression volume alone should not be treated as evidence that the
hypothesis is supported.

**Validation Needed By:**

Initial validation should occur during Alpha.

Alpha should produce sufficient evidence to determine whether Real-Time
Discovery is promising enough to continue into Beta, requires significant
modification, or requires reconsideration.

The initial 30-minute advance-submission requirement and three-hour
minimum usable Discovery period should also be evaluated during Alpha and
adjusted if operating evidence demonstrates that different requirements
would produce better Real-Time Discovery outcomes.

Validation should continue during Beta and production as PinkCurve expands
to additional Real-Time Offering types, Sellers, Buyers, and geographic
areas.

**Validation Owner:**

Product / Discovery Engine / Seller Experience / Discovery Analytics /
Trust / Operations

**Affected Chapters:**

- 04-offering-knowledge.md
- 05-creative-studio.md
- 06-discovery-engine.md
- 07-discovery-analytics.md
- 09-seller-intelligence.md
- 11-data-architecture.md
- 12-security-privacy-and-trust.md
- 13-business-model.md
- 14-success-metrics.md
- 15-product-roadmap.md
- 20-buyer-experience.md
- Seller Experience documentation

**Related Open Decisions:**

- PD-001: Offering Knowledge Completeness and Discovery Readiness
- PD-007: Seller and Offering Approval Model
- PD-011: Real-Time Discovery Model
- PD-012: Real-Time Discovery Pricing Model
- AV-001: Alpha Scope
- AV-002: Alpha Success Criteria
- AV-003: Test Data Strategy

**Validation Result:**

TBD

**Outcome:**

TBD — Supported / Partially Supported / Not Supported / Inconclusive /
Continue Testing

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

The overarching Alpha hypothesis is:

**H-000 — Meaningful Discovery Validity**

H-000 evaluates whether PinkCurve's fundamental discovery approach
creates meaningful value for Buyers.

Because Real-Time Discovery is included in MVP, Alpha should also give
high priority to:

**H-007 — Real-Time Discovery Validity**

H-007 evaluates whether PinkCurve can create Meaningful Discovery when
the usefulness of an Offering depends strongly on timing, freshness,
availability, and location.

The remaining hypotheses evaluate important mechanisms, supporting
capabilities, and measurements that may contribute to Meaningful
Discovery.

The initial supporting-hypothesis priority should be:

1. **H-007 — Real-Time Discovery Validity**
2. **H-005 — Adaptive Metadata Navigation Effectiveness**
3. **H-004 — Offering Knowledge Correlation**
4. **H-006 — Buyer Discovery Profile Improves Discovery**
5. **H-001 — Discovery Score Validity**
6. **H-003 — Learning Engine Impact**
7. **H-002 — Creative Studio Effectiveness**

This ordering does not mean lower-priority hypotheses are unimportant.

It means PinkCurve should first establish whether its fundamental
discovery approach creates meaningful value, including under the
time-sensitive conditions introduced by Real-Time Discovery, before
optimizing supporting capabilities.

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

Compliance requirements applicable to real Buyers, Sellers, and their
data must be addressed before external Alpha participation begins.

Privacy, security, consent, data handling, and applicable consumer
rights should be incorporated into PinkCurve's architecture and
Buyer/Seller experiences before external Alpha users begin using
the platform.

PinkCurve MVP is limited to eligible Buyers and Sellers located in
the United States.

Therefore, the MVP compliance program should focus on applicable
U.S. federal and state requirements. International requirements
should be evaluated before PinkCurve expands participation beyond
the United States.

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
- Define location-data handling, including Real-Time Discovery use where applicable
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
- Location processing, including Real-Time Discovery where applicable
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

Tracking and analytics data should not become general-purpose data
available throughout PinkCurve.

Access and use should be limited to the capabilities that require the
information for an approved purpose, consistent with PinkCurve's
purpose-limitation and capability-based data-access principles.

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

Risk evaluation should be continuous.

PinkCurve should identify new risks and reassess existing risks as the
platform, technology, market, regulatory environment, threat landscape,
and organization change.

Regular Risk Register reviews provide a formal review point, but they
should not replace continuous identification, monitoring, escalation,
and mitigation of significant risks.

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

**Key Principle:**

AI may assist with analysis, recommendations, prioritization, detection,
and routine operations, but authority for consequential decisions should
depend on the risk and reversibility of the action.

PinkCurve should require human review or approval when an automated
decision could create significant financial, security, trust, legal,
Seller, or Buyer consequences.

Human review requirements should be proportional to risk rather than
applied uniformly to every AI-assisted action.

### Human Review Governance

PinkCurve should explicitly define, for each trust-sensitive workflow,
which actions may be completed automatically, which may use AI-assisted
review, which require human review, and which require human approval.

High AI confidence must not bypass a human approval requirement when
PinkCurve policy defines human approval as mandatory.

Trust-sensitive workflows should use defined and versioned review
checklists where appropriate so that AI, deterministic systems, and
human reviewers evaluate the required controls consistently.

Executed reviews should retain sufficient evidence to reconstruct how a
consequential decision was made, including the applicable checklist or
policy version, review method, material evidence, AI assistance where
used, human reviewer or approver where required, exceptions or
escalations, timestamps, and final decision.

Real-Time Discovery may require faster review, but urgency alone should
not eliminate required trust or human-approval controls.

As PinkCurve gains operational evidence, low-risk and reversible
decisions may move toward greater automation where policy permits, while
higher-risk, uncertain, or consequential decisions should continue to
receive appropriate human oversight.

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
- Seller ownership changes
- Account recovery
- Material Offering changes
- Destination URL verification and reverification
- Real-Time Offering approval

**Work Required:**

- Classify decision risk
- Define AI assistance boundaries
- Define human approval authority
- Define audit requirements
- Define escalation procedures
- Define trust-sensitive workflows requiring review checklists
- Define when human review is required versus when human approval is required
- Define checklist versioning and executed-review records
- Define criteria for risk-proportional automation and escalation

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

During PinkCurve's initial solo-operation stage, traditional separation
of duties may not always be possible.

Where one person must perform multiple responsibilities, PinkCurve should
use compensating controls such as explicit authorization boundaries,
audit logging, change history, backups, security controls, and documented
review procedures.

As additional personnel receive authority, PinkCurve should progressively
separate incompatible responsibilities so that no individual has
unnecessary end-to-end control over sensitive financial, administrative,
security, production, or intellectual-property operations.

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

| ID | Decision | Outcome | Status / Date | Permanent Record |
|----|----------|---------|---------------|------------------|
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