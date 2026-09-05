# PinkCurve Product & Capability Audit

## Audit Status

| Field | Value |
|---|---|
| Scope | Blueprint Chapters 00–24 |
| Purpose | Establish the PinkCurve Product & Capability Map |
| Status | In Progress |
| Started | 2026-08-23 |

---

## Audit Classification

- **Product**
- **Integrated Experience**
- **Shared / Foundation Capability**
- **Capability**
- **Feature**
- **Operating Function**

## Audit Findings

- **CLEAR** — responsibility and classification are sufficiently clear.
- **CLARIFY** — present in the Blueprint, but ownership, classification, or boundary needs clarification.
- **GAP** — required or implied capability is not adequately defined.

---

# Chapter-by-Chapter Audit

## Chapter 00 — Executive Summary

### Audit Purpose

Chapter 00 provides the high-level definition of PinkCurve and identifies many
of the major products, experiences, capabilities, and foundational functions
that must be examined throughout the Product & Capability Audit.

Because this is an Executive Summary, classifications identified here should
be treated as candidate classifications until confirmed against the more
detailed Blueprint chapters.

---

### Products Identified

| Item | Classification | Status | Notes |
|---|---|---|---|
| Offering Knowledge | Product | CLEAR | Provides structured knowledge about Offerings and supports intelligent discovery. |
| Creative Studio | Product | CLEAR | Helps Sellers develop, organize, evaluate, and improve visual creative content. |
| Discovery Engine / AI Discovery | Product | CLARIFY | Clearly a major PinkCurve product, but naming should be normalized across the Blueprint. Determine whether "AI Discovery" becomes the canonical product name and "Discovery Engine" describes its core engine. |
| Discovery Analytics | Product | CLEAR | Measures Buyer interaction and discovery effectiveness. |
| Learning Engine | Product | CLEAR | Learns from interaction signals and platform information to improve PinkCurve. |
| Seller Intelligence | Product | CLEAR | Produces actionable intelligence for Sellers. |
| Trust / Trust and Safety | Product candidate | CLARIFY | Chapter 00 treats Trust and Safety as a major platform component. Audit later chapters to determine whether Trust is classified as a product, shared capability, or combination of both. |

---

### Integrated Experiences Identified

| Item | Classification | Status | Notes |
|---|---|---|---|
| Buyer Experience | Integrated Experience / Product | CLEAR | Primary visual interface between Buyers and PinkCurve. Coordinates underlying PinkCurve products while hiding platform complexity. |
| Seller Experience | Integrated Experience / Product candidate | CLARIFY | Seller-facing capabilities are strongly implied through offering management, Creative Studio, analytics, intelligence, authentication, and onboarding, but Seller Experience is not explicitly identified as a Key Platform Component in Chapter 00. Verify in later chapters. |

---

### Products Not Yet Explicitly Identified in Chapter 00

| Item | Classification | Status | Notes |
|---|---|---|---|
| Adaptive Metadata Navigation (AMN) | Product | VERIFY ELSEWHERE | Metadata-based navigation is clearly described, but AMN is not named as a standalone product in Chapter 00. Chapter 23 should establish its classification. |
| Buyer Intelligence | Product | VERIFY ELSEWHERE | Buyer interaction signals and discovery intelligence are present conceptually, but Buyer Intelligence is not identified as a standalone product in Chapter 00. Chapter 24 should establish its classification. |

These are not considered Blueprint gaps because later chapters explicitly
address them. Their absence here may indicate that Chapter 00 will eventually
need synchronization after the Product & Capability Map is completed.

---

### Shared / Foundation Capabilities Identified

| Item | Classification | Status | Notes |
|---|---|---|---|
| Data Architecture | Shared / Foundation Capability | CLEAR | Initial platform and data architecture is explicitly identified. Detailed ownership and boundaries should be verified in Chapter 11. |
| AI Platform / AI Capabilities | Shared / Foundation Capability candidate | CLARIFY | AI capabilities support Creative Studio, discovery, learning, and other products. Determine final classification during later audit. |
| Security and Privacy | Shared / Foundation Capability | CLEAR | Cross-platform requirement supporting Trust and platform operation. |
| Metadata Infrastructure | Shared Capability | CLARIFY | Rich metadata supports Offering Knowledge, navigation, Discovery, Buyer Experience, and other products. Determine whether metadata management belongs primarily to Offering Knowledge/Data Architecture while AMN owns navigation behavior. |
| Location / Context Capability | Shared Capability | CLARIFY | Used for discovery, trust, Nearby, community resources, and potentially Buyer Intelligence. Ownership needs to be established. |

---

### Major Capabilities and Features Identified

| Item | Candidate Owner | Status | Notes |
|---|---|---|---|
| Visual-first discovery | Buyer Experience | CLEAR | Central Buyer-facing capability. |
| Mobile-first / small-screen experience | Buyer Experience | CLEAR | Major UI/UX requirement. |
| Offering navigation | Buyer Experience / AMN | CLARIFY | Buyer Experience presents navigation; AMN likely owns adaptive metadata navigation intelligence. |
| Buyer-directed discovery | Buyer Experience / AMN / AI Discovery | CLARIFY | Cross-product responsibility requiring later interface definition. |
| For You discovery | AI Discovery + Buyer Intelligence | CLARIFY | Personalized discovery capability. |
| Nearby discovery | AI Discovery + Location Capability | CLARIFY | Depends on geographic/context information. |
| New discovery | AI Discovery | CLEAR candidate | Discovery mode based on offering freshness. |
| Trending discovery | AI Discovery / Discovery Analytics | CLARIFY | Analytics may determine trends while Discovery consumes them. |
| Deals discovery | AI Discovery + Offering Knowledge | CLARIFY | Offering Knowledge supplies deal information; Discovery determines presentation. |
| Category discovery | AMN / AI Discovery | CLARIFY | Ownership between navigation and discovery requires definition. |
| Seller verification | Trust | CLEAR candidate | Trust capability. |
| Offering validation | Trust | CLEAR candidate | Trust/approval capability. |
| Suspicious-activity detection | Trust | CLEAR candidate | Fraud/abuse detection capability. |
| Fraud and abuse protection | Trust | CLEAR candidate | Cross-platform protection capability. |
| Buyer-facing trust indicators | Trust + Buyer Experience | CLEAR candidate | Trust produces meaning; Buyer Experience presents it. |
| Seller authentication | Security / Seller Experience | CLARIFY | Foundation security capability exposed through Seller Experience. |
| Seller onboarding | Seller Experience | CLEAR candidate | Seller-facing capability. |
| Seller/product management | Seller Experience / Offering Knowledge | CLARIFY | Experience owns interaction; Offering Knowledge owns offering information. |
| Creative campaign workflow | Creative Studio | CLEAR candidate | Creative Studio capability. |
| Buyer interaction/event capture | Data Architecture | CLEAR candidate | Underlying event data should be managed by Data Architecture. |
| Buyer interaction signals | Buyer Intelligence | CLEAR candidate | Buyer Intelligence derives intelligence from appropriate interaction data. |
| Qualified Offering Visits (QOV) | Business / Analytics Capability | CLARIFY | Revenue and measurement concept; later chapters should establish ownership and calculation responsibility. |
| Premium Seller Capabilities | Multiple Seller Products | CLARIFY | Commercial packaging rather than necessarily a separate product. |
| Enterprise Capabilities | Multiple Products / Platform | CLARIFY | Commercial packaging and integration capability; should not automatically become a separate product. |

---

### Cross-Product Relationships Identified

Chapter 00 defines an early platform flow:

Seller
→ Offering Knowledge
→ Creative Studio
→ Discovery Engine
→ Buyer Experience
→ Buyer Interaction Signals
→ Discovery Analytics
→ Learning Engine
→ Seller Intelligence
→ Improved Knowledge, Creative, and Discovery

This establishes an important PinkCurve learning loop.

However, the current flow predates the explicit definition of Adaptive Metadata
Navigation and Buyer Intelligence.

During consolidation, verify whether the canonical product architecture should
eventually include those products explicitly.

---

### Important Product Boundaries Exposed by Chapter 00

#### Buyer Experience vs. Underlying Products

Buyer Experience should own the Buyer-facing presentation and interaction,
not the underlying Discovery, Buyer Intelligence, Trust, or AMN logic.

#### Offering Knowledge vs. Seller Experience

Offering Knowledge should own structured Offering knowledge.

Seller Experience should provide Seller-facing mechanisms for creating,
managing, reviewing, and interacting with that knowledge.

#### Trust vs. Buyer Experience

Trust should determine appropriate verification/risk information.

Buyer Experience should present appropriate Buyer-facing trust indicators
and warnings.

#### Analytics vs. Intelligence

Discovery Analytics measures activity and outcomes.

Buyer Intelligence, Seller Intelligence, AI Discovery, and the Learning Engine
may consume appropriate measurements but should maintain distinct product
responsibilities.

#### Data vs. Intelligence

Data Architecture should manage appropriate underlying platform and
interaction data.

Intelligence products should derive intelligence from that data rather than
becoming independent systems of record for all raw data.

---

### Operating Functions Identified or Implied

| Item | Classification | Status | Notes |
|---|---|---|---|
| Seller onboarding operations | Operating Function / Product Capability | CLARIFY | Product workflow and operational responsibility both exist. |
| Seller verification | Operating Function + Trust Capability | CLARIFY | May involve automated and human processes. |
| Offering validation/approval | Operating Function + Trust Capability | CLARIFY | Verify against later approval and Trust chapters. |
| Fraud/abuse response | Operating Function | CLARIFY | Detection is a system capability; investigation and response are operational functions. |
| Enterprise support | Operating Function / Commercial Capability | CLARIFY | Mentioned through enterprise capabilities; later chapters should establish scope. |

---

### Architectural / Design Requirements Identified

Chapter 00 already establishes requirements that should later flow into the
Design portion of the Blueprint:

- mobile-first Buyer UI;
- visual-first presentation;
- minimal on-screen metadata;
- rich underlying metadata;
- adaptive/navigation behavior;
- product-to-product information exchange;
- Buyer interaction/event capture;
- location/context handling;
- Trust indicators;
- fraud and abuse protection;
- privacy-conscious learning;
- Seller-to-PinkCurve workflows;
- Seller-site handoff rather than PinkCurve transaction processing;
- data architecture;
- APIs and AI systems;
- security.

These are not necessarily separate products. They should be traced into
appropriate product, foundation, and design ownership.

---

### Audit Questions to Carry Forward

**Q00-01 — Discovery Engine vs. AI Discovery**

Determine the canonical product name and whether Discovery Engine represents
the implementation/core engine of the broader AI Discovery product.

**Q00-02 — Trust Classification**

Determine whether Trust is a standalone PinkCurve product, a shared/foundation
capability, or a product supported by shared security/privacy foundations.

**Q00-03 — Seller Experience**

Determine whether Seller Experience should be explicitly recognized as an
integrated PinkCurve product comparable to Buyer Experience.

**Q00-04 — Location Capability Ownership**

Location/context appears across Discovery, Trust, navigation, community
discovery, and Buyer Intelligence. Determine canonical ownership and shared
interfaces.

**Q00-05 — Metadata Ownership**

Separate:
- Offering metadata ownership;
- metadata storage/governance;
- metadata navigation;
- metadata use in Discovery.

Avoid creating overlapping metadata responsibilities.

**Q00-06 — Product Architecture Synchronization**

The Chapter 00 Platform Flow does not yet explicitly contain AMN or Buyer
Intelligence. Revisit after the full Product & Capability Audit.

**Q00-07 — Registration and Account Capabilities**

Seller authentication and onboarding appear, but Buyer registration and the
complete registration/account capability are not visible in Chapter 00.
Verify across later chapters before determining whether any Blueprint gap
exists.

**Q00-08 — Legal Acknowledgment**

The Executive Summary does not identify required Buyer/Seller legal
acknowledgment during registration. This is a newly identified requirement.
Determine its appropriate ownership during consolidation rather than treating
its absence from Chapter 00 alone as a Blueprint gap.

---

### Chapter 00 Audit Assessment

**Overall Status: CLEAR WITH ITEMS TO CLARIFY**

Chapter 00 provides a strong high-level representation of PinkCurve and
already identifies most of the original major platform products.

The audit reveals several areas requiring later normalization rather than
immediate correction:

1. AMN and Buyer Intelligence were defined after the architecture represented
   in this Executive Summary and may eventually need to be incorporated.
2. Seller Experience needs classification.
3. Trust needs final product/foundation classification.
4. Location/context requires clear shared ownership.
5. Metadata responsibilities need explicit boundaries.
6. Registration, verification, approval, and legal acknowledgment need to be
   traced across later chapters.
7. Product naming, particularly Discovery Engine vs. AI Discovery, should be
   normalized.

No changes to Chapter 00 are recommended during this audit pass.

Revisit Chapter 00 only after Chapters 00–24 have been audited and the
Product & Capability Map has been consolidated.

---

## Chapter 01 — Vision and Mission

### Audit Purpose

Chapter 01 establishes the mission-level requirements, product philosophy,
platform boundaries, and long-term discovery objectives that PinkCurve
products and capabilities must support.

Because this chapter defines vision and mission rather than detailed product
architecture, items identified here should generally be treated as strategic
requirements or candidate classifications until confirmed by their dedicated
Blueprint chapters.

---

### Products Identified or Reinforced

| Item | Classification | Status | Notes |
|---|---|---|---|
| Offering Knowledge | Product | CLEAR | Identified as a fundamental source of structured information supporting discovery. |
| Adaptive Metadata Navigation (AMN) | Product / Core Navigation Capability | VERIFY ELSEWHERE | Explicitly identified as a core capability supporting Buyer-directed discovery and defined separately in Chapter 23. |
| Buyer Intelligence | Product | VERIFY ELSEWHERE | Explicitly identified as an area PinkCurve learning should improve. Chapter 24 defines the product and its boundaries. |
| Seller Intelligence | Product | CLEAR candidate | Explicitly identified as a Seller value capability and learning target. Verify detailed product definition in Chapter 09. |
| AI Discovery / Discovery Intelligence | Product | CLARIFY | Discovery intelligence is central throughout the chapter, but canonical naming and boundary with "Discovery Engine" remain to be normalized. |
| Learning Engine / Learning Capability | Product | CLEAR candidate | Continuous learning is a fundamental PinkCurve function. Verify detailed product definition in Chapter 08. |
| Trust | Product candidate / Cross-Platform Capability | CLARIFY | Trust is treated as a fundamental requirement affecting discovery, Buyers, Sellers, fraud prevention, and operations. Final classification remains unresolved. |
| Creative Studio / Creative Capability | Product | VERIFY ELSEWHERE | Visual storytelling and creative effectiveness are mission-level requirements. Verify against Chapter 05. |

---

### Integrated Experiences Identified

| Item | Classification | Status | Notes |
|---|---|---|---|
| Buyer Experience | Integrated Experience / Product | CLEAR | PinkCurve must provide a simple, visual, Buyer-controlled discovery experience while hiding underlying platform complexity. |
| Seller Experience | Integrated Experience / Product candidate | CLARIFY | Seller-facing needs are substantial but Seller Experience is not explicitly named as a product in this chapter. Verify later. |
| Community Discovery Experience | Future Experience / Scope Extension | CLARIFY | PinkCurve may eventually support community events, public services, organizations, local resources, and public information. This should not automatically become a separate product. |

---

### Shared / Foundation Capabilities Identified

| Item | Classification | Status | Notes |
|---|---|---|---|
| Data Architecture | Shared / Foundation Capability | CLEAR candidate | Explicitly referenced as underlying complexity Buyers should not need to understand. |
| AI Platform / AI Capability | Shared / Foundation Capability | CLEAR candidate | AI helps organize Offerings, identify metadata, suggest directions, understand context, and learn from interactions. |
| Security | Shared / Foundation Capability | CLEAR candidate | Required to support Buyer and Seller protection, fraud prevention, identity, and Trust. |
| Privacy | Shared / Foundation Capability | CLEAR | Privacy, consent, purposeful collection, and data boundaries are mission-level requirements. |
| Metadata Infrastructure | Shared Capability | CLARIFY | Meaningful metadata supports navigation, Offering organization, and discovery. Ownership should be separated among Offering Knowledge, Data Architecture, AMN, and AI Discovery. |
| Geographic / Location Capability | Shared Capability | CLARIFY | Supports Nearby discovery, geographic Seller campaigns, local resources, events, contextual discovery, and potentially Trust. |
| Interaction / Signal Infrastructure | Shared Data Capability | CLEAR candidate | Meaningful interactions provide inputs to Buyer Intelligence, Seller Intelligence, Discovery, Learning, Trust, and operations. |

---

### Major Capabilities and Features Identified

| Item | Candidate Owner | Status | Notes |
|---|---|---|---|
| Buyer-directed discovery | Buyer Experience + AMN + AI Discovery | CLEAR concept / CLARIFY ownership | Fundamental mission principle spanning multiple products. |
| Meaningful metadata navigation | AMN | CLEAR candidate | Buyers navigate discovery using meaningful metadata rather than fixed hidden catalog structures. |
| Discovery-space guidance | AMN + AI Discovery | CLARIFY | PinkCurve helps Buyers understand available discovery directions. |
| Visual storytelling | Creative Studio + Buyer Experience | CLEAR candidate | Creative Studio supports content; Buyer Experience presents it. |
| Relevant Offering discovery | AI Discovery | CLEAR candidate | Central Discovery responsibility. |
| New Offering discovery | AI Discovery | CLEAR candidate | Living discovery mode. |
| Trending Offering discovery | Discovery Analytics + AI Discovery | CLARIFY | Analytics may derive trends; Discovery consumes them. |
| Nearby Offering discovery | AI Discovery + Location Capability | CLARIFY | Requires geographic/context capability. |
| Deals/promotions discovery | Offering Knowledge + AI Discovery | CLARIFY | Offering Knowledge describes promotion; Discovery surfaces it. |
| Brand Discovery | Seller Experience / Offering Knowledge / AI Discovery | CLARIFY | Important Seller capability but ownership needs normalization. |
| Seasonal discovery | AI Discovery | CLEAR candidate | Discovery mode based on time/context. |
| Event discovery | AI Discovery + Offering Knowledge | CLEAR candidate | Applies to commercial and potentially community Offerings. |
| Community-resource discovery | Future discovery capability | CLARIFY | Long-term scope extension rather than necessarily separate product. |
| Buyer positive feedback | Buyer Experience + Buyer Intelligence | CLEAR candidate | Buyer Experience captures it; Buyer Intelligence interprets it. |
| Buyer negative feedback | Buyer Experience + Buyer Intelligence | CLEAR candidate | Important Buyer-control and intelligence capability. |
| Buyer preference/intent change | Buyer Intelligence + AMN + Buyer Experience | CLEAR candidate | PinkCurve must recognize and permit changing intent. |
| Seller Offering description | Seller Experience + Offering Knowledge | CLEAR candidate | Experience captures/manages information; Offering Knowledge owns structured knowledge. |
| Seller geographic/category campaign scope | Seller Experience + Discovery / Location | CLARIFY | Seller control over legitimate campaign scope. |
| Seller discovery measurement | Discovery Analytics + Seller Intelligence | CLEAR candidate | Analytics measures; Seller Intelligence interprets for Sellers. |
| Seller value measurement | Discovery Analytics / Business Capability | CLARIFY | Needed to demonstrate PinkCurve value to Sellers. |
| Seller verification | Trust | CLEAR candidate | Fundamental Trust capability. |
| Offering verification / validation | Trust | CLEAR candidate | Fundamental Trust capability. |
| Fraud detection | Trust | CLEAR candidate | Explicit mission-level requirement. |
| Bot detection / prevention | Trust | CLEAR candidate | Explicitly required for Buyer and Seller protection. |
| Invalid-traffic detection | Trust | CLEAR candidate | Protects Seller spending and intelligence quality. |
| Rating/review manipulation detection | Trust | CLEAR candidate | Explicit Trust requirement. |
| Abuse detection | Trust | CLEAR candidate | Explicit Trust requirement. |
| Misleading-information detection | Trust | CLEAR candidate | Trust capability. |
| Trust signals | Trust | CLEAR candidate | Used by discovery and Buyer-facing experience. |
| Monitoring | Trust / Operations / Observability | CLARIFY | Could span Trust operations and shared platform observability. |
| Reporting | Trust / Buyer Experience / Seller Experience | CLARIFY | Reporting suspicious behavior requires product and operational ownership. |
| Human review | Trust / Operations | CLEAR concept / CLARIFY ownership | Fundamental risk-control mechanism. |
| Signal-quality filtering | Trust + Learning / Data | CLARIFY | PinkCurve must distinguish trustworthy signals from suspicious or invalid ones. |

---

### Mission-Level Product Requirements

Chapter 01 establishes several requirements that apply across PinkCurve
products.

#### Buyer Control

PinkCurve products must preserve the Buyer's ability to:

- express intent;
- navigate;
- change direction;
- reject irrelevant discovery;
- explore alternatives;
- discover outside previous behavior;
- restart when intent changes.

This requirement should constrain Buyer Intelligence, AMN, AI Discovery,
Learning Engine, and Buyer Experience.

#### Discovery Quality Over Advertising Priority

Seller spending must not automatically override Buyer relevance.

This requirement affects:

- AI Discovery;
- Business Model;
- Seller Experience;
- pricing;
- campaign controls;
- ranking;
- Trust;
- Seller Intelligence.

#### Simplicity Over Internal Complexity

The Buyer should not need to understand PinkCurve's:

- metadata architecture;
- AI;
- ranking systems;
- data architecture;
- internal intelligence systems.

Buyer Experience must hide this complexity.

#### Purposeful Learning

Learning should improve legitimate PinkCurve outcomes rather than accumulate
data without purpose.

#### Trust Before Short-Term Revenue

PinkCurve should not sacrifice long-term Buyer or Seller trust for immediate
revenue.

---

### Cross-Product Relationships Identified

Chapter 01 exposes an important discovery relationship:

Buyer
→ Buyer Experience
→ Buyer-directed navigation / AMN
→ Discovery Intelligence
→ Offerings

Buyer interactions then contribute to:

Buyer Intelligence
→ Seller Intelligence
→ Discovery improvement
→ Offering improvement
→ Creative improvement
→ Trust improvement
→ Fraud prevention
→ Platform operations

This reinforces the need for clear product boundaries and shared interaction
data rather than duplicated product-specific data collection.

---

### Important Product Boundaries Exposed by Chapter 01

#### AMN vs. Buyer Experience

AMN should own adaptive metadata-navigation behavior.

Buyer Experience should present AMN choices and capture Buyer interaction.

#### Buyer Intelligence vs. Buyer Control

Buyer Intelligence may interpret Buyer behavior, but it must not permanently
define or restrict Buyer discovery.

#### Discovery vs. Seller Spending

AI Discovery should determine worthwhile discovery according to legitimate
discovery objectives.

Seller commercial participation should not purchase unrestricted ranking
priority.

#### Trust vs. Security

Trust represents the PinkCurve product/business outcome of safer and more
credible discovery.

Underlying authentication, authorization, privacy protection, secure data
handling, and related mechanisms may belong to shared Security foundations.

The final boundary should be resolved later in the audit.

#### Trust Detection vs. Trust Operations

Fraud detection, bot detection, suspicious-activity detection, and signal
analysis are system capabilities.

Investigation, escalation, human review, response, and enforcement are
operating functions.

These responsibilities should not be conflated.

#### Learning vs. Data Collection

PinkCurve should collect interaction data for legitimate purposes.

Learning Engine and intelligence products consume appropriate information;
they should not justify unrestricted data collection.

---

### Operating Functions Identified or Implied

| Item | Classification | Status | Notes |
|---|---|---|---|
| Verification operations | Operating Function | CLEAR candidate | Verification may require automated and human processes. |
| Fraud investigation | Operating Function | CLEAR candidate | Detection alone is insufficient; suspicious activity may require investigation. |
| Abuse response | Operating Function | CLEAR candidate | Reporting and abuse detection imply operational response. |
| Human review | Operating Function | CLEAR candidate | Explicitly identified as fundamental where appropriate. |
| Platform monitoring | Operating Function / Foundation | CLARIFY | Technical monitoring and operational monitoring may require separate treatment later. |
| Seller campaign administration | Operating Function / Seller Capability | CLARIFY | Geographic/category campaign controls imply administrative and operational needs. |
| Community-resource governance | Future Operating Function | CLARIFY | Future non-commercial discovery may require validation and governance. |

---

### Architectural / Design Requirements Identified

Chapter 01 creates future Design requirements including:

- Buyer-controlled navigation;
- AMN interfaces;
- AI Discovery interfaces;
- Buyer Intelligence interfaces;
- Seller Intelligence interfaces;
- Offering Knowledge integration;
- geographic/context services;
- interaction/event capture;
- signal quality assessment;
- fraud and bot detection;
- invalid-traffic detection;
- verification workflows;
- reporting workflows;
- human-review workflows;
- privacy and consent controls;
- data-purpose boundaries;
- Buyer feedback mechanisms;
- visual-first UI;
- mobile-friendly UI;
- discovery diversity and exploration;
- Seller campaign-scope controls;
- Seller value measurement.

These requirements should eventually trace into System Design, Data Design,
Security/Trust Design, and UI/UX Design.

---

### Explicit Scope Boundaries

Chapter 01 establishes important things PinkCurve does **not** intend to
become:

- traditional marketplace;
- transaction processor;
- pay-to-win advertising network;
- text-heavy catalog;
- social-media engagement platform;
- screen-time maximization platform;
- highest-bidder attention marketplace;
- indiscriminate personal-data collection platform.

These are not merely branding statements.

They are architectural and product constraints that should be preserved when
products and capabilities are designed.

---

### Audit Questions to Carry Forward

**Q01-01 — AMN Classification**

Chapter 01 calls AMN a "core capability," while our current working
classification treats AMN as a PinkCurve product.

Chapter 23 should determine the canonical classification. A product may
contain the Adaptive Metadata Navigation capability, so terminology should
be normalized carefully.

**Q01-02 — Trust Product Boundary**

Trust includes verification, fraud detection, bot protection, trust signals,
monitoring, reporting, and human review.

Determine which belong to:
- Trust product;
- shared Security foundation;
- Data/AI foundations;
- PinkCurve Operations.

**Q01-03 — Location Capability**

Geography supports Buyer discovery, Seller campaign scope, community
resources, contextual intelligence, and Trust.

Determine whether PinkCurve needs a shared Location/Context capability rather
than duplicating location logic across products.

**Q01-04 — Brand Discovery**

Determine whether Brand Discovery is:
- a capability within AI Discovery;
- a Seller campaign/offering type;
- part of Seller Experience;
- or a coordinated capability across these products.

Do not create a standalone product unless the full audit supports it.

**Q01-05 — Signal Trustworthiness**

Chapter 01 requires PinkCurve to distinguish trustworthy signals from
suspicious or invalid signals.

Determine responsibility among:
- Trust;
- Data Architecture;
- Buyer Intelligence;
- Discovery Analytics;
- Learning Engine.

**Q01-06 — Reporting Capability**

"Reporting" is identified as a fundamental Trust capability.

Determine whether this means Buyer/Seller reporting of suspicious activity,
internal system reporting, operational reporting, or multiple capabilities.

**Q01-07 — Community Discovery**

Future community/public discovery is clearly within long-term PinkCurve
scope.

Determine whether existing Offering Knowledge, Discovery, Trust, AMN, and
Buyer Experience products can support it through additional Offering types
and capabilities rather than creating a separate platform.

**Q01-08 — Seller Experience**

The mission defines substantial Seller-facing responsibilities but still
does not explicitly establish Seller Experience as a product.

Verify later chapters before resolving classification.

---

### Cross-Chapter Findings Emerging After Chapters 00–01

The first two chapters already reveal recurring areas that should remain open
through the audit:

1. **Discovery Engine vs. AI Discovery naming**
2. **Trust product vs. shared foundation boundary**
3. **Seller Experience classification**
4. **Location/context ownership**
5. **Metadata ownership**
6. **AMN product vs. capability terminology**
7. **Buyer Intelligence integration into the canonical architecture**
8. **Trust detection vs. operational response**
9. **Signal-quality ownership**

These should remain unresolved until their dedicated chapters are audited.

---

## Chapter 01 — Vision and Mission

### Audit Purpose

Chapter 01 establishes the mission-level requirements, product philosophy,
platform boundaries, and long-term discovery objectives that PinkCurve
products and capabilities must support.

Because this chapter defines vision and mission rather than detailed product
architecture, items identified here should generally be treated as strategic
requirements or candidate classifications until confirmed by their dedicated
Blueprint chapters.

---

### Products Identified or Reinforced

| Item | Classification | Status | Notes |
|---|---|---|---|
| Offering Knowledge | Product | CLEAR | Identified as a fundamental source of structured information supporting discovery. |
| Adaptive Metadata Navigation (AMN) | Product / Core Navigation Capability | VERIFY ELSEWHERE | Explicitly identified as a core capability supporting Buyer-directed discovery and defined separately in Chapter 23. |
| Buyer Intelligence | Product | VERIFY ELSEWHERE | Explicitly identified as an area PinkCurve learning should improve. Chapter 24 defines the product and its boundaries. |
| Seller Intelligence | Product | CLEAR candidate | Explicitly identified as a Seller value capability and learning target. Verify detailed product definition in Chapter 09. |
| AI Discovery / Discovery Intelligence | Product | CLARIFY | Discovery intelligence is central throughout the chapter, but canonical naming and boundary with "Discovery Engine" remain to be normalized. |
| Learning Engine / Learning Capability | Product | CLEAR candidate | Continuous learning is a fundamental PinkCurve function. Verify detailed product definition in Chapter 08. |
| Trust | Product candidate / Cross-Platform Capability | CLARIFY | Trust is treated as a fundamental requirement affecting discovery, Buyers, Sellers, fraud prevention, and operations. Final classification remains unresolved. |
| Creative Studio / Creative Capability | Product | VERIFY ELSEWHERE | Visual storytelling and creative effectiveness are mission-level requirements. Verify against Chapter 05. |

---

### Integrated Experiences Identified

| Item | Classification | Status | Notes |
|---|---|---|---|
| Buyer Experience | Integrated Experience / Product | CLEAR | PinkCurve must provide a simple, visual, Buyer-controlled discovery experience while hiding underlying platform complexity. |
| Seller Experience | Integrated Experience / Product candidate | CLARIFY | Seller-facing needs are substantial but Seller Experience is not explicitly named as a product in this chapter. Verify later. |
| Community Discovery Experience | Future Experience / Scope Extension | CLARIFY | PinkCurve may eventually support community events, public services, organizations, local resources, and public information. This should not automatically become a separate product. |

---

### Shared / Foundation Capabilities Identified

| Item | Classification | Status | Notes |
|---|---|---|---|
| Data Architecture | Shared / Foundation Capability | CLEAR candidate | Explicitly referenced as underlying complexity Buyers should not need to understand. |
| AI Platform / AI Capability | Shared / Foundation Capability | CLEAR candidate | AI helps organize Offerings, identify metadata, suggest directions, understand context, and learn from interactions. |
| Security | Shared / Foundation Capability | CLEAR candidate | Required to support Buyer and Seller protection, fraud prevention, identity, and Trust. |
| Privacy | Shared / Foundation Capability | CLEAR | Privacy, consent, purposeful collection, and data boundaries are mission-level requirements. |
| Metadata Infrastructure | Shared Capability | CLARIFY | Meaningful metadata supports navigation, Offering organization, and discovery. Ownership should be separated among Offering Knowledge, Data Architecture, AMN, and AI Discovery. |
| Geographic / Location Capability | Shared Capability | CLARIFY | Supports Nearby discovery, geographic Seller campaigns, local resources, events, contextual discovery, and potentially Trust. |
| Interaction / Signal Infrastructure | Shared Data Capability | CLEAR candidate | Meaningful interactions provide inputs to Buyer Intelligence, Seller Intelligence, Discovery, Learning, Trust, and operations. |

---

### Major Capabilities and Features Identified

| Item | Candidate Owner | Status | Notes |
|---|---|---|---|
| Buyer-directed discovery | Buyer Experience + AMN + AI Discovery | CLEAR concept / CLARIFY ownership | Fundamental mission principle spanning multiple products. |
| Meaningful metadata navigation | AMN | CLEAR candidate | Buyers navigate discovery using meaningful metadata rather than fixed hidden catalog structures. |
| Discovery-space guidance | AMN + AI Discovery | CLARIFY | PinkCurve helps Buyers understand available discovery directions. |
| Visual storytelling | Creative Studio + Buyer Experience | CLEAR candidate | Creative Studio supports content; Buyer Experience presents it. |
| Relevant Offering discovery | AI Discovery | CLEAR candidate | Central Discovery responsibility. |
| New Offering discovery | AI Discovery | CLEAR candidate | Living discovery mode. |
| Trending Offering discovery | Discovery Analytics + AI Discovery | CLARIFY | Analytics may derive trends; Discovery consumes them. |
| Nearby Offering discovery | AI Discovery + Location Capability | CLARIFY | Requires geographic/context capability. |
| Deals/promotions discovery | Offering Knowledge + AI Discovery | CLARIFY | Offering Knowledge describes promotion; Discovery surfaces it. |
| Brand Discovery | Seller Experience / Offering Knowledge / AI Discovery | CLARIFY | Important Seller capability but ownership needs normalization. |
| Seasonal discovery | AI Discovery | CLEAR candidate | Discovery mode based on time/context. |
| Event discovery | AI Discovery + Offering Knowledge | CLEAR candidate | Applies to commercial and potentially community Offerings. |
| Community-resource discovery | Future discovery capability | CLARIFY | Long-term scope extension rather than necessarily separate product. |
| Buyer positive feedback | Buyer Experience + Buyer Intelligence | CLEAR candidate | Buyer Experience captures it; Buyer Intelligence interprets it. |
| Buyer negative feedback | Buyer Experience + Buyer Intelligence | CLEAR candidate | Important Buyer-control and intelligence capability. |
| Buyer preference/intent change | Buyer Intelligence + AMN + Buyer Experience | CLEAR candidate | PinkCurve must recognize and permit changing intent. |
| Seller Offering description | Seller Experience + Offering Knowledge | CLEAR candidate | Experience captures/manages information; Offering Knowledge owns structured knowledge. |
| Seller geographic/category campaign scope | Seller Experience + Discovery / Location | CLARIFY | Seller control over legitimate campaign scope. |
| Seller discovery measurement | Discovery Analytics + Seller Intelligence | CLEAR candidate | Analytics measures; Seller Intelligence interprets for Sellers. |
| Seller value measurement | Discovery Analytics / Business Capability | CLARIFY | Needed to demonstrate PinkCurve value to Sellers. |
| Seller verification | Trust | CLEAR candidate | Fundamental Trust capability. |
| Offering verification / validation | Trust | CLEAR candidate | Fundamental Trust capability. |
| Fraud detection | Trust | CLEAR candidate | Explicit mission-level requirement. |
| Bot detection / prevention | Trust | CLEAR candidate | Explicitly required for Buyer and Seller protection. |
| Invalid-traffic detection | Trust | CLEAR candidate | Protects Seller spending and intelligence quality. |
| Rating/review manipulation detection | Trust | CLEAR candidate | Explicit Trust requirement. |
| Abuse detection | Trust | CLEAR candidate | Explicit Trust requirement. |
| Misleading-information detection | Trust | CLEAR candidate | Trust capability. |
| Trust signals | Trust | CLEAR candidate | Used by discovery and Buyer-facing experience. |
| Monitoring | Trust / Operations / Observability | CLARIFY | Could span Trust operations and shared platform observability. |
| Reporting | Trust / Buyer Experience / Seller Experience | CLARIFY | Reporting suspicious behavior requires product and operational ownership. |
| Human review | Trust / Operations | CLEAR concept / CLARIFY ownership | Fundamental risk-control mechanism. |
| Signal-quality filtering | Trust + Learning / Data | CLARIFY | PinkCurve must distinguish trustworthy signals from suspicious or invalid ones. |

---

### Mission-Level Product Requirements

Chapter 01 establishes several requirements that apply across PinkCurve
products.

#### Buyer Control

PinkCurve products must preserve the Buyer's ability to:

- express intent;
- navigate;
- change direction;
- reject irrelevant discovery;
- explore alternatives;
- discover outside previous behavior;
- restart when intent changes.

This requirement should constrain Buyer Intelligence, AMN, AI Discovery,
Learning Engine, and Buyer Experience.

#### Discovery Quality Over Advertising Priority

Seller spending must not automatically override Buyer relevance.

This requirement affects:

- AI Discovery;
- Business Model;
- Seller Experience;
- pricing;
- campaign controls;
- ranking;
- Trust;
- Seller Intelligence.

#### Simplicity Over Internal Complexity

The Buyer should not need to understand PinkCurve's:

- metadata architecture;
- AI;
- ranking systems;
- data architecture;
- internal intelligence systems.

Buyer Experience must hide this complexity.

#### Purposeful Learning

Learning should improve legitimate PinkCurve outcomes rather than accumulate
data without purpose.

#### Trust Before Short-Term Revenue

PinkCurve should not sacrifice long-term Buyer or Seller trust for immediate
revenue.

---

### Cross-Product Relationships Identified

Chapter 01 exposes an important discovery relationship:

Buyer
→ Buyer Experience
→ Buyer-directed navigation / AMN
→ Discovery Intelligence
→ Offerings

Buyer interactions then contribute to:

Buyer Intelligence
→ Seller Intelligence
→ Discovery improvement
→ Offering improvement
→ Creative improvement
→ Trust improvement
→ Fraud prevention
→ Platform operations

This reinforces the need for clear product boundaries and shared interaction
data rather than duplicated product-specific data collection.

---

### Important Product Boundaries Exposed by Chapter 01

#### AMN vs. Buyer Experience

AMN should own adaptive metadata-navigation behavior.

Buyer Experience should present AMN choices and capture Buyer interaction.

#### Buyer Intelligence vs. Buyer Control

Buyer Intelligence may interpret Buyer behavior, but it must not permanently
define or restrict Buyer discovery.

#### Discovery vs. Seller Spending

AI Discovery should determine worthwhile discovery according to legitimate
discovery objectives.

Seller commercial participation should not purchase unrestricted ranking
priority.

#### Trust vs. Security

Trust represents the PinkCurve product/business outcome of safer and more
credible discovery.

Underlying authentication, authorization, privacy protection, secure data
handling, and related mechanisms may belong to shared Security foundations.

The final boundary should be resolved later in the audit.

#### Trust Detection vs. Trust Operations

Fraud detection, bot detection, suspicious-activity detection, and signal
analysis are system capabilities.

Investigation, escalation, human review, response, and enforcement are
operating functions.

These responsibilities should not be conflated.

#### Learning vs. Data Collection

PinkCurve should collect interaction data for legitimate purposes.

Learning Engine and intelligence products consume appropriate information;
they should not justify unrestricted data collection.

---

### Operating Functions Identified or Implied

| Item | Classification | Status | Notes |
|---|---|---|---|
| Verification operations | Operating Function | CLEAR candidate | Verification may require automated and human processes. |
| Fraud investigation | Operating Function | CLEAR candidate | Detection alone is insufficient; suspicious activity may require investigation. |
| Abuse response | Operating Function | CLEAR candidate | Reporting and abuse detection imply operational response. |
| Human review | Operating Function | CLEAR candidate | Explicitly identified as fundamental where appropriate. |
| Platform monitoring | Operating Function / Foundation | CLARIFY | Technical monitoring and operational monitoring may require separate treatment later. |
| Seller campaign administration | Operating Function / Seller Capability | CLARIFY | Geographic/category campaign controls imply administrative and operational needs. |
| Community-resource governance | Future Operating Function | CLARIFY | Future non-commercial discovery may require validation and governance. |

---

### Architectural / Design Requirements Identified

Chapter 01 creates future Design requirements including:

- Buyer-controlled navigation;
- AMN interfaces;
- AI Discovery interfaces;
- Buyer Intelligence interfaces;
- Seller Intelligence interfaces;
- Offering Knowledge integration;
- geographic/context services;
- interaction/event capture;
- signal quality assessment;
- fraud and bot detection;
- invalid-traffic detection;
- verification workflows;
- reporting workflows;
- human-review workflows;
- privacy and consent controls;
- data-purpose boundaries;
- Buyer feedback mechanisms;
- visual-first UI;
- mobile-friendly UI;
- discovery diversity and exploration;
- Seller campaign-scope controls;
- Seller value measurement.

These requirements should eventually trace into System Design, Data Design,
Security/Trust Design, and UI/UX Design.

---

### Explicit Scope Boundaries

Chapter 01 establishes important things PinkCurve does **not** intend to
become:

- traditional marketplace;
- transaction processor;
- pay-to-win advertising network;
- text-heavy catalog;
- social-media engagement platform;
- screen-time maximization platform;
- highest-bidder attention marketplace;
- indiscriminate personal-data collection platform.

These are not merely branding statements.

They are architectural and product constraints that should be preserved when
products and capabilities are designed.

---

### Audit Questions to Carry Forward

**Q01-01 — AMN Classification**

Chapter 01 calls AMN a "core capability," while our current working
classification treats AMN as a PinkCurve product.

Chapter 23 should determine the canonical classification. A product may
contain the Adaptive Metadata Navigation capability, so terminology should
be normalized carefully.

**Q01-02 — Trust Product Boundary**

Trust includes verification, fraud detection, bot protection, trust signals,
monitoring, reporting, and human review.

Determine which belong to:
- Trust product;
- shared Security foundation;
- Data/AI foundations;
- PinkCurve Operations.

**Q01-03 — Location Capability**

Geography supports Buyer discovery, Seller campaign scope, community
resources, contextual intelligence, and Trust.

Determine whether PinkCurve needs a shared Location/Context capability rather
than duplicating location logic across products.

**Q01-04 — Brand Discovery**

Determine whether Brand Discovery is:
- a capability within AI Discovery;
- a Seller campaign/offering type;
- part of Seller Experience;
- or a coordinated capability across these products.

Do not create a standalone product unless the full audit supports it.

**Q01-05 — Signal Trustworthiness**

Chapter 01 requires PinkCurve to distinguish trustworthy signals from
suspicious or invalid signals.

Determine responsibility among:
- Trust;
- Data Architecture;
- Buyer Intelligence;
- Discovery Analytics;
- Learning Engine.

**Q01-06 — Reporting Capability**

"Reporting" is identified as a fundamental Trust capability.

Determine whether this means Buyer/Seller reporting of suspicious activity,
internal system reporting, operational reporting, or multiple capabilities.

**Q01-07 — Community Discovery**

Future community/public discovery is clearly within long-term PinkCurve
scope.

Determine whether existing Offering Knowledge, Discovery, Trust, AMN, and
Buyer Experience products can support it through additional Offering types
and capabilities rather than creating a separate platform.

**Q01-08 — Seller Experience**

The mission defines substantial Seller-facing responsibilities but still
does not explicitly establish Seller Experience as a product.

Verify later chapters before resolving classification.

---

### Cross-Chapter Findings Emerging After Chapters 00–01

The first two chapters already reveal recurring areas that should remain open
through the audit:

1. **Discovery Engine vs. AI Discovery naming**
2. **Trust product vs. shared foundation boundary**
3. **Seller Experience classification**
4. **Location/context ownership**
5. **Metadata ownership**
6. **AMN product vs. capability terminology**
7. **Buyer Intelligence integration into the canonical architecture**
8. **Trust detection vs. operational response**
9. **Signal-quality ownership**

These should remain unresolved until their dedicated chapters are audited.

---

### Chapter 01 Audit Assessment

**Overall Status: CLEAR WITH STRONG CROSS-PRODUCT REQUIREMENTS**

Chapter 01 provides a strong mission framework and does not reveal a
definitive Blueprint capability gap at this stage.

Its primary audit value is establishing constraints that every PinkCurve
product must respect:

1. Buyers control discovery.
2. AI assists rather than dictates discovery.
3. Seller spending does not override relevance.
4. PinkCurve remains visual and simple at the surface.
5. Learning must have legitimate purpose.
6. Privacy and data boundaries are fundamental.
7. Trust protects both Buyers and Sellers.
8. Fraud, bots, invalid traffic, manipulation, and abuse require active
   protection.
9. Human review remains part of appropriate Trust processes.
10. PinkCurve optimizes discovery value rather than screen time.
11. Commercial and future community discovery should share the same core
    mission.
12. Internal sophistication must not create Buyer-facing complexity.

No changes to Chapter 01 are recommended during this audit pass.

Revisit it after the Product & Capability Map has been consolidated to ensure
that the final PinkCurve product portfolio remains consistent with the
Vision and Mission.

---

## Chapter 02 — Design Principles

### Audit Purpose

Chapter 02 establishes the design rules that should govern PinkCurve products,
capabilities, architecture, AI, data, Trust, operations, and user experiences.

Unlike a product-definition chapter, it should not be interpreted as creating
a separate product for every principle or capability it mentions.

Its primary importance to the Product & Capability Audit is establishing the
criteria PinkCurve should use when deciding:

- whether a capability is necessary;
- where that capability belongs;
- whether it requires a separate product boundary;
- whether it requires a separate architectural component;
- how products should communicate;
- how much complexity is justified;
- which responsibilities must remain shared foundations.

---

### Products Identified or Reinforced

| Item | Classification | Status | Notes |
|---|---|---|---|
| Offering Knowledge | Product | CLEAR | Identified as a first-class domain capability and foundation for Discovery, Creative, Intelligence, Trust, and AMN. |
| Adaptive Metadata Navigation (AMN) | Product / Core Navigation Capability | VERIFY ELSEWHERE | Identified as the primary architecture for applying metadata-driven navigation. Chapter 23 should determine final classification. |
| Buyer Intelligence | Product | CLEAR candidate | Continuous learning should support Buyer Intelligence; privacy principle distinguishes session data from persistent Buyer Intelligence. |
| Seller Intelligence | Product | CLEAR candidate | Learning and trustworthy Seller outcomes explicitly support Seller Intelligence. |
| AI Discovery / Discovery | Product | CLEAR candidate / NAME CLARIFY | Ranking, relevance, discovery modes, Trust signals, and Buyer control all constrain this product. Canonical naming remains unresolved. |
| Learning Engine | Product | CLEAR candidate | Continuous learning and signal-quality requirements strongly establish this responsibility. |
| Creative Studio | Product | CLEAR candidate | Visual storytelling, Offering Knowledge, and creative effectiveness reinforce Creative Studio responsibility. |
| Trust | Product candidate / Cross-Platform Capability | CLARIFY | "Trust Is Designed In" establishes Trust as architectural rather than an afterthought, but product/foundation/operations boundaries remain unresolved. |

---

### Integrated Experiences Identified

| Item | Classification | Status | Notes |
|---|---|---|---|
| Buyer Experience | Integrated Experience / Product | CLEAR | Visual-first, progressive disclosure, Buyer control, simplicity, feedback, and understandable status are Buyer Experience responsibilities. |
| Seller Experience | Integrated Experience / Product candidate | CLARIFY | Seller-facing performance explanation, campaign scope, Offering description, appeals, billing disputes, and other Seller interactions reinforce the need to evaluate Seller Experience as a product. |

---

### Shared / Foundation Capabilities Identified

| Item | Classification | Status | Notes |
|---|---|---|---|
| Data Architecture | Shared / Foundation Capability | CLEAR | Data modeling, ownership, quality, lineage, governance, lifecycle, event handling, and retention are explicit technical principles. |
| Security | Shared / Foundation Capability | CLEAR | Security is explicitly a design constraint applying across PinkCurve, including AI systems. |
| Privacy | Shared / Foundation Capability | CLEAR | Data minimization, consent, retention, personalization controls, and separation of data purposes apply across products. |
| AI Platform | Shared / Foundation Capability candidate | CLEAR candidate | Multiple products require AI while users should not need to understand the underlying AI systems. |
| Observability | Shared / Foundation Capability | CLEAR candidate | Logging, metrics, tracing, audit events, model monitoring, and operational signals should be built into systems. |
| API / Interface Architecture | Shared Architectural Capability | CLEAR candidate | Major capabilities require clear contracts and interfaces without automatically requiring independent services. |
| Metadata Infrastructure | Shared Capability | CLARIFY | Offering metadata, navigation metadata, Trust metadata, location metadata, and discovery metadata require clear ownership boundaries. |
| Location / Context Capability | Shared Capability | CLARIFY | Nearby and contextual metadata reinforce the location/context requirement identified in Chapters 00–01. |
| Identity and Access | Shared Security Capability | CLEAR candidate | Authentication and authorization are explicitly required from the beginning. |
| Event / Signal Infrastructure | Shared Data Capability | CLEAR candidate | Buyer and Seller interactions generate structured events consumed by learning, analytics, and intelligence products. |
| Model Monitoring | Shared AI / Observability Capability | CLEAR candidate | AI/model degradation and evaluation require cross-product monitoring. |

---

### Major Capabilities and Features Identified

| Item | Candidate Owner | Status | Notes |
|---|---|---|---|
| Living discovery | AI Discovery + Buyer Experience | CLEAR concept | Discovery should remain useful, fresh, relevant, nearby, trending, promotional, and exploratory. |
| Buyer-directed discovery | Buyer Experience + AMN + AI Discovery | CLEAR concept | Fundamental cross-product requirement. |
| Intent expression | Buyer Experience / AMN | CLEAR candidate | Buyer-facing mechanism feeding navigation and intelligence. |
| Positive feedback | Buyer Experience + Buyer Intelligence | CLEAR candidate | Experience captures; Intelligence interprets. |
| Negative feedback | Buyer Experience + Buyer Intelligence | CLEAR candidate | Explicitly required. |
| Personalization reset | Buyer Experience + Buyer Intelligence | CLEAR candidate | Buyer should be able to reset appropriate learned preferences/personalization. |
| Visual discovery | Buyer Experience | CLEAR | Core experience capability. |
| Progressive disclosure | Buyer Experience | CLEAR | UI/UX capability controlling complexity. |
| Metadata-driven navigation | AMN | CLEAR candidate | Primary AMN responsibility. |
| Metadata enrichment | Offering Knowledge | CLEAR candidate | Rich structured knowledge supports multiple products. |
| Knowledge validation | Offering Knowledge + Trust | CLARIFY | Knowledge quality and Trust verification responsibilities may overlap and need boundaries. |
| Knowledge provenance | Offering Knowledge / Data Architecture | CLARIFY | Offering Knowledge requires provenance; Data Architecture may provide underlying lineage infrastructure. |
| Knowledge confidence | Offering Knowledge | CLEAR candidate | Product-level knowledge quality capability. |
| Discovery ranking | AI Discovery | CLEAR candidate | Must respect Buyer relevance, Trust, and Seller-spending constraints. |
| Campaign eligibility | Seller Experience / Business / Trust | CLARIFY | Explicitly separate from discovery relevance. |
| Brand Discovery | Multiple products | CLARIFY | Continues as a cross-product capability question. |
| Interaction event generation | Products + Data Architecture | CLARIFY boundary | Products generate events; Data Architecture should provide common event infrastructure. |
| Explicit/implicit signal distinction | Buyer Intelligence / Seller Intelligence / Data | CLEAR concept | Required for trustworthy learning. |
| Valid/invalid traffic distinction | Trust + Data / Analytics | CLARIFY | Cross-product responsibility. |
| Seller verification | Trust | CLEAR candidate | Explicit Trust capability. |
| Buyer verification | Trust | CLEAR candidate | Required where appropriate. |
| Offering verification and approval | Trust | CLEAR candidate | Explicit capability. |
| Fraud/scam detection | Trust | CLEAR candidate | Explicit capability. |
| Bot detection | Trust | CLEAR candidate | Explicit capability. |
| Invalid-traffic detection | Trust | CLEAR candidate | Explicit capability. |
| Review/rating manipulation detection | Trust | CLEAR candidate | Explicit capability. |
| Abuse prevention | Trust | CLEAR candidate | Explicit capability. |
| Reporting | Trust + Experiences + Operations | CLARIFY | Requires UI, workflow, and operational response. |
| Reverification | Trust | CLEAR candidate | Newly explicit Trust capability. |
| Appeals | Trust + Experiences + Operations | CLEAR candidate | Requires product workflow and human process. |
| Continuous Trust monitoring | Trust + Observability | CLARIFY | Trust monitoring and technical observability need distinct responsibilities. |
| Personalization controls | Buyer Experience + Buyer Intelligence | CLEAR candidate | Explicit privacy requirement. |
| Consent management | Privacy / Identity / Experiences | CLARIFY | Shared capability surfaced through registration and other user workflows. |
| Data retention | Data Architecture + Privacy | CLEAR candidate | Shared governance capability. |
| Data minimization | Privacy + Product Design | CLEAR | Cross-product design requirement. |
| Authentication | Identity/Security | CLEAR candidate | Shared foundation. |
| Authorization | Identity/Security | CLEAR candidate | Shared foundation. |
| Auditability | Security / Data / Observability | CLEAR candidate | Sensitive operations must be auditable. |
| Failure handling | All products + Platform | CLEAR design requirement | Critical workflows require defined failure behavior. |
| Human fallback | Product + Operations | CLEAR concept | Required where appropriate. |

---

### Operating Functions Identified

Chapter 02 significantly expands the operational inventory.

| Item | Classification | Status | Notes |
|---|---|---|---|
| Verification review | Operating Function | CLEAR candidate | Human escalation may be required. |
| Fraud investigation | Operating Function | CLEAR | Explicitly identified. |
| Appeals handling | Operating Function | CLEAR | Explicitly identified. |
| Customer Support | Operating Function / Product candidate | CLARIFY | Explicit human-escalation area. Later chapter should determine whether Customer Support also has a product/system component. |
| Billing dispute handling | Operating Function | CLEAR candidate | Explicitly requires human accountability. |
| Content review | Operating Function | CLEAR candidate | Explicitly identified. |
| Security incident response | Operating Function | CLEAR candidate | Explicitly identified. |
| AI/model evaluation | Operating Function / AI Governance | CLEAR candidate | Requires ongoing human accountability. |
| Operational incident response | Operating Function | CLEAR candidate | Observability must support investigation. |
| Trust monitoring | Operating Function | CLEAR candidate | Continuous monitoring is required. |
| Data governance | Operating Function + Foundation Capability | CLEAR candidate | Data ownership, quality, lineage, retention, and lifecycle require governance responsibility. |

---

### Critical Architecture Principles for Chapter 25

Chapter 02 establishes several principles that should directly constrain the
Product & Capability Map.

#### A Capability Does Not Automatically Become a Product

A capability should become a separate product only when its responsibility,
lifecycle, consumers, and evolution justify that boundary.

#### A Product Does Not Automatically Become a Service

PinkCurve explicitly states:

> API-first does not mean API-only.

Clear product and capability boundaries may be implemented initially within
a simpler architecture.

A future System Design may later determine whether separation into services
is justified.

#### A Product Does Not Automatically Become a Team or Department

Product boundaries describe responsibilities.

They do not automatically prescribe organizational boundaries.

A small PinkCurve organization may have one person performing multiple roles
while the responsibilities themselves remain clearly defined.

#### Architecture Should Follow Responsibility

PinkCurve should establish responsibility boundaries before choosing
technology.

The Product & Capability Map should therefore precede detailed System Design.

#### Complexity Requires Evidence

PinkCurve should prefer the simplest architecture that reliably satisfies
the product requirement.

This principle should protect PinkCurve from unnecessary:

- products;
- services;
- microservices;
- databases;
- infrastructure;
- projects;
- teams;
- organizational units.

---

### Product Boundary Findings

#### Offering Knowledge vs. Metadata Infrastructure

Offering Knowledge should own the meaning and quality of Offering knowledge.

Data Architecture should own shared storage, modeling, lineage, and
governance mechanisms.

AMN should own adaptive use of metadata for navigation.

AI Discovery should consume metadata for discovery decisions.

Buyer Experience should present appropriate metadata without exposing the
underlying complexity.

This emerging boundary should be tested against Chapters 03, 04, 06, 11,
20, and 23.

#### Trust vs. Security

Chapter 02 strongly reinforces a distinction:

Security is a universal design constraint.

Trust includes product-level outcomes such as verification, approval, fraud
protection, Trust signals, reporting, reverification, appeals, and monitoring.

The detailed Trust chapter should determine the final boundary.

#### Observability vs. Discovery Analytics

Observability answers:

"What are PinkCurve systems doing?"

Discovery Analytics answers:

"What is happening in discovery and what outcomes are being produced?"

These should not become the same product.

#### Buyer Intelligence vs. Personalization

Buyer Intelligence produces and maintains appropriate Buyer intelligence.

Personalization is one possible use of that intelligence.

Buyer Intelligence should therefore not be defined merely as a
personalization system.

#### Data Architecture vs. Learning

Data Architecture manages trustworthy data and data lifecycle.

Learning Engine learns from appropriate evidence.

Data collection should not be justified simply because future learning might
find the data useful.

---

### Important New Capability Candidate: Identity and Access

Chapter 02 explicitly requires authentication and authorization to be
designed from the start.

Combined with requirements already identified for:

- Buyer registration;
- Seller registration;
- verification;
- consent;
- legal acknowledgment;
- account continuity;
- security;

the audit should track whether PinkCurve requires a canonical shared
**Identity and Access capability**.

Do not yet classify this as a standalone product.

Later chapters should determine whether it belongs primarily under:

- Security;
- Trust;
- shared platform foundation;
- Buyer/Seller account capabilities.

---

### Important New Capability Candidate: Observability

Chapter 02 explicitly requires:

- logging;
- metrics;
- tracing;
- audit events;
- model monitoring;
- operational signals.

This is sufficiently broad and cross-product that **Observability should be
tracked as a candidate Shared / Foundation Capability**.

It should not be confused with Discovery Analytics.

---

### Important New Capability Candidate: Consent and Preference Control

Privacy requirements identify:

- meaningful consent;
- personalization controls;
- data-purpose separation;
- retention;
- session vs. persistent intelligence.

Combined with the newly identified registration legal acknowledgment
requirement, the audit should track a broader capability area involving:

**Consent, Agreements, and Preference Control.**

Do not yet create a separate product.

Later chapters should determine whether these functions belong across
Identity, Privacy, Buyer Experience, Seller Experience, and Trust.

---

### Human Accountability Model

Chapter 02 establishes an important architectural and operational pattern:

AI / Automation
      ↓
Routine Decision or Assistance
      ↓
Confidence / Risk / Consequence Evaluation
      ↓
┌─────────────────────┐
│ Normal Case         │ → Automated Processing
└─────────────────────┘

              OR

┌─────────────────────┐
│ Ambiguous /         │
│ Consequential Case  │ → Human Escalation
└─────────────────────┘

This pattern may apply across:

- verification;
- fraud;
- appeals;
- Customer Support;
- billing;
- content review;
- security;
- AI/model evaluation.

Human-in-the-loop should therefore be treated as a cross-product operating
pattern rather than automatically creating a separate product.

---

### Architectural / Design Requirements Identified

Chapter 02 establishes requirements for later PinkCurve Design work,
including:

- product responsibility boundaries;
- API/interface contracts;
- event contracts;
- metadata contracts;
- identity and authorization;
- consent handling;
- privacy controls;
- data retention;
- data lineage;
- data quality;
- observability;
- logging;
- tracing;
- model monitoring;
- auditability;
- graceful degradation;
- failure behavior;
- human fallback;
- fraud/bot protection;
- invalid-signal filtering;
- Buyer personalization controls;
- progressive disclosure;
- mobile visual UI;
- Seller performance explanation;
- Trust explanation;
- appeals workflows;
- reporting workflows.

These requirements should be traced later into:

- System Design;
- Data Design;
- API/Interface Design;
- Security/Trust Design;
- AI/ML Design;
- UI/UX Design;
- Operations Design.

---

### Audit Questions to Carry Forward

**Q02-01 — Product vs. Capability Rule**

Define the criteria Chapter 25 will use to determine when a major capability
qualifies as a PinkCurve product.

This should prevent arbitrary product proliferation.

**Q02-02 — AMN Product vs. Architecture vs. Capability**

Chapter 02 calls AMN the "primary architecture" for applying metadata
navigation.

Chapter 01 calls it a "core capability."

Our current working model calls AMN a product.

Chapter 23 should resolve these terms without losing the distinction between
the AMN product and the navigation architecture/capability it provides.

**Q02-03 — Identity and Access**

Determine whether Identity and Access should become an explicit shared
foundation capability.

Trace:

- registration;
- authentication;
- authorization;
- account identity;
- verification;
- consent;
- legal acknowledgment.

**Q02-04 — Observability**

Determine whether Observability should be explicitly represented in the
Product & Capability Map as a shared foundation capability.

**Q02-05 — Consent, Agreements, and Preferences**

Determine canonical ownership for:

- legal acknowledgment;
- privacy consent;
- personalization consent/control;
- terms acceptance;
- agreement versions;
- consent history.

**Q02-06 — Customer Support**

Chapter 02 explicitly identifies Customer Support as an area requiring human
escalation.

Determine whether Customer Support consists of:

- a PinkCurve product/system capability;
- an operating function;
- or both.

**Q02-07 — Trust Appeals and Reverification**

These capabilities are explicitly identified here.

Verify that the dedicated Trust and approval chapters adequately define them.

**Q02-08 — Observability vs. Analytics**

Maintain a clear distinction between platform/system observability and
Discovery Analytics.

**Q02-09 — Knowledge Provenance**

Determine responsibility between Offering Knowledge and Data Architecture for
knowledge provenance, lineage, confidence, and validation.

**Q02-10 — Human-in-the-Loop Architecture**

Determine whether later Design documentation should define a common human
review/escalation framework reusable across Trust, Support, Billing,
Security, and AI evaluation.

---

### Cross-Chapter Findings Emerging After Chapters 00–02

Recurring questions now include:

1. Discovery Engine vs. AI Discovery naming.
2. Trust product vs. Security foundation vs. Operations.
3. Seller Experience classification.
4. AMN product vs. capability vs. architecture terminology.
5. Location/context ownership.
6. Metadata ownership.
7. Identity and Access as a possible shared foundation.
8. Consent/agreements/preference control.
9. Observability as a shared foundation.
10. Customer Support product vs. operating function.
11. Signal-quality ownership.
12. Human review as a reusable cross-product operating pattern.
13. Product boundaries should not automatically create service boundaries.
14. Product boundaries should not automatically create organizational
    boundaries.

---

### Chapter 02 Audit Assessment

**Overall Status: CLEAR — FOUNDATIONAL FOR PRODUCT CLASSIFICATION**

Chapter 02 does not reveal a definitive missing PinkCurve product at this
stage.

Instead, it establishes several critical rules for the Product & Capability
Map:

1. Define responsibilities before technology.
2. Do not turn every capability into a product.
3. Do not turn every product into a service.
4. Do not turn every product into a department.
5. Prefer clear interfaces between major responsibilities.
6. Avoid unnecessary microservices and infrastructure.
7. Treat Data Architecture, Security, Privacy, and Observability as
   cross-product concerns.
8. Preserve human accountability for consequential or ambiguous decisions.
9. Build Trust into product architecture.
10. Build observability into systems.
11. Keep AI and technical complexity behind simple experiences.
12. Require measurable value before adding complexity.

These principles should directly govern how Chapter 25 classifies the final
PinkCurve product portfolio.

No changes to Chapter 02 are recommended during this audit pass.

Revisit Chapter 02 only if the final Product & Capability Map reveals a
classification or architectural principle that conflicts with these design
rules.

---

## Chapter 03 — Product Architecture

### Audit Purpose

Chapter 03 is a primary source for the Product & Capability Audit because it
attempts to define PinkCurve's major platform systems, their responsibilities,
their relationships, shared infrastructure, data flow, APIs, and architectural
evolution.

This chapter should therefore be treated as an important architectural
inventory, but not automatically as the final Product & Capability Map.

Several concepts in Chapter 03 predate later Blueprint decisions, particularly
the explicit definition of Adaptive Metadata Navigation and Buyer Intelligence
as major PinkCurve products.

The audit should preserve those differences for later consolidation rather
than immediately rewriting Chapter 03.

---

### Major Products Identified

| Item | Classification | Status | Notes |
|---|---|---|---|
| Offering Knowledge | Product | CLEAR | Major domain product centered on the Offering. |
| Creative Studio | Product | CLEAR | Produces and manages visual discovery creative based on Offering Knowledge. |
| Discovery Engine / AI Discovery | Product | CLEAR / NAME CLARIFY | Determines which Offerings should be presented. Canonical product name still requires normalization. |
| Buyer Experience | Integrated Experience / Product | CLEAR | Primary Buyer-facing discovery surface. |
| Discovery Analytics | Product | CLEAR | Measures discovery activity, effectiveness, Seller value, and related outcomes. |
| Learning Engine | Product | CLEAR | Converts appropriate interaction signals into platform improvements. |
| Seller Intelligence | Product | CLEAR | Specialized intelligence product serving Sellers. |
| Buyer Intelligence | Product | CLEAR | Chapter 03 identifies it under Participant Intelligence; Chapter 24 now provides its dedicated product definition. |
| Adaptive Metadata Navigation | Product / Navigation System | CLARIFY ARCHITECTURE | Chapter 03 places AMN primarily inside Buyer Experience and represents Metadata Navigation separately in the data flow. Chapter 23 now provides a dedicated definition. |
| Trust | Platform-Wide Product / Capability candidate | CLARIFY | Explicitly described as a platform-wide architectural capability. Final product/foundation boundary remains open. |
| AI Platform | Shared Platform Product / Foundation | CLEAR candidate | Explicitly provides shared AI capabilities across PinkCurve. |

---

### Legacy / Umbrella Concepts Requiring Reassessment

#### Participant Platform

Chapter 03 defines a Participant Platform responsible for:

- participant registration;
- authentication;
- identity and contact verification;
- Seller/organization onboarding;
- Buyer account management;
- Offering management;
- workspace management;
- account security;
- participant status/reputation.

This is an important collection of capabilities, but the term
**Participant Platform** requires reassessment.

Later Blueprint work has moved toward explicit Buyer and Seller concepts and
has reduced use of "Participant" because it can obscure ownership.

Do not remove the capabilities.

Determine during consolidation whether they belong to:

- Identity & Access;
- Buyer Experience / Buyer Account;
- Seller Experience / Seller Account;
- Trust;
- Offering Knowledge;
- shared platform services.

**Status: CLARIFY / POSSIBLE LEGACY UMBRELLA**

---

#### Participant Intelligence

Chapter 03 defines Participant Intelligence as an umbrella containing:

- Seller Intelligence;
- Buyer Intelligence;
- future Community Intelligence.

Buyer Intelligence and Seller Intelligence are now sufficiently substantial
to be treated independently in the Product & Capability Map.

Determine whether "Participant Intelligence" still provides useful
architectural value or is merely an older umbrella term.

**Status: CLARIFY / POSSIBLE LEGACY UMBRELLA**

---

### Integrated Experiences Identified

| Item | Classification | Status | Notes |
|---|---|---|---|
| Buyer Experience | Integrated Experience / Product | CLEAR | Primary Buyer-facing interface coordinating underlying products. |
| Seller Experience | Integrated Experience / Product candidate | CLARIFY | Not explicitly represented as a System Component despite substantial Seller-facing responsibilities elsewhere. |
| Discovery Feed | Buyer Experience Capability / Experience | CLARIFY | Chapter 03 lists Discovery Feed as a separate system component, but its responsibilities appear primarily to describe a Buyer Experience discovery surface powered by AI Discovery and other products. |
| Community Discovery | Future Experience / Capability | CLARIFY | Likely extension of existing discovery architecture rather than automatically a separate product. |

---

### Shared / Foundation Capabilities Identified

| Item | Classification | Status | Notes |
|---|---|---|---|
| Data Architecture | Shared / Foundation Capability | CLEAR | Referenced throughout and supported by explicit infrastructure/data-flow requirements. |
| AI Platform | Shared / Foundation Capability | CLEAR | Explicitly shared across Offering Knowledge, Creative, Discovery, Learning, Intelligence, Trust, Support, and Operations. |
| Security | Shared / Foundation Capability | CLEAR | Cross-platform architectural requirement. |
| Privacy | Shared / Foundation Capability | CLEAR | Cross-platform architectural requirement. |
| Identity & Access | Shared Capability candidate | STRONGLY REINFORCED | Participant Platform responsibilities strongly support the candidate identified in Chapter 02. |
| Observability | Shared / Foundation Capability | CLEAR candidate | Explicit API and AI Platform requirement. |
| Event Processing | Shared Infrastructure Capability | CLEAR candidate | Planned infrastructure capability supporting asynchronous platform processing. |
| Vector Retrieval / Semantic Retrieval | Shared AI/Data Capability | CLEAR candidate | Used by Discovery and potentially multiple intelligence/knowledge products. |
| Object / Media Storage | Shared Infrastructure Capability | CLEAR candidate | Required for visual creative and Offering assets. |
| Caching | Shared Infrastructure Capability | CLEAR candidate | Cross-platform performance capability. |
| API / Interface Layer | Shared Architectural Capability | CLEAR | Provides consistent interfaces between platform components. |
| Location / Context | Shared Capability | CLARIFY | Reappears in Offering Knowledge, Discovery, Buyer Experience, Buyer Intelligence, and future Community Intelligence. |

---

### Major Capabilities and Candidate Ownership

| Capability | Candidate Owner | Status |
|---|---|---|
| Buyer registration | Identity & Access + Buyer Experience | CLARIFY |
| Seller registration | Identity & Access + Seller Experience | CLARIFY |
| Authentication | Identity & Access / Security | CLEAR candidate |
| Authorization | Identity & Access / Security | CLEAR candidate |
| Identity verification | Trust + Identity & Access | CLARIFY boundary |
| Contact verification | Trust + Identity & Access | CLARIFY boundary |
| Buyer account management | Buyer Experience / Account Capability | CLARIFY |
| Seller account management | Seller Experience / Account Capability | CLARIFY |
| Organization onboarding | Seller Experience + Trust | CLARIFY |
| Workspace management | Seller Experience | CLEAR candidate |
| Offering management | Seller Experience + Offering Knowledge | CLARIFY boundary |
| Multi-offering management | Seller Experience + Offering Knowledge | CLARIFY boundary |
| Team collaboration | Seller Experience | CLEAR candidate |
| Participant/account reputation | Trust | CLEAR candidate |
| Offering Knowledge management | Offering Knowledge | CLEAR |
| AI knowledge extraction | Offering Knowledge + AI Platform | CLEAR |
| URL Offering analysis | Offering Knowledge + AI Platform | CLEAR |
| Metadata generation | Offering Knowledge + AI Platform | CLEAR |
| Knowledge completeness | Offering Knowledge | CLEAR |
| Knowledge validation | Offering Knowledge + Trust | CLARIFY |
| Knowledge versioning | Offering Knowledge + Data Architecture | CLEAR candidate |
| Creative generation | Creative Studio + AI Platform | CLEAR |
| Creative asset management | Creative Studio | CLEAR |
| Campaign creation | Creative Studio / Seller Experience | CLARIFY |
| Creative A/B testing | Creative Studio + Discovery Analytics | CLARIFY |
| Creative performance learning | Creative Studio + Analytics + Learning Engine | CLARIFY |
| Discovery ranking | AI Discovery | CLEAR |
| Personalized discovery | AI Discovery + Buyer Intelligence | CLEAR boundary candidate |
| Metadata-guided discovery | AI Discovery + AMN | CLEAR boundary candidate |
| Location-aware discovery | AI Discovery + Location capability | CLARIFY |
| Trending discovery | AI Discovery + Discovery Analytics | CLARIFY |
| Brand Discovery | AI Discovery + Seller Experience + Offering Knowledge | CLARIFY |
| Discovery Feed | Buyer Experience + AI Discovery | CLARIFY |
| Positive/negative feedback capture | Buyer Experience | CLEAR |
| Feedback interpretation | Buyer Intelligence | CLEAR |
| Metadata navigation | AMN | CLEAR candidate |
| Discovery event tracking | Discovery Analytics + Data Architecture | CLARIFY boundary |
| Discovery Score | Discovery Analytics | CLEAR |
| Seller value measurement | Discovery Analytics | CLEAR |
| Brand-recognition measurement | Discovery Analytics | CLEAR |
| Learning from interactions | Learning Engine | CLEAR |
| Buyer intelligence generation | Buyer Intelligence | CLEAR |
| Seller intelligence generation | Seller Intelligence | CLEAR |
| Seller verification | Trust | CLEAR |
| Buyer verification | Trust | CLEAR |
| Offering verification | Trust | CLEAR |
| Fraud/scam detection | Trust | CLEAR |
| Bot detection | Trust | CLEAR |
| Abuse prevention | Trust | CLEAR |
| Suspicious-activity detection | Trust | CLEAR |
| Content integrity | Trust | CLEAR candidate |
| AI model management | AI Platform | CLEAR |
| Prompt management | AI Platform | CLEAR |
| Model evaluation | AI Platform | CLEAR |
| AI observability | AI Platform + Observability | CLEAR candidate |
| AI safety controls | AI Platform + Trust/Security | CLARIFY |
| Human-in-the-loop infrastructure | AI Platform / Operations | CLARIFY |

---

### Critical Boundary: Experience vs. Intelligence

Chapter 03 reinforces an important architectural distinction.

Buyer Experience owns:

- what the Buyer sees;
- visual interaction;
- controls;
- feedback mechanisms;
- presentation;
- navigation UI.

Buyer Intelligence owns:

- interpreted Buyer signals;
- preferences;
- intent patterns;
- negative preferences;
- short-term/persistent intelligence;
- contextual intelligence;
- inferred intelligence.

AMN owns:

- adaptive metadata navigation;
- meaningful navigation dimensions;
- metadata-driven refinement.

AI Discovery owns:

- determining appropriate Offerings using available signals.

Conceptually:

Buyer
  ↓
Buyer Experience
  ↓
AMN / Buyer Intelligence / AI Discovery
  ↓
Supporting Products and Foundations
  ↓
Buyer Experience
  ↓
Buyer

This architecture is clearer than treating Buyer Intent and Metadata Signals
as undifferentiated inputs to the Discovery Engine.

---

### Critical Boundary: Registration, Identity, and Verification

Chapter 03 provides strong evidence that registration should not be treated
as merely a UI feature.

A possible responsibility model emerging from the audit is:

Buyer/Seller Experience
        ↓
Registration Workflow
        ↓
Identity & Access
        ↓
Authentication / Account Identity
        ↓
Trust
        ↓
Verification / Risk Evaluation

The exact interfaces remain for System Design.

This model would separate:

**Experience**
- registration screens;
- account interaction;
- user guidance.

**Identity & Access**
- account identity;
- authentication;
- authorization;
- account access.

**Trust**
- identity/contact verification;
- Seller/Buyer verification status;
- fraud/risk evaluation;
- suspicious activity.

This should be tested against Chapters 12 and later verification/approval
chapters.

---

### Critical Boundary: Offering Management

Chapter 03 currently assigns Offering Management to Participant Platform.

A cleaner candidate boundary is:

Seller Experience
      ↓
Seller creates/manages Offering
      ↓
Offering Knowledge
      ↓
Structured Offering record/knowledge
      ↓
Trust
      ↓
Verification / Approval
      ↓
Eligible for Discovery

This is not yet a final decision.

Audit Chapters 04, 12, and Seller Experience before resolving it.

---

### Critical Boundary: Analytics, Learning, and Intelligence

Chapter 03 currently shows:

Buyer Experience
→ Discovery Analytics
→ Learning Engine
→ Participant Intelligence

This is useful conceptually but may be too linear.

The newer product model suggests that interaction events may first enter
shared data/event infrastructure.

Then authorized products consume appropriate information:

Buyer Experience
       ↓
Interaction Events
       ↓
Data / Event Infrastructure
       ↓
 ┌──────────────┬──────────────┬───────────────┐
 ↓              ↓              ↓               ↓
Analytics   Buyer Intel.   Learning Engine   Trust
 ↓              ↓              ↓               ↓
Metrics       Signals       Improvements    Risk Signals

This possibility should be evaluated during System Design.

The Product & Capability Map should define responsibilities without
prematurely prescribing the final event architecture.

---

### Critical Boundary: AI Platform vs. AI Products

Chapter 03 makes an important distinction:

**AI Platform provides shared AI mechanisms.**

Products use those mechanisms to fulfill product responsibilities.

Examples:

AI Platform provides:
- LLM integration;
- embeddings;
- vector retrieval;
- model management;
- prompt management;
- model evaluation;
- AI observability;
- safety controls;
- reusable human-in-the-loop mechanisms.

Offering Knowledge uses AI to understand Offerings.

Creative Studio uses AI to assist creative work.

AI Discovery uses AI to determine discovery.

Buyer Intelligence uses AI where appropriate to derive intelligence.

Seller Intelligence uses AI where appropriate to derive Seller insight.

Trust uses AI where appropriate for detection and prioritization.

Therefore:

> Using AI does not make a capability part of the AI Platform.

The product owning the business responsibility remains responsible for the
outcome.

---

### Discovery Feed Classification

Chapter 03 gives Discovery Feed its own numbered System Component.

However, the described function is primarily:

- presenting New;
- Trending;
- Promotions;
- Discounts;
- Nearby/location trends;
- Brand Discovery;
- Community bulletins;
- public information;
- personalized discovery.

These inputs are largely produced by other products.

The Discovery Feed therefore appears more likely to be a **Buyer Experience
capability / discovery surface** than an independent PinkCurve product.

**Status: CLARIFY**

This is a good example of why a "System Component" should not automatically
become a "Product."

---

### Trust Architecture Finding

Chapter 03 explicitly states:

"Trust is a platform-wide architectural capability."

It also says Trust, safety, security, privacy, and fraud prevention operate
across the entire architecture rather than as one isolated component.

This strongly supports a layered interpretation:

Trust Product / Trust Capabilities
        +
Security Foundation
        +
Privacy Foundation
        +
Trust Operations
        ↓
Cross-cutting protection of PinkCurve

The final classification should wait for Chapter 12.

---

### Location / Context Finding

Location now appears in:

- Offering Knowledge;
- Discovery signals;
- location-aware discovery;
- Buyer Experience;
- Discovery Feed;
- Buyer Intelligence;
- Community Intelligence;
- Seller/organization activities.

This is now recurring strongly enough that the audit should continue tracking
a shared **Location / Context Capability**.

However, this does not mean a separate Location product is required.

Potential responsibility:

Location/Context Foundation
        ↓
Provides normalized geographic/context information
        ↓
AMN
AI Discovery
Buyer Intelligence
Trust
Buyer Experience
Seller Experience
Community Discovery

Later chapters should confirm whether this boundary is useful.

---

### Data and Infrastructure Capabilities Identified

Chapter 03 explicitly identifies or implies:

- PostgreSQL / structured persistence;
- vector search;
- event processing;
- ML/AI infrastructure;
- caching;
- CDN;
- object storage;
- APIs;
- REST interfaces;
- event-driven messaging;
- authentication/authorization;
- API versioning;
- error handling;
- observability;
- rate limiting;
- service isolation;
- security controls;
- background AI processing;
- distributed storage;
- independent workload scaling.

These are primarily **implementation/infrastructure capabilities**, not
PinkCurve products.

They should be traced into System Design and Infrastructure Design rather than
promoted into products merely because they appear in Product Architecture.

---

### Important Architecture Principle: Product vs. Implementation

Chapter 03 explicitly states:

"The product architecture defines what PinkCurve must do."

Specific technologies may evolve.

This is critical to Chapter 25.

Chapter 25 should identify durable responsibilities.

Later System Design should determine how those responsibilities are
implemented.

For example:

Buyer Intelligence = Product

does not imply:

buyer-intelligence-microservice = required implementation

Likewise:

AMN = Product

does not imply:

amn-service = required implementation

These decisions belong to later Design work.

---

### Deployment and Organizational Implication

Chapter 03 supports an evolutionary architecture:

Early PinkCurve:
Frontend
→ Backend
→ PostgreSQL
→ AI/external services

Later PinkCurve:
Clients
→ APIs
→ specialized services
→ data/event infrastructure
→ analytics/learning/intelligence

This reinforces an important Product & Capability Map rule:

> Design responsibility boundaries now, but create physical separation only
> when scale, reliability, security, development independence, or other
> concrete requirements justify it.

The same principle should eventually apply organizationally.

A responsibility can exist before PinkCurve needs a dedicated team for it.

---

### Potential Missing Product: Seller Experience

Chapter 03 contains substantial Seller-facing responsibilities:

- registration;
- onboarding;
- verification;
- Offering management;
- multi-Offering management;
- workspace management;
- team collaboration;
- campaigns;
- Creative Studio;
- analytics;
- Seller Intelligence;
- Brand Discovery;
- value measurement.

Yet there is no explicit **Seller Experience** system component comparable to
Buyer Experience.

This is now a strong recurring audit finding.

**Status: CLARIFY — HIGH PRIORITY**

Later Seller Experience chapter(s) should determine whether it is formally a
PinkCurve integrated product.

---

### Potential Legacy Concept: Community Intelligence

Chapter 03 proposes future Community Intelligence.

At this stage, do not classify it as a committed product.

Community discovery may be supported by:

- Offering Knowledge;
- AI Discovery;
- AMN;
- Buyer Experience;
- Location/Context;
- Trust;
- Analytics;
- Learning.

Only create Community Intelligence as a separate product if future
requirements establish a distinct responsibility that cannot be adequately
served by existing products.

**Status: FUTURE / UNRESOLVED**

---

### Operating Functions Identified or Reinforced

| Item | Classification | Status |
|---|---|---|
| Seller onboarding | Operating Function + Seller Experience capability | CLEAR candidate |
| Organization onboarding | Operating Function + Seller Experience capability | CLEAR candidate |
| Verification operations | Operating Function + Trust capability | CLEAR |
| Fraud investigation | Operating Function | CLEAR |
| Abuse response | Operating Function | CLEAR |
| Human review | Cross-product Operating Function | CLEAR |
| AI/model evaluation | AI Governance / Operating Function | CLEAR |
| Customer Support | Operating Function + possible Product | CLARIFY |
| Platform operations | Operating Function | CLEAR |
| Account administration | Operating Function / Experience capability | CLARIFY |
| Content integrity review | Operating Function + Trust capability | CLEAR candidate |

---

### Architectural / Design Requirements Identified

Chapter 03 creates requirements for later Design documentation covering:

- product interfaces;
- Buyer Experience interfaces;
- Seller Experience interfaces;
- AMN interfaces;
- Buyer Intelligence interfaces;
- Seller Intelligence interfaces;
- Offering Knowledge interfaces;
- AI Discovery interfaces;
- Trust interfaces;
- AI Platform interfaces;
- event architecture;
- data architecture;
- identity architecture;
- authentication/authorization;
- registration workflows;
- verification workflows;
- Offering approval;
- account management;
- location/context services;
- metadata architecture;
- API contracts;
- error contracts;
- versioning;
- rate limiting;
- observability;
- AI/model management;
- model evaluation;
- human escalation;
- scalability;
- graceful architectural evolution.

---

### Audit Questions to Carry Forward

**Q03-01 — Participant Platform**

Should Participant Platform remain an architectural concept, or should its
responsibilities be distributed among Identity & Access, Buyer Experience,
Seller Experience, Trust, and Offering Knowledge?

**Q03-02 — Participant Intelligence**

Should Participant Intelligence remain an umbrella, or should Buyer
Intelligence and Seller Intelligence appear independently in the canonical
architecture?

**Q03-03 — Seller Experience**

Should Seller Experience become a formal PinkCurve integrated product?

This is now a high-priority classification question.

**Q03-04 — Discovery Feed**

Should Discovery Feed be classified as a Buyer Experience capability rather
than an independent platform system?

**Q03-05 — AMN Architecture**

Update the canonical architecture later to reflect Chapter 23's explicit AMN
product definition and interfaces.

**Q03-06 — Buyer Intelligence Architecture**

Update the canonical architecture later to reflect Chapter 24's explicit
Buyer Intelligence product definition and interfaces.

**Q03-07 — Discovery Engine Naming**

Resolve Discovery Engine vs. AI Discovery.

**Q03-08 — Identity & Access**

The Participant Platform strongly reinforces the need to evaluate Identity &
Access as a shared foundation capability.

**Q03-09 — Registration Ownership**

Establish responsibility boundaries among Experience, Identity, Trust,
Privacy/Consent, and Operations.

**Q03-10 — Legal Agreement/Acknowledgment**

Registration responsibilities do not currently mention Terms acceptance,
legal disclaimer acknowledgment, consent versioning, or agreement history.

Continue tracking this requirement across later chapters.

**Q03-11 — Location / Context**

Determine whether a shared Location/Context capability should be represented
in Chapter 25.

**Q03-12 — Offering Management**

Determine canonical boundary between Seller Experience and Offering
Knowledge.

**Q03-13 — Trust Architecture**

Determine final separation among Trust, Security, Privacy, AI Platform, Data
Architecture, and Trust Operations.

**Q03-14 — Event Ownership**

Determine whether Data Architecture should own shared event infrastructure
while products own the semantic meaning of the events they produce and
consume.

**Q03-15 — AI Platform Boundary**

Ensure AI Platform remains shared infrastructure rather than absorbing
product responsibilities merely because those products use AI.

**Q03-16 — Community Intelligence**

Determine whether this remains a future concept or eventually deserves
product status.

---

### Cross-Chapter Findings Emerging After Chapters 00–03

The audit is now beginning to expose a more structured PinkCurve architecture.

#### Strong Product Candidates

- Offering Knowledge
- Creative Studio
- AI Discovery / Discovery Engine
- Buyer Experience
- Discovery Analytics
- Learning Engine
- Seller Intelligence
- Buyer Intelligence
- Adaptive Metadata Navigation
- Trust

#### Strong Shared / Foundation Candidates

- Data Architecture
- AI Platform
- Security
- Privacy
- Identity & Access
- Observability
- Event / Signal Infrastructure
- Location / Context
- API / Interface Architecture

#### Strong Integrated Experience Candidate Still Missing From Architecture

- Seller Experience

#### Operating Functions Becoming Visible

- Customer Support
- Verification Operations
- Approval Operations
- Fraud Investigation
- Abuse Response
- Human Review
- Platform Operations
- AI/Model Evaluation
- Security Incident Response

#### Concepts Requiring Possible Retirement or Reclassification

- Participant Platform
- Participant Intelligence
- Discovery Feed as a standalone system
- Community Intelligence as a committed product

---

### Chapter 03 Audit Assessment

**Overall Status: CRITICAL — ARCHITECTURE REQUIRES LATER SYNCHRONIZATION**

Chapter 03 contains a strong architectural foundation and correctly
establishes PinkCurve as a system of interconnected responsibilities rather
than a single recommendation engine.

However, the Product & Capability Audit reveals that the architecture has
evolved since this chapter's core structure was established.

Most importantly:

1. Buyer Intelligence is now a dedicated product.
2. AMN is now sufficiently defined to require explicit architectural
   representation.
3. Seller Experience is increasingly likely to be a missing integrated
   product.
4. Participant Platform may be an overly broad legacy umbrella.
5. Participant Intelligence may no longer be necessary as a canonical
   architectural layer.
6. Identity & Access is emerging as an important shared capability.
7. Location/Context is emerging as an important shared capability.
8. Discovery Feed may be an experience capability rather than a product.
9. Trust requires separation from underlying Security, Privacy, AI, and
   operational responsibilities.
10. Product responsibilities should remain independent from physical service
    architecture.

No immediate changes to Chapter 03 are recommended during this audit pass.

After Chapters 00–24 are audited and Chapter 25 establishes the canonical
Product & Capability Map, Chapter 03 should be one of the **highest-priority
chapters for synchronization**.

---

## Chapter 04 — Offering Knowledge

### Audit Purpose

Chapter 04 defines Offering Knowledge as a major PinkCurve product and
establishes the Offering as the fundamental discovery object.

This chapter is especially important to the Product & Capability Map because
Offering Knowledge supplies structured knowledge used by many other PinkCurve
products while maintaining responsibility for the meaning, quality,
provenance, lifecycle, and evolution of that knowledge.

The audit should distinguish Offering Knowledge responsibilities from:

- Seller Experience;
- Adaptive Metadata Navigation;
- AI Discovery;
- Data Architecture;
- Trust;
- Learning Engine;
- Creative Studio;
- Buyer Intelligence;
- Discovery Analytics.

---

### Product Classification

| Item | Classification | Status | Notes |
|---|---|---|---|
| Offering Knowledge | Product | CLEAR | Owns PinkCurve's structured understanding of an Offering and provides knowledge to multiple products. |

Offering Knowledge is now strongly confirmed as a PinkCurve product.

Its product responsibility can be summarized as:

> Maintain PinkCurve's structured, trustworthy, evolving understanding of
> Offerings so that other PinkCurve products can use that knowledge for
> discovery, navigation, creative work, analytics, intelligence, learning,
> and Trust.

---

### Fundamental Domain Object

Chapter 04 establishes:

**Offering = the fundamental PinkCurve discovery object.**

Offering types may include:

- Product;
- Commercial Service;
- Promotion;
- Event;
- Community Service;
- Public Service;
- Brand-awareness / brand-recognition Offering;
- future discoverable types.

This is an important platform-level domain decision.

PinkCurve products should operate on the common Offering abstraction where
appropriate rather than creating separate architectures for products,
services, events, promotions, and community resources.

**Status: CLEAR**

---

### Core Offering Knowledge Capabilities

| Capability | Owner | Status |
|---|---|---|
| Source Knowledge | Offering Knowledge | CLEAR |
| Derived Knowledge | Offering Knowledge | CLEAR |
| Learned Knowledge | Offering Knowledge | CLEAR |
| Core Offering Information | Offering Knowledge | CLEAR |
| Rich Offering Knowledge | Offering Knowledge | CLEAR |
| Offering Metadata | Offering Knowledge | CLEAR |
| Offering location/time knowledge | Offering Knowledge | CLEAR |
| Creative asset references | Offering Knowledge | CLEAR |
| Knowledge capture | Offering Knowledge | CLEAR |
| Manual knowledge entry | Offering Knowledge + Seller Experience | CLARIFY interface |
| URL-based knowledge capture | Offering Knowledge + AI Platform | CLEAR candidate |
| AI-assisted extraction | Offering Knowledge + AI Platform | CLEAR |
| Structured import | Offering Knowledge | CLEAR |
| Knowledge enrichment | Offering Knowledge + Learning Engine | CLEAR boundary candidate |
| Knowledge provenance | Offering Knowledge | CLEAR |
| Knowledge completeness | Offering Knowledge | CLEAR |
| Knowledge quality | Offering Knowledge | CLEAR |
| Knowledge lifecycle | Offering Knowledge | CLEAR |
| Knowledge versioning | Offering Knowledge + Data Architecture | CLEAR boundary candidate |
| Offering relationships | Offering Knowledge | CLEAR |
| Knowledge-source tracking | Offering Knowledge | CLEAR |
| Metadata generation | Offering Knowledge + AI Platform | CLEAR |
| Knowledge validation | Offering Knowledge + Trust | CLARIFY boundary |

---

### Knowledge Model

Chapter 04 establishes three important knowledge classes.

#### Source Knowledge

Information supplied or verified by the Seller, organization, or
authoritative source.

Examples:

- Offering name;
- description;
- price;
- specifications;
- location;
- availability;
- images;
- videos;
- destination URL;
- promotion terms.

Source Knowledge represents what the provider says about the Offering.

---

#### Derived Knowledge

Information PinkCurve generates or enriches from Source Knowledge.

Examples:

- categories;
- metadata;
- semantic concepts;
- potential benefits;
- audience relevance;
- Offering relationships;
- search terms;
- embeddings;
- visual characteristics;
- suggested discovery dimensions.

AI may assist in generating Derived Knowledge.

Derived Knowledge must maintain provenance.

---

#### Learned Knowledge

Knowledge emerging from actual discovery activity.

Examples:

- useful metadata;
- attributes attracting Buyer interest;
- audience response;
- creative performance;
- useful discovery contexts;
- rejected attributes;
- productive metadata paths.

Learned Knowledge may improve PinkCurve's understanding of an Offering but
should not silently overwrite verified Source Knowledge.

**Audit Finding: CLEAR AND IMPORTANT PRODUCT BOUNDARY**

---

### Critical Boundary: Offering Knowledge vs. Seller Experience

Chapter 04 says Sellers or organizations may manually provide structured
Offering information.

The chapter currently says:

"The interface should guide participants..."

Per the audit decision from Chapter 03, **Participant terminology should
eventually be replaced with the specific applicable actor**, in this case
primarily Seller or Organization.

The emerging responsibility boundary is:

Seller
   ↓
Seller Experience
   ↓
Offering creation / editing interface
   ↓
Offering Knowledge
   ↓
Structured Offering knowledge

Therefore:

**Seller Experience owns:**

- Seller-facing Offering creation;
- editing workflows;
- review interfaces;
- import initiation;
- URL submission;
- knowledge-management UI.

**Offering Knowledge owns:**

- Offering knowledge model;
- knowledge meaning;
- Source Knowledge;
- Derived Knowledge;
- Learned Knowledge;
- metadata;
- provenance;
- completeness;
- quality;
- lifecycle;
- versioning.

This boundary should be verified when Seller Experience is audited.

---

### Critical Boundary: Offering Knowledge vs. AMN

Chapter 04 substantially clarifies the metadata boundary.

Offering Knowledge owns:

- Offering metadata;
- metadata meaning;
- metadata associated with Offerings;
- metadata quality;
- metadata provenance;
- metadata enrichment.

AMN owns:

- using available metadata for navigation;
- determining useful navigation dimensions;
- adapting navigation according to context;
- progressively refining discovery;
- presenting appropriate navigation possibilities through Buyer Experience.

Conceptually:

Offering
   ↓
Offering Knowledge
   ↓
Offering Metadata
   ↓
AMN
   ↓
Adaptive Navigation Options
   ↓
Buyer Experience
   ↓
Buyer

This is a strong candidate for the final Chapter 25 boundary.

---

### Critical Boundary: Offering Knowledge vs. AI Discovery

Offering Knowledge answers primarily:

> What does PinkCurve know about this Offering?

AI Discovery answers primarily:

> Which Offerings should PinkCurve present in the current discovery context?

Offering Knowledge may provide:

- semantic meaning;
- metadata;
- category;
- location;
- availability;
- audience relevance;
- learned knowledge;
- Trust status.

AI Discovery consumes appropriate knowledge to perform discovery.

Therefore:

> Offering Knowledge describes and understands Offerings.
> AI Discovery decides how appropriate Offerings participate in discovery.

**Status: CLEAR candidate**

Verify against Chapter 06.

---

### Critical Boundary: Offering Knowledge vs. Data Architecture

Chapter 04 explicitly states that exact physical database design belongs to
Data Architecture rather than Offering Knowledge.

This strongly clarifies the boundary.

**Offering Knowledge owns the logical product meaning of knowledge.**

Examples:

- what Source Knowledge means;
- what Derived Knowledge means;
- what Offering metadata represents;
- provenance requirements;
- knowledge states;
- knowledge quality;
- version semantics.

**Data Architecture owns shared data mechanisms.**

Examples may include:

- physical persistence;
- schemas and storage implementation;
- data integrity mechanisms;
- retention infrastructure;
- lineage infrastructure;
- event infrastructure;
- physical version storage;
- database technology.

This establishes an important general PinkCurve rule:

> Product ownership of information does not imply ownership of all physical
> data infrastructure used to store that information.

---

### Critical Boundary: Offering Knowledge vs. Trust

Chapter 04 requires controls including:

- Seller verification;
- Offering verification;
- URL validation;
- automated content checks;
- duplicate detection;
- suspicious-claim detection;
- prohibited-content detection;
- human review.

These should not all automatically become Offering Knowledge responsibilities.

A candidate boundary is:

Offering Knowledge
        ↓
Knowledge requiring validation
        ↓
Trust
        ↓
Verification / Risk / Policy Result
        ↓
Offering Knowledge Lifecycle
        ↓
Eligible / Suspended / Review

Offering Knowledge may own knowledge quality and factual consistency.

Trust may own:

- verification status;
- fraud/risk evaluation;
- prohibited-content controls;
- suspicious-claim controls;
- eligibility implications related to Trust;
- escalation to human review.

This boundary should be tested carefully against Chapter 12.

---

### Critical Boundary: Offering Knowledge vs. Learning Engine

Learning Engine may discover:

- useful metadata relationships;
- emerging interests;
- audience response;
- creative effectiveness;
- negative signals;
- Offering relationships.

Offering Knowledge may store or represent appropriate learned knowledge.

Therefore:

Learning Engine
     ↓
Produces learning / candidate enrichment
     ↓
Offering Knowledge
     ↓
Maintains appropriate learned knowledge
with provenance and governance

Learning Engine should not silently rewrite verified provider facts.

This separation is strongly supported by Chapter 04.

---

### Critical Boundary: Offering Knowledge vs. Buyer Intelligence

Buyer Intelligence should maintain intelligence **about Buyers**.

Offering Knowledge should maintain knowledge **about Offerings**.

Buyer behavior may contribute evidence that eventually enriches Offering
Knowledge, but Buyer Intelligence should not become the canonical repository
of Offering knowledge.

Likewise, Offering Knowledge should not become the canonical repository of
Buyer preferences.

Conceptually:

Buyer Intelligence
      ↓
Buyer Signals
      ↓
AI Discovery / AMN / Learning
      ↑
Offering Knowledge
      ↑
Offering Knowledge Signals

This boundary is now increasingly clear.

---

### Critical Boundary: Offering Knowledge vs. Creative Studio

Offering Knowledge provides:

- features;
- benefits;
- audiences;
- brand voice;
- images;
- videos;
- differentiators;
- metadata;
- destination information.

Creative Studio uses that knowledge to help create discovery content.

Creative Studio may generate new creative assets or variants.

Offering Knowledge may maintain references to those assets.

Therefore:

Offering Knowledge = knowledge foundation

Creative Studio = creative production and optimization product

**Status: CLEAR**

---

### Critical Boundary: Offering Knowledge vs. Discovery Analytics

Discovery Analytics measures how Offering knowledge performs during
discovery.

Examples:

- metadata selected;
- attributes associated with exploration;
- negative feedback;
- knowledge gaps;
- discovery effectiveness.

Offering Knowledge should not become the analytics engine merely because
analytics results can improve knowledge.

Analytics produces measurement.

Learning interprets appropriate evidence.

Offering Knowledge incorporates appropriate governed enrichment.

---

### Metadata Ownership Finding

The metadata question raised in Chapters 00–03 is becoming substantially
clearer.

A candidate model is:

Offering Knowledge
   │
   ├── owns Offering metadata
   ├── owns metadata meaning
   ├── owns Offering-metadata relationships
   ├── owns metadata provenance
   └── owns metadata quality
            ↓
Data Architecture
   └── provides storage/governance infrastructure
            ↓
AMN
   └── uses metadata for adaptive navigation
            ↓
AI Discovery
   └── uses metadata for discovery decisions
            ↓
Buyer Experience
   └── presents appropriate metadata/navigation

This should remain a candidate model until Chapters 06, 11, 20, and 23 have
all been audited.

---

### Location / Context Finding

Chapter 04 provides an important refinement of the emerging shared
Location / Context capability.

Offering Knowledge owns **Offering-specific geographic knowledge**, such as:

- country;
- region/state;
- city;
- service area;
- coordinates where appropriate;
- online-only availability.

It also owns Offering-specific time relevance such as:

- availability;
- event dates;
- promotion periods;
- seasonal relevance.

However, this does not necessarily mean Offering Knowledge should own all
PinkCurve location capabilities.

Other location responsibilities may include:

- Buyer current location;
- permission handling;
- geographic normalization;
- distance calculation;
- nearby computation;
- Seller geographic campaign targeting;
- Trust/risk location signals.

Therefore:

**Offering location knowledge = Offering Knowledge**

**Shared geographic/context mechanisms = still CLARIFY**

This distinction should help us later avoid creating one oversized
"Location Product."

---

### Knowledge Provenance as a Major Capability

Chapter 04 strongly establishes provenance as a first-class capability.

PinkCurve should distinguish information such as:

- Provider supplied;
- Provider verified;
- AI extracted;
- AI inferred;
- Imported;
- Learned from discovery;
- Platform generated.

This allows PinkCurve to distinguish:

**fact**
vs.
**interpretation**
vs.
**inference**
vs.
**learned signal**

This is important not only for Offering Knowledge but also for:

- Trust;
- AI governance;
- Seller Experience;
- Buyer Experience;
- Learning Engine;
- auditability.

Offering Knowledge should own provenance semantics for Offering knowledge,
while Data Architecture may provide shared lineage/provenance infrastructure.

---

### Knowledge Lifecycle Capability

Chapter 04 defines:

Draft
  ↓
Review
  ↓
Active
  ↓
Suspended
  ↓
Archived

with transitions for:

- approval;
- required changes;
- editing;
- Trust/quality issues;
- reevaluation;
- restoration.

This lifecycle crosses product boundaries.

Candidate responsibilities:

**Offering Knowledge**
- knowledge state;
- version;
- active knowledge representation.

**Seller Experience**
- submit;
- edit;
- respond to requested changes;
- archive/restore requests.

**Trust / Approval**
- verification;
- approval;
- suspension;
- reevaluation where Trust applies.

**Operations**
- human review where necessary.

This lifecycle will require explicit System Design later.

---

### Offering Verification and Approval

Chapter 04 reinforces that Offering verification is not a minor feature.

Before an Offering becomes discoverable, PinkCurve may need to evaluate:

Offering
   ↓
Knowledge Completeness
   ↓
Knowledge Quality
   ↓
Trust / Verification
   ↓
Approval / Eligibility
   ↓
Active Discovery

This supports the earlier audit finding that **Offering Verification and
Approval** is a major capability spanning:

- Offering Knowledge;
- Trust;
- Seller Experience;
- Operations;
- AI Platform;
- Data Architecture.

The later Verification and Approval chapter should define the canonical
workflow.

---

### Knowledge Completeness vs. Discovery Quality

Chapter 04 establishes an important product boundary:

> More complete Offering Knowledge does not automatically mean a better
> discovery result.

Knowledge Completeness belongs to Offering Knowledge.

Discovery relevance belongs to AI Discovery.

Seller value measurement belongs primarily to Analytics / Seller
Intelligence.

These should remain separate concepts.

This prevents a highly complete Offering from automatically receiving
preferential discovery treatment.

---

### Data Entities Identified

Chapter 04 identifies logical entities including:

- `offerings`;
- `offering_knowledge`;
- `offering_metadata`;
- `knowledge_versions`;
- `creative_assets`;
- `knowledge_sources`.

These are **logical product entities**, not necessarily separate databases,
services, or physical tables.

Physical implementation remains the responsibility of later Data Design.

---

### Legacy Terminology Finding

The Relationships section currently contains:

PARTICIPANT
   ↓
OFFERING

and Manual Entry refers to "participants."

Based on the resolved audit decision from Chapter 03, these should eventually
be replaced according to actual use case.

Likely:

SELLER / ORGANIZATION
        ↓
     OFFERING

The precise logical relationship should be finalized during Data Design.

**Status: RESOLVED TERMINOLOGY CHANGE — APPLY DURING SYNCHRONIZATION**

---

### Shared / Foundation Capabilities Reinforced

| Capability | Classification | Status |
|---|---|---|
| Data Architecture | Shared Foundation | CLEAR |
| AI Platform | Shared Foundation | CLEAR |
| Security | Shared Foundation | CLEAR |
| Trust mechanisms | Cross-product capability | CLARIFY final classification |
| Metadata storage/governance | Shared Data Capability | CLEAR candidate |
| Provenance/lineage infrastructure | Shared Data Capability | CLEAR candidate |
| Location/context infrastructure | Shared Capability | CLARIFY |
| Media/object storage | Shared Infrastructure | CLEAR candidate |
| Import/integration infrastructure | Shared Platform Capability | CLARIFY |

---

### Operating Functions Identified or Reinforced

| Item | Classification | Status |
|---|---|---|
| Offering review | Operating Function + Trust capability | CLEAR |
| Offering approval | Operating Function + Trust capability | CLEAR |
| Offering re-evaluation | Operating Function + Trust capability | CLEAR |
| Suspicious-claim review | Operating Function | CLEAR |
| Prohibited-content review | Operating Function | CLEAR |
| Human knowledge review | Operating Function | CLEAR |
| Knowledge-quality management | Product + Operating Function | CLEAR candidate |
| Metadata governance | Governance Function | CLEAR candidate |
| Knowledge correction | Product + Seller/Operations workflow | CLEAR candidate |

---

### Architectural / Design Requirements Identified

Chapter 04 creates later Design requirements for:

- Offering domain model;
- Offering Knowledge API;
- Offering lifecycle;
- knowledge capture workflow;
- Seller Offering-management UI;
- URL ingestion;
- AI extraction;
- structured import;
- metadata model;
- AMN metadata interface;
- Discovery interface;
- Creative Studio interface;
- Learning interface;
- Seller Intelligence interface;
- Trust interface;
- provenance model;
- quality model;
- completeness model;
- version model;
- location/time representation;
- media references;
- approval workflow;
- suspension/re-evaluation workflow;
- knowledge conflict handling;
- learned-knowledge governance.

---

### Audit Questions to Carry Forward

**Q04-01 — Offering Knowledge Product Boundary**

Chapter 04 strongly confirms Offering Knowledge as a PinkCurve product.

Use this chapter as a reference model when defining what qualifies as a
product in Chapter 25.

**Q04-02 — Metadata Ownership**

Offering Knowledge appears to own Offering metadata and its semantics.

Verify against AMN, Data Architecture, and AI Discovery before making this
canonical.

**Q04-03 — Seller Experience Interface**

Determine the Seller-facing workflows for:

- Offering creation;
- editing;
- URL submission;
- structured import;
- AI-extraction review;
- metadata review;
- correction;
- approval response.

**Q04-04 — Knowledge Validation vs. Trust Verification**

Define where knowledge quality ends and Trust verification begins.

**Q04-05 — Offering Approval**

Determine canonical ownership and workflow across Offering Knowledge, Trust,
Seller Experience, and Operations.

**Q04-06 — Learned Knowledge Governance**

Determine when Learning Engine output may become Offering Knowledge and
whether Seller or human approval is required for particular knowledge types.

**Q04-07 — Provenance Infrastructure**

Determine which provenance responsibilities belong to Offering Knowledge and
which reusable lineage mechanisms belong to Data Architecture.

**Q04-08 — Location / Context**

Offering Knowledge clearly owns Offering-specific location/time knowledge.

Continue determining ownership of shared geographic mechanisms.

**Q04-09 — Structured Import**

Determine whether common external-data ingestion/import capability should
become a shared platform capability or remain within Offering Knowledge.

**Q04-10 — Knowledge Conflict Resolution**

Determine how PinkCurve handles conflicts among:

- Seller-provided facts;
- AI-extracted information;
- AI inference;
- imported information;
- learned information.

**Q04-11 — Knowledge Lifecycle vs. Discovery Eligibility**

Clarify whether `Active` means knowledge is approved or whether Discovery
eligibility is maintained separately.

This matters because an Offering could potentially have valid knowledge but
become ineligible for Discovery for Trust, Seller-account, policy, or other
reasons.

**Q04-12 — Offering Knowledge Retrieval and Query Interface**

Chapter 04 defines Offering Knowledge and its consumers but does not define how other PinkCurve products retrieve or query that knowledge.

Determine required access patterns, including retrieval by offering_id, Seller/Organization ownership, Offering type, category, metadata, location, time/availability, lifecycle or eligibility status, semantic similarity, and combinations of these criteria.

The Product Blueprint should define the required capability and logical interface, while detailed API endpoints, query schemas, indexing strategies, database queries, and performance design should be defined later during System and Data Design.

---

### Cross-Chapter Findings Emerging After Chapters 00–04

Several boundaries are now becoming significantly clearer.

#### Confirmed Product

**Offering Knowledge**

This is one of the strongest examples so far of a true PinkCurve product
because it has:

- a distinct responsibility;
- a defined domain object;
- its own capabilities;
- its own lifecycle;
- its own quality model;
- its own evolution;
- multiple consuming products;
- defined interfaces with other products.

This may help establish the Chapter 25 criteria for product classification.

#### Metadata Boundary Becoming Clear

Offering Knowledge
→ owns Offering metadata

AMN
→ uses Offering metadata for adaptive navigation

AI Discovery
→ uses Offering metadata for discovery

Buyer Experience
→ presents appropriate metadata/navigation

Data Architecture
→ provides underlying data mechanisms

#### Seller Experience Candidate Strengthened

Chapter 04 introduces substantial Seller-facing workflow without assigning it
to a formal Seller Experience product.

This further strengthens Seller Experience as a major integrated-product
candidate.

#### Identity & Access Remains Relevant

Offering ownership depends on Seller/Organization identity.

This reinforces, but does not independently resolve, the shared Identity &
Access capability identified in earlier chapters.

#### Location Boundary Becoming More Precise

Offering-specific location = Offering Knowledge.

Shared geographic/context computation = still unresolved.

#### Trust Boundary Becoming More Precise

Knowledge quality = Offering Knowledge.

Trustworthiness / verification / fraud / policy = Trust.

Human review = Operations where necessary.

The exact interfaces remain for later Design.

---

### Chapter 04 Audit Assessment

**Overall Status: CLEAR — STRONGLY DEFINED PRODUCT**

Chapter 04 provides one of the clearest product definitions examined so far.

Offering Knowledge has a distinct and durable responsibility:

> PinkCurve's structured, governed, evolving understanding of Offerings.

The chapter establishes:

1. Offering as PinkCurve's fundamental discovery object.
2. Source, Derived, and Learned Knowledge.
3. rich structured Offering knowledge.
4. Offering metadata.
5. Offering-specific location and time knowledge.
6. knowledge capture and enrichment.
7. provenance.
8. completeness.
9. quality.
10. lifecycle.
11. versioning.
12. relationships.
13. integration with other PinkCurve products.
14. Trust requirements.
15. clear separation from physical Data Architecture.

The primary issues requiring later consolidation are not deficiencies in the
Offering Knowledge product itself.

They are **cross-product boundaries**, especially:

- Seller Experience;
- Trust;
- AMN;
- Data Architecture;
- Learning Engine;
- shared Location/Context capability;
- Offering approval.

No immediate changes to Chapter 04 are recommended during the audit pass,
except that the existing Participant terminology should be recorded for
replacement during later Blueprint synchronization.

Chapter 04 should serve as one of the reference examples when Chapter 25
defines what PinkCurve means by a **Product**.

---

## Chapter 05 — Creative Studio

### Audit Purpose

Chapter 05 defines Creative Studio as PinkCurve's product for transforming
Offering Knowledge and available creative material into visual discovery
experiences.

The chapter establishes a substantial product boundary covering:

- creative understanding;
- creative strategy;
- creative generation and adaptation;
- creative asset management;
- creative variants;
- creative campaigns;
- Seller review;
- creative lifecycle;
- grounding and accuracy;
- creative quality;
- performance-driven improvement.

The audit should distinguish Creative Studio responsibilities from:

- Seller Experience;
- Offering Knowledge;
- AI Platform;
- AI Discovery;
- Discovery Analytics;
- Learning Engine;
- Seller Intelligence;
- Trust;
- shared media/storage infrastructure.

---

### Product Classification

| Item | Classification | Status | Notes |
|---|---|---|---|
| Creative Studio | Product | CLEAR | Owns creation, preparation, adaptation, organization, and lifecycle of visual discovery creative. |

Creative Studio is strongly confirmed as a PinkCurve product.

Its product responsibility can be summarized as:

> Transform trustworthy Offering Knowledge and available creative material
> into effective visual discovery content that helps Buyers quickly
> understand whether an Offering may be worth exploring.

Creative Studio is not merely an AI content generator.

AI is one mechanism Creative Studio may use.

---

### Core Creative Studio Capabilities

| Capability | Candidate Owner | Status |
|---|---|---|
| Creative understanding | Creative Studio | CLEAR |
| Creative strategy | Creative Studio | CLEAR |
| Creative brief | Creative Studio | CLEAR |
| Creative concept | Creative Studio | CLEAR |
| Script creation | Creative Studio | CLEAR |
| Storyboard creation | Creative Studio | CLEAR |
| Creative generation | Creative Studio + AI Platform | CLEAR boundary |
| Creative adaptation | Creative Studio | CLEAR |
| Existing asset reuse | Creative Studio | CLEAR |
| Creative asset management | Creative Studio | CLEAR |
| Creative variants | Creative Studio | CLEAR |
| Creative format management | Creative Studio | CLEAR |
| Creative quality evaluation | Creative Studio + Trust/AI Platform | CLARIFY |
| Creative grounding | Creative Studio + Offering Knowledge | CLEAR boundary |
| Creative claim traceability | Creative Studio + Offering Knowledge/Data | CLEAR candidate |
| Seller creative review | Seller Experience + Creative Studio | CLARIFY interface |
| Creative approval | Creative Studio + Seller + Trust | CLARIFY |
| Creative lifecycle | Creative Studio | CLEAR |
| Campaign organization | Creative Studio / Seller Experience | CLARIFY |
| Creative performance improvement | Creative Studio + Analytics + Learning | CLEAR boundary |
| AI-assisted generation | Creative Studio + AI Platform | CLEAR |
| External creative-tool integration | Creative Studio + AI Platform | CLARIFY |
| Media upload | Seller Experience + Creative Studio | CLARIFY |
| Creative retrieval | Creative Studio | MISSING / DESIGN REQUIRED |

---

### Creative Sources

Creative Studio supports multiple sources:

Seller-provided assets
        +
Offering URL
        +
Offering Knowledge
        +
AI-generated / AI-assisted material
        ↓
Creative Studio

This is an important architectural principle.

Creative Studio should not require AI generation when useful Seller-created
material already exists.

The product therefore needs to support both:

1. creation of new creative; and
2. management/adaptation of existing creative.

---

### Critical Boundary: Creative Studio vs. Offering Knowledge

Offering Knowledge answers:

> What does PinkCurve know about the Offering?

Creative Studio answers:

> How should that knowledge be communicated visually for discovery?

Offering Knowledge provides:

- facts;
- features;
- benefits;
- metadata;
- audiences;
- differentiators;
- brand context;
- images;
- videos;
- location;
- availability;
- promotions;
- destination information;
- provenance.

Creative Studio uses that knowledge to create or select appropriate visual
representations.

Conceptually:

Offering
   ↓
Offering Knowledge
   ↓
Creative Studio
   ↓
Creative Representation
   ↓
AI Discovery / Buyer Experience

Creative Studio must not silently invent Offering facts.

**Status: CLEAR**

---

### Critical Boundary: Creative Studio vs. Seller Experience

Chapter 05 repeatedly describes Seller activities:

- uploading images;
- uploading videos;
- providing marketing materials;
- creating campaigns;
- defining campaign objectives;
- reviewing creative;
- approving creative;
- requesting revisions;
- controlling brand representation.

These activities strongly reinforce Seller Experience as a formal PinkCurve
product candidate.

A candidate boundary is:

Seller
   ↓
Seller Experience
   ↓
Creative Studio
   ↓
Creative Work / Assets / Campaigns
   ↓
Seller Experience
   ↓
Review / Approve / Revise

Seller Experience should own the Seller-facing interaction.

Creative Studio should own the creative domain and workflow.

This is analogous to the boundary identified in Chapter 04:

Seller Experience provides the interface.

The underlying product owns the domain responsibility.

**Status: STRONGLY REINFORCED**

---

### Critical Boundary: Creative Studio vs. AI Platform

Creative Studio uses AI capabilities including:

- LLMs;
- image generation;
- video generation;
- speech generation;
- embeddings;
- evaluation;
- prompt management;
- model routing;
- safety controls.

However:

> AI Platform provides reusable AI mechanisms.
> Creative Studio owns the creative outcome.

For example:

AI Platform
→ provides image-generation capability

Creative Studio
→ decides why an image is needed, what it should communicate, how it relates
to an Offering, how it fits a campaign, and whether it is suitable for
discovery.

This reinforces the Chapter 03 principle:

**Using AI does not make a capability part of the AI Platform.**

---

### Critical Boundary: Creative Studio vs. AI Discovery

Creative Studio produces and maintains creative representations.

AI Discovery determines:

- which Offering should be considered;
- which eligible creative representation may be appropriate;
- when and where it should appear;
- according to what discovery context.

Candidate relationship:

Offering Knowledge
       ↓
Creative Studio
       ↓
Approved Creative Variants
       ↓
AI Discovery
       ↓
Buyer Experience

Chapter 05 states that the Discovery Engine may choose among available
creative variants according to discovery context.

This suggests Creative Studio must provide a retrieval/interface capability
that allows AI Discovery to obtain eligible creative associated with an
Offering and context.

---

### Important Missing Capability: Creative Retrieval

Similar to the retrieval issue discovered in Chapter 04, Chapter 05 defines
creative entities and relationships but does not clearly specify how other
products retrieve Creative Studio content.

Potential logical access patterns include:

CreativeStudio.get_asset(creative_asset_id)

CreativeStudio.get_campaign(campaign_id)

CreativeStudio.list_by_offering(offering_id)

CreativeStudio.list_by_seller(seller_id / organization_id)

CreativeStudio.list_approved_variants(offering_id)

CreativeStudio.find_eligible_creative(
    offering_id,
    campaign_type,
    discovery_context,
    format,
    placement,
    status,
    time,
    geography,
    ...
)

These are illustrative logical capabilities, not proposed final APIs.

Detailed endpoints, schemas, indexing, and storage belong to later System
Design and Data Design.

**Status: DESIGN REQUIREMENT IDENTIFIED**

---

### Critical Boundary: Creative Studio vs. Discovery Analytics

Creative Studio owns creative.

Discovery Analytics measures creative performance.

Examples include:

- views;
- meaningful viewing time;
- exploration;
- click-through;
- metadata navigation;
- positive feedback;
- negative feedback;
- destination visits;
- brand-recognition signals;
- repeat discovery.

Therefore:

Creative Studio
      ↓
Creative Presented
      ↓
Buyer Interaction
      ↓
Discovery Analytics
      ↓
Creative Performance Evidence

Creative Studio should not become the analytics system simply because it
needs performance information.

---

### Critical Boundary: Creative Studio vs. Learning Engine

Learning Engine may identify patterns such as:

- which messages work;
- which scenes help Buyers understand;
- which formats work for Offering types;
- which variants work in particular contexts;
- which creative causes negative feedback;
- which brand messages improve recognition.

Creative Studio may consume these findings to:

- recommend improvements;
- create variants;
- adapt content;
- retire weak creative;
- propose refreshed creative.

Therefore:

Discovery Analytics
      ↓
Learning Engine
      ↓
Creative Insights
      ↓
Creative Studio

Learning identifies patterns.

Creative Studio applies appropriate creative changes.

Seller approval and Trust controls remain applicable.

---

### Critical Boundary: Creative Studio vs. Seller Intelligence

Seller Intelligence interprets evidence for the Seller.

For example:

- improve opening scene;
- add imagery;
- create promotion variant;
- create shorter version;
- create brand-recognition creative;
- refresh campaign.

Creative Studio provides the capability to perform those actions.

Therefore:

Seller Intelligence
→ recommends what the Seller may want to do.

Creative Studio
→ provides the creative capability to do it.

Seller Experience
→ presents the recommendation and controls to the Seller.

This is an important three-product relationship.

---

### Critical Boundary: Creative Studio vs. Trust

Creative Studio owns creative quality and grounding.

Trust evaluates risks such as:

- unsupported claims;
- misleading creative;
- prohibited content;
- impersonation;
- manipulated content;
- destination inconsistencies;
- fraud indicators.

Candidate model:

Creative Studio
      ↓
Creative Candidate
      ↓
Creative Quality / Grounding
      ↓
Trust Evaluation
      ↓
Seller Review / Approval
      ↓
Eligible Creative

However, Seller approval and PinkCurve Trust approval are not necessarily
the same thing.

A Seller may approve how the Seller's brand is represented while PinkCurve
may still reject or suspend that creative for Trust or policy reasons.

This distinction should be explicitly preserved in later Design.

---

### Seller Approval vs. PinkCurve Approval

Chapter 05 says Seller approval is an important control.

This creates at least two distinct concepts:

**Seller Approval**

> Does the Seller approve this representation of the Offering or brand?

**PinkCurve Approval / Eligibility**

> Does PinkCurve permit this creative to participate in discovery?

These should not be represented by one ambiguous `approved` state unless
later Design proves that sufficient.

A possible future model could distinguish:

creative_status
seller_approval_status
trust_review_status
discovery_eligibility

The exact data model belongs to Data Design.

**Status: IMPORTANT DESIGN REQUIREMENT**

---

### Creative Lifecycle vs. Discovery Eligibility

Chapter 05 currently defines:

Draft
→ Review
→ Approved
→ Active
→ Paused
→ Archived

It also states that Trust or policy issues may suspend an active asset.

As discovered with Offering Knowledge in Chapter 04, lifecycle state and
discovery eligibility may need to be separate.

For example:

A Creative Asset may be technically Active
but temporarily ineligible because:

- Seller account is suspended;
- Offering is suspended;
- campaign has expired;
- Trust review is pending;
- destination URL is invalid;
- geographic campaign constraint is not satisfied.

Therefore:

**Creative lifecycle state ≠ necessarily Discovery eligibility**

Carry this distinction into System Design.

---

### Campaign Ownership Finding

Chapter 05 introduces a substantial Campaign domain:

Campaign
├── Offering
├── Objective
├── Type
├── Context
├── Start / End
├── Creative Brief
├── Creative Assets
└── Creative Variants

But the audit should not automatically assume that Creative Studio owns the
entire campaign business domain.

Campaign responsibilities may span:

**Seller Experience**
- create/manage campaign;
- choose objectives;
- geographic/category controls;
- budget/pricing controls where applicable;
- pause/resume;
- Seller-facing campaign management.

**Creative Studio**
- creative brief;
- creative assets;
- variants;
- creative preparation.

**AI Discovery**
- discovery eligibility and placement.

**Discovery Analytics**
- campaign and creative performance.

**Seller Intelligence**
- recommendations.

**Business Model / Billing**
- pricing and charges.

**Trust**
- campaign/content eligibility.

This boundary is sufficiently important to keep open.

**Status: CLARIFY — HIGH PRIORITY**

---

### Brand Recognition Finding

Chapter 05 clearly establishes Brand Recognition as a type of Seller-created
creative/campaign rather than something PinkCurve independently inserts.

Seller
   ↓
Creates / Controls Brand Recognition Campaign
   ↓
Creative Studio
   ↓
Creates / Manages Creative
   ↓
AI Discovery
   ↓
Buyer Experience
   ↓
Discovery Analytics
   ↓
Measurement

This supports treating Brand Recognition as a coordinated product capability
rather than creating a separate Brand Recognition product at this stage.

**Status: CROSS-PRODUCT CAPABILITY**

---

### Trending Creative Finding

Chapter 05 states that Trending status should be determined by PinkCurve's
discovery systems rather than claimed by the Seller.

Therefore:

Seller
→ cannot authoritatively declare an Offering "Trending."

Discovery Analytics / Learning / AI Discovery
→ determine appropriate trend status.

Creative Studio
→ may provide creative suitable for presenting that status.

This is a useful Trust and product-boundary rule.

---

### Creative Asset Storage

Creative Studio owns the logical creative asset domain.

However, it should not necessarily own all physical media infrastructure.

Candidate boundary:

Creative Studio
→ asset identity, meaning, relationships, versions, formats, lifecycle

Shared Media Infrastructure
→ binary storage, object storage, CDN, transcoding/storage mechanisms

Data Architecture
→ metadata persistence, relationships, lineage

This follows the same principle established for Offering Knowledge:

> Product ownership of information/assets does not imply ownership of all
> physical storage infrastructure.

---

### Creative Provenance

Creative provenance is important because creative may originate from:

- Seller uploads;
- Offering URL;
- existing marketing material;
- PinkCurve generation;
- AI generation;
- AI adaptation;
- external creative tools;
- combinations of these sources.

Creative Studio should preserve enough provenance to determine:

- where an asset came from;
- who created or supplied it;
- which Offering Knowledge supported it;
- which model/tool generated or modified it where relevant;
- which Seller approved it;
- which Trust checks were performed;
- which version participated in discovery.

This capability intersects:

- Creative Studio;
- Offering Knowledge;
- Data Architecture;
- AI Platform;
- Trust;
- Analytics.

---

### Creative Grounding

Chapter 05 establishes a particularly important requirement:

Creative claims must remain grounded in Offering Knowledge.

Creative Studio should not invent unsupported:

- features;
- discounts;
- testimonials;
- certifications;
- performance claims;
- availability;
- prices;
- medical/safety claims;
- guarantees.

This creates a future Design requirement for traceability:

Creative Claim
      ↓
Supporting Offering Knowledge
      ↓
Knowledge Source / Provenance

For consequential claims, Trust may additionally require verification.

---

### Adaptive Metadata Navigation Relationship

Creative and metadata have complementary responsibilities.

Creative communicates:

> What does this Offering look or feel like?

AMN communicates:

> Which characteristics can the Buyer use to continue or refine discovery?

Candidate flow:

Creative
   ↓
Buyer sees Offering
   ↓
Buyer Experience
   ↓
AMN presents meaningful metadata
   ↓
Buyer chooses direction
   ↓
AI Discovery refines candidate Offerings

Creative Studio therefore needs to preserve Offering and metadata linkage,
but it should not own adaptive navigation.

**AMN remains responsible for navigation.**

---

### Shared / Foundation Capabilities Reinforced

| Capability | Classification | Status |
|---|---|---|
| AI Platform | Shared Foundation | CLEAR |
| Data Architecture | Shared Foundation | CLEAR |
| Security | Shared Foundation | CLEAR |
| Trust mechanisms | Cross-product | CLARIFY final classification |
| Media/Object Storage | Shared Infrastructure | STRONGLY REINFORCED |
| CDN / media delivery | Shared Infrastructure | CLEAR candidate |
| Creative provenance infrastructure | Shared Data capability | CLEAR candidate |
| External AI/provider integration | Shared AI capability | CLEAR candidate |
| Observability | Shared Foundation | CLEAR candidate |
| Location/Context | Shared Capability | REINFORCED through geographic campaigns |

---

### Operating Functions Identified or Reinforced

| Function | Classification | Status |
|---|---|---|
| Creative review | Product + Operating Function | CLEAR |
| High-risk content review | Trust Operating Function | CLEAR |
| Seller approval | Seller workflow | CLEAR |
| Creative policy review | Trust Operations | CLEAR |
| Human creative review | Operating Function | CLEAR |
| Brand/content quality review | Operating Function | CLEAR candidate |
| Creative support | Customer Support / Seller Operations | CLARIFY |
| Campaign administration | Seller Operations / Product capability | CLARIFY |
| AI creative evaluation | AI/Creative Operating Function | CLEAR candidate |

---

### Legacy Terminology Finding

The Campaign Structure currently uses:

PARTICIPANT
→ CREATIVE_CAMPAIGN

and the Campaign Entity contains:

participant_id
→ Seller or organization

Per the resolved audit decision:

**Replace Participant terminology with the specific actor.**

Likely:

SELLER / ORGANIZATION
→ CREATIVE_CAMPAIGN

and an appropriate Seller/Organization ownership identifier should replace
`participant_id`.

The exact data representation belongs to Data Design.

**Status: RESOLVED TERMINOLOGY CHANGE**

---

### Architectural / Design Requirements Identified

Chapter 05 creates requirements for later Design work covering:

- Creative Studio interfaces;
- creative retrieval/query interface;
- Offering Knowledge interface;
- Seller Experience interface;
- AI Discovery interface;
- Analytics interface;
- Learning Engine interface;
- Seller Intelligence interface;
- AI Platform interface;
- Trust interface;
- media upload;
- media storage;
- asset provenance;
- creative versioning;
- claim grounding;
- claim traceability;
- Seller approval;
- PinkCurve approval;
- discovery eligibility;
- creative lifecycle;
- campaign lifecycle;
- campaign ownership;
- variant selection;
- geographic campaigns;
- temporal campaigns;
- creative formats;
- accessibility;
- external creative tools;
- human review;
- performance feedback.

---

### Audit Questions to Carry Forward

**Q05-01 — Creative Studio Product Boundary**

Creative Studio is strongly confirmed as a PinkCurve product.

Use it together with Offering Knowledge as another reference example for
Chapter 25 product classification.

**Q05-02 — Seller Experience**

Chapter 05 strongly reinforces Seller Experience as a missing integrated
product.

Determine its canonical status during the audit.

**Q05-03 — Campaign Ownership**

Determine whether Campaign is primarily owned by:

- Seller Experience;
- Creative Studio;
- another Seller/campaign product capability;

while other products own their respective campaign responsibilities.

Do not create a separate Campaign product without evidence.

**Q05-04 — Creative Retrieval**

Define required logical retrieval capabilities for:

- creative_asset_id;
- campaign_id;
- offering_id;
- Seller/Organization;
- format;
- campaign type;
- context;
- time;
- geography;
- lifecycle status;
- Trust status;
- Discovery eligibility.

**Q05-05 — Seller Approval vs. PinkCurve Approval**

Keep these as separate concepts unless later Design demonstrates that a
single status is sufficient.

**Q05-06 — Creative Lifecycle vs. Discovery Eligibility**

Determine whether lifecycle and eligibility require separate state models.

**Q05-07 — Creative Provenance**

Determine the canonical provenance model for uploaded, imported, generated,
adapted, and mixed creative.

**Q05-08 — Creative Claim Grounding**

Determine how important creative claims reference supporting Offering
Knowledge and verification evidence.

**Q05-09 — Media Infrastructure**

Determine whether shared Media/Object Storage and delivery should appear as
a foundation capability in Chapter 25.

**Q05-10 — Creative Quality vs. Trust**

Define boundary between:

Creative Studio:
- clarity;
- visual quality;
- authenticity;
- mobile suitability;
- accessibility;
- creative usefulness.

Trust:
- misleading claims;
- prohibited content;
- fraud;
- impersonation;
- manipulation;
- policy compliance.

**Q05-11 — Variant Selection**

Chapter 05 says the Discovery Engine may select among Creative variants.

Determine whether Creative Studio returns eligible variants while AI
Discovery selects the contextually appropriate variant.

**Q05-12 — Campaign Constraints**

Determine how:

- geography;
- start/end time;
- promotion expiration;
- campaign type;
- Seller status;
- Offering status;
- Trust status;

combine to determine discovery eligibility.

**Q05-13 — Creative Accessibility**

Accessibility appears explicitly as a Creative Quality dimension.

Determine whether Accessibility should also become a cross-product UI/UX
Design requirement.

**Q05-14 — External Creative Tools**

Determine whether external image/video/audio providers are integrated
directly by Creative Studio or through reusable AI/Media platform
capabilities.


**Q05-15 — Creative Studio Input Requirements**

Creative Studio must not require complete Offering Knowledge as a prerequisite for beginning creative work.

Creative Studio may accept available combinations of Seller-provided information, Offering URLs, existing images/video, existing marketing material, campaign objectives, and Offering Knowledge.

Determine the minimum information required for different Creative Studio workflows.

Information discovered by Creative Studio that may become canonical Offering knowledge should be submitted to Offering Knowledge rather than independently maintained as Offering truth by Creative Studio.

**Q05-16 — Creative Studio Output Contract**

Chapter 05 describes Creative Briefs, concepts, scripts, storyboards, assets, variants, campaigns, and approved creative, but does not define a canonical Creative Studio output.

Define a logical Creative Package containing the applicable creative artifacts, Offering association, provenance, supporting knowledge references, Seller approval, Trust/review status, and Discovery eligibility.

Not every Creative Package requires every artifact. Existing Seller creative may require only review, association, provenance, and approval, while newly generated creative may require the complete brief → concept → script → storyboard → asset workflow.

The detailed schema and API contract should be defined during System and Data Design.

---

### Cross-Chapter Findings Emerging After Chapters 00–05

The product portfolio is becoming substantially clearer.

#### Strongly Confirmed Products

- Offering Knowledge
- Creative Studio

#### Strong Product Candidates

- AI Discovery / Discovery Engine
- Buyer Experience
- Adaptive Metadata Navigation
- Buyer Intelligence
- Seller Intelligence
- Discovery Analytics
- Learning Engine
- Trust

#### Strong Integrated Product Candidate

- Seller Experience

#### Strong Shared / Foundation Candidates

- Data Architecture
- AI Platform
- Security
- Privacy
- Identity & Access
- Observability
- Event / Signal Infrastructure
- Location / Context
- Media / Object Storage
- API / Interface Architecture

#### Important Cross-Product Capabilities

- Brand Recognition
- Campaign Management
- Offering Approval
- Creative Approval
- Registration
- Verification
- Consent / Legal Acknowledgment
- Human Review

None should automatically become independent products.

---

### Chapter 05 Audit Assessment

**Overall Status: CLEAR — STRONGLY DEFINED PRODUCT WITH IMPORTANT
CROSS-PRODUCT BOUNDARIES**

Creative Studio is clearly a PinkCurve product.

Its durable responsibility is not "generate AI videos."

It is:

> Create, prepare, manage, govern, and improve visual representations of
> Offerings for effective PinkCurve discovery.

The chapter establishes:

1. creative understanding;
2. creative strategy;
3. briefs;
4. concepts/scripts;
5. storyboards;
6. asset creation;
7. existing-asset reuse;
8. AI assistance;
9. Seller review;
10. creative variants;
11. campaign organization;
12. creative lifecycle;
13. grounding;
14. quality;
15. performance learning;
16. Trust integration;
17. AMN integration;
18. multiple formats;
19. provider-independent AI strategy.

The major unresolved areas are architectural boundaries rather than missing
Creative Studio purpose:

- Seller Experience;
- campaign ownership;
- creative retrieval;
- Seller approval vs. PinkCurve approval;
- lifecycle vs. discovery eligibility;
- media infrastructure;
- creative provenance;
- Trust boundary.

Participant terminology should be replaced during later Blueprint
synchronization.

No other immediate changes to Chapter 05 are recommended during this audit
pass.

---

## Chapter 06 — Discovery Engine

### Audit Purpose

Chapter 06 defines PinkCurve's intelligent discovery product for connecting
Buyers with Offerings that may be relevant, useful, interesting, timely, or
worth exploring.

The Product & Capability Audit establishes the following terminology:

- **AI Discovery** = the PinkCurve product.
- **Discovery Engine** = the core discovery decision engine within the
  AI Discovery product.

Chapter 06 currently uses "Discovery Engine" for much of the broader product.
This terminology should be synchronized later.

The audit must also distinguish AI Discovery responsibilities from:

- Buyer Intelligence;
- Adaptive Metadata Navigation (AMN);
- Offering Knowledge;
- Creative Studio;
- Buyer Experience;
- Trust;
- Discovery Analytics;
- Learning Engine;
- Seller Intelligence;
- shared Data, AI, Event, and Location/Context capabilities.

Because Chapter 06 predates the dedicated AMN and Buyer Intelligence chapters,
some responsibilities currently described inside the Discovery Engine should
eventually move to or explicitly interface with those products.

---

### Product Classification

| Item | Classification | Status | Notes |
|---|---|---|---|
| AI Discovery | Product | CLEAR | Canonical PinkCurve product responsible for intelligent discovery. |
| Discovery Engine | Core Engine within AI Discovery | CLEAR | Performs eligibility integration, candidate retrieval, matching, ranking, quality/diversity controls, and re-ranking. |

### Terminology Decision

**Decision:**

Use **AI Discovery** as the canonical PinkCurve product name.

Use **Discovery Engine** for the core decision engine within AI Discovery.

Conceptually:

AI Discovery — Product
│
├── Discovery Engine
│   ├── Eligibility Integration
│   ├── Candidate Retrieval
│   ├── Matching
│   ├── Ranking
│   ├── Quality / Diversity Controls
│   ├── Exploration / Exploitation
│   └── Re-ranking
│
├── Search Discovery
├── Browse Discovery
├── Similar Discovery
├── Feed Discovery
├── New / Trending Discovery
├── Location / Time-Aware Discovery
├── Sponsored Discovery
├── Discovery Signals
└── Discovery Explanations

This prevents AI Discovery and Discovery Engine from accidentally being
treated as two independent products.

---

### AI Discovery Product Responsibility

AI Discovery's durable responsibility can be summarized as:

> Determine which eligible Offerings are appropriate to present for a
> particular discovery context and construct useful discovery results while
> respecting Buyer intent, Trust, diversity, freshness, fairness, exploration,
> and Buyer control.

AI Discovery should consume intelligence and capabilities from other PinkCurve
products rather than duplicate those products internally.

---

### Discovery Engine Responsibility

The Discovery Engine is the core decision mechanism within AI Discovery.

It should primarily perform:

1. discovery eligibility integration;
2. candidate retrieval;
3. candidate matching;
4. feature/context assembly;
5. Offering Fit evaluation;
6. ranking;
7. quality controls;
8. Trust-related eligibility enforcement;
9. diversity controls;
10. exploration/exploitation;
11. new-Offering exposure;
12. sponsored-discovery constraints;
13. discovery-policy application;
14. result-set construction;
15. continuous re-ranking.

The exact algorithms and implementation may evolve while these logical
responsibilities remain stable.

---

### Core Discovery Pipeline

Chapter 06 establishes a strong logical pipeline:

Available Offerings
        ↓
Eligibility
        ↓
Candidate Retrieval
        ↓
Intent & Context Matching
        ↓
Ranking
        ↓
Quality / Trust / Diversity Controls
        ↓
Discovery Result
        ↓
Buyer Experience
        ↓
Buyer Interaction
        ↓
Refinement / Re-ranking

This pipeline represents the core Discovery Engine within the broader
AI Discovery product.

---

### AI Discovery Inputs

The chapter identifies many discovery inputs.

After the Product & Capability Audit, these should be expressed according to
their owning products:

Discovery Request
│
├── Buyer Intelligence Signals
├── AMN Discovery State
├── Offering Knowledge
├── Creative Availability
├── Trust / Eligibility Signals
├── Location / Time Context
├── Discovery History / Session Context
├── Learning / Model Configuration
├── Discovery Policy
├── Campaign / Sponsorship Context
└── Discovery Surface Context
        ↓
AI Discovery
        ↓
Discovery Engine

This is an important architectural principle:

> AI Discovery consumes these inputs. It does not necessarily own the
> information or intelligence represented by them.

---

### Critical Boundary: AI Discovery vs. Buyer Intelligence

Chapter 06 currently includes substantial Buyer Intent logic, including:

- explicit intent;
- implicit intent;
- contextual intent;
- historical preferences;
- recent interactions;
- positive feedback;
- negative feedback;
- behavioral patterns.

Chapter 24 now establishes Buyer Intelligence as the dedicated product for
turning Buyer interactions and context into reusable Buyer Signals.

The canonical relationship should therefore become:

Buyer
   ↓
Buyer Experience
   ↓
Buyer Intelligence
   ↓
Buyer Signals
   ↓
AI Discovery
   ↓
Discovery Engine
   ↓
Discovery Results

Buyer Intelligence owns Buyer understanding.

AI Discovery owns the application of appropriate Buyer intelligence to
discovery.

The Discovery Engine should not maintain a competing Buyer model.

**Status: MAJOR SYNCHRONIZATION REQUIRED**

---

### Critical Boundary: AI Discovery vs. AMN

Chapter 06 currently treats Adaptive Metadata Navigation substantially as part
of the Discovery Engine.

Chapter 23 now establishes AMN as a dedicated PinkCurve product.

The emerging boundary is:

AI Discovery
      ↓
Candidate / Discovery State
      ↓
AMN
      ↓
Adaptive Navigation Options
      ↓
Buyer Experience
      ↓
Buyer Navigation Selection
      ↓
AMN / Buyer Intelligence
      ↓
Updated Discovery Context
      ↓
AI Discovery

AI Discovery owns:

- candidate retrieval;
- matching;
- ranking;
- result construction.

AMN owns:

- adaptive metadata navigation;
- navigation-dimension selection;
- navigation-path interpretation;
- metadata-driven refinement.

Buyer Experience owns presentation of navigation controls.

Buyer Intelligence maintains appropriate Buyer Signals resulting from those
interactions.

**Status: MAJOR SYNCHRONIZATION REQUIRED**

---

### Critical Boundary: AI Discovery vs. Offering Knowledge

Offering Knowledge answers:

> What does PinkCurve know about an Offering?

AI Discovery answers:

> How appropriate is this Offering for this discovery context?

Offering Knowledge provides:

- Offering identity;
- Offering type;
- category;
- metadata;
- features;
- benefits;
- price;
- availability;
- location;
- temporal information;
- provenance;
- appropriate learned knowledge.

AI Discovery consumes this information for retrieval and ranking.

Therefore:

Offering Knowledge
      ↓
Offering Retrieval / Query Interface
      ↓
AI Discovery
      ↓
Discovery Engine

This reinforces the Chapter 04 audit finding that Offering Knowledge requires
a defined retrieval/query capability.

Retrieval cannot depend only on `seller_id`.

AI Discovery may require retrieval by combinations of:

- category;
- metadata;
- Offering type;
- semantic similarity;
- location;
- availability;
- time;
- status;
- other discovery constraints.

Detailed APIs belong to System Design.

---

### Critical Boundary: AI Discovery vs. Creative Studio

Creative Studio owns creative creation and management.

AI Discovery may select the appropriate eligible creative representation for
a discovery context.

Candidate relationship:

Creative Studio
       ↓
Creative Package / Eligible Creative Variants
       ↓
AI Discovery
       ↓
Creative Selection
       ↓
Discovery Result
       ↓
Buyer Experience

AI Discovery should not generate creative merely because it needs creative
for a discovery result.

This reinforces the Chapter 05 audit findings that Creative Studio requires:

- a clear output contract;
- a creative retrieval interface.

---

### Critical Boundary: AI Discovery vs. Buyer Experience

AI Discovery determines **what should be presented**.

Buyer Experience determines **how it is presented and controlled by the
Buyer**.

AI Discovery Output
        ↓
Buyer Experience
        ↓
Mobile / Web Presentation
        ↓
Buyer

Buyer Experience owns:

- visual layout;
- mobile/web presentation;
- interaction;
- swipe/tap behavior;
- AMN UI;
- feedback controls;
- explanation presentation.

AI Discovery should not own UI rendering.

**Status: CLEAR**

---

### Critical Boundary: AI Discovery vs. Trust

Trust determines or provides appropriate information concerning:

- Seller verification;
- Offering verification;
- Creative Trust status;
- fraud;
- abuse;
- policy;
- suspicious activity;
- destination integrity;
- bot/invalid activity where applicable.

AI Discovery consumes Trust results.

Trust
   ↓
Trust / Risk / Eligibility Information
   ↓
AI Discovery
   ↓
Discovery Eligibility Enforcement

A fundamental Chapter 06 rule remains:

> Trust overrides relevance.

An Offering that ranks highly should still be excluded when Trust or policy
requirements make it ineligible.

AI Discovery should not duplicate PinkCurve's fraud detection and
verification systems.

---

### Discovery Eligibility

Chapter 06 establishes Eligibility as the first phase of discovery.

However, Discovery Eligibility is not simply a Trust status.

It may depend on:

Seller Status ────────────────┐
Offering Status ──────────────┤
Offering Knowledge ───────────┤
Trust Status ─────────────────┤
Creative Status ──────────────┤
Campaign Status ──────────────┤
Availability ─────────────────┤
Time Constraints ─────────────┤
Geographic Constraints ───────┤
Policy Requirements ──────────┤
                              ↓
                    Discovery Eligibility
                              ↓
                     Discovery Engine

Therefore, **Discovery Eligibility is an assembled discovery decision**.

The contributing products own their respective source states.

AI Discovery owns application of those states to discovery eligibility.

**Status: IMPORTANT DESIGN REQUIREMENT**

---

### Critical Boundary: AI Discovery vs. Discovery Analytics

AI Discovery performs discovery.

Discovery Analytics measures discovery.

AI Discovery may generate decision events such as:

- candidate considered;
- Offering selected;
- rank/result generated;
- creative selected;
- discovery reason;
- Discovery Signal selected.

Buyer Experience may generate interaction events such as:

- Offering displayed;
- Offering opened;
- feedback selected;
- destination clicked.

AMN may generate navigation events.

Discovery Analytics consumes appropriate events.

Therefore:

> Event ownership should correspond to the product where the event actually
> occurs.

AI Discovery should not automatically own every discovery-related event.

**Status: EVENT OWNERSHIP REQUIRES DESIGN**

---

### Critical Boundary: AI Discovery vs. Learning Engine

AI Discovery makes operational discovery decisions.

Learning Engine systematically learns from accumulated evidence.

Learning Engine may improve:

- retrieval;
- ranking;
- metadata effectiveness;
- creative selection;
- trending;
- exploration strategy;
- diversity strategy.

Candidate relationship:

AI Discovery
      ↓
Discovery Events
      ↓
Discovery Analytics / Data
      ↓
Learning Engine
      ↓
Validated Improvements
      ↓
AI Discovery

Learning Engine should not silently modify production discovery behavior.

Evaluation, governance, and deployment controls are required.

---

### Critical Boundary: AI Discovery vs. Seller Intelligence

Seller Intelligence interprets discovery outcomes for Sellers.

AI Discovery determines discovery results.

Seller Intelligence may tell a Seller:

> Buyers frequently reject this Offering after seeing Price.

The Seller may then improve:

- Offering Knowledge;
- Creative;
- campaign strategy.

Seller Intelligence should not directly increase an Offering's ranking.

**Status: CLEAR**

---

### AI Discovery Output

Chapter 06 provides a useful starting definition of output.

AI Discovery returns or produces information concerning:

- ranked Offerings;
- appropriate creative;
- relevant discovery information;
- Discovery Signals;
- explanation information;
- navigation opportunities.

The audit recommends defining a canonical logical output:

Discovery Result
│
├── Discovery Context
│
├── Ranked Offering Results
│   ├── offering_id
│   ├── creative reference
│   ├── Discovery Signals
│   ├── explanation information
│   └── presentation/eligibility context
│
├── AMN Context / Reference
├── Result-Set Diversity Context
├── Continuation / Pagination Information
└── Decision Context for Analytics

The exact schema belongs to System Design.

**Status: OUTPUT IDENTIFIED — CONTRACT DESIGN REQUIRED**

---

### Discovery Request — Missing Input Contract

Chapter 06 explains what the Discovery Engine uses but does not provide a
canonical Discovery Request.

A future logical contract may include:

Discovery Request
│
├── Buyer / Session Reference
├── Buyer Intelligence Signals
├── Discovery Mode
├── Query / Expressed Intent
├── AMN State
├── Location / Context
├── Surface
├── Constraints
└── Continuation State

This is conceptual only.

Exact APIs and schemas belong to System Design.

**Status: DESIGN REQUIREMENT IDENTIFIED**

---

### Discovery Signals

Chapter 06 defines Buyer-facing signals such as:

- Nearby;
- Verified Provider;
- Popular Nearby;
- Limited-Time Offer;
- New;
- Matches What You're Exploring;
- Happening This Weekend.

The underlying facts may come from multiple products:

Offering Knowledge
→ Offering facts

Trust
→ verification

Discovery Analytics
→ trend evidence

Location / Context
→ geographic relationship

Buyer Intelligence
→ Buyer relevance

AI Discovery
→ determines which contextual reason is useful now

Buyer Experience
→ presents it.

Therefore:

**AI Discovery is the strong candidate owner for contextual Discovery Signal
selection.**

Source products remain owners of the underlying facts.

---

### Discovery Explanation

AI Discovery is also the logical owner of the information needed for:

> Why am I seeing this?

AI Discovery knows why an Offering was:

- retrieved;
- considered;
- ranked;
- selected;
- sponsored;
- associated with particular contextual signals.

Therefore:

AI Discovery
→ produces safe explanation information.

Buyer Experience
→ presents it.

Internal model weights, proprietary ranking logic, and security-sensitive
information should not be exposed.

---

### Daily Discovery Feed

Chapter 06 identifies Daily Discovery Feed as an important discovery surface.

The audit classification is:

**Daily Discovery Feed = Buyer Experience surface powered by AI Discovery.**

AI Discovery determines appropriate content.

Buyer Experience presents the feed.

Supporting products provide:

- Offering Knowledge;
- Buyer Intelligence;
- AMN;
- Trust;
- Analytics;
- Location/Context.

Daily Discovery Feed does not currently require standalone product status.

---

### Search and Browse

Search and Browse should currently be classified as capabilities rather than
independent PinkCurve products.

Search:

Buyer Experience
→ search interface

AI Discovery
→ query-based discovery

AMN
→ adaptive refinement

Buyer Intelligence
→ appropriate Buyer signal interpretation.

Browse:

Buyer Experience
→ browsing interface

AI Discovery
→ discovery results

AMN
→ adaptive navigation

Offering Knowledge
→ categories and metadata.

**Status: AI DISCOVERY / EXPERIENCE CAPABILITIES**

---

### Trending Discovery

Trending discovery requires trustworthy trend evidence.

Candidate relationship:

Discovery Events
      ↓
Discovery Analytics
      ↓
Trend Analysis
      ↓
Trust / Manipulation Protection
      ↓
Qualified Trend Signal
      ↓
AI Discovery
      ↓
Trending Discovery

AI Discovery should consume qualified trend information rather than
necessarily own every underlying trend calculation.

**Status: OWNERSHIP REQUIRES FINAL CONFIRMATION**

---

### Location-Aware Discovery

AI Discovery owns application of geographic relevance to discovery.

It should not necessarily own:

- device location acquisition;
- Buyer permission;
- geographic normalization;
- Offering location knowledge;
- Seller geographic information.

Candidate boundary:

Buyer Experience
→ obtains permitted location/context

Offering Knowledge
→ owns Offering-specific geographic knowledge

Shared Location / Context Capability
→ provides geographic mechanisms

Buyer Intelligence
→ uses appropriate contextual signals

AI Discovery
→ applies geographic relevance.

This strongly reinforces Location / Context as a shared capability candidate.

---

### Sponsored Discovery

Sponsored Discovery spans multiple products and functions:

Seller Experience
        ↓
Campaign / Sponsorship
        ↓
Business Model / Pricing
        ↓
Eligibility
        ↓
AI Discovery
        ↓
Buyer Experience Disclosure
        ↓
Analytics / Billing

Important principles:

- sponsorship must not silently become relevance;
- paid placement should be identifiable;
- Trust requirements still apply;
- spending must not override fundamental relevance or safety;
- Buyer usefulness remains primary.

Sponsored Discovery is a cross-product capability, not currently a separate
product.

---

### Personalization

The audit clarifies the personalization boundary:

Buyer Intelligence
→ owns appropriate Buyer understanding.

Privacy
→ determines allowed use and controls.

AI Discovery
→ applies permitted Buyer intelligence to discovery.

Buyer Experience
→ provides transparency and Buyer controls.

Therefore:

> Buyer Intelligence owns Buyer understanding.
> AI Discovery owns personalization of discovery using permitted Buyer
> intelligence.

---

### Cold Start

Chapter 06 identifies:

- Buyer cold start;
- Offering cold start.

These are AI Discovery capabilities.

Buyer cold start may use:

- current expressed intent;
- AMN;
- context;
- location;
- diverse exploration;
- new/trending Offerings.

Offering cold start may use:

- Offering Knowledge;
- metadata;
- Trust;
- Creative quality;
- Buyer intent;
- controlled exploration.

Cold start does not require a separate product.

---

### Exploration and Diversity

AI Discovery should prevent personalization from becoming overly narrow.

Capabilities include:

- exploration/exploitation;
- new-Offering exposure;
- category diversity;
- Seller diversity;
- price diversity;
- geographic diversity;
- discovery-mode diversity.

These belong to AI Discovery because they affect construction of discovery
results.

---

### Session Discovery State

Chapter 06 exposes an important unresolved Design question.

Buyer Experience, AMN, Buyer Intelligence, and AI Discovery all participate
in a changing discovery session.

A session may include:

- current expressed intent;
- search/query;
- AMN path;
- current candidate set;
- previous results;
- feedback;
- negative selections;
- current context;
- continuation state.

The Blueprint does not yet establish canonical ownership of this active
discovery-session state.

**Status: IMPORTANT DESIGN QUESTION**

System Design must prevent Buyer Experience, AMN, Buyer Intelligence, and
AI Discovery from independently maintaining conflicting versions of the same
session state.

---

### Participant Terminology

Chapter 06 contains remaining Participant terminology.

Per the resolved audit decision:

> Replace Participant with the actual actor according to the use case.

Examples:

- `Hide participant` → likely `Hide Seller`
- `participant and offering trustworthy` → `Seller and Offering trustworthy`

Future non-commercial cases should use the appropriate Organization,
Provider, or other explicitly defined actor rather than reintroducing
Participant as a broad abstraction.

**Status: RESOLVED TERMINOLOGY CHANGE**

---

### Shared / Foundation Capabilities Reinforced

| Capability | Classification | Status |
|---|---|---|
| AI Platform | Shared Foundation | CLEAR |
| Data Architecture | Shared Foundation | CLEAR |
| Event / Signal Infrastructure | Shared Foundation | STRONGLY REINFORCED |
| Security | Shared Foundation | CLEAR |
| Privacy | Shared Foundation | CLEAR |
| Trust mechanisms | Cross-product Product/Capability | STRONGLY REINFORCED |
| Location / Context | Shared Capability | STRONGLY REINFORCED |
| Semantic / Vector Retrieval | Shared AI/Data Capability | REINFORCED |
| Search / Retrieval Infrastructure | Shared Capability | REINFORCED |
| Observability | Shared Foundation | REINFORCED |
| Model Evaluation | AI/Learning Foundation | REINFORCED |

---

### Operating Functions Identified or Reinforced

| Function | Classification | Status |
|---|---|---|
| Discovery quality monitoring | Product Operations | CLEAR |
| Ranking evaluation | AI Discovery / AI Operations | CLEAR |
| Fairness monitoring | Governance / Analytics | CLEAR candidate |
| Trending manipulation monitoring | Trust / Analytics Operations | CLEAR |
| Sponsored-discovery monitoring | Business / Product Operations | CLEAR |
| Discovery incident response | Product / Platform Operations | CLEAR candidate |
| Model evaluation | AI/Product Operations | CLEAR |
| Discovery policy governance | Product Governance | CLEAR candidate |

---

### Architectural / Design Requirements Identified

Chapter 06 creates major later Design requirements for:

- AI Discovery interfaces;
- Discovery Engine architecture;
- Discovery Request contract;
- Discovery Result contract;
- Buyer Intelligence interface;
- AMN interface;
- Offering Knowledge retrieval interface;
- Creative Studio retrieval interface;
- Trust interface;
- Discovery Eligibility assembly;
- Location/Context interface;
- Learning Engine interface;
- Analytics/event interface;
- event ownership;
- session-state ownership;
- ranking architecture;
- retrieval architecture;
- Discovery Signals;
- explanation contract;
- search;
- browse;
- Daily Discovery Feed;
- continuous re-ranking;
- cold start;
- exploration/exploitation;
- trending;
- new-Offering exposure;
- sponsored discovery;
- fairness;
- privacy-aware personalization;
- model evaluation;
- graceful MVP-to-learning evolution.

---

### Audit Questions / Decisions to Carry Forward

**D06-01 — AI Discovery vs. Discovery Engine**

**RESOLVED**

AI Discovery is the PinkCurve product.

Discovery Engine is the core decision engine within AI Discovery.

Synchronize Chapter 06 terminology after the audit.

---

**Q06-02 — Buyer Intelligence Interface**

Define the logical Buyer Signals AI Discovery requires from Buyer
Intelligence.

---

**Q06-03 — AMN Interface**

Define how AI Discovery and AMN exchange:

- candidate/discovery context;
- metadata/navigation context;
- Buyer selections;
- refined discovery state.

---

**Q06-04 — Discovery Request Contract**

Define the canonical logical input contract for starting and continuing
discovery.

---

**Q06-05 — Discovery Result Contract**

Define the canonical logical output contract from AI Discovery to Buyer
Experience and other authorized consumers.

---

**Q06-06 — Offering Retrieval**

Carry forward Q04-12.

AI Discovery requires multi-dimensional retrieval from Offering Knowledge.

---

**Q06-07 — Creative Retrieval**

Carry forward Q05-04 and Q05-16.

AI Discovery requires access to appropriate eligible Creative Packages /
variants.

---

**Q06-08 — Discovery Eligibility**

Define how:

- Seller;
- Offering;
- Creative;
- Campaign;
- Trust;
- availability;
- geography;
- time;
- policy;

combine into Discovery Eligibility.

---

**Q06-09 — Event Ownership**

Define which product emits each event rather than centralizing all event
generation in AI Discovery.

---

**Q06-10 — Trending Ownership**

Determine canonical ownership of trend calculation and qualification.

---

**Q06-11 — Discovery Signals**

Confirm AI Discovery ownership of contextual Discovery Signal selection while
source products own underlying facts.

---

**Q06-12 — Discovery Explanation**

Confirm AI Discovery produces explanation information and Buyer Experience
presents it.

---

**Q06-13 — Daily Discovery Feed**

Confirm Daily Discovery Feed as a Buyer Experience surface powered by AI
Discovery.

---

**Q06-14 — Search and Browse**

Confirm Search and Browse as AI Discovery / Buyer Experience capabilities
rather than independent products.

---

**Q06-15 — Personalization**

Define interfaces among:

Buyer Intelligence
→ Buyer understanding

Privacy
→ permitted use

AI Discovery
→ discovery personalization

Buyer Experience
→ Buyer control.

---

**Q06-16 — Discovery Policy**

Determine whether ranking, fairness, sponsorship, exploration, diversity,
and new-Offering rules require an explicit Discovery Policy capability.

---

**Q06-17 — Session Discovery State**

Determine canonical ownership and lifecycle of active discovery-session state.

This is a high-priority System Design issue.

---

### Cross-Chapter Findings Emerging After Chapters 00–06

The PinkCurve product architecture is becoming substantially clearer.

#### Strongly Confirmed Products

- Offering Knowledge
- Creative Studio
- AI Discovery

#### Core Engine

- Discovery Engine — inside AI Discovery

#### Other Strong Product Candidates

- Buyer Experience
- Adaptive Metadata Navigation
- Buyer Intelligence
- Seller Intelligence
- Discovery Analytics
- Learning Engine
- Trust

#### Strong Integrated Product Candidate

- Seller Experience

#### Strong Shared / Foundation Candidates

- Data Architecture
- AI Platform
- Security
- Privacy
- Identity & Access
- Observability
- Event / Signal Infrastructure
- Location / Context
- Media / Object Storage
- API / Interface Architecture
- Semantic / Search Retrieval Infrastructure

---

### Emerging AI Discovery Architecture

The audit now suggests:

Buyer Intelligence ─── Buyer Signals ─────────┐
AMN ───────────────── Navigation State ───────┤
Offering Knowledge ── Offering Knowledge ─────┤
Creative Studio ───── Creative Packages ──────┤
Trust ─────────────── Trust Signals ──────────┤
Location / Context ─ Context ─────────────────┤
Learning Engine ───── Learned Improvements ───┤
                                              ↓
                                      AI Discovery
                                              │
                                      Discovery Engine
                                              │
                                              ↓
                                      Discovery Result
                                              │
                                              ↓
                                      Buyer Experience

This is an important emerging architecture, but it should remain logical at
this stage.

It does not imply one microservice per product.

---

### Chapter 06 Audit Assessment

**Overall Status: CRITICAL — STRONG PRODUCT WITH MAJOR BOUNDARY
SYNCHRONIZATION REQUIRED**

Chapter 06 strongly defines PinkCurve's discovery responsibility.

The audit resolves the terminology:

> **AI Discovery is the product.**
>
> **Discovery Engine is the core engine inside AI Discovery.**

The broader AI Discovery product is responsible for intelligent discovery
capabilities including:

1. Search Discovery;
2. Browse Discovery;
3. Similar Discovery;
4. Feed Discovery;
5. candidate retrieval;
6. ranking;
7. diversity;
8. exploration/exploitation;
9. cold start;
10. new-Offering opportunity;
11. location/time-aware discovery;
12. trending;
13. promotions;
14. Brand Recognition discovery;
15. Sponsored Discovery;
16. Seller fairness;
17. Discovery Signals;
18. explanations;
19. continuous discovery refinement.

The Discovery Engine performs the core decision pipeline within that product.

The largest synchronization issue is that Chapter 06 predates the dedicated
AMN and Buyer Intelligence product definitions.

Consequently, Chapter 06 should later be updated so that:

- Buyer Intelligence owns Buyer understanding;
- AMN owns adaptive metadata navigation;
- Offering Knowledge owns Offering knowledge;
- Creative Studio owns Creative Packages;
- Trust owns Trust evaluation;
- AI Discovery consumes these capabilities and determines discovery;
- Buyer Experience presents and controls the Buyer-facing experience.

The most important future Design work exposed by this chapter includes:

- Discovery Request contract;
- Discovery Result contract;
- Offering retrieval;
- Creative retrieval;
- AMN interface;
- Buyer Intelligence interface;
- Discovery Eligibility assembly;
- event ownership;
- session-state ownership;
- Discovery Signals;
- explanation interfaces.

No immediate rewrite of Chapter 06 is recommended during the audit pass.

Chapter 06 should be one of the **highest-priority chapters for
synchronization after Chapter 25 establishes the canonical Product &
Capability Map**.

---

## Chapter 07 — Discovery Analytics

### Audit Purpose

Chapter 07 defines Discovery Analytics as PinkCurve's measurement and
analytical product for determining whether discovery is producing meaningful
value for Buyers, Sellers/Organizations, and PinkCurve.

Discovery Analytics measures more than activity.

Its fundamental responsibility is to transform trustworthy discovery events
and context into understandable evidence about:

- discovery quality;
- Buyer value;
- Seller/Organization value;
- AMN effectiveness;
- Creative effectiveness;
- discovery diversity;
- freshness;
- negative feedback;
- Feed usefulness;
- Brand Recognition;
- location-aware discovery;
- new-Offering opportunity;
- Trust patterns;
- experimentation;
- platform improvement.

The audit must distinguish Discovery Analytics responsibilities from:

- event production;
- Buyer Intelligence;
- AI Discovery;
- AMN;
- Creative Studio;
- Seller Intelligence;
- Learning Engine;
- Trust;
- Buyer Experience;
- Seller Experience;
- Data Architecture;
- Billing;
- shared Event / Signal infrastructure.

---

### Product Classification

| Item | Classification | Status | Notes |
|---|---|---|---|
| Discovery Analytics | Product | CLEAR | Owns discovery measurement, metric definition, analytical interpretation, discovery journeys, experimentation measurement, and analytical evidence. |

Discovery Analytics is strongly confirmed as a PinkCurve product.

Its durable responsibility can be summarized as:

> Measure and interpret PinkCurve discovery activity so that the platform can
> understand whether Buyers are discovering worthwhile Offerings, Sellers are
> receiving meaningful value, and PinkCurve's discovery products are
> functioning and improving appropriately.

---

### Core Discovery Analytics Capabilities

| Capability | Candidate Owner | Status |
|---|---|---|
| Discovery measurement | Discovery Analytics | CLEAR |
| Discovery event interpretation | Discovery Analytics | CLEAR |
| Discovery journey analysis | Discovery Analytics | CLEAR |
| Meaningful Discovery measurement | Discovery Analytics | CLEAR |
| QOV measurement | Discovery Analytics | CLEAR |
| Discovery Funnel analysis | Discovery Analytics | CLEAR |
| AMN analytics | Discovery Analytics | CLEAR |
| Negative-feedback analytics | Discovery Analytics | CLEAR |
| Feedback-effectiveness measurement | Discovery Analytics | CLEAR |
| Discovery relevance analytics | Discovery Analytics | CLEAR |
| Diversity analytics | Discovery Analytics | CLEAR |
| Freshness analytics | Discovery Analytics | CLEAR |
| New-Offering analytics | Discovery Analytics | CLEAR |
| Daily Discovery Feed analytics | Discovery Analytics | CLEAR |
| Trending analytics | Discovery Analytics | CLEAR, boundary required |
| Location analytics | Discovery Analytics | CLEAR |
| Creative analytics | Discovery Analytics | CLEAR |
| Brand Recognition analytics | Discovery Analytics | CLEAR |
| Seller-value measurement | Discovery Analytics | CLEAR |
| Discovery Score | Discovery Analytics | CLEAR |
| Experiment measurement | Discovery Analytics | CLEAR |
| Guardrail measurement | Discovery Analytics | CLEAR |
| Data-quality measurement | Discovery Analytics + Data Platform | SHARED |
| Bot/manipulation analytics | Analytics + Trust | BOUNDARY REQUIRED |
| Seller reporting data | Discovery Analytics | CLEAR |
| Seller recommendations | Seller Intelligence | NOT Analytics |
| Learned intelligence | Learning Engine | NOT Analytics |
| Billing qualification | Billing + Analytics/Trust | BOUNDARY REQUIRED |

---

### Analytics Philosophy

Chapter 07 establishes an important PinkCurve principle:

> No single interaction should automatically define discovery success.

For example:

Long Viewing Time
        ↓
could indicate
        ↓
Interest OR Confusion

Likewise:

High Click-Through Rate
        ↓
could indicate
        ↓
Strong Relevance OR Misleading Creative

Therefore Discovery Analytics must interpret multiple signals together.

This is a fundamental product principle and should remain canonical.

---

### Critical Boundary: Event Production vs. Discovery Analytics

Chapter 07 says:

> Discovery Analytics begins with structured events.

This is correct.

However, Discovery Analytics should not necessarily generate all of those
events.

Events originate where actions actually occur.

Candidate ownership:

Buyer Experience
├── offering_presented
├── creative_started
├── creative_completed
├── offering_opened
├── offering_saved
├── offering_shared
├── destination_clicked
├── positive_feedback
├── negative_feedback
├── offering_hidden
└── offering_reported

AMN
├── metadata_presented
├── metadata_selected
├── metadata_removed
├── metadata_path_reset
└── other navigation events

AI Discovery
├── discovery decision events
├── candidate/ranking context where appropriate
├── creative-selection decision
├── Discovery Signal selection
└── explanation/decision context

Trust
├── Trust evaluation events
└── enforcement/review events

Creative Studio
└── creative lifecycle events

Discovery Analytics
        ↓
consumes appropriate events
        ↓
validates / interprets / aggregates
        ↓
produces metrics and analytical evidence

Therefore:

> Discovery Analytics owns analytical interpretation of events.
> The product where an action occurs should normally own production of the
> source event.

**Status: IMPORTANT SYSTEM DESIGN REQUIREMENT**

This reinforces Q06-09 from Chapter 06.

---

### Event Taxonomy vs. Event Ownership

Discovery Analytics should still play an important role in defining the
canonical analytical event taxonomy.

This includes:

- event names;
- required analytical context;
- measurement semantics;
- attribution requirements;
- quality expectations.

However:

> Defining what an event means is different from being the runtime producer
> of that event.

This distinction should be preserved during System Design.

---

### Legacy Participant Terminology

Chapter 07 contains:

`participant_hidden`

and:

`participant_id`

Both are legacy terminology.

Per the resolved audit decision:

`participant_hidden`
→ likely `seller_hidden`

`participant_id`
→ appropriate Seller / Organization / Provider identifier according to the
actual domain relationship.

The exact event schema should be updated during later synchronization and
Data Design.

**Status: RESOLVED TERMINOLOGY CHANGE**

---

### Critical Boundary: Discovery Analytics vs. Buyer Intelligence

Chapter 07 identifies Buyer preference signals and Buyer interaction data.

This does not mean Discovery Analytics owns Buyer Intelligence.

Discovery Analytics answers:

> What happened and what does the evidence indicate analytically?

Buyer Intelligence answers:

> What does appropriate accumulated evidence tell PinkCurve about this
> particular Buyer?

Candidate relationship:

Buyer Interaction
       ↓
Events
       ↓
Discovery Analytics
       ↓
Analytical Evidence
       │
       ├──────────────► Learning Engine
       │
       └──────────────► Buyer Intelligence where appropriate
                              ↓
                         Buyer Signals

However, Buyer Intelligence may also consume raw or near-real-time Buyer
events directly where necessary.

System Design should determine whether every Buyer Intelligence signal must
flow through Discovery Analytics.

It probably should not.

**Status: INTERFACE DESIGN REQUIRED**

---

### Important Distinction: Analytics Signal vs. Buyer Signal

Chapter 07 classifies interaction evidence as:

- Exposure Signals;
- Interest Signals;
- Strong Interest Signals;
- Negative Signals;
- Trust Signals.

Chapter 24 defines Buyer Intelligence signals such as:

- Explicit Preferences;
- Session Intent;
- Short-Term Interests;
- Persistent Preferences;
- Negative Preferences;
- Contextual Signals;
- Behavioral Signals;
- Inferred Intelligence.

These are related but not identical.

For example:

`metadata_selected = Waterproof`

may be:

Discovery Analytics
→ an Interest Signal / analytical event

Buyer Intelligence
→ evidence contributing to session intent or short-term interest

Learning Engine
→ evidence that Waterproof metadata may be useful for this Offering/category

Therefore:

> One event may support multiple products, but each product interprets it
> according to its own responsibility.

This is an important architectural finding.

---

### Critical Boundary: Discovery Analytics vs. AI Discovery

AI Discovery decides what to discover.

Discovery Analytics measures what happened and whether the decision worked.

AI Discovery
      ↓
Discovery Decision
      ↓
Buyer Experience
      ↓
Buyer Interaction
      ↓
Discovery Events
      ↓
Discovery Analytics
      ↓
Discovery Evidence

Analytics may evaluate:

- relevance;
- ranking effectiveness;
- diversity;
- new-Offering exposure;
- repetition;
- Feed quality;
- sponsored-discovery performance.

But Discovery Analytics should not directly manipulate production ranking.

Changes should flow through:

Discovery Analytics
      ↓
Evidence
      ↓
Learning / Experimentation / Product Decision
      ↓
Validated Change
      ↓
AI Discovery

**Status: CLEAR**

---

### Critical Boundary: Discovery Analytics vs. AMN

AMN owns adaptive metadata navigation.

Discovery Analytics measures whether AMN works.

AMN produces or participates in events such as:

- metadata presented;
- metadata selected;
- metadata removed;
- metadata reset;
- path progression.

Discovery Analytics derives measures such as:

- Metadata Selection Rate;
- Metadata Progression Rate;
- Metadata Path Depth;
- Metadata Exit Rate;
- Metadata Reversal Rate;
- Metadata-to-Exploration Rate;
- Metadata Usefulness.

Therefore:

AMN
→ performs adaptive navigation.

Discovery Analytics
→ measures adaptive navigation.

Learning Engine
→ may learn how to improve adaptive navigation.

**Status: CLEAR**

---

### Critical Boundary: Discovery Analytics vs. Creative Studio

Creative Studio owns creative.

Discovery Analytics measures creative effectiveness.

Measures may include:

- Creative Start Rate;
- Meaningful Viewing Rate;
- Completion Rate;
- Offering Exploration after Creative;
- Negative Feedback after Creative;
- Destination Click-Through;
- Variant Performance;
- Context Performance;
- Metadata-Path Performance.

Creative Studio
      ↓
Creative Package / Variant
      ↓
Discovery
      ↓
Buyer Interaction
      ↓
Discovery Analytics
      ↓
Creative Performance Evidence
      ↓
Learning / Seller Intelligence / Creative Studio

Creative effectiveness should not be defined solely by viewing time or CTR.

**Status: CLEAR**

---

### Critical Boundary: Discovery Analytics vs. Learning Engine

This is one of the most important boundaries in Chapter 07.

The chapter explicitly distinguishes:

Raw Events
→ what actually happened

Derived Metrics
→ analytical interpretation

Learned Signals
→ patterns generated by models/statistical learning

The emerging ownership should be:

Discovery Analytics
├── Raw-event analytical representation
├── Derived metrics
├── Aggregations
├── Journeys
├── Funnels
└── Measurement evidence

Learning Engine
├── learned patterns
├── predictive relationships
├── learned usefulness
├── model-derived insights
└── validated learning candidates

Therefore, the current "Learned Signals" section should eventually be
synchronized carefully so Discovery Analytics does not become the owner of
the Learning Engine's product responsibility.

Discovery Analytics supplies the evidence.

Learning Engine learns from that evidence.

**Status: IMPORTANT BOUNDARY**

---

### Critical Boundary: Discovery Analytics vs. Seller Intelligence

Chapter 07 contains substantial Seller analytics.

This is appropriate.

But it also correctly states that Seller Intelligence converts analytics
into recommended actions.

The boundary is:

Discovery Analytics
→ "Waterproof metadata was selected by 37% of Buyers exploring this category."

Seller Intelligence
→ "Your Offering may benefit from clearer Waterproof information."

Seller Experience
→ presents the recommendation and allows the Seller to act.

Therefore:

Discovery Analytics
= measurement and evidence

Seller Intelligence
= interpretation/recommendation for the Seller

Seller Experience
= Seller-facing interface

This is a strong and useful three-product boundary.

---

### Seller Dashboard Ownership

Chapter 07 defines a Seller Dashboard containing:

- Offering discovery;
- Meaningful Discovery;
- QOV;
- campaign performance;
- Creative performance;
- metadata insights;
- geographic discovery;
- Brand Recognition;
- trends;
- negative feedback;
- value delivered.

The dashboard uses Discovery Analytics data.

However, based on the emerging product architecture:

> Seller Experience should likely own the Seller Dashboard UI.

Discovery Analytics should provide the metrics/data.

Seller Intelligence should provide recommendations and explanatory
intelligence.

Candidate architecture:

Discovery Analytics ───── Metrics ─────┐
Seller Intelligence ─ Recommendations ─┤
                                       ↓
                              Seller Experience
                                       ↓
                               Seller Dashboard

**Status: STRONG CANDIDATE**

---

### Buyer-Facing Analytics Ownership

Chapter 07 proposes Buyer-facing capabilities such as:

- Saved Offerings;
- Discovery history;
- preference controls;
- Hidden Offerings;
- Hidden Sellers;
- metadata interests.

These should not automatically belong to Discovery Analytics simply because
they depend on analytical/event data.

Likely boundaries:

Buyer Experience
→ presentation and controls

Buyer Intelligence
→ preferences/interests where appropriate

Offering/Saved-item capability
→ saved Offering state

Discovery Analytics
→ historical analytical evidence where needed

Therefore:

**Buyer-facing analytics UI is not automatically a Discovery Analytics
product responsibility.**

This should be synchronized later.

---

### Meaningful Discovery

Chapter 07 defines Meaningful Discovery as a conceptual platform outcome,
not necessarily one event.

This is an excellent product decision.

Possible evidence includes:

- Offering exploration;
- useful metadata navigation;
- save;
- share;
- destination visit;
- directions;
- contact;
- return interest;
- positive rating;
- useful public/community-resource discovery.

Different Offering types may have different meaningful outcomes.

Therefore:

> Meaningful Discovery should remain a measurement framework rather than a
> single universal event.

**Status: CLEAR**

---

### Qualified Offering Visit (QOV)

QOV is defined as a meaningful click-through from PinkCurve to a commercial
Seller/provider destination.

QOV may require:

- human traffic;
- valid session;
- valid destination;
- fraud/duplicate exclusion;
- appropriate interaction qualification.

Discovery Analytics is a strong owner for the analytical definition and
measurement of QOV.

However, QOV may also become billable.

This creates an important distinction:

Analytics QOV
        ↓
Measured Commercial Discovery Value

Billable QOV
        ↓
Verified Financial Event

These may originate from the same underlying event but should not
automatically be treated as identical.

**Status: CRITICAL BUSINESS/DATA BOUNDARY**

---

### Analytics vs. Billing

Chapter 07 explicitly identifies stronger requirements for billing events:

- immutable records;
- deduplication;
- bot exclusion;
- auditability;
- reconciliation;
- Seller-visible explanations;
- dispute support.

Therefore:

Discovery Analytics
→ measures QOV and related discovery value.

Billing / Finance
→ determines billable event according to pricing rules.

Trust / Fraud
→ contributes validity/fraud qualification.

Data Architecture
→ supports appropriate immutable/auditable records.

Seller Experience
→ presents charges/explanations/disputes.

This should become an explicit System Design boundary.

---

### Discovery Score

Chapter 07 correctly changes Discovery Score from a fixed formula to an
experimental framework.

Possible dimensions include:

- relevance;
- Meaningful Exploration;
- positive feedback;
- negative feedback;
- destination value;
- diversity;
- Trust;
- freshness.

Most importantly:

> Discovery Score should not automatically become the ranking objective.

This protects PinkCurve from optimizing one composite metric and creating
unintended behavior.

Classification:

**Discovery Score = Discovery Analytics capability / metric framework**

Not a separate product.

**Status: CLEAR**

---

### Seller Value Index

Chapter 07 suggests Seller Intelligence may combine Seller-value measures into
a future Seller Value Index.

This provides a useful boundary:

Discovery Analytics
→ provides measurements.

Seller Intelligence
→ may construct or interpret Seller Value Index.

Business Model
→ may use appropriate validated value information.

Seller Experience
→ presents understandable value.

The exact ownership should be confirmed when Chapter 09 is audited.

---

### Brand Recognition Analytics

Brand Recognition requires different measurements from direct-response
discovery.

Potential measures include:

- qualified brand impressions;
- unique Buyer reach;
- repeat exposure;
- brand Creative exploration;
- later Offering exploration;
- geographic/category reach.

Discovery Analytics should own measurement.

Creative Studio owns Brand Recognition creative.

AI Discovery determines discovery.

Seller Intelligence interprets Seller value.

Seller Experience presents results.

This further supports:

> Brand Recognition is a cross-product capability, not currently a separate
> product.

---

### Trending Analytics

Chapter 07 provides a clearer answer to Q06-10.

Discovery Analytics is a strong candidate to calculate or derive trend
evidence using:

- qualified-interest growth;
- geographic spread;
- Buyer diversity;
- positive/negative feedback;
- Seller concentration;
- time-window stability.

Trust should contribute:

- bot probability;
- manipulation detection;
- suspicious activity.

Candidate architecture:

Discovery Analytics
      ↓
Trend Evidence
      ↓
Trust / Manipulation Qualification
      ↓
Qualified Trend Signal
      ↓
AI Discovery

This is stronger than making AI Discovery calculate trend evidence itself.

**Status: STRONG CANDIDATE — VERIFY WITH LEARNING/TRUST CHAPTERS**

---

### Location Analytics

Discovery Analytics may measure:

- city/region discovery;
- distance ranges;
- nearby exploration;
- location-to-click performance;
- directions;
- local trends.

This does not make Discovery Analytics the owner of Location/Context.

Shared Location/Context mechanisms remain a shared capability.

Discovery Analytics measures their outcomes.

**Status: CLEAR**

---

### Negative Feedback

Chapter 07 makes negative feedback a first-class analytical capability.

It distinguishes:

Personal Preference Rejection

from:

Platform Trust Problem

This distinction is important.

Examples:

`Not Interested`
→ primarily Buyer preference/discovery signal.

`Misleading`
→ potential Trust problem.

Therefore negative feedback may route to multiple products:

Negative Feedback
      │
      ├── Buyer Intelligence
      ├── Discovery Analytics
      ├── AI Discovery
      ├── Learning Engine
      └── Trust, when appropriate

The same source interaction can legitimately serve multiple products.

---

### Feedback Effectiveness

Chapter 07 introduces an especially valuable measurement:

> Did PinkCurve actually respect the Buyer's negative feedback?

For example:

Show fewer like this
       ↓
Next 20 discoveries
       ↓
How many unwanted similar Offerings remained?

This is a strong Discovery Analytics responsibility.

It measures whether Buyer Intelligence / AI Discovery / AMN successfully
responded to Buyer direction.

**Status: CLEAR AND IMPORTANT**

---

### Experimentation

Discovery Analytics should support controlled experimentation.

Experiments may evaluate:

- ranking;
- AMN;
- Creative formats;
- Feed composition;
- Discovery Signals;
- feedback controls;
- exploration;
- new-Offering exposure;
- diversity;
- location presentation.

Discovery Analytics should own:

- experiment measurement;
- success metrics;
- guardrails;
- comparative analysis.

However, experiment orchestration, assignment, rollout, and feature flags may
eventually require a shared Experimentation Platform capability.

**Status: SHARED CAPABILITY CANDIDATE**

---

### Guardrail Metrics

Chapter 07 correctly establishes that improvement in one metric does not prove
an experiment succeeded.

For example:

CTR ↑

while:

Negative Feedback ↑
Seller Diversity ↓
Trust Reports ↑

should not automatically be considered improvement.

This is an important Product Governance principle.

Discovery Analytics should provide guardrail measurements.

Product/AI Governance determines acceptable tradeoffs.

---

### Data Quality Boundary

Chapter 07 requires:

- schema validation;
- timestamp validation;
- deduplication;
- session integrity;
- bot detection;
- attribution integrity;
- missing-event monitoring.

Some of these are analytical responsibilities.

Others are shared infrastructure responsibilities.

Candidate split:

Discovery Analytics
→ defines analytical quality requirements and detects analytical anomalies.

Event/Data Infrastructure
→ schema enforcement, delivery, storage, deduplication mechanisms.

Trust
→ bot/fraud determination.

Observability
→ pipeline/system health.

This boundary should be formalized during System/Data Design.

---

### Event Processing Architecture

Chapter 07 contains a logical architecture:

Event Producers
      ↓
Validation
      ↓
Event Stream
      ↓
Enrichment
      ↓
Raw Event Store
      ↓
Aggregation
      ↓
Curated Analytics / Metrics
      ↓
Consumers

This strongly reinforces a shared:

**Event / Signal Infrastructure**

candidate.

Discovery Analytics should use this infrastructure.

It should not necessarily own the entire platform event bus, streaming
infrastructure, or raw-event storage system.

**Status: SHARED FOUNDATION STRONGLY CONFIRMED**

---

### Discovery Analytics Output — Important Finding

Like Creative Studio and AI Discovery, Discovery Analytics should eventually
have a clearer logical output contract.

Its outputs are not simply "dashboards."

Candidate logical outputs include:

Analytics Output
│
├── Raw / Validated Event References
├── Derived Metrics
├── Discovery Journey Metrics
├── Meaningful Discovery Measures
├── QOV Measures
├── AMN Metrics
├── Creative Metrics
├── Feed Metrics
├── Diversity / Freshness Metrics
├── Trend Evidence
├── Seller Value Measures
├── Experiment Results
├── Guardrail Results
├── Trust-related Analytical Evidence
└── Platform Health / Quality Evidence

Different consumers receive only the information appropriate to their
responsibilities and permissions.

**Status: OUTPUT EXISTS CONCEPTUALLY — CONTRACT DESIGN REQUIRED**

---

### Discovery Analytics Retrieval / Query Interface

Chapter 07 describes many consumers but does not define how those consumers
obtain analytical information.

Potential logical access patterns may include:

Analytics.get_offering_metrics(offering_id)

Analytics.get_seller_metrics(seller_id)

Analytics.get_creative_metrics(creative_id)

Analytics.get_campaign_metrics(campaign_id)

Analytics.get_amn_metrics(...)

Analytics.get_discovery_metrics(...)

Analytics.get_feed_metrics(...)

Analytics.get_brand_metrics(...)

Analytics.get_experiment_results(experiment_id)

Analytics.get_trend_evidence(...)

These are illustrative capabilities only.

Detailed APIs, analytical stores, SQL models, OLAP systems, caching, and
schemas belong to later System/Data Design.

**Status: DESIGN REQUIREMENT IDENTIFIED**

---

### Discovery Analytics Input Contract

Discovery Analytics also needs clear logical inputs.

Candidate model:

Event / Measurement Input
│
├── event_id
├── event_type
├── timestamp
├── buyer/session reference where permitted
├── offering_id
├── seller/organization reference where applicable
├── creative reference
├── campaign reference
├── discovery context
├── AMN context
├── surface
├── experiment context
├── location context where permitted
└── source/product context

The chapter already provides much of this conceptually.

Exact event schemas belong to Data Architecture.

---

### Privacy Boundary

Discovery Analytics requires enough context to interpret discovery but should
not collect information merely because it might someday be useful.

This reinforces:

- data minimization;
- purpose limitation;
- consent;
- retention;
- aggregation;
- de-identification;
- Buyer control.

Privacy requirements govern Discovery Analytics.

Discovery Analytics does not independently define PinkCurve privacy policy.

**Status: CLEAR**

---

### Anonymous / Unidentified Buyer Finding

Chapter 07 still discusses unidentified browsing states.

The chapter correctly says the exact account and Buyer-verification policy is
defined elsewhere.

Therefore this audit should not resolve anonymous browsing from Chapter 07.

Any final Buyer registration/identity decision should later be synchronized
into Analytics requirements.

**Status: DEPENDS ON BUYER IDENTITY POLICY**

---

### Shared / Foundation Capabilities Reinforced

| Capability | Classification | Status |
|---|---|---|
| Event / Signal Infrastructure | Shared Foundation | STRONGLY CONFIRMED |
| Data Architecture | Shared Foundation | CLEAR |
| Analytics Data Platform | Shared Data Capability | STRONG CANDIDATE |
| Experimentation Infrastructure | Shared Capability | CANDIDATE |
| Identity & Access | Shared Foundation | REINFORCED |
| Privacy | Shared Foundation | CLEAR |
| Security | Shared Foundation | CLEAR |
| Trust / Fraud | Cross-product | STRONGLY REINFORCED |
| Location / Context | Shared Capability | REINFORCED |
| Observability | Shared Foundation | STRONGLY REINFORCED |
| Data Quality | Shared Data Capability | STRONGLY REINFORCED |
| Attribution | Shared Analytics/Data Capability | CANDIDATE |

---

### Operating Functions Identified or Reinforced

| Function | Classification | Status |
|---|---|---|
| Analytics monitoring | Product Operations | CLEAR |
| Metric governance | Product/Data Governance | CLEAR |
| Data-quality monitoring | Data/Analytics Operations | CLEAR |
| Experiment review | Product/AI Operations | CLEAR |
| Bot/manipulation investigation | Trust Operations | CLEAR |
| Seller-reporting operations | Seller Operations | CLEAR candidate |
| Billing reconciliation | Finance/Billing Operations | CLEAR |
| Analytics incident response | Data/Product Operations | CLEAR |
| Metric-definition review | Product Governance | CLEAR |
| Privacy review | Privacy/Governance | CLEAR |

---

### Architectural / Design Requirements Identified

Chapter 07 creates later Design requirements for:

- analytical event taxonomy;
- event producer ownership;
- event schemas;
- Event / Signal Infrastructure;
- analytics ingestion;
- event validation;
- deduplication;
- session integrity;
- event attribution;
- analytical storage;
- metric computation;
- journey reconstruction;
- QOV qualification;
- Meaningful Discovery measurement;
- AMN metrics;
- Creative metrics;
- Feed metrics;
- diversity/freshness metrics;
- Brand Recognition metrics;
- Seller-value metrics;
- Discovery Score;
- experimentation;
- guardrails;
- trend evidence;
- bot/manipulation filtering;
- Seller reporting;
- Analytics retrieval/query interfaces;
- Learning Engine interface;
- Buyer Intelligence interface;
- Trust interface;
- Billing interface;
- retention;
- privacy controls;
- observability.

---

### Audit Questions / Decisions to Carry Forward

**Q07-01 — Event Ownership**

Define canonical producers for each event.

Discovery Analytics should define analytical meaning but should not
necessarily generate every source event.

---

**Q07-02 — Analytics Input Contract**

Define the canonical logical event/measurement contract consumed by Discovery
Analytics.

---

**Q07-03 — Analytics Output Contract**

Define the logical analytical products made available to authorized
consumers.

---

**Q07-04 — Analytics Retrieval Interface**

Define how Seller Intelligence, Learning Engine, Trust, Seller Experience,
AI Discovery, and internal operations retrieve appropriate analytics.

---

**Q07-05 — Buyer Intelligence Interface**

Determine which Buyer signals should come:

- directly from source events;
- through Discovery Analytics;
- through Learning Engine.

Avoid unnecessary latency or duplicated interpretation.

---

**Q07-06 — Learning Boundary**

Confirm:

Discovery Analytics
→ derived measurement/evidence.

Learning Engine
→ learned patterns and model-derived intelligence.

---

**Q07-07 — Seller Dashboard**

Confirm Seller Experience as owner of Seller Dashboard UI.

Discovery Analytics provides metrics.

Seller Intelligence provides recommendations.

---

**Q07-08 — Buyer-Facing Analytics**

Determine ownership of:

- Discovery history;
- Saved Offerings;
- Hidden Offerings;
- Hidden Sellers;
- preference controls;
- metadata interests.

These should not automatically belong to Discovery Analytics.

---

**Q07-09 — QOV vs. Billable QOV**

Define the distinction between:

- analytically qualified QOV;
- financially billable QOV.

Billing requires stronger integrity and auditability.

---

**Q07-10 — Trending**

Confirm Discovery Analytics as primary producer of trend evidence, with Trust
qualifying manipulation/fraud and AI Discovery consuming qualified trend
signals.

---

**Q07-11 — Experimentation Platform**

Determine whether experiment assignment, feature flags, rollout, and
measurement require a reusable shared Experimentation capability.

---

**Q07-12 — Event / Signal Infrastructure**

Confirm shared Event / Signal Infrastructure as a foundation capability.

Discovery Analytics should consume it rather than own all platform event
transport/storage.

---

**Q07-13 — Data Quality**

Define boundary among:

- Discovery Analytics;
- Data Architecture;
- Event Infrastructure;
- Observability;
- Trust.

---

**Q07-14 — Metric Governance**

Determine how PinkCurve defines, versions, validates, approves, and retires
important metrics such as:

- Meaningful Discovery;
- QOV;
- Discovery Score;
- Seller Value Index;
- Useful Visit Rate;
- AMN Usefulness.

---

**Q07-15 — Attribution**

Define attribution rules for:

- Creative;
- campaign;
- AMN path;
- AI Discovery decision;
- Seller;
- Offering;
- Brand Recognition;
- destination click;
- later Buyer action.

---

**Q07-16 — Retention**

Define retention separately for:

- raw events;
- aggregated analytics;
- Trust/fraud evidence;
- experiments;
- billing evidence;
- Seller reports.

---

**Q07-17 — Buyer Identity Policy**

Synchronize Analytics with the eventual decision concerning registered,
verified, and any unidentified Buyer states.


**Q07-18 — QOV Calculation and Storage**

Define Discovery Analytics as the primary owner of QOV measurement and calculation.

Determine where calculated QOV metrics are stored and how they are retrieved by Seller Intelligence, Seller Experience, Business reporting, and other authorized consumers.

If QOV becomes billable, distinguish the analytical QOV from a separately qualified and auditable Billable QOV record used for invoicing.

Physical tables, analytical stores, aggregation strategy, retention, and financial-record design should be defined later in Data Architecture and System Design.

---

### Cross-Chapter Findings Emerging After Chapters 00–07

The PinkCurve product structure is becoming clearer.

#### Strongly Confirmed Products

- Offering Knowledge
- Creative Studio
- AI Discovery
- Discovery Analytics

#### Core Engine

- Discovery Engine — inside AI Discovery

#### Other Strong Product Candidates

- Buyer Experience
- Adaptive Metadata Navigation
- Buyer Intelligence
- Seller Intelligence
- Learning Engine
- Trust

#### Strong Integrated Product Candidate

- Seller Experience

#### Major Shared / Foundation Capabilities

- Data Architecture
- AI Platform
- Security
- Privacy
- Identity & Access
- Event / Signal Infrastructure
- Location / Context
- Media / Object Storage
- Observability
- Data Quality
- API / Interface Architecture

---

### Emerging Analytics Architecture

The audit suggests:

Buyer Experience ─────┐
AMN ──────────────────┤
AI Discovery ─────────┤
Creative Studio ──────┤
Trust ────────────────┤
Other Products ───────┤
                      ↓
             Event / Signal Infrastructure
                      ↓
             Discovery Analytics
                      │
       ┌──────────────┼──────────────┐
       ↓              ↓              ↓
Learning Engine  Seller Intelligence Trust
       │              │
       ↓              ↓
AI Discovery    Seller Experience

Billing may consume specially qualified and auditable analytical events
through a separate financial-control path.

This architecture remains logical.

It does not imply one service, database, or team for each box.

---

### Chapter 07 Audit Assessment

**Overall Status: CLEAR — STRONG PRODUCT WITH IMPORTANT EVENT, LEARNING,
SELLER EXPERIENCE, TRUST, AND BILLING BOUNDARIES**

Discovery Analytics is clearly a PinkCurve product.

Its durable responsibility is:

> Measure and interpret discovery activity to determine whether PinkCurve is
> creating meaningful Buyer, Seller, and platform value.

The chapter strongly establishes:

1. multi-signal analytics;
2. Buyer/Seller/platform measurement;
3. structured discovery events;
4. discovery journeys;
5. Meaningful Discovery;
6. QOV;
7. AMN analytics;
8. negative-feedback analytics;
9. feedback-effectiveness measurement;
10. relevance;
11. diversity;
12. new-Offering opportunity;
13. Feed analytics;
14. freshness;
15. trending analytics;
16. location analytics;
17. Creative analytics;
18. Brand Recognition analytics;
19. Seller-value measurement;
20. Discovery Score;
21. metric hierarchy;
22. experimentation;
23. guardrails;
24. Seller reporting;
25. platform analytics;
26. data quality;
27. bot/manipulation awareness;
28. privacy;
29. retention;
30. billing-measurement integrity;
31. MVP analytics.

The principal areas requiring later synchronization are:

- event producer ownership;
- Buyer Intelligence boundary;
- Learning Engine boundary;
- Seller Dashboard ownership;
- Buyer-facing analytics ownership;
- Trend qualification;
- QOV vs. billable QOV;
- shared Event / Signal Infrastructure;
- analytics input/output contracts;
- retrieval/query interfaces;
- legacy Participant terminology.

No immediate rewrite of Chapter 07 is recommended during the audit.

Chapter 07 should later be synchronized after Chapter 25 establishes the
canonical Product & Capability Map and before detailed System/Data Design.

---

## Chapter 08 — Learning Engine

### Audit Purpose

Chapter 08 defines the Learning Engine as PinkCurve's platform product for
turning trustworthy discovery evidence into validated improvements that can
be consumed by other PinkCurve products.

The Learning Engine learns from evidence.

It should not become the runtime owner of every system that uses what has
been learned.

The audit must therefore distinguish Learning Engine responsibilities from:

- Discovery Analytics;
- AI Discovery;
- Adaptive Metadata Navigation;
- Buyer Intelligence;
- Seller Intelligence;
- Offering Knowledge;
- Creative Studio;
- Trust;
- experimentation;
- model serving;
- data infrastructure;
- operational monitoring.

---

### Product Classification

| Item | Classification | Status |
|---|---|---|
| Learning Engine | Product | CLEAR |
| Learning Pipeline | Core capability within Learning Engine | CLEAR |
| Model Training | Learning Engine capability | CLEAR |
| Feature Engineering | Learning/Data capability | CLEAR, boundary required |
| Label Construction | Learning/Analytics capability | CLEAR, boundary required |
| Model Evaluation | Learning Engine capability | CLEAR |
| Model Registry | Shared AI/ML platform capability | STRONG CANDIDATE |
| Model Deployment | AI Platform / MLOps capability | STRONG CANDIDATE |
| Experimentation | Shared capability | STRONGLY REINFORCED |
| Drift Monitoring | Learning + Observability capability | SHARED |

The Learning Engine is strongly confirmed as a PinkCurve product.

Its durable responsibility can be summarized as:

> Transform trustworthy platform evidence into validated learned knowledge,
> models, rules, recommendations, and improvement candidates that other
> PinkCurve products can safely consume.

---

### Fundamental Product Boundary

The most important Learning Engine boundary is:

Discovery Analytics
        ↓
Measured Evidence
        ↓
Learning Engine
        ↓
Validated Learning
        ↓
Consuming Product
        ↓
Operational Decision

For example:

Discovery Analytics
        ↓
Metadata Usefulness Evidence
        ↓
Learning Engine
        ↓
Learned Metadata Usefulness
        ↓
AMN
        ↓
Adaptive Navigation Decision

Or:

Discovery Analytics
        ↓
Discovery Evidence
        ↓
Learning Engine
        ↓
Validated Ranking Model
        ↓
AI Discovery
        ↓
Discovery Decision

Therefore:

> The Learning Engine learns.
>
> The consuming product decides and acts.

This boundary should remain fundamental to PinkCurve architecture.

---

### Core Learning Engine Capabilities

The chapter identifies the following major Learning Engine capabilities:

1. signal processing;
2. evidence aggregation;
3. feature engineering;
4. label construction;
5. rule learning;
6. statistical learning;
7. machine learning;
8. AI-assisted analysis;
9. offline evaluation;
10. online evaluation support;
11. guardrail evaluation;
12. model training;
13. model versioning;
14. learning provenance;
15. cross-Offering learning;
16. learning transfer;
17. exploration learning;
18. bias/feedback-loop analysis;
19. drift detection;
20. learned-signal generation;
21. recommendation evidence generation.

These capabilities support multiple PinkCurve products.

---

### Learning Inputs

Chapter 08 identifies Learning Engine inputs including:

- Discovery Events;
- Buyer Feedback;
- AMN Activity;
- Creative Performance;
- Offering Knowledge;
- Seller Activity;
- Trust Signals;
- Experiments;
- Context.

The audit recommends expressing these according to product ownership:

Discovery Analytics ─── Analytical Evidence ───────┐
Buyer Intelligence ─── Buyer Signals where needed ┤
AMN ────────────────── Navigation Evidence ────────┤
Offering Knowledge ─── Offering Knowledge ─────────┤
Creative Studio ────── Creative Context ───────────┤
AI Discovery ───────── Discovery Decision Context ─┤
Trust ──────────────── Qualified Trust Evidence ───┤
Experimentation ───── Experiment Results ──────────┤
                                                   ↓
                                           Learning Engine

Not every input must necessarily pass through Discovery Analytics.

System Design should determine appropriate source interfaces.

---

### Critical Boundary: Learning Engine vs. Discovery Analytics

Chapter 07 and Chapter 08 provide a strong distinction:

Raw Event
    ↓
Derived Metric
    ↓
Learned Signal
    ↓
Decision / Recommendation / Model

Canonical ownership should be:

Discovery Analytics
├── event interpretation;
├── derived metrics;
├── aggregations;
├── journeys;
├── funnels;
├── analytical evidence;
└── experiment measurement.

Learning Engine
├── learned relationships;
├── model training;
├── statistical learning;
├── learned rules;
├── learned signals;
├── predictive models;
├── learned recommendations;
└── validated improvement candidates.

Therefore:

> Discovery Analytics tells PinkCurve what happened and how it measured.
>
> Learning Engine determines what PinkCurve can responsibly learn from that
> evidence.

**Status: CLEAR**

---

### Critical Boundary: Learning Engine vs. AI Discovery

Chapter 08 currently says the Learning Engine may improve:

- candidate retrieval;
- ranking;
- Buyer intent interpretation;
- context interpretation;
- similar-Offering retrieval;
- exploration;
- new-Offering exposure;
- diversity;
- Feed composition.

These are primarily operational responsibilities of AI Discovery.

The correct boundary should be:

Learning Engine
→ learns or validates improvements.

AI Discovery
→ applies those improvements during discovery.

Example:

Learning Engine
      ↓
Validated Ranking Model
      ↓
AI Discovery
      ↓
Discovery Engine
      ↓
Ranked Discovery Result

The Learning Engine should not independently rank production Offerings.

**Status: IMPORTANT BOUNDARY**

---

### Ranking Models

Chapter 08 discusses ranking models extensively.

Classification:

**Ranking Model Development / Learning**
→ Learning Engine.

**Production Ranking Decision**
→ AI Discovery / Discovery Engine.

**Ranking Model Serving Infrastructure**
→ AI Platform / MLOps shared capability.

This gives us an important three-layer architecture:

Learning Engine
      ↓
Trained / Validated Model
      ↓
AI Platform / Model Serving
      ↓
AI Discovery
      ↓
Discovery Engine

This distinction will matter considerably during System Design.

---

### Critical Boundary: Learning Engine vs. AMN

The chapter says:

> AMN is itself a learning system.

This wording should eventually be clarified.

AMN is a PinkCurve product that may use learned intelligence.

The Learning Engine is the platform product responsible for systematic
cross-product learning.

Therefore:

AMN
      ↓
Navigation Evidence
      ↓
Discovery Analytics
      ↓
Learning Engine
      ↓
Metadata Usefulness Learning
      ↓
AMN
      ↓
Adaptive Navigation

AMN owns:

- metadata navigation;
- navigation state;
- adaptive metadata presentation;
- navigation decisions.

Learning Engine may learn:

- useful dimensions;
- dimension priority;
- useful sequences;
- confusing dimensions;
- dead ends;
- context-dependent usefulness.

Therefore:

> Learning Engine learns which metadata patterns appear useful.
>
> AMN decides how to apply that learning to navigation.

**Status: MAJOR SYNCHRONIZATION REQUIRED**

---

### Critical Boundary: Learning Engine vs. Buyer Intelligence

Chapter 08 includes a section called:

> Learning Objective 6: Build Buyer Intelligence

Chapter 24 now establishes Buyer Intelligence as its own product.

Therefore the Learning Engine should not "build Buyer Intelligence" as an
owned subsystem.

Instead:

Buyer Interaction
      ↓
Buyer Intelligence / Discovery Events
      ↓
Analytical Evidence
      ↓
Learning Engine
      ↓
Validated Buyer-related Learning
      ↓
Buyer Intelligence
      ↓
Buyer Signals

Buyer Intelligence owns:

- Explicit Preferences;
- Session Intent;
- Short-Term Interests;
- Persistent Preferences;
- Negative Preferences;
- Contextual Signals;
- Behavioral Signals;
- Inferred Intelligence.

Learning Engine may provide:

- learned relationships;
- learned preference patterns;
- validated inference models;
- learned diversity preferences;
- longer-term pattern models.

Buyer Intelligence remains the product that converts permitted information
into consumable Buyer Signals.

**Status: MAJOR SYNCHRONIZATION REQUIRED**

The section title should eventually change from:

`Learning Objective 6: Build Buyer Intelligence`

to something like:

`Learning Objective 6: Improve Buyer Intelligence`

or:

`Support Buyer Intelligence`.

---

### Critical Boundary: Learning Engine vs. Seller Intelligence

The same issue appears in:

> Learning Objective 5: Generate Seller Intelligence

Seller Intelligence is its own product.

Therefore the preferred relationship is:

Discovery Analytics
      ↓
Seller-related Evidence
      ↓
Learning Engine
      ↓
Learned Seller Insights / Recommendation Evidence
      ↓
Seller Intelligence
      ↓
Understandable Recommendation
      ↓
Seller Experience

Learning Engine should not own the Seller-facing intelligence product.

Seller Intelligence interprets learning and analytics into useful,
explainable Seller guidance.

**Status: SYNCHRONIZATION REQUIRED**

A future heading could become:

`Learning Objective 5: Support Seller Intelligence`

---

### Critical Boundary: Learning Engine vs. Offering Knowledge

Chapter 08 correctly makes an important distinction:

Provider/Seller Fact
≠
Learned Knowledge.

Example:

Seller Fact:
Waterproof = Yes

Learned Knowledge:
Frequently explored by Buyers looking for wet-weather trail running.

Offering Knowledge owns authoritative Offering knowledge and provenance.

Learning Engine may produce learned enrichment candidates.

Candidate architecture:

Learning Engine
      ↓
Learned Offering Insight
      ↓
Validation / Provenance
      ↓
Offering Knowledge
      ↓
Stored as Learned Knowledge

The Learning Engine must not silently overwrite verified Seller facts.

**Status: CLEAR AND IMPORTANT**

---

### Critical Boundary: Learning Engine vs. Creative Studio

Learning Engine may identify:

- useful formats;
- useful scenes;
- effective messages;
- harmful creative patterns;
- useful durations;
- context-specific performance;
- Brand Recognition effectiveness.

Creative Studio owns:

- creative generation;
- storyboard;
- creative package;
- variants;
- creative lifecycle.

Therefore:

Creative Interaction
      ↓
Discovery Analytics
      ↓
Learning Engine
      ↓
Creative Learning / Recommendations
      ↓
Creative Studio

Learning Engine improves Creative Studio.

It does not become Creative Studio.

**Status: CLEAR**

---

### Critical Boundary: Learning Engine vs. Trust

Chapter 08 includes:

- suspicious Seller behavior;
- coordinated bot traffic;
- artificial engagement;
- fraud indicators;
- Trust models.

The chapter correctly states that Trust models should operate under Trust &
Safety governance.

Canonical relationship:

Platform Evidence
      ↓
Learning Engine
      ↓
Fraud / Risk Model Candidate
      ↓
Trust Evaluation / Governance
      ↓
Trust System
      ↓
Operational Trust Decision

Therefore:

Learning Engine
→ may train/evaluate Trust-related models.

Trust
→ owns operational Trust policy and decisions.

A commercial ranking objective must never directly govern Trust decisions.

**Status: CLEAR**

---

### Fast Learning Loop — Important Boundary Finding

Chapter 08 defines:

Fast Loop — Session Adaptation

Seconds to Minutes

Examples:

- metadata selection;
- hide Offering;
- location change;
- Not Interested;
- similar-Offering request.

However, the chapter itself correctly notes that this often requires rules
or lightweight state updates rather than model retraining.

This exposes an important distinction:

> Immediate adaptation is not necessarily Learning Engine activity.

Candidate architecture:

Buyer Action
      ↓
Buyer Intelligence / AMN / Session State
      ↓
AI Discovery
      ↓
Immediate Re-ranking

This may occur without invoking Learning Engine.

The Learning Engine can later learn from accumulated evidence.

Therefore the "Fast Learning Loop" might more precisely be called:

**Fast Adaptation Loop**

rather than implying continuous model learning.

**Status: IMPORTANT TERMINOLOGY / BOUNDARY FINDING**

---

### Medium Learning Loop

Time scale:

Hours to Days.

Examples include:

- metadata usefulness;
- trending calculations;
- Creative performance;
- Feed composition;
- Seller insights;
- feature aggregations.

Not all of these necessarily belong to Learning Engine.

For example:

Trending calculation
→ may primarily belong to Discovery Analytics.

Creative performance summary
→ Discovery Analytics.

Seller presentation
→ Seller Intelligence / Seller Experience.

Learning Engine should participate where actual learned relationships or
improvement logic are generated.

**Status: BOUNDARY REFINEMENT REQUIRED**

---

### Slow Learning Loop

Time scale:

Days to Months.

Examples include:

- ranking-model retraining;
- retrieval-model evaluation;
- embedding updates;
- fraud-model development;
- long-term pattern analysis;
- cross-Offering learning.

These are strongly aligned with Learning Engine.

They require stronger:

- evaluation;
- governance;
- reproducibility;
- deployment controls;
- rollback.

**Status: CLEAR**

---

### Learning Output — Critical Design Finding

Chapter 08 says Learning serves multiple products but does not yet define a
canonical Learning Engine output.

This is a significant Design requirement.

Potential logical outputs include:

Learning Output
│
├── Learned Signal
│
├── Learned Rule
│
├── Statistical Finding
│
├── Model Candidate
│
├── Validated Model Version
│
├── Metadata Usefulness Insight
│
├── Offering Knowledge Enrichment Candidate
│
├── Creative Insight
│
├── Seller Recommendation Evidence
│
├── Buyer Intelligence Learning
│
├── Trust Model Candidate
│
└── Experiment / Evaluation Evidence

Every output should include appropriate provenance.

Potential metadata:

- learning_output_id;
- output_type;
- source evidence;
- applicable context;
- model/rule version;
- confidence;
- evaluation results;
- creation time;
- expiration/review requirements;
- governance status.

Exact schemas belong to System Design/Data Design.

| Learning Engine Output                          | Consumer                          | How It Improves PinkCurve                                          |
| ----------------------------------------------- | --------------------------------- | ------------------------------------------------------------------ |
| Retrieval models / retrieval parameters         | AI Discovery                      | Better candidate retrieval and similar-Offering retrieval          |
| Ranking models / ranking parameters             | AI Discovery                      | Better ranking                                                     |
| Intent inference models / learned relationships | Buyer Intelligence                | Better Buyer intent interpretation                                 |
| Context relationships/models                    | Buyer Intelligence / AI Discovery | Better interpretation of location, time, session and other context |
| Metadata usefulness models/signals              | AMN                               | Better metadata selection, sequencing and navigation               |
| Exploration strategy parameters                 | AI Discovery                      | Better exploration/exploitation balance                            |
| New-Offering exposure learning                  | AI Discovery                      | Better opportunity for new Offerings                               |
| Diversity models/parameters                     | AI Discovery                      | Better Seller, category, price and geographic diversity            |
| Feed composition models/parameters              | AI Discovery                      | Better Daily Discovery Feed composition                            |
| Creative-performance learning                   | Creative Studio / AI Discovery    | Better Creative generation and selection                           |
| Offering enrichment candidates                  | Offering Knowledge                | Enrich learned Offering knowledge without changing Seller facts    |
| Buyer-related learned models                    | Buyer Intelligence                | Improve Buyer Signals                                              |
| Seller insight evidence/models                  | Seller Intelligence               | Improve Seller recommendations                                     |
| Trust model candidates                          | Trust                             | Improve fraud/risk detection under Trust governance                |


**Status: OUTPUT CONTRACT REQUIRED**

---

### Learning Provenance

Chapter 08 strongly implies a capability that deserves explicit recognition:

**Learning Provenance**

PinkCurve should be able to trace:

Raw Evidence
      ↓
Derived Metric
      ↓
Feature / Label
      ↓
Learning Process
      ↓
Model / Rule / Learned Signal
      ↓
Evaluation
      ↓
Deployment
      ↓
Operational Result

This supports:

- explainability;
- auditing;
- debugging;
- rollback;
- Trust;
- privacy;
- model governance.

**Classification: Learning/Data Governance Capability**

**Status: STRONGLY REINFORCED**

---

### Training Data

Chapter 08 identifies potential training sources including:

- discovery events;
- AMN navigation;
- Buyer feedback;
- Offering Knowledge;
- Creative interactions;
- QOV;
- Trust-filtered activity;
- experiment results.

Training data should exclude or appropriately handle:

- bots;
- fraud;
- duplicates;
- test traffic;
- suspicious Seller activity;
- broken instrumentation.

This creates an important pipeline:

Raw Events
      ↓
Validation
      ↓
Trust / Bot Qualification
      ↓
Analytics / Curated Data
      ↓
Training Dataset
      ↓
Learning Engine

Training datasets should be versioned and reproducible.

**Status: CRITICAL DATA DESIGN REQUIREMENT**

---

### QOV in Learning

Chapter 08 lists QOV as possible training data.

This reinforces the Chapter 07 classification:

QOV
→ calculated/qualified Discovery Analytics metric.

Learning Engine
→ may consume QOV as evidence or a component of a label.

Learning Engine should not own QOV calculation.

If Billable QOV is created separately, Learning Engine should normally use
the analytically appropriate QOV definition rather than financial records
unless a specific learning objective requires otherwise.

**Status: CONSISTENT WITH CHAPTER 07 AUDIT**

---

### Labels

Label construction is a major Learning Engine capability.

Chapter 08 correctly rejects:

Clicked = Good Discovery

as too simplistic.

Labels may combine:

- Offering exploration;
- explicit feedback;
- metadata alignment;
- destination actions;
- negative feedback;
- delayed outcomes;
- Offering-type-specific outcomes.

Label definitions should be:

- documented;
- versioned;
- testable;
- reproducible;
- tied to intended objectives.

**Status: CRITICAL LEARNING CAPABILITY**

---

### Weak and Delayed Labels

Chapter 08 identifies delayed outcomes such as:

Brand Recognition
→ later exploration.

Community Resource
→ offline help.

Therefore PinkCurve may need:

- immediate labels;
- delayed labels;
- proxy labels;
- outcome-specific labels.

This is particularly important because PinkCurve supports different Offering
types.

A universal "success" label would be inappropriate.

**Status: CLEAR**

---

### Model Types

Chapter 08 identifies:

- Ranking Models;
- Retrieval Models;
- Metadata Selection Models;
- Creative Selection Models;
- Trend Models;
- Trust/Fraud Models.

These models should not automatically be considered owned operationally by
Learning Engine.

Recommended classification:

| Model | Learning / Training | Runtime Owner |
|---|---|---|
| Ranking Model | Learning Engine | AI Discovery |
| Retrieval Model | Learning Engine | AI Discovery |
| Metadata Selection Model | Learning Engine | AMN |
| Creative Selection Model | Learning Engine | AI Discovery / Creative selection capability |
| Trend Model | Learning Engine where ML required | Analytics / Trend capability |
| Trust/Fraud Model | Learning Engine where ML required | Trust |

Model-serving infrastructure may be shared through AI Platform.

---

### Embeddings

Embeddings may represent:

- Offerings;
- Buyer intent;
- metadata;
- Creative;
- categories;
- semantic relationships.

Embeddings are therefore not exclusively a Learning Engine capability.

They are better classified as:

**Shared AI / Semantic Representation Capability**

The Learning Engine may:

- evaluate embeddings;
- fine-tune embeddings;
- learn new representations.

AI Discovery may use embeddings for retrieval.

AMN may use semantic representations.

Offering Knowledge may store/reference Offering embeddings.

Buyer Intelligence may use permitted intent representations.

**Status: SHARED AI CAPABILITY**

---

### Feature Management

Chapter 08 identifies documented features and provenance.

This raises a future question about a Feature Store.

The audit should not assume that PinkCurve needs one.

For Alpha/MVP, a full Feature Store may be unnecessary.

However, the logical capability exists:

**Feature Management**

including:

- definitions;
- provenance;
- versions;
- consistency;
- reuse;
- training/serving alignment.

**Status: CAPABILITY REQUIRED; INFRASTRUCTURE DECISION DEFERRED**

---

### Training Infrastructure

The chapter proposes:

Validated Events
      ↓
Curated Data
      ↓
Features
      ↓
Labels
      ↓
Train / Validation / Test
      ↓
Training
      ↓
Evaluation
      ↓
Model Registry
      ↓
Shadow Deployment
      ↓
Controlled Rollout
      ↓
Production

This is a strong logical lifecycle.

However, it spans multiple product/platform responsibilities.

Candidate ownership:

Data Platform
→ validated/curated data.

Learning Engine
→ features, labels, training, evaluation.

AI Platform / MLOps
→ registry, deployment, model serving.

Experimentation
→ controlled rollout/measurement.

Observability
→ production monitoring.

Product/AI Governance
→ approval and rollback policies.

**Status: MAJOR SYSTEM DESIGN REQUIREMENT**

---

### Model Registry

Model Registry should likely not be owned exclusively by Learning Engine.

It is reusable infrastructure supporting potentially:

- AI Discovery models;
- AMN models;
- Trust models;
- Creative models;
- Buyer Intelligence models.

Therefore:

**Model Registry = Shared AI Platform / MLOps capability**

Learning Engine is a major consumer and producer.

**Status: STRONG CANDIDATE**

---

### Experimentation

Chapter 08 strongly reinforces the Chapter 07 finding that PinkCurve needs a
reusable Experimentation capability.

Experiment lifecycle may include:

Candidate Improvement
      ↓
Offline Evaluation
      ↓
Replay
      ↓
Shadow
      ↓
Limited Rollout
      ↓
Controlled Experiment
      ↓
Guardrail Evaluation
      ↓
Expansion / Rollback

Discovery Analytics measures results.

Learning Engine evaluates learning effectiveness.

Consuming products apply experimental behavior.

**Status: SHARED CAPABILITY STRONGLY CONFIRMED**

---

### Deployment Safety

Chapter 08 establishes excellent deployment principles:

- offline evaluation;
- replay;
- shadow mode;
- limited rollout;
- controlled experiments;
- gradual expansion;
- rollback.

These should eventually become common AI/ML deployment standards across
PinkCurve rather than only Learning Engine behavior.

**Classification: Shared AI Governance / MLOps capability**

---

### Model Governance

The chapter identifies:

- model versions;
- training periods;
- features;
- labels;
- evaluation results;
- deployment date;
- experiment history;
- rollback version.

This strongly indicates a future:

**Model Governance capability**

covering:

- ownership;
- approval;
- lineage;
- versioning;
- evaluation;
- deployment;
- monitoring;
- rollback;
- retirement.

**Status: SHARED AI GOVERNANCE CAPABILITY**

---

### Bias and Feedback Loops

Chapter 08 correctly identifies self-reinforcing exposure as a major risk.

Learning Engine should evaluate:

- exposure bias;
- popularity bias;
- Seller concentration;
- new-Offering disadvantage;
- category imbalance;
- geographic imbalance.

AI Discovery should apply:

- exploration;
- diversity;
- controlled exposure.

Discovery Analytics should measure outcomes.

Therefore:

Learning Engine
→ detects/learns bias patterns.

Discovery Analytics
→ measures bias indicators.

AI Discovery
→ applies discovery controls.

Governance
→ defines acceptable policy.

**Status: CROSS-PRODUCT REQUIREMENT**

---

### Exploration

Exploration spans AI Discovery and Learning Engine.

Learning Engine needs exploration to obtain evidence.

AI Discovery owns operational exposure decisions.

Therefore:

Learning Engine
→ recommends/evaluates exploration strategy.

AI Discovery
→ performs controlled exploration.

Discovery Analytics
→ measures outcomes.

Trust
→ constrains eligibility.

**Status: CLEAR**

---

### Cold Start

Cold start is primarily an AI Discovery / Buyer Intelligence / Offering
Knowledge concern at runtime.

Learning Engine may improve cold-start strategies over time.

Therefore:

**Cold Start Learning**
→ Learning Engine capability.

**Cold Start Runtime Behavior**
→ consuming product responsibility.

This distinction prevents duplicate ownership.

---

### Personalization

Chapter 08 includes substantial personalization content.

Chapter 24 now establishes Buyer Intelligence as the owner of permitted Buyer
understanding.

Therefore:

Learning Engine
→ learns validated personalization relationships/models.

Buyer Intelligence
→ owns Buyer Signals and permitted Buyer understanding.

AI Discovery
→ applies permitted Buyer Signals.

Buyer Experience
→ provides Buyer controls.

Privacy
→ constrains collection and use.

**Status: SYNCHRONIZATION REQUIRED**

---

### Privacy

Learning creates particular privacy concerns because models can infer
information that was never explicitly stored.

The chapter correctly states:

> Technical prediction capability does not automatically justify using
> personal data.

Learning must therefore respect:

- minimization;
- purpose limitation;
- consent;
- retention;
- access controls;
- de-identification;
- sensitive-inference restrictions.

**Status: CRITICAL CROSS-PRODUCT REQUIREMENT**

---

### Human Oversight

Human oversight is explicitly required for:

- unexpected model behavior;
- concentrated Seller exposure;
- increasing Trust reports;
- sensitive recommendations;
- uncertain high-impact fraud decisions;
- difficult-to-explain model behavior.

This should become an explicit operational capability:

**AI / Learning Review**

Potential responsibilities:

- model approval;
- anomaly review;
- experiment review;
- rollback decisions;
- fairness review;
- Trust escalation.

One person may fulfill multiple roles during Alpha, but the responsibility
must exist.

**Status: OPERATING FUNCTION REQUIRED**

---

### Monitoring and Drift

The chapter identifies:

- feature drift;
- prediction drift;
- outcome drift;
- category changes;
- seasonal changes;
- geographic changes;
- Creative changes;
- metadata changes.

This is a shared responsibility:

Learning Engine
→ model/learning interpretation.

Observability
→ technical monitoring.

Discovery Analytics
→ outcome measurement.

Data Quality
→ instrumentation/data failure.

Trust
→ bot/manipulation detection.

**Status: CROSS-PRODUCT MONITORING CAPABILITY**

---

### Learning Failure Modes

Chapter 08 identifies major failure modes:

- click optimization;
- popularity reinforcement;
- ignored negative feedback;
- Seller concentration;
- metadata narrowing;
- filter bubbles;
- Trust contamination;
- metric gaming.

These should eventually become explicit test and monitoring scenarios.

They should not remain only documentation warnings.

**Status: IMPORTANT TEST / GOVERNANCE REQUIREMENT**

---

### MVP Learning Approach

Chapter 08 makes an excellent architectural decision:

PinkCurve should not begin with a large ML infrastructure.

Initial progression:

Discovery Events
      ↓
Reliable Analytics
      ↓
Rules / Weight Adjustments
      ↓
AMN Improvements
      ↓
Seller Insights
      ↓
Experiments
      ↓
More Sophisticated Learning Later

This is strongly consistent with the emerging Alpha/MVP strategy.

The Learning Engine is still a product even if its Alpha implementation is
primarily:

- rules;
- statistics;
- simple scoring;
- manual review;
- controlled experiments.

A product does not require a large ML platform on Day One.

**Status: STRONGLY APPROVED**

---

### Current Status Section — Audit Concern

Chapter 08 currently states:

Implemented:
- Basic event logging foundation;
- Offering Knowledge foundation;
- Initial embedding capabilities.

In Development:
- Discovery event model;
- AMN event model;
- Learning architecture;
- Signal definitions.

Planned:
- many additional capabilities.

Because the Blueprint is increasingly becoming the authoritative future
product/design specification, implementation-status claims should eventually
be validated against the actual codebase.

Otherwise the Blueprint can become stale.

**Status: DOCUMENT GOVERNANCE ISSUE**

Consider later separating:

Product Definition
from
Implementation Status / Project Tracking.

---

### Shared / Foundation Capabilities Reinforced

| Capability | Classification | Status |
|---|---|---|
| Data Architecture | Shared Foundation | CLEAR |
| Event / Signal Infrastructure | Shared Foundation | CLEAR |
| AI Platform | Shared Foundation | STRONGLY REINFORCED |
| Training Data Management | Shared Data/AI Capability | STRONG CANDIDATE |
| Feature Management | Shared AI/Data Capability | STRONG CANDIDATE |
| Model Registry | Shared AI/MLOps Capability | STRONG CANDIDATE |
| Model Serving | Shared AI Platform Capability | STRONG CANDIDATE |
| Experimentation | Shared Capability | STRONGLY CONFIRMED |
| Model Governance | Shared AI Governance | STRONG CANDIDATE |
| Learning Provenance | Data/AI Governance Capability | STRONG CANDIDATE |
| Observability | Shared Foundation | CLEAR |
| Drift Monitoring | AI/Observability Capability | CLEAR |
| Privacy | Shared Foundation | CRITICAL |
| Trust | Cross-product Product/Capability | CRITICAL |
| Data Quality | Shared Data Capability | CRITICAL |

---

### Operating Functions Identified or Reinforced

| Function | Classification | Status |
|---|---|---|
| Model evaluation | AI/Learning Operations | CLEAR |
| Model approval | AI/Product Governance | REQUIRED |
| Experiment review | Product/AI Operations | REQUIRED |
| Drift review | AI/Data Operations | REQUIRED |
| Bias/fairness review | Governance | REQUIRED |
| Model rollback | AI Operations | REQUIRED |
| Training-data quality review | Data/AI Operations | REQUIRED |
| Trust-model review | Trust Operations | REQUIRED |
| Learning incident response | AI/Product Operations | REQUIRED |
| Human model oversight | Governance / Product Operations | REQUIRED |

---

### Architectural / Design Requirements Identified

Chapter 08 creates major later Design requirements for:

- Learning Engine input contract;
- Learning Engine output contract;
- signal-processing pipeline;
- analytical evidence interface;
- training-data pipeline;
- feature management;
- label construction;
- training/validation/test datasets;
- model training;
- offline evaluation;
- replay testing;
- model registry;
- shadow deployment;
- controlled rollout;
- experimentation;
- model serving;
- rollback;
- model lineage;
- learning provenance;
- model governance;
- drift monitoring;
- bias monitoring;
- Learning-to-AI-Discovery interface;
- Learning-to-AMN interface;
- Learning-to-Offering-Knowledge interface;
- Learning-to-Creative-Studio interface;
- Learning-to-Seller-Intelligence interface;
- Learning-to-Buyer-Intelligence interface;
- Learning-to-Trust interface;
- privacy controls;
- human oversight.

---

### Core Learning Engine Responsibility

The Learning Engine is PinkCurve's shared learning product.

Its primary long-term outputs are purpose-specific learned models and other
validated learning artifacts.

Examples include:

- Retrieval Models for AI Discovery;
- Ranking Models for AI Discovery;
- Similarity Models for AI Discovery;
- Buyer Intent Models for Buyer Intelligence;
- Metadata Selection Models for AMN;
- Creative Performance Models for Creative Studio / AI Discovery;
- Feed Composition Models for AI Discovery;
- Trust/Fraud Model candidates for Trust.

During Alpha and early development, some of these learning objectives may be
implemented through rules, manually controlled weights, statistical
relationships, scores, thresholds, or parameters rather than trained models.

The Learning Engine is responsible for creating, evaluating, versioning, and
improving these learning outputs.

The consuming PinkCurve product remains responsible for applying the output
to its own operational decisions.

> **Learning Engine learns and produces validated models and other learning
> outputs. Consuming products use those outputs to perform their specialized
> responsibilities.**

---

### Audit Questions / Decisions to Carry Forward

**Q08-01 — Learning Engine Input Contract**

Define what evidence Learning Engine consumes and which product owns each
input.

---

**Q08-02 — Learning Engine Output Contract**

Define canonical learned outputs and their provenance, confidence, version,
validation status, and intended consumer.

---

**Q08-03 — Analytics / Learning Boundary**

Confirm:

Discovery Analytics
→ measurement and analytical evidence.

Learning Engine
→ learned patterns, models, rules, and validated learning.

---

**Q08-04 — AI Discovery Boundary**

Confirm:

Learning Engine
→ trains/evaluates ranking and retrieval models.

AI Discovery
→ performs production retrieval and ranking.

---

**Q08-05 — AMN Boundary**

Confirm:

Learning Engine
→ learns metadata usefulness.

AMN
→ performs adaptive metadata navigation.

---

**Q08-06 — Buyer Intelligence Boundary**

Update "Build Buyer Intelligence" to "Improve/Support Buyer Intelligence."

Buyer Intelligence remains the owner of Buyer understanding and Buyer
Signals.

---

**Q08-07 — Seller Intelligence Boundary**

Update "Generate Seller Intelligence" to "Support Seller Intelligence."

Seller Intelligence owns Seller-facing interpretation/recommendations.

---

**Q08-08 — Fast Adaptation vs. Learning**

Determine whether "Fast Learning Loop" should become "Fast Adaptation Loop."

Immediate session response should not unnecessarily depend on Learning
Engine.

---

**Q08-09 — Model Ownership**

Define for every model:

- training owner;
- model artifact owner;
- serving owner;
- runtime decision owner;
- monitoring owner;
- approval owner.

---

**Q08-10 — Feature Management**

Determine Alpha/MVP feature-management requirements.

Do not assume a dedicated Feature Store prematurely.

---

**Q08-11 — Model Registry**

Confirm Model Registry as a shared AI Platform/MLOps capability.

---

**Q08-12 — Experimentation**

Confirm Experimentation as shared infrastructure/capability serving multiple
products.

---

**Q08-13 — Model Governance**

Define:

- approval;
- versioning;
- lineage;
- evaluation;
- rollout;
- monitoring;
- rollback;
- retirement.

---

**Q08-14 — Learning Provenance**

Define traceability from source evidence through learned output to operational
use.

---

**Q08-15 — Training Data**

Define training-data qualification, versioning, lineage, Trust filtering,
privacy filtering, and reproducibility.

---

**Q08-16 — QOV**

Carry forward Q07-18.

QOV calculation belongs to Discovery Analytics.

Learning Engine may consume QOV as evidence.

---

**Q08-17 — Trend Learning**

Clarify:

Discovery Analytics
→ trend evidence/calculation.

Learning Engine
→ learned/predictive trend models where needed.

Trust
→ manipulation qualification.

AI Discovery
→ applies qualified trend signals.

---

**Q08-18 — Trust Models**

Learning Engine may train/evaluate Trust models.

Trust owns operational policy and decisions.

---

**Q08-19 — Drift**

Define boundaries among Learning Engine, Observability, Data Quality,
Discovery Analytics, and Trust.

---

**Q08-20 — Human Oversight**

Define model/learning review responsibilities for Alpha, Beta, MVP, and later
scale.

---

**Q08-21 — Implementation Status**

Determine whether implementation status should remain inside Blueprint
product chapters or move to project/roadmap tracking.

---

### Cross-Chapter Findings Emerging After Chapters 00–08

The product/capability hierarchy is becoming increasingly stable.

#### Strongly Confirmed Products

- Offering Knowledge
- Creative Studio
- AI Discovery
- Discovery Analytics
- Learning Engine

#### Core Engine

- Discovery Engine — inside AI Discovery

#### Other Strong Product Candidates

- Buyer Experience
- Adaptive Metadata Navigation
- Buyer Intelligence
- Seller Intelligence
- Trust

#### Strong Integrated Product Candidate

- Seller Experience

#### Major Shared / Foundation Capabilities

- Data Architecture
- AI Platform
- Security
- Privacy
- Identity & Access
- Event / Signal Infrastructure
- Location / Context
- Media / Object Storage
- Observability
- Data Quality
- API / Interface Architecture
- Experimentation
- Model Registry / MLOps
- Model Governance

---

### Emerging Learning Architecture

The audit now suggests:

Discovery Analytics ───── Analytical Evidence ─────┐
AMN ───────────────────── Navigation Evidence ─────┤
Offering Knowledge ────── Knowledge ────────────────┤
Creative Studio ───────── Creative Context ─────────┤
Buyer Intelligence ───── Buyer Signals ─────────────┤
AI Discovery ──────────── Decision Context ─────────┤
Trust ─────────────────── Qualified Trust Evidence ─┤
                                                   ↓
                                           Learning Engine
                                                   │
                  ┌────────────────────────────────┼───────────────┐
                  ↓                                ↓               ↓
             Models / Rules                 Learned Signals    Insights
                  │                                │               │
                  ↓                                ↓               ↓
            AI Platform /                   Product Interfaces   Intelligence
            Model Serving                                      Products
                  │
                  ↓
        AI Discovery / AMN / Trust /
        Other Runtime Products

This remains a logical architecture.

It does not imply one service, database, model, project, or team for every
box.

---

### Chapter 08 Audit Assessment

**Overall Status: CRITICAL — STRONG PRODUCT WITH MAJOR CROSS-PRODUCT
BOUNDARIES**

Learning Engine is clearly a PinkCurve product.

Learning Engine is strongly confirmed as PinkCurve's learning and model-production product. Its primary long-term responsibility is to create, validate, version, monitor, and improve purpose-specific learned models and other learning outputs for consumption by PinkCurve products. It does not itself become the runtime owner of discovery, navigation, Buyer understanding, Seller intelligence, Creative, or Trust decisions.

Its durable responsibility is:

> Transform trustworthy discovery evidence into validated learning that
> improves PinkCurve products without sacrificing Buyer control, Trust,
> privacy, diversity, fairness, or explainability.

The chapter strongly establishes:

1. responsible continuous learning;
2. multi-signal learning;
3. explicit and negative feedback;
4. learning provenance;
5. ranking learning;
6. retrieval learning;
7. AMN learning;
8. Offering Knowledge enrichment;
9. Creative learning;
10. Seller-related learning;
11. Buyer-related learning;
12. Trust-related learning;
13. rules/statistics/ML/AI-assisted learning;
14. multiple learning time scales;
15. labels;
16. delayed outcomes;
17. embeddings;
18. training data;
19. feature management;
20. model evaluation;
21. deployment safety;
22. model versioning;
23. feedback-loop protection;
24. exploration;
25. cold start;
26. cross-Offering learning;
27. personalization constraints;
28. privacy;
29. human oversight;
30. drift monitoring;
31. learning failure modes;
32. evidence-first MVP learning.

The principal synchronization issues are:

- Learning Engine vs. AI Discovery;
- Learning Engine vs. AMN;
- Learning Engine vs. Buyer Intelligence;
- Learning Engine vs. Seller Intelligence;
- Learning Engine vs. Trust;
- Learning Engine vs. Discovery Analytics;
- Fast Adaptation vs. actual learning;
- model training vs. model serving;
- shared Experimentation;
- shared MLOps infrastructure.

No immediate rewrite of Chapter 08 is recommended during the audit.

However, later synchronization should change the conceptual language from:

"Learning Engine builds/controls the other intelligent products"

toward:

> **Learning Engine produces validated learning.
> Each PinkCurve product remains responsible for applying that learning
> within its own product boundary.**

This is one of the most important architectural boundaries identified by the
audit so far.

---
# Chapter 09 Audit — Seller Intelligence

## Audit Summary

Chapter 09 confirms **Seller Intelligence** as a core PinkCurve product.

Seller Intelligence transforms PinkCurve discovery evidence, analytics, learned signals, model outputs, Offering Knowledge, Creative performance, Trust information, and other authorized platform evidence into understandable and actionable intelligence for Sellers.

Its primary responsibility is not simply to display analytics.

Seller Intelligence should help a Seller understand:

* what is happening;
* why it may be happening;
* what opportunities or problems may exist;
* what action the Seller might consider;
* how confident PinkCurve is in that recommendation;
* what evidence supports the recommendation;
* whether the Seller acted on the recommendation;
* whether that action actually improved the outcome.

Seller Intelligence therefore occupies an important position between PinkCurve's analytical and learning products and the Seller-facing experience.

The core architectural relationship is:

```text
Discovery Analytics measures.
Learning Engine learns.
Seller Intelligence interprets and recommends.
Seller Experience presents and enables Seller action.
The Seller decides.
```

This boundary should remain explicit throughout PinkCurve architecture and later System Design.

---

# 1. Product Classification

**Classification: Core PinkCurve Product**

Seller Intelligence should remain a distinct PinkCurve product.

Its primary responsibility is:

> **Transform PinkCurve evidence, analytics, and validated learning into understandable, actionable Seller intelligence and recommendations.**

Seller Intelligence should not absorb the responsibilities of the products that provide its evidence or consume its outputs.

For example:

* Discovery Analytics measures discovery activity and outcomes.
* Learning Engine creates validated learning and purpose-specific learned models.
* Offering Knowledge owns structured knowledge about Offerings.
* Creative Studio creates and manages Creative.
* Buyer Intelligence produces Buyer Signals and maintains permitted Buyer understanding.
* Trust performs operational Trust evaluation and enforcement.
* Seller Experience provides the Seller-facing user interface.
* Seller Intelligence converts relevant evidence from these products into Seller-facing intelligence.

This establishes Seller Intelligence as an intelligence and recommendation product rather than a general Seller-management system.

---

# 2. Product Boundary

The Seller Intelligence boundary should be stated clearly.

Seller Intelligence:

* consumes authorized evidence;
* identifies meaningful patterns;
* detects gaps;
* identifies opportunities;
* generates Seller Insights;
* produces Seller Recommendations;
* estimates recommendation confidence;
* explains supporting evidence;
* evaluates recommendation outcomes;
* produces Seller Value Intelligence.

Seller Intelligence does not:

* own Offering facts;
* perform production discovery ranking;
* own Buyer Intelligence;
* expose individual Buyer profiles;
* create Creative directly;
* make Trust enforcement decisions;
* own billing;
* own Seller registration;
* own Seller verification;
* provide the complete Seller-facing UI;
* make business decisions for the Seller.

The fundamental boundary is:

> **Seller Intelligence advises. The Seller decides.**

---

# 3. Seller Intelligence Inputs

Seller Intelligence depends on evidence produced throughout PinkCurve.

The major logical inputs identified by Chapter 09 include:

| Input                          | Primary Source                            |
| ------------------------------ | ----------------------------------------- |
| Discovery performance          | Discovery Analytics                       |
| Qualified Offering Visits      | Discovery Analytics                       |
| Discovery journeys             | Discovery Analytics                       |
| AMN behavior                   | Discovery Analytics / AMN                 |
| Buyer-interest patterns        | Buyer Intelligence / Discovery Analytics  |
| Learned signals                | Learning Engine                           |
| Learned model outputs          | Learning Engine                           |
| Statistical relationships      | Learning Engine / Discovery Analytics     |
| Offering facts                 | Offering Knowledge                        |
| Offering Knowledge gaps        | Offering Knowledge + analysis             |
| Creative information           | Creative Studio                           |
| Creative performance           | Discovery Analytics                       |
| Geographic evidence            | Discovery Analytics                       |
| Brand-recognition evidence     | Discovery Analytics                       |
| Promotion evidence             | Discovery Analytics                       |
| Trust and quality status       | Trust                                     |
| Seller configuration           | Seller domain / Seller Experience         |
| Campaign information           | Campaign capability                       |
| Historical recommendations     | Seller Intelligence                       |
| Seller recommendation feedback | Seller Experience / Seller Intelligence   |
| Recommendation outcomes        | Discovery Analytics / Seller Intelligence |

These inputs reinforce an important architectural principle:

> **Seller Intelligence consumes evidence from authoritative PinkCurve products rather than becoming the authoritative owner of every underlying data domain.**

---

# 4. Seller Intelligence Outputs

Chapter 09 describes many outputs throughout the document.

These should be explicitly recognized as the outputs of the Seller Intelligence product.

Primary Seller Intelligence outputs include:

| Output                                        | Primary Consumer                                            |
| --------------------------------------------- | ----------------------------------------------------------- |
| Seller Insight                                | Seller Experience                                           |
| Seller Recommendation                         | Seller Experience                                           |
| Recommendation Explanation                    | Seller Experience                                           |
| Recommendation Confidence                     | Seller Experience                                           |
| Seller Opportunity                            | Seller Experience                                           |
| Seller Alert                                  | Seller Experience / Notification capability                 |
| Seller Performance Summary                    | Seller Experience                                           |
| Seller Value Summary                          | Seller Experience                                           |
| Seller Report                                 | Seller Experience                                           |
| Offering Knowledge Improvement Recommendation | Seller / Offering Knowledge                                 |
| Creative Improvement Recommendation           | Seller / Creative Studio                                    |
| Campaign Recommendation                       | Seller / Campaign capability                                |
| Trust / Quality Action Requirement            | Seller Experience                                           |
| Recommendation Feedback Evidence              | Seller Intelligence / Learning Engine                       |
| Recommendation Outcome Evidence               | Seller Intelligence / Learning Engine / Discovery Analytics |

Seller Intelligence therefore produces considerably more than dashboards.

Its primary product outputs are:

```text
Seller Insights
      +
Seller Recommendations
      +
Seller Opportunities
      +
Seller Alerts
      +
Seller Reports
      +
Seller Value Intelligence
      +
Recommendation Outcome Evidence
```

These outputs should eventually receive formal interfaces during System Design.

---

# 5. Seller Intelligence and Seller Experience

Seller Intelligence and Seller Experience should remain separate products.

Seller Intelligence determines:

* what is significant;
* what evidence supports an insight;
* what opportunity may exist;
* what recommendation should be considered;
* how confident PinkCurve is;
* how the recommendation should be explained;
* whether the recommendation appears to have helped.

Seller Experience determines:

* how the intelligence is displayed;
* how Sellers navigate it;
* how recommendations appear;
* how Sellers accept, dismiss, or postpone recommendations;
* how Sellers move from recommendations into other PinkCurve products;
* how Seller feedback is captured.

Conceptually:

```text
Discovery Analytics
       +
Learning Engine
       +
Offering Knowledge
       +
Creative Studio
       +
Trust
       ↓
Seller Intelligence
       ↓
Seller Insights
Seller Recommendations
Seller Opportunities
Seller Alerts
Seller Reports
Seller Value Intelligence
       ↓
Seller Experience
       ↓
Seller
```

This separation will become especially important when PinkCurve defines product interfaces.

---

# 6. Intelligence Categories

Chapter 09 identifies a broad set of Seller Intelligence categories.

These should remain within the Seller Intelligence product rather than automatically becoming independent products.

Major categories include:

* Discovery Performance Intelligence;
* Offering Intelligence;
* Adaptive Metadata Intelligence;
* Creative Intelligence;
* Buyer Interest Intelligence;
* Geographic Intelligence;
* Trend Intelligence;
* Brand Recognition Intelligence;
* Promotion Intelligence;
* Opportunity Intelligence;
* Trust and Quality Intelligence;
* Competitive Intelligence;
* Benchmarking;
* Seller Value Intelligence.

These categories represent different forms of Seller Intelligence.

They do not require separate products or separate organizational departments.

---

# 7. Discovery Performance Intelligence

**Classification: Major Seller Intelligence Capability**

Discovery Performance Intelligence helps Sellers understand how their Offerings participate in PinkCurve discovery.

Potential evidence includes:

* Offering presentations;
* meaningful Creative views;
* Offering exploration;
* saves;
* positive feedback;
* negative feedback;
* destination visits;
* QOV;
* repeat discovery;
* geographic discovery;
* new-Buyer discovery;
* discovery trends.

Seller Intelligence should preserve the distinction between:

```text
Observed Discovery Evidence
          ↓
Analytical Interpretation
          ↓
Seller Intelligence
```

Discovery Analytics remains responsible for measuring the underlying discovery activity.

---

# 8. Discovery Journey Intelligence

**Classification: Seller Intelligence Capability**

PinkCurve discovery should not always be interpreted as a conventional conversion funnel.

A useful journey may be:

```text
Offering Presented
      ↓
Metadata Selected
      ↓
Offering Explored
      ↓
Saved
```

without an immediate destination visit.

Likewise:

```text
Brand Creative Presented
      ↓
Buyer Later Explores Seller
```

may represent meaningful longer-term discovery.

Seller Intelligence should therefore interpret **discovery journeys as well as funnels**.

---

# 9. Offering Intelligence

**Classification: Major Seller Intelligence Capability**

Offering Intelligence identifies how Offering Knowledge may affect discovery.

Potential insights include:

* missing knowledge;
* incomplete metadata;
* outdated information;
* frequently selected attributes;
* attributes Buyers appear to value;
* knowledge inconsistencies;
* missing location information;
* missing availability information;
* weak destination information;
* knowledge-quality problems.

Offering Intelligence does not own Offering facts.

Offering Knowledge remains authoritative.

Seller Intelligence identifies gaps and recommends corrective action.

For example:

```text
Discovery Evidence
      ↓
Frequently selected "Waterproof"
      ↓
Offering Knowledge
      ↓
Waterproof status missing
      ↓
Seller Intelligence
      ↓
Recommendation:
Add verified waterproof information if applicable.
```

Seller confirmation remains necessary where the information represents a factual claim about the Offering.

---

# 10. Adaptive Metadata Intelligence

**Classification: Major Seller Intelligence Capability**

AMN creates a potentially distinctive source of Seller intelligence.

Seller Intelligence may identify:

* frequently selected metadata;
* metadata associated with deeper exploration;
* common navigation paths;
* metadata associated with abandonment;
* comparison attributes;
* emerging metadata interests;
* metadata missing from Offering Knowledge.

This may allow Sellers to understand **how Buyers think about an Offering category**, rather than merely what Buyers clicked.

Buyer-level AMN histories should not be exposed to Sellers.

Seller-facing AMN intelligence should use appropriate aggregation and privacy controls.

---

# 11. Creative Intelligence

**Classification: Major Seller Intelligence Capability**

Creative Intelligence helps Sellers understand how visual presentation affects discovery.

Potential intelligence includes:

* Creative variants associated with stronger discovery;
* opening scenes associated with exploration;
* early abandonment;
* negative feedback;
* important Offering features missing visually;
* Creative duration;
* Seller-provided versus PinkCurve-generated Creative performance;
* Creative performance in different discovery contexts.

Creative Intelligence should optimize toward discovery quality rather than clicks alone.

Seller Intelligence recommends.

Creative Studio remains responsible for creating and managing Creative.

---

# 12. Buyer Interest Intelligence

**Classification: Major Seller Intelligence Capability**

Seller Intelligence may provide Sellers with privacy-safe aggregated understanding of Buyer interest.

Examples include:

* common Buyer intents;
* frequently selected metadata;
* category interests;
* geographic interests;
* seasonal patterns;
* promotion sensitivity;
* repeated questions or concerns where supported.

PinkCurve should prefer intent-oriented Seller intelligence over unnecessary demographic profiling.

Buyer Intelligence and Seller Intelligence must remain logically separate.

Buyer Intelligence may contain information appropriate for serving an individual Buyer that must never automatically become Seller-visible information.

The correct relationship is:

```text
Buyer Intelligence / Discovery Evidence
              ↓
Privacy-Safe Aggregation
              ↓
Seller Intelligence
              ↓
"Buyers exploring this category
are increasingly interested in
lightweight options."
```

Not:

```text
Seller
   ↓
Individual Buyer Profile
```

Seller Intelligence should help Sellers understand **collective Buyer needs**, not expose private Buyer behavior.

---

# 13. Geographic Intelligence

**Classification: Seller Intelligence Capability**

Where location is relevant, Seller Intelligence may provide aggregated insights such as:

* cities or regions producing meaningful discovery;
* useful distance ranges;
* geographic differences in Buyer interest;
* local trends;
* location-specific campaign performance;
* geographic opportunities.

Location intelligence should use appropriate aggregation and privacy thresholds.

Precise Buyer location should not be exposed unnecessarily.

---

# 14. Trend Intelligence

**Classification: Seller Intelligence Capability**

Trend Intelligence may identify meaningful changes over time.

Potential examples include:

* rapidly increasing discovery;
* declining Offering interest;
* emerging metadata patterns;
* seasonal changes;
* geographic shifts;
* category growth;
* Creative fatigue;
* aggregated competitive changes.

Trend Intelligence must distinguish measured evidence from speculation.

A statistical change does not automatically establish its cause.

---

# 15. Brand Recognition Intelligence

**Classification: Major Seller Intelligence Capability**

Brand Recognition is a distinct PinkCurve Seller objective.

Seller Intelligence may help Sellers understand:

* qualified brand exposure;
* unique reach;
* repeated brand exposure;
* Brand Creative exploration;
* Seller profile exploration;
* later Offering exploration;
* geographic reach;
* category reach;
* brand-related saves or follows where supported.

Seller Intelligence should distinguish:

```text
Observed Association
```

from:

```text
Demonstrated Causation
```

PinkCurve should not claim that Brand Recognition caused later behavior unless appropriate evidence supports the conclusion.

---

# 16. Promotion Intelligence

**Classification: Seller Intelligence Capability**

Promotion Intelligence may help Sellers understand:

* Promotion exposure;
* Promotion exploration;
* destination visits;
* geographic performance;
* expiration effects;
* interest before and during Promotion;
* performance compared with non-Promotion Creative.

PinkCurve should avoid optimizing toward permanent discounting merely because promotions generate short-term activity.

---

# 17. Opportunity Intelligence

**Classification: Major Seller Intelligence Capability**

Opportunity Intelligence identifies potentially useful actions that Sellers may not immediately recognize.

Examples include:

* missing frequently used metadata;
* geographic demand;
* emerging Buyer intent;
* new category opportunities;
* Creative-format opportunities;
* Brand Recognition opportunities;
* seasonal opportunities;
* Promotion opportunities;
* Offering Knowledge improvements.

Opportunity Intelligence should provide supporting evidence and appropriate confidence.

---

# 18. Trust and Quality Intelligence

**Classification: Major Seller Intelligence Capability**

Seller Intelligence may communicate Trust and quality information such as:

* incomplete verification;
* unavailable destination URL;
* stale Offering information;
* missing required information;
* increasing Buyer reports;
* unsupported Creative claims;
* Offering suspension;
* account-security actions.

However:

> **Seller Intelligence does not determine whether a Seller is fraudulent or whether enforcement is required.**

Trust owns operational Trust decisions.

The relationship should be:

```text
Trust
   ↓
Trust Decision / Required Action
   ↓
Seller Intelligence
   ↓
Understandable Seller Guidance
   ↓
Seller Experience
```

Sensitive fraud-detection mechanisms should not be exposed through Seller Intelligence.

---

# 19. Competitive Intelligence

**Classification: Later Seller Intelligence Capability With Governance Risk**

Competitive Intelligence may provide useful aggregated market context.

Appropriate information may include:

* category benchmarks;
* price-range distributions;
* common metadata;
* common Creative formats;
* discovery-performance ranges;
* category growth;
* Buyer-interest trends.

Seller Intelligence should not expose confidential information about individual competitors.

For example:

```text
Appropriate:

Your Offering's destination-visit rate
is above the category median.
```

rather than:

```text
Inappropriate:

Competitor X has a 14.2% click-through rate.
```

Competitive Intelligence therefore requires:

* aggregation;
* minimum cohort thresholds;
* privacy rules;
* governance;
* careful access control.

---

# 20. Benchmarking

**Classification: Seller Intelligence Capability**

Seller benchmarking may compare performance against:

* Seller history;
* comparable Offering types;
* category;
* location;
* price band;
* campaign type;
* Creative format.

Benchmarks should only be produced when sufficient comparable evidence exists.

Small samples should not create misleading conclusions.

---

# 21. Recommendation Engine

**Classification: Major Seller Intelligence Capability**

The Recommendation Engine should remain part of Seller Intelligence.

It should not currently become an independent PinkCurve product.

Conceptually:

```text
Seller Intelligence
    │
    ├── Insight Generation
    ├── Gap Detection
    ├── Pattern Detection
    ├── Opportunity Detection
    ├── Impact Estimation
    │
    ├── Recommendation Engine
    │       ├── Prioritization
    │       ├── Confidence
    │       └── Explanation
    │
    ├── Recommendation Lifecycle
    └── Recommendation Evaluation
```

This boundary avoids unnecessary product fragmentation.

---

# 22. Seller Recommendation

Chapter 09 establishes the need for a first-class logical **Seller Recommendation** object.

A conceptual Seller Recommendation may contain:

```text
Seller Recommendation

recommendation_id
seller_id

offering_id             optional
campaign_id             optional
creative_id             optional

recommendation_type

observation
interpretation
recommended_action

confidence
reason
evidence_reference

status

created_at
expires_at              optional

seller_response
seller_action
action_time

outcome_status
outcome_evidence
evaluation
```

This is a **logical product object**, not a final database schema.

The exact data model should be determined during Data Design and System Design.

The important Blueprint decision is:

> **Seller Recommendation is a first-class output of Seller Intelligence.**

---

# 23. Recommendation Confidence

**Classification: Seller Intelligence Feature**

Recommendations should communicate uncertainty.

Potential confidence levels include:

* High Confidence;
* Medium Confidence;
* Exploratory.

Confidence may consider:

* observation count;
* evidence quality;
* stability over time;
* comparable sample size;
* experiment evidence;
* contextual consistency;
* causal versus correlational evidence.

PinkCurve should not present uncertain recommendations as facts.

---

# 24. Recommendation Explanation

**Classification: Seller Intelligence Feature**

A useful recommendation should ideally answer:

```text
What happened?

Why does PinkCurve think it matters?

What can I do?

How confident is PinkCurve?

What evidence supports this?

How will we determine whether it worked?
```

Explainability is fundamental to Seller Intelligence.

Recommendations should not become unexplained AI instructions.

---

# 25. Recommendation Lifecycle

**Classification: Major Seller Intelligence Capability**

Seller Recommendations should have an explicit lifecycle:

```text
Identified
    ↓
Presented
    ↓
Accepted / Ignored / Dismissed
    ↓
Seller Action
    ↓
Outcome Observed
    ↓
Recommendation Evaluated
```

This is particularly important because PinkCurve should learn not only whether Sellers follow recommendations, but whether those recommendations actually improve outcomes.

---

# 26. Recommendation Feedback

**Classification: Seller Intelligence Feature**

Seller feedback may include:

* Helpful;
* Not relevant;
* Already completed;
* Cannot implement;
* Incorrect;
* Try later.

This feedback becomes valuable evidence about Seller Intelligence itself.

---

# 27. Recommendation Outcome Evaluation

**Classification: Major Seller Intelligence Capability**

PinkCurve should measure the consequences of Seller actions resulting from recommendations.

Conceptually:

```text
Platform Evidence
      ↓
Seller Recommendation
      ↓
Seller Action
      ↓
Discovery Changes
      ↓
Outcome Measurement
      ↓
Recommendation Evaluation
      ↓
Learning
```

This creates an important feedback loop between:

* Seller Intelligence;
* Seller Experience;
* Discovery Analytics;
* Learning Engine.

---

# 28. Seller Intelligence and Learning Engine

The Learning Engine and Seller Intelligence should remain separate products.

Learning Engine may provide:

* learned patterns;
* learned signals;
* statistical relationships;
* purpose-specific models;
* model outputs;
* recommendation-related learning.

Seller Intelligence consumes those outputs and converts them into understandable Seller-facing intelligence.

For example:

```text
Learning Engine

Feature importance for
"Waterproof" increased.
        ↓
Seller Intelligence

Buyers are increasingly using
"Waterproof" when exploring
trail-running shoes.

If your Offering supports this
feature, make sure the information
is complete and visible.
```

As PinkCurve matures, Learning Engine may eventually create purpose-specific models that Seller Intelligence consumes.

For example:

```text
Recommendation Outcome Evidence
           ↓
Learning Engine
           ↓
Seller Opportunity /
Recommendation Model
           ↓
Seller Intelligence
           ↓
Seller Recommendation
```

However, PinkCurve should not require sophisticated recommendation models during Alpha.

Early Seller Intelligence may rely on:

```text
Discovery Analytics
       +
Rules
       +
Statistical Relationships
       +
Learning Signals
       +
Offering Knowledge
       ↓
Seller Intelligence
       ↓
Seller Recommendation
```

Model complexity should grow only when sufficient trustworthy evidence demonstrates value.

---

# 29. Seller Intelligence and Discovery Analytics

Discovery Analytics provides factual analytical evidence used by Seller Intelligence.

This may include:

* Discovery Events;
* AMN activity;
* negative feedback;
* Creative performance;
* QOV;
* Brand Recognition activity;
* geographic patterns;
* discovery journeys.

The distinction should remain:

```text
Observed Evidence
      ↓
Discovery Analytics
      ↓
Measured / Derived Evidence
      ↓
Seller Intelligence
      ↓
Interpretation
      ↓
Recommendation
```

Seller Intelligence should not silently convert interpretations into observed facts.

---

# 30. Seller Intelligence and Offering Knowledge

Offering Knowledge determines what PinkCurve knows about an Offering.

Seller Intelligence may identify:

* knowledge gaps;
* stale information;
* missing metadata;
* missing images or video;
* inconsistencies;
* weak destination information.

Seller Intelligence recommends corrections.

Offering Knowledge remains authoritative.

Seller-controlled factual changes should remain Seller-controlled and subject to appropriate verification.

---

# 31. Seller Intelligence and Creative Studio

Seller Intelligence may recommend:

* new Creative;
* Creative refresh;
* shorter or longer Creative;
* different feature emphasis;
* Brand Recognition Creative;
* Promotion Creative;
* geographic variants.

Seller Experience may allow the Seller to move directly from a recommendation into Creative Studio.

This creates an important loop:

```text
Seller Intelligence
       ↓
Recommendation
       ↓
Seller Experience
       ↓
Seller Chooses Action
       ↓
Creative Studio
       ↓
New Creative
       ↓
AI Discovery
       ↓
Discovery Analytics
       ↓
Seller Intelligence
       ↺
```

Seller Intelligence recommends.

Creative Studio creates.

Seller Experience connects the Seller to the workflow.

---

# 32. Seller Value

**Classification: Major Seller Intelligence Capability**

Seller Intelligence should help Sellers understand what value PinkCurve delivers.

Seller value may include:

* QOV;
* Meaningful Discovery;
* relevant audience reach;
* contacts;
* directions;
* saves;
* Brand Recognition;
* repeat interest;
* geographic reach;
* campaign learning;
* actionable intelligence.

Seller value therefore extends beyond click-through traffic.

---

# 33. Seller Value Index

**Classification: Experimental Seller Intelligence Feature**

PinkCurve may eventually develop a Seller Value Index.

Potential components include:

```text
Seller Value
    │
    ├── Meaningful Discovery
    ├── Qualified Offering Visits
    ├── Qualified Reach
    ├── Brand Recognition
    ├── Buyer Interest
    ├── Actionable Intelligence
    └── Platform Cost
```

The exact model should not be fixed before PinkCurve has real evidence.

The Seller Value Index should remain understandable enough that Sellers know what contributes to it.

It should not become a separate product at this stage.

---

# 34. Return on Discovery

**Classification: Experimental Seller Intelligence Feature**

Return on Discovery may provide Sellers with an estimate based on:

```text
Estimated Seller Value
----------------------
PinkCurve Cost
```

Potential inputs may include:

* QOV;
* Seller-provided conversion estimates;
* Seller-provided average transaction value;
* other Seller-measured outcomes.

PinkCurve must clearly distinguish:

```text
Observed PinkCurve Data
```

from:

```text
Seller-Provided Assumptions
```

PinkCurve should not claim to observe Seller revenue when transactions occur outside PinkCurve.

---

# 35. Value Transparency

Seller Intelligence should help Sellers understand:

```text
What the Seller paid
        ↓
What PinkCurve delivered
        ↓
What outcomes PinkCurve observed
```

This transparency is important for Seller Trust and PinkCurve's long-term business model.

---

# 36. Dashboard

The Seller Intelligence Dashboard is primarily a **Seller Experience presentation surface** for Seller Intelligence outputs.

Seller Intelligence determines the content.

Seller Experience determines the interaction and presentation.

Potential Seller Intelligence information may include:

* Discovery Summary;
* QOV;
* discovery trends;
* Buyer discovery patterns;
* useful metadata;
* geographic interest;
* emerging intent;
* Creative performance;
* recommendations;
* Seller Value information.

The initial interface should remain simple.

---

# 37. Alerts

Seller Intelligence may identify conditions requiring Seller attention.

Examples include:

* performance decline;
* stale Offering information;
* Promotion expiration;
* unusual negative feedback;
* broken destination URL;
* emerging metadata interest;
* geographic opportunity;
* campaign threshold;
* verification issue;
* suspicious activity affecting reporting.

Classification should be separated:

**Seller Alert Detection → Seller Intelligence capability**

**Notification Delivery → Shared platform capability**

This avoids building separate notification infrastructure inside every PinkCurve product.

---

# 38. Reports

**Classification: Seller Intelligence Capability**

Seller Intelligence may produce:

* weekly discovery summaries;
* monthly Seller Value summaries;
* Brand Recognition reports;
* campaign reports;
* Offering Knowledge improvement reports;
* geographic discovery reports.

Seller Intelligence determines report content.

Seller Experience or shared platform capabilities handle presentation, export, and delivery.

---

# 39. AI-Assisted Seller Intelligence

**Classification: Seller Intelligence Capability Using AI Platform**

AI may help convert analytical evidence into understandable natural-language explanations.

AI-generated Seller intelligence must remain grounded in verified evidence.

AI should not invent:

* Buyer behavior;
* competitor performance;
* revenue;
* causation;
* market trends.

AI-assisted explanation is therefore not another product.

It is a Seller Intelligence capability using shared AI Platform services.

---

# 40. Privacy

Seller Intelligence must preserve Buyer privacy.

Important requirements include:

* no unnecessary Buyer identification;
* aggregated reporting;
* minimum cohort thresholds;
* geographic aggregation;
* restrictions for sensitive categories;
* no exposure of private Buyer profiles;
* consent where appropriate;
* access controls.

The Seller should learn:

```text
What Buyers collectively appear to want.
```

The Seller should not learn:

```text
Everything PinkCurve knows about
an identifiable individual Buyer.
```

This boundary must survive into Data Architecture, System Design, API Design, and UI Design.

---

# 41. Minimum Data Thresholds

**Classification: Shared Privacy / Statistical Reliability Requirement**

Some Seller insights should not be generated when insufficient evidence exists.

Minimum thresholds protect:

* Buyer privacy;
* statistical reliability;
* Seller confidence.

Thresholds may differ depending on:

* insight type;
* privacy risk;
* sample size;
* geographic granularity;
* competitive sensitivity.

PinkCurve should not generate strong claims from very small samples.

---

# 42. Competitive Privacy

Competitive information requires stronger controls.

Seller Intelligence should not expose:

* individual competitor conversion estimates;
* competitor campaign budgets;
* private Seller performance;
* Buyer lists;
* confidential Offering information.

Competitive intelligence should inform Sellers without exposing another Seller's private data.

---

# 43. Seller Intelligence Success Metrics

Seller Intelligence itself should be measured.

Potential metrics include:

* Recommendation View Rate;
* Recommendation Adoption Rate;
* Recommendation Helpfulness;
* Recommendation Outcome Lift;
* Recommendation Accuracy;
* Seller Value Understanding;
* Seller Retention.

Targets should follow evidence rather than precede it.

The preferred process is:

```text
Baseline
    ↓
Experiment
    ↓
Observed Performance
    ↓
Reasonable Target
```

---

# 44. Testing Requirements

Seller Intelligence recommendations should be evaluated before widespread use.

Potential testing includes:

* synthetic Seller scenarios;
* historical replay;
* human review;
* controlled Seller pilots;
* A/B tests;
* recommendation outcome tracking;
* regression testing.

An important testing principle is:

```text
Evidence:
High Buyer interest in "Waterproof"

Offering Knowledge:
Waterproof status missing

Correct Recommendation:
Add verified waterproof information
if applicable.

Incorrect Recommendation:
Your Offering is waterproof.
```

Seller Intelligence must not transform missing information into invented facts.

Detailed platform-wide testing should later be defined in PinkCurve's Testing and Evaluation design.

---

# 45. Major Capabilities Identified

| Capability                         | Classification       |
| ---------------------------------- | -------------------- |
| Discovery Performance Intelligence | Major capability     |
| Discovery Journey Intelligence     | Capability           |
| Offering Intelligence              | Major capability     |
| AMN Intelligence                   | Major capability     |
| Creative Intelligence              | Major capability     |
| Buyer Interest Intelligence        | Major capability     |
| Geographic Intelligence            | Capability           |
| Trend Intelligence                 | Capability           |
| Brand Recognition Intelligence     | Major capability     |
| Promotion Intelligence             | Capability           |
| Opportunity Intelligence           | Major capability     |
| Trust & Quality Intelligence       | Major capability     |
| Competitive Intelligence           | Later capability     |
| Benchmarking                       | Capability           |
| Recommendation Engine              | **Major capability** |
| Recommendation Confidence          | Feature              |
| Recommendation Explanation         | Feature              |
| Recommendation Lifecycle           | **Major capability** |
| Recommendation Feedback            | Feature              |
| Recommendation Outcome Evaluation  | **Major capability** |
| Seller Value Intelligence          | Major capability     |
| Seller Value Index                 | Experimental feature |
| Return on Discovery                | Experimental feature |
| Alert Detection                    | Capability           |
| Reports                            | Capability           |
| AI-Assisted Explanation            | Capability           |

These classifications should help prevent PinkCurve from creating unnecessary independent products or projects for every capability.

---

# 46. Shared Capabilities Identified

Chapter 09 depends on several shared PinkCurve capabilities.

These include:

* AI Platform;
* Data Architecture;
* privacy controls;
* access control;
* aggregation;
* experimentation;
* notification delivery;
* data quality;
* observability;
* model serving;
* model registry;
* statistical evaluation;
* auditability.

These should not be reimplemented independently inside Seller Intelligence.

---

# 47. Operating Functions Identified

Chapter 09 also identifies ongoing operating responsibilities.

These include:

* recommendation-quality review;
* recommendation-model evaluation;
* Seller-feedback review;
* benchmark governance;
* privacy review;
* competitive-information governance;
* Trust escalation;
* recommendation incident investigation;
* AI-generated advice review;
* recommendation outcome review.

These are **operating functions**, not necessarily products, departments, or separate projects.

During early PinkCurve phases, one person may perform several of these responsibilities.

The responsibilities themselves must nevertheless exist.

---

# 48. Logical Data Requirements Identified

Chapter 09 identifies or implies several logical data objects.

Potential logical objects include:

```text
seller_insight

seller_recommendation
seller_recommendation_evidence
seller_recommendation_feedback
seller_recommendation_action
seller_recommendation_outcome

seller_value_summary
seller_benchmark
seller_alert
seller_report
```

These are **logical data requirements**, not final database tables.

They should later be reconciled with Chapter 11 — Data Architecture.

System Design and Data Design should determine:

* ownership;
* schemas;
* persistence;
* retention;
* indexing;
* relationships;
* access controls;
* APIs.

---

# 49. Interface Requirements Identified

Seller Intelligence will require formal interfaces with other PinkCurve products.

A conceptual request might eventually resemble:

```text
get_seller_intelligence(
    seller_id,
    offering_id?,
    campaign_id?,
    time_range?,
    intelligence_type?,
    context?
)
```

A conceptual response might include:

```text
SellerIntelligenceResponse

seller_id
generated_at

insights[]
recommendations[]
opportunities[]
alerts[]

performance_summary
value_summary

evidence_references[]
```

This is not an API specification.

It establishes a **System Design requirement**.

Later PinkCurve System Design should define the actual interfaces among:

* Seller Experience;
* Seller Intelligence;
* Discovery Analytics;
* Learning Engine;
* Offering Knowledge;
* Creative Studio;
* Trust;
* AI Platform;
* shared platform capabilities.

---

# 50. Alpha Boundary

Seller Intelligence contains a broad long-term vision.

PinkCurve should not attempt to implement every capability during Alpha.

Alpha should emphasize a small number of understandable, high-value outputs.

A reasonable Alpha Seller Intelligence scope is:

```text
Discovery Summary
      +
QOV
      +
Top Buyer Metadata
      +
Negative Feedback
      +
Offering Knowledge Gaps
      +
Basic Creative Performance
      +
Simple Recommendations
```

The essential Alpha loop is:

```text
PinkCurve Discovery
        ↓
Reliable Evidence
        ↓
Seller Intelligence
        ↓
Understandable Recommendation
        ↓
Seller Action
        ↓
Outcome Measurement
        ↓
Learning
```

PinkCurve does not need sophisticated:

* recommendation models;
* predictive market intelligence;
* extensive competitive intelligence;
* complex Seller Value Index;
* advanced benchmarking;
* large AI-generated recommendation systems;

to validate this loop.

A few trustworthy recommendations are more valuable than a large number of weak recommendations.

---

# 51. Later Evolution

As PinkCurve accumulates trustworthy evidence, Seller Intelligence may progressively add:

* stronger recommendation prioritization;
* learned recommendation models;
* predictive opportunity detection;
* better Seller Value measurement;
* benchmarking;
* Brand Recognition intelligence;
* geographic opportunity intelligence;
* trend intelligence;
* controlled competitive intelligence;
* personalized Seller recommendations;
* richer AI-assisted explanation;
* automated alerts;
* recommendation outcome models.

Complexity should follow evidence and demonstrated Seller value.

---

# 52. Design Requirements Identified

Chapter 09 establishes important design requirements.

Seller Intelligence should:

* produce actionable intelligence;
* explain supporting evidence;
* distinguish facts from interpretation;
* communicate uncertainty;
* preserve Buyer privacy;
* protect competitive information;
* respect minimum data thresholds;
* remain grounded in verified analytics;
* avoid unsupported causal claims;
* avoid unsupported revenue claims;
* preserve Seller control;
* measure recommendation outcomes;
* learn from Seller feedback;
* support recommendation lifecycle management;
* integrate with Offering Knowledge;
* integrate with Creative Studio;
* integrate with Learning Engine;
* integrate with Discovery Analytics;
* integrate with Trust;
* integrate with Seller Experience;
* remain simple during early PinkCurve phases.

These requirements should survive into later Product Design, System Design, Data Design, UI Design, Testing, and Operations.

---

# 53. Recommended Chapter 09 Updates

Chapter 09 is already comprehensive and does not require a major rewrite.

Four structural improvements are recommended.

### 1. Strengthen the Overview

The Overview should explicitly state that Seller Intelligence consumes PinkCurve analytics and Learning Engine outputs and produces:

* Seller Insights;
* Seller Recommendations;
* Seller Opportunities;
* Seller Alerts;
* Seller Reports;
* Seller Value Intelligence.

### 2. Add a Seller Intelligence Outputs Section

The chapter should explicitly identify its product outputs rather than leaving them distributed across many sections.

### 3. Establish Seller Recommendation as a First-Class Logical Output

The Blueprint should identify the Seller Recommendation object and its lifecycle without prematurely defining the physical database schema.

### 4. Strengthen the Seller Intelligence / Seller Experience Boundary

The chapter should explicitly state:

> **Seller Intelligence generates intelligence and recommendations. Seller Experience presents them and captures Seller actions and feedback.**

These changes should improve clarity for future readers, architects, implementation teams, and coding agents.

---

# 54. Seller Intelligence Outputs — Resolved

**Status: RESOLVED**

The Chapter 09 Overview now explicitly defines the primary outputs of
Seller Intelligence.

These outputs include:

- Seller Insights;
- Seller Recommendations;
- Seller Opportunities;
- Seller Alerts;
- Seller Reports and Performance Summaries;
- Seller Value Intelligence;
- Recommendation Confidence and Explanations;
- Recommendation Outcome Evidence.

Seller Intelligence therefore produces considerably more than dashboards
or historical analytics.

Its outputs are primarily consumed through Seller Experience, while
appropriate recommendation and outcome evidence may also feed Discovery
Analytics, Learning Engine, Offering Knowledge, Creative Studio, and other
authorized PinkCurve products.

The product boundary is now explicit:

> **Discovery Analytics measures.**
>
> **Learning Engine learns.**
>
> **Seller Intelligence interprets and recommends.**
>
> **Seller Experience presents and enables Seller action.**
>
> **The Seller decides.**

The exact interfaces, schemas, APIs, and persistence mechanisms for these
outputs should be defined later during System Design and Data Design.

---

# 55. Audit Assessment

## Product Status

**Confirmed Core PinkCurve Product**

## Product Purpose

Transform PinkCurve discovery evidence, analytics, and validated learning into understandable, actionable Seller intelligence.

## Primary Consumer

**Seller Experience / Seller**

## Major Upstream Products

* Discovery Analytics;
* Learning Engine;
* Offering Knowledge;
* Creative Studio;
* Buyer Intelligence where privacy-appropriate;
* Trust;
* AI Discovery where appropriate.

## Primary Outputs

* Seller Insights;
* Seller Recommendations;
* Seller Opportunities;
* Seller Alerts;
* Seller Reports;
* Seller Value Intelligence;
* Recommendation Outcome Evidence.

## Major Capability Confirmed

**Recommendation Engine**

## Important Logical Object Identified

**Seller Recommendation**

## Important Shared Capabilities Identified

* Notification delivery;
* AI Platform;
* experimentation;
* privacy controls;
* aggregation;
* Data Architecture;
* data quality;
* observability.

## Major Product Boundary

> **Seller Intelligence produces intelligence and recommendations. Seller Experience provides the Seller-facing interface. The Seller remains responsible for business decisions.**

## Major Privacy Boundary

> **Seller Intelligence may help Sellers understand what Buyers collectively appear to want without exposing private individual Buyer Intelligence.**

## Major Learning Boundary

> **Learning Engine creates validated learning and purpose-specific learned models. Seller Intelligence consumes appropriate learning outputs and converts them into understandable Seller guidance.**

## Major Trust Boundary

> **Trust makes operational Trust decisions. Seller Intelligence communicates appropriate Trust and quality information to Sellers without exposing sensitive detection mechanisms.**

## Major Implementation Risk

Seller Intelligence has a broad long-term scope.

Attempting to implement Discovery Intelligence, AMN Intelligence, Creative Intelligence, Buyer Interest Intelligence, Geographic Intelligence, Brand Recognition Intelligence, Promotion Intelligence, Competitive Intelligence, benchmarking, recommendation models, Seller Value Index, ROD, alerts, reports, and AI-generated advice simultaneously would create unnecessary complexity before PinkCurve has sufficient real evidence.

Alpha should therefore focus on proving the fundamental Seller Intelligence loop:

```text
Reliable Discovery Evidence
          ↓
Seller Intelligence
          ↓
Understandable Insight
          ↓
Actionable Recommendation
          ↓
Seller Action
          ↓
Measured Outcome
          ↓
Learning
```

Once that loop works reliably, additional Seller Intelligence capabilities can be introduced according to demonstrated Seller needs and platform evidence.

---

# Final Audit Conclusion

Chapter 09 strongly establishes Seller Intelligence as one of PinkCurve's core products.

Its role is not simply analytics and it is not merely a dashboard.

Seller Intelligence is PinkCurve's **Seller-facing intelligence and recommendation product**.

It consumes trustworthy evidence from Discovery Analytics, validated learning from the Learning Engine, Offering Knowledge, Creative information, Trust information, and other authorized PinkCurve sources.

It transforms that evidence into:

```text
Insights
   ↓
Interpretations
   ↓
Opportunities
   ↓
Recommendations
   ↓
Seller Actions
   ↓
Measured Outcomes
   ↓
Learning
```

The chapter also identifies the **Recommendation Engine** as a major internal capability and **Seller Recommendation** as an important first-class logical product output.

The architecture should preserve the following responsibility chain:

```text
Discovery Analytics
        ↓
Measured Evidence
        ↓
Learning Engine
        ↓
Validated Learning / Models
        ↓
Seller Intelligence
        ↓
Insights / Recommendations
        ↓
Seller Experience
        ↓
Seller
        ↓
Seller Action
        ↓
Discovery Outcome
        ↓
Discovery Analytics / Learning Engine
        ↺
```

The most important architectural principle identified by this audit is:

> **Discovery Analytics measures. Learning Engine learns. Seller Intelligence interprets and recommends. Seller Experience presents and enables action. The Seller decides.**

Chapter 09 is therefore **architecturally strong and substantially complete at the Product Blueprint level**, subject to the four recommended clarifications identified by this audit.

Detailed:

* interfaces;
* APIs;
* schemas;
* model architecture;
* UI behavior;
* storage;
* notification infrastructure;
* deployment;
* testing procedures;
* operational ownership;

should be developed later during PinkCurve's Product Design, System Design, Data Design, UI Design, Testing, and Operations planning rather than prematurely inside this Product Blueprint chapter.

RESOLVED — Seller Intelligence Output and Recommendation Boundary: Seller Intelligence outputs are now explicitly separated into structured Seller Signals and higher-level Seller intelligence outputs. The Recommendation Engine is classified as an internal Seller Intelligence capability, while Seller Recommendation is an output. AI Discovery is separately responsible for candidate retrieval, ranking, exploration, diversity, feed composition, and Discovery Results.

---

# Chapter 10 Audit — AI Platform

## 1. Audit Purpose

This audit examines Chapter 10 — AI Platform to determine:

- whether AI Platform is correctly classified;
- what shared capabilities it owns;
- what capabilities belong to consuming PinkCurve products instead;
- what inputs and outputs need clearer definition;
- whether product boundaries are sufficiently clear;
- whether AI Platform overlaps with Learning Engine, AI Discovery,
  Seller Intelligence, Buyer Intelligence, Trust, Offering Knowledge,
  Creative Studio, or AMN;
- what shared infrastructure must later be designed;
- what capabilities are required for Alpha, Beta, MVP, and later phases;
- what architectural gaps should be resolved before System Design.

---

# 2. Classification

**Classification: Shared Platform / Shared Technical Capability Layer**

AI Platform should NOT be classified as a standalone PinkCurve product.

This is already stated correctly in Chapter 10.

AI Platform provides shared technical intelligence capabilities used by
PinkCurve products.

Examples include:

- model access;
- model routing;
- LLM services;
- embedding generation;
- semantic retrieval infrastructure;
- ML inference;
- classification;
- risk scoring;
- prompt management;
- model evaluation;
- model registry;
- model deployment;
- model monitoring;
- AI observability;
- experimentation infrastructure;
- AI safety infrastructure.

The distinction is:

> PinkCurve products own product decisions and business behavior.

> AI Platform provides reusable technical capabilities that help those
> products perform intelligent operations.

This boundary is extremely important for later implementation.

---

# 3. Primary AI Platform Consumers

The chapter identifies many PinkCurve systems that depend on AI Platform.

Primary consumers include:

- Offering Knowledge;
- Creative Studio;
- AI Discovery / Discovery Engine;
- Adaptive Metadata Navigation;
- Learning Engine;
- Seller Intelligence;
- Buyer Intelligence;
- Trust;
- potentially Discovery Analytics where AI-assisted analysis is useful;
- future PinkCurve operational systems.

AI Platform should therefore be treated as horizontal infrastructure.

Conceptually:

                    PinkCurve Products
                           │
        ┌──────────────────┼───────────────────┐
        │                  │                   │
        ↓                  ↓                   ↓
 Offering Knowledge   Creative Studio     AI Discovery
        │                  │                   │
        ├──────────────────┼───────────────────┤
        │                  │                   │
        ↓                  ↓                   ↓
       AMN          Buyer Intelligence  Seller Intelligence
        │                  │                   │
        └──────────────────┼───────────────────┘
                           ↓
                      AI Platform
                           ↓
               Models / AI Infrastructure

Trust operates across these relationships.

---

# 4. Major Shared AI Capabilities Identified

Chapter 10 identifies a substantial set of shared capabilities.

## Model Access and Generation

- LLM access;
- Model Gateway;
- model selection;
- multimodal model access;
- structured generation;
- response parsing;
- generation validation.

## Prompt Infrastructure

- prompt management;
- prompt versioning;
- prompt testing;
- prompt deployment;
- prompt rollback;
- prompt evaluation.

## Embedding Infrastructure

- embedding generation;
- embedding model selection;
- embedding versioning;
- embedding lifecycle;
- embedding regeneration;
- representation management.

## Retrieval Infrastructure

- semantic retrieval;
- vector retrieval;
- keyword retrieval support;
- hybrid retrieval support.

## Machine-Learning Infrastructure

- feature processing;
- training datasets;
- model training;
- model evaluation;
- experiment tracking;
- model registry;
- deployment;
- monitoring;
- rollback.

## Prediction / Analysis Services

- ranking model execution;
- classification;
- recommendation-support models;
- statistical models;
- anomaly detection;
- fraud scoring;
- risk scoring.

## Safety and Trust Support

- content moderation;
- suspicious-activity detection;
- fraud detection support;
- bot detection support;
- anomaly detection;
- policy classification;
- prompt-injection defenses;
- AI safety validation.

## Platform Operations

- observability;
- caching;
- rate limiting;
- cost management;
- graceful degradation;
- provider governance;
- API/interface versioning.

These are legitimate shared capabilities.

---

# 5. Important Architectural Boundary — Capability vs Product Decision

This is one of the most important findings in Chapter 10.

AI Platform provides technical intelligence capabilities.

It should generally NOT determine PinkCurve product policy or final
product behavior.

For example:

AI Platform may provide:

    rank_candidates()

But AI Discovery determines:

    what candidates should be ranked;
    what ranking objective represents discovery value;
    how ranking participates in discovery;
    how exploration and diversity are applied;
    what final Discovery Results are produced.

Likewise:

AI Platform may provide:

    generate_explanation()

But Seller Intelligence determines:

    what Seller Signal exists;
    what Insight is justified;
    whether a Seller Recommendation should exist;
    what recommendation priority applies.

AI Platform may provide:

    score_risk()

But Trust determines:

    verification requirements;
    risk policy;
    thresholds;
    restrictions;
    escalation;
    human review;
    final Trust actions.

Therefore:

> AI Platform provides intelligence capabilities.

> Products own product meaning and decisions.

This principle should become an explicit architectural rule.

---

# 6. AI Platform Inputs — Needs Stronger Definition

Chapter 10 describes many inputs throughout individual sections, but it
does not establish a unified AI Platform input contract.

Potential AI Platform inputs include:

- structured Offering Knowledge;
- Creative context;
- Buyer Intent;
- Buyer Signals;
- Seller Signals where appropriate;
- AMN context;
- Discovery context;
- candidate Offerings;
- Trust context;
- analytics evidence;
- model features;
- prompts;
- generation parameters;
- external content;
- model configuration;
- training datasets;
- evaluation datasets.

This is understandable at Blueprint level because different AI
capabilities require different inputs.

However, later System Design should define capability-specific contracts
rather than one universal AI Platform request.

For example:

    GenerateContentRequest

    GenerateEmbeddingRequest

    RankCandidatesRequest

    ClassifyContentRequest

    ScoreRiskRequest

    GenerateExplanationRequest

Each should have its own input and output contract.

---

# 7. AI Platform Outputs — Major Clarification Needed

The chapter describes many outputs, but there is no consolidated definition
of what the AI Platform itself produces.

This should be clarified.

AI Platform outputs are primarily **technical intelligence results**, not
PinkCurve product outputs.

Examples include:

- generated structured content;
- embeddings;
- semantic candidate sets;
- ranking scores;
- classifications;
- risk scores;
- anomaly scores;
- model inference results;
- generated explanations;
- extracted structured information;
- model confidence / uncertainty information;
- validation results;
- model metadata;
- evaluation results.

These outputs become inputs to PinkCurve products.

For example:

    AI Platform
        ↓
    Ranking Scores
        ↓
    AI Discovery
        ↓
    Discovery Results

AI Platform does NOT produce the final Buyer discovery experience.

Likewise:

    AI Platform
        ↓
    Statistical / ML Result
        ↓
    Seller Intelligence
        ↓
    Seller Signal
        ↓
    Seller Insight
        ↓
    Seller Recommendation

AI Platform does NOT own the Seller Recommendation merely because an AI
model participates in producing supporting intelligence.

This distinction should be strengthened in Chapter 10.

---

# 8. Structured AI Outputs — Strong Capability

The Structured AI Outputs section is architecturally important.

PinkCurve should prefer machine-consumable structured AI results whenever
the consuming product needs deterministic integration.

This improves:

- validation;
- reliability;
- testing;
- storage;
- reproducibility;
- integration;
- observability.

Later System Design should establish schemas for each important AI
capability.

This principle aligns well with the Buyer Signal and Seller Signal
architecture already identified elsewhere in the Blueprint.

However:

> AI output schema does not replace product-level signal schemas.

For example, a model may return structured analytical evidence.

Seller Intelligence remains responsible for transforming appropriate
evidence into the PinkCurve-defined Seller Signal contract.

---

# 9. Model Gateway — Major Shared Capability

Model Gateway is correctly identified as an important AI Platform
capability.

PinkCurve should avoid binding product code directly to a particular:

- LLM provider;
- embedding provider;
- ranking implementation;
- multimodal provider;
- self-hosted model.

Products should request capabilities.

For example:

    Product
       ↓
    AI Capability Interface
       ↓
    Model Gateway
       ↓
    Selected Provider / Model

Selection may consider:

- capability;
- quality;
- cost;
- latency;
- reliability;
- privacy;
- availability;
- context requirements;
- multimodal requirements.

This architecture supports provider replacement and future technology
evolution.

---

# 10. Embedding Capability — Well Identified

The chapter clearly distinguishes embeddings from general-purpose LLMs.

Potential embedded entities include:

- Offerings;
- Buyer Intent;
- Metadata;
- Creative;
- Categories.

The embedding lifecycle is also correctly recognized.

Embeddings need provenance including:

- source entity;
- source version;
- embedding model;
- model version;
- generation time;
- representation type.

This becomes important when Offering Knowledge or embedding models change.

---

# 11. Buyer Embeddings — Correct Caution

Chapter 10 correctly avoids assuming persistent Buyer embeddings are
necessary.

Buyer embeddings could create:

- privacy concerns;
- explainability concerns;
- profiling concerns;
- stale-preference problems.

Buyer Intelligence should determine what Buyer Signals are appropriate.

AI Platform should provide embedding capability without deciding that
persistent Buyer profiles must be embedded.

---

# 12. Retrieval Boundary — Important

Vector retrieval, keyword retrieval, metadata retrieval, and hybrid
retrieval are capabilities supporting discovery.

They are NOT the Discovery Engine itself.

This distinction is already present and should be preserved.

The responsibility chain should be:

    Retrieval Infrastructure
            ↓
       Candidate Pool
            ↓
       AI Discovery
            ↓
    Ranking / Exploration /
       Diversity / Composition
            ↓
      Discovery Results

This aligns with the Chapter 06 audit.

---

# 13. Ranking Boundary — Important

AI Platform may provide ranking infrastructure and execute ranking models.

AI Discovery owns the meaning and use of ranking.

Therefore:

> AI Platform provides ranking capability.

> Learning Engine may create or improve ranking models.

> AI Discovery applies ranking within the discovery process.

This three-way boundary should remain explicit.

---

# 14. Learning Engine Boundary — Very Strong

Chapter 10 already contains an excellent distinction:

> Learning Engine determines what PinkCurve should learn.

> AI Platform provides technical capabilities that allow that learning
> to occur.

This should remain a core architectural rule.

The relationship is:

    Discovery Evidence
          ↓
    Learning Engine
          ↓
    Learning Objective
          ↓
    AI Platform Training Infrastructure
          ↓
    Purpose-Specific Model
          ↓
    Evaluation / Registry / Deployment
          ↓
    Consuming Product

The Learning Engine owns learning objectives and learning logic.

AI Platform owns reusable ML infrastructure.

---

# 15. Seller Intelligence Boundary — Needs Updating

The Seller Intelligence Support section is generally correct but should be
updated to reflect the stronger Chapter 09 architecture.

Chapter 10 currently describes:

    Verified Analytics
          ↓
    Statistical / ML Analysis
          ↓
    Evidence
          ↓
    Recommendation Logic
          ↓
    LLM Explanation
          ↓
    Seller

The final step is now too simplified.

The improved architecture is:

    Authoritative PinkCurve Evidence
          ↓
    AI / Statistical Capabilities
          ↓
    Seller Intelligence
          ↓
    Seller Signals
          ↓
    Seller Insights / Opportunities /
    Recommendations / Alerts /
    Seller Value Intelligence
          ↓
    Seller Experience
          ↓
    Seller

AI Platform may assist:

- pattern detection;
- opportunity detection;
- model inference;
- confidence estimation;
- analytical explanation;
- language generation.

Seller Intelligence owns the Seller intelligence meaning.

Seller Experience owns presentation and Seller interaction.

This section should eventually be revised.

---

# 16. Recommendation Terminology — Needs Clarification

Chapter 10 uses the term "recommendation" in several places.

Because Chapter 09 has now clarified the Seller Recommendation architecture,
PinkCurve should avoid ambiguous recommendation terminology.

AI Discovery should use:

- candidate retrieval;
- discovery ranking;
- discovery selection;
- exploration;
- diversity;
- feed composition.

Seller Intelligence may use:

- Seller Recommendation;
- Recommendation Engine;
- recommendation confidence;
- recommendation explanation;
- recommendation outcome.

AI Platform may provide underlying:

- recommendation-support models;
- recommendation model inference;
- explanation generation.

The AI Platform should not own the business meaning of a Seller
Recommendation.

---

# 17. Buyer Intelligence Boundary — Needs Stronger Definition

Chapter 10 correctly states that AI Platform may support:

- preference interpretation;
- negative-preference understanding;
- discovery continuity;
- intent history;
- diversity preferences.

However, Buyer Intelligence now has a clearer architecture than when this
chapter was originally written.

The proper relationship should be:

    Buyer Interaction Evidence
          ↓
    Buyer Intelligence
          ↓
    Buyer Signals
          ↓
    Consuming Products

AI Platform may provide technical capabilities used by Buyer Intelligence
to create or interpret those signals.

AI Platform should NOT independently create an unrestricted Buyer profile.

Buyer Intelligence owns:

- Buyer Signal meaning;
- preference interpretation policy;
- persistence rules;
- signal lifecycle;
- privacy-aware Buyer Intelligence behavior.

---

# 18. Trust Boundary — Important

Chapter 10 provides extensive Trust-related AI capability.

This is appropriate because AI Platform may provide:

- fraud models;
- anomaly detection;
- bot detection;
- content classification;
- risk scoring;
- URL analysis;
- suspicious-behavior detection.

However:

> AI Platform detects and scores.

> Trust interprets policy and decides.

This is essential.

For example:

    AI Platform
       ↓
    Fraud Risk Score
       ↓
    Trust
       ↓
    Policy Evaluation
       ↓
    Proceed / Verify / Restrict /
    Human Review / Block

The AI model must not become the Trust policy.

---

# 19. Fraud Detection — Shared Capability, Not Product

Fraud Detection should be classified as a major shared capability spanning
multiple PinkCurve workflows.

Potential evidence includes:

- Seller registration;
- Buyer registration;
- Offering submission;
- destination URLs;
- account behavior;
- payment activity;
- discovery activity;
- Buyer reports.

AI Platform may provide:

- fraud scoring;
- anomaly models;
- classification;
- analytical support.

Trust owns fraud policy and enforcement.

Seller Registration, Buyer Registration, Offering Approval, Billing, and
other products/functions consume Trust decisions as appropriate.

---

# 20. Bot Detection — Shared Capability

Bot Detection should also be classified as a shared Trust / platform
capability rather than a standalone product.

It protects:

- Discovery Analytics;
- QOV;
- Seller reporting;
- Billing;
- Trending;
- ranking;
- Learning Engine training data;
- Buyer Intelligence;
- Seller Intelligence.

This is especially important because bot activity can contaminate both
analytics and learning.

---

# 21. Human-in-the-Loop — Cross-Platform Operating Capability

Human-in-the-loop is correctly identified as part of trustworthy AI.

However, it should not be considered exclusively an AI Platform capability.

It is a cross-platform operational capability.

Examples include:

- Seller verification;
- Buyer verification;
- Offering verification;
- fraud investigation;
- Creative review;
- recommendation review;
- model evaluation;
- policy enforcement;
- Customer Support escalation.

AI Platform may provide human-review integration infrastructure.

The owning product or operating function determines when human review is
required.

---

# 22. AI Confidence — Important Shared Standard

Confidence and uncertainty should become a shared PinkCurve design
standard.

Potential consumers include:

- Seller Intelligence;
- Buyer Intelligence;
- Trust;
- Offering Knowledge;
- Creative Studio;
- AMN;
- AI Discovery.

However, confidence values from different models may have different
meanings.

PinkCurve should not assume:

    model score = factual probability

Calibration and capability-specific interpretation are required.

---

# 23. Evaluation Framework — Major Capability

AI evaluation is one of the strongest parts of Chapter 10.

Important AI capabilities should have defined evaluation strategies.

Potential methods include:

- offline evaluation;
- curated test cases;
- synthetic data;
- historical replay;
- human evaluation;
- controlled experiments;
- production monitoring;
- regression testing;
- adversarial testing.

Evaluation should be capability-specific.

Examples:

Creative Generation
    → factual consistency + quality

Discovery Ranking
    → ranking quality + discovery outcomes

AMN
    → navigation usefulness

Fraud Detection
    → precision + recall + review outcomes

Seller Recommendations
    → evidence quality + actionability + outcome improvement

---

# 24. Test Data — Important Capability Identified

The chapter now explicitly recognizes test-data support.

Potential sources include:

- synthetic Offerings;
- synthetic Buyer intents;
- synthetic discovery journeys;
- curated Offering examples;
- pilot-user interactions;
- historical PinkCurve events;
- adversarial examples;
- fraud scenarios;
- bot simulations.

This resolves an important concern identified during earlier Blueprint
reviews.

Detailed test-data acquisition and test procedures appropriately belong
in later Testing and Evaluation design documentation.

---

# 25. AI Evaluation Registry — Major Shared Capability

The proposed Evaluation Registry should be retained.

It creates traceability across:

    Capability
       ↓
    Model
       ↓
    Model Version
       ↓
    Dataset Version
       ↓
    Evaluation
       ↓
    Metrics
       ↓
    Human Review
       ↓
    Approval Status

This will become particularly important as PinkCurve uses multiple models
and model providers.

---

# 26. Model Lifecycle — Strong Foundation

The lifecycle:

    Development
       ↓
    Evaluation
       ↓
    Shadow
       ↓
    Pilot
       ↓
    Production
       ↓
    Monitoring
       ↓
    Deprecated / Retraining

is appropriate for important models.

Not every simple heuristic requires the complete process.

Controls should be proportional to risk and product impact.

---

# 27. Model Registry — Major Shared Capability

The Model Registry should be treated as a first-class AI Platform
capability.

It should eventually record:

- model identity;
- provider;
- version;
- purpose;
- training information;
- evaluation information;
- deployment status;
- configuration;
- known limitations;
- predecessor model.

This becomes critical for reproducibility and rollback.

---

# 28. AI Observability — Major Shared Capability

AI Observability should also be treated as first-class shared
infrastructure.

PinkCurve should be able to trace:

    Product Request
        ↓
    AI Capability
        ↓
    Model / Version
        ↓
    Prompt / Configuration
        ↓
    Input Reference
        ↓
    Output
        ↓
    Validation
        ↓
    Product Decision

This traceability will be important for:

- debugging;
- audits;
- recommendation explanation;
- fraud investigations;
- model evaluation;
- production incidents.

Privacy restrictions must apply to logging.

---

# 29. AI Safety — Major Shared Capability

AI Safety is broader than content moderation.

The chapter correctly identifies:

- hallucination;
- misleading Creative;
- prompt injection;
- malicious Seller content;
- data leakage;
- unsafe generation;
- bias;
- fraudulent AI-generated Offerings;
- manipulated inputs;
- provider failures.

Each AI capability should eventually have its own threat and failure model.

---

# 30. Prompt Injection — Critical Requirement

Seller-provided URLs, descriptions, documents, and retrieved external
content must be treated as untrusted data.

This is particularly important for Offering Knowledge extraction.

PinkCurve must maintain separation among:

- system instructions;
- trusted platform context;
- Seller-provided content;
- retrieved external content;
- model output.

Prompt injection defense should become part of AI Platform security
testing.

---

# 31. Data Protection — Cross-Cutting Requirement

The chapter correctly identifies:

- encryption;
- credentials;
- provider policies;
- data minimization;
- access control;
- retention;
- logging;
- sensitive-data handling;
- geographic requirements.

AI Platform should receive only the data required for the requested
capability.

This should later be enforced through interface contracts and access
controls rather than relying only on policy.

---

# 32. Provider Governance — Major Operating Capability

AI Provider Governance is correctly identified.

Providers should be evaluated across:

- capability;
- quality;
- reliability;
- privacy;
- security;
- retention;
- cost;
- latency;
- availability;
- model-change policy;
- contracts.

Provider selection should not be based solely on benchmark performance.

---

# 33. AI Cost Management — Major Shared Capability

AI costs could become a significant PinkCurve operating expense.

The chapter correctly proposes measuring cost where appropriate by:

- capability;
- model;
- Seller;
- Offering;
- campaign;
- operation;
- environment.

This will later support:

- budgeting;
- Seller economics;
- pricing analysis;
- provider selection;
- optimization.

Cost attribution should therefore eventually become part of AI
observability.

---

# 34. Graceful Degradation — Critical Architecture Requirement

This is a very important capability.

PinkCurve should not fail completely because one AI provider or model is
unavailable.

Examples include:

LLM unavailable
    → approved Creative remains usable

Embedding unavailable
    → metadata / keyword retrieval continues

Ranking model unavailable
    → fallback ranking rules

Seller Intelligence AI unavailable
    → existing analytics remain available

Fallback behavior should eventually be specified for every critical AI
capability.

---

# 35. Internal AI Interfaces — Strong Direction

The proposed capability interfaces are architecturally sound:

    generate_content()
    generate_embedding()
    retrieve_semantic_candidates()
    rank_candidates()
    classify_content()
    score_risk()
    generate_explanation()

However, these should remain conceptual at Blueprint level.

System Design should later define:

- request schemas;
- response schemas;
- authentication;
- authorization;
- versioning;
- timeout behavior;
- retries;
- error handling;
- fallback;
- observability;
- cost metadata.

---

# 36. AI Platform Outputs Should Include Operational Metadata

One additional gap should be considered.

Important AI Platform responses should not contain only the intelligence
result.

Where appropriate, they should also provide operational metadata such as:

    capability
    model_id
    model_version
    prompt_version
    confidence
    generated_at
    latency
    validation_status
    trace_id

Cost metadata may also be captured internally.

This enables consuming products to understand and trace the intelligence
they received.

Exact schemas belong in System Design.

---

# 37. Current Technology Direction — Appropriate

The chapter appropriately avoids premature vendor commitment.

Early directions include:

- external LLM APIs;
- specialized embeddings TBD;
- vector technology TBD;
- heuristic ranking before learned ranking;
- heuristic AMN before learned AMN;
- rules before advanced fraud models;
- analytics/rules before advanced Seller Intelligence models.

This follows PinkCurve's principle:

> Use the simplest reliable method that produces sufficient value.

---

# 38. MVP Scope — Sensible

The proposed MVP AI Platform is appropriately limited:

- LLM Gateway;
- Prompt Management;
- Offering Knowledge Extraction;
- Creative Generation;
- Embedding Generation;
- basic Semantic Retrieval;
- rule-based Discovery support;
- basic Safety Validation.

PinkCurve should avoid building a large ML platform before usage and
evidence justify it.

---

# 39. Capability vs Phase Must Be Recorded

Although Chapter 10 identifies MVP and later capabilities, the eventual
capability inventory should classify each AI capability by phase.

For example:

| Capability | Alpha | Beta | MVP | Later |
| --- | --- | --- | --- | --- |
| LLM Gateway | Required | Required | Required | Evolve |
| Prompt Management | Basic | Improved | Required | Evolve |
| Offering Extraction | Basic | Required | Required | Improve |
| Creative Generation | Basic | Required | Required | Improve |
| Embeddings | Experimental | Required | Required | Improve |
| Semantic Retrieval | Experimental | Required | Required | Improve |
| Learned Ranking | No | Maybe | Maybe | Yes |
| Learned AMN | No | Maybe | Maybe | Yes |
| Advanced Seller Models | No | No | Limited | Yes |
| Advanced Fraud ML | Limited | Limited | Limited | Yes |
| Model Registry | Basic | Improved | Required | Mature |

The final phase assignments should be made during product and project
planning rather than assumed by this audit.

---

# 40. Product Ownership Matrix Needed Later

System Design should eventually establish ownership such as:

| Capability / Decision | Owner |
| --- | --- |
| Model Gateway | AI Platform |
| Prompt Infrastructure | AI Platform |
| Embedding Infrastructure | AI Platform |
| Model Registry | AI Platform |
| Model Monitoring | AI Platform |
| ML Training Infrastructure | AI Platform |
| Learning Objectives | Learning Engine |
| Buyer Signal Meaning | Buyer Intelligence |
| Seller Signal Meaning | Seller Intelligence |
| Discovery Ranking Policy | AI Discovery |
| Discovery Results | AI Discovery |
| Seller Recommendations | Seller Intelligence |
| Trust Policy | Trust |
| Fraud Model Infrastructure | AI Platform |
| Fraud Enforcement | Trust |
| Offering Facts | Offering Knowledge |
| Creative Workflow | Creative Studio |

This matrix should become part of later System Design.

---

# 41. Participant Terminology — Resolved

Chapter 10 still uses the older term **Participant**.

Examples include:

- "participant intelligence";
- "participant value";
- lifecycle references to Participant Intelligence.

PinkCurve has since moved toward explicit:

- Buyer;
- Seller;
- organization/provider where appropriate.

These references should be revised.

For example:

    Participant Intelligence

should generally become:

    Buyer Intelligence + Seller Intelligence

depending on context.

And:

    participant value

may become:

    Buyer and Seller value

or another precise term appropriate to the sentence.

### Resolution

**Status: Resolved**

The generic **Participant** terminology has been removed from Chapter 10 and replaced with explicit **Buyer** and **Seller** terminology according to the applicable product responsibility.

The revised chapter now explicitly distinguishes:

- **Buyer Intelligence**, which owns Buyer Signals and Buyer-related intelligence;
- **Seller Intelligence**, which owns Seller Signals, Seller Insights, Seller Opportunities, Seller Recommendations, Seller Alerts, and Seller Value Intelligence; and
- **AI Platform**, which provides the shared AI models, infrastructure, services, APIs, and technical intelligence capabilities used by these products.

This correction also reinforces the broader PinkCurve architectural principle:

> **PinkCurve products own product decisions and business behavior.**

AI Platform provides reusable technical capabilities and intelligence, while Buyer Intelligence, Seller Intelligence, and other PinkCurve products determine how those capabilities are interpreted and used within their respective product responsibilities.

**No further action is required for this finding unless Participant terminology is discovered elsewhere during the Blueprint audit.**

---

# 42. Discovery Engine / AI Discovery Naming - Resolved

Chapter 10 currently uses Discovery Engine.

Because PinkCurve has also used AI Discovery, terminology should remain
consistent with the product classification established elsewhere.

The Blueprint should eventually choose one canonical product name and use
it consistently.

Until then:

    AI Discovery / Discovery Engine

may be used during the audit to indicate the same product.

This remains a documentation consistency issue.

### Resolution

**Status: Resolved**

PinkCurve now distinguishes **AI Discovery** as the product from the **Discovery Engine** as the underlying discovery engine/capability.

Chapter 10 has been revised to use this terminology consistently when describing product ownership and AI Platform responsibilities.

The architectural relationship is:

```text
AI Platform
      ↓
Provides shared AI models,
retrieval, Ranking, inference,
and related technical services
      ↓
AI Discovery
      ↓
Uses those capabilities through
the Discovery Engine and other
discovery capabilities
      ↓
Owns discovery decisions
and business behavior
      ↓
Discovery Results

---

# 43. Missing Capability — AI Capability Catalog

The chapter contains many AI capabilities but does not yet define a formal
AI Capability Catalog.

This would be useful later.

A capability record could conceptually identify:

    capability_id
    capability_name
    owner
    consumers
    input_contract
    output_contract
    implementation
    model
    version
    evaluation_requirement
    fallback
    privacy_classification
    trust_impact
    cost_class

This does NOT need to be implemented now.

It should be considered during System Design because PinkCurve may
eventually have many models and AI capabilities.

---

# 44. Missing Capability — Feature / Model Contract

Learning Engine may create models that AI Platform deploys and other
products consume.

The Blueprint does not yet define the contract connecting:

    Learned Model
        ↓
    Required Features
        ↓
    AI Platform Inference
        ↓
    Product

This should eventually include:

- feature definitions;
- feature versions;
- model version;
- input compatibility;
- missing-feature handling;
- output meaning;
- confidence;
- fallback behavior.

This belongs primarily in later ML/System Design.

---

# 45. Missing Capability — Model Deployment Strategy

The chapter describes model lifecycle, registry, monitoring, and rollback,
but deployment architecture remains intentionally high-level.

Later design should specify:

- online inference;
- batch inference;
- asynchronous inference;
- shadow inference;
- canary deployment;
- rollback;
- provider fallback.

This is correctly deferred from the Blueprint.

---

# 46. Missing Capability — AI Service Reliability Requirements

Graceful degradation is well defined conceptually, but AI service
reliability requirements are not yet specified.

Later design should define:

- timeout expectations;
- retries;
- circuit breaking;
- fallback;
- availability objectives;
- queue behavior;
- failure classification;
- degraded-mode behavior.

These belong in System Design / Operations.

---

# 47. Missing Capability — AI Access Control

Data Protection mentions access control, but AI capability authorization
should eventually be explicit.

Not every PinkCurve product should automatically be able to call every AI
capability or provide arbitrary data to a model.

Later design should establish:

    Product
       ↓
    Authorized AI Capability
       ↓
    Allowed Data Scope
       ↓
    Model / Provider

This is particularly important for Buyer Intelligence and PII.

---

# 48. AI Platform Is Not the Learning Engine

This distinction deserves explicit audit emphasis.

AI Platform:

> provides technical ML/AI infrastructure.

Learning Engine:

> determines what PinkCurve learns and how learning improves product
> behavior.

Therefore, AI Platform may:

    train_model()
    evaluate_model()
    deploy_model()

while Learning Engine determines:

    why the model exists;
    what target it learns;
    what evidence is appropriate;
    how success is measured;
    which product behavior it should improve.

---

# 49. AI Platform Is Not Trust

Similarly:

AI Platform may:

    score_risk()
    classify_content()
    detect_anomaly()

Trust determines:

    policy;
    verification;
    escalation;
    restriction;
    enforcement;
    human review.

---

# 50. AI Platform Is Not Seller Intelligence

AI Platform may:

    detect_pattern()
    execute_model()
    generate_explanation()

Seller Intelligence determines:

    Seller Signal;
    Seller Insight;
    Seller Opportunity;
    Seller Recommendation;
    Seller Alert;
    Seller Value Intelligence.

---

# 51. AI Platform Is Not Buyer Intelligence

AI Platform may:

    interpret_intent()
    classify_preference()
    execute_embedding()
    execute_model()

Buyer Intelligence determines:

    Buyer Signal;
    signal category;
    persistence;
    lifecycle;
    privacy-aware Buyer intelligence.

---

# 52. AI Platform Is Not AI Discovery

AI Platform may:

    retrieve_candidates()
    execute_ranking_model()

AI Discovery determines:

    candidate strategy;
    ranking use;
    exploration;
    diversity;
    new-Offering exposure;
    feed composition;
    final Discovery Results.

---

# 53. Audit Classification Summary

## Product

None.

AI Platform itself is not a standalone PinkCurve product.

## Shared Platform

- AI Platform.

## Major Shared Capabilities

- Model Gateway;
- LLM access;
- Prompt Management;
- Embedding Infrastructure;
- Semantic Retrieval Infrastructure;
- ML Training Infrastructure;
- Model Evaluation;
- Model Registry;
- Model Deployment;
- Model Monitoring;
- AI Observability;
- AI Safety;
- AI Provider Governance;
- AI Cost Management;
- AI Capability Interfaces;
- Graceful Degradation.

## Shared Trust / Protection Capabilities

- Fraud Detection support;
- Bot Detection support;
- Anomaly Detection;
- Risk Scoring;
- Content Classification;
- Prompt-Injection Protection.

## Cross-Cutting Operating Capabilities

- Human-in-the-Loop integration;
- AI Evaluation;
- Test Data Management;
- Provider Governance;
- Cost Management.

## Design Requirements

- structured AI outputs;
- provider independence;
- capability versioning;
- privacy;
- traceability;
- confidence handling;
- graceful failure;
- fallback;
- cost control;
- least-privilege access;
- model reproducibility.

---

# 54. Recommended Chapter 10 Updates

## 1. Strengthen AI Platform Output Definition

Add a clear statement that AI Platform produces technical intelligence
results rather than final PinkCurve product decisions.

Examples:

- embeddings;
- ranking scores;
- classifications;
- risk scores;
- model inference results;
- generated structured content;
- explanations;
- validation results.

## 2. Strengthen Product Ownership Boundary

Explicitly state:

> AI Platform provides intelligence capabilities; consuming PinkCurve
> products own product meaning, policy, and final product behavior.

## 3. Update Seller Intelligence Support

Revise the section to reflect:

    Evidence
       ↓
    AI capabilities
       ↓
    Seller Intelligence
       ↓
    Seller Signals
       ↓
    Insights / Opportunities /
    Recommendations / Alerts
       ↓
    Seller Experience
       ↓
    Seller

## 4. Update Buyer Intelligence Support

Explicitly recognize Buyer Signals as Buyer Intelligence outputs and
clarify that AI Platform supports their generation/interpretation without
owning Buyer profiling policy.

## 5. Remove Participant Terminology

Replace Participant Intelligence and participant value with explicit
Buyer/Seller terminology appropriate to each context.

## 6. Clarify Recommendation Terminology

Distinguish:

- AI Discovery ranking and discovery selection;
- Seller Intelligence Seller Recommendations;
- AI Platform recommendation-support technical capabilities.

## 7. Consider AI Capability Catalog During System Design

Do not implement it now, but carry this requirement into later System
Design.

---

# 55. Audit Assessment

**Architecture: STRONG**

Chapter 10 provides a comprehensive foundation for shared PinkCurve AI
infrastructure.

The chapter correctly avoids treating AI as the product itself and
repeatedly favors simple, reliable methods over unnecessary AI complexity.

Particularly strong areas include:

- Model Gateway;
- structured AI outputs;
- embedding lifecycle;
- hybrid retrieval;
- Learning Engine separation;
- Trust and fraud support;
- human-in-the-loop;
- evaluation;
- test-data support;
- model lifecycle;
- Model Registry;
- monitoring;
- observability;
- AI safety;
- prompt-injection protection;
- provider governance;
- cost control;
- graceful degradation.

The most important remaining architectural improvements are:

1. explicitly define AI Platform outputs;
2. strengthen capability-vs-product ownership boundaries;
3. update Seller Intelligence integration after the Chapter 09 changes;
4. update Buyer Intelligence integration after Chapter 24;
5. remove Participant terminology;
6. clarify Recommendation Engine terminology;
7. carry capability contracts into later System Design.

---

# 56. Final Audit Conclusion

Chapter 10 confirms that PinkCurve's AI Platform should be treated as a
shared technical intelligence foundation rather than a standalone product.

Its responsibility is to make reusable AI and ML capabilities available
safely, reliably, economically, and consistently across PinkCurve.

The fundamental architectural rule should be:

> **Products decide what intelligence means and how it affects the
> PinkCurve experience.**

> **AI Platform provides the technical capabilities required to produce,
> execute, evaluate, govern, and operate that intelligence.**

This creates a clean separation:

    PinkCurve Product Responsibility
                ↓
        AI Capability Request
                ↓
           AI Platform
                ↓
      Model / Algorithm / Service
                ↓
     Technical Intelligence Result
                ↓
       Consuming PinkCurve Product
                ↓
        Product-Level Decision

This separation will allow PinkCurve to change models, providers,
algorithms, and infrastructure over time without redefining the
responsibilities of its products.

Chapter 10 is therefore architecturally strong, but several terminology
and boundary updates should be made before the Blueprint is considered
ready for System Design.

---

# Chapter 11 Audit — Data Architecture

## 1. Audit Purpose

This audit examines Chapter 11 — Data Architecture to determine:

- whether Data Architecture is correctly classified;
- what foundational data responsibilities it owns;
- whether product data ownership is sufficiently clear;
- whether authoritative sources are clearly defined;
- whether major PinkCurve entities have clear identities;
- whether recently clarified Buyer Intelligence, Seller Intelligence, Learning Engine, AI Platform, AI Discovery, and Offering Knowledge outputs are represented correctly;
- whether product-to-product data exchange is sufficiently defined;
- whether data lineage, privacy, security, retention, testing, and physical storage strategies are adequate;
- what capabilities must later be defined during System Design and Data Design;
- what architectural gaps should be resolved before implementation.

---

# 2. Classification

**Classification: Shared Platform / Foundational Architecture**

Data Architecture should NOT be classified as a standalone PinkCurve business product.

It is a foundational architecture supporting all PinkCurve products and platform capabilities.

Data Architecture defines:

- what PinkCurve data means;
- how entities are identified;
- how entities relate;
- how information is represented;
- how data is exchanged;
- where authoritative information originates;
- how data is stored;
- how schemas evolve;
- how provenance is preserved;
- how lineage is maintained;
- how data is protected;
- how data is retained;
- how data is deleted;
- how data is recovered;
- how quality is maintained;
- how authorized products access data.

The architectural distinction is:

> PinkCurve products own product decisions and business behavior.

> Data Architecture provides the information foundation that allows those products to operate reliably.

This boundary is extremely important for later System Design.

---

# 3. Overall Architecture — Strong

Chapter 11 provides a broad and mature Data Architecture foundation.

It already covers:

- Buyers;
- Sellers;
- Organizations;
- accounts and identity;
- Offerings;
- Offering Knowledge;
- Metadata;
- Adaptive Metadata Navigation;
- Creative;
- Campaigns;
- Discovery Sessions;
- Discovery Events;
- Buyer feedback;
- reviews and ratings;
- Analytics;
- Learning Engine data;
- AI Platform data;
- embeddings;
- vector data;
- Buyer Intelligence;
- Seller Intelligence;
- Trust & Safety;
- verification;
- billing;
- Customer Support;
- operational data;
- physical storage;
- schemas;
- lineage;
- data quality;
- privacy;
- retention;
- backup and recovery;
- testing;
- environment separation;
- MVP architecture;
- growth architecture.

The principle:

> **logically unified but physically flexible**

is especially strong and should remain.

---

# 4. Product Ownership vs Data Ownership — Major Clarification Needed

Chapter 11 discusses Data Ownership, but several different forms of ownership need to be distinguished.

## Product Ownership

The PinkCurve product owns the meaning and business behavior associated with its responsibility.

Examples:

    Buyer Intelligence
        ↓
    owns Buyer Signal meaning

    Seller Intelligence
        ↓
    owns Seller Signal and
    Seller Intelligence meaning

    AI Discovery
        ↓
    owns discovery decisions
    and Discovery Results

    Offering Knowledge
        ↓
    owns Offering Knowledge meaning

## Authoritative Data Ownership

A specific product or domain is the source of truth for a data concept.

Examples:

    Offering
        ↓
    authoritative Offering record

    Discovery Analytics
        ↓
    authoritative metric / QOV definition

    Trust & Safety
        ↓
    authoritative verification state

## Physical Storage Ownership

Data may physically reside in:

- PostgreSQL;
- object storage;
- event storage;
- analytical storage;
- vector storage;
- caches;
- model storage.

These concepts should not be confused.

---

# 5. Logical Ownership Does Not Require Separate Databases

PinkCurve may initially store many logical data domains in PostgreSQL.

For example:

    PostgreSQL
        │
        ├── Offering Knowledge
        ├── Buyer Intelligence
        ├── Seller Intelligence
        ├── Trust
        ├── Creative metadata
        ├── Billing
        └── Discovery data

This does NOT mean all domains have the same product owner.

Architecturally:

    Offering Knowledge
        ↓
    owns Offering Knowledge meaning

    Buyer Intelligence
        ↓
    owns Buyer Intelligence meaning

    Seller Intelligence
        ↓
    owns Seller Intelligence meaning

    Trust & Safety
        ↓
    owns Trust state and decisions

Therefore:

> **Physical storage location must not determine logical product ownership.**

This principle is especially important for Alpha, Beta, and MVP because PinkCurve should avoid premature database fragmentation.

---

# 6. Logical Product Data Domains — Important

Data Architecture should increasingly make logical product-data boundaries explicit.

Conceptually:

    PinkCurve Data Architecture
            │
            ├── Product-Owned Data Domains
            │     ├── Offering Knowledge
            │     ├── Creative Studio
            │     ├── AI Discovery
            │     ├── Buyer Intelligence
            │     ├── Seller Intelligence
            │     └── Trust & Safety
            │
            ├── Shared Business / Platform Domains
            │     ├── Identity
            │     ├── Accounts
            │     ├── Discovery Events
            │     ├── Discovery Analytics
            │     ├── Metadata
            │     ├── Billing
            │     ├── Customer Support
            │     └── Operational Data
            │
            └── Technical Platform Data
                  ├── AI Platform
                  ├── Model Registry
                  ├── Prompt Registry
                  ├── Vector Data
                  ├── Evaluation Data
                  ├── Model Artifacts
                  └── Observability

This is a logical organization.

It does NOT require separate databases, services, departments, or projects.

---

# 7. Identifier Strategy — Major Architectural Gap

Chapter 11 uses many identifiers but does not yet establish a platform-wide identifier strategy.

Potential identifiers include:

    buyer_id
    seller_id
    organization_id
    provider_id

    offering_id
    offering_knowledge_id

    creative_id
    creative_variant_id
    campaign_id

    metadata_dimension_id
    metadata_value_id

    session_id
    event_id

    buyer_signal_id
    seller_signal_id

    seller_insight_id
    seller_recommendation_id

    model_id
    model_version_id

    invoice_id
    support_case_id
    verification_id

The exact physical identifier technology can remain open.

PinkCurve may eventually use:

- UUID;
- ULID;
- database-generated identifiers;
- another suitable approach.

The architectural requirement should be:

> **Every major PinkCurve entity and exchangeable product output should have a stable, unique, and unambiguous identity.**

This is essential for product interfaces, APIs, events, analytics, lineage, and debugging.

---

# 8. Provider Identifier — Resolved: Remove

PinkCurve does not currently require a generic Provider identifier.

Only Sellers provide Offerings.

Therefore the relationship should remain explicit:

    Seller
        │
        │ seller_id
        ↓
    Offering
        │
        │ offering_id
        ↓
    Offering Knowledge

A Seller may provide zero, one, or many Offerings.

Each Offering should be associated with the Seller responsible for that Offering through `seller_id`.

There is therefore no current architectural need for:

    provider_id

or for a separate generic Provider entity.

Using `seller_id` is simpler, more precise, and consistent with PinkCurve's current business model.

This follows the broader PinkCurve architectural principle:

> **Do not introduce generic entities or abstractions unless a demonstrated product or architectural requirement requires them.**

If PinkCurve's business model changes in the future and another type of entity can directly provide Offerings, the relationship can be reconsidered at that time.

**Audit Status: Resolved — use `seller_id`; remove `provider_id` from the current Data Architecture.**

---

# 9. Offering-Centered Architecture — Strong

Offering remains correctly defined as PinkCurve's fundamental discovery object.

Conceptually:

    Seller / Organization
            ↓
         Offering
            ↓
    Offering Knowledge

Seller identity should not substitute for Offering identity.

One Seller may own many Offerings.

One Organization may eventually provide many Offerings.

Offering Knowledge should primarily be associated with a specific Offering.

This architecture supports:

- Offering retrieval;
- Offering Knowledge;
- Creative;
- AMN;
- AI Discovery;
- Analytics;
- Trust;
- Seller Intelligence;
- Learning Engine.

---

# 10. Offering Retrieval Keys and Indexing — Needs Stronger Definition

PinkCurve should distinguish between:

- fields that identify an Offering;
- fields that establish ownership or major relationships;
- fields that should be indexed for frequent retrieval;
- fields that are ordinary Offering attributes;
- fields that may be searched or filtered occasionally.

Not every Offering field should be treated as a primary retrieval key.

Although many Offering attributes may eventually be used as search or filtering criteria, indexing every field would increase storage, write cost, maintenance complexity, and index-management overhead.

The architecture should therefore define a deliberate set of Offering retrieval keys.

The most fundamental keys are:

    offering_id
        → uniquely identifies one Offering

    seller_id
        → retrieves Offerings belonging to one Seller

Additional high-value retrieval keys or indexes may include:

    offering_type
    category_id
    status
    verification_status
    created_at
    updated_at

Depending on actual PinkCurve query patterns, other indexed fields may later include:

    geographic applicability
    availability
    campaign_id
    price-related fields
    freshness
    publication status

Metadata should generally be retrieved through the structured Metadata architecture rather than creating a separate database column and index for every possible Offering characteristic.

Conceptually:

    Offering
    │
    ├── Primary Identity
    │     └── offering_id
    │
    ├── Major Relationship Key
    │     └── seller_id
    │
    ├── Frequently Indexed Retrieval Fields
    │     ├── offering_type
    │     ├── category_id
    │     ├── status
    │     ├── verification_status
    │     └── timestamps
    │
    ├── Metadata Relationships
    │     └── offering_metadata
    │
    └── Other Offering Attributes
          └── indexed only when actual retrieval
              patterns justify it

PinkCurve should avoid assuming:

    every Offering field
        =
    database retrieval key

Instead:

> **Offering retrieval indexes should be based on identity, major relationships, frequent query patterns, filtering needs, and measured performance.**

For example:

Seller Experience may frequently retrieve:

    seller_id
        ↓
    Seller's Offerings

Offering Knowledge may retrieve:

    offering_id
        ↓
    Specific Offering

AI Discovery may frequently retrieve candidates through:

    category
    +
    Metadata
    +
    geographic applicability
    +
    eligibility / status
    +
    other discovery criteria

Trust & Safety may frequently retrieve:

    verification_status
    risk-related state
    offering_id

The exact database indexes should not be finalized in the Product Blueprint.

They should be designed and tested during Data Design and System Design using actual query patterns.

However, Chapter 11 should establish the architectural principle that PinkCurve maintains a defined set of Offering retrieval keys and indexes rather than treating every Offering field as equally searchable.

**Audit Status: Needs Chapter 11 clarification — define Offering identity, relationship keys, and indexing principles; exact physical indexes deferred to Data Design and performance testing.**

---

# 11. Offering Knowledge Retrieval — Needs Stronger Definition

Offering Knowledge should normally be retrievable by:

    offering_id

or:

    offering_knowledge_id

rather than relying only on seller identity.

This is important because:

    Seller
        ↓
    many Offerings
        ↓
    different Offering Knowledge

Offering Knowledge retrieval needs stable identity and versioning.

---

# 12. Offering Knowledge Data Architecture — Strong

The separation among:

- Source Knowledge;
- Derived Knowledge;
- Learned Knowledge

is one of the strongest architectural decisions in Chapter 11.

Example:

    Source:
    Waterproof = Yes

    Derived:
    Category = Trail Running Shoe

    Learned:
    Frequently explored during
    wet-weather trail searches

These should remain distinguishable.

Derived and learned information should not silently overwrite authoritative facts.

---

# 13. Knowledge Provenance — Strong

Offering Knowledge provenance should continue to preserve:

- source type;
- source identifier;
- source version;
- generated by;
- model version;
- created time;
- verified by;
- verification status.

This supports:

- explainability;
- Seller review;
- Trust;
- auditing;
- debugging;
- Learning Engine.

---

# 14. Metadata Domain — Strong; Metadata Identification Needs Clarification

Metadata is correctly treated as first-class PinkCurve data.

Logical entities include:

    metadata_dimensions
    metadata_values
    offering_metadata
    metadata_relationships
    metadata_usage_metrics

However, Metadata identification should be explicitly defined.

At minimum, the Metadata architecture should provide stable identifiers for:

    metadata_dimension_id
        → identifies a Metadata dimension

    metadata_value_id
        → identifies a specific Metadata value

For example:

    metadata_dimension_id = 101
    dimension_name = Brand

        ↓

    metadata_value_id = 1001
    value = Nike

and:

    metadata_dimension_id = 102
    dimension_name = Color

        ↓

    metadata_value_id = 2001
    value = Blue

This allows PinkCurve products to reference Metadata using stable identifiers rather than depending on display text.

Conceptually:

    Metadata Dimension
        │
        │ metadata_dimension_id
        ↓
    Metadata Values
        │
        ├── metadata_value_id
        ├── metadata_value_id
        └── metadata_value_id

An Offering can then be associated with Metadata through a relationship such as:

    offering_id
        +
    metadata_dimension_id
        +
    metadata_value_id
        ↓
    offering_metadata

For example:

    Offering 123
        │
        ├── Category → Running Shoes
        ├── Brand → Nike
        ├── Color → Blue
        └── Size → 10

Internally, PinkCurve should reference the corresponding stable Metadata identifiers rather than relying only on the text values.

This is particularly important because display labels may change while the underlying Metadata concept remains the same.

For example:

    "Running Shoe"
          ↓
    renamed for display
          ↓
    "Running Shoes"

The `metadata_value_id` can remain unchanged.

Stable Metadata identifiers also support:

- Offering Knowledge;
- Adaptive Metadata Navigation;
- AI Discovery;
- Buyer Intelligence;
- Discovery Analytics;
- Learning Engine;
- Metadata relationships;
- localization;
- versioning;
- auditing;
- efficient database joins.

Metadata relationships should likewise reference Metadata identifiers rather than relying on text matching.

For example:

    metadata_value_id
            ↓
    metadata_relationship
            ↓
    related_metadata_value_id

The exact database schema, key technology, indexes, and constraints should be determined during Data Design.

However, Chapter 11 should establish the architectural requirement:

> **Metadata dimensions and Metadata values must have stable identifiers so PinkCurve products can reference, relate, analyze, and exchange Metadata unambiguously.**

Metadata should continue supporting:

- category-specific dimensions;
- multiple values;
- hierarchies;
- relationships;
- location relevance;
- time relevance;
- learned usefulness;
- provenance.

**Audit Status: Strong architecture — add explicit stable identification for Metadata dimensions and Metadata values.**

---

# 15. Adaptive Metadata Navigation Data — Needs Boundary and Identification Clarification

AMN data includes:

- Metadata presented;
- Metadata selected;
- Metadata removed;
- Metadata ordering;
- Metadata navigation path;
- candidate-set context;
- reset actions;
- Metadata usefulness.

However, PinkCurve should distinguish both the identity and ownership of different forms of AMN data.

AMN itself does not require a generic `amn_id`.

Instead, important AMN executions and persisted navigation structures should have stable identifiers where they need to be referenced, reconstructed, analyzed, or exchanged.

A fundamental identifier should be:

    amn_navigation_id
        → identifies one AMN navigation sequence

The navigation should also be associated with:

    session_id
        → identifies the broader Buyer discovery session

    buyer_id
        → identifies the Buyer where permitted

Conceptually:

    Discovery Session
        │
        │ session_id
        ↓
    AMN Navigation
        │
        │ amn_navigation_id
        ↓
    Metadata Selections
        │
        ├── metadata_dimension_id
        ├── metadata_value_id
        ├── selection order
        └── timestamp

This distinction is important because one Discovery Session may contain more than one AMN navigation sequence.

For example:

    session_id = S100
        │
        ├── amn_navigation_id = A001
        │       Running Shoes
        │          ↓
        │       Waterproof
        │          ↓
        │       Under $150
        │
        └── amn_navigation_id = A002
                Hiking Shoes
                   ↓
                Women's
                   ↓
                Lightweight

The exact conditions that start or end an AMN navigation sequence should be defined later during System Design.

AMN events should also have their normal:

    event_id

because an individual Metadata presentation, selection, removal, reset, or navigation action is a historical event.

Therefore the identifiers serve different purposes:

    session_id
        → broader Buyer discovery session

    amn_navigation_id
        → one AMN navigation sequence

    event_id
        → one historical interaction

    metadata_dimension_id
        → Metadata dimension involved

    metadata_value_id
        → Metadata value involved

    offering_id
        → Offering involved where applicable

This creates a traceable relationship:

    buyer_id
        ↓
    session_id
        ↓
    amn_navigation_id
        ↓
    event_id
        ↓
    metadata_dimension_id
        +
    metadata_value_id
        ↓
    Candidate-Set Change
        ↓
    Discovery Result

PinkCurve should also distinguish:

    AMN Durable State

    Historical AMN Event

    Derived AMN Metric

    Buyer Intelligence Signal

    Learning Engine learned
    Metadata relationship / model

These may originate from the same Buyer activity but represent different meanings and ownership.

For example:

    Buyer selects
    "Waterproof"
        ↓
    Historical AMN Event
        ↓
    contributes to
        ↓
    Buyer Intelligence Signal

while aggregated behavior across many navigation sequences may contribute to:

    AMN Events
        ↓
    Discovery Analytics
        ↓
    Metadata Usefulness Metric
        ↓
    Learning Engine
        ↓
    Learned Metadata Relationship / Model

The Product Blueprint does not need to define the exact database tables, ID technology, event schema, or lifecycle rules.

Those belong in later Data Design and System Design.

However, Chapter 11 should establish the architectural requirement:

> **AMN navigation sequences and important persisted AMN outputs must be identifiable and traceable to their Discovery Session, Metadata identifiers, relevant events, and Offerings where applicable.**

**Audit Status: Needs Chapter 11 clarification — define AMN navigation identity and distinguish AMN state, events, metrics, Buyer Signals, and learned outputs; detailed implementation deferred to System Design.**

---

# 16. Creative Data Architecture — Strong; Creative Identification Should Be Explicit

The Creative domain correctly separates structured Creative metadata from large media assets.

Logical concepts may include:

    creative_campaigns
    creative_assets
    creative_briefs
    creative_scripts
    creative_storyboards
    creative_variants
    creative_versions

However, Creative identification should be explicitly defined.

At minimum, each primary Creative object should have a stable:

    creative_id
        → uniquely identifies one Creative

This identifier should allow PinkCurve products to reference the Creative consistently across:

- Creative Studio;
- Campaigns;
- AI Discovery;
- Discovery Events;
- Discovery Analytics;
- Seller Intelligence;
- Trust & Safety;
- object storage;
- versioning;
- auditing;
- future system interfaces.

Conceptually:

    Offering
        │
        │ offering_id
        ↓
    Creative
        │
        │ creative_id
        ↓
    Creative Versions / Variants / Assets

A Creative may also be associated with:

    seller_id
        → Seller responsible for the Creative

    offering_id
        → Offering being represented

    campaign_id
        → Campaign using the Creative, where applicable

The architecture should distinguish the identity of the primary Creative from the identities of its related objects.

For example:

    creative_id
        → identifies the logical Creative

    creative_version_id
        → identifies a specific version of that Creative

    creative_variant_id
        → identifies a specific variation

    creative_asset_id
        → identifies an individual media asset

    campaign_id
        → identifies the Campaign using the Creative

Conceptually:

    creative_id = C100
        │
        ├── creative_version_id = CV1
        │
        ├── creative_version_id = CV2
        │
        └── creative_version_id = CV3
                │
                ├── creative_variant_id = V1
                └── creative_variant_id = V2

A Creative Package may contain multiple related assets, scripts, storyboards, versions, or variants while still belonging to the same logical Creative.

Large media files should generally remain in object storage.

The relational or metadata layer should store references such as:

    creative_asset_id
    creative_id
    asset_type
    object_storage_uri
    media_type
    version
    created_at
    status

This allows PinkCurve to manage large Creative files without embedding them directly in the transactional database.

Discovery Events should reference:

    creative_id

where a Buyer was shown or interacted with a specific Creative.

For example:

    event_id
        ↓
    creative_id
        ↓
    offering_id
        ↓
    seller_id

This relationship supports accurate:

- Creative performance measurement;
- Discovery Analytics;
- Learning Engine training;
- Seller Intelligence;
- Campaign evaluation;
- Trust investigation.

The exact physical key technology, indexes, Creative version schema, and asset-storage implementation should be defined later during Data Design and System Design.

However, Chapter 11 should establish the architectural requirement:

> **Every logical Creative must have a stable `creative_id`, and important Creative versions, variants, and assets should also have stable identifiers when they need to be independently referenced.**

**Audit Status: Strong architecture — add explicit Creative identification and clarify Creative, version, variant, and asset relationships.**

---

# 17. Creative Studio Outputs — Data Alignment Needed

The Chapter 05 audit clarified Creative Studio outputs including:

- Creative Brief;
- storyboard;
- script;
- Creative assets;
- Creative variants;
- Creative Package.

Chapter 11 should eventually verify that its logical Creative model supports these outputs.

---

# 18. Campaign Data — Strong; Campaign Identification Should Be Explicit

Campaign data is correctly separated from Offering facts.

Campaigns may change:

- objective;
- Creative;
- schedule;
- geographic scope;
- budget;
- status;
- Campaign type

without changing what the underlying Offering fundamentally is.

However, Campaign identification should be explicitly defined.

Each Campaign should have a stable:

    campaign_id
        → uniquely identifies one Campaign

The Campaign should also maintain relationships to the Seller and relevant Offerings and Creative.

Conceptually:

    Seller
        │
        │ seller_id
        ↓
    Campaign
        │
        │ campaign_id
        ↓
    Offering / Creative

A Campaign may reference:

    seller_id
        → Seller responsible for the Campaign

    offering_id
        → Offering promoted by the Campaign

    creative_id
        → Creative used by the Campaign

Depending on future Campaign design, one Campaign may potentially contain multiple Creative variants or other Campaign components.

For example:

    campaign_id
        │
        ├── offering_id
        │
        ├── creative_id
        │
        ├── creative_variant_id
        │
        ├── Campaign objective
        │
        ├── schedule
        │
        ├── geographic scope
        │
        ├── budget
        │
        └── status

Discovery Events should reference `campaign_id` where the displayed Creative or Offering was delivered as part of a Campaign.

Conceptually:

    event_id
        ↓
    campaign_id
        ↓
    creative_id
        ↓
    offering_id
        ↓
    seller_id

This allows PinkCurve to determine not only which Offering and Creative produced an interaction, but also which Campaign was responsible for presenting them.

Stable Campaign identification supports:

- Campaign management;
- Creative association;
- Discovery Analytics;
- Campaign performance measurement;
- Seller Intelligence;
- Learning Engine;
- attribution;
- auditing;
- Billing where applicable;
- future product interfaces.

The exact Campaign schema, indexes, Campaign-to-Offering cardinality, Campaign-to-Creative cardinality, and Campaign lifecycle should be determined during later Data Design and System Design.

However, Chapter 11 should establish the architectural requirement:

> **Every Campaign must have a stable `campaign_id` so Campaign data, Creative, Offerings, Discovery Events, Analytics, and Seller Intelligence can reference the same Campaign unambiguously.**

**Audit Status: Strong architecture — add explicit stable Campaign identification and clarify Campaign relationships.**

---

# 19. Discovery Event Architecture — Major Strength; Event Identification Should Be Explicit

Discovery Events are correctly treated as historical evidence.

The lineage:

    Raw Discovery Event
            ↓
    Curated Event
            ↓
    Derived Metric
            ↓
    Learned Signal
            ↓
    Recommendation / Model

is a major architectural strength.

The principle:

> **Events are historical evidence.**

should remain.

However, Discovery Event identification should be explicitly defined.

Every Discovery Event should have a stable:

    event_id
        → uniquely identifies one historical event

The `event_id` should allow PinkCurve to reference, deduplicate, trace, validate, audit, and analyze the exact interaction that occurred.

A Discovery Event may also reference other stable PinkCurve identifiers where applicable:

    buyer_id
        → Buyer associated with the interaction

    session_id
        → Discovery Session containing the interaction

    amn_navigation_id
        → AMN navigation sequence associated with the event

    offering_id
        → Offering involved

    creative_id
        → Creative involved

    campaign_id
        → Campaign involved

    metadata_dimension_id
        → Metadata dimension involved

    metadata_value_id
        → Metadata value involved

Conceptually:

    event_id
        │
        ├── buyer_id
        ├── session_id
        ├── amn_navigation_id
        ├── offering_id
        ├── creative_id
        ├── campaign_id
        ├── metadata_dimension_id
        ├── metadata_value_id
        ├── event_type
        ├── timestamp
        └── event_payload

Not every event will contain every identifier.

For example:

An Offering impression may contain:

    event_id
    session_id
    buyer_id
    offering_id
    creative_id
    campaign_id

An AMN Metadata selection may contain:

    event_id
    session_id
    amn_navigation_id
    buyer_id
    metadata_dimension_id
    metadata_value_id

A click-through event may contain:

    event_id
    session_id
    buyer_id
    offering_id
    creative_id
    campaign_id

The exact required identifiers should depend on the event type.

The architecture should also distinguish `event_id` from other operational identifiers.

For example:

    event_id
        → identifies the business / discovery event

    correlation_id
        → associates related operations across services

    trace_id
        → supports distributed system observability

These identifiers serve different purposes and should not be treated as interchangeable.

Discovery Events should generally remain append-oriented.

Later Analytics, Learning Engine, Buyer Intelligence, Seller Intelligence, Trust & Safety, or Billing processes may derive new information from the event, but the original `event_id` and historical event record should remain stable.

Stable Discovery Event identification supports:

- Discovery Analytics;
- QOV calculation;
- Buyer Intelligence;
- Seller Intelligence;
- Learning Engine;
- Billing qualification;
- Trust investigation;
- bot detection;
- fraud analysis;
- event deduplication;
- replay;
- auditing;
- debugging;
- data lineage.

The exact event-ID technology, event schema, deduplication strategy, partitioning strategy, and event-storage implementation should be defined later during Data Design and System Design.

However, Chapter 11 should establish the architectural requirement:

> **Every Discovery Event must have a stable `event_id`, and each event should reference the relevant PinkCurve entity identifiers required to reconstruct what happened.**

**Audit Status: Major strength — add explicit Discovery Event identification and clarify event relationships to other PinkCurve identifiers.**

---

# 20. Discovery Event Contract — Needs Future Standardization

The current logical event structure includes:

    event_id
    event_type
    timestamp
    session_id
    buyer_id
    offering_id
    provider_id
    creative_id
    surface
    position
    metadata_context
    experiment_context
    device_context
    location_context
    event_payload

Future System Design should consider adding:

    event_version
    producer
    source_product
    event_timestamp
    ingestion_timestamp
    correlation_id
    trace_id
    schema_version
    privacy_classification
    idempotency_key

where appropriate.

---

# 21. Discovery Sessions — Strong; Session Identification Should Be Explicit

Discovery Sessions correctly group related Buyer interactions without duplicating every Discovery Event.

A Discovery Session may contain:

- Buyer identifier where permitted;
- session start time;
- session end time;
- discovery surface;
- initial Buyer intent;
- location context;
- experiment assignments;
- device/context information;
- AMN navigation activity;
- Discovery Events.

However, Discovery Session identification should be explicitly defined.

Each Discovery Session should have a stable:

    session_id
        → uniquely identifies one Buyer discovery session

The `session_id` provides the common context linking the interactions that occur during that discovery journey.

Conceptually:

    Buyer
      │
      │ buyer_id
      ↓
    Discovery Session
      │
      │ session_id
      ↓
    ┌───────────────────────────────┐
    │ Discovery Events              │
    │ AMN Navigation                │
    │ Buyer Intent                  │
    │ Metadata Selections           │
    │ Offering Views                │
    │ Offering Exploration          │
    │ Click-Throughs                │
    │ Buyer Feedback                │
    └───────────────────────────────┘

A Buyer may have many Discovery Sessions over time:

    buyer_id
        ↓
    ├── session_id = S001
    ├── session_id = S002
    └── session_id = S003

Each Discovery Event occurring within a session should normally reference:

    session_id

where applicable.

For example:

    session_id
        ↓
    event_id
        ↓
    offering_id
        ↓
    creative_id
        ↓
    campaign_id

AMN navigation sequences should also reference the Discovery Session:

    session_id
        ↓
    amn_navigation_id
        ↓
    metadata selections
        ↓
    Discovery Events

This allows PinkCurve to reconstruct the complete Buyer discovery journey.

The architecture should distinguish:

    session_id
        → identifies the broader Discovery Session

    amn_navigation_id
        → identifies one AMN navigation sequence within the session

    event_id
        → identifies one historical interaction

These identifiers should not be treated as interchangeable.

For example, one Discovery Session may include several AMN navigation sequences and many Discovery Events.

Conceptually:

    session_id = S100
        │
        ├── amn_navigation_id = A001
        │       ├── event_id = E001
        │       ├── event_id = E002
        │       └── event_id = E003
        │
        ├── amn_navigation_id = A002
        │       ├── event_id = E004
        │       └── event_id = E005
        │
        └── other Discovery Events
                ├── event_id = E006
                └── event_id = E007

Stable Session identification supports:

- Buyer Experience;
- Buyer Intelligence;
- Adaptive Metadata Navigation;
- AI Discovery;
- Discovery Analytics;
- Learning Engine;
- Seller Intelligence;
- experiment analysis;
- journey reconstruction;
- debugging;
- event correlation;
- privacy controls.

The exact rules for when a Discovery Session begins, expires, resumes, or ends should be defined later during System Design.

Likewise, the exact identifier technology, timeout behavior, anonymous/pre-registration handling, cross-device continuity, and persistence policy should be defined later.

However, Chapter 11 should establish the architectural requirement:

> **Every Discovery Session must have a stable `session_id` so PinkCurve can group related Buyer interactions and trace Discovery Events, AMN navigation, Buyer intent, and discovery outcomes within a coherent discovery journey.**

**Audit Status: Strong architecture — add explicit stable Discovery Session identification and clarify its relationship to AMN navigation and Discovery Events.**

---

# 22. Buyer Feedback Architecture — Strong; Feedback Identification Should Be Explicit

Buyer Feedback architecture correctly recognizes multiple forms of Buyer feedback, including:

- positive feedback;
- negative feedback;
- ratings;
- reviews;
- reports;
- saves;
- hides;
- Show More Like This;
- Show Fewer Like This.

The distinction between historical events and durable state is also important.

For example:

    Event:
    Buyer hides Offering

    State:
    Offering remains hidden for Buyer

However, Buyer Feedback identification should be explicitly defined.

Each persisted Buyer Feedback record should have a stable:

    feedback_id
        → uniquely identifies one Buyer Feedback record

The Feedback should reference the relevant PinkCurve entities and context where applicable.

Conceptually:

    feedback_id
        │
        ├── buyer_id
        ├── offering_id
        ├── creative_id          optional
        ├── campaign_id          optional
        ├── session_id
        ├── event_id             where applicable
        ├── feedback_type
        ├── feedback_value
        ├── created_at
        └── status

For example:

    feedback_id = F001
    buyer_id = B100
    offering_id = O500
    feedback_type = HIDE

or:

    feedback_id = F002
    buyer_id = B100
    offering_id = O501
    feedback_type = SHOW_MORE_LIKE_THIS

The architecture should distinguish the identity of the Feedback record from the Discovery Event that records the interaction.

For example:

    event_id
        → identifies that the Buyer performed
          a feedback action at a particular time

    feedback_id
        → identifies the resulting persisted
          Buyer Feedback record

Conceptually:

    Buyer Action
        ↓
    event_id
        ↓
    feedback_id
        ↓
    Durable Feedback State
        ↓
    Buyer Intelligence / Analytics /
    Learning / Discovery Behavior

Not every Discovery Event creates durable Buyer Feedback.

Likewise, Buyer Feedback may remain meaningful after the Discovery Session in which it was originally created has ended.

Stable Feedback identification supports:

- Buyer Experience;
- Buyer Intelligence;
- AI Discovery;
- Discovery Analytics;
- Learning Engine;
- Seller Intelligence;
- Trust & Safety;
- feedback modification;
- feedback removal;
- auditing;
- provenance;
- debugging.

Buyer Feedback should also preserve sufficient provenance to determine:

- who provided the Feedback;
- which Offering was involved;
- what type of Feedback was provided;
- when it occurred;
- which Discovery Session produced it;
- which Discovery Event produced it where applicable;
- whether it remains active;
- whether it has subsequently been changed or removed.

The exact Feedback schema, Feedback types, persistence rules, indexes, modification behavior, and deletion behavior should be defined later during Data Design and System Design.

However, Chapter 11 should establish the architectural requirement:

> **Every persisted Buyer Feedback record must have a stable `feedback_id` and must reference the Buyer, Offering, and relevant discovery context required to understand and trace that Feedback unambiguously.**

**Audit Status: Strong architecture — add explicit stable Buyer Feedback identification and clarify the relationship between `feedback_id`, `event_id`, and durable Buyer Feedback state.**

---

# 23. Reviews and Ratings — Strong; Review and Rating Identification Should Be Explicit

Reviews and Ratings are important forms of durable Buyer-generated information.

They may contribute to:

- Buyer Experience;
- Offering Knowledge;
- Discovery Analytics;
- Buyer Intelligence;
- Seller Intelligence;
- Learning Engine;
- Trust & Safety.

Reviews and Ratings should remain integrated with Trust & Safety because fraudulent, manipulated, abusive, or misleading Reviews and Ratings can corrupt Buyer Trust, Seller reputation, Discovery Analytics, Seller Intelligence, and Learning Engine evidence.

However, Review and Rating identification should be explicitly defined.

Each Review should have a stable:

    review_id
        → uniquely identifies one Buyer Review

Each Rating should have a stable:

    rating_id
        → uniquely identifies one Buyer Rating

Conceptually:

    Buyer
        │
        │ buyer_id
        ↓
    Offering
        │
        │ offering_id
        ↓
    Review
        │
        │ review_id
        ↓
    Review Content / Status / Moderation

and:

    Buyer
        │
        │ buyer_id
        ↓
    Offering
        │
        │ offering_id
        ↓
    Rating
        │
        │ rating_id
        ↓
    Rating Value

A Review record may conceptually contain:

    review_id
    buyer_id
    offering_id

    rating_id            optional

    review_content
    review_status

    created_at
    updated_at

    verification_status
    moderation_status

A Rating record may conceptually contain:

    rating_id
    buyer_id
    offering_id

    rating_value

    created_at
    updated_at

    status

A Review and Rating may be related but should not necessarily be treated as the same entity.

For example:

    buyer_id
        ↓
    offering_id
        ↓
    ├── rating_id
    │       └── rating_value = 4
    │
    └── review_id
            └── written Review

This allows PinkCurve to support:

- Rating without written Review;
- written Review with Rating;
- Review editing;
- Rating changes;
- Review moderation;
- Rating validation;
- Review removal;
- independent Trust evaluation.

Where Reviews or Ratings originate during a Discovery Session, they may also preserve relevant context such as:

    session_id
    event_id

where useful.

However, Reviews and Ratings are durable records and should not depend on the continued existence of a particular Discovery Session.

Stable Review and Rating identification supports:

- modification;
- moderation;
- verification;
- abuse investigation;
- duplicate detection;
- provenance;
- Seller response where supported;
- Analytics;
- Buyer Intelligence;
- Seller Intelligence;
- Learning Engine;
- auditing.

The architecture should also preserve historical events separately from the durable Review or Rating record.

For example:

    Buyer submits Rating
        ↓
    event_id
        ↓
    rating_id
        ↓
    Durable Rating

Later:

    Buyer changes Rating
        ↓
    new event_id
        ↓
    same rating_id
        ↓
    Updated Rating

Similarly:

    Buyer submits Review
        ↓
    event_id
        ↓
    review_id
        ↓
    Durable Review

Later moderation or editing should not erase the historical evidence that those actions occurred.

The exact Review schema, Rating scale, uniqueness rules, edit history, moderation workflow, indexes, retention rules, and deletion behavior should be determined during later Data Design and System Design.

However, Chapter 11 should establish the architectural requirement:

> **Every Buyer Review must have a stable `review_id`, and every Buyer Rating must have a stable `rating_id`, allowing Reviews and Ratings to be referenced, modified, moderated, analyzed, and traced independently.**

**Audit Status: Strong architecture — add explicit stable `review_id` and `rating_id` and clarify their relationship to Buyers, Offerings, Discovery Events, and Trust & Safety.**

---

# 24. Discovery Analytics — Needs Identification, Result, and Analytical Definition Clarification

Discovery Analytics owns the analytical interpretation and measurement of PinkCurve Discovery activity.

Discovery Analytics does not produce one single analytical result.

It may produce many different Analytics, each designed to answer a particular Discovery-related question and each producing its own analytical result.

Examples may include:

- Qualified Offering Views (QOV);
- Offering view Analytics;
- Offering exploration Analytics;
- click-through Analytics;
- Creative performance Analytics;
- Campaign performance Analytics;
- Metadata usage Analytics;
- AMN effectiveness Analytics;
- Buyer engagement Analytics;
- Seller performance Analytics;
- location-based Discovery Analytics;
- Trending Analytics;
- new-Offering exposure Analytics;
- Discovery diversity Analytics;
- Feed performance Analytics;
- conversion-related Discovery Analytics where measurable.

Therefore, Discovery Analytics should not be represented merely as a collection of calculated values.

PinkCurve needs to identify both the **Analytic definition** and the **Analytical Result produced from that definition**.

At minimum, each defined Analytic should have a stable:

    analytic_id
        → uniquely identifies one type or definition
          of Discovery Analytic

For example:

    analytic_id = QOV
        → Qualified Offering View Analytic

    analytic_id = OFFERING_CTR
        → Offering Click-Through Analytic

    analytic_id = AMN_EFFECTIVENESS
        → Adaptive Metadata Navigation
          effectiveness Analytic

The exact identifier format should be determined later.

The important requirement is that every significant Discovery Analytic can be referenced unambiguously.

Conceptually:

    Discovery Analytics
            ↓
    Analytic Definition
            │
            │ analytic_id
            ↓
    Analytical Calculation
            ↓
    Analytical Result

However, one `analytic_id` may produce many results.

For example:

    analytic_id = OFFERING_CTR
            ↓
    Offering A → result
    Offering B → result
    Offering C → result

or:

    analytic_id = QOV
            ↓
    Seller A / Day 1 → result
    Seller A / Day 2 → result
    Seller B / Day 1 → result

Therefore, PinkCurve should also consider stable identification for materialized Analytical Results.

Conceptually:

    analytic_result_id
        → identifies one calculated result
          produced by an Analytic

This gives PinkCurve two different identities:

    analytic_id
        → What Analytic is this?

    analytic_result_id
        → Which calculated result is this?

For example:

    analytic_id
        QOV

    analytic_result_id
        QOV-RESULT-12345

    seller_id
        S100

    offering_id
        O500

    measurement_window
        2026-08-01 through 2026-08-07

    result_value
        1,247

The exact physical representation should be determined later during Data Design.

---

## Discovery Analytic Definition

Each significant Discovery Analytic should have a defined analytical specification.

Conceptually, an Analytic definition may include:

    analytic_id
    analytic_name
    analytic_description

    analytic_type

    purpose

    source_data
    source_event_types

    calculation_definition

    qualification_rules

    dimensions
    filters

    measurement_window

    aggregation_method

    exclusion_rules

    bot_filtering_rules
    fraud_filtering_rules

    analytic_version

    owner

    created_at
    updated_at

Not every Analytic will require every field.

The important architectural requirement is that PinkCurve knows exactly what each Analytic means and how it is calculated.

For example:

    Analytic:
        Qualified Offering View

    analytic_id:
        QOV

    Purpose:
        Measure meaningful Buyer exposure
        to an Offering

    Inputs:
        Discovery Events

    Qualification:
        Defined QOV qualification rules

    Exclusions:
        Bots
        Fraudulent activity
        Invalid events

    Output:
        Qualified Offering View count

This prevents different PinkCurve products from independently interpreting the same Analytic differently.

---

## Analytical Result

An Analytical Result should preserve enough information to understand what was calculated.

Conceptually:

    analytic_result_id

    analytic_id
    analytic_version

    result_value

    seller_id              optional
    offering_id            optional
    creative_id            optional
    campaign_id            optional
    metadata_dimension_id  optional
    metadata_value_id      optional

    measurement_start
    measurement_end

    dimensions
    filters

    source_dataset_version

    calculated_at

    provenance

Not every Analytical Result will use every identifier.

For example, a Creative performance Analytic may use:

    creative_id

while a Campaign performance Analytic may use:

    campaign_id

and an Offering performance Analytic may use:

    offering_id

An AMN Analytic may use:

    metadata_dimension_id
    metadata_value_id
    amn_navigation_id

where appropriate.

---

## Analytics Can Produce Different Result Types

Discovery Analytics should not assume every result is simply a count.

Different Analytics may produce:

    count

    rate

    percentage

    ratio

    score

    ranking

    trend

    distribution

    time series

    aggregate

    comparison

    anomaly

For example:

    QOV
        → count

    Click-Through Rate
        → percentage / rate

    Metadata Usefulness
        → score

    Trending Offering
        → ranking / trend

    Discovery Diversity
        → score / distribution

    Campaign Performance
        → collection of metrics

Therefore, the Analytical Result architecture should support different result types without forcing all Analytics into one simplistic representation.

---

## Discovery Analytics Ownership

Discovery Analytics should remain authoritative for:

- Analytic definitions;
- calculation logic;
- qualification rules;
- analytical versions;
- Analytical Results;
- analytical provenance.

Conceptually:

    Raw Discovery Events
            ↓
    Curated Discovery Data
            ↓
    Discovery Analytics
            ↓
    Analytic Definition
       [analytic_id]
            ↓
    Calculation
            ↓
    Analytical Result
       [analytic_result_id]
            ↓
    Consuming PinkCurve Products

Other PinkCurve products may consume these results.

For example:

    Discovery Analytics
            ↓
    Offering Performance Analytics
            ↓
    Seller Intelligence

or:

    Discovery Analytics
            ↓
    Discovery Performance Analytics
            ↓
    Learning Engine

or:

    Discovery Analytics
            ↓
    Buyer Discovery Analytics
            ↓
    Buyer Intelligence

The consuming product determines how the Analytical Result participates in its own product responsibilities.

Discovery Analytics owns the meaning and calculation of the Analytic.

---

## Analytics Versioning

Analytics definitions may evolve.

For example, PinkCurve may improve the qualification rules for QOV.

Therefore:

    analytic_id
        → identifies the Analytic

    analytic_version
        → identifies the definition used

This is important because:

    QOV Version 1
        ≠ necessarily
    QOV Version 2

Historical Analytical Results should preserve the version used to calculate them.

PinkCurve should not silently reinterpret historical results using a newer analytical definition.

---

## Analytical Provenance

Important Analytical Results should be traceable to their source evidence.

Conceptually:

    analytic_result_id
            ↓
    analytic_id
            ↓
    analytic_version
            ↓
    calculation
            ↓
    curated dataset
            ↓
    Discovery Events
            ↓
    event_id

This supports:

- auditing;
- debugging;
- Seller reporting;
- Learning Engine;
- Seller Intelligence;
- Trust investigation;
- billing reconciliation where applicable;
- metric validation.

---

## Architectural Requirement

Chapter 11 should establish that Discovery Analytics consists of identifiable analytical definitions and identifiable materialized Analytical Results where those results need to be stored, referenced, exchanged, audited, or reproduced.

The architecture should therefore distinguish:

    analytic_id
        → identifies the Analytic definition

    analytic_version
        → identifies the version of that definition

    analytic_result_id
        → identifies a particular persisted
          Analytical Result

This creates the relationship:

    Discovery Events
            ↓
        event_id
            ↓
    Discovery Analytics
            ↓
       analytic_id
            ↓
    analytic_version
            ↓
       Calculation
            ↓
    analytic_result_id
            ↓
    Analytical Result
            ↓
    Buyer Intelligence /
    Seller Intelligence /
    Learning Engine /
    Reporting /
    Other Consumers

The exact database schema, analytical engine, aggregation implementation, indexing strategy, storage technology, and calculation schedules should be determined later during Data Design and System Design.

However, Chapter 11 should define the identity, ownership, definition, result, versioning, and provenance requirements.

**Audit Status: Needs Chapter 11 clarification — Discovery Analytics should explicitly define `analytic_id`, analytical definitions, analytical result structures, analytical versioning, provenance, and `analytic_result_id` for persisted results that require independent reference.**

---

# 25. QOV Data — Needs Stable Identification and Stronger Data Definition

Qualified Offering View (QOV) is one of PinkCurve's most important Discovery Analytics measures.

QOV should not be represented only as a numeric count.

PinkCurve needs to define:

- what a QOV is;
- which events qualify;
- which events are excluded;
- which version of the QOV definition was used;
- what entity or scope the result applies to;
- what time period was measured;
- which filters were applied;
- what source data was used;
- when the result was calculated;
- how the result can be reproduced.

Because QOV is a defined Analytic, it should have an associated:

    analytic_id
        → identifies the QOV Analytic definition

For example:

    analytic_id = QOV

QOV should also have:

    analytic_version
        → identifies the version of the QOV
          definition and qualification rules

Where a persisted QOV calculation result needs to be referenced independently, it should also have:

    qov_result_id
        → uniquely identifies one persisted
          QOV calculation result

or, if PinkCurve uses a common Discovery Analytics result structure:

    analytic_result_id
        → identifies the specific QOV result

PinkCurve should avoid creating two competing result-identification systems.

Therefore, the preferred architecture may be:

    analytic_id = QOV
    analytic_version = 2
    analytic_result_id = AR12345

rather than introducing a separate `qov_result_id` if all Discovery Analytics use the same `analytic_result_id` architecture.

Conceptually:

    QOV Analytic
        │
        │ analytic_id
        │ analytic_version
        ↓
    QOV Calculation
        ↓
    QOV Result
        │
        │ analytic_result_id
        ↓
    Seller / Offering /
    Campaign / Creative /
    Time Window

A QOV result may be calculated at different scopes.

Examples include:

    Offering QOV

    Seller QOV

    Campaign QOV

    Creative QOV

    Category QOV

    Geographic QOV

    Time-Window QOV

Therefore, a QOV result should preserve sufficient dimensional context.

A conceptual QOV result may include:

    analytic_result_id

    analytic_id
    analytic_version

    seller_id              optional
    offering_id            optional
    campaign_id            optional
    creative_id            optional

    category_id            optional
    metadata_dimension_id  optional
    metadata_value_id      optional

    geography_type         optional
    geography_value        optional

    measurement_start
    measurement_end

    qov_count

    total_candidate_events
    qualified_event_count
    excluded_event_count

    bot_excluded_count
    fraud_excluded_count
    duplicate_excluded_count
    invalid_event_count

    qualification_rule_version

    bot_filter_version
    fraud_filter_version

    source_dataset_id
    source_dataset_version

    calculated_at

    provenance

    status

Not every field is required for every QOV result.

However, the architecture should preserve enough information to understand how the result was produced.

---

## QOV Definition

The QOV definition itself should be explicitly modeled.

Conceptually:

    analytic_id
    analytic_name
    analytic_version

    description

    qualification_definition

    required_event_types

    qualification_rules

    exclusion_rules

    minimum_view_requirements

    timing_requirements

    bot_filtering_policy

    fraud_filtering_policy

    duplicate_handling_policy

    measurement_scope

    aggregation_method

    owner

    effective_from
    effective_to

    created_at
    updated_at

The exact fields depend on the final QOV definition.

The important principle is that PinkCurve should be able to answer:

> **What exactly qualified as a QOV when this result was calculated?**

---

## QOV Qualification Evidence

A QOV count should be traceable to the Discovery Events that qualified.

Conceptually:

    Discovery Event
        │
        │ event_id
        ↓
    QOV Qualification
        │
        ├── qualification_status
        ├── qualification_reason
        ├── rule_version
        └── evaluated_at
        ↓
    QOV Result

PinkCurve may eventually maintain a logical qualification record such as:

    qov_qualification_id

    event_id

    offering_id
    seller_id

    qualification_status

    qualification_reason

    analytic_version

    bot_status
    fraud_status
    duplicate_status

    evaluated_at

This would allow PinkCurve to explain why a particular Discovery Event was or was not counted.

The exact physical implementation can be determined later.

A dedicated persistent qualification record may not be necessary if the same information can be reproduced safely from immutable event evidence and versioned rules.

However, the architectural requirement is:

> **QOV qualification must be reproducible and auditable.**

---

## QOV Result Dimensions

QOV should support aggregation across dimensions such as:

    seller_id

    offering_id

    campaign_id

    creative_id

    category_id

    geographic scope

    discovery surface

    device context

    time window

Potential AMN-related QOV analysis may also use:

    metadata_dimension_id
    metadata_value_id

where appropriate.

This allows Discovery Analytics to answer questions such as:

    How many QOVs did this Offering receive?

    How many QOVs did this Seller receive?

    Which Creative produced the highest QOV?

    Which Campaign produced the most QOV?

    Which Metadata paths led to qualified views?

    Which locations produced meaningful Offering discovery?

---

## QOV Result Types

QOV itself may be a count, but related Analytics may derive additional results such as:

    QOV count

    QOV rate

    QOV per impression

    QOV per session

    QOV per Buyer

    QOV per Campaign

    QOV growth rate

    QOV trend

    QOV distribution

These should not necessarily become separate QOV definitions unless their calculation and business meaning differ materially.

They may instead be separate Analytics derived from QOV.

This distinction should be defined in Discovery Analytics.

---

## QOV Versioning

QOV definitions may evolve.

For example:

    QOV Version 1
        → Buyer viewed Offering
          for minimum threshold

    QOV Version 2
        → Buyer viewed Offering
          plus additional qualification
          and bot/fraud validation

Historical results must preserve the version used.

Therefore:

    analytic_id
        → QOV

    analytic_version
        → definition version

    analytic_result_id
        → one calculated result

should remain distinct.

Historical QOV results should not silently be reinterpreted under a newer QOV definition.

If PinkCurve recalculates historical QOV under a newer definition, the new result should be separately identifiable.

---

## QOV Source Data and Provenance

QOV should be traceable to authoritative Discovery Event evidence.

Conceptually:

    event_id
        ↓
    QOV Qualification
        ↓
    Curated Discovery Dataset
        ↓
    QOV Calculation
        ↓
    analytic_result_id

Important provenance may include:

    source_dataset_id
    source_dataset_version

    analytic_version

    qualification_rule_version

    bot_filter_version
    fraud_filter_version

    calculation_job_id

    calculated_at

This supports:

- auditing;
- reproducibility;
- debugging;
- Seller reporting;
- Seller disputes;
- Learning Engine;
- Seller Intelligence;
- pricing analysis;
- billing reconciliation where applicable.

---

## QOV Ownership

Discovery Analytics should be authoritative for:

- QOV definition;
- QOV version;
- qualification rules;
- analytical calculation;
- QOV result;
- QOV provenance.

Trust & Safety may provide:

- bot determination;
- fraud determination;
- invalid-traffic evidence.

Billing may consume QOV or related qualification results where appropriate.

However:

> **Discovery Analytics owns the analytical meaning and calculation of QOV.**

Trust & Safety owns Trust decisions.

Billing owns financial qualification and financial records.

These responsibilities should remain separate.

---

## QOV and Billing Boundary

QOV should not automatically equal a billable event.

The relationship should remain:

    Discovery Event
        ↓
    QOV Qualification
        ↓
    QOV Result
        ↓
    Billing Qualification
        ↓
    Billable Event
        ↓
    Invoice Item

This distinction is important because:

    Qualified Discovery
        ≠ automatically
    Financial Charge

Billing policy may consider QOV, but it remains a separate business and financial decision.

---

## Architectural Requirement

Chapter 11 should establish that QOV is not merely a number.

QOV is a versioned, reproducible Discovery Analytic with:

- stable analytic identity;
- definition;
- qualification rules;
- exclusion rules;
- dimensional scope;
- time window;
- source evidence;
- analytical result;
- result identity;
- provenance;
- versioning;
- Trust filtering context.

The preferred identity model should be:

    analytic_id
        → identifies QOV as an Analytic

    analytic_version
        → identifies QOV definition version

    analytic_result_id
        → identifies one persisted QOV result

rather than creating unnecessary duplicate identifier structures unless future Data Design demonstrates a need for a dedicated `qov_result_id`.

**Audit Status: Needs Chapter 11 clarification — define QOV identity, versioning, qualification evidence, result fields, dimensional scope, provenance, and authoritative ownership; detailed QOV formula and implementation remain in Discovery Analytics and later Data/System Design.**

---

# 25A. Discovery Event-to-Analytics Relationship — Needs Explicit Definition

PinkCurve Discovery Events and Discovery Analytics are closely related, but they represent different architectural concepts.

A Discovery Event records:

> **What happened?**

A Discovery Analytic defines:

> **What should PinkCurve measure or calculate from what happened?**

An Analytical Result records:

> **What result did that analytical calculation produce?**

These concepts should remain independently identifiable:

    event_id
        → identifies one historical Discovery Event

    analytic_id
        → identifies one Discovery Analytic definition

    analytic_version
        → identifies the version of that Analytic definition

    analytic_result_id
        → identifies one persisted result produced
          by the Analytic

The relationship is:

    Discovery Events
        │
        │ event_id
        ↓
    Analytics Input / Qualification
        │
        │ analytic_id
        │ analytic_version
        ↓
    Analytical Calculation
        ↓
    Analytical Result
        │
        │ analytic_result_id
        ↓
    Consuming PinkCurve Products

A Discovery Event should not normally contain a single `analytic_id`.

The event exists independently as historical evidence and may later participate in multiple Analytics.

For example:

    event_id = E100
        │
        ├── QOV Analytic
        │
        ├── Offering Engagement Analytic
        │
        ├── Creative Performance Analytic
        │
        └── Campaign Performance Analytic

Likewise, one Analytic normally consumes many Discovery Events.

For example:

    event_id = E100 ──┐
    event_id = E101 ──┤
    event_id = E102 ──┼──→ analytic_id = QOV
    event_id = E103 ──┤
    event_id = E104 ──┘

Therefore, the conceptual relationship between Discovery Events and Analytics is generally:

    Discovery Event
        M
        │
        │
        N
    Discovery Analytic

or:

    Many Discovery Events
            ↕
    Many Discovery Analytics

PinkCurve therefore needs a logical mechanism for representing which Discovery Events participated in an Analytical calculation.

Conceptually, this may be represented as:

    analytic_event_input

with fields such as:

    analytic_id
    analytic_version
    analytic_result_id
    event_id

    qualification_status
    qualification_reason

    included
    exclusion_reason

    processed_at

This is a logical architectural concept.

The exact physical implementation may use:

- relationship records;
- analytical datasets;
- lineage metadata;
- query definitions;
- dataset snapshots;
- batch identifiers;
- event references;
- another scalable implementation.

PinkCurve should not necessarily create one relational row for every Event-to-Analytic relationship if doing so would create excessive storage or processing overhead.

The physical implementation should be determined during Data Design.

However, the relationship must remain logically traceable.

---

## Example — QOV

Suppose PinkCurve records:

    E001 = Offering impression
    E002 = Creative displayed
    E003 = Offering viewed
    E004 = Offering explored
    E005 = Seller destination clicked

The QOV Analytic may evaluate these events:

    event_id
        ↓
    QOV Qualification Rules
        │
        │ analytic_id = QOV
        │ analytic_version = 2
        ↓
    Qualified / Excluded Events
        ↓
    QOV Calculation
        ↓
    analytic_result_id = AR500

Conceptually:

    E001 ──┐
    E002 ──┤
    E003 ──┼──→ QOV v2 ──→ AR500
    E004 ──┤
    E005 ──┘

The resulting Analytical Result should preserve sufficient lineage to determine which source Discovery Events contributed to the calculation.

---

## Example — Same Events, Different Analytic

The same Discovery Events may also participate in another Analytic:

    E001 ──┐
    E002 ──┤
    E003 ──┼──→ Creative Performance v3
    E004 ──┤
    E005 ──┘

and:

    E001 ──┐
    E003 ──┼──→ Offering Engagement v1
    E004 ──┤
    E005 ──┘

Therefore:

> **Discovery Events should not be owned by or permanently attached to one Analytic.**

They are reusable historical evidence.

---

## Event Qualification

An Analytic may not use every candidate Discovery Event.

For each relevant event, the Analytic may determine:

    INCLUDED

    EXCLUDED

    INVALID

    DUPLICATE

    BOT

    FRAUD

    OUTSIDE_MEASUREMENT_WINDOW

    DOES_NOT_MEET_QUALIFICATION_RULE

For example:

    event_id = E100
    analytic_id = QOV
    analytic_version = 2

    qualification_status = INCLUDED

while:

    event_id = E101
    analytic_id = QOV
    analytic_version = 2

    qualification_status = EXCLUDED
    exclusion_reason = BOT_TRAFFIC

This relationship is especially important for QOV because PinkCurve may eventually need to explain why an event did or did not qualify.

---

## Analytical Result Lineage

The complete lineage should conceptually be:

    event_id
        ↓
    Discovery Event
        ↓
    Analytic Input / Qualification
        ↓
    analytic_id
        ↓
    analytic_version
        ↓
    Analytical Calculation
        ↓
    analytic_result_id
        ↓
    Analytical Result

This allows PinkCurve to answer:

> Which Discovery Events produced this Analytical Result?

and, in the opposite direction:

> Which Analytics used this Discovery Event?

Both questions are important.

---

## Analytics-to-Billing Boundary

The many-to-many relationship between Discovery Events and Discovery Analytics must not create ambiguity in Billing.

A Discovery Event may participate in multiple Analytics, but participation in an Analytic does not make the event billable.

For example:

    event_id = E100
        │
        ├── QOV
        ├── Offering Engagement
        ├── Creative Performance
        └── Campaign Performance

These analytical relationships exist for measurement and intelligence.

Billing must use a separate and explicitly controlled qualification path.

Conceptually:

    Discovery Event
        │
        │ event_id
        ↓
    QOV Qualification
        ↓
    Qualified QOV Evidence
        ↓
    Billing Qualification
        ↓
    Billable Event
        │
        │ billable_event_id
        ↓
    Invoice Item
        │
        │ invoice_item_id
        ↓
    Invoice
        │
        │ invoice_id

Therefore:

> **An Event-to-Analytic relationship is analytical evidence, not financial authorization.**

Only Analytics or qualification results explicitly designated by PinkCurve Billing policy may become inputs to Billing Qualification.

Billing should never infer billability merely because an `event_id` is associated with an `analytic_id`.

The Billing system should preserve explicit references to the evidence used for qualification, such as:

    billable_event_id
    event_id
    analytic_id
    analytic_version
    analytic_result_id
    qualification_rule_version
    billing_rule_version
    seller_id
    offering_id
    qualified_at

where applicable.

This allows PinkCurve to trace a financial charge back to its Discovery evidence without coupling Billing to every Discovery Analytic.

The architectural boundary should therefore remain:

    Discovery Events
        ↓
    Discovery Analytics
        ↓
    Designated Qualification Evidence
        ↓
    Billing Qualification
        ↓
    Billable Event
        ↓
    Invoice Item

Other Analytics may use the same Discovery Events without participating in Billing.

> **Many Analytics may consume an Event, but only an explicitly designated Billing qualification path may create a Billable Event.**

This separation protects PinkCurve from accidental double billing, ambiguous billing attribution, analytical-definition changes affecting financial history, and unintended coupling between Discovery Analytics and Billing.

---

## Architectural Requirement

Chapter 11 should explicitly establish:

> **Discovery Events are independent historical evidence that may participate in multiple Discovery Analytics.**

> **A Discovery Analytic may consume many Discovery Events.**

> **The relationship between Discovery Events and Analytics is therefore generally many-to-many.**

> **Analytical Results must preserve sufficient lineage to identify or reproduce the Discovery Events and analytical definition that produced them.**

The exact physical representation of this relationship should be determined later during Data Design based on scale and performance requirements.

**Audit Status: Gap identified — explicitly define the many-to-many relationship between `event_id` and `analytic_id`, and preserve Event → Analytic → Analytical Result lineage.**

---

# 26. Learning Engine Data — Significant Update Required; Learning Output Identification Should Be Explicit

The current Learning Engine Data Domain includes:

- feature datasets;
- label datasets;
- training snapshots;
- learned signals;
- model predictions;
- experiment assignments;
- model evaluations.

These remain valid.

However, Chapter 8 now establishes that the Learning Engine can create multiple purpose-specific learning outputs for use by other PinkCurve products.

The Learning Engine itself does not require a generic:

    learning_engine_id

because Learning Engine is a PinkCurve product rather than a collection of independently identified product instances.

Instead, the important Learning Engine artifacts should have stable identities.

At minimum, PinkCurve should consider:

    learning_output_id
        → uniquely identifies one Learning Engine output

    learning_run_id
        → identifies one learning or training execution

    learning_objective_id
        → identifies the learning objective being pursued,
          where independent reference is useful

    model_id
        → identifies a purpose-specific learned model

    model_version
        → identifies a specific version of that model

Conceptually:

    Learning Objective
        │
        │ learning_objective_id
        ↓
    Learning Run
        │
        │ learning_run_id
        ↓
    Learning Engine
        ↓
    Learning Output
        │
        │ learning_output_id
        ↓
    Consuming PinkCurve Product

A Learning Output should be represented as a structured, traceable, versioned artifact rather than an informal learned result.

A conceptual Learning Output may include:

    learning_output_id

    output_type

    intended_consuming_product

    applicable_context

    learned_value
    learned_rule
    learned_parameter
    learned_score
    model_reference

    confidence
    strength

    supporting_evidence

    evidence_reference
    provenance_reference

    model_id
    model_version

    rule_version

    evaluation_status

    created_at

    valid_from
    valid_until

    governance_status

    approval_status

Not every Learning Output will use every field.

The structure should support several possible Learning Output types.

Examples include:

    LEARNED_VALUE

    LEARNED_RULE

    LEARNED_PARAMETER

    LEARNED_SCORE

    LEARNED_RELATIONSHIP

    MODEL_REFERENCE

    THRESHOLD

    WEIGHT

    POLICY_CANDIDATE

    FEATURE_IMPORTANCE

The exact list should evolve as PinkCurve implementation becomes more concrete.

---

## Learning Output Identity

Every important Learning Output that may be stored, exchanged, evaluated, referenced, approved, deprecated, or consumed by another PinkCurve product should have a stable:

    learning_output_id

For example:

    learning_output_id = LO1001

    output_type = MODEL_REFERENCE

    intended_consuming_product = AI_DISCOVERY

    model_id = RANKING_MODEL

    model_version = 3

or:

    learning_output_id = LO1002

    output_type = LEARNED_PARAMETER

    intended_consuming_product = AMN

    learned_parameter = METADATA_USEFULNESS_WEIGHT

    learned_value = 0.82

This allows PinkCurve to reference the exact Learning Engine output rather than relying on informal descriptions.

---

## Learning Run Identity

A Learning Output should also be traceable to the Learning process that produced it.

Therefore, PinkCurve should consider:

    learning_run_id

Conceptually:

    Historical Evidence
        ↓
    Training / Learning Dataset
        ↓
    learning_run_id
        ↓
    Learning Engine
        ↓
    learning_output_id

One Learning Run may create multiple Learning Outputs.

For example:

    learning_run_id = LR500
        │
        ├── learning_output_id = LO1001
        │       Ranking Model v3
        │
        ├── learning_output_id = LO1002
        │       Exploration Parameter
        │
        └── learning_output_id = LO1003
                Feed Diversity Weight

This establishes a one-to-many relationship:

    learning_run_id
        ↓
    1..N learning_output_id

---

## Learning Objective Identity

A Learning Run should also be associated with the reason the Learning Engine was invoked.

Where useful, this may be represented by:

    learning_objective_id

For example:

    learning_objective_id = IMPROVE_DISCOVERY_RANKING

or:

    learning_objective_id = IMPROVE_AMN_METADATA_SELECTION

or:

    learning_objective_id = IMPROVE_NEW_OFFERING_EXPOSURE

This allows PinkCurve to answer:

> Why was this model or learned output created?

Conceptually:

    learning_objective_id
            ↓
    learning_run_id
            ↓
    learning_output_id
            ↓
    consuming_product

---

## Intended Consuming Product

Each Learning Output should identify the PinkCurve product or capability expected to consume it.

Examples include:

    AI Discovery

    Adaptive Metadata Navigation

    Buyer Intelligence

    Seller Intelligence

    Creative Studio

    Trust & Safety

    Offering Knowledge

This is particularly important because the Learning Engine should not produce generic intelligence without a clear product purpose.

The architecture should preserve:

    learning_output_id
        ↓
    intended_consuming_product
        ↓
    product-specific use

For example:

    Learning Engine
        ↓
    Ranking Model
        ↓
    AI Discovery

or:

    Learning Engine
        ↓
    Metadata Selection Model
        ↓
    AMN

The consuming product remains responsible for product decisions and business behavior.

---

## Applicable Context

A Learning Output may not apply universally.

It may apply only to:

- a particular category;
- Offering type;
- geographic region;
- discovery surface;
- Buyer context;
- Seller segment;
- Metadata dimension;
- Campaign type;
- time period;
- experiment population.

Therefore:

    applicable_context

should be part of the Learning Output model where appropriate.

For example:

    learning_output_id = LO2001

    output_type = LEARNED_PARAMETER

    intended_consuming_product = AMN

    applicable_context:
        category = RUNNING_SHOES

    learned_parameter:
        WATERPROOF_METADATA_WEIGHT

    learned_value:
        0.91

This prevents learned behavior from being applied outside the context where it was validated.

---

## Learned Value, Rule, Parameter, Score, or Model Reference

Learning Engine outputs may take different technical forms.

A Learning Output may contain:

    learned_value

or:

    learned_rule

or:

    learned_parameter

or:

    learned_score

or:

    model_reference

These should not be forced into a single value type if doing so makes the meaning unclear.

For example:

    output_type = LEARNED_SCORE
    learned_score = 0.87

versus:

    output_type = MODEL_REFERENCE
    model_id = BUYER_INTENT_MODEL
    model_version = 4

versus:

    output_type = LEARNED_RULE
    learned_rule = ...

The exact representation should be determined during Data Design.

---

## Confidence and Strength

Some Learning Outputs should preserve:

    confidence

or:

    strength

where meaningful.

For example:

    learned relationship:
        Waterproof
        ↔
        Wet-weather hiking

    confidence:
        0.84

However, confidence should not automatically be interpreted as factual probability.

The meaning of confidence should be defined by the relevant Learning Output type.

---

## Supporting Evidence and Provenance

Every important Learning Output should be traceable to the evidence that produced it.

Conceptually:

    Discovery Events
        ↓
    Curated Data
        ↓
    Training Dataset
        ↓
    learning_run_id
        ↓
    learning_output_id

Potential provenance fields may include:

    evidence_reference

    provenance_reference

    training_dataset_id

    training_dataset_version

    source_event_range

    feature_version

    label_version

    experiment_reference

This supports reproducibility and auditability.

---

## Model and Rule Versioning

Where the output references a model:

    model_id
    model_version

should be preserved.

Where the output references a learned rule:

    rule_version

should be preserved where appropriate.

Historical Learning Outputs should not silently change meaning when a newer model or rule is introduced.

---

## Evaluation Status

A Learning Output should indicate whether it has been evaluated.

Possible states may include:

    NOT_EVALUATED

    EVALUATING

    PASSED

    FAILED

    CONDITIONAL

    DEPRECATED

The exact status vocabulary belongs in later design.

The important principle is:

> **A Learning Output should not automatically become production behavior merely because it was created.**

---

## Governance and Approval Status

Learning Outputs may require different levels of review depending on their effect.

Potential fields include:

    governance_status

    approval_status

For example:

    DRAFT

    UNDER_REVIEW

    APPROVED

    REJECTED

    RETIRED

A low-risk Ranking weight may require a lighter approval process than a learned output affecting Trust or Billing.

Governance should therefore be proportional to product impact.

---

## Validity Period

Some Learning Outputs should have:

    valid_from

    valid_until

because learned behavior may become stale.

For example:

    Holiday shopping trend

may only be valid during a limited period.

Likewise, short-term Buyer-related or market-related learned outputs may require expiration.

---

## Learning Output Lineage

The complete conceptual lineage should be:

    Historical Evidence
        │
        │ event_id / analytic_result_id
        ↓
    Learning Dataset
        │
        │ dataset_id / dataset_version
        ↓
    Learning Objective
        │
        │ learning_objective_id
        ↓
    Learning Run
        │
        │ learning_run_id
        ↓
    Learning Engine
        ↓
    Learning Output
        │
        │ learning_output_id
        ↓
    Evaluation
        ↓
    Approval
        ↓
    AI Platform / Consuming Product
        ↓
    Product Behavior

This allows PinkCurve to answer:

> What evidence produced this Learning Output?

> Which Learning Run created it?

> Why was it created?

> Which product was intended to consume it?

> Which model or rule version was involved?

> Was it evaluated?

> Was it approved?

> Is it still valid?

These are critical questions for a learning system.

---

## Learning Engine vs AI Platform

The distinction established in Chapters 8 and 10 should remain explicit.

Learning Engine owns:

- learning objectives;
- evidence selection;
- feature and label meaning;
- learning logic;
- learning-output meaning;
- model purpose;
- evaluation objectives.

AI Platform owns shared technical capabilities such as:

- training infrastructure;
- model execution;
- Model Registry;
- deployment;
- serving;
- AI observability;
- model infrastructure.

Conceptually:

    Learning Engine
        ↓
    learning_output_id
        ↓
    model_id / model_version
        ↓
    AI Platform
        ↓
    deployment / serving
        ↓
    Consuming PinkCurve Product

The Learning Engine output should therefore reference AI Platform model identifiers where appropriate without transferring ownership of the Learning objective to AI Platform.

---

## Architectural Requirement

Chapter 11 should establish:

> **Every important Learning Engine output must have a stable `learning_output_id` and enough metadata to identify its type, intended consumer, applicable context, learned value or model reference, confidence, evidence, provenance, version, evaluation status, governance status, approval status, creation time, and validity where appropriate.**

Learning executions that create important outputs should also be traceable through a stable:

    learning_run_id

Where useful, learning objectives should be independently identifiable through:

    learning_objective_id

The Learning Engine product itself does not require a generic `learning_engine_id`.

**Audit Status: Significant update required — add Learning Output identification, Learning Run identity, Learning Objective identity where useful, structured Learning Output fields, lineage, evaluation, governance, approval, and lifecycle.**

---

# 27. Purpose-Specific Model Lifecycle — Important

The model lifecycle should conceptually be represented as:

    Historical Evidence
            ↓
    Training Dataset
            ↓
    Learning Engine
            ↓
    Purpose-Specific Model
            ↓
    Evaluation
            ↓
    Approved Model Version
            ↓
    AI Platform Serving
            ↓
    Consuming PinkCurve Product

This aligns Data Architecture with Chapters 08 and 10.

---

# 28. Learning Engine vs AI Platform Data Responsibility — Important

Learning Engine determines:

- what PinkCurve learns;
- why a model exists;
- what data is appropriate;
- what features mean;
- what labels mean;
- when a model should be created or updated;
- whether the model improves the objective.

AI Platform provides:

- training infrastructure;
- evaluation infrastructure;
- Model Registry;
- deployment;
- serving;
- inference;
- monitoring;
- observability.

The relationship is:

    Learning Engine
          ↓
    creates / improves
    model
          ↓
    AI Platform
          ↓
    registers / deploys /
    serves / operates model
          ↓
    PinkCurve Product

---

# 29. Model Identity and Model Record — Needs Stronger Representation

PinkCurve models should be treated as first-class technical artifacts with stable identity, versioning, lineage, lifecycle, ownership, and consumption information.

A model should not be represented only by:

    model_id
    model_version

Those fields are necessary, but not sufficient.

PinkCurve should be able to determine:

- what the model is;
- why it exists;
- who created it;
- which Learning Objective produced it;
- which Learning Run produced it;
- which training data was used;
- which feature definitions were used;
- which label definitions were used;
- which model type or algorithm is used;
- which version is currently being referenced;
- how the model was evaluated;
- whether the model is approved;
- whether the model is deployed;
- where it is served;
- which PinkCurve products consume it;
- what input contract it expects;
- what output contract it produces;
- what context it applies to;
- when it became effective;
- whether it has been superseded or retired.

At minimum, every model should have a stable:

    model_id
        → identifies the logical model across its lifetime

and each version should have:

    model_version_id
        → uniquely identifies one specific model version

This distinction is important.

For example:

    model_id = DISCOVERY_RANKING_MODEL

may represent the logical model across time.

Its versions may be:

    model_version_id = DRANK-V1
    model_version_id = DRANK-V2
    model_version_id = DRANK-V3

Conceptually:

    Logical Model
        │
        │ model_id
        ↓
    ┌───────────────────────┐
    │ Model Version 1       │
    │ model_version_id      │
    ├───────────────────────┤
    │ Model Version 2       │
    │ model_version_id      │
    ├───────────────────────┤
    │ Model Version 3       │
    │ model_version_id      │
    └───────────────────────┘

The model identity should therefore separate:

    model_id
        → which logical model?

    model_version_id
        → which exact version?

This is more precise than relying only on a version number.

---

## Model Record

A conceptual model record may eventually include:

    model_id

    model_name
    model_purpose

    model_type
    algorithm_type

    owner

    created_by_product

    learning_objective_id
    learning_run_id
    learning_output_id

    intended_consuming_products

    applicable_context

    input_contract_id
    input_schema_version

    output_contract_id
    output_schema_version

    feature_set_id
    feature_set_version

    label_definition_id
    label_definition_version

    training_dataset_id
    training_dataset_version

    evaluation_id
    evaluation_status

    governance_status
    approval_status

    created_at
    updated_at

Not every model will require every field.

The architecture should nevertheless support these relationships.

---

## Model Version Record

Each specific model version should have its own independently identifiable record.

A conceptual model-version record may include:

    model_version_id
    model_id

    model_version

    artifact_id
    artifact_location

    model_provider
    framework
    runtime

    training_run_id

    training_dataset_id
    training_dataset_version

    feature_set_id
    feature_set_version

    label_definition_id
    label_definition_version

    hyperparameter_reference

    evaluation_id
    evaluation_status

    approval_status

    deployment_status

    serving_endpoint_id

    created_at

    effective_from
    effective_to

    retired_at

    predecessor_version_id

    successor_version_id

    status

This allows PinkCurve to distinguish the logical model from the exact executable artifact.

---

## Model Artifact Identity

The actual trained model artifact may also require a stable:

    model_artifact_id

This is useful when the model artifact is stored in object storage, a model registry, an external provider, or another technical system.

Conceptually:

    model_id
        ↓
    model_version_id
        ↓
    model_artifact_id
        ↓
    Model Artifact

The artifact may represent:

- model weights;
- serialized model;
- external provider model reference;
- fine-tuned model reference;
- container image;
- inference package;
- another deployable artifact.

The exact implementation belongs in AI Platform design.

---

## Model Ownership

Model ownership should distinguish between:

- learning ownership;
- technical platform ownership;
- product consumption.

For models created by Learning Engine:

    Learning Engine
        ↓
    owns model purpose,
    learning objective,
    evidence,
    and evaluation meaning

    AI Platform
        ↓
    owns registration,
    deployment,
    serving,
    monitoring,
    and technical operation

    Consuming PinkCurve Product
        ↓
    owns how model output
    affects product behavior

This follows the broader architectural rule:

> **PinkCurve products own product decisions and business behavior.**

---

## Model Consumers

A model may be consumed by one or multiple PinkCurve products.

For example:

    Ranking Model
        ↓
    AI Discovery

or:

    Buyer Intent Model
        ↓
    Buyer Intelligence
        ↓
    AI Discovery

or:

    Fraud Model
        ↓
    Trust & Safety
        ↓
    Registration / Offering Approval /
    Billing / Other Workflows

Therefore Model Identity should support:

    intended_consuming_products

or a separate relationship such as:

    model_consumers

Conceptually:

    model_id
        ↓
    ├── AI Discovery
    ├── Buyer Intelligence
    └── Seller Intelligence

where appropriate.

A model should not automatically become available to every PinkCurve product.

Authorization and product compatibility should be explicit.

---

## Model Input Contract

Every production model should have a defined input contract.

This may include:

    input_contract_id
    input_schema_version

    required_features
    optional_features

    feature_types

    missing_feature_behavior

    normalization_requirements

    context_requirements

The consuming product should not have to guess what the model expects.

---

## Model Output Contract

Every production model should also define its technical output.

This may include:

    output_contract_id
    output_schema_version

    output_type

    score
    class
    ranking_score
    probability
    embedding
    model_result
    confidence

The model output remains a technical result.

The consuming PinkCurve product determines its product meaning.

For example:

    Ranking Model
        ↓
    ranking_score
        ↓
    AI Discovery
        ↓
    Discovery Decision

or:

    Fraud Model
        ↓
    risk_score
        ↓
    Trust & Safety
        ↓
    Trust Decision

---

## Applicable Context

A model may not be valid universally.

Its applicability may be limited by:

- Offering category;
- Offering type;
- geography;
- Buyer segment;
- Seller segment;
- discovery surface;
- language;
- device type;
- time period;
- data availability;
- experiment population.

Therefore Model Identity should preserve:

    applicable_context

where appropriate.

This prevents a model from being used outside the conditions for which it was trained and evaluated.

---

## Model Evaluation Identity

A model version should reference the evaluation evidence that justified its use.

Conceptually:

    model_version_id
        ↓
    evaluation_id
        ↓
    evaluation_dataset
        ↓
    evaluation_results
        ↓
    approval_status

A model should not become production-ready merely because training completed successfully.

---

## Model Deployment Relationship

Model identity should remain separate from deployment identity.

For example:

    model_id
        ↓
    model_version_id
        ↓
    deployment_id
        ↓
    serving_endpoint_id

A model version may be:

- not deployed;
- deployed to Staging;
- deployed to Shadow;
- deployed to Pilot;
- deployed to Production;
- rolled back;
- retired.

Therefore deployment status should not be encoded only in the model identity.

---

## Model Lineage

The complete conceptual lineage may be:

    Historical Evidence
        ↓
    Training Dataset
        │
        │ training_dataset_id
        ↓
    Learning Objective
        │
        │ learning_objective_id
        ↓
    Learning Run
        │
        │ learning_run_id
        ↓
    Learning Output
        │
        │ learning_output_id
        ↓
    Logical Model
        │
        │ model_id
        ↓
    Model Version
        │
        │ model_version_id
        ↓
    Model Artifact
        │
        │ model_artifact_id
        ↓
    Evaluation
        │
        │ evaluation_id
        ↓
    Approval
        ↓
    Deployment
        │
        │ deployment_id
        ↓
    Serving Endpoint
        │
        │ serving_endpoint_id
        ↓
    Consuming Product
        ↓
    Product Decision

This gives PinkCurve end-to-end model traceability.

---

## Model Lifecycle Status

A model may move through states such as:

    DEVELOPMENT

    EVALUATING

    APPROVED

    SHADOW

    PILOT

    PRODUCTION

    SUSPENDED

    DEPRECATED

    RETIRED

The exact lifecycle belongs in AI Platform design.

However, Data Architecture should support lifecycle status and effective dates.

---

## Model Reproducibility

For important models, PinkCurve should preserve enough information to reproduce or explain the model version.

This may include:

    training_dataset_version
    feature_set_version
    label_definition_version
    algorithm / framework version
    hyperparameter reference
    source code version
    training environment
    random seed where relevant
    model artifact checksum

Not every field is necessary for every model.

The architectural goal is reproducibility proportional to model importance and risk.

---

## Architectural Requirement

Chapter 11 should establish:

> **Every logical model must have a stable `model_id`, and every independently deployable or referenceable model version must have a stable `model_version_id`.**

Where appropriate, PinkCurve should also identify:

    model_artifact_id
    evaluation_id
    deployment_id
    serving_endpoint_id

Model records should preserve enough information to establish:

- purpose;
- owner;
- learning origin;
- intended consumers;
- applicable context;
- input contract;
- output contract;
- training data;
- feature and label versions;
- evaluation;
- approval;
- deployment;
- lineage;
- lifecycle.

The exact database schema and Model Registry implementation should be determined later during AI Platform and Data Design.

**Audit Status: Needs significant strengthening — Model Identity should cover logical model identity, version identity, artifact identity, ownership, purpose, consumers, contracts, training lineage, evaluation, approval, deployment, and lifecycle.**

---

# 30. Model Lineage — Critical; Explicit Lineage Relationships Required

Model Lineage is critical to PinkCurve because a model cannot be understood, trusted, reproduced, evaluated, deployed, governed, or safely consumed without knowing how it was produced and how it is being used.

Model Identity defines the independently identifiable objects involved in the model lifecycle.

Model Lineage defines the relationships among those objects.

The architecture should therefore preserve an explicit, traceable chain from source evidence through learning, model creation, evaluation, approval, deployment, inference, and product consumption.

Conceptually:

    Source Evidence
        │
        │ event_id
        │ analytic_result_id
        ↓
    Curated / Training Dataset
        │
        │ training_dataset_id
        │ training_dataset_version
        ↓
    Learning Objective
        │
        │ learning_objective_id
        ↓
    Learning Run
        │
        │ learning_run_id
        ↓
    Learning Output
        │
        │ learning_output_id
        ↓
    Logical Model
        │
        │ model_id
        ↓
    Model Version
        │
        │ model_version_id
        ↓
    Model Artifact
        │
        │ model_artifact_id
        ↓
    Model Evaluation
        │
        │ evaluation_id
        ↓
    Governance / Approval
        ↓
    Deployment
        │
        │ deployment_id
        ↓
    Serving Endpoint
        │
        │ serving_endpoint_id
        ↓
    Model Inference
        │
        │ inference_id
        ↓
    Consuming PinkCurve Product
        ↓
    Product Output / Decision

This chain should not exist only as documentation.

The relevant identifiers and relationships should be preserved in PinkCurve data so lineage can be reconstructed programmatically.

---

## Model Lineage Relationships

PinkCurve should explicitly represent the major relationships between model-related entities.

Conceptually:

    learning_objective_id
        ↓
    learning_run_id

means:

    this Learning Run was performed
    for this Learning Objective

and:

    learning_run_id
        ↓
    learning_output_id

means:

    this Learning Run produced
    this Learning Output

and:

    learning_output_id
        ↓
    model_id
        ↓
    model_version_id

means:

    this Learning Output produced or
    references this logical Model
    and this specific Model Version

and:

    model_version_id
        ↓
    model_artifact_id

means:

    this Model Version is represented
    by this executable Model Artifact

and:

    model_version_id
        ↓
    evaluation_id

means:

    this exact Model Version was
    evaluated by this evaluation

and:

    model_version_id
        ↓
    deployment_id

means:

    this exact Model Version
    was deployed

and:

    deployment_id
        ↓
    serving_endpoint_id

means:

    this deployment is available
    through this Serving Endpoint

and:

    model_version_id
        ↓
    inference_id

means:

    this exact Model Version
    produced this inference

These relationships should be explicit rather than inferred from names, timestamps, or file locations.

---

## Training Data Lineage

Model Lineage must preserve the relationship between the Model Version and the data used to produce it.

Conceptually:

    Discovery Events
        │
        │ event_id
        ↓
    Discovery Analytics
        │
        │ analytic_id
        │ analytic_result_id
        ↓
    Curated Evidence
        ↓
    Training Dataset
        │
        │ training_dataset_id
        │ training_dataset_version
        ↓
    Learning Run
        │
        │ learning_run_id
        ↓
    Model Version
        │
        │ model_version_id

The lineage should allow PinkCurve to determine which dataset and dataset version contributed to a particular Model Version.

Where practical and appropriate, the training dataset itself should preserve lineage back to the source evidence.

This does not necessarily mean storing every `event_id` directly on the Model record.

At scale, lineage may instead reference:

    dataset_id
    dataset_version
    dataset_snapshot_id
    source partitions
    source time ranges
    transformation jobs
    lineage manifests

The exact implementation should be determined during Data Design.

The architectural requirement is that the lineage remain reconstructable.

---

## Feature and Label Lineage

Models may depend on derived Features and Labels.

Therefore Model Lineage should also preserve:

    feature_set_id
    feature_set_version

    label_definition_id
    label_definition_version

Conceptually:

    Source Evidence
        ↓
    Feature Transformation
        ↓
    feature_set_id
        ↓
    feature_set_version
        ↓
    Learning Run

and:

    Source Evidence
        ↓
    Label Definition
        ↓
    label_definition_id
        ↓
    label_definition_version
        ↓
    Learning Run

This allows PinkCurve to determine not only which raw data trained a model, but also how that data was interpreted.

---

## Code and Configuration Lineage

The same training data can produce different models when code, configuration, hyperparameters, or runtime environments change.

Therefore important Learning Runs should preserve references such as:

    source_code_version

    training_configuration_id

    hyperparameter_set_id

    runtime_environment

    framework_version

where appropriate.

Conceptually:

    Training Dataset
          +
    Feature Version
          +
    Label Version
          +
    Source Code Version
          +
    Training Configuration
          ↓
    learning_run_id
          ↓
    model_version_id

This strengthens reproducibility.

---

## Evaluation Lineage

Evaluation must reference the exact Model Version being evaluated.

Conceptually:

    model_version_id
        ↓
    evaluation_id
        │
        ├── evaluation_dataset_id
        ├── evaluation_dataset_version
        ├── evaluation_method
        ├── evaluation_metrics
        ├── evaluation_result
        └── evaluated_at

This prevents ambiguity such as:

    "The Ranking Model passed evaluation."

PinkCurve should instead be able to establish:

    Ranking Model
        model_id

    Version
        model_version_id

    Evaluation
        evaluation_id

    Result
        PASSED

The evaluation evidence should remain associated with that exact Model Version.

---

## Approval Lineage

Approval should also apply to an identifiable Model Version rather than generically to the logical Model.

Conceptually:

    model_version_id
        ↓
    evaluation_id
        ↓
    governance review
        ↓
    approval record
        ↓
    APPROVED / REJECTED

Where approval records require independent reference, PinkCurve should consider:

    approval_id

This becomes particularly important for models affecting:

- Trust;
- fraud detection;
- Seller treatment;
- Buyer treatment;
- Billing;
- security;
- other high-impact behavior.

---

## Deployment Lineage

Deployment should preserve the exact Model Version being deployed.

Conceptually:

    model_id
        ↓
    model_version_id
        ↓
    model_artifact_id
        ↓
    deployment_id
        ↓
    serving_endpoint_id

This allows PinkCurve to answer:

> Which exact Model Version is running in Production?

and:

> Which artifact is actually serving requests?

and:

> Which previous version should be restored if rollback is necessary?

---

## Inference Lineage

Model Lineage should not stop at deployment.

For important production model executions, PinkCurve should be able to determine which Model Version produced a result.

Therefore, where model inference results require independent traceability, PinkCurve should consider:

    inference_id

A conceptual inference record may include:

    inference_id

    model_id
    model_version_id

    deployment_id

    serving_endpoint_id

    input_reference

    output_reference

    consuming_product

    context_reference

    requested_at
    completed_at

The exact inference logging strategy should depend on scale, privacy, cost, and risk.

PinkCurve should not necessarily persist complete input and output payloads for every inference.

However, sufficient lineage should be retained for important decisions and debugging.

---

## Product Consumption Lineage

The final part of Model Lineage is identifying how a model result reaches a PinkCurve product.

Conceptually:

    model_version_id
        ↓
    inference_id
        ↓
    Model Output
        ↓
    Consuming Product
        ↓
    Product Interpretation
        ↓
    Product Output / Decision

For example:

    Ranking Model v7
        ↓
    inference_id
        ↓
    ranking scores
        ↓
    AI Discovery
        ↓
    Discovery Ranking

or:

    Buyer Intent Model v4
        ↓
    inference_id
        ↓
    intent prediction
        ↓
    Buyer Intelligence
        ↓
    Buyer Signals

or:

    Fraud Model v3
        ↓
    inference_id
        ↓
    risk score
        ↓
    Trust & Safety
        ↓
    Trust Decision

This preserves the Chapter 10 principle:

> **AI Platform provides technical intelligence capabilities. The consuming PinkCurve product owns what that intelligence means and what PinkCurve does with it.**

Model Lineage therefore records the model contribution without incorrectly attributing the final product decision to the model itself.

---

## Multiple Models and Derived Models

Model Lineage must also support models that depend on other models.

For example:

    Model A
        ↓
    produces Features / Scores
        ↓
    Model B

or:

    Model A
      +
    Model B
      +
    Model C
        ↓
    Ensemble Model

Therefore a Model Version may have relationships to other Model Versions.

Conceptually:

    parent_model_version_id
        ↓
    child_model_version_id

or a more general:

    model_lineage_relationship

This supports:

- ensemble models;
- stacked models;
- fine-tuned models;
- distilled models;
- derived models;
- models using another model's output as a Feature.

The exact relationship representation belongs in later Data Design.

---

## External and Foundation Models

Not every PinkCurve model will be trained by the Learning Engine.

PinkCurve may consume externally provided models such as:

- LLMs;
- Embedding models;
- foundation models;
- third-party classification models;
- external AI services.

These models should still have Model Identity and lineage where appropriate.

For example:

    external provider
        ↓
    provider_model_id
        ↓
    provider_model_version
        ↓
    PinkCurve model_id
        ↓
    PinkCurve model_version_id
        ↓
    deployment / API configuration
        ↓
    consuming PinkCurve product

The lineage should distinguish externally supplied models from PinkCurve-trained models.

---

## Model Lineage Record

PinkCurve should consider a general logical lineage representation capable of recording relationships among independently identified artifacts.

Conceptually:

    model_lineage_relationship_id

    source_entity_type
    source_entity_id

    relationship_type

    target_entity_type
    target_entity_id

    created_at

    provenance

For example:

    training_dataset_version
        --TRAINED-->
    model_version_id

    learning_run_id
        --PRODUCED-->
    model_version_id

    model_version_id
        --EVALUATED_BY-->
    evaluation_id

    model_version_id
        --DEPLOYED_AS-->
    deployment_id

    model_version_id_A
        --DERIVED_FROM-->
    model_version_id_B

This does not require PinkCurve to use one physical lineage table.

The exact implementation may use relational tables, a Model Registry, metadata catalog, lineage platform, event records, or a combination.

The important requirement is that the relationships be explicit and queryable.

---

## End-to-End Model Lineage

PinkCurve should ultimately be able to reconstruct:

    event_id / analytic_result_id
              ↓
    training_dataset_id
              ↓
    training_dataset_version
              ↓
    feature_set_version
              ↓
    label_definition_version
              ↓
    learning_objective_id
              ↓
    learning_run_id
              ↓
    learning_output_id
              ↓
    model_id
              ↓
    model_version_id
              ↓
    model_artifact_id
              ↓
    evaluation_id
              ↓
    approval
              ↓
    deployment_id
              ↓
    serving_endpoint_id
              ↓
    inference_id
              ↓
    consuming_product
              ↓
    Product Output / Decision

This provides true end-to-end lineage rather than merely Model version tracking.

---

## Architectural Requirement

Chapter 11 should establish:

> **Model Lineage must explicitly connect identifiable source evidence, datasets, Features, Labels, Learning Objectives, Learning Runs, Learning Outputs, Models, Model Versions, Model Artifacts, evaluations, approvals, deployments, inference results, and consuming PinkCurve products.**

The relationships should be sufficiently persistent and queryable to support:

- reproducibility;
- auditing;
- debugging;
- governance;
- model comparison;
- rollback;
- impact analysis;
- Trust investigation;
- performance analysis;
- regulatory or compliance needs where applicable.

The exact physical lineage storage architecture should be determined during AI Platform, Data Design, and System Design.

**Audit Status: Critical — Model Lineage needs explicit entity-to-entity relationships and end-to-end traceability rather than relying only on Model IDs and version fields.**
---

# 31. AI Platform Data — Significant Expansion and Boundary Clarification Required

AI Platform is PinkCurve's shared technical AI foundation.

Chapter 10 establishes that AI Platform provides shared technical capabilities such as:

- model registration and management;
- model deployment;
- model serving;
- LLM access;
- Embedding model access;
- Ranking model execution;
- AI service APIs;
- inference execution;
- prompt management;
- evaluation infrastructure;
- AI agents and agent infrastructure;
- Vector Database access;
- AI observability;
- usage and cost tracking;
- technical safety controls.

Therefore, AI Platform Data should represent the technical artifacts, configurations, executions, and operational records required to provide these shared services.

The current AI Platform Data definition includes:

    model identifier
    provider
    model version
    prompt version
    evaluation dataset
    generation time
    token usage
    cost
    validation results
    operation status

These fields remain useful but do not sufficiently represent AI Platform as a shared technical foundation.

AI Platform Data should be organized around identifiable technical objects and their relationships.

---

## Model Registry Data

Model identity and lineage are defined in the preceding Model Identity and Model Lineage sections.

AI Platform should maintain or integrate with the technical Model Registry containing information such as:

    model_id
    model_version_id
    model_artifact_id

    model_provider
    model_type

    framework
    runtime

    artifact_location

    input_contract_id
    output_contract_id

    registration_status

    created_at
    updated_at

The Model Registry provides the technical record of models available to the AI Platform.

Learning Engine may create some PinkCurve models.

External providers may supply others.

AI Platform provides the common technical mechanism through which those models are registered, managed, deployed, and served.

---

## AI Service Identity

PinkCurve products should generally consume AI capabilities through defined AI services rather than depending directly on infrastructure details.

Each independently managed AI service should have a stable:

    ai_service_id

An AI Service record may conceptually include:

    ai_service_id

    service_name
    service_type

    service_version

    model_id
    model_version_id

    input_contract_id
    output_contract_id

    endpoint_reference

    owning_platform_component

    authorized_consumers

    status

    created_at
    updated_at

Examples may include:

    embedding service

    ranking service

    intent inference service

    content generation service

    classification service

    fraud scoring service

    similarity service

The exact services should evolve with PinkCurve implementation.

The important architectural requirement is that PinkCurve products can reference a stable AI service rather than hard-code a particular underlying model or provider.

Conceptually:

    PinkCurve Product
        ↓
    ai_service_id
        ↓
    AI Platform
        ↓
    model_id
        ↓
    model_version_id

This allows AI Platform to replace or upgrade the underlying model without requiring every consuming product to change its integration.

---

## Deployment Data

A registered model is not necessarily a deployed model.

AI Platform should distinguish Model Identity from deployment state.

Each independently managed deployment should have:

    deployment_id

A conceptual deployment record may include:

    deployment_id

    model_id
    model_version_id
    model_artifact_id

    ai_service_id

    environment

    deployment_status

    deployment_configuration

    deployed_at

    retired_at

    rollback_reference

This allows PinkCurve to determine which exact Model Version is deployed for a particular AI service.

---

## Serving Endpoint Data

A deployment may be exposed through a serving endpoint.

Where independently managed, the endpoint should have:

    serving_endpoint_id

A conceptual record may include:

    serving_endpoint_id

    deployment_id
    ai_service_id

    endpoint_type

    environment

    availability_status

    created_at
    updated_at

Sensitive credentials, secrets, API keys, and authentication tokens should not be stored as ordinary AI Platform metadata.

They should be managed through appropriate secrets-management infrastructure.

---

## Inference Data

When a PinkCurve product invokes an AI service, AI Platform may create operational inference data.

Where an inference requires independent traceability:

    inference_id
        → identifies one model or AI-service execution

A conceptual inference record may include:

    inference_id

    ai_service_id

    model_id
    model_version_id

    deployment_id

    consuming_product

    request_context_reference

    input_reference

    output_reference

    requested_at
    completed_at

    latency

    operation_status

    error_reference

Not every AI inference needs complete persistent storage.

The amount of inference data retained should depend on:

- operational requirements;
- debugging needs;
- governance requirements;
- privacy;
- security;
- cost;
- model risk.

Sensitive Buyer, Seller, or Offering data should not be unnecessarily duplicated in inference logs.

---

## Prompt Data

Prompt-based AI services require explicit prompt identity and versioning.

PinkCurve should consider:

    prompt_id
        → identifies the logical Prompt

    prompt_version_id
        → identifies one exact Prompt version

A conceptual Prompt record may include:

    prompt_id

    prompt_name
    prompt_purpose

    intended_ai_service

    intended_consuming_product

    prompt_version_id

    model_compatibility

    input_contract

    output_contract

    evaluation_status

    approval_status

    created_at
    updated_at

Prompt text itself may be maintained separately from operational inference records.

This allows PinkCurve to determine which Prompt version participated in a particular AI operation.

Conceptually:

    inference_id
        ↓
    prompt_version_id
        +
    model_version_id
        ↓
    AI Result

---

## AI Evaluation Data

AI Platform provides shared technical evaluation infrastructure.

Evaluation records should reference the exact artifact being evaluated.

Where independently referenced:

    evaluation_id

may identify an evaluation.

A conceptual evaluation record may include:

    evaluation_id

    evaluation_type

    model_version_id
    prompt_version_id
    ai_service_id

    evaluation_dataset_id
    evaluation_dataset_version

    evaluation_metrics

    evaluation_results

    evaluation_status

    evaluated_at

The meaning of acceptable product performance remains the responsibility of the relevant PinkCurve product or Learning Engine.

AI Platform provides the technical evaluation capability and stores technical evaluation evidence.

---

## AI Usage Data

AI Platform should measure technical resource consumption.

Usage data may include:

    usage_record_id

    ai_service_id
    model_id
    model_version_id

    consuming_product

    request_count

    input_tokens
    output_tokens

    inference_count

    compute_usage

    storage_usage

    vector_operations

    generation_time

    measurement_start
    measurement_end

This enables PinkCurve to understand which products and AI services consume technical resources.

---

## AI Cost Data

AI Platform should also support technical cost attribution.

Conceptually:

    cost_record_id

    usage_record_id

    provider

    ai_service_id

    consuming_product

    model_id
    model_version_id

    cost_type

    quantity

    unit_cost

    total_cost

    currency

    measurement_period

This is operational AI infrastructure cost.

It should not be confused with Seller Billing.

Conceptually:

    AI Platform Cost
        → What does PinkCurve pay
          to operate AI?

    Seller Billing
        → What does a Seller owe
          PinkCurve?

These are different financial domains.

---

## AI Provider Data

AI Platform may use multiple providers.

Provider information may include:

    ai_provider_id

    provider_name

    provider_type

    supported_services

    supported_models

    region

    status

The exact commercial contract and credential information should remain in appropriate financial, procurement, security, or secrets-management systems rather than being unnecessarily duplicated in AI Platform operational records.

---

## Vector and Embedding Service Data

AI Platform may provide shared Embedding and Vector Database infrastructure.

Relevant technical metadata may include:

    embedding_model_id
    embedding_model_version

    embedding_dimension

    vector_index_id

    vector_index_version

    source_entity_type

    source_entity_id

    embedding_created_at

    embedding_status

This allows PinkCurve to determine which Embedding Model produced vectors and which Vector Index contains them.

For example:

    offering_id
        ↓
    embedding_model_version
        ↓
    vector representation
        ↓
    vector_index_id
        ↓
    AI Discovery retrieval

The exact Vector Database implementation belongs in System Design.

---

## AI Agent Data

If PinkCurve uses AI agents, AI Platform should provide technical infrastructure and operational records for them.

Where independently managed, PinkCurve may use:

    agent_id
    agent_version_id

A conceptual agent record may include:

    agent_id

    agent_name
    agent_purpose

    agent_version_id

    model_id
    model_version_id

    prompt_version_id

    available_tools

    authorized_consuming_products

    execution_policy

    evaluation_status

    approval_status

    status

Agent executions may also require:

    agent_execution_id

for important traceable operations.

The exact agent architecture belongs in later AI Platform System Design.

---

## AI Platform Operational Data

AI Platform should maintain sufficient operational data to observe the health of shared AI services.

Examples include:

    request volume

    latency

    availability

    failure rate

    timeout rate

    model errors

    provider errors

    token usage

    compute utilization

    service health

    deployment health

    validation failures

    operation status

This information supports AI Platform operations rather than product-level Discovery Analytics.

---

## AI Platform Data Relationships

The core technical relationship can be summarized as:

    Model Registry
        │
        │ model_id
        │ model_version_id
        ↓
    Deployment
        │
        │ deployment_id
        ↓
    AI Service
        │
        │ ai_service_id
        ↓
    Serving Endpoint
        │
        │ serving_endpoint_id
        ↓
    PinkCurve Product Request
        ↓
    Inference
        │
        │ inference_id
        ↓
    AI Technical Result
        ↓
    Consuming PinkCurve Product
        ↓
    Product Interpretation / Decision

Additional relationships may include:

    prompt_version_id
          ↓
      inference_id

    evaluation_id
          ↓
    model_version_id

    usage_record_id
          ↓
      ai_service_id

    cost_record_id
          ↓
    usage_record_id

This makes AI Platform Data operationally useful rather than merely a list of model attributes.

---

## AI Platform Data Boundary

AI Platform should own technical AI infrastructure data.

It should not become the authoritative owner of product meaning.

For example:

    AI Platform
        → owns Model serving,
          inference execution,
          technical evaluation,
          deployment,
          AI usage,
          AI infrastructure cost

    Learning Engine
        → owns learned-output meaning
          and learning objectives

    AI Discovery
        → owns Discovery behavior

    Buyer Intelligence
        → owns Buyer Signals

    Seller Intelligence
        → owns Seller intelligence outputs

    Trust & Safety
        → owns Trust decisions

This preserves the Chapter 10 principle:

> **AI Platform provides technical intelligence capabilities. PinkCurve products own product decisions and business behavior.**

---

## Architectural Requirement

Chapter 11 should establish that AI Platform Data represents the technical objects and operational evidence required to register, deploy, serve, execute, evaluate, monitor, and account for shared AI capabilities.

Important independently managed objects should have stable identifiers where appropriate, including:

    ai_service_id

    model_id
    model_version_id
    model_artifact_id

    deployment_id
    serving_endpoint_id

    inference_id

    prompt_id
    prompt_version_id

    evaluation_id

    usage_record_id
    cost_record_id

    ai_provider_id

    vector_index_id

    agent_id
    agent_version_id
    agent_execution_id

The exact physical schemas, cloud services, Model Registry technology, serving technology, Vector Database, AI agent framework, observability platform, and infrastructure implementation should be determined during AI Platform System Design.

## Logical AI Platform Data Structures

Potential logical AI Platform data structures may include:

    model_registry
    model_versions
    model_deployments
    model_endpoints

    ai_services
    provider_configurations

    prompt_registry
    prompt_versions

    evaluation_datasets
    evaluation_runs

    inference_logs

    ai_service_usage
    ai_cost_metrics

    vector_indexes
    embedding_versions

    ai_safety_results
    ai_observability_events

    agent_registry
    agent_versions
    agent_executions

These represent logical data concepts.

Not every concept requires a separate physical table.

Some may be implemented through:

- relational tables;
- Model Registry infrastructure;
- object storage;
- Vector Database infrastructure;
- observability systems;
- AI provider services;
- configuration management;
- specialized AI Platform services.

The exact physical implementation should be determined later during Data Design and AI Platform System Design.

**Audit Status: Significant expansion required — redefine AI Platform Data around shared AI services, Model Registry, deployment, serving, inference, Prompts, evaluation, providers, usage, cost, Vector/Embedding infrastructure, agents, observability, and explicit technical ownership boundaries.**

---

# 32. Expanded AI Platform Data — Consolidated into #31

This finding has been consolidated into **#31. AI Platform Data — Significant Expansion and Boundary Clarification Required** to avoid duplication.

**Audit Status: Resolved through consolidation into #31.**
---

# 33. AI Platform Does Not Own All Data It Consumes

AI Platform may consume:

- Offering Knowledge;
- Buyer Signals;
- Discovery Events;
- Creative information;
- Trust context;
- Seller-related evidence;
- Analytics;
- Metadata.

That does not transfer ownership of those domains to AI Platform.

AI Platform owns technical AI-service data.

Examples include:

    Model Registry metadata
    Prompt versions
    Inference metadata
    Evaluation records
    AI service telemetry
    Vector infrastructure metadata

---

# 34. Embeddings and Vector Data — Needs Stronger Representation

Embeddings and Vector Data are important derived data structures used by PinkCurve for semantic retrieval, similarity, Matching, AI Discovery, Adaptive Metadata Navigation, Offering understanding, Buyer Intelligence, Seller Intelligence, and other AI-supported capabilities.

The authoritative source remains the underlying PinkCurve entity or source data.

For example:

    Offering
        → authoritative Offering data

    Embedding
        → derived mathematical representation
          of that Offering or selected Offering content

Therefore:

> **Embeddings and Vector Data are derived representations and must never replace the authoritative source data from which they were created.**

However, treating an Embedding merely as:

    entity_id
    entity_type
    source_version
    embedding_model
    embedding_model_version
    embedding
    created_at

is not sufficient for PinkCurve's Data Architecture.

PinkCurve should explicitly represent:

- Embedding identity;
- source identity;
- source version;
- Embedding Model identity and version;
- embedding purpose;
- embedding dimensions;
- content or fields represented;
- chunk identity where applicable;
- Vector Index identity;
- index membership;
- freshness;
- re-embedding;
- lifecycle;
- provenance;
- retrieval compatibility.

---

## Embedding Identity

Each independently stored or referenceable Embedding should have a stable:

    embedding_id
        → uniquely identifies one Embedding representation

The Embedding should reference the authoritative entity from which it was derived.

Conceptually:

    Source Entity
        │
        │ entity_type
        │ entity_id
        │ source_version
        ↓
    Embedding
        │
        │ embedding_id
        ↓
    Vector Representation

For example:

    entity_type = OFFERING
    entity_id = O100
    source_version = 7

        ↓

    embedding_id = EMB500

This allows PinkCurve to identify the exact derived representation independently from the underlying entity.

---

## Embedding Model Identity

An Embedding should not identify its model only through an informal model name.

It should reference the Model Identity architecture established earlier.

Conceptually:

    embedding_id

    model_id
    model_version_id

This allows PinkCurve to determine exactly which Embedding Model produced the vector.

For example:

    Offering O100
        ↓
    model_id = OFFERING_EMBEDDING_MODEL
        ↓
    model_version_id = OEM-V3
        ↓
    embedding_id = EMB500

Different Embedding Model versions may produce mathematically incompatible vectors.

Therefore, Embedding Model version must be preserved.

---

## Embedding Purpose

The same PinkCurve entity may require multiple embeddings for different purposes.

For example, one Offering might have:

    semantic-description embedding

    Feature embedding

    category embedding

    Creative embedding

    Discovery retrieval embedding

    Metadata relationship embedding

Therefore an Embedding should include:

    embedding_purpose

or reference an equivalent Embedding definition.

Conceptually:

    offering_id = O100
        │
        ├── embedding_id = EMB501
        │       purpose = SEMANTIC_RETRIEVAL
        │
        ├── embedding_id = EMB502
        │       purpose = OFFERING_SIMILARITY
        │
        └── embedding_id = EMB503
                purpose = METADATA_MATCHING

This prevents PinkCurve from assuming that one generic vector representation is appropriate for every AI task.

---

## Embedding Source Content

PinkCurve must know what information was embedded.

For example, an Offering Embedding might be generated from:

    Offering name
        +
    description
        +
    category
        +
    Features
        +
    Benefits
        +
    Metadata

while another Embedding may use only:

    Offering name
        +
    description

Therefore Embedding metadata should preserve the source definition or reference used to construct the input.

Potential fields include:

    source_entity_type
    source_entity_id

    source_version

    source_content_type

    source_field_set

    source_content_hash

    embedding_definition_id
    embedding_definition_version

This supports reproducibility and freshness detection.

---

## Embedding Definition

PinkCurve should consider an identifiable Embedding definition.

For example:

    embedding_definition_id
        → identifies how a particular type
          of Embedding is constructed

An Embedding definition may specify:

    embedding_definition_id

    purpose

    source_entity_type

    source_fields

    preprocessing_rules

    chunking_strategy

    model_id
    model_version_id

    embedding_dimension

    normalization_rules

    target_vector_index

    version

This allows PinkCurve to answer:

> **How was this Embedding produced?**

rather than only:

> **Which model produced it?**

---

## Embedding Dimensions

Embedding metadata should preserve:

    embedding_dimension

because Vector Index compatibility depends on the dimensions produced by the Embedding Model.

For example:

    embedding_dimension = 1536

The exact dimension is implementation-specific and should not be fixed in the Product Blueprint.

However, Data Architecture should recognize it as important technical metadata.

---

## Chunked Embeddings

Some PinkCurve entities may contain more information than should be represented by one Embedding.

For example:

    Offering
        ↓
    Offering description
    specifications
    FAQs
    reviews
    other textual knowledge

may be divided into chunks.

Where chunking is used, PinkCurve should preserve:

    chunk_id

    entity_id

    chunk_sequence

    chunk_type

    source_location

    chunk_version

    embedding_id

Conceptually:

    offering_id = O100
        │
        ├── chunk_id = CH1
        │       ↓
        │   embedding_id = EMB1
        │
        ├── chunk_id = CH2
        │       ↓
        │   embedding_id = EMB2
        │
        └── chunk_id = CH3
                ↓
            embedding_id = EMB3

This enables retrieval of relevant portions of an entity rather than requiring every entity to have exactly one vector.

---

## Vector Index Identity

Embeddings become operationally useful for retrieval when stored or referenced through Vector Indexes.

Each independently managed Vector Index should have a stable:

    vector_index_id

A conceptual Vector Index record may include:

    vector_index_id

    index_name

    index_purpose

    entity_type

    embedding_definition_id

    model_id
    model_version_id

    embedding_dimension

    similarity_metric

    index_version

    environment

    created_at
    updated_at

    status

Examples might include:

    Offering retrieval index

    Creative similarity index

    Metadata similarity index

    Buyer-interest index

The exact Vector Database technology should remain an implementation decision.

---

## Vector Index Membership

PinkCurve should be able to determine which Embeddings are present in which Vector Index.

Conceptually:

    embedding_id
        ↓
    Vector Index Membership
        ↓
    vector_index_id

Potential logical information may include:

    vector_index_id

    embedding_id

    indexed_at

    index_version

    membership_status

This relationship is important because creating an Embedding does not necessarily mean that it has successfully been indexed.

---

## Vector Record Identity

Depending on the selected Vector Database, PinkCurve may also need:

    vector_record_id

This identifies the actual record stored in a Vector Index.

Conceptually:

    entity_id
        ↓
    embedding_id
        ↓
    vector_record_id
        ↓
    vector_index_id

The exact requirement depends on the Vector Database implementation.

Therefore `vector_record_id` should be considered an implementation-level identifier rather than mandated universally by the Product Blueprint.

---

## Embedding Freshness

Because Embeddings are derived data, PinkCurve must detect when they become stale.

For example:

    Offering Version 7
        ↓
    embedding_id = EMB500
        ↓
    generated from Version 7

Later:

    Offering Version 8
        ↓
    Offering content changed

The existing Embedding may now be stale.

Therefore Embedding metadata should support:

    source_version

    source_content_hash

    created_at

    freshness_status

    last_validated_at

Conceptually:

    authoritative source changes
            ↓
    source version changes
            ↓
    Embedding becomes STALE
            ↓
    re-embedding
            ↓
    new embedding_id
            ↓
    Vector Index updated

This is particularly important for Offerings because Seller information, price, availability, Features, descriptions, and other Offering information may change.

---

## Re-Embedding and Version Evolution

A new Embedding may be required when:

- source data changes;
- Embedding Model changes;
- Embedding Model version changes;
- source-field selection changes;
- preprocessing changes;
- chunking changes;
- Embedding purpose changes;
- Vector Index requirements change.

PinkCurve should preserve enough lineage to understand why a new Embedding was created.

Conceptually:

    embedding_id = EMB100
        ↓
    superseded by
        ↓
    embedding_id = EMB200

Potential metadata may include:

    predecessor_embedding_id

    superseded_at

    replacement_reason

The exact implementation belongs in Data Design.

---

## Embedding Provenance

The complete conceptual Embedding lineage should be:

    Authoritative Entity
        │
        │ entity_id
        │ source_version
        ↓
    Source Content Definition
        │
        │ embedding_definition_id
        ↓
    Embedding Model
        │
        │ model_id
        │ model_version_id
        ↓
    Embedding
        │
        │ embedding_id
        ↓
    Vector Index
        │
        │ vector_index_id
        ↓
    Retrieval
        ↓
    Consuming PinkCurve Product

This allows PinkCurve to determine:

- what entity was embedded;
- which version was embedded;
- which content was used;
- how the content was prepared;
- which model generated the Embedding;
- which model version was used;
- where the Embedding is indexed;
- whether it is current;
- which products may consume it.

---

## Retrieval Relationship

Embeddings and Vector Indexes exist primarily to support retrieval and similarity operations.

Conceptually:

    Query / Context
        ↓
    Query Embedding
        ↓
    vector_index_id
        ↓
    Similarity Search
        ↓
    Candidate entity_ids
        ↓
    Authoritative Entity Retrieval
        ↓
    Consuming Product

This distinction is important:

> **The Vector Database returns references to candidate entities; authoritative entity data should be retrieved from the authoritative PinkCurve data source.**

The Vector Index should not become the authoritative Offering, Buyer, Seller, Creative, or Metadata store.

---

## Multiple Consumers

Embedding and Vector services may support multiple PinkCurve products.

Examples include:

    AI Discovery
        → Offering candidate retrieval

    AMN
        → Metadata relationships and navigation support

    Offering Knowledge
        → semantic Offering representation

    Buyer Intelligence
        → interest and preference similarity where appropriate

    Seller Intelligence
        → Offering and market similarity analysis

    Creative Studio
        → Creative similarity or retrieval

Different consumers may require different Embedding definitions and Vector Indexes.

Therefore PinkCurve should avoid assuming that one universal Embedding and one universal Vector Index can serve every product.

---

## Privacy and Security

Embeddings derived from Buyer or other sensitive contextual data require appropriate privacy and access controls.

Embedding data should not be assumed to be anonymous merely because it is represented numerically.

The source entity, purpose, retention policy, access authorization, and deletion requirements should remain traceable.

If authoritative source data must be deleted or invalidated, associated derived Embeddings and Vector Index records should also be handled according to PinkCurve privacy and retention policies.

---

## Potential Logical Embedding Data

A conceptual Embedding record may therefore include:

    embedding_id

    source_entity_type
    source_entity_id
    source_version

    embedding_definition_id
    embedding_definition_version

    embedding_purpose

    model_id
    model_version_id

    embedding_dimension

    source_content_hash

    chunk_id                 optional

    embedding

    created_at

    freshness_status
    last_validated_at

    status

    provenance_reference

A conceptual Vector Index record may include:

    vector_index_id

    index_name
    index_purpose

    entity_type

    embedding_definition_id

    model_id
    model_version_id

    embedding_dimension

    similarity_metric

    index_version

    environment

    created_at
    updated_at

    status

Not every field requires a separate database column or table.

The physical representation should be determined during Data Design.

---

## Architectural Requirement

Chapter 11 should establish:

> **Embeddings are identifiable, versioned, derived representations of authoritative PinkCurve data. Every important Embedding must remain traceable to its source entity, source version, Embedding definition, Embedding Model, and Model Version.**

> **Vector Indexes must also be independently identifiable and must preserve compatibility with the Embedding definitions and Model Versions used to populate them.**

> **PinkCurve must support Embedding freshness, re-embedding, index membership, provenance, and lifecycle management.**

> **Vector retrieval returns candidate references; authoritative PinkCurve entities remain the source of truth.**

The exact Embedding Models, Vector Database technology, indexing algorithms, similarity metrics, chunking strategies, and physical schemas should be determined during AI Platform, Data Design, and System Design.

## Source Data and Source Metadata

An Embedding must remain traceable not only to the logical PinkCurve entity but also to the actual source data used to generate the Embedding.

The logical entity identifier alone is not sufficient.

For example:

    offering_id = O100

identifies the Offering, but the Embedding process may actually consume a particular stored representation of that Offering containing selected fields, documents, images, metadata, or other derived content.

Therefore, Embedding lineage should distinguish:

    source_entity_id
        → identifies the authoritative PinkCurve entity

    source_data_id
        → identifies the particular source data object,
          dataset, document, record, or materialized
          representation used for Embedding

    source_location
        → identifies where that source data can be
          retrieved

    source_metadata
        → describes the source data used

Conceptually:

    Authoritative Entity
        │
        │ source_entity_id
        ↓
    Source Data
        │
        │ source_data_id
        │ source_location
        ↓
    Source Metadata
        ↓
    Embedding Preparation
        ↓
    Embedding Model
        ↓
    embedding_id

---

## Source Location

The actual source used for Embedding may reside in different PinkCurve storage systems.

Examples may include:

    relational database

    object storage

    document storage

    data lake / warehouse

    Feature Store

    curated dataset

    Creative asset storage

    Offering Knowledge storage

Therefore, Embedding metadata should preserve a logical source reference rather than assuming that all source data resides in one database.

Potential source-location information may include:

    source_storage_type

    source_location

    source_object_id

    source_dataset_id

    source_partition

    source_path

    source_record_reference

Not every source requires every field.

For example:

    source_entity_type = OFFERING
    source_entity_id = O100

    source_storage_type = OBJECT_STORAGE
    source_location = <logical storage reference>
    source_object_id = OBJ500

or:

    source_entity_type = OFFERING
    source_entity_id = O100

    source_storage_type = RELATIONAL_DATABASE
    source_location = OFFERING_KNOWLEDGE
    source_record_reference = O100

The exact physical URI, bucket, database, table, or storage technology should be determined during Data Design and System Design.

Sensitive storage credentials should never be embedded in these records.

---

## Source Metadata

The source reference should be accompanied by enough metadata to understand exactly what was embedded.

Potential metadata may include:

    source_data_id

    source_entity_type
    source_entity_id

    source_version

    source_storage_type
    source_location

    source_content_type
    source_format

    source_schema_version

    source_language

    source_created_at
    source_updated_at

    source_content_hash

    source_size

    source_fields_used

    source_metadata_fields_used

    source_status

    provenance_reference

For example, an Offering may contain:

    name
    description
    category
    brand
    price
    Features
    Benefits
    specifications
    Metadata
    FAQs
    reviews

but a particular Embedding may use only:

    name
    description
    Features
    Benefits
    Metadata

The Embedding lineage should preserve that distinction.

---

## Source Data Snapshot

The current authoritative source may change after an Embedding is generated.

Therefore, for important Embeddings, PinkCurve should be able to identify the exact source version or snapshot used.

Conceptually:

    offering_id = O100
        ↓
    source_data_id = SD500
        ↓
    source_version = 7
        ↓
    source_content_hash = ...
        ↓
    embedding_id = EMB100

Later:

    offering_id = O100
        ↓
    source_version = 8
        ↓
    source content changed
        ↓
    EMB100 may become stale
        ↓
    new source_data_id / source version
        ↓
    new embedding_id

This provides reproducibility even when the authoritative entity continues to evolve.

---

## Source Preparation

The raw source data may not be sent directly to the Embedding Model.

It may first undergo:

    field selection

    cleaning

    normalization

    formatting

    concatenation

    Metadata enrichment

    chunking

    language processing

    other preprocessing

Therefore the lineage should include the transformation between source data and Embedding input.

Conceptually:

    Source Data
        │
        │ source_data_id
        ↓
    Source Metadata
        ↓
    Embedding Definition
        │
        │ embedding_definition_id
        │ embedding_definition_version
        ↓
    Preprocessing / Transformation
        ↓
    Embedding Input
        ↓
    Embedding Model
        │
        │ model_id
        │ model_version_id
        ↓
    Embedding
        │
        │ embedding_id
        ↓
    Vector Index
        │
        │ vector_index_id

This complete lineage allows PinkCurve to determine exactly what information produced a particular vector.

---

## Revised Embedding Record

A conceptual Embedding record may therefore include:

    embedding_id

    source_entity_type
    source_entity_id

    source_data_id
    source_version

    source_storage_type
    source_location
    source_record_reference

    source_schema_version
    source_content_type
    source_content_hash

    embedding_definition_id
    embedding_definition_version

    embedding_purpose

    model_id
    model_version_id

    embedding_dimension

    chunk_id                 optional

    embedding

    created_at

    freshness_status
    last_validated_at

    status

    provenance_reference

Not every field must physically reside in the Embedding record.

Some information may be referenced through:

    source_data_id

or:

    provenance_reference

to avoid unnecessary duplication.

---

## Revised End-to-End Embedding Lineage

The complete Embedding lineage should therefore be:

    Authoritative PinkCurve Entity
        │
        │ entity_id
        ↓
    Actual Source Data
        │
        │ source_data_id
        │ source_location
        │ source_version
        ↓
    Source Metadata
        │
        ├── schema
        ├── content type
        ├── fields
        ├── content hash
        └── timestamps
        ↓
    Embedding Definition
        │
        │ embedding_definition_id
        │ embedding_definition_version
        ↓
    Preprocessing / Chunking
        │
        │ chunk_id where applicable
        ↓
    Embedding Model
        │
        │ model_id
        │ model_version_id
        ↓
    Embedding
        │
        │ embedding_id
        ↓
    Vector Index
        │
        │ vector_index_id
        ↓
    Retrieval
        ↓
    Candidate entity_id
        ↓
    Authoritative PinkCurve Data
        ↓
    Consuming Product

**Audit Status: Needs significant strengthening — explicitly define `embedding_id`, Embedding definition and purpose, Model lineage, source lineage, chunking, `vector_index_id`, index membership, freshness, re-embedding, provenance, retrieval relationships, and authoritative-data boundaries.**

---

# 35. Buyer Intelligence Data — Significant Expansion Required

Buyer Intelligence Data requires substantially stronger representation.

Chapter 24 defines Buyer Intelligence as the PinkCurve product responsible for interpreting Buyer activity, preferences, intent, context, and behavior and transforming them into structured Buyer Signals that can be consumed by other PinkCurve products.

The Buyer Intelligence model includes:

    Buyer Intelligence
        │
        ├── Explicit Preferences
        ├── Session Intent
        ├── Short-Term Interests
        ├── Persistent Preferences
        ├── Negative Preferences
        ├── Contextual Signals
        ├── Behavioral Signals
        └── Inferred Intelligence

These categories describe important forms of Buyer Intelligence, but Data Architecture must go further.

It must define how Buyer Intelligence and Buyer Signals are identified, represented, sourced, versioned, evaluated, updated, expired, governed, and consumed.

---

## Buyer Intelligence Identity

Buyer Intelligence belongs to a Buyer and should therefore be associated with:

    buyer_id

However, `buyer_id` alone is not sufficient because one Buyer may have many independently referenceable Buyer Signals.

Each important persisted Buyer Signal should therefore have a stable:

    buyer_signal_id
        → uniquely identifies one Buyer Intelligence Signal

Conceptually:

    Buyer
        │
        │ buyer_id
        ↓
    Buyer Intelligence
        │
        ├── buyer_signal_id = BS001
        ├── buyer_signal_id = BS002
        ├── buyer_signal_id = BS003
        └── buyer_signal_id = BS004

This allows individual Buyer Signals to be referenced, updated, evaluated, expired, invalidated, audited, or consumed independently.

A generic `buyer_intelligence_id` is not necessarily required because Buyer Intelligence is the product/domain responsible for producing and managing Buyer Signals.

The important independently referenceable data object is the Buyer Signal.

---

## Buyer Signal Structure

A conceptual Buyer Signal should contain sufficient information to describe what PinkCurve believes or knows about a Buyer's current or historical discovery interests.

Potential fields may include:

    buyer_signal_id

    buyer_id

    signal_category
    signal_type

    signal_subject_type
    signal_subject_id

    signal_value

    signal_direction

    signal_strength
    confidence

    source_type
    source_reference

    session_id                 optional
    event_id                   optional
    feedback_id                optional
    review_id                  optional
    rating_id                  optional

    analytic_id                optional
    analytic_result_id         optional

    learning_output_id         optional
    model_id                   optional
    model_version_id           optional

    applicable_context

    created_at
    updated_at

    valid_from
    valid_until

    freshness_status

    provenance_reference

    governance_status

    status

Not every Buyer Signal requires every field.

The exact physical schema should be determined during Buyer Intelligence Data Design and System Design.

---

## Signal Category

Each Buyer Signal should identify which Buyer Intelligence category it represents.

For example:

    EXPLICIT_PREFERENCE

    SESSION_INTENT

    SHORT_TERM_INTEREST

    PERSISTENT_PREFERENCE

    NEGATIVE_PREFERENCE

    CONTEXTUAL_SIGNAL

    BEHAVIORAL_SIGNAL

    INFERRED_INTELLIGENCE

This preserves the conceptual model established in Chapter 24 while allowing all categories to participate in a consistent Buyer Signal architecture.

---

## Signal Type

`signal_category` identifies the broad intelligence category.

`signal_type` identifies the specific meaning of the signal.

For example:

    signal_category:
        SHORT_TERM_INTEREST

    signal_type:
        CATEGORY_INTEREST

or:

    signal_category:
        NEGATIVE_PREFERENCE

    signal_type:
        OFFERING_DISLIKE

or:

    signal_category:
        SESSION_INTENT

    signal_type:
        PRICE_SENSITIVITY

The exact Buyer Signal taxonomy should evolve during Buyer Intelligence design.

However, Data Architecture should support explicit signal typing rather than requiring consuming products to infer meaning from an unstructured value.

---

## Signal Subject

A Buyer Signal normally refers to something.

Therefore, Buyer Intelligence should identify the subject of the signal.

Conceptually:

    signal_subject_type
    signal_subject_id

Possible subjects may include:

    Offering

    Offering category

    Metadata dimension

    Metadata value

    Seller

    Creative

    Campaign

    location

    price range

    Feature

    brand

    discovery topic

For example:

    buyer_signal_id = BS100

    buyer_id = B500

    signal_category = SHORT_TERM_INTEREST

    signal_type = METADATA_INTEREST

    signal_subject_type = METADATA_VALUE

    signal_subject_id = MV200

    signal_strength = 0.84

This allows Buyer Signals to reference existing PinkCurve identifiers rather than duplicating the underlying entity.

---

## Signal Value

Different Buyer Signals may require different value representations.

Potential values may include:

    Boolean

    category

    numeric score

    range

    weight

    probability

    text classification

    structured value

    reference to another entity

Therefore, Data Architecture should not assume that every Buyer Signal can be represented by one numeric score.

The exact value structure should depend on `signal_type`.

---

## Signal Direction

Where appropriate, a Buyer Signal should distinguish positive, neutral, and negative direction.

For example:

    POSITIVE

    NEGATIVE

    NEUTRAL

This is particularly important because PinkCurve should learn not only what Buyers appear interested in but also what they do not want.

For example:

    Buyer repeatedly explores
    waterproof hiking shoes
        ↓
    POSITIVE interest signal

while:

    Buyer selects
    Show Fewer Like This
        ↓
    NEGATIVE preference signal

Negative Signals should not simply be represented as weak positive Signals.

They have different meaning.

---

## Signal Strength and Confidence

Buyer Intelligence should distinguish:

    signal_strength

from:

    confidence

where appropriate.

For example:

    signal_strength
        → how strong is the Buyer's apparent preference?

    confidence
        → how confident is PinkCurve that this interpretation is reliable?

These are not necessarily the same.

For example:

    strong apparent interest
    based on one unusual interaction

may have:

    high signal_strength
    lower confidence

while repeated consistent behavior may increase confidence.

The exact scoring methods belong in Buyer Intelligence and Learning Engine design.

---

## Source Evidence

Every important Buyer Signal should preserve its source or provenance.

Buyer Intelligence may consume evidence from:

    Discovery Events

    Discovery Sessions

    AMN navigation

    Buyer Feedback

    Reviews

    Ratings

    Searches

    Offering views

    Offering exploration

    Click-throughs

    Discovery Analytics

    Learning Engine outputs

    contextual information

Conceptually:

    Source Evidence
        ↓
    Buyer Intelligence Interpretation
        ↓
    buyer_signal_id

For example:

    event_id = E100
        ↓
    Buyer repeatedly explores
    Running Shoes
        ↓
    Buyer Intelligence
        ↓
    buyer_signal_id = BS500
        ↓
    SHORT_TERM_INTEREST
    Running Shoes

The Buyer Signal should preserve sufficient provenance to explain how it was derived.

---

## Multiple Evidence Sources

One Buyer Signal may be supported by multiple pieces of evidence.

For example:

    event_id E100
        │
    event_id E105
        │
    feedback_id F20
        │
    amn_navigation_id A10
        │
        ↓
    Buyer Intelligence
        ↓
    buyer_signal_id BS500

Therefore the relationship between Buyer Signals and supporting evidence may be many-to-many.

PinkCurve should support a logical relationship such as:

    buyer_signal_evidence

Conceptually:

    buyer_signal_id

    evidence_type
    evidence_id

    evidence_weight

    contribution_type

    observed_at

The exact physical representation should be determined later.

PinkCurve should not necessarily create a relational row for every interaction if that would create unnecessary scale or storage cost.

However, important Buyer Signals should remain sufficiently traceable to their evidence.

---

## Explicit vs Inferred Intelligence

Buyer Intelligence should preserve an important distinction between what the Buyer explicitly communicated and what PinkCurve inferred.

For example:

    Buyer selects:
        "Show Fewer Like This"

            ↓

    Explicit Negative Preference

versus:

    Buyer repeatedly skips
    similar Offerings

            ↓

    Inferred Negative Preference

These should not be treated as equivalent evidence.

A Buyer Signal should therefore preserve:

    source_type

or an equivalent classification such as:

    EXPLICIT
    OBSERVED
    ANALYTICAL
    LEARNED
    INFERRED

This prevents PinkCurve from presenting inferred behavior as though the Buyer explicitly stated it.

---

## Session Intent

Session Intent is temporary and should remain associated with:

    session_id

Conceptually:

    buyer_id
        ↓
    session_id
        ↓
    Session Evidence
        ↓
    Buyer Intelligence
        ↓
    Session Intent Signals

For example:

    buyer_signal_id
    buyer_id
    session_id

    signal_category = SESSION_INTENT

    signal_type = CATEGORY_INTENT

    signal_subject_id = RUNNING_SHOES

    created_at
    valid_until

Session Intent should normally expire or lose relevance after the Discovery Session or defined validity period.

---

## Short-Term Interests

Short-Term Interests may persist beyond a single Discovery Session but should decay or expire as Buyer behavior changes.

Conceptually:

    Multiple Sessions
        ↓
    Recent Buyer Activity
        ↓
    Buyer Intelligence
        ↓
    SHORT_TERM_INTEREST
        ↓
    valid_from
    valid_until
    signal_strength
    confidence

PinkCurve should not assume that a temporary shopping interest represents a permanent Buyer preference.

---

## Persistent Preferences

Persistent Preferences represent longer-lived Buyer interests or preferences supported by sufficient evidence or explicit Buyer input.

They may include:

    categories

    brands

    price ranges

    Features

    locations

    Offering types

    Metadata preferences

Persistent Preferences should still support:

    created_at
    updated_at
    confidence
    provenance
    validity
    status

because Buyer preferences can change over time.

"Persistent" should not mean permanent.

---

## Negative Preferences

Negative Preferences require explicit representation.

Examples may include:

    hidden Offering

    disliked category

    unwanted Metadata value

    Show Fewer Like This

    repeated negative behavior

    explicit exclusion

Negative Signals should be available to consuming products so PinkCurve does not repeatedly show Buyers things they have indicated they do not want.

Conceptually:

    buyer_signal_id

    signal_category = NEGATIVE_PREFERENCE

    signal_subject_type

    signal_subject_id

    signal_strength

    source_reference

    valid_from
    valid_until

---

## Contextual Signals

Contextual Signals may describe the conditions surrounding a Buyer discovery activity.

Examples may include:

    location context

    time context

    device context

    discovery surface

    session context

    category context

    navigation context

Contextual information should only be retained where permitted, useful, and consistent with PinkCurve privacy policies.

A contextual signal should not automatically become a Persistent Preference.

---

## Behavioral Signals

Behavioral Signals are derived from observed Buyer activity.

Examples may include:

    Offering viewed

    Offering explored

    Offering skipped

    repeated Offering exploration

    AMN selections

    search behavior

    click-through behavior

    session behavior

    category exploration

Behavioral Signals should preserve enough source evidence to distinguish observed behavior from interpreted preference.

---

## Inferred Intelligence

Inferred Intelligence is Buyer Intelligence produced through rules, Analytics, statistical methods, or learned models.

For example:

    Discovery Events
        +
    Buyer Feedback
        +
    Recent Sessions
        ↓
    Learning / Inference
        ↓
    Buyer Intelligence
        ↓
    buyer_signal_id

Inferred Signals should preserve references such as:

    learning_output_id

    model_id
    model_version_id

    analytic_id
    analytic_result_id

where applicable.

This allows PinkCurve to determine which model or analytical process produced the inference.

---

## Buyer Signal Lifecycle

Buyer Signals should have explicit lifecycle behavior.

Conceptually:

    CREATED
        ↓
    ACTIVE
        ↓
    UPDATED
        ↓
    WEAKENED
        ↓
    EXPIRED / SUPERSEDED / REMOVED

Not every Signal needs all states.

However, PinkCurve should avoid treating Buyer Intelligence as static.

Buyer intent and interests change continuously.

Potential lifecycle fields include:

    created_at
    updated_at

    valid_from
    valid_until

    freshness_status

    superseded_by_signal_id

    status

This is particularly important for Session Intent and Short-Term Interests.

---

## Signal Updating and Consolidation

New Buyer activity may:

    create a new Signal

    strengthen an existing Signal

    weaken an existing Signal

    contradict an existing Signal

    replace an existing Signal

    expire an existing Signal

For example:

    Buyer frequently explores
    premium cameras
        ↓
    Persistent Preference

Later:

    Buyer repeatedly selects
    Show Fewer Like This
        ↓
    Buyer Intelligence reevaluates
    existing preference

Buyer Intelligence should therefore support Signal evolution rather than only accumulating Signals indefinitely.

---

## Buyer Intelligence Snapshot

Consuming products may need a coherent current representation of Buyer Intelligence rather than retrieving individual Signals one at a time.

PinkCurve may therefore support a logical:

    buyer_intelligence_snapshot_id

A snapshot could represent:

    buyer_id

    snapshot_time

    active Buyer Signals

    session context

    intelligence version

    provenance reference

This is optional at the Product Blueprint level.

The exact API representation may instead construct Buyer Intelligence dynamically.

However, Data Architecture should recognize the need for consumers to obtain a coherent current Buyer Intelligence view.

---

## Buyer Intelligence Consumption

Buyer Intelligence outputs are intended for consumption by other PinkCurve products.

Conceptually:

    Buyer Evidence
        ↓
    Buyer Intelligence
        ↓
    Buyer Signals
        │
        ├── AI Discovery
        ├── AMN
        ├── Buyer Experience
        ├── Learning Engine
        └── other authorized consumers

Different consuming products may require different subsets of Buyer Signals.

For example:

    AI Discovery
        → ranking and candidate-selection Signals

    AMN
        → Metadata and navigation-related Signals

    Buyer Experience
        → current discovery-context Signals

    Learning Engine
        → appropriately governed historical
          Buyer Intelligence evidence

The Buyer Intelligence interface should therefore support filtering by:

    buyer_id

    consuming_product

    signal_type

    applicable_context

    session_id

    freshness

where appropriate.

---

## Consumer Contract

Buyer Intelligence should expose structured Signals through a defined interface rather than requiring other products to directly interpret Buyer Intelligence storage.

Conceptually:

    Consuming Product Request

        buyer_id
        context
        requested_signal_types

            ↓

    Buyer Intelligence

            ↓

    Buyer Signal Response

        buyer_signal_id
        signal_type
        subject
        value
        strength
        confidence
        applicable_context
        validity
        provenance where appropriate

This preserves Buyer Intelligence ownership of Buyer Signal meaning.

---

## Buyer Intelligence and Learning Engine Boundary

Buyer Intelligence and Learning Engine should remain distinct.

Learning Engine may create:

    preference models

    intent models

    behavioral models

    learned relationships

    learned parameters

Buyer Intelligence may consume those Learning Outputs and apply them to Buyer evidence.

Conceptually:

    Learning Engine
        ↓
    learning_output_id
        ↓
    model_id / model_version_id
        ↓
    Buyer Intelligence
        +
    Buyer Evidence
        ↓
    buyer_signal_id

Therefore:

> **Learning Engine learns reusable intelligence; Buyer Intelligence applies relevant intelligence to Buyer context and owns the resulting Buyer Signals.**

---

## Buyer Intelligence and AI Platform Boundary

AI Platform may execute models used by Buyer Intelligence.

For example:

    Buyer Intelligence
        ↓
    AI Platform
        ↓
    Intent Model
        ↓
    Model Result
        ↓
    Buyer Intelligence
        ↓
    Buyer Signal

AI Platform owns technical model execution.

Buyer Intelligence owns the interpretation and lifecycle of the resulting Buyer Signal.

---

## Privacy and Access Control

Buyer Intelligence requires particularly strong privacy controls because it represents information about Buyer behavior, interests, preferences, and inferred intent.

Data Architecture should support:

    purpose limitation

    access authorization

    retention controls

    deletion

    correction

    Signal expiration

    provenance

    auditability

    appropriate minimization

Not every PinkCurve product should automatically have access to every Buyer Signal.

Access should depend on legitimate product need and PinkCurve privacy policy.

---

## Derived Data Deletion and Correction

Because Buyer Signals may be derived from Buyer activity, deletion or correction of underlying Buyer data may affect derived Buyer Intelligence.

Conceptually:

    Source Buyer Data
        ↓
    Buyer Signal
        ↓
    source deleted / corrected
        ↓
    evaluate derived Signal
        ↓
    update / invalidate / delete
    where required

This relationship should remain traceable through provenance.

---

## Buyer Intelligence Lineage

The complete conceptual lineage should be:

    Buyer
        │
        │ buyer_id
        ↓
    Discovery Session
        │
        │ session_id
        ↓
    Buyer Activity
        │
        ├── event_id
        ├── amn_navigation_id
        ├── feedback_id
        ├── review_id
        └── rating_id
        ↓
    Discovery Analytics /
    Learning Engine where applicable
        │
        ├── analytic_result_id
        ├── learning_output_id
        ├── model_id
        └── model_version_id
        ↓
    Buyer Intelligence
        ↓
    Buyer Signal
        │
        │ buyer_signal_id
        ↓
    Signal Lifecycle /
    Context / Confidence
        ↓
    Authorized Consuming Product
        ↓
    Product Decision / Experience

This gives PinkCurve traceability from Buyer activity to interpreted Buyer Intelligence and ultimately to product consumption.

---

## Architectural Requirement

Chapter 11 should establish:

> **Buyer Intelligence Data consists of identifiable, structured, contextual, time-aware, and traceable Buyer Signals rather than a single Buyer profile or undifferentiated collection of behavioral data.**

Every important persisted Buyer Signal should have a stable:

    buyer_signal_id

and should preserve, where applicable:

    buyer_id

    signal_category
    signal_type

    signal_subject_type
    signal_subject_id

    signal_value

    signal_direction

    signal_strength
    confidence

    applicable_context

    source evidence
    provenance

    session context

    Analytics references

    Learning Engine references

    Model references

    creation and update time

    validity period

    freshness

    governance status

    lifecycle status

Buyer Intelligence should remain authoritative for the meaning, lifecycle, and consumption contract of Buyer Signals.

The exact database schema, Signal taxonomy, scoring methods, decay algorithms, API structure, storage technology, and physical implementation should be determined during Buyer Intelligence Data Design and System Design.

**Audit Status: Significant expansion required — define `buyer_signal_id`, Buyer Signal structure, Signal categories and types, subjects, values, direction, strength, confidence, source evidence, provenance, temporal behavior, lifecycle, consumption contracts, privacy controls, and boundaries with Learning Engine and AI Platform.**

---

# 36. Buyer Signal Structure — Consolidated into #35

The Buyer Signal structure originally identified in this finding has now been incorporated into the expanded:

**# 35. Buyer Intelligence Data — Significant Expansion Required**

Section #35 now defines:

- `buyer_signal_id`;
- Buyer association through `buyer_id`;
- Signal category and type;
- Signal subject;
- Signal value;
- Signal direction;
- Signal strength;
- confidence;
- source evidence;
- context;
- provenance;
- Analytics and Learning Engine references;
- Model references;
- creation and update times;
- validity period;
- freshness;
- privacy and governance;
- lifecycle;
- consuming-product relationships.

Maintaining a separate Buyer Signal Structure finding would therefore duplicate the Buyer Intelligence Data architecture defined in #35.

**Audit Status: Resolved through consolidation into #35.**

---

# 37. Buyer Signal Lifecycle — Important

Different Buyer Signals may have different lifetimes.

Examples:

    Session Intent
        → current session or short validity period

    Short-Term Interest
        → hours / days

    Persistent Preference
        → longer lived, but not necessarily permanent

    Negative Preference
        → may remain active until changed, removed, or expired

    Contextual Signal
        → valid only within the applicable context

    Behavioral Signal
        → historical evidence may persist while
          its current relevance changes over time

    Inferred Intelligence
        → validity depends on evidence freshness,
          Model version, confidence, and context

Buyer Signals therefore need lifecycle concepts such as:

- creation time;
- observation time;
- update time;
- validity period;
- freshness;
- expiration;
- source;
- confidence;
- provenance;
- applicable context;
- privacy classification;
- status;
- supersession where appropriate.

A Buyer Signal may conceptually move through states such as:

    CREATED
        ↓
    ACTIVE
        ↓
    UPDATED / WEAKENED
        ↓
    EXPIRED / SUPERSEDED / REMOVED

Not every Buyer Signal requires every lifecycle state.

The exact expiration periods, decay rules, update algorithms, and lifecycle implementation belong in later Buyer Intelligence Data Design and System Design.

> **Buyer Intelligence must treat Buyer Signals as time-aware intelligence whose relevance may strengthen, weaken, expire, or change as Buyer behavior and context evolve.**

**Audit Status: Important and correctly identified — retain as a separate lifecycle requirement.**

---

# 38. Seller Intelligence Data — Significant Expansion Required

Seller Intelligence Data requires substantially stronger representation.

Chapter 09 defines Seller Intelligence as the PinkCurve product responsible for interpreting Seller-related performance, Discovery activity, Offering performance, Creative performance, Campaign performance, Buyer response, value, opportunities, risks, and other relevant evidence and transforming them into structured intelligence that helps Sellers understand and improve their participation in PinkCurve.

Seller Intelligence may produce:

    Seller Signals
    Seller Insights
    Seller Opportunities
    Seller Recommendations
    Seller Alerts
    Seller Reports
    Seller Value Intelligence
    Recommendation Outcome Evidence

These outputs represent different forms of Seller Intelligence and should not be modeled as one generic Recommendation record.

Data Architecture must define how these outputs are identified, represented, sourced, related, versioned, evaluated, governed, delivered, and traced back to supporting evidence.

---

## Seller Intelligence Output Identity

Seller Intelligence may create many independently referenceable outputs for the same Seller.

Therefore every important persisted Seller Intelligence output should have a stable:

    seller_intelligence_output_id
        → uniquely identifies one Seller Intelligence output

The output should also reference:

    seller_id
        → identifies the Seller to whom the intelligence applies

Conceptually:

    Seller
        │
        │ seller_id
        ↓
    Seller Intelligence
        │
        ├── seller_intelligence_output_id = SI001
        ├── seller_intelligence_output_id = SI002
        ├── seller_intelligence_output_id = SI003
        └── seller_intelligence_output_id = SI004

Each output should then identify its specific output type.

For example:

    SELLER_SIGNAL

    SELLER_INSIGHT

    SELLER_OPPORTUNITY

    SELLER_RECOMMENDATION

    SELLER_ALERT

    SELLER_REPORT

    SELLER_VALUE_INTELLIGENCE

    RECOMMENDATION_OUTCOME_EVIDENCE

This common identifier provides a consistent Seller Intelligence architecture while allowing each output type to have its own specialized data.

---

## Specialized Output Identifiers

Some Seller Intelligence outputs may require their own identifiers when they have independent workflows or lifecycles.

Examples may include:

    seller_signal_id

    seller_insight_id

    seller_opportunity_id

    seller_recommendation_id

    seller_alert_id

    seller_report_id

    seller_value_intelligence_id

    recommendation_outcome_id

These identifiers should not be created merely for naming consistency.

A specialized identifier should be used where the object must be independently:

- referenced;
- updated;
- acknowledged;
- accepted;
- rejected;
- delivered;
- evaluated;
- versioned;
- audited;
- linked to another workflow.

The exact physical identity strategy should be determined during Seller Intelligence Data Design.

A common `seller_intelligence_output_id` may serve as the primary identity while specialized identifiers are introduced only where needed.

---

## Common Seller Intelligence Output Structure

Although Seller Intelligence produces different output types, they should share a common architectural envelope.

A conceptual Seller Intelligence output may include:

    seller_intelligence_output_id

    seller_id

    output_type
    output_subtype

    subject_type
    subject_id

    title
    summary

    output_value
    output_payload

    priority
    severity

    confidence
    strength

    applicable_context

    source_type
    source_reference

    created_at
    updated_at

    valid_from
    valid_until

    freshness_status

    status

    governance_status
    approval_status

    provenance_reference

Not every Seller Intelligence output requires every field.

The exact structure should depend on `output_type`.

---

## Seller Intelligence Subject

Seller Intelligence should explicitly identify what each output concerns.

Potential subjects may include:

    Seller

    Offering

    Creative

    Campaign

    Metadata Dimension

    Metadata Value

    category

    geographic area

    Discovery performance

    Buyer response pattern

    QOV performance

    Seller value

    Billing context

For example:

    seller_intelligence_output_id = SI100

    seller_id = S500

    output_type = SELLER_INSIGHT

    subject_type = OFFERING

    subject_id = O200

This tells PinkCurve that the Insight belongs to Seller S500 and concerns Offering O200.

Another output may concern:

    subject_type = CAMPAIGN
    subject_id = C300

or:

    subject_type = CREATIVE
    subject_id = CR400

This avoids duplicating the authoritative Offering, Creative, Campaign, or Metadata data inside Seller Intelligence.

---

## Seller Signals

Seller Signals are structured pieces of interpreted Seller-related intelligence that may be consumed by Seller Intelligence itself or by other authorized PinkCurve products.

Each important persisted Seller Signal should have:

    seller_signal_id

A conceptual Seller Signal may include:

    seller_signal_id

    seller_id

    signal_type

    signal_subject_type
    signal_subject_id

    signal_value

    signal_direction

    signal_strength
    confidence

    applicable_context

    source_reference
    provenance_reference

    created_at
    updated_at

    valid_from
    valid_until

    freshness_status

    status

Examples might include:

    OFFERING_PERFORMANCE_DECLINING

    CREATIVE_ENGAGEMENT_INCREASING

    CAMPAIGN_QOV_IMPROVING

    METADATA_COMPLETENESS_LOW

    BUYER_INTEREST_INCREASING

    SELLER_VALUE_TREND_POSITIVE

The exact Seller Signal taxonomy should be defined during Seller Intelligence design.

Seller Signals should be machine-consumable structured intelligence rather than merely Seller-facing text.

---

## Seller Insights

Seller Insights explain meaningful patterns or findings derived from Seller Signals, Analytics, and other evidence.

Each important persisted Insight may have:

    seller_insight_id

Conceptually:

    Seller Signals
        +
    Discovery Analytics
        +
    Other Evidence
        ↓
    Seller Intelligence
        ↓
    Seller Insight

A conceptual Seller Insight may include:

    seller_insight_id

    seller_id

    subject_type
    subject_id

    insight_type

    insight_summary

    supporting_signal_ids

    supporting_analytic_result_ids

    confidence

    applicable_context

    created_at

    valid_until

    provenance_reference

For example:

    "Offering O100 is receiving increasing
     qualified discovery from Buyers
     interested in waterproof hiking gear."

The Insight should remain traceable to the evidence supporting that interpretation.

---

## Seller Opportunities

Seller Opportunities represent situations where Seller Intelligence identifies a potentially valuable action or area for improvement.

Each independently tracked Opportunity should have:

    seller_opportunity_id

A conceptual Seller Opportunity may include:

    seller_opportunity_id

    seller_id

    opportunity_type

    subject_type
    subject_id

    opportunity_description

    estimated_value

    confidence

    priority

    supporting_evidence

    created_at

    valid_until

    opportunity_status

Potential statuses may include:

    IDENTIFIED

    PRESENTED

    ACCEPTED

    DECLINED

    EXPIRED

    ACTED_ON

The exact workflow belongs in Seller Intelligence System Design.

---

## Seller Recommendations

Seller Recommendations are actionable suggestions generated from Seller Intelligence.

Each independently managed Recommendation should have:

    seller_recommendation_id

A conceptual Recommendation may include:

    seller_recommendation_id

    seller_id

    recommendation_type

    subject_type
    subject_id

    recommendation

    rationale

    expected_benefit

    confidence

    priority

    supporting_signal_ids

    supporting_insight_ids

    supporting_opportunity_ids

    analytic_result_ids

    learning_output_id          optional

    model_id                    optional
    model_version_id            optional

    created_at

    valid_until

    recommendation_status

    governance_status
    approval_status

Seller Recommendations should not be confused with AI Discovery recommendations to Buyers.

Seller Intelligence:

    recommends actions TO Sellers

AI Discovery:

    determines Discovery Results
    FOR Buyers

These are separate product responsibilities.

---

## Seller Alerts

Seller Alerts identify conditions that may require Seller attention.

Each independently managed Alert should have:

    seller_alert_id

A conceptual Alert may include:

    seller_alert_id

    seller_id

    alert_type

    subject_type
    subject_id

    severity

    alert_message

    triggering_condition

    supporting_evidence

    detected_at

    valid_until

    acknowledgement_status

    resolution_status

Examples may include:

    significant performance decline

    Campaign issue

    Offering quality issue

    unusual Buyer-response change

    value deterioration

Alerts should remain distinct from Recommendations.

An Alert says:

    "Something requires attention."

A Recommendation says:

    "Here is an action you may consider."

---

## Seller Reports

Seller Intelligence may assemble multiple Signals, Insights, Opportunities, Recommendations, Analytics, and value measures into Seller Reports.

Each persisted or delivered Report should have:

    seller_report_id

A conceptual Seller Report may include:

    seller_report_id

    seller_id

    report_type

    reporting_period_start
    reporting_period_end

    generated_at

    report_version

    included_output_references

    included_analytic_results

    delivery_status

    report_location

Seller Reports should primarily reference authoritative Seller Intelligence outputs and Analytics rather than duplicate them unnecessarily.

---

## Seller Value Intelligence

Seller Value Intelligence helps Sellers understand the value PinkCurve provides.

Each independently persisted value assessment may have:

    seller_value_intelligence_id

Potential data may include:

    seller_value_intelligence_id

    seller_id

    measurement_period_start
    measurement_period_end

    offering_id              optional
    campaign_id              optional

    QOV-related results

    Discovery exposure

    qualified Buyer engagement

    click-through activity

    performance trends

    cost-related context

    value indicators

    value_index              where defined

    analytic_result_ids

    calculated_at

    methodology_version

    provenance_reference

Seller Value Intelligence should remain distinct from Billing.

Conceptually:

    Seller Value Intelligence
        → What value did PinkCurve
          appear to provide?

    Billing
        → What does the Seller
          financially owe PinkCurve?

These domains may use some of the same evidence but have different responsibilities.

---

## Recommendation Outcome Evidence

Seller Intelligence should not stop when a Recommendation is delivered.

PinkCurve should be able to determine what happened afterward.

Each independently tracked Recommendation outcome should have:

    recommendation_outcome_id

Conceptually:

    seller_recommendation_id
        ↓
    Seller Action
        ↓
    Subsequent Performance
        ↓
    recommendation_outcome_id

A conceptual Recommendation Outcome record may include:

    recommendation_outcome_id

    seller_recommendation_id

    seller_id

    action_status

    action_taken_at

    resulting_event_references

    resulting_analytic_result_ids

    before_measurement_reference
    after_measurement_reference

    outcome_type

    outcome_value

    evaluated_at

    confidence

    provenance_reference

This creates a feedback loop:

    Seller Intelligence
        ↓
    Recommendation
        ↓
    Seller Action
        ↓
    Discovery Events
        ↓
    Discovery Analytics
        ↓
    Outcome Evidence
        ↓
    Seller Intelligence
        +
    Learning Engine

This allows PinkCurve to learn whether Seller Recommendations actually help.

---

## Seller Intelligence Source Data

Seller Intelligence consumes data from multiple authoritative PinkCurve domains.

Potential sources include:

    Seller Data

    Offering Knowledge

    Creative Data

    Campaign Data

    Discovery Events

    Discovery Sessions

    Discovery Analytics

    QOV Results

    Buyer Feedback

    Reviews and Ratings

    Buyer Intelligence Signals
        where permitted and appropriate

    Learning Engine Outputs

    Trust & Safety results

    Billing data

Seller Intelligence should reference authoritative source data rather than create unnecessary duplicate copies.

Conceptually:

    Seller
    Offering
    Creative
    Campaign
    Discovery Events
    Discovery Analytics
    QOV
    Buyer Response
    Learning Outputs
    Trust
    Billing
        ↓
    Seller Intelligence
        ↓
    Seller Intelligence Outputs

---

## Source Evidence and Provenance

Every important Seller Intelligence output should preserve enough provenance to explain why it exists.

For example:

    event_id
        +
    analytic_result_id
        +
    seller_signal_id
        ↓
    Seller Insight
        ↓
    Seller Opportunity
        ↓
    Seller Recommendation

The lineage may be simple or complex depending on the output.

A Recommendation might be supported by:

    multiple Seller Signals

    multiple Analytics

    QOV results

    Offering information

    Creative performance

    Campaign performance

    Learning Engine outputs

Therefore Seller Intelligence should support many-to-many evidence relationships where necessary.

Conceptually:

    seller_intelligence_output_evidence

        seller_intelligence_output_id

        evidence_type
        evidence_id

        contribution_type
        evidence_weight

        observed_at

The exact physical representation belongs in Data Design.

---

## Analytics Relationship

Seller Intelligence should consume Discovery Analytics rather than independently redefine analytical metrics.

Conceptually:

    Discovery Events
        ↓
    Discovery Analytics
        │
        │ analytic_result_id
        ↓
    Seller Intelligence
        ↓
    Seller Insight /
    Opportunity /
    Recommendation /
    Value Intelligence

For example:

    QOV Analytic
        ↓
    analytic_result_id
        ↓
    Seller Intelligence
        ↓
    "Offering QOV increased 24%"

Discovery Analytics owns:

    metric definition
    calculation
    analytic version
    analytic result

Seller Intelligence owns:

    Seller interpretation
    Seller meaning
    Seller opportunity
    Seller recommendation

This ownership boundary should remain explicit.

---

## Learning Engine Relationship

Learning Engine may produce reusable learned intelligence used by Seller Intelligence.

Conceptually:

    Seller-related Evidence
        ↓
    Learning Engine
        │
        │ learning_output_id
        │ model_id
        │ model_version_id
        ↓
    Seller Intelligence
        ↓
    Seller Signal / Insight /
    Opportunity / Recommendation

Seller Intelligence should preserve references to:

    learning_output_id

    model_id
    model_version_id

where learned intelligence materially contributed to the output.

Learning Engine owns the reusable learned intelligence.

Seller Intelligence owns the Seller-specific interpretation and output.

---

## AI Platform Relationship

AI Platform may execute technical AI capabilities used by Seller Intelligence.

For example:

    Seller Intelligence
        ↓
    AI Platform
        ↓
    Analytical / AI Model
        ↓
    Technical Model Result
        ↓
    Seller Intelligence
        ↓
    Seller Output

AI Platform owns technical model execution and serving.

Seller Intelligence owns the meaning of the resulting Seller intelligence.

---

## Buyer Intelligence Boundary

Seller Intelligence may benefit from Buyer-related patterns, but it should not receive unrestricted Buyer-level intelligence.

Where Buyer Intelligence contributes to Seller Intelligence, the data should be:

- authorized;
- privacy-preserving;
- appropriately aggregated or minimized;
- necessary for legitimate Seller value;
- consistent with PinkCurve privacy policy.

For example:

    Buyer Intelligence
        ↓
    aggregated Buyer-interest pattern
        ↓
    Seller Intelligence

rather than unnecessarily exposing:

    individual Buyer profile
        ↓
    Seller

Seller Intelligence should not become a mechanism for Sellers to inspect individual Buyer behavior beyond what PinkCurve explicitly permits.

---

## Trust & Safety Relationship

Trust & Safety information may affect Seller Intelligence.

For example:

    Offering verification issue

    Seller verification status

    suspicious Campaign activity

    invalid Discovery activity

    fraud-related evidence

Seller Intelligence may consume appropriate Trust status or approved Trust outputs.

However:

> **Seller Intelligence does not own Trust decisions.**

Trust & Safety remains authoritative for verification, fraud, restrictions, escalation, and Trust actions.

---

## Billing Relationship

Seller Intelligence may consume Billing information to help explain Seller cost and value.

For example:

    Seller Value Intelligence
        ↓
    PinkCurve value
        compared with
    Seller cost

However, Seller Intelligence should not determine:

    billable_event_id

    invoice_item_id

    invoice_id

or financial qualification.

Billing remains authoritative for financial records.

Seller Intelligence may interpret those records for Seller-facing value analysis.

---

## Seller Intelligence Output Relationships

The different output types may form a progression:

    Seller Signal
        ↓
    Seller Insight
        ↓
    Seller Opportunity
        ↓
    Seller Recommendation
        ↓
    Seller Action
        ↓
    Recommendation Outcome Evidence

However, this is not mandatory for every output.

For example:

    Seller Signal
        ↓
    Seller Alert

may occur directly.

Or:

    Discovery Analytics
        ↓
    Seller Report

may not require a Recommendation.

The architecture should therefore support relationships among outputs without forcing every Seller Intelligence process into one rigid pipeline.

---

## Output Lifecycle

Seller Intelligence outputs have different lifetimes.

For example:

    Seller Signal
        → may strengthen, weaken,
          expire, or be superseded

    Seller Insight
        → may remain valid until
          underlying evidence changes

    Seller Opportunity
        → may expire

    Seller Recommendation
        → may be accepted, rejected,
          acted upon, expire, or be withdrawn

    Seller Alert
        → may be acknowledged
          and resolved

    Seller Report
        → represents a historical
          reporting period

    Seller Value Intelligence
        → tied to measurement period
          and methodology version

Therefore Seller Intelligence Data should support:

    created_at
    updated_at

    valid_from
    valid_until

    freshness_status

    status

    superseded_by

where appropriate.

---

## Seller Intelligence Consumption

Seller Intelligence outputs may be consumed by:

    Seller Experience

    Seller dashboards

    Seller reports

    Customer Support

    Learning Engine

    Trust & Safety where appropriate

    other authorized PinkCurve products

Not every output should automatically be exposed to the Seller.

Some outputs may be internal analytical or operational intelligence.

Therefore each output should support:

    intended_consumer

or an equivalent consumer relationship.

Examples:

    SELLER

    SELLER_EXPERIENCE

    CUSTOMER_SUPPORT

    LEARNING_ENGINE

    INTERNAL_OPERATIONS

This should be governed according to the meaning and sensitivity of the output.

---

## Seller Intelligence Interface

Other products should consume Seller Intelligence through defined interfaces rather than directly interpreting Seller Intelligence storage.

Conceptually:

    Consumer Request

        seller_id
        context
        requested_output_types

            ↓

    Seller Intelligence

            ↓

    Structured Outputs

        seller_intelligence_output_id

        output_type

        subject

        value / summary

        confidence

        priority

        applicable_context

        validity

        provenance where appropriate

This preserves Seller Intelligence ownership of Seller intelligence meaning.

---

## Seller Intelligence Lineage

The complete conceptual lineage may be:

    Seller
        │
        │ seller_id
        ↓
    Offering / Creative / Campaign
        │
        ├── offering_id
        ├── creative_id
        └── campaign_id
        ↓
    Discovery Activity
        │
        │ event_id
        ↓
    Discovery Analytics
        │
        │ analytic_id
        │ analytic_result_id
        ↓
    Learning Engine
        │
        │ learning_output_id
        │ model_id
        │ model_version_id
        ↓
    Seller Intelligence
        ↓
    Seller Signal
        │
        │ seller_signal_id
        ↓
    Seller Insight
        │
        │ seller_insight_id
        ↓
    Seller Opportunity
        │
        │ seller_opportunity_id
        ↓
    Seller Recommendation
        │
        │ seller_recommendation_id
        ↓
    Seller Action
        ↓
    Recommendation Outcome Evidence
        │
        │ recommendation_outcome_id
        ↓
    Discovery Events / Analytics
        ↓
    Learning and Future
    Seller Intelligence

This provides traceability from authoritative Seller and Discovery evidence through Seller Intelligence and back into measurable outcomes.

---

## Architectural Requirement

Chapter 11 should establish:

> **Seller Intelligence Data consists of multiple identifiable, structured, contextual, time-aware, and traceable intelligence outputs rather than only Seller Recommendations.**

Seller Intelligence should support the explicit representation of:

    Seller Signals

    Seller Insights

    Seller Opportunities

    Seller Recommendations

    Seller Alerts

    Seller Reports

    Seller Value Intelligence

    Recommendation Outcome Evidence

Every important persisted Seller Intelligence output should have a stable:

    seller_intelligence_output_id

and specialized output identifiers should be used where independent lifecycle, workflow, or reference requirements justify them.

Seller Intelligence outputs should preserve, where applicable:

    seller_id

    output type and subtype

    subject type and subject identifier

    value or structured payload

    confidence and strength

    priority or severity

    applicable context

    supporting evidence

    Analytics references

    Learning Engine references

    Model references

    provenance

    creation and update times

    validity period

    freshness

    governance and approval status

    lifecycle status

    intended consumer

Seller Intelligence should remain authoritative for Seller Signals, Seller Insights, Seller Opportunities, Seller Recommendations, Seller Alerts, Seller Reports, Seller Value Intelligence, and Recommendation Outcome Evidence.

Discovery Analytics remains authoritative for analytical definitions and Analytical Results.

Learning Engine remains authoritative for reusable learned intelligence.

AI Platform remains authoritative for shared technical AI execution.

Trust & Safety remains authoritative for Trust decisions.

Billing remains authoritative for financial qualification and financial records.

The exact schemas, taxonomies, scoring methods, APIs, lifecycle rules, storage technologies, and physical implementation should be determined during Seller Intelligence Data Design and System Design.

## Seller Intelligence Chain Identity and Relationships

Seller Intelligence creates multiple related intelligence objects from Seller-related evidence.

These objects should not exist as disconnected records.

Each important Seller Intelligence object should be independently identifiable and should preserve its relationship to the Seller, the Seller Intelligence process that created it, its supporting evidence, and other Seller Intelligence objects from which it was derived.

Conceptually:

    Evidence
        ↓
    Seller Signal
        ↓
    Seller Insight
        ↓
    Seller Opportunity
        ↓
    Seller Recommendation
        ↓
    Seller Action
        ↓
    Recommendation Outcome Evidence

The principal identities may include:

    seller_id

    seller_intelligence_run_id

    seller_signal_id

    seller_insight_id

    seller_opportunity_id

    seller_recommendation_id

    seller_action_id

    recommendation_outcome_id

The purpose of these identifiers is not merely to assign IDs to records.

They allow PinkCurve to reconstruct the complete Seller Intelligence reasoning and outcome chain.

---

### Seller Intelligence Run Identity

PinkCurve should consider:

    seller_intelligence_run_id

to identify a particular Seller Intelligence processing or evaluation execution when such execution-level traceability is useful.

For example:

    seller_intelligence_run_id = SIR100

may analyze current evidence for:

    seller_id = S500

and produce:

    seller_signal_id = SS101
    seller_signal_id = SS102
    seller_insight_id = SI201
    seller_opportunity_id = SO301
    seller_recommendation_id = SR401

This allows PinkCurve to determine which Seller Intelligence execution produced a particular collection of intelligence outputs.

Not every real-time Seller Signal necessarily requires a separately persisted Seller Intelligence Run.

However, the architecture should support `seller_intelligence_run_id` where reproducibility, auditing, batch processing, evaluation, or troubleshooting requires it.

---

### Seller Signal Identity

Each important persisted Seller Signal should have:

    seller_signal_id

and should reference:

    seller_id
    seller_intelligence_run_id        where applicable

as well as its supporting evidence.

Conceptually:

    Evidence
        ↓
    seller_signal_id

A Seller Signal may be supported by:

    event_id
    analytic_result_id
    offering_id
    creative_id
    campaign_id
    QOV result
    learning_output_id
    model_version_id
    other authorized evidence

---

### Seller Insight Identity

Each important persisted Seller Insight should have:

    seller_insight_id

and should preserve relationships to the Seller Signals, Analytics, or other evidence that produced it.

Conceptually:

    seller_signal_id SS101
            +
    seller_signal_id SS102
            +
    analytic_result_id AR50
            ↓
    seller_insight_id SI201

The Insight should reference:

    seller_id
    seller_intelligence_run_id        where applicable

and its contributing:

    seller_signal_ids
    analytic_result_ids
    other evidence references

This allows PinkCurve to answer:

> Why did Seller Intelligence reach this Insight?

---

### Seller Opportunity Identity

Each independently tracked Seller Opportunity should have:

    seller_opportunity_id

and should preserve the intelligence from which the Opportunity was identified.

Conceptually:

    seller_insight_id SI201
            +
    seller_signal_id SS103
            ↓
    seller_opportunity_id SO301

The Opportunity should reference:

    seller_id
    seller_intelligence_run_id        where applicable
    supporting seller_signal_ids
    supporting seller_insight_ids
    supporting analytic_result_ids

This allows PinkCurve to determine why a particular Seller Opportunity was identified.

---

### Seller Recommendation Identity

Each independently managed Seller Recommendation should have:

    seller_recommendation_id

and should preserve the Opportunity, Insight, Signals, Analytics, Learning Outputs, or other evidence supporting it.

Conceptually:

    seller_opportunity_id SO301
            +
    seller_insight_id SI201
            ↓
    seller_recommendation_id SR401

The Recommendation should reference:

    seller_id
    seller_intelligence_run_id        where applicable
    seller_opportunity_id
    supporting seller_insight_ids
    supporting seller_signal_ids
    supporting analytic_result_ids
    learning_output_id                where applicable
    model_id                          where applicable
    model_version_id                  where applicable

This provides traceability from the Recommendation back through Seller Intelligence to the original evidence.

---

### Seller Action Identity

When a Seller acts in response to a Seller Recommendation, that action should be independently traceable where it is important to Recommendation evaluation.

PinkCurve should therefore consider:

    seller_action_id

A conceptual Seller Action may include:

    seller_action_id

    seller_id

    seller_recommendation_id

    action_type

    action_subject_type
    action_subject_id

    action_status

    action_taken_at

    action_reference

For example:

    seller_recommendation_id = SR401
        ↓
    Seller changes Creative
        ↓
    seller_action_id = SA501

This allows PinkCurve to distinguish:

    Recommendation presented

from:

    Recommendation accepted

from:

    actual Seller action performed

These are not necessarily the same event.

---

### Recommendation Outcome Identity

The measurable result following a Seller Action should also be independently identifiable.

Each important evaluated outcome should have:

    recommendation_outcome_id

Conceptually:

    seller_recommendation_id SR401
            ↓
    seller_action_id SA501
            ↓
    Subsequent Discovery Events
            ↓
    Discovery Analytics
            ↓
    recommendation_outcome_id RO601

A Recommendation Outcome should preserve relationships such as:

    seller_id

    seller_recommendation_id

    seller_action_id

    before_measurement_reference

    after_measurement_reference

    resulting_event_references

    resulting_analytic_result_ids

    outcome_type

    outcome_value

    confidence

    evaluated_at

    provenance_reference

This allows PinkCurve to determine whether the Seller Recommendation actually produced useful results.

---

## Complete Seller Intelligence Traceability

The complete conceptual relationship becomes:

    Seller
        │
        │ seller_id
        ↓
    Source Evidence
        │
        ├── offering_id
        ├── creative_id
        ├── campaign_id
        ├── event_id
        ├── analytic_result_id
        ├── learning_output_id
        └── other evidence
        ↓
    Seller Intelligence
        │
        │ seller_intelligence_run_id
        ↓
    Seller Signal
        │
        │ seller_signal_id
        ↓
    Seller Insight
        │
        │ seller_insight_id
        ↓
    Seller Opportunity
        │
        │ seller_opportunity_id
        ↓
    Seller Recommendation
        │
        │ seller_recommendation_id
        ↓
    Seller Action
        │
        │ seller_action_id
        ↓
    Subsequent Evidence
        │
        ├── event_id
        └── analytic_result_id
        ↓
    Recommendation Outcome Evidence
        │
        │ recommendation_outcome_id
        ↓
    Seller Intelligence
        +
    Learning Engine

This creates an end-to-end traceable Seller Intelligence feedback loop.

---

## Relationship Principle

The relationships should be explicit rather than inferred only from timestamps or Seller identity.

For example, knowing that:

    seller_id = S500

appears on both an Insight and a Recommendation does not establish that the Insight caused or supported that Recommendation.

PinkCurve should preserve explicit relationships such as:

    seller_signal_id
        --SUPPORTS→
    seller_insight_id

    seller_insight_id
        --IDENTIFIES→
    seller_opportunity_id

    seller_opportunity_id
        --SUPPORTS→
    seller_recommendation_id

    seller_recommendation_id
        --RESULTED_IN→
    seller_action_id

    seller_action_id
        --EVALUATED_BY→
    recommendation_outcome_id

The exact physical implementation may use foreign keys, relationship tables, lineage records, event references, or another appropriate mechanism.

The Product Blueprint should define the relationships without prematurely requiring one database implementation.

---

## Architectural Requirement

Chapter 11 should establish:

> **Seller Intelligence outputs must not be represented as disconnected Seller-related records. Important Seller Signals, Seller Insights, Seller Opportunities, Seller Recommendations, Seller Actions, and Recommendation Outcome Evidence must have stable identities and explicit relationships that allow PinkCurve to reconstruct the Seller Intelligence chain from source evidence through recommendation and measurable outcome.**

Where appropriate, `seller_intelligence_run_id` should identify the Seller Intelligence execution that produced related outputs.

This enables PinkCurve to answer:

> What evidence created this Seller Signal?

> Which Signals produced this Seller Insight?

> Which Insight identified this Seller Opportunity?

> Why was this Seller Recommendation made?

> Did the Seller act on the Recommendation?

> What exactly did the Seller do?

> What happened afterward?

> Did the Recommendation improve Seller value?

> What should Seller Intelligence and the Learning Engine learn from the outcome?

**Audit Status: Significant expansion required — define Seller Intelligence output identity, specialized output structures, subjects, evidence, provenance, Analytics and Learning relationships, lifecycle, Recommendation outcomes, Seller Value Intelligence, consumption contracts, and clear product ownership boundaries.**

---

# 39. Seller Intelligence Logical Data — Consolidated into #38

The Seller Intelligence logical entities originally identified in this finding have now been incorporated into:

**# 38. Seller Intelligence Data — Significant Expansion Required**

Section #38 now explicitly defines and relates:

- Seller Signals;
- Seller Insights;
- Seller Opportunities;
- Seller Recommendations;
- Seller Alerts;
- Seller Reports;
- Seller Value Intelligence;
- Seller Actions;
- Recommendation Outcome Evidence.

It also defines stable identifiers such as:

    seller_signal_id
    seller_insight_id
    seller_opportunity_id
    seller_recommendation_id
    seller_alert_id
    seller_report_id
    seller_value_intelligence_id
    seller_action_id
    recommendation_outcome_id

and, where useful:

    seller_intelligence_run_id

Section #38 further establishes the relationships among these objects, including:

    Evidence
        ↓
    Seller Signal
        ↓
    Seller Insight
        ↓
    Seller Opportunity
        ↓
    Seller Recommendation
        ↓
    Seller Action
        ↓
    Recommendation Outcome Evidence

Maintaining a separate Seller Intelligence Logical Data section would therefore duplicate the architecture already defined in #38.

The exact physical representation of these logical entities may later use:

- separate relational tables;
- shared Seller Intelligence tables;
- relationship tables;
- event records;
- analytical stores;
- other appropriate storage structures.

Those implementation decisions should be made during Seller Intelligence Data Design and System Design.

**Audit Status: Resolved through consolidation into #38.**

---

# 40. Seller Signal Contract — Important; Stronger Contract Definition Required

Seller Signals are structured, machine-consumable outputs produced and owned by Seller Intelligence.

They represent specific observations, conditions, patterns, trends, changes, risks, strengths, weaknesses, or other interpreted Seller-related intelligence derived from PinkCurve evidence.

Seller Signals may be consumed by:

- Seller Intelligence itself;
- Seller Experience;
- Seller Reports;
- Seller Alerts;
- Seller Opportunities;
- Seller Recommendations;
- Learning Engine;
- Customer Support;
- other authorized PinkCurve products or operational systems.

Because Seller Signals may participate in downstream automated processing, their structure and meaning should be explicitly defined.

A Seller Signal should not be an informal message or arbitrary JSON object whose interpretation is left to the consuming product.

> **Seller Intelligence owns the meaning of Seller Signals and should expose them through a stable, versioned, machine-consumable contract.**

---

## Seller Signal Identity

Every important persisted Seller Signal should have a stable:

    seller_signal_id

The field should be called `seller_signal_id` rather than the more generic `signal_id` because PinkCurve also has Buyer Signals and may eventually have other Signal domains.

A Seller Signal should also reference:

    seller_id

because every Seller Signal belongs to or concerns a particular Seller.

Where the Signal was produced as part of an identifiable Seller Intelligence execution, it may also reference:

    seller_intelligence_run_id

Conceptually:

    seller_id
        ↓
    seller_intelligence_run_id
        ↓
    seller_signal_id

One Seller Intelligence Run may produce multiple Seller Signals.

---

## Seller Signal Contract Version

The Seller Signal data contract itself may evolve over time.

Therefore PinkCurve should consider:

    seller_signal_schema_version

or:

    contract_version

This is different from the version of a model that helped generate the Signal.

For example:

    seller_signal_schema_version = 2

identifies the structure and semantic contract of the Seller Signal.

while:

    model_version_id = MODEL-V7

identifies a model that may have contributed to producing it.

This distinction is important for long-term API compatibility.

---

## Seller Signal Category

Each Seller Signal should have:

    signal_category

The category provides a broad classification of the intelligence.

Potential conceptual categories may include:

    PERFORMANCE

    DISCOVERY

    OFFERING

    CREATIVE

    CAMPAIGN

    BUYER_RESPONSE

    VALUE

    QUALITY

    TRUST

    BILLING

    MARKET

    OPERATIONAL

The exact taxonomy should be defined during Seller Intelligence design.

Categories should remain controlled rather than arbitrary free text where machine consumption depends on them.

---

## Seller Signal Type

Within a category, the Signal should have a more precise:

    signal_type

For example:

    signal_category = PERFORMANCE

    signal_type = OFFERING_QOV_DECLINING

or:

    signal_category = CREATIVE

    signal_type = CREATIVE_ENGAGEMENT_IMPROVING

or:

    signal_category = OFFERING

    signal_type = OFFERING_METADATA_INCOMPLETE

`signal_type` tells consuming systems exactly what the Seller Signal means.

PinkCurve should maintain a defined Seller Signal taxonomy rather than requiring consumers to interpret descriptive text.

---

## Seller Signal Subject

A Seller Signal should explicitly identify what the Signal concerns.

Potential fields include:

    subject_type
    subject_id

Examples of `subject_type` may include:

    SELLER
    OFFERING
    CREATIVE
    CAMPAIGN
    CATEGORY
    METADATA_DIMENSION
    METADATA_VALUE
    GEOGRAPHIC_AREA
    DISCOVERY_SURFACE

For example:

    seller_signal_id = SS100

    seller_id = S500

    signal_category = PERFORMANCE

    signal_type = OFFERING_QOV_DECLINING

    subject_type = OFFERING

    subject_id = O200

This is more extensible than relying only on:

    offering_id
    creative_id
    campaign_id

Those identifiers may still appear as convenient references where useful, but `subject_type + subject_id` provides a consistent contract across many Seller Signal types.

---

## Related Entities

A Signal may concern one primary subject while also involving other PinkCurve entities.

Therefore Seller Signals may require:

    related_entity_references

For example:

    primary subject:
        offering_id = O100

    related entities:
        creative_id = CR200
        campaign_id = C300

This allows a Signal such as:

> Offering performance declined after Creative CR200 became active in Campaign C300.

without forcing all related objects into the primary subject.

---

## Signal Value

Seller Signals may contain different kinds of values.

Therefore:

    signal_value

should support a defined representation appropriate to `signal_type`.

Examples may include:

    Boolean

    numeric value

    percentage

    score

    count

    range

    category

    structured value

    entity reference

For example:

    signal_type = QOV_CHANGE
    signal_value = -0.18

or:

    signal_type = OFFERING_COMPLETENESS
    signal_value = 0.72

The meaning and unit of `signal_value` should not be ambiguous.

Where appropriate, the contract should also support:

    value_type
    unit

For example:

    signal_value = 18
    value_type = PERCENTAGE
    unit = PERCENT

---

## Baseline and Comparison

Many Seller Signals describe change rather than an isolated value.

Therefore PinkCurve should support comparison information where applicable:

    current_value

    baseline_value

    change_value

    change_percentage

    comparison_period

    baseline_reference

For example:

    signal_type = OFFERING_QOV_DECLINING

    current_value = 0.41
    baseline_value = 0.53

    change_value = -0.12
    change_percentage = -22.6%

This is much more useful than merely returning:

    signal_value = -0.12

because the consumer can understand what changed and relative to what.

---

## Signal Direction

Where applicable, Seller Signals should identify:

    signal_direction

Potential values may include:

    POSITIVE

    NEGATIVE

    NEUTRAL

    MIXED

    UNKNOWN

For example:

    OFFERING_QOV_IMPROVING
        → POSITIVE

    CREATIVE_ENGAGEMENT_DECLINING
        → NEGATIVE

Direction should represent Seller Intelligence interpretation and should not be inferred independently by every consuming product.

---

## Signal Strength

Seller Signals should support:

    signal_strength

where meaningful.

Signal strength represents the magnitude or importance of the observed condition.

For example:

    weak decline
    moderate decline
    strong decline

The exact representation may be numeric, categorical, or Signal-type-specific.

Signal strength should remain distinct from confidence.

---

## Confidence

A Seller Signal may include:

    confidence

Confidence represents how strongly Seller Intelligence trusts the interpretation based on available evidence.

For example:

    signal_strength = HIGH
    confidence = 0.62

could mean:

> The observed change is large, but available evidence is still limited.

Conversely:

    signal_strength = MODERATE
    confidence = 0.95

could mean:

> The change is moderate but supported by substantial evidence.

Signal strength and confidence should therefore remain separate concepts.

---

## Severity

Some Seller Signals represent conditions requiring attention.

Where appropriate, the contract should support:

    severity

Potential conceptual values might include:

    INFORMATIONAL

    LOW

    MEDIUM

    HIGH

    CRITICAL

Severity should primarily represent the seriousness of the condition.

It should not automatically determine Seller-facing presentation.

For example, Trust-related or operational Signals may require internal handling before they are exposed to a Seller.

---

## Priority

Seller Intelligence may also assign:

    priority

Priority answers a different question from severity:

    severity
        → How serious is the condition?

    priority
        → How urgently or importantly should
          this Signal be considered?

A moderate issue affecting a Seller's most important Offering could have higher priority than a more severe issue affecting an inactive Campaign.

---

## Applicable Context

A Seller Signal may only be meaningful within a particular context.

The contract should therefore support:

    applicable_context

Potential context may include:

    Offering category

    geographic region

    Discovery surface

    Campaign

    Creative

    time period

    Buyer segment where privacy permits

    device type

    Metadata context

For example:

    Creative performance is declining

may apply only to:

    mobile discovery
    +
    California
    +
    Running Shoes

rather than universally.

---

## Observation Window

Seller Signals derived from behavior or Analytics should identify the period over which the evidence was observed.

Potential fields include:

    observation_start

    observation_end

or:

    observation_window_reference

For example:

    observation_start = ...
    observation_end = ...

This is particularly important for performance, trend, and Seller Value Signals.

A Signal such as:

    OFFERING_QOV_DECLINING

is incomplete unless PinkCurve can determine over what period that decline was observed.

---

## Source and Evidence

A Seller Signal should preserve where its evidence came from.

Potential evidence may include:

    offering_id

    creative_id

    campaign_id

    event_id

    analytic_result_id

    QOV result

    buyer-related aggregate

    learning_output_id

    Trust result

    Billing result

    other Seller Intelligence output

The Signal should distinguish:

    source_type

from:

    evidence_references

`source_type` describes the general origin or method.

`evidence_references` identifies the actual evidence.

For example:

    source_type = DISCOVERY_ANALYTICS

    evidence_references:
        analytic_result_id = AR100
        analytic_result_id = AR101

or:

    source_type = LEARNED

    evidence_references:
        learning_output_id = LO500

---

## Multiple Evidence References

One Seller Signal may depend on many pieces of evidence.

Conceptually:

    event_id E100
        +
    event_id E101
        +
    analytic_result_id AR50
        +
    offering_id O200
            ↓
    Seller Intelligence
            ↓
    seller_signal_id SS300

The contract should therefore support multiple evidence references rather than assuming one source record per Signal.

The exact physical representation may use:

    seller_signal_evidence

or another relationship structure.

A conceptual evidence relationship may include:

    seller_signal_id

    evidence_type
    evidence_id

    contribution_type

    evidence_weight        optional

    observed_at

The physical implementation should be determined later.

---

## Provenance

Seller Signal provenance should provide enough information to reconstruct how the Signal was created.

Potential references may include:

    seller_intelligence_run_id

    analytic_result_id

    learning_output_id

    model_id
    model_version_id

    rule_id
    rule_version

    source_data_reference

    provenance_reference

Not every Signal will use AI or a learned model.

For example:

    OFFERING_METADATA_INCOMPLETE

may be produced by deterministic rules.

Another Signal:

    EMERGING_BUYER_INTEREST

may involve Analytics or a learned model.

The contract should support both without forcing every Signal to have a Model reference.

---

## Rule Identity

Because Seller Signals may be generated through deterministic logic as well as models, PinkCurve should consider:

    rule_id
    rule_version

where applicable.

Conceptually:

    Evidence
        ↓
    Rule R20 v3
        ↓
    seller_signal_id SS500

This provides equivalent traceability for non-ML intelligence.

---

## Model and Learning References

Where a learned model contributed to the Signal, the contract should reference:

    learning_output_id

    model_id
    model_version_id

where applicable.

This allows PinkCurve to determine exactly which learned intelligence participated in producing the Signal.

The Seller Signal should not merely contain:

    model_reference
    model_version

because the Model Identity architecture already established stronger identifiers.

---

## Seller Intelligence Run Reference

Where Seller Signals are generated as part of an identifiable Seller Intelligence execution:

    seller_intelligence_run_id

should be preserved.

Conceptually:

    seller_intelligence_run_id SIR100
        │
        ├── seller_signal_id SS101
        ├── seller_signal_id SS102
        └── seller_signal_id SS103

This allows Signals produced during the same Seller Intelligence evaluation to be grouped and traced.

---

## Temporal Fields

Seller Signals require more precise temporal representation than:

    observed_at
    generated_at
    valid_until

A conceptual contract may support:

    observation_start
    observation_end

    generated_at

    valid_from
    valid_until

    updated_at

    last_validated_at

These fields have different meanings.

For example:

    observation_start / observation_end
        → period from which evidence was collected

    generated_at
        → when Seller Intelligence produced the Signal

    valid_from / valid_until
        → period during which the Signal is considered applicable

    last_validated_at
        → last time PinkCurve confirmed
          that the Signal remains valid

---

## Freshness

Seller Signals should support:

    freshness_status

Potential conceptual values may include:

    CURRENT

    AGING

    STALE

    EXPIRED

The exact freshness logic depends on Signal type.

For example, a real-time Campaign anomaly may become stale quickly, while a longer-term Offering-quality Signal may remain relevant much longer.

---

## Signal Lifecycle

Seller Signals should have explicit lifecycle status.

Potential states may include:

    CREATED

    ACTIVE

    UPDATED

    WEAKENED

    SUPERSEDED

    EXPIRED

    INVALIDATED

    RETIRED

Not every Signal requires every state.

The important principle is that Seller Signals should not accumulate indefinitely as though every historical Signal remains current.

---

## Supersession

When a newer Seller Signal replaces an older one, PinkCurve should preserve that relationship where useful.

Potential fields include:

    predecessor_signal_id

    superseded_by_signal_id

For example:

    SS100
    OFFERING_QOV_DECLINING
        ↓
    later evidence changes
        ↓
    SS200
    OFFERING_QOV_RECOVERING

This gives Seller Intelligence a historical sequence rather than disconnected snapshots.

---

## Intended Consumers

Seller Signals may be used by different PinkCurve products and systems.

Therefore the contract should support:

    intended_consumers

or equivalent access/consumer metadata.

Potential consumers include:

    SELLER_INTELLIGENCE

    SELLER_EXPERIENCE

    SELLER_REPORTING

    CUSTOMER_SUPPORT

    LEARNING_ENGINE

    TRUST_AND_SAFETY

    INTERNAL_OPERATIONS

Not every Seller Signal should automatically be available to every consumer.

---

## Seller Visibility

Because some Seller Signals may be internal, the contract should distinguish whether a Signal can be exposed directly to a Seller.

Potential metadata may include:

    visibility

with conceptual values such as:

    INTERNAL

    SELLER_VISIBLE

    RESTRICTED

    SYSTEM_ONLY

For example, an internal Trust-related Signal should not automatically become Seller-visible merely because it is associated with that Seller.

---

## Privacy and Sensitivity

Seller Signals may be derived partly from Buyer behavior, Trust information, financial information, or other sensitive evidence.

Therefore the contract should support:

    privacy_classification

and where appropriate:

    sensitivity_classification

    access_policy_reference

The Signal should contain only the information necessary for its purpose.

Seller-facing Signals should not expose inappropriate Buyer-level information.

---

## Governance Status

Some Seller Signals may require governance or validation before downstream use.

Where applicable:

    governance_status

may indicate whether the Signal is:

    GENERATED

    VALIDATED

    APPROVED

    RESTRICTED

    REJECTED

The exact workflow depends on Signal risk and use.

Not every low-risk performance Signal requires human approval.

---

## Relationship to Seller Insights

Seller Signals are foundational structured intelligence.

They may contribute to Seller Insights.

Conceptually:

    seller_signal_id SS100
          +
    seller_signal_id SS101
          ↓
    seller_insight_id SI200

The relationship should be explicitly traceable.

A consuming system should not need to infer this relationship merely because the records share the same `seller_id`.

---

## Relationship to Seller Opportunities

Signals may directly or indirectly identify Seller Opportunities.

Conceptually:

    seller_signal_id
        ↓
    seller_insight_id
        ↓
    seller_opportunity_id

or, where appropriate:

    seller_signal_id
        ↓
    seller_opportunity_id

The architecture should support both patterns.

---

## Relationship to Seller Recommendations

Seller Recommendations may be supported by one or more Seller Signals.

Conceptually:

    seller_signal_ids
        +
    seller_insight_ids
        +
    seller_opportunity_ids
            ↓
    seller_recommendation_id

This relationship is important for Recommendation explainability.

PinkCurve should be able to tell why a Recommendation was generated.

---

## Relationship to Seller Alerts

Some Signals may trigger Alerts.

Conceptually:

    seller_signal_id
        ↓
    threshold / policy
        ↓
    seller_alert_id

A Seller Signal and a Seller Alert should not be treated as the same object.

The Signal represents intelligence.

The Alert represents a notification or attention-required condition derived from that intelligence.

---

## Relationship to Learning Engine

Seller Signals may later become governed evidence for the Learning Engine.

Conceptually:

    Seller Signal
        ↓
    Historical Outcome Evidence
        ↓
    Learning Engine
        ↓
    Improved Models / Learned Outputs
        ↓
    Future Seller Intelligence

This creates a feedback loop without transferring ownership of Seller Signal meaning to the Learning Engine.

---

## Conceptual Seller Signal Contract

A more complete conceptual Seller Signal may therefore contain:

    seller_signal_id

    seller_id

    seller_intelligence_run_id       optional

    seller_signal_schema_version

    signal_category
    signal_type

    subject_type
    subject_id

    related_entity_references        optional

    signal_value
    value_type                       optional
    unit                             optional

    current_value                    optional
    baseline_value                   optional
    change_value                     optional
    change_percentage                optional
    comparison_period                optional

    signal_direction                 optional

    signal_strength
    confidence

    severity                         optional
    priority                         optional

    applicable_context

    observation_start
    observation_end

    source_type
    evidence_references

    analytic_result_ids              optional

    learning_output_id               optional

    model_id                         optional
    model_version_id                 optional

    rule_id                          optional
    rule_version                     optional

    provenance_reference

    generated_at
    updated_at

    valid_from
    valid_until                      optional

    last_validated_at                optional

    freshness_status

    predecessor_signal_id            optional
    superseded_by_signal_id          optional

    intended_consumers

    visibility

    privacy_classification
    sensitivity_classification       optional

    governance_status

    status

Not every Seller Signal requires every field.

The exact schema should depend on Signal type and should be defined during Seller Intelligence Data Design and System Design.

---

## Example

Conceptually:

    seller_signal_id:
        SS-10025

    seller_id:
        S-500

    seller_intelligence_run_id:
        SIR-900

    seller_signal_schema_version:
        2

    signal_category:
        PERFORMANCE

    signal_type:
        OFFERING_QOV_DECLINING

    subject_type:
        OFFERING

    subject_id:
        O-200

    current_value:
        0.41

    baseline_value:
        0.53

    change_percentage:
        -22.6

    signal_direction:
        NEGATIVE

    signal_strength:
        HIGH

    confidence:
        0.91

    observation_start:
        <timestamp>

    observation_end:
        <timestamp>

    source_type:
        DISCOVERY_ANALYTICS

    evidence_references:
        analytic_result_id = AR-700
        analytic_result_id = AR-701

    generated_at:
        <timestamp>

    valid_until:
        <timestamp>

    freshness_status:
        CURRENT

    intended_consumers:
        SELLER_INTELLIGENCE
        SELLER_EXPERIENCE

    visibility:
        SELLER_VISIBLE

    status:
        ACTIVE

This is a structured Seller Signal that can be consumed reliably by PinkCurve products without requiring them to reinterpret raw Discovery data.

---

## Architectural Requirement

Chapter 11 should establish:

> **Seller Signals are stable, identifiable, versioned, contextual, time-aware, traceable, and machine-consumable contracts owned by Seller Intelligence.**

Every important persisted Seller Signal should have:

    seller_signal_id

and should preserve enough information to determine:

- which Seller it concerns;
- what type of Signal it is;
- what entity or subject it concerns;
- what value or condition was observed;
- whether the direction is positive or negative;
- how strong the Signal is;
- how confident Seller Intelligence is;
- what time period produced it;
- what context it applies to;
- what evidence supports it;
- which Analytics, rules, Learning Outputs, or Models contributed to it;
- when it was generated;
- how long it remains valid;
- whether it is fresh;
- whether it supersedes another Signal;
- who may consume it;
- whether it may be shown to the Seller;
- what privacy or sensitivity restrictions apply;
- what its current lifecycle and governance status are.

The exact Seller Signal taxonomy, physical schema, API contract, scoring methods, storage implementation, lifecycle rules, and access policies should be determined during Seller Intelligence Data Design and System Design.

## Seller Signal Data Schema

The following logical schema shows how a Seller Signal connects to its Seller, Seller Intelligence execution, subject entities, supporting evidence, Analytics, Learning Engine outputs, Models, rules, and downstream Seller Intelligence outputs.

```mermaid
erDiagram

    SELLER ||--o{ SELLER_INTELLIGENCE_RUN : evaluated_by
    SELLER ||--o{ SELLER_SIGNAL : owns

    SELLER_INTELLIGENCE_RUN ||--o{ SELLER_SIGNAL : produces

    SELLER_SIGNAL ||--o{ SELLER_SIGNAL_EVIDENCE : supported_by

    SELLER_SIGNAL ||--o{ SELLER_SIGNAL_RELATED_ENTITY : relates_to

    SELLER_SIGNAL ||--o{ SELLER_INSIGHT_SIGNAL : supports
    SELLER_INSIGHT ||--o{ SELLER_INSIGHT_SIGNAL : derived_from

    SELLER_INSIGHT ||--o{ SELLER_OPPORTUNITY_INSIGHT : supports
    SELLER_OPPORTUNITY ||--o{ SELLER_OPPORTUNITY_INSIGHT : derived_from

    SELLER_SIGNAL ||--o{ SELLER_OPPORTUNITY_SIGNAL : supports
    SELLER_OPPORTUNITY ||--o{ SELLER_OPPORTUNITY_SIGNAL : derived_from

    SELLER_OPPORTUNITY ||--o{ SELLER_RECOMMENDATION_OPPORTUNITY : supports
    SELLER_RECOMMENDATION ||--o{ SELLER_RECOMMENDATION_OPPORTUNITY : derived_from

    SELLER_INSIGHT ||--o{ SELLER_RECOMMENDATION_INSIGHT : supports
    SELLER_RECOMMENDATION ||--o{ SELLER_RECOMMENDATION_INSIGHT : derived_from

    SELLER_SIGNAL ||--o{ SELLER_RECOMMENDATION_SIGNAL : supports
    SELLER_RECOMMENDATION ||--o{ SELLER_RECOMMENDATION_SIGNAL : derived_from

    SELLER_SIGNAL ||--o{ SELLER_ALERT_SIGNAL : triggers
    SELLER_ALERT ||--o{ SELLER_ALERT_SIGNAL : derived_from

    SELLER_RECOMMENDATION ||--o{ SELLER_ACTION : results_in
    SELLER_ACTION ||--o{ RECOMMENDATION_OUTCOME : evaluated_by
    SELLER_RECOMMENDATION ||--o{ RECOMMENDATION_OUTCOME : measures

    SELLER_SIGNAL {
        string seller_signal_id PK
        string seller_id FK
        string seller_intelligence_run_id FK

        string seller_signal_schema_version

        string signal_category
        string signal_type

        string subject_type
        string subject_id

        string value_type
        string signal_value
        string unit

        float current_value
        float baseline_value
        float change_value
        float change_percentage

        string signal_direction
        string signal_strength
        float confidence

        string severity
        string priority

        json applicable_context

        datetime observation_start
        datetime observation_end

        string source_type

        datetime generated_at
        datetime updated_at

        datetime valid_from
        datetime valid_until

        datetime last_validated_at

        string freshness_status

        string predecessor_signal_id
        string superseded_by_signal_id

        string visibility

        string privacy_classification
        string sensitivity_classification

        string governance_status
        string status
    }

    SELLER {
        string seller_id PK
    }

    SELLER_INTELLIGENCE_RUN {
        string seller_intelligence_run_id PK
        string seller_id FK

        datetime started_at
        datetime completed_at

        string run_type
        string status

        string provenance_reference
    }

    SELLER_SIGNAL_EVIDENCE {
        string seller_signal_evidence_id PK
        string seller_signal_id FK

        string evidence_type
        string evidence_id

        string contribution_type
        float evidence_weight

        datetime observed_at

        string provenance_reference
    }

    SELLER_SIGNAL_RELATED_ENTITY {
        string seller_signal_related_entity_id PK
        string seller_signal_id FK

        string entity_type
        string entity_id

        string relationship_type
    }

    SELLER_INSIGHT {
        string seller_insight_id PK
        string seller_id FK
        string seller_intelligence_run_id FK

        string insight_type

        string subject_type
        string subject_id

        string summary

        float confidence

        datetime created_at
        datetime valid_until

        string status
        string provenance_reference
    }

    SELLER_INSIGHT_SIGNAL {
        string seller_insight_signal_id PK
        string seller_insight_id FK
        string seller_signal_id FK

        string relationship_type
        float contribution_weight
    }

    SELLER_OPPORTUNITY {
        string seller_opportunity_id PK
        string seller_id FK
        string seller_intelligence_run_id FK

        string opportunity_type

        string subject_type
        string subject_id

        string description

        float estimated_value
        float confidence

        string priority

        datetime created_at
        datetime valid_until

        string status
    }

    SELLER_OPPORTUNITY_SIGNAL {
        string seller_opportunity_signal_id PK
        string seller_opportunity_id FK
        string seller_signal_id FK
    }

    SELLER_OPPORTUNITY_INSIGHT {
        string seller_opportunity_insight_id PK
        string seller_opportunity_id FK
        string seller_insight_id FK
    }

    SELLER_RECOMMENDATION {
        string seller_recommendation_id PK
        string seller_id FK
        string seller_intelligence_run_id FK

        string recommendation_type

        string subject_type
        string subject_id

        string recommendation
        string rationale

        string expected_benefit

        float confidence
        string priority

        datetime created_at
        datetime valid_until

        string governance_status
        string approval_status
        string status
    }

    SELLER_RECOMMENDATION_SIGNAL {
        string seller_recommendation_signal_id PK
        string seller_recommendation_id FK
        string seller_signal_id FK
    }

    SELLER_RECOMMENDATION_INSIGHT {
        string seller_recommendation_insight_id PK
        string seller_recommendation_id FK
        string seller_insight_id FK
    }

    SELLER_RECOMMENDATION_OPPORTUNITY {
        string seller_recommendation_opportunity_id PK
        string seller_recommendation_id FK
        string seller_opportunity_id FK
    }

    SELLER_ALERT {
        string seller_alert_id PK
        string seller_id FK

        string alert_type

        string subject_type
        string subject_id

        string severity
        string message

        datetime detected_at
        datetime valid_until

        string acknowledgement_status
        string resolution_status
    }

    SELLER_ALERT_SIGNAL {
        string seller_alert_signal_id PK
        string seller_alert_id FK
        string seller_signal_id FK
    }

    SELLER_ACTION {
        string seller_action_id PK
        string seller_id FK
        string seller_recommendation_id FK

        string action_type

        string subject_type
        string subject_id

        string action_status

        datetime action_taken_at

        string action_reference
    }

    RECOMMENDATION_OUTCOME {
        string recommendation_outcome_id PK

        string seller_id FK
        string seller_recommendation_id FK
        string seller_action_id FK

        string outcome_type
        string outcome_value

        string before_measurement_reference
        string after_measurement_reference

        float confidence

        datetime evaluated_at

        string provenance_reference
    }


The core of the diagram is this:

```text
Seller
  │
  ↓
Seller Intelligence Run
  │
  ↓
Seller Signal
  │
  ├────────────→ Seller Alert
  │
  ↓
Seller Insight
  │
  ↓
Seller Opportunity
  │
  ↓
Seller Recommendation
  │
  ↓
Seller Action
  │
  ↓
Recommendation Outcome

Seller Signal ───────→ Seller Opportunity

Seller Signal ───────→ Seller Recommendation

Seller Signal ───────→ Seller Alert

Seller Insight ──────→ Seller Recommendation

Discovery Event --------┐
Analytic Result --------┤
QOV Result -------------┤
Offering ---------------┤
Creative ---------------┤
Campaign ---------------┼──→ Seller Signal Evidence
Learning Output --------┤            │
Model Result -----------┤            ↓
Trust Result -----------┤       Seller Signal
Billing Result ---------┘


SELLER_SIGNAL_EVIDENCE
    seller_signal_evidence_id
    seller_signal_id
    evidence_type
    evidence_id

SELLER_INSIGHT_SIGNAL

SELLER_OPPORTUNITY_SIGNAL

SELLER_OPPORTUNITY_INSIGHT

SELLER_RECOMMENDATION_SIGNAL

SELLER_RECOMMENDATION_INSIGHT

SELLER_RECOMMENDATION_OPPORTUNITY

                    SOURCE EVIDENCE
                         │
                         ↓
               SELLER_SIGNAL_EVIDENCE
                         │
                         ↓
                    SELLER_SIGNAL
                    /     |      \
                   /      |       \
                  ↓       ↓        ↓
          SELLER_INSIGHT  |    SELLER_ALERT
                  │       |
                  ↓       |
        SELLER_OPPORTUNITY
                  │
                  ↓
       SELLER_RECOMMENDATION
                  │
                  ↓
            SELLER_ACTION
                  │
                  ↓
      RECOMMENDATION_OUTCOME
                  │
                  ↓
          Analytics / Learning

**Audit Status: Important but requires stronger definition — expand Seller Signal Contract to cover identity, schema version, taxonomy, subject, related entities, values, baselines, direction, strength, confidence, context, observation window, evidence, provenance, Model and rule lineage, lifecycle, consumers, visibility, privacy, and governance.**

---

# 41. Seller Intelligence Lineage — Critical; End-to-End Lineage Required

Seller Intelligence Lineage must extend across the full Seller Intelligence lifecycle.

The current lineage:

    Discovery Events
        ↓
    Metric
        ↓
    Learned Signal
        ↓
    Recommendation
        ↓
    Seller Action
        ↓
    Outcome

captures part of the flow but is incomplete.

Seller Intelligence now produces multiple independently identifiable outputs:

    Seller Signals
    Seller Insights
    Seller Opportunities
    Seller Recommendations
    Seller Alerts
    Seller Reports
    Seller Value Intelligence
    Recommendation Outcome Evidence

Each of these outputs should remain traceable to:

- the Seller;
- the Seller Intelligence execution that produced it where applicable;
- the evidence that supported it;
- the Analytics used;
- the Learning Engine outputs or Models used;
- the preceding Seller Intelligence objects that contributed to it;
- the downstream Seller Intelligence objects derived from it;
- any Seller Action that followed;
- any measurable outcome observed afterward.

Seller Intelligence Lineage should therefore be represented as an explicit network of relationships rather than only a simple linear chain.

Conceptually:

    Seller
        │
        │ seller_id
        ↓
    Source Evidence
        │
        ├── offering_id
        ├── creative_id
        ├── campaign_id
        ├── event_id
        ├── analytic_result_id
        ├── learning_output_id
        ├── model_version_id
        ├── Trust result
        └── Billing reference
        ↓
    Seller Intelligence Run
        │
        │ seller_intelligence_run_id
        ↓
    Seller Signal
        │
        │ seller_signal_id
        ↓
    Seller Insight
        │
        │ seller_insight_id
        ↓
    Seller Opportunity
        │
        │ seller_opportunity_id
        ↓
    Seller Recommendation
        │
        │ seller_recommendation_id
        ↓
    Seller Action
        │
        │ seller_action_id
        ↓
    Recommendation Outcome Evidence
        │
        │ recommendation_outcome_id
        ↓
    Discovery Events / Analytics
        ↓
    Seller Intelligence / Learning Engine

This is the common progression, but the architecture must not require every Seller Intelligence output to follow exactly this path.

Seller Intelligence may also produce relationships such as:

    Seller Signal
        ↓
    Seller Alert

or:

    Seller Signal
        ↓
    Seller Opportunity

or:

    Seller Insight
        ↓
    Seller Recommendation

or:

    Discovery Analytics
        ↓
    Seller Report

or:

    Discovery Analytics
        ↓
    Seller Value Intelligence

Therefore Seller Intelligence Lineage should support a graph of related intelligence objects.

---

## Source Evidence Lineage

Every important Seller Intelligence output should preserve enough information to identify the evidence from which it was derived.

Potential evidence may include:

    event_id

    analytic_result_id

    offering_id

    creative_id

    campaign_id

    metadata_dimension_id
    metadata_value_id

    buyer-related aggregate

    learning_output_id

    model_id
    model_version_id

    rule_id
    rule_version

    Trust result reference

    Billing reference

For example:

    event_id E100
        +
    event_id E101
        +
    analytic_result_id AR500
        ↓
    seller_signal_id SS100

Seller Intelligence should not require every evidence object to be embedded directly in the Seller Signal record.

Instead, evidence relationships may be represented through a logical relationship structure such as:

    seller_intelligence_evidence

with concepts such as:

    seller_intelligence_evidence_id

    target_entity_type
    target_entity_id

    evidence_type
    evidence_id

    contribution_type

    evidence_weight            optional

    observed_at

    provenance_reference

The exact physical implementation may use relationship tables, lineage metadata, analytical references, or another suitable mechanism.

The important requirement is that lineage remain queryable and reconstructable.

---

## Seller Signal Lineage

A Seller Signal should preserve:

    seller_signal_id

    seller_id

    seller_intelligence_run_id      where applicable

and references to the evidence that produced it.

Conceptually:

    Source Evidence
        ↓
    Seller Intelligence
        ↓
    seller_signal_id

PinkCurve should be able to answer:

> What evidence caused this Seller Signal to be generated?

For example:

    analytic_result_id = AR700
    analytic_result_id = AR701
        ↓
    seller_signal_id = SS200
        ↓
    OFFERING_QOV_DECLINING

If a rule or model contributed to the Signal, lineage should also preserve:

    rule_id
    rule_version

or:

    learning_output_id

    model_id
    model_version_id

where applicable.

---

## Seller Insight Lineage

A Seller Insight may be derived from:

- one Seller Signal;
- multiple Seller Signals;
- Analytics directly;
- Learning Engine outputs;
- other Seller Intelligence evidence.

Conceptually:

    seller_signal_id SS100
        +
    seller_signal_id SS101
        +
    analytic_result_id AR200
        ↓
    seller_insight_id SI300

The Insight should preserve explicit relationships to its supporting Signals and Analytics.

PinkCurve should be able to answer:

> Which Seller Signals and Analytics produced this Insight?

This relationship should not be inferred merely because records belong to the same Seller.

---

## Seller Opportunity Lineage

A Seller Opportunity may be derived from:

    Seller Signals

    Seller Insights

    Analytics

    QOV trends

    Creative performance

    Campaign performance

    Buyer-response patterns

    Learning Outputs

Conceptually:

    seller_insight_id SI300
        +
    seller_signal_id SS102
        ↓
    seller_opportunity_id SO400

PinkCurve should be able to answer:

> Why did Seller Intelligence determine that this Opportunity exists?

The Opportunity should therefore preserve explicit references to the intelligence that supported it.

---

## Seller Recommendation Lineage

Seller Recommendations require particularly strong lineage because they suggest Seller action.

A Recommendation may be supported by:

    seller_signal_ids

    seller_insight_ids

    seller_opportunity_ids

    analytic_result_ids

    learning_output_id

    model_id
    model_version_id

    rule_id
    rule_version

Conceptually:

    seller_signal_id SS100
        +
    seller_insight_id SI300
        +
    seller_opportunity_id SO400
        ↓
    seller_recommendation_id SR500

PinkCurve should be able to answer:

> Why was this Recommendation generated?

> Which evidence supported it?

> Which model or rule contributed?

> Which Seller Opportunity was it intended to address?

This is important for:

- Seller Trust;
- explainability;
- Customer Support;
- debugging;
- Recommendation evaluation;
- Learning Engine feedback.

---

## Seller Alert Lineage

Seller Alerts may be generated directly from:

    Seller Signals

    Analytics

    Trust conditions

    threshold rules

    anomaly results

Conceptually:

    seller_signal_id SS200
        ↓
    Alert Rule
        ↓
    seller_alert_id SA300

The Alert should preserve the triggering Signal, rule, or evidence.

PinkCurve should be able to determine:

> What condition caused this Alert?

An Alert should not exist as an isolated notification with no traceable basis.

---

## Seller Report Lineage

Seller Reports may aggregate multiple Seller Intelligence outputs and Analytics.

Conceptually:

    Seller Signals
        +
    Seller Insights
        +
    Seller Opportunities
        +
    Seller Recommendations
        +
    Seller Value Intelligence
        +
    Discovery Analytics
        ↓
    seller_report_id

A Seller Report should preserve references to the underlying Seller Intelligence outputs and Analytical Results used to generate it.

The Report should not become a disconnected copy of data that cannot be reconciled to its authoritative source.

---

## Seller Value Intelligence Lineage

Seller Value Intelligence requires strong lineage because it may be used to explain PinkCurve value to Sellers.

Potential source evidence may include:

    QOV results

    Discovery exposure

    qualified Buyer engagement

    click-through activity

    Campaign performance

    Creative performance

    Seller cost

    Billing records

    other Seller performance Analytics

Conceptually:

    Discovery Events
        ↓
    Discovery Analytics
        │
        │ analytic_result_id
        ↓
    Seller Value Calculation
        ↓
    seller_value_intelligence_id

Seller Value Intelligence should preserve:

    methodology_version

    analytic_result_ids

    measurement_period

    relevant Seller identifiers

    relevant Offering / Campaign / Creative identifiers

    calculation provenance

This allows PinkCurve to answer:

> How was this Seller Value assessment calculated?

Seller Value Intelligence should remain analytically traceable without becoming the authoritative Billing record.

---

## Seller Action Lineage

When a Seller acts on a Recommendation, the action should be independently identifiable where important.

Conceptually:

    seller_recommendation_id
        ↓
    Seller performs action
        ↓
    seller_action_id

The Seller Action should preserve:

    seller_id

    seller_recommendation_id

    action_type

    subject_type
    subject_id

    action_status

    action_taken_at

This allows PinkCurve to distinguish:

    Recommendation delivered

from:

    Recommendation acknowledged

from:

    Recommendation accepted

from:

    actual Seller action performed

These are different events.

---

## Recommendation Outcome Lineage

Recommendation Outcome Evidence completes the Seller Intelligence feedback loop.

Conceptually:

    seller_recommendation_id
        ↓
    seller_action_id
        ↓
    Subsequent Discovery Events
        ↓
    Discovery Analytics
        ↓
    recommendation_outcome_id

The outcome should preserve references to:

    seller_recommendation_id

    seller_action_id

    resulting_event_ids

    resulting_analytic_result_ids

    before_measurement_reference

    after_measurement_reference

    outcome_type

    outcome_value

    confidence

    evaluated_at

    provenance_reference

PinkCurve should be able to answer:

> Did the Seller act on the Recommendation?

> What changed afterward?

> Was the Recommendation beneficial?

> How confident are we that the Recommendation contributed to the outcome?

---

## Lineage to Learning Engine

Recommendation Outcomes and other Seller Intelligence results may become evidence for Learning Engine.

Conceptually:

    Seller Recommendation
        ↓
    Seller Action
        ↓
    Recommendation Outcome
        ↓
    Historical Evidence
        ↓
    Learning Engine
        ↓
    Improved Model / Learned Output
        ↓
    Future Seller Intelligence

This closes the Seller Intelligence learning loop.

The relationship should preserve:

    recommendation_outcome_id

    learning_objective_id

    learning_run_id

    learning_output_id

where applicable.

---

## Lineage to AI Platform

If Seller Intelligence uses AI Platform services, the technical lineage should remain traceable.

Conceptually:

    Seller Intelligence
        ↓
    ai_service_id
        ↓
    inference_id
        ↓
    model_version_id
        ↓
    technical model result
        ↓
    Seller Intelligence
        ↓
    seller_signal_id / seller_insight_id / other output

This allows PinkCurve to determine which technical AI execution contributed to a Seller Intelligence output.

However, AI Platform remains responsible only for technical execution.

Seller Intelligence owns the meaning of the Seller Intelligence output.

---

## Lineage to Discovery Analytics

Seller Intelligence should consume Analytical Results without redefining them.

Conceptually:

    event_id
        ↓
    Discovery Analytics
        ↓
    analytic_id
        ↓
    analytic_version
        ↓
    analytic_result_id
        ↓
    Seller Intelligence
        ↓
    Seller Signal / Insight / Opportunity /
    Recommendation / Value Intelligence

This creates clear ownership:

    Discovery Analytics
        → owns the metric and Analytical Result

    Seller Intelligence
        → owns the Seller interpretation

---

## Lineage Relationships Should Be Explicit

Seller Intelligence relationships should not be inferred only from:

    seller_id

    timestamps

    similar subject identifiers

For example, knowing that:

    seller_signal_id SS100
    seller_insight_id SI200

both belong to:

    seller_id S500

does not prove that SS100 contributed to SI200.

PinkCurve should preserve explicit relationships such as:

    seller_signal_id
        --SUPPORTS→
    seller_insight_id

    seller_signal_id
        --SUPPORTS→
    seller_opportunity_id

    seller_insight_id
        --SUPPORTS→
    seller_opportunity_id

    seller_opportunity_id
        --SUPPORTS→
    seller_recommendation_id

    seller_signal_id
        --TRIGGERS→
    seller_alert_id

    seller_recommendation_id
        --RESULTED_IN→
    seller_action_id

    seller_action_id
        --EVALUATED_BY→
    recommendation_outcome_id

These relationships provide semantic lineage.

---

## Seller Intelligence Lineage Relationship Model

PinkCurve may consider a general logical lineage relationship capable of representing Seller Intelligence connections.

Conceptually:

    seller_intelligence_lineage_id

    source_entity_type
    source_entity_id

    relationship_type

    target_entity_type
    target_entity_id

    seller_id

    seller_intelligence_run_id      optional

    created_at

    provenance_reference

Potential relationship types may include:

    DERIVED_FROM

    SUPPORTED_BY

    PRODUCED

    IDENTIFIED

    TRIGGERED

    RECOMMENDED_FOR

    RESULTED_IN

    EVALUATED_BY

    SUPERSEDES

    CONTRIBUTED_TO

For example:

    SS100
        --SUPPORTED_BY→
    AR500

    SS100
        --SUPPORTS→
    SI200

    SI200
        --IDENTIFIED→
    SO300

    SO300
        --SUPPORTED→
    SR400

    SR400
        --RESULTED_IN→
    SA500

    SA500
        --EVALUATED_BY→
    RO600

The exact physical implementation may use:

- foreign keys;
- relationship tables;
- lineage tables;
- event records;
- analytical metadata;
- graph structures;
- another suitable design.

Chapter 11 should define the relationship requirement without mandating the final storage implementation.

---

## End-to-End Seller Intelligence Lineage

The complete conceptual lineage may therefore be:

    Seller
        │
        │ seller_id
        ↓
    Authoritative Source Data
        │
        ├── offering_id
        ├── creative_id
        ├── campaign_id
        ├── metadata identifiers
        └── other Seller data
        ↓
    Discovery Activity
        │
        │ event_id
        ↓
    Discovery Analytics
        │
        ├── analytic_id
        ├── analytic_version
        └── analytic_result_id
        ↓
    Learning Engine / AI Platform
        │
        ├── learning_output_id
        ├── model_version_id
        └── inference_id
        ↓
    Seller Intelligence Run
        │
        │ seller_intelligence_run_id
        ↓
    Seller Signal
        │
        │ seller_signal_id
        ↓
    Seller Insight
        │
        │ seller_insight_id
        ↓
    Seller Opportunity
        │
        │ seller_opportunity_id
        ↓
    Seller Recommendation
        │
        │ seller_recommendation_id
        ↓
    Seller Action
        │
        │ seller_action_id
        ↓
    Subsequent Discovery Events
        │
        │ event_id
        ↓
    Discovery Analytics
        │
        │ analytic_result_id
        ↓
    Recommendation Outcome
        │
        │ recommendation_outcome_id
        ↓
    Seller Intelligence / Learning Engine

Additional branches may produce:

    Seller Alert

    Seller Report

    Seller Value Intelligence

at appropriate stages.

---

## Lineage Query Requirements

Seller Intelligence Lineage should eventually allow PinkCurve to answer questions such as:

> What evidence produced this Seller Signal?

> Which Seller Signals contributed to this Seller Insight?

> Which Insights and Signals identified this Seller Opportunity?

> Why was this Seller Recommendation generated?

> Which model, rule, or Learning Output contributed to the Recommendation?

> Did the Seller act on it?

> What Seller Action occurred?

> Which Discovery Events happened afterward?

> Which Analytics measured the outcome?

> Did the Recommendation improve Seller value?

> Which Seller Intelligence outputs depend on a particular Analytic or Model Version?

> If a Model Version is found to be defective, which Seller Recommendations may have been affected?

These queries demonstrate why Seller Intelligence Lineage is an architectural requirement rather than optional metadata.

---

## Architectural Requirement

Chapter 11 should establish:

> **Seller Intelligence Lineage must explicitly connect authoritative source data, Discovery Events, Analytical Results, Learning Engine outputs, AI model executions, Seller Signals, Seller Insights, Seller Opportunities, Seller Recommendations, Seller Alerts, Seller Reports, Seller Value Intelligence, Seller Actions, and Recommendation Outcome Evidence.**

Lineage should support both:

    backward traceability
        → Why did PinkCurve produce this Seller Intelligence output?

and:

    forward impact analysis
        → What later intelligence, recommendation, action, or outcome depended on this evidence?

Important lineage relationships should be:

- explicit;
- identifiable;
- queryable;
- version-aware;
- provenance-aware;
- durable enough to support auditing and debugging.

The exact physical lineage-storage implementation should be determined during Seller Intelligence Data Design and System Design.

**Audit Status: Critical expansion required — Seller Intelligence Lineage should provide end-to-end backward traceability and forward impact analysis across evidence, Analytics, learning, Seller Intelligence outputs, Seller actions, and measurable outcomes.**

---

# 42. Trust & Safety Data — Strong Foundation; Significant Expansion Required

Trust & Safety Data is foundational to PinkCurve because Trust decisions affect:

- Seller registration;
- Buyer registration;
- Offering approval;
- Seller eligibility;
- Offering eligibility;
- Buyer protection;
- fraud prevention;
- bot prevention;
- abuse handling;
- Reviews and Ratings;
- Billing protection;
- Customer Support;
- platform security;
- legal and operational risk.

The current Trust & Safety domain correctly identifies concepts such as:

    seller_verifications
    buyer_verifications
    organization_verifications
    offering_verifications

    trust_signals
    risk_scores

    fraud_cases
    abuse_reports
    bot_signals

    moderation_actions
    security_events

However, these concepts need stronger identification, relationships, evidence, lifecycle, lineage, and access-control definitions.

Trust & Safety should not be represented as one generic risk record.

PinkCurve should explicitly distinguish:

    Verification

    Trust Signal

    Technical Risk Result

    Trust Evaluation

    Trust Decision

    Fraud / Abuse Case

    Moderation Action

    Security Event

These are different data objects with different responsibilities and lifecycles.

---

## Trust & Safety Ownership

Trust & Safety should be authoritative for:

    verification state

    Trust decisions

    fraud case status

    abuse case status

    moderation decisions

    restrictions

    escalation

    Trust-related approval or rejection

    enforcement actions

AI Platform, Discovery Analytics, Buyer Intelligence, Seller Intelligence, and other products may provide evidence or technical Signals.

However:

> **Trust & Safety owns the interpretation of Trust evidence and the resulting Trust decisions and actions.**

This follows the broader PinkCurve architectural principle:

> **PinkCurve products own product decisions and business behavior.**

---

## Verification Identification

Every independently tracked verification should have a stable identifier.

Potential identifiers include:

    seller_verification_id

    buyer_verification_id

    organization_verification_id

    offering_verification_id

These identifiers allow PinkCurve to reference individual verification processes independently.

For example:

    seller_id
        ↓
    seller_verification_id

or:

    offering_id
        ↓
    offering_verification_id

One Seller or Offering may undergo multiple verification attempts or reviews over time.

Therefore:

    seller_id
        ↓
    0..N seller_verification_id

and:

    offering_id
        ↓
    0..N offering_verification_id

This preserves verification history rather than overwriting prior verification evidence.

---

## Seller Verification

A conceptual Seller Verification record may include:

    seller_verification_id

    seller_id

    verification_type

    verification_method

    verification_status

    submitted_at

    evaluated_at

    verified_at

    expires_at                 optional

    reviewer_type

    reviewer_id                where appropriate

    evidence_references

    risk_score_id              optional

    trust_decision_id          optional

    failure_reason             optional

    escalation_status

    provenance_reference

    created_at
    updated_at

Potential verification types may include:

    identity verification

    email verification

    phone verification

    business verification

    payment-related verification

    account-risk verification

The exact verification policies belong in Trust & Safety and Verification System Design.

---

## Buyer Verification

A conceptual Buyer Verification record may include:

    buyer_verification_id

    buyer_id

    verification_type

    verification_method

    verification_status

    submitted_at

    evaluated_at

    verified_at

    expires_at                 optional

    evidence_references

    risk_score_id              optional

    trust_decision_id          optional

    failure_reason             optional

    provenance_reference

The exact Buyer verification requirements may differ from Seller verification.

Buyer verification should remain proportional to the Trust and abuse risks PinkCurve is trying to control.

---

## Offering Verification

Offering Verification should have a stable:

    offering_verification_id

A conceptual record may include:

    offering_verification_id

    offering_id
    seller_id

    verification_type

    verification_status

    source_data_reference

    evidence_references

    policy_version

    risk_score_id              optional

    trust_decision_id          optional

    reviewer_type

    reviewer_id                where applicable

    submitted_at

    evaluated_at

    approved_at                optional

    rejected_at                optional

    expiration_at              optional

    rejection_reason           optional

    provenance_reference

Offering Verification may consider:

- Offering identity;
- Seller identity;
- Offering source URL;
- Offering Knowledge;
- prohibited or restricted content;
- misleading claims;
- scam indicators;
- duplicate or copied Offerings;
- suspicious pricing;
- Seller history;
- Trust Signals;
- AI risk results;
- human review.

The exact policy belongs in the future Verification and Approval architecture.

---

## Trust Signal Identity

Trust Signals should be independently identifiable.

Each important persisted Trust Signal should have:

    trust_signal_id

A conceptual Trust Signal may include:

    trust_signal_id

    subject_type
    subject_id

    signal_type

    signal_value

    signal_direction

    signal_strength

    confidence

    severity

    source_type

    evidence_references

    model_id                  optional
    model_version_id          optional

    rule_id                   optional
    rule_version              optional

    observed_at

    generated_at

    valid_from
    valid_until               optional

    freshness_status

    provenance_reference

    status

Potential subjects may include:

    SELLER

    BUYER

    OFFERING

    REVIEW

    RATING

    CAMPAIGN

    BILLING_EVENT

    SESSION

    DEVICE

    SECURITY_EVENT

Trust Signals should be structured and machine-consumable.

---

## Technical Risk Results

AI Platform or rules may produce technical risk results.

These should be independently identifiable where important.

PinkCurve may consider:

    risk_score_id

A conceptual Risk Score record may include:

    risk_score_id

    subject_type
    subject_id

    risk_type

    score

    score_scale

    confidence

    model_id                  optional
    model_version_id          optional

    rule_id                   optional
    rule_version              optional

    source_evidence_reference

    generated_at

    valid_until               optional

    status

A technical risk score is evidence.

It is not itself a Trust decision.

---

## Trust Evaluation

Trust & Safety may combine:

    Trust Signals

    Risk Scores

    Verification evidence

    account history

    Seller history

    Buyer history

    Offering evidence

    fraud evidence

    abuse evidence

    human review

into a Trust evaluation.

Where independently tracked, PinkCurve should consider:

    trust_evaluation_id

Conceptually:

    Evidence
        ↓
    Trust Evaluation
        │
        │ trust_evaluation_id
        ↓
    Trust Decision

A conceptual Trust Evaluation may include:

    trust_evaluation_id

    subject_type
    subject_id

    evaluation_type

    trust_signal_ids

    risk_score_ids

    verification_ids

    policy_version

    reviewer_type

    reviewer_id

    evaluation_result

    rationale

    evaluated_at

    provenance_reference

This separates technical evidence gathering from final Trust policy decisions.

---

## Trust Decision Identity

Every important Trust decision should have a stable:

    trust_decision_id

A conceptual Trust Decision may include:

    trust_decision_id

    subject_type
    subject_id

    trust_evaluation_id

    decision_type

    decision

    decision_reason

    policy_id
    policy_version

    reviewer_type

    reviewer_id             where appropriate

    effective_from

    effective_until          optional

    decision_status

    created_at

    updated_at

    provenance_reference

Potential decisions may include:

    APPROVED

    REJECTED

    REQUIRES_REVIEW

    RESTRICTED

    SUSPENDED

    BLOCKED

    VERIFIED

    UNVERIFIED

    MONITOR

The exact vocabulary should be defined during Trust & Safety System Design.

---

## Trust Decision vs Technical Risk Result

The architectural distinction must remain explicit:

    AI Platform / Rule Engine
        ↓
    Technical Risk Result
        │
        │ risk_score_id
        ↓
    Trust & Safety
        ↓
    Trust Evaluation
        │
        │ trust_evaluation_id
        ↓
    Trust Decision
        │
        │ trust_decision_id

Therefore:

> **A risk score does not automatically authorize or deny a Seller, Buyer, Offering, Review, or Billing event.**

Trust & Safety owns the final Trust interpretation.

---

## Fraud Case Identity

Fraud investigations should have stable:

    fraud_case_id

A conceptual Fraud Case may include:

    fraud_case_id

    subject_type
    subject_id

    case_type

    case_status

    severity

    detection_source

    trust_signal_ids

    risk_score_ids

    related_event_ids

    related_seller_id        optional
    related_buyer_id         optional
    related_offering_id      optional

    opened_at

    assigned_to

    investigation_notes_reference

    resolution

    resolved_at

    trust_decision_id        optional

    provenance_reference

One Fraud Case may involve multiple entities.

For example:

    Seller
      +
    Offering
      +
    Discovery Events
      +
    Billing Events

may all participate in the same fraud investigation.

---

## Abuse Report Identity

Every independently tracked abuse report should have:

    abuse_report_id

A conceptual Abuse Report may include:

    abuse_report_id

    reporter_type
    reporter_id              where permitted

    subject_type
    subject_id

    report_type

    report_description

    evidence_references

    severity

    submitted_at

    moderation_case_id       optional

    fraud_case_id            optional

    status

    resolution

    resolved_at

    provenance_reference

Abuse reports may originate from:

- Buyers;
- Sellers;
- Customer Support;
- automated systems;
- moderators;
- security systems.

---

## Bot Signal Identity

Bot detection Signals should have:

    bot_signal_id

where independently persisted.

A conceptual Bot Signal may include:

    bot_signal_id

    subject_type
    subject_id

    session_id               optional
    buyer_id                 optional

    signal_type

    score

    confidence

    source_type

    evidence_references

    model_id                 optional
    model_version_id         optional

    rule_id                  optional
    rule_version             optional

    generated_at

    valid_until              optional

    status

Bot Signals may contribute to:

- Trust evaluation;
- QOV exclusion;
- Billing qualification;
- fraud investigation;
- account restriction.

However, Bot Signals should remain Trust evidence rather than financial decisions.

---

## Moderation Case and Moderation Action Identity

Trust & Safety should distinguish a moderation case from individual moderation actions.

PinkCurve may consider:

    moderation_case_id

and:

    moderation_action_id

A Moderation Case may include:

    moderation_case_id

    subject_type
    subject_id

    case_reason

    source_reference

    assigned_to

    opened_at

    status

    resolved_at

A Moderation Action may include:

    moderation_action_id

    moderation_case_id

    action_type

    action_reason

    performed_by

    performed_at

    effective_from

    effective_until          optional

Potential actions may include:

    WARN

    HIDE

    REMOVE

    RESTRICT

    SUSPEND

    REQUIRE_REVIEW

    RESTORE

    ESCALATE

Moderation actions should remain auditable.

---

## Security Event Identity

Security Events should have stable:

    security_event_id

A conceptual Security Event may include:

    security_event_id

    event_type

    severity

    subject_type
    subject_id

    actor_type
    actor_id                 where known

    source_system

    source_ip_reference      where appropriate

    device_reference         where appropriate

    occurred_at

    detected_at

    evidence_reference

    investigation_status

    incident_id              optional

Security Events may include:

- suspicious login;
- repeated authentication failure;
- account takeover indication;
- unusual device activity;
- suspicious API behavior;
- permission violation;
- credential abuse;
- security-policy violation.

Sensitive security details should receive highly restricted access.

---

## Security Incident Identity

Where multiple Security Events form one incident, PinkCurve should consider:

    security_incident_id

Conceptually:

    security_event_id
        +
    security_event_id
        +
    security_event_id
        ↓
    security_incident_id

A Security Incident may include:

    security_incident_id

    incident_type

    severity

    affected_subjects

    related_security_event_ids

    detected_at

    opened_at

    incident_status

    response_actions

    resolved_at

    root_cause_reference

    provenance_reference

This enables coordinated incident response rather than treating every Security Event independently.

---

## Trust Evidence Relationships

Trust decisions may depend on many pieces of evidence.

PinkCurve should therefore support logical Trust evidence relationships.

For example:

    trust_signal_id
        ↓
    trust_evaluation_id

    risk_score_id
        ↓
    trust_evaluation_id

    verification_id
        ↓
    trust_evaluation_id

    fraud_case_id
        ↓
    trust_decision_id

The relationship may be many-to-many.

PinkCurve may consider a logical structure such as:

    trust_evidence_relationship

with fields such as:

    trust_evidence_relationship_id

    target_type
    target_id

    evidence_type
    evidence_id

    contribution_type

    evidence_weight          optional

    created_at

    provenance_reference

The exact physical implementation belongs in later Data Design.

---

## Trust & Safety Lineage

Trust & Safety should provide end-to-end traceability.

Conceptually:

    Source Evidence
        │
        ├── event_id
        ├── seller_id
        ├── buyer_id
        ├── offering_id
        ├── review_id
        ├── rating_id
        ├── security_event_id
        └── other evidence
        ↓
    Trust Signal
        │
        │ trust_signal_id
        ↓
    Technical Risk Result
        │
        │ risk_score_id
        ↓
    Trust Evaluation
        │
        │ trust_evaluation_id
        ↓
    Trust Decision
        │
        │ trust_decision_id
        ↓
    Verification /
    Restriction /
    Moderation /
    Fraud Case /
    Enforcement Action

PinkCurve should be able to answer:

> What evidence produced this Trust Signal?

> Which Risk Score was used?

> Which policy version applied?

> Why was this Seller rejected?

> Why was this Offering restricted?

> Why was this Buyer account reviewed?

> Which human or system made the decision?

> What happened afterward?

---

## Trust Policy Versioning

Trust decisions depend on policy.

Therefore important Trust decisions should preserve:

    policy_id

    policy_version

This is critical because Trust policies may evolve.

A Seller rejected under Policy Version 2 should not later be interpreted as though Policy Version 5 was used.

Historical Trust decisions should preserve the policy under which they were made.

---

## Verification Lifecycle

Verification state should support lifecycle.

For example:

    SUBMITTED
        ↓
    PENDING
        ↓
    UNDER_REVIEW
        ↓
    VERIFIED

or:

    SUBMITTED
        ↓
    REJECTED

or:

    VERIFIED
        ↓
    EXPIRED
        ↓
    REVERIFICATION_REQUIRED

Verification status should therefore include:

    created_at

    submitted_at

    evaluated_at

    verified_at

    expires_at

    updated_at

    status

This is especially important if verification must periodically be renewed.

---

## Trust Decision Lifecycle

Trust Decisions may also change over time.

Conceptually:

    APPROVED
        ↓
    NEW EVIDENCE
        ↓
    REVIEW
        ↓
    RESTRICTED

or:

    RESTRICTED
        ↓
    APPEAL / REVIEW
        ↓
    RESTORED

Therefore Trust data should preserve historical decisions rather than overwriting them without history.

Potential relationships may include:

    predecessor_trust_decision_id

    superseded_by_trust_decision_id

This allows PinkCurve to reconstruct Trust history.

---

## Human-in-the-Loop Review

Trust & Safety should explicitly support both automated and human evaluation.

Potential reviewer information may include:

    reviewer_type

with values such as:

    AUTOMATED

    HUMAN

    HYBRID

and where appropriate:

    reviewer_id

This allows PinkCurve to distinguish:

    model-generated risk result

from:

    automated policy decision

from:

    human-reviewed decision

from:

    hybrid decision.

This is important for auditability and escalation.

---

## Appeals and Reconsideration

Where PinkCurve allows Seller or Buyer appeal or reconsideration of Trust decisions, the architecture may require:

    appeal_id

A conceptual Appeal record may include:

    appeal_id

    subject_type
    subject_id

    trust_decision_id

    submitted_at

    appeal_reason

    supporting_evidence

    review_status

    reviewer_id

    appeal_outcome

    resolved_at

This may be deferred until the detailed Trust & Safety and Customer Support workflows are designed.

However, Data Architecture should leave room for decision review and reversal.

---

## Trust & Safety Relationship to Discovery Analytics

Trust & Safety may contribute filtering evidence to Discovery Analytics.

For example:

    bot_signal_id
        ↓
    Discovery Analytics

or:

    fraud_case result
        ↓
    QOV qualification

However:

> **Trust & Safety owns the bot/fraud determination. Discovery Analytics owns how qualified analytical metrics use that determination.**

The boundary should remain explicit.

---

## Trust & Safety Relationship to Billing

Billing may consume Trust & Safety outputs to exclude:

- bot activity;
- fraudulent activity;
- invalid events;
- abusive activity.

Conceptually:

    Discovery Event
        ↓
    Trust & Safety
        ↓
    Trust / Fraud Qualification Evidence
        ↓
    Billing Qualification
        ↓
    Billable Event

Trust & Safety does not create the final financial charge.

Billing owns:

    billable_event_id

    invoice_item_id

    invoice_id

This prevents Trust evaluation and financial decision-making from becoming coupled.

---

## Trust & Safety Relationship to Reviews and Ratings

Reviews and Ratings may generate Trust evidence.

Conceptually:

    review_id / rating_id
        ↓
    Trust Signals
        ↓
    Moderation / Fraud Evaluation
        ↓
    Review Status

Trust & Safety may determine whether a Review or Rating should be:

    ACTIVE

    FLAGGED

    HIDDEN

    REMOVED

    UNDER_REVIEW

The Review or Rating remains the Buyer-generated record.

Trust & Safety owns the moderation state and Trust decision.

---

## Trust & Safety Relationship to AI Platform

AI Platform may provide technical capabilities such as:

    fraud model

    anomaly model

    bot detection model

    classification model

These may produce:

    risk_score_id

    classification

    anomaly score

However:

    AI Platform
        ↓
    Technical Result
        ↓
    Trust & Safety
        ↓
    Trust Evaluation
        ↓
    Trust Decision

This architectural boundary should remain explicit.

---

## Trust & Safety Relationship to Learning Engine

Learning Engine may create or improve:

- fraud models;
- anomaly models;
- bot-detection models;
- moderation-support models.

Conceptually:

    Historical Trust Evidence
        ↓
    Learning Engine
        ↓
    learning_output_id
        ↓
    model_id / model_version_id
        ↓
    AI Platform
        ↓
    Technical Risk Result
        ↓
    Trust & Safety
        ↓
    Trust Decision

Learning Engine improves technical intelligence.

Trust & Safety retains ownership of Trust policy and decisions.

---

## Sensitive Data Classification

Trust & Safety contains some of PinkCurve's most sensitive data.

Potential highly sensitive data includes:

- identity-verification evidence;
- fraud evidence;
- security logs;
- account-risk information;
- IP-related evidence;
- internal investigation notes;
- moderation evidence;
- restricted Trust Signals;
- enforcement rationale.

Data Architecture should require stronger classification and protection.

Potential classifications may include:

    CONFIDENTIAL

    RESTRICTED

    SECURITY_RESTRICTED

The final classification scheme should remain consistent with PinkCurve's overall Data Classification architecture.

---

## Access Control

Trust & Safety data should follow strict least-privilege access.

Not every PinkCurve product should receive raw Trust evidence.

For example:

    AI Discovery
        may need:
            Offering eligibility = TRUE / FALSE

    but should not necessarily receive:
            identity documents
            fraud-investigation notes
            security evidence

Likewise:

    Seller Experience
        may receive:
            verification status

    but should not receive:
            internal fraud model details
            security investigation evidence

Therefore Trust & Safety should expose **appropriate Trust outputs**, not unrestricted access to raw Trust data.

---

## Evidence Storage

Sensitive evidence may need to be stored separately from ordinary Trust metadata.

For example:

    Trust Record
        ↓
    evidence_reference
        ↓
    Restricted Evidence Storage

This may include:

- uploaded verification documents;
- investigation attachments;
- screenshots;
- external verification evidence;
- security artifacts.

The relational Trust record should generally store secure references rather than duplicating sensitive binary evidence.

---

## Retention

Trust & Safety data requires domain-specific retention rules.

Different retention may apply to:

    verification evidence

    fraud cases

    abuse reports

    security events

    moderation actions

    Trust decisions

    appeals

Some evidence may need longer retention for:

- fraud prevention;
- legal defense;
- dispute resolution;
- security investigation;
- financial reconciliation.

Other sensitive information should be deleted when no longer necessary.

Retention should therefore be explicit and purpose-driven.

---

## Trust & Safety Data Schema Overview

The logical Trust & Safety architecture may include:

    SELLER_VERIFICATION
        seller_verification_id

    BUYER_VERIFICATION
        buyer_verification_id

    ORGANIZATION_VERIFICATION
        organization_verification_id

    OFFERING_VERIFICATION
        offering_verification_id

    TRUST_SIGNAL
        trust_signal_id

    RISK_SCORE
        risk_score_id

    TRUST_EVALUATION
        trust_evaluation_id

    TRUST_DECISION
        trust_decision_id

    FRAUD_CASE
        fraud_case_id

    ABUSE_REPORT
        abuse_report_id

    BOT_SIGNAL
        bot_signal_id

    MODERATION_CASE
        moderation_case_id

    MODERATION_ACTION
        moderation_action_id

    SECURITY_EVENT
        security_event_id

    SECURITY_INCIDENT
        security_incident_id

    APPEAL
        appeal_id              where supported

These entities may be related through explicit evidence and lineage relationships.

---

## Conceptual Trust & Safety Data Flow

Conceptually:

    Seller / Buyer / Offering /
    Review / Rating / Event /
    Security Activity
            ↓
        Source Evidence
            ↓
        Trust Signals
        trust_signal_id
            ↓
        Risk Analysis
        risk_score_id
            ↓
        Trust Evaluation
        trust_evaluation_id
            ↓
        Trust Decision
        trust_decision_id
            ↓
    ┌───────────┼─────────────┐
    ↓           ↓             ↓
Verification  Moderation   Fraud Case
    │           │             │
    ↓           ↓             ↓
Product      Enforcement    Investigation
Eligibility    Action

---

## Verification and Trust Signal Relationships

Verification records should be explicitly connected to the Trust Signals, Risk Results, evidence, evaluations, and Trust Decisions that support the verification process.

A verification should not exist as an isolated status record.

For example, Offering Verification may evaluate evidence concerning:

    Offering identity
    Seller identity
    Offering source
    Offering content
    Offering URL
    suspicious pricing
    prohibited content
    misleading claims
    duplication
    fraud indicators
    Seller Trust history

These observations may produce multiple Trust Signals.

Conceptually:

    offering_id
        ↓
    offering_verification_id
        ↓
    Source Evidence
        ↓
    Trust Signals
        ├── trust_signal_id TS101
        ├── trust_signal_id TS102
        └── trust_signal_id TS103
        ↓
    Risk Results
        ├── risk_score_id RS201
        └── risk_score_id RS202
        ↓
    Trust Evaluation
        │
        │ trust_evaluation_id TE301
        ↓
    Trust Decision
        │
        │ trust_decision_id TD401
        ↓
    Offering Verification Result

The same principle applies to:

    seller_verification_id

    buyer_verification_id

    organization_verification_id

    offering_verification_id

---

## Verification Trust Signal Relationship

Because one Verification may depend on multiple Trust Signals, and Trust Signals may participate in multiple Trust evaluations, PinkCurve should support an explicit relationship rather than placing a single `trust_signal_id` directly in every Verification record.

A conceptual relationship may be:

    VERIFICATION_TRUST_SIGNAL

        verification_trust_signal_id

        verification_type
        verification_id

        trust_signal_id

        relationship_type

        contribution_type

        evidence_weight          optional

        created_at

This allows:

    offering_verification_id OV100
        │
        ├── trust_signal_id TS101
        ├── trust_signal_id TS102
        └── trust_signal_id TS103

or:

    seller_verification_id SV200
        │
        ├── trust_signal_id TS201
        ├── trust_signal_id TS202
        └── trust_signal_id TS203

The exact physical implementation may instead use domain-specific relationship tables such as:

    offering_verification_trust_signals

    seller_verification_trust_signals

    buyer_verification_trust_signals

    organization_verification_trust_signals

The choice between a generalized relationship structure and separate physical tables should be determined during Trust & Safety Data Design.

The important architectural requirement is that the relationship be explicit and queryable.

---

## Offering Verification Example

For example:

    offering_id = O100
        ↓
    offering_verification_id = OV500
        │
        ├── trust_signal_id = TS100
        │       OFFERING_SOURCE_VALID
        │
        ├── trust_signal_id = TS101
        │       SELLER_VERIFIED
        │
        ├── trust_signal_id = TS102
        │       SUSPICIOUS_PRICE
        │
        └── trust_signal_id = TS103
                CONTENT_POLICY_CLEAR
        ↓
    risk_score_id = RS600
        ↓
    trust_evaluation_id = TE700
        ↓
    trust_decision_id = TD800
        ↓
    offering_verification_id = OV500
        verification_status = APPROVED

This gives PinkCurve a complete explanation of why Offering O100 was approved.

The verification record should therefore preserve the final:

    trust_evaluation_id

    trust_decision_id

where applicable.

The individual Trust Signals should be connected through explicit relationship records.

---

## Seller Verification Example

The same architecture applies to Seller Verification:

    seller_id = S100
        ↓
    seller_verification_id = SV500
        │
        ├── trust_signal_id = TS200
        │       EMAIL_VERIFIED
        │
        ├── trust_signal_id = TS201
        │       PHONE_VERIFIED
        │
        ├── trust_signal_id = TS202
        │       BUSINESS_INFORMATION_VALID
        │
        └── trust_signal_id = TS203
                ACCOUNT_RISK_LOW
        ↓
    trust_evaluation_id = TE800
        ↓
    trust_decision_id = TD900
        ↓
    seller_verification_id = SV500
        verification_status = VERIFIED

---

## Buyer Verification Example

Likewise:

    buyer_id = B100
        ↓
    buyer_verification_id = BV500
        │
        ├── trust_signal_id = TS300
        │       EMAIL_VERIFIED
        │
        ├── trust_signal_id = TS301
        │       PHONE_VERIFIED
        │
        └── trust_signal_id = TS302
                BOT_RISK_LOW
        ↓
    trust_evaluation_id = TE900
        ↓
    trust_decision_id = TD1000
        ↓
    buyer_verification_id = BV500
        verification_status = VERIFIED

---

## Organization Verification Example

Organization Verification follows the same pattern:

    organization_id
        ↓
    organization_verification_id
        │
        ├── trust_signal_id
        ├── trust_signal_id
        └── trust_signal_id
        ↓
    risk_score_id(s)
        ↓
    trust_evaluation_id
        ↓
    trust_decision_id
        ↓
    organization_verification_status

---

## Verification Relationship Model

The resulting logical relationship becomes:

    SELLER
        ↓
    SELLER_VERIFICATION ───────────┐
                                   │
    BUYER                          │
        ↓                          │
    BUYER_VERIFICATION ────────────┤
                                   │
    ORGANIZATION                   │
        ↓                          │
    ORGANIZATION_VERIFICATION ─────┼──→ VERIFICATION_TRUST_SIGNAL
                                   │             │
    OFFERING                       │             ↓
        ↓                          │        TRUST_SIGNAL
    OFFERING_VERIFICATION ─────────┘             │
                                                 ↓
                                           RISK_SCORE
                                                 │
                                                 ↓
                                         TRUST_EVALUATION
                                                 │
                                                 ↓
                                          TRUST_DECISION
                                                 │
                                                 ↓
                                      VERIFICATION RESULT

This relationship should be explicit in Chapter 11.

---

## Verification Lineage Requirement

PinkCurve should be able to trace both directions.

Backward:

    Offering Verification
        ↓
    Trust Decision
        ↓
    Trust Evaluation
        ↓
    Risk Results
        ↓
    Trust Signals
        ↓
    Source Evidence

This answers:

> Why was this Offering approved, rejected, restricted, or sent for review?

Forward:

    Trust Signal
        ↓
    Verification
        ↓
    Trust Evaluation
        ↓
    Trust Decision
        ↓
    Product Eligibility / Restriction

This answers:

> Which Verification and Trust decisions were affected by this Trust Signal?

This becomes particularly important if a Trust Signal is later found to be incorrect, stale, or generated by a defective Model or rule.

---

## Architectural Requirement

Chapter 11 should establish:

> **Every important verification must be explicitly traceable to the Trust Signals and other evidence that contributed to its Trust Evaluation and Trust Decision.**

Verification records should not contain only a final status such as:

    VERIFIED
    APPROVED
    REJECTED

without preserving the lineage that explains how that status was reached.

The architecture should support:

    seller_verification_id
    buyer_verification_id
    organization_verification_id
    offering_verification_id

        ↓

    verification_trust_signal_id

        ↓

    trust_signal_id

        ↓

    risk_score_id

        ↓

    trust_evaluation_id

        ↓

    trust_decision_id

        ↓

    verification result

The exact physical relationship-table design should be determined during Trust & Safety Data Design.

---

# 43. Technical Risk Results vs Trust Decisions — Important Boundary; Ownership Clarification Required

Technical Risk Results and Trust Decisions must remain separate concepts.

A Technical Risk Result represents analytical or model-generated evidence about potential risk.

A Trust Decision represents PinkCurve's policy-based interpretation and business decision based on relevant Trust evidence.

These should not be treated as the same thing.

Examples of Technical Risk Results may include:

    risk_score_id

    risk_type

    risk_score

    classification

    anomaly_score

    bot_probability

    fraud_probability

    confidence

    model_id              optional

    model_version_id      optional

    rule_id               optional

    rule_version          optional

    evidence_references

    generated_at

These results may be produced through:

- AI models;
- statistical models;
- anomaly detection;
- deterministic rules;
- heuristic systems;
- external verification services;
- combinations of these methods.

AI Platform may provide the technical infrastructure used to execute the relevant model, rule, or AI service.

However:

> **AI Platform does not own the Trust meaning of the resulting risk evidence.**

The conceptual relationship should be:

    Source Evidence
        ↓
    Trust / Risk Analysis
        │
        ├── AI Platform model execution
        ├── rule evaluation
        ├── statistical analysis
        └── external verification where applicable
        ↓
    Technical Risk Result
        │
        │ risk_score_id
        ↓
    Trust Evaluation
        │
        │ trust_evaluation_id
        ↓
    Trust Policy
        │
        │ policy_id
        │ policy_version
        ↓
    Trust Decision
        │
        │ trust_decision_id
        ↓
    Verification / Restriction /
    Review / Moderation /
    Enforcement / Eligibility

This preserves a clear separation among:

    Technical execution
        → how the risk analysis is performed

    Technical Risk Result
        → what the analysis found

    Trust Evaluation
        → how PinkCurve interprets all relevant evidence

    Trust Policy
        → what rules and standards apply

    Trust Decision
        → what PinkCurve decides to do

---

## Technical Risk Result Identity

Every important persisted Technical Risk Result should have a stable:

    risk_score_id

or another appropriate risk-result identifier.

The exact name may vary if PinkCurve later supports multiple risk-result types.

A conceptual Technical Risk Result may include:

    risk_score_id

    subject_type
    subject_id

    risk_type

    score

    score_scale

    classification

    anomaly_score            optional

    confidence

    model_id                 optional
    model_version_id         optional

    rule_id                  optional
    rule_version             optional

    ai_service_id            optional
    inference_id             optional

    evidence_references

    generated_at

    valid_from
    valid_until              optional

    freshness_status

    provenance_reference

    status

Not every result requires every field.

The important requirement is that the result remain identifiable, traceable, version-aware, and independent from the final Trust Decision.

---

## Risk Result Ownership

The semantic owner of a risk result should be the Trust/Risk capability using it within Trust & Safety.

AI Platform may execute:

    fraud model

    bot model

    anomaly model

    classification model

but should return a technical result.

For example:

    AI Platform
        ↓
    inference_id
        ↓
    Fraud Model v4
        ↓
    technical score = 0.87
        ↓
    Trust / Risk Analysis
        ↓
    risk_score_id = RS500

The resulting `risk_score_id` becomes Trust evidence.

This avoids making AI Platform responsible for deciding what a score of `0.87` means for Seller approval, Offering eligibility, Buyer restriction, or Billing.

---

## Trust Evaluation

Trust & Safety should combine relevant evidence into a Trust Evaluation.

Potential inputs may include:

    trust_signal_id

    risk_score_id

    verification evidence

    fraud case evidence

    abuse evidence

    security evidence

    account history

    Seller history

    Offering history

    human review

Conceptually:

    trust_signal_id TS100
        +
    risk_score_id RS500
        +
    verification evidence
        ↓
    trust_evaluation_id TE700

The Trust Evaluation should preserve:

    subject_type
    subject_id

    evidence references

    policy context

    reviewer information

    evaluation result

    rationale

    evaluated_at

    provenance

This gives PinkCurve a clear interpretation layer between technical risk evidence and business decision.

---

## Trust Policy

Trust decisions should be based on explicit policy.

Important fields may include:

    policy_id

    policy_version

This is necessary because the same risk result may produce different outcomes under different policies.

For example:

    risk_score = 0.72

under one policy may result in:

    REQUIRE_REVIEW

while under a later policy it may result in:

    RESTRICT

Therefore, the Trust Decision must preserve the policy version used.

---

## Trust Decision

A Trust Decision should have a stable:

    trust_decision_id

and may include:

    trust_decision_id

    subject_type
    subject_id

    trust_evaluation_id

    decision_type

    decision

    decision_reason

    policy_id
    policy_version

    reviewer_type
    reviewer_id            where applicable

    effective_from
    effective_until        optional

    status

    created_at
    updated_at

    provenance_reference

Potential Trust Decisions may include:

    APPROVED

    VERIFIED

    REQUIRES_REVIEW

    RESTRICTED

    SUSPENDED

    REJECTED

    BLOCKED

    MONITOR

The exact vocabulary should be defined later.

---

## Verification Relationship

Trust Decisions may determine or update Verification results.

Conceptually:

    seller_verification_id
        ↓
    Trust Signals / Risk Results
        ↓
    trust_evaluation_id
        ↓
    trust_decision_id
        ↓
    seller_verification_status

The same applies to:

    buyer_verification_id

    organization_verification_id

    offering_verification_id

Therefore:

> **Verification status is an outcome of the Verification process informed by Trust evaluation and Trust decisions; it is not merely a model output.**

---

## Restrictions and Enforcement

Trust Decisions may lead to:

    restriction

    review_requirement

    moderation_action

    enforcement_action

These are downstream consequences of the Trust Decision.

Conceptually:

    trust_decision_id
        ↓
    restriction / review / moderation / enforcement

Where these actions are independently tracked, they should have their own identifiers.

For example:

    moderation_action_id

or:

    enforcement_action_id

where later design demonstrates the need.

---

## Human-in-the-Loop

A Technical Risk Result should not automatically become a final Trust Decision where human review is required.

Conceptually:

    risk_score_id
        ↓
    Trust Evaluation
        ↓
    Automated decision allowed?
        │
        ├── Yes → Trust Decision
        │
        └── No
             ↓
          Human Review
             ↓
          Trust Decision

The decision record should preserve whether the evaluation was:

    AUTOMATED

    HUMAN

    HYBRID

This is especially important for high-impact Trust decisions.

---

## Technical Risk Result Subject Identity

Every Technical Risk Result must identify the PinkCurve entity, activity, or object being evaluated.

A Technical Risk Result should therefore include:

    technical_risk_result_id
        → uniquely identifies the Technical Risk Result

    subject_type
        → identifies what type of PinkCurve object
          is being evaluated

    subject_id
        → identifies the exact PinkCurve object
          being evaluated

Potential `subject_type` values may include:

    SELLER

    BUYER

    OFFERING

    CREATIVE

    CAMPAIGN

    REVIEW

    RATING

    DISCOVERY_SESSION

    DISCOVERY_EVENT

    BILLABLE_EVENT

    INVOICE

    DEVICE

    SECURITY_EVENT

    OTHER_SUPPORTED_ENTITY

For example:

    technical_risk_result_id = TR100

    subject_type = SELLER
    subject_id = S500

    risk_type = FRAUD

    risk_score = 0.82

This means:

> Seller S500 was evaluated for fraud risk and produced Technical Risk Result TR100.

Another example:

    technical_risk_result_id = TR101

    subject_type = OFFERING
    subject_id = O700

    risk_type = SCAM_RISK

    risk_score = 0.74

This means:

> Offering O700 was evaluated for scam-related risk.

Another example:

    technical_risk_result_id = TR102

    subject_type = BUYER
    subject_id = B800

    risk_type = BOT_RISK

    risk_score = 0.91

This means:

> Buyer B800 was evaluated for bot-related risk.

Without `subject_type` and `subject_id`, the Technical Risk Result cannot be reliably interpreted, traced, or used.

---

## Direct Identifier Relationships

Where useful, the Technical Risk Result may also preserve explicit PinkCurve identifiers.

For example:

    seller_id                 optional

    buyer_id                  optional

    offering_id               optional

    creative_id               optional

    campaign_id               optional

    review_id                 optional

    rating_id                 optional

    session_id                optional

    event_id                  optional

    billable_event_id         optional

    security_event_id         optional

However, PinkCurve should avoid placing every possible identifier as a nullable field if the architecture can use:

    subject_type
    subject_id

for the primary subject.

The direct identifiers may still be useful for common relationships, indexing, lineage, or performance.

The exact physical schema should be determined during Data Design.

---

## Primary Subject vs Related Entities

A Technical Risk Result may concern one primary subject while also depending on related PinkCurve entities.

For example:

    Seller S500
        ↓
    Offering O700
        ↓
    suspicious Discovery activity
        ↓
    event_id E900
        ↓
    Technical Risk Result

The primary subject may be:

    subject_type = OFFERING
    subject_id = O700

while related entities may include:

    seller_id = S500
    event_id = E900

Therefore PinkCurve should distinguish:

    Primary Subject
        → what is being evaluated?

from:

    Related Entities
        → what other objects contributed
          to the evaluation?

A conceptual relationship may include:

    technical_risk_related_entity_id

    technical_risk_result_id

    entity_type
    entity_id

    relationship_type

For example:

    technical_risk_result_id = TR101

        ├── OFFERING O700
        │       relationship = SUBJECT
        │
        ├── SELLER S500
        │       relationship = OWNED_BY
        │
        └── DISCOVERY_EVENT E900
                relationship = EVIDENCE

This allows Technical Risk Results to represent complex Trust situations without losing identity.

---

## Technical Risk Result Structure

A stronger conceptual Technical Risk Result may therefore include:

    technical_risk_result_id

    subject_type
    subject_id

    risk_type

    risk_score
    score_scale

    classification

    anomaly_score              optional

    confidence

    severity                   optional

    model_id                   optional
    model_version_id           optional

    ai_service_id              optional
    inference_id               optional

    rule_id                    optional
    rule_version               optional

    evidence_references

    related_entity_references

    generated_at

    valid_from
    valid_until                optional

    freshness_status

    provenance_reference

    status

Not every Technical Risk Result requires every field.

---

## Seller Risk Example

For Seller verification:

    seller_id = S500
        ↓
    seller_verification_id = SV100
        ↓
    Source Evidence
        ↓
    Trust Signals
        ↓
    Technical Risk Analysis
        ↓
    technical_risk_result_id = TR500

        subject_type = SELLER
        subject_id = S500

        risk_type = SELLER_FRAUD_RISK
        risk_score = 0.18
        confidence = 0.92

        ↓
    trust_evaluation_id = TE600
        ↓
    trust_decision_id = TD700
        ↓
    seller_verification_id = SV100
        verification_status = VERIFIED

This gives the Technical Risk Result an unambiguous Seller relationship.

---

## Offering Risk Example

For Offering verification:

    offering_id = O200
        │
        └── seller_id = S500
                ↓
    offering_verification_id = OV300
        ↓
    Offering Evidence
        ↓
    Trust Signals
        ↓
    technical_risk_result_id = TR400

        subject_type = OFFERING
        subject_id = O200

        risk_type = SCAM_RISK
        risk_score = 0.63

        related_entity:
            SELLER S500

        ↓
    trust_evaluation_id = TE500
        ↓
    trust_decision_id = TD600
        ↓
    offering_verification_status

PinkCurve can now answer:

> Which Offering was evaluated?

> Which Seller owns it?

> What risk was detected?

> Which Technical Risk Result was created?

> Which Trust Evaluation used it?

> Which Trust Decision followed?

---

## Buyer Risk Example

For Buyer bot evaluation:

    buyer_id = B300
        ↓
    session_id = S700
        ↓
    event_ids
        ↓
    Technical Bot Analysis
        ↓
    technical_risk_result_id = TR800

        subject_type = BUYER
        subject_id = B300

        risk_type = BOT_RISK
        risk_score = 0.89

        related_entity:
            DISCOVERY_SESSION S700

        ↓
    trust_evaluation_id = TE900
        ↓
    trust_decision_id = TD1000
        ↓
    Buyer handling / restriction

Again, the risk result is clearly tied to the Buyer being evaluated.

---

## Discovery Event Risk Example

Sometimes the thing being evaluated may be an individual event rather than an account.

For example:

    event_id = E1000
        ↓
    Technical Risk Analysis
        ↓
    technical_risk_result_id = TR1100

        subject_type = DISCOVERY_EVENT
        subject_id = E1000

        risk_type = INVALID_TRAFFIC
        risk_score = 0.97

        ↓
    Trust Evaluation
        ↓
    invalid traffic determination

That determination may later be consumed by:

    Discovery Analytics

    QOV qualification

    Billing Qualification

without requiring those products to reinterpret the underlying model score independently.

---

## Billable Event Risk Example

Billing-related fraud analysis may instead evaluate:

    billable_event_id = BE500
        ↓
    Technical Risk Analysis
        ↓
    technical_risk_result_id = TR1200

        subject_type = BILLABLE_EVENT
        subject_id = BE500

        risk_type = BILLING_FRAUD_RISK

        ↓
    Trust Evaluation
        ↓
    Approved Trust result
        ↓
    Billing Qualification

This keeps financial qualification traceable without making the Technical Risk Result itself a financial decision.

---

## Relationship to Verification

The complete relationship should therefore be:

    Seller / Buyer / Offering / Other Subject
                    │
                    │ subject_id
                    ↓
              Verification
                    │
                    ↓
              Trust Evidence
                    │
                    ↓
              Trust Signals
                    │
                    ↓
        Technical Risk Analysis
                    │
                    ↓
      technical_risk_result_id
                    │
                    ├── subject_type
                    └── subject_id
                    ↓
          trust_evaluation_id
                    ↓
           trust_decision_id
                    ↓
          Verification Result

This explicitly connects Technical Risk Results to the entity being verified.

---

## Relationship to Trust Evaluation

A Trust Evaluation may consume multiple Technical Risk Results.

For example:

    TR100 Seller Fraud Risk
            │
    TR101 Account Anomaly Risk
            │
    TR102 Identity Risk
            │
            ↓
    trust_evaluation_id = TE500

Therefore the relationship may be:

    one subject
        ↓
    many Technical Risk Results
        ↓
    one or more Trust Evaluations

A Trust Evaluation should preserve explicit references to the Technical Risk Results used.

A conceptual relationship may include:

    trust_evaluation_risk_result_id

    trust_evaluation_id

    technical_risk_result_id

    contribution_type

    contribution_weight        optional

This supports many-to-many relationships where required.

---

## End-to-End Risk Identity

The complete architecture becomes:

    PinkCurve Subject
        │
        ├── seller_id
        ├── buyer_id
        ├── offering_id
        ├── review_id
        ├── event_id
        └── other identifier
        ↓
    Technical Risk Analysis
        ↓
    technical_risk_result_id
        │
        ├── subject_type
        ├── subject_id
        ├── risk_type
        └── risk_score
        ↓
    trust_evaluation_id
        ↓
    policy_id / policy_version
        ↓
    trust_decision_id
        ↓
    Verification / Restriction /
    Moderation / Enforcement /
    Eligibility Decision

This makes every Technical Risk Result meaningful because it is explicitly attached to the PinkCurve object being evaluated.

---

## Architectural Requirement

Chapter 11 should establish:

> **Every Technical Risk Result must identify the PinkCurve subject being evaluated through a stable `subject_type` and `subject_id`, with related entity references where additional context is required.**

The architecture must allow PinkCurve to answer:

> What object was evaluated?

> What type of risk was evaluated?

> Which Technical Risk Result was produced?

> What evidence supported it?

> Which model or rule produced it?

> Which Trust Evaluation consumed it?

> Which Trust Decision followed?

Without this relationship, `technical_risk_result_id` would indeed have little architectural value.

**Audit Status: Significant clarification required — Technical Risk Results must be explicitly connected to Seller, Buyer, Offering, Event, Review, Billing, Security, or other PinkCurve subjects through stable identifiers.**

---

## Example — Offering Verification

For example:

    offering_id = O100
        ↓
    offering_verification_id = OV500
        ↓
    Trust Signals
        ├── TS100 SOURCE_VALID
        ├── TS101 SELLER_VERIFIED
        └── TS102 SUSPICIOUS_PRICE
        ↓
    Technical Risk Analysis
        ↓
    risk_score_id = RS600
        risk_score = 0.31
        ↓
    trust_evaluation_id = TE700
        ↓
    policy_id = OFFERING_APPROVAL
    policy_version = 3
        ↓
    trust_decision_id = TD800
        decision = APPROVED
        ↓
    offering_verification_id = OV500
        verification_status = APPROVED

This makes the relationship explicit:

    Model / Rule Output
        ≠
    Trust Decision
        ≠
    Verification Record

Each object has a different responsibility.

---

## Example — Bot Detection

Another example:

    session_id
        ↓
    Behavioral Evidence
        ↓
    Bot Model / Rules
        ↓
    risk_score_id
        risk_type = BOT
        ↓
    Trust Evaluation
        ↓
    trust_decision_id
        ↓
    Session / Buyer handling

Discovery Analytics may later consume the approved bot determination when deciding whether events qualify for QOV.

Billing may consume the appropriate Trust output during Billing Qualification.

Neither Discovery Analytics nor Billing should independently reinterpret the raw model score.

---

## Architectural Boundary

The correct ownership should therefore be:

    AI Platform
        → provides model/rule execution
          and technical inference infrastructure

    Trust / Risk Analysis
        → produces structured technical
          risk evidence

    Trust & Safety
        → owns Trust evaluation,
          policy interpretation,
          Trust decisions,
          restrictions,
          review requirements,
          moderation,
          and enforcement

This boundary should replace the overly simple interpretation:

    AI Platform
        → Risk Result
        → Trust Decision

because that wording makes AI Platform appear to own more Trust semantics than intended.

---

## Architectural Requirement

Chapter 11 should establish:

> **Technical Risk Results are identifiable evidence, not Trust Decisions.**

> **AI Platform may execute the models or technical services that contribute to Risk Results, but Trust & Safety owns Trust interpretation, policy evaluation, and final Trust decisions.**

The end-to-end relationship should be:

    Source Evidence
        ↓
    Technical Analysis
        ↓
    risk_score_id
        ↓
    Trust Signals and Other Evidence
        ↓
    trust_evaluation_id
        ↓
    policy_id / policy_version
        ↓
    trust_decision_id
        ↓
    Verification / Restriction /
    Review / Moderation /
    Enforcement

**Audit Status: Important boundary requiring clarification — separate technical AI execution, Technical Risk Results, Trust Evaluation, policy interpretation, Trust Decision, and downstream Trust actions.**

---

# 44. Billing Architecture — Strong Foundation; Requires Stronger Qualification, Identity, and Lineage Definition

The current Billing Architecture correctly establishes an important principle:

    Discovery Event
        ↓
    Qualification
        ↓
    Bot / Fraud Validation
        ↓
    Billable Event
        ↓
    Invoice Item

The fundamental principle is correct:

> **A raw Discovery Event must not automatically become a financial record.**

However, the relationship should be refined.

Billing Qualification may depend on multiple forms of evidence, including Trust & Safety results, rather than treating Bot / Fraud Validation as a single sequential step after Qualification.

A stronger conceptual architecture is:

    Discovery Event
        │
        │ event_id
        ↓
    Billing Qualification
        │
        ├── Event eligibility
        ├── Seller / Offering eligibility
        ├── Pricing rules
        ├── Duplicate-event rules
        ├── Trust & Safety qualification
        ├── Bot / fraud determination
        └── other billing policy
        ↓
    Billing Qualification Result
        │
        │ billing_qualification_id
        ↓
    Billable Event
        │
        │ billable_event_id
        ↓
    Invoice Item
        │
        │ invoice_item_id
        ↓
    Invoice
        │
        │ invoice_id
        ↓
    Seller Account / Payment Processing

This separates:

    Discovery activity

from:

    Billing qualification

from:

    financial recognition

from:

    invoicing.

---

## Discovery Event Relationship

Every potential billable activity should begin with an identifiable Discovery Event:

    event_id

The Discovery Event remains the authoritative record of what happened in the Discovery experience.

For example:

    event_id = E100

may represent:

    Buyer clicked through
    from Offering O200
    to the Seller destination.

The Discovery Event itself is not a charge.

Therefore:

    event_id
        ≠
    billable_event_id

This distinction is critical.

---

## Billable Event Type Eligibility

Not every Discovery Event is eligible for Billing.

Discovery Events may represent many forms of Buyer activity, such as:

    OFFERING_IMPRESSION
    OFFERING_VIEW
    OFFERING_EXPLORE
    OFFERING_SKIP

    AMN_SELECTION
    SEARCH
    NAVIGATION

    CREATIVE_VIEW
    CREATIVE_INTERACTION

    CLICK_THROUGH

    BUYER_FEEDBACK
    RATING
    REVIEW

    other Discovery activity

Most Discovery Events exist for Discovery, Analytics, Buyer Intelligence, Learning, or other product purposes and should not automatically enter Billing.

Billing should therefore explicitly define which Discovery Event types are:

    BILLING_ELIGIBLE

    NOT_BILLING_ELIGIBLE

Potentially:

    event_id
        ↓
    event_type
        ↓
    Billing Event Eligibility
        ↓
    Is this event type eligible for Billing?
        │
        ├── NO
        │     ↓
        │   No Billing Qualification required
        │
        └── YES
              ↓
        Billing Qualification
              ↓
        Pricing + Trust + Eligibility Rules
              ↓
           QUALIFIED?
           /       \
         YES        NO
          ↓          ↓
    Billable Event  No Charge

---

## Billing Event Type Policy

Billing eligibility should be controlled by an explicit Billing policy rather than being inferred from the Discovery Event name.

PinkCurve should consider:

    billing_event_type_policy_id

    event_type

    billing_eligible

    pricing_rule_id             where applicable

    effective_from

    effective_until             optional

    policy_version

    status

For example:

    OFFERING_IMPRESSION
        → NOT_BILLING_ELIGIBLE

    OFFERING_VIEW
        → NOT_BILLING_ELIGIBLE

    AMN_SELECTION
        → NOT_BILLING_ELIGIBLE

    BUYER_FEEDBACK
        → NOT_BILLING_ELIGIBLE

    CLICK_THROUGH
        → BILLING_ELIGIBLE

This does not mean that every `CLICK_THROUGH` becomes billable.

It means only that `CLICK_THROUGH` is permitted to enter Billing Qualification.

For example:

    event_id = E100
    event_type = CLICK_THROUGH
        ↓
    BILLING_ELIGIBLE
        ↓
    Billing Qualification
        │
        ├── Seller eligible?
        ├── Offering eligible?
        ├── duplicate?
        ├── valid Buyer activity?
        ├── Trust & Safety approved?
        ├── pricing rule applicable?
        └── other Billing rules
        ↓
    QUALIFIED
        ↓
    billable_event_id = BE100

While:

    event_id = E101
    event_type = OFFERING_VIEW
        ↓
    NOT_BILLING_ELIGIBLE
        ↓
    No Billable Event

---

## Event Type Must Be Preserved in Billing Lineage

The Billing lineage should preserve the original Discovery Event type.

Conceptually:

    event_id
        │
        └── event_type
                ↓
        Billing Event Type Policy
                ↓
        billing_qualification_id
                ↓
        billable_event_id
                ↓
        invoice_item_id
                ↓
            invoice_id

This allows PinkCurve to determine exactly what Buyer activity ultimately resulted in a Seller charge.

---

## Billing Ownership and Operation

PinkCurve should have an explicitly defined **Billing capability** responsible for converting qualified Discovery activity into Seller financial records and managing the Invoice lifecycle.

Billing is not owned by Discovery Analytics, Trust & Safety, Seller Intelligence, or AI Platform.

These products and capabilities may provide information used by Billing, but the Billing capability owns PinkCurve's financial qualification and invoicing records.

Conceptually:

    Discovery Engine / Buyer Experience
        ↓
    Discovery Event
        │
        │ event_id
        ↓
    Billing
        │
        ├── Event-Type Eligibility
        ├── Billing Qualification
        ├── Pricing Rule Application
        ├── Trust & Safety Input
        ├── Billable Event Creation
        ├── Invoice Item Creation
        ├── Invoice Generation
        ├── Adjustments / Credits
        ├── Payment Status
        └── Billing Reconciliation
        ↓
    Seller Billing Account

The Billing capability should therefore own creation and lifecycle management of:

    billing_qualification_id

    billable_event_id

    invoice_item_id

    invoice_id

    billing_adjustment_id

and other financial records introduced during detailed Billing design.

---

## Billing Responsibilities

The Billing capability should be responsible for:

- determining whether a Billing-eligible Discovery Event actually qualifies for charging;
- applying the correct Pricing Rule and Pricing Rule Version;
- consuming appropriate Trust & Safety decisions;
- preventing duplicate charging;
- creating Billable Events;
- calculating charge amounts;
- creating Invoice Items;
- aggregating Invoice Items into Seller Invoices;
- generating Invoices;
- applying credits, adjustments, or reversals;
- maintaining Invoice status;
- recording payment-processing references;
- supporting Billing reconciliation;
- preserving financial lineage and audit history.

Billing should not own:

- Discovery Event generation;
- Discovery Analytics;
- bot or fraud determination;
- Trust policy;
- Seller Intelligence;
- payment-provider infrastructure.

Those capabilities provide inputs or services to Billing.

---

## Billing Operator

The Billing capability may be operated through a combination of:

    Automated PinkCurve Billing Services
                +
    PinkCurve Finance / Billing Operations
                +
    External Payment Provider

These responsibilities should remain distinct.

### Automated Billing Services

PinkCurve software should perform routine Billing operations such as:

    event qualification

    pricing-rule application

    billable-event creation

    invoice-item creation

    invoice calculation

    scheduled invoice generation

    payment-provider integration

    reconciliation support

Routine Billing should not require manual processing of every charge.

### Finance / Billing Operations

Authorized PinkCurve Finance or Billing personnel should handle activities requiring human oversight, such as:

    Billing disputes

    unusual adjustments

    credits

    failed payments

    reconciliation exceptions

    Seller Billing support

    financial review

    policy exceptions

    audit support

Human operators should not normally modify historical financial records directly.

Corrections should use controlled adjustment, credit, or reversal mechanisms.

### External Payment Provider

An external payment provider may provide technical services such as:

    payment collection

    payment method handling

    payment authorization

    transaction processing

    payment confirmation

    refunds where applicable

However:

> **The external payment provider does not own PinkCurve Billing logic.**

PinkCurve Billing determines:

    who is being billed;

    what qualified for Billing;

    why it qualified;

    which Pricing Rule applies;

    how the PinkCurve charge was calculated;

    what appears on the Seller Invoice.

The payment provider executes the appropriate financial transaction after receiving authorized Billing instructions.

---

## Invoice Generation Ownership

The Billing capability should own Invoice generation.

Conceptually:

    seller_id
        ↓
    Billing Period
        ↓
    Qualified Billable Events
        ↓
    billable_event_ids
        ↓
    Invoice Item Generation
        ↓
    invoice_item_ids
        ↓
    Invoice Generation
        ↓
    invoice_id
        ↓
    Seller

For example:

    Seller S100

        BE100 ──┐
        BE101 ──┼──→ Invoice Items
        BE102 ──┘
                     ↓
                invoice_id = INV500
                     ↓
                Seller S100

The Invoice should therefore be generated from authoritative Billing records rather than independently reconstructed from raw Discovery Events.

---

## Billing Scheduling

Billing should support a defined Billing cycle.

Conceptually:

    Qualified activity
        ↓
    Billable Events accumulated
        ↓
    Billing Period closes
        ↓
    Invoice generation
        ↓
    Invoice issued
        ↓
    Payment processing
        ↓
    Payment / outstanding status

Potential Billing cycles may eventually include:

    monthly

    threshold-based

    prepaid

    usage-based

    other contractual arrangements

The specific commercial policy should be determined in the Business Model and detailed Billing design.

Chapter 11 only needs to establish that Billing owns this lifecycle.

---

## Seller Billing Account

PinkCurve should consider a logical:

    seller_billing_account_id

associated with:

    seller_id

A Seller Billing Account may eventually contain or reference:

    seller_billing_account_id

    seller_id

    billing_status

    billing_cycle

    currency

    pricing_plan_id

    payment_provider_customer_reference

    payment_method_reference

    invoice_settings_id

    tax-related configuration where required

    created_at
    updated_at

Sensitive payment credentials should not be stored directly by PinkCurve where they can appropriately remain with the payment provider.

---

## Billing System Boundary

The ownership boundary should therefore be:

    Discovery
        → produces Discovery Events

    Trust & Safety
        → produces Trust decisions and
          fraud / bot qualification evidence

    Pricing / Business Model
        → defines Pricing Rules

    Billing
        → determines financial qualification
          and creates financial records

    Finance / Billing Operations
        → handles human financial oversight
          and exceptions

    Payment Provider
        → executes payment transactions

    Seller Experience
        → presents appropriate Billing and
          Invoice information to Sellers

Conceptually:

    Discovery Event
          │
          ↓
    ┌─────────────────────────────┐
    │       BILLING SYSTEM        │
    │                             │
    │ Event Eligibility           │
    │        ↓                    │
    │ Billing Qualification ← Trust & Safety
    │        ↓                    │
    │ Pricing Application ← Pricing Rules
    │        ↓                    │
    │ Billable Event              │
    │        ↓                    │
    │ Invoice Item                │
    │        ↓                    │
    │ Invoice Generation          │
    └──────────────┬──────────────┘
                   ↓
            Payment Provider
                   ↓
             Payment Status
                   │
                   ↓
            BILLING SYSTEM
                   │
          ┌────────┴─────────┐
          ↓                  ↓
    Seller Experience    Finance /
                         Billing Operations

---

## Architectural Requirement

Chapter 11 should establish:

> **PinkCurve Billing is the authoritative capability responsible for Billing Qualification, Billable Event creation, Invoice Item creation, Invoice generation, Billing adjustments, and financial lineage.**

Routine Billing should be automated.

Authorized Finance / Billing Operations personnel should manage exceptions, disputes, adjustments, reconciliation, and other activities requiring human oversight.

External payment providers may execute payment transactions but should not determine PinkCurve Billing eligibility, pricing logic, or Invoice meaning.

The ownership of major Billing identifiers should therefore be:

    Billing
        │
        ├── billing_qualification_id
        ├── billable_event_id
        ├── invoice_item_id
        ├── invoice_id
        ├── billing_adjustment_id
        └── seller_billing_account_id

This creates a clear operational and data owner for PinkCurve Billing.

---

## Architectural Requirement

Chapter 11 should establish:

> **Only explicitly Billing-eligible Discovery Event types may enter Billing Qualification. Event-type eligibility does not itself make an event billable; it only permits the event to be evaluated under Billing Qualification rules.**

The final Billing decision remains:

    Billing-eligible event type
            +
    valid event
            +
    Seller / Offering eligibility
            +
    Trust & Safety qualification
            +
    applicable pricing rule
            +
    Billing policy
            ↓
        Billable Event

---

## Billing Qualification Identity

PinkCurve should consider a stable:

    billing_qualification_id

for independently persisted Billing Qualification decisions.

A conceptual Billing Qualification may include:

    billing_qualification_id

    event_id

    seller_id

    offering_id

    campaign_id                optional

    qualification_type

    pricing_rule_id

    pricing_rule_version

    trust_decision_id          optional

    technical_risk_result_ids  optional

    qualification_status

    qualification_reason

    evaluated_at

    provenance_reference

Potential qualification states may include:

    QUALIFIED

    NOT_QUALIFIED

    PENDING_REVIEW

    INVALIDATED

The exact vocabulary should be determined during Billing System Design.

---

## Trust & Safety Relationship

Billing should not independently perform or reinterpret technical Bot or Fraud analysis.

Instead:

    Discovery Event
        ↓
    Trust / Risk Analysis
        ↓
    technical_risk_result_id
        ↓
    Trust Evaluation
        ↓
    trust_decision_id
        ↓
    Billing Qualification

For example:

    event_id = E100
        ↓
    technical_risk_result_id = TR200

        subject_type = DISCOVERY_EVENT
        subject_id = E100
        risk_type = BOT_RISK

        ↓
    trust_evaluation_id = TE300
        ↓
    trust_decision_id = TD400
        ↓
    Billing Qualification

Billing consumes the appropriate approved Trust result.

Billing should not need to interpret:

    bot_probability = 0.87

and independently decide whether the event is fraudulent.

That interpretation belongs to Trust & Safety.

---

## Billing Qualification Inputs

Billing Qualification may depend on multiple conditions.

Conceptually:

                       event_id
                          │
                          ↓
                Billing Qualification
                 /       |        \
                /        |         \
               ↓         ↓          ↓
        Billing Rules  Trust      Eligibility
             │        Decision       Rules
             │           │             │
             └───────────┼─────────────┘
                         ↓
              billing_qualification_id
                         ↓
                  Qualified?
                    /       \
                  YES        NO
                   ↓          ↓
          Billable Event   No Charge

Potential qualification inputs may include:

- valid Discovery Event;
- eligible event type;
- eligible Seller;
- eligible Offering;
- active pricing agreement;
- applicable pricing rule;
- duplicate-event prevention;
- time-window rules;
- Trust & Safety result;
- bot/fraud determination;
- campaign eligibility where applicable;
- other Billing policies.

The exact rules belong in Billing System Design.

---

## Billable Event Identity

Once an event qualifies for billing, PinkCurve should create an independently identifiable:

    billable_event_id

A conceptual Billable Event may include:

    billable_event_id

    event_id

    billing_qualification_id

    seller_id

    offering_id

    campaign_id                 optional

    billable_event_type

    pricing_rule_id
    pricing_rule_version

    unit_price

    quantity

    amount

    currency

    billable_at

    billing_status

    provenance_reference

This creates explicit lineage:

    event_id
        ↓
    billing_qualification_id
        ↓
    billable_event_id

PinkCurve can therefore determine exactly which Discovery Event produced a financial obligation and why.

---

## One Discovery Event Does Not Necessarily Equal One Billable Event

The architecture should not assume:

    every event
        =
    billable event

Instead:

    Discovery Events
        ↓
    Qualification
        ↓
    qualified subset
        ↓
    Billable Events

For example:

    E100 → qualified     → BE100

    E101 → bot traffic   → no Billable Event

    E102 → duplicate     → no Billable Event

    E103 → qualified     → BE101

This protects Sellers from invalid charges and preserves financial explainability.

---

## Billable Event vs Discovery Analytics

A Billable Event should not be confused with an Analytical Result.

Discovery Analytics may analyze:

    event_id

and produce:

    analytic_result_id

Billing may evaluate the same:

    event_id

and produce:

    billing_qualification_id
        ↓
    billable_event_id

Conceptually:

                    event_id
                       │
             ┌─────────┴──────────┐
             ↓                    ↓
      Discovery Analytics       Billing
             ↓                    ↓
     analytic_result_id   billing_qualification_id
                                  ↓
                           billable_event_id

These are different interpretations of the same underlying Discovery Event.

Discovery Analytics owns analytical meaning.

Billing owns financial qualification.

---

## QOV and Billing

QOV may provide important Seller-value measurement, but QOV should not automatically be treated as a financial charge.

Conceptually:

    Discovery Event
        ├──────────────→ Discovery Analytics
        │                       ↓
        │                  QOV Result
        │
        └──────────────→ Billing Qualification
                                ↓
                         Billable Event

If PinkCurve's future pricing model explicitly uses QOV or a QOV-derived pricing rule, Billing may reference the appropriate Analytical Result.

However:

> **QOV measurement and Billing qualification should remain separately identifiable and independently governed concepts.**

This preserves flexibility if PinkCurve's pricing model changes.

---

## Pricing Rule Identity

Billing decisions must preserve the pricing rule used.

PinkCurve should consider:

    pricing_rule_id
    pricing_rule_version

For example:

    pricing_rule_id = PR100
    pricing_rule_version = 3

This is important because pricing may change over time.

Historical Billable Events must retain the pricing rule that was actually applied when the charge was created.

---

## Invoice Item Identity

Billable Events should eventually be associated with:

    invoice_item_id

A conceptual Invoice Item may include:

    invoice_item_id

    invoice_id

    seller_id

    billable_event_id

    description

    quantity

    unit_price

    amount

    currency

    billing_period

    created_at

    status

One Invoice may contain many Invoice Items:

    invoice_id
        │
        ├── invoice_item_id
        ├── invoice_item_id
        └── invoice_item_id

The exact aggregation policy should be determined during Billing System Design.

---

## Billable Event to Invoice Item Relationship

The simplest relationship may be:

    billable_event_id
        ↓
    invoice_item_id

However, PinkCurve should not prematurely require a one-to-one relationship.

For operational efficiency, multiple Billable Events may eventually be aggregated into one Invoice Item.

For example:

    BE100 ──┐
    BE101 ──┼──→ Invoice Item II500
    BE102 ──┘

Therefore the logical architecture should preserve the relationship between Billable Events and Invoice Items even if aggregation is used.

A conceptual relationship may include:

    invoice_item_billable_event_id

    invoice_item_id

    billable_event_id

    allocated_amount

    created_at

This provides complete financial lineage.

---

## Invoice Identity

Every Invoice should have:

    invoice_id

A conceptual Invoice may include:

    invoice_id

    seller_id
    seller_billing_account_id

    invoice_number

    invoice_date

    billing_period_start
    billing_period_end

    subtotal

    adjustments
    credits
    discounts                    where applicable
    taxes                        where applicable

    total_amount
    amount_paid
    amount_due

    currency

    invoice_status

    due_date

    issued_at
    paid_at                      optional

    payment_reference            optional

    created_at
    updated_at

---

## Adjustments and Credits

Billing Architecture should anticipate corrections.

A Billable Event or Invoice may later require:

    adjustment

    credit

    reversal

For example:

    billable_event_id BE100
        ↓
    later fraud determination
        ↓
    Billing Adjustment
        ↓
    Seller Credit

PinkCurve should not delete the original financial history.

Instead, financial corrections should be represented through auditable adjustment records.

PinkCurve may therefore eventually require:

    billing_adjustment_id

with references to:

    billable_event_id
    invoice_item_id
    invoice_id

as appropriate.

---

## Late Trust or Fraud Determination

An important case occurs when Trust & Safety determines **after billing qualification** that activity was invalid.

Conceptually:

    event_id
        ↓
    Billing Qualification
        ↓
    billable_event_id
        ↓
    Invoice
        ↓
    Later Trust Evidence
        ↓
    Fraud / Bot Determination
        ↓
    Billing Adjustment / Credit

This means Billing must support correction rather than assuming qualification can never change.

The original records should remain for auditability.

---

## Billing Lineage

Billing should provide complete financial lineage:

    Discovery Event
        │
        │ event_id
        ↓
    Trust / Eligibility / Pricing Evidence
        ↓
    Billing Qualification
        │
        │ billing_qualification_id
        ↓
    Billable Event
        │
        │ billable_event_id
        ↓
    Invoice Item
        │
        │ invoice_item_id
        ↓
    Invoice
        │
        │ invoice_id
        ↓
    Payment / Settlement

Where adjustments occur:

    Original Financial Record
        ↓
    billing_adjustment_id
        ↓
    Credit / Reversal / Correction

PinkCurve should be able to trace both directions.

Backward:

    Invoice
        ↓
    Invoice Item
        ↓
    Billable Event
        ↓
    Billing Qualification
        ↓
    Discovery Event
        ↓
    Original Discovery activity

Forward:

    Discovery Event
        ↓
    Qualification
        ↓
    Billable Event
        ↓
    Invoice
        ↓
    Payment

This is essential for Seller support, Billing disputes, reconciliation, auditing, and financial reporting.

---

## Seller Relationship

Every financial record should remain traceable to the Seller being charged.

Conceptually:

    seller_id
        ↓
    billable_event_id
        ↓
    invoice_item_id
        ↓
    invoice_id

The Seller relationship should not need to be reconstructed indirectly through an Offering or Campaign.

---

## Offering Relationship

Where billing is attributable to a particular Offering:

    offering_id

should remain traceable through the Billing lineage.

Conceptually:

    seller_id
        ↓
    offering_id
        ↓
    event_id
        ↓
    billing_qualification_id
        ↓
    billable_event_id
        ↓
    invoice_item_id

This allows PinkCurve and the Seller to understand which Offerings generated charges.

---

## Billing Data Integrity

Financial records require stronger integrity controls than ordinary analytical records.

Important Billing records should generally be:

- auditable;
- reproducible;
- version-aware;
- protected against unauthorized modification;
- traceable to source events;
- reconcilable;
- historically preserved.

Financial corrections should normally create explicit adjustments rather than silently rewriting historical records.

---

## Architectural Requirement

Chapter 11 should establish:

> **A Discovery Event becomes financially meaningful only after explicit Billing Qualification. Billing Qualification may consume Trust & Safety decisions, eligibility rules, pricing rules, and other Billing evidence. A qualified event may then produce an independently identifiable Billable Event that can be traced through Invoice Items, Invoices, adjustments, and payment processing.**

The primary identity chain should be:

    event_id
        ↓
    billing_qualification_id
        ↓
    billable_event_id
        ↓
    invoice_item_id
        ↓
    invoice_id

with supporting relationships to:

    seller_id

    offering_id

    campaign_id              where applicable

    trust_decision_id        where applicable

    pricing_rule_id
    pricing_rule_version

    billing_adjustment_id    where applicable

The exact pricing model, qualification rules, invoice aggregation method, payment processor, accounting integration, tax treatment, and physical Billing schema should be defined during Business Model, Billing Data Design, and Billing System Design.

                     Discovery Event
                           │
                           ↓
                  Billing Qualification
                    /      |       \
                   /       |        \
                  ↓        ↓         ↓
            Pricing     Trust &    Eligibility
             Rules       Safety      Rules
                  \        |         /
                   \       |        /
                    └──────┼───────┘
                           ↓
                     QUALIFIED?
                     /        \
                   YES         NO
                    ↓           ↓
             Billable Event   No Charge

event_id
   ↓
billing_qualification_id
   ↓
billable_event_id
   ↓
invoice_item_id
   ↓
invoice_id

**Audit Status: Strong foundation but requires expansion — explicitly define Billing Qualification, Trust & Safety input, Billable Event identity, pricing-rule versioning, Invoice lineage, adjustments, and complete Discovery Event-to-financial-record traceability.**

---

# 45. QOV vs Billing — Important Boundary

These concepts should remain distinct:

    Discovery Event
        ↓
    QOV / Discovery Metric
        ↓
    Billing Qualification
        ↓
    Billable Event
        ↓
    Invoice Item

A change to an analytical metric must not silently rewrite financial history.

---

# 46. Customer Support Data — Strong

Logical Customer Support entities include:

    customer_support_cases
    customer_support_messages
    customer_support_actions
    customer_support_logs
    support_escalations

Support cases may relate to:

- Buyer;
- Seller;
- Offering;
- Invoice;
- Verification;
- Trust report;
- Campaign.

---

# 47. Operational Data — Strong Concept; Requires Clearer Ownership, Identity, and Observability Architecture

Operational Data represents the technical evidence required to operate, monitor, troubleshoot, secure, scale, and control the PinkCurve platform.

It is different from Product Analytics.

Product Analytics helps PinkCurve understand:

    what Buyers and Sellers are doing;
    how discovery is performing;
    whether Offerings and Creatives are effective;
    how PinkCurve creates Buyer and Seller value.

Operational Data helps PinkCurve understand:

    whether PinkCurve systems are running correctly;
    whether services are available;
    whether APIs are performing correctly;
    whether jobs are completing;
    whether queues are healthy;
    whether deployments are successful;
    whether errors are occurring;
    whether infrastructure is overloaded;
    whether technical costs are within expectations.

The architectural distinction should therefore be:

    Product Activity
        ↓
    Product / Discovery Data
        ↓
    Product Analytics
        ↓
    Business and Product Understanding

versus:

    Applications / Services / Infrastructure
        ↓
    Operational Telemetry
        ↓
    Monitoring / Observability
        ↓
    Operational Understanding and Response

Operational Data should remain logically separated from Product Analytics even when the same product or service generates both.

---

## Operational Data Sources

Operational Data may be produced by every PinkCurve product, capability, service, application, API, background process, and infrastructure component.

Potential sources include:

    Buyer Experience

    Seller Experience

    Adaptive Metadata Navigation

    AI Discovery

    Offering Knowledge

    Creative Studio

    Discovery Analytics

    Learning Engine

    Buyer Intelligence

    Seller Intelligence

    Trust & Safety

    Billing

    Customer Support

    AI Platform

    APIs

    databases

    vector databases

    queues

    background workers

    scheduled jobs

    deployment systems

    cloud infrastructure

    external service integrations

Each source should be identifiable so operational telemetry can be associated with the component that produced it.

---

## Operational Component Identity

PinkCurve should maintain stable identification for operational components.

A conceptual component identity may include:

    component_id

    component_type

    component_name

    product_or_capability

    service_name

    environment

    version

    deployment_id

    region                    where applicable

Potential component types may include:

    APPLICATION

    API

    SERVICE

    WORKER

    JOB

    DATABASE

    VECTOR_DATABASE

    QUEUE

    AI_SERVICE

    MODEL_ENDPOINT

    EXTERNAL_INTEGRATION

    INFRASTRUCTURE_COMPONENT

This allows Operational Data to answer:

> Which PinkCurve component produced this telemetry?

---

## Application and Service Logs

Application logs may include:

    log_id

    component_id

    service_name

    environment

    log_level

    message

    event_type

    request_id                optional

    trace_id                  optional

    correlation_id            optional

    user/entity reference     where appropriate and permitted

    error_id                  optional

    occurred_at

Potential log levels may include:

    DEBUG
    INFO
    WARNING
    ERROR
    CRITICAL

Logs should contain enough context to diagnose system behavior without unnecessarily exposing sensitive Buyer, Seller, Trust, security, or financial data.

---

## API Operational Data

API telemetry should allow PinkCurve to understand API health and performance.

Potential data may include:

    api_request_id

    component_id

    endpoint_id

    request_method

    response_status

    response_time

    request_size

    response_size

    authentication_result

    rate_limit_result

    error_id                  optional

    trace_id

    started_at
    completed_at

API telemetry may support measurements such as:

    request volume

    latency

    error rate

    availability

    timeout rate

    rate-limit activity

Operational API telemetry should not be confused with the business result produced by the API.

---

## Distributed Tracing and Correlation

PinkCurve operations may involve multiple services for a single request.

For example:

    Buyer Experience
        ↓
    AI Discovery
        ↓
    Buyer Intelligence
        ↓
    AI Platform
        ↓
    Model Endpoint
        ↓
    Discovery Result

Operational Data should allow these calls to be traced across services.

PinkCurve should therefore support concepts such as:

    request_id

    trace_id

    span_id

    parent_span_id

    correlation_id

Conceptually:

    trace_id = T100
        │
        ├── Buyer Experience
        │       span_id = SP1
        │
        ├── AI Discovery
        │       span_id = SP2
        │
        ├── Buyer Intelligence
        │       span_id = SP3
        │
        └── AI Platform
                span_id = SP4

This allows PinkCurve Operations to answer:

> Where did this request fail?

> Which service was slow?

> Which downstream service caused the problem?

---

## Job Execution Data

Background and scheduled jobs should be independently observable.

A conceptual Job Execution may include:

    job_execution_id

    job_type

    job_name

    component_id

    execution_status

    started_at

    completed_at

    duration

    records_processed

    records_failed

    retry_count

    error_id                  optional

    trace_id                  optional

Potential states may include:

    QUEUED

    RUNNING

    COMPLETED

    FAILED

    RETRYING

    CANCELLED

This is particularly important for data processing, analytics, learning, Billing, indexing, and other asynchronous PinkCurve workloads.

---

## Queue Operational Data

Queue state should be observable independently from the business records being processed.

Potential data may include:

    queue_id

    queue_name

    component_id

    queue_depth

    oldest_message_age

    processing_rate

    failure_rate

    retry_count

    dead_letter_count

    observed_at

This helps identify operational problems such as:

    processing backlog

    stalled workers

    excessive retries

    message-processing failures

    capacity shortages

---

## Deployment Data

Deployments should have stable:

    deployment_id

A conceptual Deployment record may include:

    deployment_id

    component_id

    version

    environment

    deployment_type

    deployed_at

    deployed_by

    deployment_status

    previous_version

    rollback_reference        optional

    configuration_version

    build_reference

This allows PinkCurve to correlate operational problems with software changes.

For example:

    deployment_id D100
        ↓
    AI Discovery v1.8
        ↓
    increased API error rate
        ↓
    Operational Alert
        ↓
    rollback

---

## Error Data

Important errors should be identifiable.

PinkCurve may consider:

    error_id

A conceptual Error record may include:

    error_id

    component_id

    error_type

    error_code

    severity

    message

    request_id                optional

    trace_id                  optional

    deployment_id             optional

    occurred_at

    first_seen_at

    last_seen_at

    occurrence_count

    resolution_status

    resolution_reference      optional

This allows repeated instances of the same operational problem to be correlated rather than treated only as unrelated log messages.

---

## Operational Metrics

Operational metrics may include:

    metric_id

    component_id

    metric_name

    metric_value

    metric_unit

    dimensions

    observed_at

Potential metrics include:

    request_count

    latency

    error_rate

    CPU utilization

    memory utilization

    storage utilization

    database connections

    queue depth

    job duration

    model inference latency

    token usage

    cache hit rate

    service availability

Metrics may be aggregated over time for monitoring and capacity planning.

---

## AI Operational Data

AI Platform requires additional Operational Data.

Potential AI telemetry may include:

    ai_service_id

    model_id

    model_version_id

    model_endpoint_id

    inference_id

    request_id

    trace_id

    inference_latency

    token_usage

    embedding_usage

    provider

    provider_request_id

    execution_status

    error_id

    cost

    generated_at

This operational telemetry should complement, not replace, the AI Platform data defined earlier in Chapter 11.

For example:

    model_id
        → identifies the Model

    model_version_id
        → identifies the Model version

    inference_id
        → identifies a Model execution

    trace_id
        → connects that execution to the larger
          operational request

---

## Operational Cost Telemetry

Operational Data should support technical cost visibility.

Potential cost telemetry may include:

    cost_event_id

    component_id

    service_type

    provider

    resource_type

    usage_quantity

    usage_unit

    estimated_cost

    currency

    observed_at

Potential cost categories may include:

    LLM inference

    embedding generation

    vector database

    database

    storage

    network

    compute

    external APIs

Cost telemetry helps PinkCurve understand:

    cost by product;

    cost by capability;

    cost by AI service;

    cost by infrastructure component;

    cost trends;

    unexpected cost increases.

This is operational cost information and should not be confused with Seller Billing.

---

## Operational Alerts

Operational telemetry may produce Alerts.

PinkCurve should consider:

    operational_alert_id

A conceptual Operational Alert may include:

    operational_alert_id

    component_id

    alert_type

    severity

    triggering_metric

    threshold

    observed_value

    status

    triggered_at

    acknowledged_at          optional

    resolved_at              optional

    incident_id              optional

Examples may include:

    API error rate too high

    service unavailable

    job repeatedly failing

    queue backlog excessive

    model endpoint unavailable

    database capacity high

    abnormal cost increase

---

## Operational Incident Identity

Multiple errors, alerts, logs, and metrics may belong to one operational incident.

PinkCurve should therefore consider:

    operational_incident_id

Conceptually:

    Logs
      +
    Errors
      +
    Metrics
      +
    Alerts
        ↓
    operational_incident_id
        ↓
    Investigation
        ↓
    Resolution

A conceptual Operational Incident may include:

    operational_incident_id

    incident_type

    severity

    affected_component_ids

    related_alert_ids

    related_error_ids

    deployment_id             optional

    opened_at

    incident_status

    assigned_to

    root_cause_reference      optional

    resolution_reference      optional

    resolved_at               optional

This provides operational history and supports reliability improvement.

---

## Operational Data Ownership

Operational Data should have clear ownership.

Individual PinkCurve products and services:

    generate operational telemetry.

Shared PinkCurve Platform / Operations capabilities:

    collect;
    store;
    monitor;
    correlate;
    alert;
    visualize;
    retain;
    govern

the Operational Data.

Conceptually:

    PinkCurve Products and Services
              ↓
       Operational Telemetry
              ↓
    Observability / Operations Platform
              ↓
       ┌──────┼────────┐
       ↓      ↓        ↓
     Logs   Metrics   Traces
       │      │        │
       └──────┼────────┘
              ↓
        Alerts / Incidents
              ↓
        PinkCurve Operations

The exact operational organization and tooling should be defined later during Platform and Operations design.

---

## Operational Data vs Product Analytics

The distinction between Operational Data and Product Analytics should remain explicit.

For example:

    Buyer views Offering
        ↓
    event_id
        ↓
    Discovery Analytics

answers:

> How are Buyers interacting with Offerings?

While:

    Buyer Experience API request
        ↓
    trace_id
        ↓
    API latency = 320 ms

answers:

> How well is the PinkCurve system serving the Buyer?

Similarly:

    CLICK_THROUGH event
        → Product / Discovery Data

while:

    Discovery API timeout
        → Operational Data

and:

    invoice generated
        → Billing Data

while:

    invoice-generation job failed
        → Operational Data

These domains may be correlated for troubleshooting, but they should not be treated as the same data.

---

## Relationship to Security Data

Operational Data and Security Data may overlap but should retain different ownership.

For example:

    API error
        → Operational Data

    unauthorized API access
        → Security Event

    slow database query
        → Operational Data

    suspicious database access
        → Security Event

Some Operational Data may become evidence for Trust & Safety or Security investigations.

That does not make all Operational Data Trust & Safety Data.

---

## Sensitive Operational Data

Operational logs and traces may accidentally contain sensitive information.

Operational telemetry should therefore avoid unnecessarily storing:

    passwords

    authentication tokens

    API keys

    payment credentials

    identity documents

    private Buyer information

    restricted Trust evidence

Sensitive values should be masked, redacted, tokenized, or excluded as appropriate.

Operational Data access should follow least-privilege principles.

---

## Retention

Different Operational Data may require different retention periods.

For example:

    high-volume debug logs
        → relatively short retention

    aggregated operational metrics
        → longer retention

    deployment history
        → longer retention

    incident records
        → longer operational history

    security-relevant evidence
        → Security retention policy

Exact retention periods should be defined during Operational Data Design.

---

## Operational Data Schema Overview

The logical Operational Data architecture may include:

    OPERATIONAL_COMPONENT
        component_id

    APPLICATION_LOG
        log_id

    API_REQUEST
        api_request_id

    TRACE
        trace_id

    JOB_EXECUTION
        job_execution_id

    QUEUE
        queue_id

    DEPLOYMENT
        deployment_id

    ERROR
        error_id

    OPERATIONAL_METRIC
        metric_id

    COST_EVENT
        cost_event_id

    OPERATIONAL_ALERT
        operational_alert_id

    OPERATIONAL_INCIDENT
        operational_incident_id

Not every concept necessarily requires a separate physical database table.

Logs, metrics, and traces may eventually use specialized observability storage rather than PinkCurve's primary transactional database.

---

## Architectural Requirement

Chapter 11 should establish:

> **Operational Data provides the technical evidence required to operate, monitor, troubleshoot, scale, and control PinkCurve systems and should remain logically separated from Product Analytics, business data, Billing data, and Trust & Safety data.**

Operational Data should identify:

- which component generated the telemetry;
- which environment and version were running;
- when the event occurred;
- which request, trace, job, or deployment it relates to;
- whether an error occurred;
- how the system performed;
- whether an Alert or Incident resulted;
- what technical resources and costs were consumed.

The exact observability technologies, monitoring platforms, log-storage systems, metric systems, tracing systems, alerting systems, dashboards, retention periods, and operational procedures should be determined during Platform and Operations System Design.

## Relationship to PinkCurve Operations

The detailed operational use of Operational Data belongs primarily in **Chapter 28 — PinkCurve Operations**.

Chapter 11 defines:

- what Operational Data exists;
- how it is identified;
- how it relates to PinkCurve products and technical components;
- its major data boundaries;
- its separation from Product Analytics and other authoritative data domains.

Chapter 28 should define how PinkCurve operationally uses this data, including monitoring, observability, alerting, incident response, deployment operations, service reliability, capacity management, cost monitoring, recovery, escalation, and human operational responsibilities.

Therefore:

    Chapter 11 — Data Architecture
        → defines Operational Data

    Chapter 28 — PinkCurve Operations
        → defines how PinkCurve uses Operational Data
          to operate and maintain the platform

**Audit Status: Strong concept but requires expansion — define Operational Data ownership, component identity, logs, API telemetry, distributed tracing, jobs, queues, deployments, errors, metrics, AI telemetry, cost telemetry, alerts, incidents, security boundaries, and separation from Product Analytics.**

---

# 48. Product Interfaces and Data Exchange — Major Gap; Shared Data Contract Architecture Required

The Chapter 11 Overview correctly states that Data Architecture defines how information is exchanged across PinkCurve.

However, product-to-product data exchange is not yet defined strongly enough.

PinkCurve is composed of multiple products and shared capabilities that depend on one another while retaining clear ownership of their own data and business behavior.

Examples include:

    Buyer Intelligence
        ↓
    Buyer Signals
        ↓
    AI Discovery

    Discovery Analytics
        ↓
    Analytical Results
        ↓
    Seller Intelligence

    Offering Knowledge
        ↓
    Structured Offering Knowledge
        ├──→ Creative Studio
        ├──→ AI Discovery
        └──→ Adaptive Metadata Navigation

    Learning Engine
        ↓
    Learning Outputs
        ├──→ AI Discovery
        ├──→ Buyer Intelligence
        ├──→ Seller Intelligence
        └──→ other consuming products

    Trust & Safety
        ↓
    Trust Decisions
        ├──→ Offering eligibility
        ├──→ Seller eligibility
        ├──→ Buyer handling
        ├──→ Discovery Analytics
        └──→ Billing Qualification

    Discovery Events
        ├──→ Discovery Analytics
        ├──→ Buyer Intelligence
        ├──→ Learning Engine
        └──→ Billing

These relationships are fundamental to PinkCurve architecture.

Detailed API endpoints, request protocols, message brokers, event-stream technologies, serialization formats, retry mechanisms, and service implementations belong in System Design.

However, Chapter 11 should establish the data architecture rules that every product interface must follow.

---

## Product Data Ownership

Every important data object exchanged between PinkCurve products should have an authoritative owner.

For example:

    Offering Knowledge
        → owns Structured Offering Knowledge

    Buyer Intelligence
        → owns Buyer Signals

    Seller Intelligence
        → owns Seller Signals, Seller Insights,
          Seller Opportunities, Seller Recommendations,
          Seller Alerts, Seller Reports,
          and Seller Value Intelligence

    Discovery Analytics
        → owns Analytical Results

    Learning Engine
        → owns Learning Outputs

    Trust & Safety
        → owns Trust Evaluations and Trust Decisions

    Billing
        → owns Billing Qualification,
          Billable Events, Invoice Items,
          Invoices, and Billing Adjustments

    AI Platform
        → owns technical AI service,
          model execution, model registry,
          inference, and related technical records

A consuming product may use another product's data but should not silently redefine or become authoritative for that data.

The fundamental principle should be:

> **The producing PinkCurve product owns the meaning and authoritative representation of the data it produces. Consuming products use that data according to an explicit interface contract.**

For example:

    Buyer Intelligence
        ↓
    buyer_signal_id
        ↓
    AI Discovery

AI Discovery may use the Buyer Signal when constructing Discovery Results.

AI Discovery should not modify the authoritative Buyer Signal maintained by Buyer Intelligence.

Similarly:

    Discovery Analytics
        ↓
    analytic_result_id
        ↓
    Seller Intelligence

Seller Intelligence may interpret the Analytical Result and create:

    seller_signal_id

but the original:

    analytic_result_id

remains owned by Discovery Analytics.

This creates a new Seller Intelligence object rather than changing the Analytical Result.

---

## Product Data Contract

Every important cross-product data exchange should have a defined logical data contract.

A conceptual Product Data Contract may identify:

    data_contract_id

    contract_name

    producer_product

    consuming_product

    data_object_type

    schema_version

    required_fields

    optional_fields

    identifier_requirements

    freshness_requirements

    validity_requirements

    privacy_classification

    security_classification

    authorization_requirements

    provenance_requirements

    compatibility_policy

    status

    effective_from

    effective_until              optional

The exact physical implementation of a contract registry is a later design decision.

The important requirement is that cross-product data exchange should not depend on undocumented assumptions.

---

## Stable Object Identity

Every independently meaningful object exchanged across PinkCurve products should preserve its stable identifier.

Examples include:

    offering_id

    creative_id

    campaign_id

    event_id

    session_id

    metadata_dimension_id
    metadata_value_id

    buyer_signal_id

    analytic_result_id

    learning_output_id

    seller_signal_id
    seller_insight_id
    seller_opportunity_id
    seller_recommendation_id

    technical_risk_result_id

    trust_evaluation_id
    trust_decision_id

    billing_qualification_id
    billable_event_id

A consuming product should be able to determine exactly which source object it received or used.

For example:

    analytic_result_id = AR500
        ↓
    Seller Intelligence
        ↓
    seller_signal_id = SS700

The relationship between:

    AR500
        ↓
    SS700

should remain explicit.

---

## Subject Identity

An exchanged data object should identify what PinkCurve entity it concerns where applicable.

The architecture should support concepts such as:

    subject_type
    subject_id

For example:

    buyer_signal_id = BS100

    subject_type = BUYER
    subject_id = B500

or:

    technical_risk_result_id = TR200

    subject_type = OFFERING
    subject_id = O700

or:

    analytic_result_id = AR300

    subject_type = OFFERING
    subject_id = O700

This prevents consumers from receiving intelligence without knowing what entity the intelligence describes.

Related identifiers may also be preserved where required.

For example:

    offering_id
    seller_id
    campaign_id
    creative_id

may provide important context even when only one is the primary subject.

---

## Data Object vs Transport Envelope

PinkCurve should distinguish the business or intelligence object from the mechanism used to transport it.

For example:

    Buyer Signal
        buyer_signal_id
        signal_type
        signal_value
        confidence
        ...

is the product-owned data object.

The interface may transport that object with additional exchange metadata such as:

    message_id

    producer

    schema_version

    correlation_id

    generated_at

    transmitted_at

These transport fields should not become part of the semantic meaning of Buyer Intelligence merely because they are required for system communication.

Conceptually:

    Product-Owned Data Object
              ↓
       Interface / Message
              ↓
        Consuming Product

This separation allows PinkCurve to change transport technologies without changing the meaning of its core data objects.

---

## Schema Versioning

Cross-product interfaces should preserve schema version.

For example:

    schema_version = 3

This allows consuming products to determine how to interpret the received object.

Conceptually:

    Buyer Intelligence
        ↓
    Buyer Signal Schema v3
        ↓
    AI Discovery

If Buyer Intelligence later introduces:

    Buyer Signal Schema v4

AI Discovery should not unexpectedly receive incompatible data.

The architecture should therefore support controlled schema evolution.

Important data contracts should define:

    schema_version

    backward compatibility expectations

    required fields

    optional fields

    deprecated fields

    effective date

Detailed schema-registry implementation belongs in System Design.

---

## Producer Identity

Cross-product data should identify the authoritative producer.

Potential concepts include:

    producer_product

    producer_component

    producer_version

For example:

    producer_product = BUYER_INTELLIGENCE

This allows the consuming product to determine where the data originated.

Producer identity is especially important when multiple products may produce superficially similar scores or Signals.

A:

    Buyer Signal

should not be confused with:

    Seller Signal

or:

    Trust Signal

simply because all three may contain fields such as:

    confidence
    signal_type
    signal_value

Their owning product gives those objects their semantic meaning.

---

## Consumer Identity

Interfaces should also define intended consumers.

For example:

    Learning Output
        ↓
    intended_consuming_product

as already identified in the Learning Engine audit.

A Learning Output may be intended for:

    AI Discovery

    Buyer Intelligence

    Seller Intelligence

    Offering Knowledge

or another supported PinkCurve product.

This prevents products from using intelligence outside the context for which it was created.

Where an object supports multiple products, the contract should define the permitted consumption and applicable context.

---

## Context

Many PinkCurve data objects are meaningful only within a particular context.

Cross-product exchange may therefore require:

    applicable_context

Potential context may include:

    discovery session

    Buyer

    Seller

    Offering

    category

    location

    Campaign

    Creative

    time period

    device context

    other domain context

For example:

    buyer_signal_id BS100
        signal_type = SHORT_TERM_INTEREST
        context = current discovery session

should not necessarily be interpreted as a permanent Buyer preference.

Context must travel with the data where it affects interpretation.

---

## Freshness and Validity

Cross-product data may have different lifetimes.

For example:

    Session Intent
        → very short lived

    Short-Term Buyer Interest
        → hours or days

    Persistent Buyer Preference
        → longer lived

    Trust Decision
        → valid until changed or expired

    Analytical Result
        → tied to measurement period

    Learning Output
        → tied to model/rule/version validity

Interfaces should therefore preserve concepts such as:

    generated_at

    observed_at

    valid_from

    valid_until

    freshness_status

    measurement_period

where applicable.

A consuming product should be able to determine whether the received information is still appropriate to use.

---

## Confidence and Quality

Where intelligence is probabilistic or inferred, the interface should preserve appropriate confidence or quality information.

Examples may include:

    confidence

    strength

    quality_status

    evaluation_status

A consuming product should not have to assume that every Signal or learned result has equal reliability.

However, the consuming product remains responsible for deciding how that confidence affects its own product behavior.

For example:

    Buyer Intelligence
        ↓
    Buyer Signal
        confidence = 0.82
        ↓
    AI Discovery

Buyer Intelligence owns the meaning and confidence of the Buyer Signal.

AI Discovery owns how much influence that Signal has on Discovery.

---

## Provenance

Important cross-product data should preserve provenance.

Potential provenance may include:

    source identifiers

    evidence references

    originating event_ids

    analytic_result_ids

    learning_output_ids

    model_version_ids

    rule_versions

    generation process

    producer version

This allows PinkCurve to trace how downstream results were created.

For example:

    event_id
        ↓
    analytic_result_id
        ↓
    seller_signal_id
        ↓
    seller_insight_id
        ↓
    seller_recommendation_id

The cross-product interfaces must preserve enough references for this lineage to remain reconstructable.

---

## Correlation and End-to-End Traceability

A single PinkCurve activity may cross several products.

For example:

    Buyer
        ↓
    Buyer Experience
        ↓
    Buyer Intelligence
        ↓
    AI Discovery
        ↓
    Offering Knowledge
        ↓
    AI Platform
        ↓
    Discovery Result

PinkCurve should support correlation across this execution.

Potential technical correlation concepts include:

    request_id

    correlation_id

    trace_id

These identifiers are operational rather than domain identifiers.

They complement, rather than replace:

    buyer_id
    offering_id
    buyer_signal_id
    event_id
    analytic_result_id

This allows PinkCurve to understand both:

    business lineage

and:

    technical execution lineage.

---

## Synchronous Data Exchange

Some product interactions may require immediate response.

For example:

    AI Discovery
        ↓
    request Buyer Signals
        ↓
    Buyer Intelligence
        ↓
    return Buyer Signals

or:

    Creative Studio
        ↓
    request Offering Knowledge
        ↓
    Offering Knowledge
        ↓
    return Structured Offering Knowledge

These may eventually use synchronous APIs.

Chapter 11 does not need to define those APIs.

However, the data contract should define what information is requested and what authoritative object is returned.

---

## Asynchronous Data Exchange

Other information may be distributed asynchronously.

For example:

    Discovery Event created
        ↓
    event_id
        ├──→ Discovery Analytics
        ├──→ Buyer Intelligence
        ├──→ Learning Engine
        └──→ Billing where eligible

The producing system should not necessarily need to wait for every consuming product to process the event.

This supports loose coupling among PinkCurve products.

Detailed event buses, queues, streaming platforms, delivery guarantees, and retry technologies belong in System Design.

---

## Event Identity and Delivery Identity

Where asynchronous exchange is used, PinkCurve should distinguish the domain event from the delivery/message record.

For example:

    event_id
        → identifies the Discovery Event

while:

    message_id
        → identifies a particular transport message

The same:

    event_id = E500

may potentially be delivered to several consumers through different messages.

Therefore:

    event_id
        ≠
    message_id

This distinction is important for retries, duplicate delivery, debugging, and lineage.

---

## Idempotency and Duplicate Processing

Cross-product exchange should anticipate retries and duplicate message delivery.

A consuming product should not accidentally create multiple authoritative records merely because the same message was received twice.

For example:

    event_id E500
        ↓
    message delivered
        ↓
    Billing receives E500

If delivery is retried:

    event_id E500
        ↓
    Billing receives E500 again

Billing should not create:

    BE100
    BE101

for the same qualified event merely because of transport retry.

Detailed idempotency implementation belongs in System Design, but Chapter 11 should establish that stable source identifiers must support duplicate detection and safe processing.

This is particularly important for:

    Billing

    Trust & Safety

    Learning

    Analytics

    Seller Intelligence

and other asynchronous consumers.

---

## Data Exchange Authorization

Not every product should have unrestricted access to every data domain.

For example:

    AI Discovery

may need:

    Offering eligibility

but should not necessarily receive:

    raw identity verification evidence

    fraud investigation notes

    restricted security evidence

Similarly:

    Seller Experience

may need:

    invoice_id
    invoice_date
    amount_due
    invoice_status

but should not receive internal Billing-control or Trust investigation data.

Interfaces should therefore enforce:

    authorized consumer

    permitted fields

    purpose

    privacy classification

    security classification

    access scope

Cross-product exchange should follow least-privilege principles.

---

## Sensitive Data Minimization

A producer should expose only the information required by the consuming product.

For example:

    Trust & Safety
        ↓
    Offering Eligibility = APPROVED
        ↓
    AI Discovery

may be sufficient.

AI Discovery should not require access to all:

    Trust Signals
    Technical Risk Results
    verification documents
    fraud evidence
    human investigation notes

simply to determine whether the Offering may participate in Discovery.

This principle reduces security and privacy risk.

---

## Failure Behavior

Cross-product interfaces should define how consuming products behave when required data is unavailable, stale, invalid, or incompatible.

Potential conditions include:

    producer unavailable

    timeout

    data not found

    stale data

    invalid schema version

    authorization failure

    incomplete data

    dependency failure

The correct behavior depends on the consuming product.

For example:

    Buyer Intelligence unavailable
        ↓
    AI Discovery

may potentially use a safe non-personalized fallback.

However:

    Trust Decision unavailable
        ↓
    Billing Qualification

may require a more conservative response depending on Billing policy.

The exact fallback behavior belongs in Product and System Design.

Chapter 11 should establish that interface contracts must define data-validity and failure expectations.

---

## Product Interface Examples

### Buyer Intelligence → AI Discovery

    buyer_id
        ↓
    Buyer Intelligence
        ↓
    buyer_signal_id(s)
        │
        ├── signal_type
        ├── signal_value
        ├── confidence
        ├── context
        ├── freshness
        └── provenance
        ↓
    AI Discovery
        ↓
    Discovery behavior

Buyer Intelligence owns the Buyer Signals.

AI Discovery owns how those Signals influence Discovery.

---

### Offering Knowledge → Creative Studio

    offering_id
        ↓
    Offering Knowledge
        ↓
    Structured Offering Knowledge
        │
        ├── Offering facts
        ├── attributes
        ├── metadata
        ├── source references
        ├── knowledge version
        └── provenance
        ↓
    Creative Studio
        ↓
    Creative development

Creative Studio consumes Offering Knowledge but does not become authoritative for Offering facts.

---

### Offering Knowledge → AI Discovery

    offering_id
        ↓
    Structured Offering Knowledge
        ↓
    AI Discovery
        ↓
    Candidate retrieval /
    ranking / presentation

AI Discovery uses authoritative Offering information without redefining Offering Knowledge ownership.

---

### Discovery Analytics → Seller Intelligence

    event_ids
        ↓
    Discovery Analytics
        ↓
    analytic_result_id
        │
        ├── analytic_id
        ├── analytic_version
        ├── measurement_period
        ├── subject_id
        └── result
        ↓
    Seller Intelligence
        ↓
    seller_signal_id /
    seller_insight_id /
    seller_opportunity_id /
    other Seller Intelligence output

The Analytical Result remains owned by Discovery Analytics.

Seller Intelligence owns the Seller interpretation derived from it.

---

### Learning Engine → Consuming Products

    Evidence
        ↓
    Learning Engine
        ↓
    learning_output_id
        │
        ├── output_type
        ├── intended_consuming_product
        ├── applicable_context
        ├── learned_value / model reference
        ├── confidence
        ├── evidence
        ├── version
        └── governance status
        ↓
    Consuming Product

The consuming product determines how the Learning Output affects its own behavior.

---

### Trust & Safety → Billing

    Trust Evidence
        ↓
    Trust Evaluation
        ↓
    trust_decision_id
        ↓
    Billing Qualification
        ↓
    billing_qualification_id

Billing consumes the appropriate Trust decision.

Billing should not independently reinterpret raw technical fraud or bot scores unless explicitly designed and governed to do so.

---

### Discovery Events → Multiple Consumers

    Discovery Event
        │
        │ event_id
        ↓
    Event Distribution
        │
        ├──→ Discovery Analytics
        │
        ├──→ Buyer Intelligence
        │
        ├──→ Learning Engine
        │
        └──→ Billing
              where Billing-eligible

Each consumer uses the same authoritative Discovery Event according to its own responsibility.

This is an important architectural pattern:

> **One authoritative event may support multiple products without each product creating its own incompatible version of what happened.**

---

## Cross-Product Data Lineage

PinkCurve should be able to reconstruct important data flows across product boundaries.

For example:

    offering_id
        ↓
    Offering Knowledge
        ↓
    Creative Studio
        ↓
    creative_id
        ↓
    Discovery
        ↓
    event_id
        ↓
    Discovery Analytics
        ↓
    analytic_result_id
        ↓
    Seller Intelligence
        ↓
    seller_signal_id
        ↓
    seller_insight_id
        ↓
    seller_recommendation_id

Another example:

    buyer_id
        ↓
    Buyer interactions
        ↓
    event_ids
        ↓
    Buyer Intelligence
        ↓
    buyer_signal_id
        ↓
    AI Discovery
        ↓
    Discovery Result
        ↓
    new event_id

And for Billing:

    event_id
        ↓
    Trust Decision
        +
    Billing Policy
        ↓
    billing_qualification_id
        ↓
    billable_event_id
        ↓
    invoice_item_id
        ↓
    invoice_id

These relationships should remain explicit enough to support auditing, debugging, learning, Customer Support, and operational investigation.

---

## Product Interface Boundary

Chapter 11 should define:

    authoritative data owner

    data object identity

    subject identity

    data relationships

    schema version

    context

    freshness

    provenance

    security classification

    permitted consumption

    lineage requirements

    basic exchange semantics

Detailed System Design should define:

    API endpoints

    request / response schemas

    authentication protocols

    service discovery

    message brokers

    event-stream technology

    serialization format

    caching

    timeout values

    retry policies

    delivery guarantees

    idempotency implementation

    rate limits

    deployment topology

This keeps Data Architecture and System Design clearly separated.

---

## Architectural Requirement

Chapter 11 should establish:

> **PinkCurve products exchange independently identifiable, versioned, traceable, appropriately authorized data objects through explicit data contracts while preserving authoritative product ownership and semantic meaning.**

A consuming product may:

    retrieve

    evaluate

    interpret

    combine

    derive new product-owned intelligence from

another product's output.

However, it should not silently redefine the authoritative meaning of the source data.

The general pattern should be:

    Producing Product
        │
        ↓
    Authoritative Data Object
        │
        ├── stable identifier
        ├── subject identity
        ├── schema version
        ├── context
        ├── freshness / validity
        ├── provenance
        ├── security classification
        └── lineage
        ↓
    Product Data Contract
        ↓
    Consuming Product
        ↓
    Consumer Product Decision /
    Behavior / Derived Data

This reinforces one of PinkCurve's central architectural principles:

> **PinkCurve products own product decisions and business behavior.**

The product that produces an authoritative data object owns its meaning.

The consuming product owns what it does with that information.

Detailed API and transport architecture should be defined later in PinkCurve System Design.

**Audit Status: Major gap — Chapter 11 should establish shared cross-product data-contract principles covering ownership, stable identity, subject identity, schema versioning, context, freshness, provenance, lineage, authorization, sensitive-data minimization, synchronous and asynchronous exchange, duplicate-safe processing, and clear separation between data architecture and transport implementation.**

---

# 49. Product Data Contracts — Important; Definition and Purpose Need Clarification

A Product Data Contract defines the agreed structure and meaning of data exchanged between PinkCurve products and capabilities.

When one PinkCurve product produces data that another product consumes, the consuming product should not have to guess:

- what the data represents;
- who owns it;
- what identifies it;
- which PinkCurve entity it concerns;
- which fields are required;
- what version of the data structure is being used;
- how current the information is;
- where the information came from;
- whether the consumer is authorized to use it.

The Product Data Contract provides this agreement.

Conceptually:

    Producing Product
        ↓
    Authoritative Data Object
        ↓
    Product Data Contract
        ↓
    Consuming Product

For example:

    Buyer Intelligence
        ↓
    Buyer Signal
        ↓
    Buyer Signal Data Contract
        ↓
    AI Discovery

The Buyer Signal remains owned by Buyer Intelligence.

The Data Contract defines how AI Discovery can correctly receive and interpret that Buyer Signal.

---

## Example — Buyer Signal Data Contract

A conceptual Buyer Signal Data Contract may define:

    contract_name
        BUYER_SIGNAL

    producer
        Buyer Intelligence

    data_owner
        Buyer Intelligence

    permitted_consumer
        AI Discovery

    primary_identifier
        buyer_signal_id

    subject_identifier
        buyer_id

    schema_version
        3

    required_fields
        buyer_signal_id
        buyer_id
        signal_category
        signal_type
        signal_value
        confidence
        generated_at

    optional_fields
        applicable_context
        evidence_reference
        expires_at

    freshness_requirement
        depends on signal category

    privacy_classification
        defined by Buyer Intelligence

    provenance_required
        yes

AI Discovery can then rely on this contract when consuming Buyer Signals.

---

## Example — Discovery Analytics to Seller Intelligence

Conceptually:

    Discovery Analytics
        ↓
    Analytical Result
        ↓
    Analytics Result Data Contract
        ↓
    Seller Intelligence

The contract may define:

    producer
        Discovery Analytics

    data_owner
        Discovery Analytics

    consumer
        Seller Intelligence

    primary_identifier
        analytic_result_id

    subject identifiers
        seller_id
        offering_id
        campaign_id
        creative_id
        where applicable

    analytic identity
        analytic_id
        analytic_version

    required fields
        analytic_result_id
        analytic_id
        analytic_version
        subject_type
        subject_id
        result
        measurement_period

    provenance
        supporting event / evidence references

Seller Intelligence may then use the Analytical Result to create:

    seller_signal_id

    seller_insight_id

    seller_opportunity_id

or other Seller Intelligence outputs.

The Analytical Result itself remains owned by Discovery Analytics.

---

## Example — Trust & Safety to Billing

Conceptually:

    Trust & Safety
        ↓
    Trust Decision
        ↓
    Trust Decision Data Contract
        ↓
    Billing

The contract may define:

    producer
        Trust & Safety

    data_owner
        Trust & Safety

    consumer
        Billing

    primary_identifier
        trust_decision_id

    subject identity
        subject_type
        subject_id

    required fields
        trust_decision_id
        decision_type
        decision
        policy_version
        effective_from
        status

    optional fields
        effective_until
        approved Billing-use indicator

    restricted fields
        internal investigation evidence
        sensitive verification evidence
        security evidence

This means Billing receives the Trust information it needs without receiving all sensitive Trust & Safety data.

---

## Core Product Data Contract Structure

Where appropriate, an important PinkCurve Product Data Contract should define:

    contract_id
    contract_name

    producer_product
    data_owner

    permitted_consumers

    data_object_type

    primary_identifier

    subject_type
    subject_identifier

    schema_version

    required_fields
    optional_fields

    generated_at

    freshness_requirements
    expiration_requirements

    provenance_requirements

    privacy_classification
    security_classification

    authorization_requirements

    confidence_requirements       where applicable

    source_version                where applicable
    model_version                 where applicable

    compatibility_expectations

    effective_from
    effective_until               optional

    contract_status

Not every Product Data Contract requires every field.

For example, `model_version` is relevant only when a Model result or Model-derived output needs that information.

Similarly, `confidence` is relevant to inferred or probabilistic intelligence but may not be meaningful for an Invoice.

---

## Data Contract Does Not Mean API

A Product Data Contract should not be confused with an API definition.

The Data Contract defines:

> What information is exchanged and what that information means.

System Design later defines:

> How that information is technically exchanged.

For example:

    Product Data Contract

        buyer_signal_id
        buyer_id
        signal_type
        signal_value
        confidence
        generated_at
        expires_at

does not determine whether PinkCurve uses:

    REST API

    event stream

    message queue

    internal service call

    another transport mechanism

Those are System Design decisions.

Therefore:

    Chapter 11 — Data Architecture
        ↓
    defines Product Data Contracts
        ↓
    System Design
        ↓
    defines APIs, messages, protocols,
    transport, retries, and implementation

---

## Contract Versioning

Product Data Contracts should be versioned.

For example:

    Buyer Signal Contract v1
        ↓
    Buyer Signal Contract v2
        ↓
    Buyer Signal Contract v3

This allows Buyer Intelligence to evolve without unexpectedly breaking AI Discovery.

For example, Buyer Intelligence may add a new optional field:

    signal_strength

without requiring immediate changes by every consumer.

A later incompatible change may require a new contract version.

Detailed compatibility and deployment procedures belong in System Design.

---

## Ownership Does Not Transfer

A Product Data Contract allows another product to consume data.

It does not transfer ownership of that data.

For example:

    Buyer Intelligence
        owns
    buyer_signal_id BS100

        ↓ Data Contract

    AI Discovery
        consumes
    BS100

AI Discovery may use BS100 to make a Discovery decision.

It does not become the owner of BS100.

Similarly:

    Discovery Analytics
        owns
    analytic_result_id AR500

        ↓

    Seller Intelligence
        consumes AR500
        and creates
    seller_signal_id SS700

The new Seller Signal belongs to Seller Intelligence.

The source Analytical Result remains owned by Discovery Analytics.

---

## Data Contract Relationships

The general PinkCurve pattern should therefore be:

    Product A
        │
        │ owns
        ↓
    Data Object A
        │
        │ governed by
        ↓
    Data Contract
        │
        │ consumed by
        ↓
    Product B
        │
        │ interprets according to
        │ Product B responsibility
        ↓
    Data Object B / Product Decision

For example:

    Discovery Analytics
        ↓
    analytic_result_id
        ↓
    Analytics Result Contract
        ↓
    Seller Intelligence
        ↓
    seller_signal_id

This preserves both interoperability and product ownership.

---

## Relationship to #48 Product Interfaces and Data Exchange

Section #48 establishes the overall rules for cross-product data exchange.

Section #49 defines the specific agreement governing the data object being exchanged.

Therefore:

    #48 Product Interfaces and Data Exchange
        → How PinkCurve products exchange data
          and the architectural rules governing exchange

    #49 Product Data Contracts
        → What each exchanged data object must contain
          and what producer and consumer agree it means

The two sections are related but serve different purposes.

---

## Architectural Requirement

Chapter 11 should establish:

> **Important data exchanged between PinkCurve products should have an explicit Product Data Contract defining ownership, identity, subject identity, schema version, required and optional information, validity, provenance, security classification, authorization, and compatibility expectations.**

The contract should allow the consuming product to correctly interpret the data without assuming undocumented meaning.

Product Data Contracts should preserve the architectural principle:

> **The producing product owns the authoritative data object and its meaning. The consuming product owns how that information affects its own product decisions and behavior.**

Detailed API specifications and transport implementations belong in System Design.

**Audit Status: Important addition — define Product Data Contracts clearly and distinguish the semantic agreement between products from the APIs and transport mechanisms that will implement the exchange.**

---

# 50. API Exchange vs Event Exchange — Needs Stronger Definition

PinkCurve will require both synchronous API-based data exchange and asynchronous event-based data exchange.

These mechanisms serve different architectural purposes and should not be treated as interchangeable.

The fundamental distinction is:

    API Exchange
        → A product asks another product
          for information or capability
          when it is needed.

    Event Exchange
        → A product records that something
          happened and makes that fact
          available to interested consumers.

Both mechanisms should follow the Product Data Contract principles defined earlier.

Detailed API protocols, event-stream technologies, message brokers, retry implementations, delivery guarantees, and infrastructure belong in System Design.

Chapter 11 should define when each exchange pattern is appropriate and what data relationships must be preserved.

---

## API Exchange

API Exchange is appropriate when one PinkCurve product needs information or a capability from another product and normally requires a response.

Conceptually:

    Requesting Product
        ↓
    API Request
        ↓
    Owning Product / Capability
        ↓
    Product Logic
        ↓
    Authoritative Result
        ↓
    API Response
        ↓
    Requesting Product

For example:

    AI Discovery
        ↓
    requests current Buyer Signals
        ↓
    Buyer Intelligence
        ↓
    retrieves / determines applicable
    Buyer Signals
        ↓
    returns Buyer Signals
        ↓
    AI Discovery

This answers:

> What does Buyer Intelligence currently know about this Buyer in the applicable context?

The returned Buyer Signals remain owned by Buyer Intelligence.

AI Discovery consumes them and determines how they affect Discovery.

---

## API Request Identity

An API request should have sufficient identity and context to determine what is being requested.

For example:

    api_request_id

    requesting_product

    requested_capability

    subject_type
    subject_id

    context

    requested_at

    correlation_id             where applicable

    trace_id                   where applicable

The exact API request schema belongs in System Design.

However, Chapter 11 should establish that requests must preserve sufficient subject and context identity.

For example:

    AI Discovery
        ↓
    Buyer Intelligence request

        buyer_id = B100
        context = current discovery session

        ↓
    Buyer Intelligence
        ↓
    buyer_signal_id BS500
    buyer_signal_id BS501

AI Discovery now knows exactly which Buyer and context the returned Signals describe.

---

## API Response Identity

Important objects returned through an API should preserve their authoritative identifiers.

For example:

    Buyer Intelligence
        ↓
    API Response
        │
        ├── buyer_signal_id BS500
        ├── buyer_signal_id BS501
        └── schema_version
        ↓
    AI Discovery

The API response should not create anonymous copies of Buyer Signals that cannot be traced back to Buyer Intelligence.

The same principle applies to:

    offering_id

    creative_id

    analytic_result_id

    learning_output_id

    seller_signal_id

    trust_decision_id

and other authoritative PinkCurve objects.

---

## API Exchange for Capability Execution

APIs may also request a capability rather than simply retrieve existing data.

For example:

    Creative Studio
        ↓
    requests AI generation
        ↓
    AI Platform
        ↓
    executes appropriate AI service
        ↓
    returns technical generation result
        ↓
    Creative Studio

or:

    AI Discovery
        ↓
    requests model inference
        ↓
    AI Platform
        ↓
    Model Endpoint
        ↓
    inference result
        ↓
    AI Discovery

This reflects the Chapter 10 architectural principle:

> **AI Platform provides technical intelligence capabilities. The consuming PinkCurve product owns what that intelligence means and what PinkCurve does with it.**

Therefore API Exchange may support both:

    Data Retrieval

and:

    Capability Execution

depending on the interface.

---

## Event Exchange

Event Exchange is appropriate when PinkCurve needs to preserve the fact that something occurred and potentially allow multiple downstream products to consume that fact independently.

For example:

    Buyer
        ↓
    selects Metadata
        ↓
    Discovery Event created
        │
        │ event_id
        ↓
    Event Distribution
        │
        ├──→ Discovery Analytics
        ├──→ Buyer Intelligence
        └──→ Learning Engine

The Discovery Event answers:

> What happened?

The event should represent a historical fact rather than a request for another product to perform an immediate action.

---

## Event Identity

Every important PinkCurve domain event should have a stable:

    event_id

A conceptual event may include:

    event_id

    event_type

    subject_type
    subject_id

    buyer_id                  where applicable

    seller_id                 where applicable

    offering_id               where applicable

    creative_id               where applicable

    campaign_id               where applicable

    session_id                where applicable

    metadata references       where applicable

    event_context

    occurred_at

    source_product

    source_component

    schema_version

    provenance_reference

The exact event schema depends on the event type.

The important architectural requirement is that the event remains identifiable and traceable.

---

## Event Type

The event must identify what occurred.

Potential Discovery Event types may include:

    OFFERING_IMPRESSION

    OFFERING_VIEW

    OFFERING_EXPLORE

    OFFERING_SKIP

    AMN_SELECTION

    SEARCH

    NAVIGATION

    CREATIVE_VIEW

    CREATIVE_INTERACTION

    CLICK_THROUGH

    BUYER_FEEDBACK

    RATING

    REVIEW

Other PinkCurve domains may define additional event types.

`event_type` is important because different consumers may respond differently to the same event stream.

For example:

    CLICK_THROUGH
        ├──→ Discovery Analytics
        ├──→ Buyer Intelligence
        ├──→ Learning Engine
        └──→ Billing
              if Billing-eligible

while:

    AMN_SELECTION
        ├──→ Discovery Analytics
        ├──→ Buyer Intelligence
        └──→ Learning Engine

but may not be relevant to Billing.

---

## One Event, Multiple Consumers

A major advantage of Event Exchange is that one authoritative event may support multiple PinkCurve products.

Conceptually:

                       event_id E100
                             │
              ┌──────────────┼───────────────┐
              ↓              ↓               ↓
        Buyer Intelligence  Analytics      Learning
              ↓              ↓               ↓
       buyer_signal_id   analytic_result   learning_output

---

# 51. Source of Truth — Major Expansion Required

The Source of Truth definition should be expanded to reflect the full PinkCurve Data Architecture.

As PinkCurve products exchange and derive information from one another, the architecture must identify which product, capability, or data store owns the authoritative representation of each important data concept.

Without this distinction, multiple products may create competing versions of the same information.

The fundamental principle should be:

> **Every important PinkCurve data concept should have one clearly identified authoritative source. Other products may consume, cache, analyze, derive from, or reference that data, but they should not silently become an alternative Source of Truth.**

For example:

    Buyer Intelligence
        → owns Buyer Signals

    AI Discovery
        → consumes Buyer Signals

AI Discovery may use Buyer Signals when constructing Discovery Results, but Buyer Intelligence remains the Source of Truth for those Signals.

Similarly:

    Discovery Analytics
        → owns Analytical Results

    Seller Intelligence
        → consumes Analytical Results
        → creates Seller Intelligence outputs

Seller Intelligence becomes the Source of Truth for the Seller Signals or Seller Insights it creates, but it does not become the Source of Truth for the underlying Analytical Result.

---

## Source of Truth by Data Domain

| Data Concept | Authoritative Source | Important Identity / Reference |
| --- | --- | --- |
| Buyer identity | Buyer Account / Identity system | `buyer_id` |
| Seller identity | Seller Account / Identity system | `seller_id` |
| Organization identity | Organization Account / Identity system | `organization_id` |
| Buyer account state | Buyer Account system | `buyer_id` |
| Seller account state | Seller Account system | `seller_id` |
| Organization account state | Organization Account system | `organization_id` |
| Offering existence and identity | Offering record | `offering_id` |
| Offering ownership | Offering record | `offering_id`, `seller_id` |
| Structured Offering Knowledge | Offering Knowledge | `offering_id`, knowledge version |
| Seller-provided Offering facts | Offering Knowledge source record | `offering_id`, source reference |
| Offering source / provenance | Offering Knowledge | `offering_id`, source/provenance reference |
| Metadata Dimension | Metadata / AMN domain | `metadata_dimension_id` |
| Metadata Value | Metadata / AMN domain | `metadata_value_id` |
| Offering Metadata assignment | Metadata / Offering Knowledge relationship | `offering_id`, `metadata_value_id` |
| AMN navigation definition / state | Adaptive Metadata Navigation | AMN/navigation identifiers as defined |
| Creative identity | Creative Studio | `creative_id` |
| Creative metadata | Creative Studio | `creative_id` |
| Creative Package | Creative Studio | `creative_id` / Creative Package identity |
| Creative media binary | Authoritative object/media storage | storage object reference + `creative_id` |
| Campaign identity | Campaign / Creative domain | `campaign_id` |
| Campaign configuration | Owning Campaign capability | `campaign_id` |
| Discovery Session | Discovery / Buyer Experience event domain | `session_id` |
| Discovery Event | Authoritative Discovery Event store | `event_id` |
| Discovery Event type | Discovery Event record | `event_id`, `event_type` |
| Buyer Feedback | Buyer Feedback domain | `feedback_id` |
| Buyer Review | Review domain | `review_id` |
| Buyer Rating | Rating domain | `rating_id` |
| Discovery analytic definition | Discovery Analytics | `analytic_id`, analytic version |
| Discovery Analytical Result | Discovery Analytics | `analytic_result_id` |
| Discovery Metric | Discovery Analytics | metric identifier / analytic reference |
| QOV definition | Discovery Analytics | QOV definition/version |
| QOV Result | Discovery Analytics | QOV result/analytic result identifier |
| Buyer Signal | Buyer Intelligence | `buyer_signal_id` |
| Buyer Intelligence state / derived intelligence | Buyer Intelligence | Buyer Intelligence identifiers |
| Seller Signal | Seller Intelligence | `seller_signal_id` |
| Seller Insight | Seller Intelligence | `seller_insight_id` |
| Seller Opportunity | Seller Intelligence | `seller_opportunity_id` |
| Seller Recommendation | Seller Intelligence | `seller_recommendation_id` |
| Seller Alert | Seller Intelligence | `seller_alert_id` |
| Seller Report | Seller Intelligence | Seller Report identifier |
| Seller Value Intelligence | Seller Intelligence | Seller Value Intelligence identifier |
| Recommendation Outcome Evidence | Seller Intelligence | outcome/evidence identifier |
| Learning Output | Learning Engine | `learning_output_id` |
| Purpose-specific learned model produced by Learning Engine | Learning Engine | learned model / learning output reference |
| Model identity | AI Platform Model Registry | `model_id` |
| Model version | AI Platform Model Registry | `model_version_id` |
| Model deployment | AI Platform | `model_deployment_id` |
| Model endpoint / serving state | AI Platform | model endpoint identifier |
| AI service definition | AI Platform | `ai_service_id` |
| AI inference execution | AI Platform | `inference_id` |
| Embedding representation | AI Platform / owning embedding service | embedding identifier + source entity/version |
| Vector index technical state | AI Platform / Vector infrastructure | vector index identifier/version |
| Seller Verification | Trust & Safety | `seller_verification_id` |
| Buyer Verification | Trust & Safety | `buyer_verification_id` |
| Organization Verification | Trust & Safety | `organization_verification_id` |
| Offering Verification | Trust & Safety | `offering_verification_id` |
| Trust Signal | Trust & Safety | `trust_signal_id` |
| Technical Risk Result | Trust / Risk capability | `technical_risk_result_id`, `subject_type`, `subject_id` |
| Trust Evaluation | Trust & Safety | `trust_evaluation_id` |
| Trust Decision | Trust & Safety | `trust_decision_id` |
| Fraud Case | Trust & Safety | `fraud_case_id` |
| Abuse Report | Trust & Safety | abuse-report identifier |
| Moderation Action | Trust & Safety | `moderation_action_id` |
| Security Event | Security / Trust domain | `security_event_id` |
| Billing Event-Type Eligibility Policy | Billing | Billing policy identifier/version |
| Billing Qualification | Billing | `billing_qualification_id` |
| Billable Event | Billing | `billable_event_id` |
| Pricing Rule used for Billing | Pricing / Billing policy authority | `pricing_rule_id`, pricing-rule version |
| Seller Billing Account | Billing | `seller_billing_account_id` |
| Invoice Item | Billing | `invoice_item_id` |
| Invoice | Billing | `invoice_id`, `invoice_number` |
| Billing Adjustment / Credit | Billing | `billing_adjustment_id` |
| Payment transaction status | Payment provider + PinkCurve Billing record | provider payment reference + `invoice_id` |
| Customer Support Case | Customer Support | `support_case_id` |
| Product Data Contract | Data Architecture / interface governance | `data_contract_id`, contract version |
| Operational component identity | Platform / Operations | `component_id` |
| Deployment record | Platform / Operations | `deployment_id` |
| Application / service logs | Observability / Operations platform | `log_id` or platform-native identity |
| API operational telemetry | Observability / Operations platform | `api_request_id`, `trace_id` |
| Operational metric | Observability / Operations platform | metric identity |
| Trace | Observability / Operations platform | `trace_id` |
| Job execution | Platform / Operations | `job_execution_id` |
| Operational Error | Platform / Operations | `error_id` |
| Operational Alert | Platform / Operations | `operational_alert_id` |
| Operational Incident | PinkCurve Operations | `operational_incident_id` |
| Operational cost telemetry | Platform / Operations | `cost_event_id` or provider cost reference |

The exact names of some identifiers should be finalized during detailed Data Design.

The architectural requirement is more important than the eventual physical table name: every independently meaningful authoritative object should be identifiable and have a clearly defined owner.

---

## Source of Truth Does Not Mean Only Copy

Source of Truth does not mean that only one physical copy of the data may exist.

PinkCurve may use:

    caches

    search indexes

    vector indexes

    analytical stores

    data warehouses

    replicas

    materialized views

    local product caches

    derived datasets

for performance and specialized processing.

For example:

    Offering Knowledge
        │
        │ authoritative
        ↓
    Structured Offering Knowledge
        │
        ├──→ Search Index
        ├──→ Vector Index
        ├──→ AI Discovery cache
        └──→ Analytics storage

The additional representations may improve retrieval and performance.

They do not become the authoritative Source of Truth for Offering Knowledge.

If disagreement occurs:

    Authoritative Offering Knowledge
        wins

subject to controlled correction and governance processes.

---

## Authoritative Source vs Derived Data

Derived data should normally have its own Source of Truth once it becomes an independently meaningful PinkCurve object.

For example:

    Discovery Event
        │
        │ Source of Truth:
        │ Discovery Event Store
        ↓
    Discovery Analytics
        ↓
    analytic_result_id
        │
        │ Source of Truth:
        │ Discovery Analytics
        ↓
    Seller Intelligence
        ↓
    seller_signal_id
        │
        │ Source of Truth:
        │ Seller Intelligence
        ↓
    seller_insight_id
        │
        │ Source of Truth:
        │ Seller Intelligence
        ↓
    seller_recommendation_id

Each derived object has its own meaning and ownership.

The fact that an object was derived from another object does not mean that the original source remains authoritative for the meaning of the derived object.

Instead, lineage connects them.

---

## Source of Truth and Lineage

Source of Truth and lineage should work together.

For example:

    event_id E100
        │
        │ authoritative:
        │ Discovery Event Store
        ↓
    analytic_result_id AR200
        │
        │ authoritative:
        │ Discovery Analytics
        ↓
    seller_signal_id SS300
        │
        │ authoritative:
        │ Seller Intelligence
        ↓
    seller_insight_id SI400
        │
        │ authoritative:
        │ Seller Intelligence
        ↓
    seller_recommendation_id SR500

PinkCurve should be able to determine:

    where each object is authoritative;

    what source objects contributed to it;

    which product produced it;

    which version of the producing logic was used;

    which downstream objects consumed or derived from it.

This provides both ownership and explainability.

---

## Source of Truth for Technical Risk

Technical Risk Results require particular clarity.

For example:

    seller_id S100
        ↓
    Trust / Risk Analysis
        ↓
    technical_risk_result_id TR200

The authoritative Technical Risk Result should preserve:

    technical_risk_result_id

    subject_type = SELLER
    subject_id = S100

    risk_type

    result / score / classification

    evidence references

    model / rule references

    generated_at

The Trust / Risk capability is authoritative for that Technical Risk Result.

AI Platform may have executed the underlying model:

    inference_id I500

but:

    inference_id I500
        ≠
    technical_risk_result_id TR200

AI Platform is authoritative for the technical Model execution.

Trust / Risk is authoritative for the Technical Risk Result and its Trust-domain meaning.

This preserves the boundary established earlier in Chapter 11.

---

## Source of Truth for Verification

Verification records should remain authoritative within Trust & Safety.

For example:

    offering_verification_id OV100
        ↓
    trust_signal_ids
        ↓
    technical_risk_result_ids
        ↓
    trust_evaluation_id TE200
        ↓
    trust_decision_id TD300
        ↓
    verification_status = APPROVED

Trust & Safety is authoritative for:

    offering_verification_id

and its resulting:

    verification_status.

AI Discovery may consume:

    Offering eligible = YES

but AI Discovery should not independently redefine the Offering's authoritative Verification state.

---

## Source of Truth for Billing

Billing requires especially strict Source of Truth rules because financial records must remain auditable.

Conceptually:

    event_id
        │
        │ Source:
        │ Discovery Event Store
        ↓
    billing_qualification_id
        │
        │ Source:
        │ Billing
        ↓
    billable_event_id
        │
        │ Source:
        │ Billing
        ↓
    invoice_item_id
        │
        │ Source:
        │ Billing
        ↓
    invoice_id
        │
        │ Source:
        │ Billing

Discovery Analytics should not become the Source of Truth for a financial charge.

Trust & Safety should not become the Source of Truth for a financial charge.

The Payment Provider should not become the Source of Truth for why PinkCurve charged a Seller.

Billing owns PinkCurve's financial qualification and Invoice meaning.

The Payment Provider is authoritative for the payment transaction it executes.

This distinction allows PinkCurve to answer separately:

    Why did we charge the Seller?
        → Billing

    Was the Invoice paid?
        → Billing payment state supported by
          payment-provider transaction evidence

    What payment transaction occurred?
        → Payment Provider

---

## Source of Truth for AI Models and Learning

The relationship between Learning Engine and AI Platform should also remain explicit.

For example:

    Learning Engine
        ↓
    learned output / purpose-specific learned model
        ↓
    approved for operational use
        ↓
    AI Platform
        ↓
    registered / deployed / served model

The Learning Engine may be authoritative for:

    why the learned output was created;

    supporting evidence;

    learning evaluation;

    intended consuming product;

    learning governance state.

AI Platform becomes authoritative for:

    registered model identity;

    deployed model version;

    serving endpoint;

    technical deployment state;

    inference execution.

Therefore, the same Model lifecycle may contain different authoritative records at different stages.

This is not duplication if the ownership boundaries are explicit.

---

## Source of Truth for Embeddings and Vector Data

Embeddings and Vector indexes should not become authoritative for the source content they represent.

For example:

    Offering Knowledge
        │
        │ authoritative source
        ↓
    Offering Knowledge source/version
        ↓
    Embedding
        ↓
    Vector Index

The embedding should preserve references such as:

    source_entity_type

    source_entity_id

    source_version

    source_location / source_reference

    embedding_model_id

    embedding_model_version

    generated_at

The Vector representation is derived.

If the underlying Offering Knowledge changes, the authoritative Offering Knowledge remains the Source of Truth and the derived embedding/vector representation may need to be regenerated.

---

## Source of Truth for Product Data Contracts

Cross-product exchange should also have an authoritative contract definition.

For example:

    Buyer Intelligence
        ↓
    Buyer Signal
        ↓
    Buyer Signal Data Contract
        ↓
    AI Discovery

The Product Data Contract defines:

    producer

    owner

    consumer

    object identity

    required fields

    schema version

    validity

    authorization

    compatibility expectations.

The consuming product should not maintain a conflicting interpretation of the contract.

Contract ownership and governance should be defined as part of PinkCurve Data Architecture and later System Design governance.

---

## Source of Truth vs Current State

Source of Truth should not be confused with a snapshot of current state.

For example:

    Trust Decision TD100
        ↓
    APPROVED

may later be superseded by:

    Trust Decision TD200
        ↓
    RESTRICTED

Both decisions may remain historically authoritative records.

The current Trust state may be:

    RESTRICTED

Therefore PinkCurve may need both:

    authoritative historical records

and:

    authoritative current state.

The same principle may apply to:

    Verification

    Billing

    Seller account state

    Buyer account state

    Model deployments

    Pricing Rules

    Product Data Contracts

and other versioned or lifecycle-managed data.

---

## Versioned Sources of Truth

Where authoritative information changes over time, the architecture should preserve version or effective-period information.

Examples include:

    Offering Knowledge version

    analytic version

    QOV definition version

    Learning Output version

    Model version

    Trust policy version

    Pricing Rule version

    Product Data Contract version

This allows PinkCurve to determine not only:

> What is authoritative now?

but also:

> What was authoritative when this historical decision or result was created?

This is especially important for:

    Billing

    Trust decisions

    Learning

    AI model execution

    Analytics

    Seller Intelligence

    audits

and Customer Support investigations.

---

## Conflicting Data

If two PinkCurve systems contain conflicting representations of the same authoritative concept, the defined Source of Truth should determine which representation governs.

For example:

    Seller Experience cache:
        invoice_status = OPEN

    Billing:
        invoice_status = PAID

Billing is authoritative.

The Seller Experience cache should be refreshed or corrected.

Similarly:

    AI Discovery cache:
        Offering eligible = YES

    Trust & Safety:
        Offering eligibility = RESTRICTED

Trust & Safety is authoritative for the Trust eligibility state.

AI Discovery should update its derived/cached state.

Source-of-Truth ownership therefore supports data consistency and recovery from stale or conflicting representations.

---

## Source of Truth Does Not Transfer Through Consumption

When Product B consumes data from Product A, ownership does not automatically transfer.

Conceptually:

    Product A
        │
        │ owns
        ↓
    Object A
        ↓
    Data Contract
        ↓
    Product B
        │
        │ consumes Object A
        │
        │ derives
        ↓
    Object B

Product A remains authoritative for Object A.

Product B becomes authoritative for Object B.

For example:

    Buyer Intelligence
        │
        │ owns
        ↓
    buyer_signal_id
        ↓
    AI Discovery
        │
        │ consumes
        ↓
    Discovery decision / result

or:

    Discovery Analytics
        │
        │ owns
        ↓
    analytic_result_id
        ↓
    Seller Intelligence
        │
        │ derives
        ↓
    seller_signal_id

This prevents ownership ambiguity across PinkCurve products.

---

## Source of Truth and Operational Data

Operational Data follows the same principle.

For example:

    Product service
        ↓
    emits telemetry
        ↓
    Observability / Operations Platform
        ↓
    authoritative operational record

The product's business database should not necessarily become the Source of Truth for:

    logs

    traces

    operational metrics

    operational alerts

or:

    operational incidents.

Operational systems may use specialized stores appropriate for those data types.

Detailed operational use belongs primarily in Chapter 28 — PinkCurve Operations.

---

## Source of Truth Architectural Map

At a high level:

    Identity Systems
        → Buyer / Seller / Organization Identity

    Offering Knowledge
        → Offering Knowledge

    Adaptive Metadata Navigation / Metadata Domain
        → Metadata and navigation definitions

    Creative Studio
        → Creatives and Creative Packages

    Discovery Event Store
        → Discovery Events

    Discovery Analytics
        → Analytics and QOV

    Buyer Intelligence
        → Buyer Signals

    Seller Intelligence
        → Seller Intelligence outputs

    Learning Engine
        → Learning Outputs

    AI Platform
        → Models, deployments, AI services,
          endpoints, and inference execution

    Trust & Safety
        → Verification, Trust Signals,
          Trust Evaluations and Trust Decisions

    Trust / Risk
        → Technical Risk Results

    Billing
        → Billing Qualification, Billable Events,
          Invoice Items, Invoices and Adjustments

    Customer Support
        → Support Cases

    Observability / Operations
        → Operational telemetry and incidents

Each authoritative domain may provide its data to other products through the Product Interfaces and Product Data Contracts defined earlier.

---

## Architectural Requirement

Chapter 11 should establish:

> **Every important PinkCurve data concept must have a clearly defined authoritative source. Derived data, cached data, replicated data, indexed data, analytical copies, vector representations, and downstream product consumption must not create competing Sources of Truth.**

Where a product derives a new independently meaningful object from another product's data, the new object may have its own Source of Truth while preserving lineage to the original source.

PinkCurve should therefore be able to answer for every important data object:

    What is this object?

    What identifies it?

    Which product or capability owns it?

    Where is its authoritative representation?

    Which source data produced it?

    Which version was authoritative at the time?

    Which products consume it?

    Which derived objects came from it?

    What happens if another copy disagrees?

These Source-of-Truth rules should become foundational requirements for later PinkCurve Data Design and System Design.

**Audit Status: Major expansion required — the Source of Truth table should become a central Chapter 11 reference defining authoritative ownership, identity, derived-data boundaries, versioning, lineage, conflict resolution, and cross-product consumption for PinkCurve's major data domains.**

---

# 52. Data Traceability — Limited Requirement; Broader Capability Deferred

PinkCurve does not currently require a general-purpose Data Traceability or Data Lineage system.

A broad traceability system would introduce additional storage, relationship maintenance, operational complexity, and implementation cost.

At the current Product Blueprint stage, most important support and operational questions can be answered through the authoritative records already maintained by each PinkCurve product.

For Billing, traceability should remain focused on the financial chain:

    invoice_id
        ↓
    invoice_item_id
        ↓
    billable_event_id
        ↓
    billing_qualification_id
        ↓
    event_id

This allows PinkCurve and the Seller to determine:

- what was billed;
- which Billing Item produced the charge;
- whether the Billing Item was qualified as valid;
- which Discovery Event was associated with the charge;
- which Pricing Rule applied.

Billing should validate Billable Events before they become Invoice Items.

Therefore, PinkCurve does not require a separate general lineage record for every Invoice.

For Seller, Buyer, Organization, and Offering verification, Customer Support should normally rely on authoritative Trust & Safety records such as:

    verification_id
    verification_status
    trust_decision_id
    decision_reason
    review_status

A full trace through every Trust Signal, Risk Result, Model execution, and source event is not required for ordinary Customer Support.

Detailed evidence should remain available only where needed for:

- Trust & Safety investigation;
- fraud investigation;
- security review;
- Billing dispute;
- engineering debugging;
- legal or regulatory requirements.

The architectural principle should therefore be:

> **PinkCurve should preserve necessary references inside authoritative product records, but should not build a separate generalized Data Traceability system unless future operational, regulatory, debugging, or scale requirements justify it.**

Detailed cross-product lineage, lineage graphs, automated dependency analysis, and centralized traceability infrastructure should be deferred.

**Audit Status: Simplify and defer — retain only domain-specific traceability required for Billing, Trust & Safety, AI/model governance, and other high-value cases. A generalized Data Traceability capability is not currently required.**

---

# 53. Schema Strategy — Strong

Chapter 11 correctly recognizes:

- database schemas;
- API schemas;
- JSON Schema;
- event schemas;
- validation models.

Schemas should define:

- fields;
- types;
- constraints;
- relationship;
- versions;
- meaning;
- ownership.

---

# 54. Schema Evolution — Strong

Schema changes should favor:

- backward-compatible additions;
- explicit versioning;
- controlled migration;
- incremental backfill;
- controlled deprecation of obsolete fields or versions;
- testing;
- rollback where practical.

This becomes especially important when multiple products depend on shared data contracts.

---

# 55. Data Validation — Strong

Validation should continue at multiple levels:

    Client
        ↓
    API
        ↓
    Domain / Semantic Validation
        ↓
    Database
        ↓
    Pipeline

Client validation improves usability but cannot be trusted for security.

---

# 56. Data Quality — Strong

Important dimensions include:

- Completeness;
- Accuracy;
- Consistency;
- Freshness;
- Uniqueness;
- Validity;
- Provenance;
- Integrity.

Chapter 11 correctly avoids premature universal quality targets.

---

# 57. Data Observability — Strong

Current Data Observability considerations include:

- missing events;
- volume anomalies;
- schema failures;
- pipeline latency;
- stale data;
- duplicates;
- null-rate changes;
- broken relationships;
- vector freshness;
- analytical discrepancies;
- Billing reconciliation failures.

PinkCurve-specific Data Observability should also consider:

- Buyer Signal schema failure;
- Seller Signal freshness failure;
- Model version mismatch;
- Offering Knowledge version mismatch;
- Event contract rejection.

Data Observability should identify problems with the health, quality, freshness, consistency, and movement of PinkCurve data.

Detailed monitoring, alerting, dashboards, incident response, escalation, and operational procedures belong primarily in **Chapter 28 — PinkCurve Operations**.

---

# 58. Data Ownership — Major Revision Required

The current Data Ownership model should be revised to use explicit PinkCurve products and authoritative domains rather than generic organizational labels such as:

    Product + Engineering
    Discovery / Analytics
    ML / Engineering

These labels describe teams or functions that may participate in building or operating PinkCurve, but they do not clearly establish ownership of the data itself.

Chapter 11 should distinguish:

    Logical Data Owner
        → the PinkCurve product or domain responsible
          for the meaning, correctness, lifecycle,
          and authoritative state of the data

from:

    Operational Responsibility
        → the people, teams, or functions responsible
          for operating, maintaining, reviewing,
          or supporting the system

For example:

    Billing
        → logical owner of Invoice data

    Finance Operations
        → may operate and review Billing

Similarly:

    AI Platform
        → logical owner of Model Registry
          and Model Deployment data

    AI/ML Engineering
        → may build and operate the AI Platform

The organizational role should not replace the logical data owner.

---

## Core Data Ownership Principle

Every important PinkCurve data domain should have one clearly defined logical owner.

The logical owner should be responsible for:

- the meaning of the data;
- authoritative state;
- identifiers;
- schema;
- validation rules;
- lifecycle;
- versioning where applicable;
- access requirements;
- quality expectations;
- retention requirements;
- permitted cross-product use.

Other PinkCurve products may:

    consume

    reference

    cache

    analyze

    transform

    derive from

or:

    index

the data without becoming its logical owner.

For example:

    Buyer Intelligence
        │
        │ owns
        ↓
    Buyer Signal
        │
        ├──→ AI Discovery
        ├──→ Learning Engine
        └──→ other authorized consumers

AI Discovery does not become the owner of Buyer Signals merely because it consumes them.

---

## PinkCurve Logical Data Ownership

| Data Domain / Data Object | Logical Owner |
| --- | --- |
| Buyer identity and Buyer account state | Buyer Account / Identity domain |
| Seller identity and Seller account state | Seller Account / Identity domain |
| Organization identity and account state | Organization Account / Identity domain |
| Offering identity and Offering record | Offering Knowledge / Offering domain |
| Structured Offering Knowledge | Offering Knowledge |
| Seller-provided Offering facts | Offering Knowledge |
| Offering source and provenance | Offering Knowledge |
| Metadata definitions | Adaptive Metadata Navigation / Metadata domain |
| Metadata values | Adaptive Metadata Navigation / Metadata domain |
| Offering Metadata relationships | Offering Knowledge + governed Metadata relationship |
| AMN navigation structures and navigation state | Adaptive Metadata Navigation |
| Creative identity and Creative metadata | Creative Studio |
| Creative Packages | Creative Studio |
| Creative media metadata | Creative Studio |
| Creative media binary | Managed media/object-storage domain, referenced by Creative Studio |
| Campaign identity and Campaign configuration | Campaign / Creative domain |
| Discovery Results | AI Discovery |
| Discovery Session state | Buyer Experience / Discovery domain |
| Discovery Events | Discovery Event domain |
| Buyer Feedback | Buyer Experience / Feedback domain |
| Buyer Reviews | Buyer Experience / Review domain |
| Buyer Ratings | Buyer Experience / Rating domain |
| Discovery Analytic definitions | Discovery Analytics |
| Analytical Results | Discovery Analytics |
| Discovery Metrics | Discovery Analytics |
| QOV definition and QOV results | Discovery Analytics |
| Buyer Signals | Buyer Intelligence |
| Buyer inferred intelligence | Buyer Intelligence |
| Buyer preference intelligence | Buyer Intelligence |
| Buyer session and short-term intelligence | Buyer Intelligence |
| Seller Signals | Seller Intelligence |
| Seller Insights | Seller Intelligence |
| Seller Opportunities | Seller Intelligence |
| Seller Recommendations | Seller Intelligence |
| Seller Alerts | Seller Intelligence |
| Seller Reports | Seller Intelligence |
| Seller Value Intelligence | Seller Intelligence |
| Seller Recommendation actions and outcome evidence | Seller Intelligence |
| Learning Outputs | Learning Engine |
| Learning Runs and learning evaluation | Learning Engine |
| Purpose-specific learned models before platform registration/deployment | Learning Engine |
| Model identity and Model Registry | AI Platform |
| Model Versions | AI Platform |
| Model Deployment state | AI Platform |
| Model-serving endpoints | AI Platform |
| AI service definitions | AI Platform |
| AI inference execution records | AI Platform |
| Prompt Registry / Prompt Versions | AI Platform |
| AI evaluation execution data | AI Platform |
| Embedding technical definitions and generated embeddings | AI Platform / designated Embedding capability |
| Vector Index technical state | AI Platform / Vector infrastructure |
| Seller Verification | Trust & Safety |
| Buyer Verification | Trust & Safety |
| Organization Verification | Trust & Safety |
| Offering Verification | Trust & Safety |
| Trust Signals | Trust & Safety |
| Technical Risk Results used by Trust | Trust / Risk capability |
| Trust Evaluations | Trust & Safety |
| Trust Decisions | Trust & Safety |
| Fraud Cases | Trust & Safety |
| Abuse Reports | Trust & Safety |
| Moderation Actions | Trust & Safety |
| Security Events | Security / Trust domain |
| Billing eligibility policy | Billing |
| Billing Qualification | Billing |
| Billable Events | Billing |
| Seller Billing Account | Billing |
| Invoice Items | Billing |
| Invoices | Billing |
| Billing adjustments and credits | Billing |
| PinkCurve payment state | Billing |
| External payment transaction | Payment provider, referenced by Billing |
| Customer Support Cases | Customer Support |
| Customer Support communications and case history | Customer Support |
| Product Data Contract definitions | Data Architecture / Interface Governance |
| Application and service logs | Platform / Operations |
| API operational telemetry | Platform / Operations |
| Deployment records | Platform / Operations |
| Job execution records | Platform / Operations |
| Operational metrics | Platform / Operations |
| Operational alerts and incidents | PinkCurve Operations |
| Operational cost telemetry | Platform / Operations |

The exact ownership boundaries of a small number of shared domains, particularly Identity, Metadata, Campaigns, Discovery Sessions, and Feedback, should be finalized during detailed Product and System Design.

Chapter 11 should nevertheless establish the principle that these domains require explicit ownership rather than leaving them under generic labels such as "Engineering."

---

## Ownership of Derived Data

Derived data should be owned by the PinkCurve product that gives the derived data its business meaning.

For example:

    Discovery Event
        │
        │ owned by Discovery Event domain
        ↓
    Discovery Analytics
        ↓
    analytic_result_id
        │
        │ owned by Discovery Analytics
        ↓
    Seller Intelligence
        ↓
    seller_signal_id
        │
        │ owned by Seller Intelligence
        ↓
    seller_insight_id
        │
        │ owned by Seller Intelligence

The upstream data owner does not automatically own downstream derived data.

Therefore:

    Discovery Event
        ≠ owner of Analytical Result

    Discovery Analytics
        ≠ owner of Seller Signal

    Seller Intelligence
        ≠ owner of Discovery Event

Each product owns the independently meaningful data object it creates.

---

## Ownership of Shared Data

Shared use does not mean shared ownership.

For example:

                    Offering Knowledge
                          OWNER
                            │
             ┌──────────────┼──────────────┐
             ↓              ↓              ↓
      Creative Studio   AI Discovery      AMN
         consumer         consumer       consumer

Offering Knowledge remains responsible for the authoritative Offering Knowledge even though several products depend on it.

Similarly:

                    Buyer Intelligence
                          OWNER
                            │
                    Buyer Signals
                            │
             ┌──────────────┼──────────────┐
             ↓              ↓              ↓
       AI Discovery     Learning       other authorized
                         Engine          consumers

This avoids the creation of competing definitions of the same data.

---

## Ownership and Source of Truth

Data Ownership and Source of Truth are closely related but answer different questions.

    Data Ownership
        → Who is responsible for this data
          and its meaning?

    Source of Truth
        → Where is the authoritative representation
          that should govern when copies disagree?

For example:

    Logical Owner
        = Buyer Intelligence

    Data Object
        = Buyer Signal

    Authoritative Source
        = Buyer Intelligence authoritative
          Buyer Signal store

A search index or cache containing the Buyer Signal is neither its owner nor its Source of Truth.

---

## Ownership and Product Data Contracts

The logical data owner should define or approve the meaning of data exposed to other products through Product Data Contracts.

For example:

    Buyer Intelligence
        │
        │ owns
        ↓
    Buyer Signal
        ↓
    Buyer Signal Data Contract
        ↓
    AI Discovery

Buyer Intelligence determines what:

    signal_type

    signal_value

    confidence

    freshness

    expiration

and other Buyer Signal concepts mean.

AI Discovery determines how those Signals affect Discovery.

This preserves product boundaries.

---

## Ownership and Product Decisions

Ownership of input data does not mean ownership of another product's decision.

For example:

    Buyer Intelligence
        ↓
    Buyer Signals
        ↓
    AI Discovery
        ↓
    Discovery Result

Buyer Intelligence owns the Buyer Signals.

AI Discovery owns the Discovery decision and Discovery Result.

Similarly:

    AI Platform
        ↓
    Technical Model Result
        ↓
    Trust & Safety
        ↓
    Trust Decision

AI Platform owns the technical Model execution and its technical result.

Trust & Safety owns the Trust interpretation and Trust Decision.

This principle is particularly important for PinkCurve's AI architecture.

---

## Billing Ownership

Billing ownership should be especially explicit because financial records require clear accountability.

Conceptually:

    Discovery Event
        ↓
    Billing
        ↓
    Billing Qualification
        ↓
    Billable Event
        ↓
    Invoice Item
        ↓
    Invoice

Billing owns:

    billing_qualification_id

    billable_event_id

    invoice_item_id

    invoice_id

Discovery Analytics may provide supporting metrics.

Trust & Safety may provide fraud or validity information.

Pricing may provide applicable Pricing Rules.

The Payment Provider may execute payment transactions.

However, these systems do not become the owner of PinkCurve Invoice records.

Finance Operations may review, reconcile, adjust, and operate Billing processes, but Billing remains the logical owner of the financial records.

---

## Trust & Safety Ownership

Trust & Safety should own PinkCurve's authoritative Trust interpretation.

For example:

    AI Platform
        ↓
    technical result
        ↓
    Trust / Risk
        ↓
    technical_risk_result_id
        ↓
    Trust & Safety
        ↓
    trust_decision_id

AI Platform should not own:

    Seller approval

    Buyer approval

    Offering approval

    restriction

    enforcement

or other Trust policy decisions merely because AI contributed technical analysis.

Trust & Safety owns those decisions.

---

## Learning Engine and AI Platform Ownership Boundary

The ownership boundary between Learning Engine and AI Platform should remain explicit.

Conceptually:

    Learning Engine
        ↓
    learning_output_id
        ↓
    purpose-specific learned model
        ↓
    AI Platform registration
        ↓
    model_id / model_version_id
        ↓
    deployment
        ↓
    inference

Learning Engine owns the learning purpose, evidence, Learning Output, and learning evaluation.

Once an approved Model is registered and operationalized by AI Platform, AI Platform owns:

    Model Registry identity

    Model Version registration

    deployment state

    serving state

    inference execution.

This avoids ambiguous ownership of Models across the two products.

---

## Operational Responsibility Is Separate

PinkCurve may initially have individuals performing several roles.

For example, the same person may perform:

    Product Management

    Engineering

    AI/ML Engineering

    Finance Operations

    Customer Support

    Trust review

or other responsibilities.

This should not change logical Data Ownership.

For example:

    Invoice
        → owned by Billing

even if one person currently operates Billing, Finance, and Customer Support.

Similarly:

    Buyer Signal
        → owned by Buyer Intelligence

even if the same engineer builds Buyer Intelligence and AI Discovery.

This distinction allows PinkCurve's Data Architecture to remain stable as the organization grows and responsibilities are eventually distributed among different people or teams.

---

## Ownership Changes

If PinkCurve later changes which product owns a Data Domain, the transfer should be explicit.

The change should define:

    previous_owner

    new_owner

    effective_date

    schema responsibility

    migration responsibility

    Source of Truth transition

    consumer impact

    Product Data Contract impact

Ownership should not change implicitly because another product begins using or storing the data.

---

## Architectural Requirement

Chapter 11 should establish:

> **Every important PinkCurve Data Domain should have an explicit logical owner defined by product or authoritative domain rather than by generic organizational labels such as Product, Engineering, Analytics, or ML.**

The logical owner is responsible for the meaning, authoritative state, identifiers, schema, validation, lifecycle, versioning, quality expectations, and controlled use of its data.

Other products may consume or derive from that data without becoming its owner.

Organizational roles responsible for operating the system should be defined separately from logical Data Ownership.

The ownership model should remain stable even when one person performs multiple operational roles during PinkCurve's early stages.

**Audit Status: Major revision required — replace generic organizational ownership labels with explicit PinkCurve product/domain ownership and clearly separate logical Data Ownership from operational responsibility, Source of Truth, data consumption, and downstream decision ownership.**

---

# 59. Access Control — Strong

Access should follow:

- authentication;
- authorization;
- least privilege;
- purpose-based access;
- Seller-level isolation;
- service identity;
- administrative permissions;
- auditing.

Products should not automatically receive complete access to another product's data domain.

Access should be limited to the data required for the consuming product's defined responsibility.

---

# 60. Data Classification — Strong

The current categories are appropriate:

    Public
    Internal
    Confidential
    Restricted

Classification should guide:

- access;
- encryption;
- retention;
- logging;
- export;
- AI usage.

---

# 61. Buyer Privacy — Strong

Buyer data should continue following:

- minimization;
- purpose limitation;
- consent;
- retention control;
- access control;
- de-identification;
- appropriate reset/deletion behavior.

---

# 62. Inferred Buyer Intelligence Privacy — Significant Revision Needed

Privacy requirements must apply not only to raw Buyer data but also to intelligence derived or inferred from Buyer activity.

Buyer Intelligence may transform multiple Buyer interactions into new information.

Conceptually:

    Buyer Activity
        │
        ├── Offering Views
        ├── Offering Exploration
        ├── Skips
        ├── Searches
        ├── AMN Selections
        ├── Feedback
        ├── Ratings / Reviews
        ├── Click-Throughs
        ├── Session Behavior
        └── Contextual Signals
                ↓
         Buyer Intelligence
                ↓
         Derived Buyer Signals
                │
                ├── Session Intent
                ├── Short-Term Interests
                ├── Persistent Preferences
                ├── Negative Preferences
                ├── Contextual Signals
                ├── Behavioral Signals
                └── Inferred Intelligence

The resulting Buyer Intelligence should not be treated as unrestricted data merely because it was generated internally by PinkCurve.

The principle should be:

> **Derived or inferred Buyer Intelligence remains Buyer-related data and must receive privacy protection appropriate to its meaning, sensitivity, purpose, and expected lifetime.**

---

## Inferred Intelligence Has Its Own Privacy Characteristics

The privacy characteristics of an inferred Buyer Signal may differ from those of the individual source events.

For example:

    Buyer views several Offering categories
        ↓
    Buyer Intelligence
        ↓
    infers a recurring preference

The individual Offering Views may be ordinary interaction events.

However, the resulting persistent preference represents a new piece of Buyer Intelligence.

Therefore the inferred signal should have its own:

    buyer_signal_id

    signal_category
    signal_type

    privacy_classification

    purpose

    confidence

    created_at

    expiration / validity

    access requirements

where appropriate.

---

## Privacy Should Follow the Derived Information

Privacy classification should consider what the resulting Buyer Signal represents, rather than relying only on the classification of its source data.

Conceptually:

    Source Events
        ↓
    Derivation / Inference
        ↓
    Buyer Signal
        ↓
    Evaluate privacy requirements
        based on resulting information

Derived data should therefore not automatically inherit a lower privacy classification simply because each source event individually appears low-risk.

---

## Purpose Limitation

Buyer Intelligence should be created and used for defined PinkCurve purposes.

For example:

    Buyer Intelligence
        ↓
    Buyer Signals
        ↓
    AI Discovery

may use Buyer Signals to improve:

    relevance

    navigation

    discovery

    recommendations

and other defined Buyer experiences.

The existence of a Buyer Signal should not automatically authorize unrelated PinkCurve products to use it for unrelated purposes.

This connects directly to the Access Control principles established earlier:

> Products should receive only the Buyer Intelligence required for their defined responsibilities.

---

## Different Buyer Signals Require Different Lifetimes

Buyer Intelligence should not be retained uniformly.

For example:

    Session Intent
        → session or very short lifetime

    Short-Term Interest
        → temporary

    Contextual Signal
        → valid only for applicable context

    Persistent Preference
        → potentially longer lived

    Negative Preference
        → retained only as appropriate
          for its purpose

    Inferred Intelligence
        → lifetime determined by meaning,
          confidence, freshness, and purpose

A signal that is no longer useful should not necessarily remain indefinitely merely because storage is available.

This also prevents stale Buyer Intelligence from degrading Discovery quality.

---

## Expiration and Freshness

Inferred Buyer Intelligence should support expiration or reevaluation where appropriate.

For example:

    Buyer Signal created
        ↓
    confidence = 0.82
        ↓
    time passes
        ↓
    supporting behavior changes
        ↓
    Signal confidence decreases
        ↓
    Signal expires / is replaced /
    is recalculated

Buyer preferences can change.

Therefore Buyer Intelligence should not assume that every inference remains permanently true.

---

## Reset and Deletion

Buyer Intelligence should support appropriate reset and deletion behavior.

For example, if applicable Buyer data is deleted or reset:

    Source Buyer Data
        ↓
    deletion / reset
        ↓
    dependent Buyer Intelligence
        ↓
    delete, reset, expire,
    de-identify, or recalculate
    as appropriate

The exact behavior may depend on:

- the type of Buyer Signal;
- applicable privacy requirements;
- retention obligations;
- whether the Signal can still be validly retained;
- whether the Signal has been de-identified;
- operational requirements.

Detailed deletion procedures belong in later Privacy and System Design.

---

## De-Identification

Where Buyer identity is not required for a legitimate downstream purpose, PinkCurve should consider whether Buyer-related data can be:

    aggregated

    de-identified

    anonymized where appropriate

or otherwise separated from direct Buyer identity.

For example:

    Discovery Analytics

may often need aggregate Buyer behavior without requiring access to the full Buyer Intelligence profile.

This supports the principle of data minimization.

---

## Access to Buyer Intelligence

Buyer Intelligence should not become a general-purpose Buyer profile available throughout PinkCurve.

Conceptually:

                    Buyer Intelligence
                           │
                    Buyer Signals
                           │
              ┌────────────┼────────────┐
              ↓            ↓            ↓
         AI Discovery   Authorized    Other Product
                         Product       only where
                                       justified

Access should be determined by:

    purpose

    data classification

    product responsibility

    authorization

    required fields

    applicable Product Data Contract

A consuming product should receive only the Buyer Signals it requires.

---

## Raw Data and Inferred Data Should Remain Distinguishable

PinkCurve should distinguish between:

    Explicit Buyer Information

    Observed Buyer Behavior

    Inferred Buyer Intelligence

For example:

    Buyer explicitly selects:
        "Running Shoes"

is different from:

    PinkCurve observes:
        Buyer repeatedly explores
        Running Shoe Offerings

which is different again from:

    Buyer Intelligence infers:
        persistent_interest = RUNNING_SHOES

The data architecture should preserve this distinction.

An inference should not silently become an explicit Buyer preference.

This is particularly important for confidence, explainability, correction, and privacy.

---

## Confidence and Privacy

An inferred Buyer Signal may be uncertain.

For example:

    inferred_interest = TRAVEL
    confidence = 0.61

PinkCurve should not treat:

    inferred_interest

as equivalent to:

    Buyer explicitly stated preference

The Buyer Signal should preserve whether the information is:

    explicit

    observed

    inferred

and, where appropriate:

    confidence

This protects both Discovery quality and the interpretation of Buyer information.

---

## Sensitive Inference

PinkCurve should avoid unnecessarily creating inferred Buyer Intelligence that is not needed for its Discovery purpose, particularly where the inference could reveal sensitive or highly personal characteristics.

The architectural principle should be:

> **Do not infer or retain Buyer information merely because PinkCurve technically can.**

Buyer Intelligence should remain focused on information genuinely useful for PinkCurve's defined Buyer Discovery experience.

This supports both privacy and architectural simplicity.

---

## Relationship to Buyer Privacy

Section #61 establishes the general Buyer Privacy requirements:

    minimization
    purpose limitation
    consent
    retention control
    access control
    de-identification
    reset / deletion

Section #62 applies those requirements specifically to:

    derived

    behavioral

    inferred

Buyer Intelligence.

Therefore #62 should not duplicate the complete privacy architecture.

Its purpose is to establish one additional principle:

> **Privacy obligations continue when Buyer data is transformed into intelligence.**

---

## Architectural Requirement

Chapter 11 should establish:

> **Inferred Buyer Intelligence remains subject to privacy requirements even when it is derived internally from Buyer activity rather than explicitly provided by the Buyer.**

Buyer Signals should support, where appropriate:

    buyer_signal_id

    signal source classification
        explicit / observed / inferred

    privacy classification

    purpose

    confidence

    freshness

    validity / expiration

    access control

    reset / deletion behavior

    provenance reference

The exact privacy policies, consent requirements, retention periods, deletion procedures, and sensitive-data rules should be defined primarily in Chapter 12 — Security, Privacy & Trust and the detailed Buyer Intelligence design.

**Audit Status: Significant revision needed — explicitly extend Buyer Privacy requirements to derived and inferred Buyer Intelligence, distinguish explicit, observed, and inferred information, and require appropriate purpose limitation, classification, lifetime, access, confidence, and reset/deletion behavior.**

---

# 63. Location Data — Strong

PinkCurve correctly distinguishes:

- Country;
- Region;
- City;
- Approximate location;
- Precise coordinates.

The minimum necessary precision should be stored.

Precise location deserves stronger protection.

---

# 64. IP Addresses and Security Data — Strong

IP addresses may support:

- fraud detection;
- bot detection;
- account security;
- abuse investigation.

They should not automatically become long-term personalization data.

---

# 65. Data Retention — Strong

Retention should be determined by purpose.

Different policies may apply to:

- accounts;
- Offerings;
- Discovery Events;
- Analytics;
- Buyer history;
- security;
- fraud;
- billing;
- support;
- AI logs;
- training datasets.

A single global retention period would be inappropriate.

---

# 66. Data Deletion — Needs Clarification

PinkCurve should maintain a simple principle for Data Deletion:

> **Data may be deleted only by its creator or by an authorized PinkCurve administrator, subject to applicable retention requirements.**

A creator may be:

- a Buyer;
- a Seller;
- PinkCurve;
- a PinkCurve Product;
- a PinkCurve Capability.

Examples include:

    Seller
        → creates an Offering

    Buyer
        → creates a Review or Rating

    Creative Studio
        → creates Creative data

    Buyer Intelligence
        → creates Buyer Signals

    Seller Intelligence
        → creates Seller Signals,
          Insights, Opportunities,
          Recommendations, and other intelligence

    Discovery Analytics
        → creates Analytical Results and QOV

    Learning Engine
        → creates Learning Outputs

    Billing
        → creates Billable Events,
          Invoice Items, and Invoices

The creator is responsible for the normal lifecycle of the data it creates.

An authorized PinkCurve administrator may perform deletion when required for:

- administration;
- security;
- fraud or abuse;
- privacy;
- legal requirements;
- correction of invalid data;
- platform operations.

Deletion must still respect applicable retention requirements.

For example, a Seller may close an account or remove an Offering, but PinkCurve may still need to retain certain Billing, Trust & Safety, security, or legally required records.

Deleting authoritative data may also require removal or invalidation of directly dependent technical copies such as:

    cache
    search index
    embedding
    vector index

This is an implementation responsibility and does not require a separate Data Deletion architecture in Chapter 11.

Detailed deletion workflows, propagation mechanisms, retention periods, and administrative procedures should be defined later in Product Design, System Design, Security / Privacy, and PinkCurve Operations.

**Audit Status: Needs minor revision — establish creator or authorized-administrator control over deletion, respect required retention, and leave detailed deletion implementation to later design.**

---

# 67. Backup and Recovery — Strong

Backup and Recovery should primarily be provided by the **PinkCurve Platform** as a shared platform capability.

Individual PinkCurve products and Data Domains should define their recovery requirements, while the PinkCurve Platform provides the common infrastructure and mechanisms needed to protect and recover their data.

Backup and Recovery considerations include:

- data criticality;
- backup requirements;
- recovery requirements;
- acceptable data loss;
- acceptable recovery time;
- restore testing;
- disaster recovery.

Not all data requires the same recovery approach.

Authoritative and critical data should receive appropriate backup and recovery protection, while some derived data may be regenerated from authoritative sources where practical.

Detailed backup technologies, schedules, replication, restore procedures, RPO, RTO, and disaster-recovery operations belong in later System Design and PinkCurve Operations.

**Audit Status: Strong — clarify PinkCurve Platform responsibility for shared Backup and Recovery capabilities.**

---

# 68. Data Recovery vs Recomputation — Revision Required

PinkCurve should not depend on recomputation as a general method for recovering previously stored data.

If stored data is lost, corrupted, or otherwise requires restoration, recovery should normally use the appropriate recovery capability provided by:

- PinkCurve Platform; or
- AI Platform, where AI-specific data or infrastructure is involved.

The objective of recovery is to restore the required previous data or system state.

Recomputing data is different from recovering data.

Conceptually:

    Recovery
        → restores previously stored data

    Recomputation
        → creates a new result from available inputs

These should not be treated as equivalent.

For example, data such as:

    embeddings
    analytical results
    aggregates
    model features
    recommendation candidates

may technically be capable of being generated again.

However, PinkCurve should not assume that regenerating them will reproduce the exact previous result.

Models, external services, algorithms, configurations, source data, and software may change over time.

Therefore:

> If previous data must be preserved and recoverable, it should be protected through the appropriate Backup and Recovery capability rather than relying on future recomputation.

Recomputation may still occur as part of normal PinkCurve product operation when a product intentionally needs to generate a new or updated result.

For example:

    Offering Knowledge changes
        ↓
    new Embedding generated

or:

    new Discovery Events arrive
        ↓
    Analytics recalculated

These are normal processing activities and should not be considered Data Recovery.

Detailed Backup and Recovery responsibilities are covered in #67.

**Audit Status: Revision required — distinguish Recovery from Recomputation and remove the assumption that PinkCurve should reconstruct lost historical data through recomputation.**

---

# 69. Data Migration — Revision Required

Data Migration is the controlled movement of identified data from one data source, system, storage technology, schema, or platform location to another.

Every Data Migration should clearly identify:

- the data to be migrated;
- the source of the data;
- the migration destination;
- the migration method;
- the expected result;
- validation requirements.

Conceptually:

    Data to Migrate
          ↓
    Identify Source
          ↓
    Identify Destination
          ↓
    Protect / Back Up Existing Data
          ↓
    Perform Migration
          ↓
    Validate Migrated Data
          ↓
       Success?
       /      \
     Yes       No
      ↓         ↓
   Complete   Recover /
             Roll Back

Before migration, the existing data should be protected through an appropriate backup or recovery mechanism.

This allows PinkCurve to restore the previous state if the migration fails, produces incomplete data, corrupts data, or otherwise does not meet validation requirements.

Migration validation should determine, where appropriate, whether:

- required data was migrated;
- record counts or expected volumes are correct;
- identifiers remain valid;
- relationships remain valid;
- data values remain correct;
- required schemas are satisfied;
- the destination is operational;
- consuming products can correctly use the migrated data.

The original data or protected backup should not be removed until the migration has been successfully validated.

Data Migration should primarily be provided as a shared platform capability.

    PinkCurve Platform
        → general PinkCurve data migration

    AI Platform
        → AI-specific data or infrastructure migration
          where appropriate

Individual PinkCurve products should identify the data and product-specific requirements for migration but should not normally need to build independent migration infrastructure.

Examples may include:

    Database A
        ↓
    Database B

    Old Schema
        ↓
    New Schema

    Storage System A
        ↓
    Storage System B

    Existing Vector Store
        ↓
    New Vector Store

    Existing AI infrastructure
        ↓
    New AI infrastructure

The objective is not simply to copy data.

> **A migration is complete only after the required data has reached the intended destination and the migrated data has been validated successfully.**

If migration fails, PinkCurve should use the protected previous data and the appropriate PinkCurve Platform or AI Platform recovery capability to restore service or return to the previous state.

Detailed migration tools, backup mechanisms, rollback procedures, migration scheduling, and operational execution belong in later System Design and PinkCurve Operations.

**Audit Status: Revision required — define Data Migration in terms of identified data, source, destination, backup/protection, migration, validation, and recovery or rollback, with migration capabilities primarily provided by PinkCurve Platform or AI Platform.**

---

# 70. Data Backfill — Limited Architectural Requirement

Data Backfill means processing existing PinkCurve data when newly introduced data, fields, calculations, or derived representations need to be applied to previously stored records.

For example:

    Existing Offerings
        ↓
    New required Metadata introduced
        ↓
    Populate the Metadata for eligible
    existing Offerings

or:

    Existing Discovery Events
        ↓
    New Analytics calculation
        ↓
    Calculate results from retained
    historical Events

Backfill should only be performed when existing data actually needs to support the new requirement.

Backfill is primarily an implementation and operational activity rather than a separate PinkCurve product capability.

Where required, the owning product should identify:

- what existing data requires backfill;
- what new data or result must be created;
- which records are affected;
- how the result will be validated.

The PinkCurve Platform or AI Platform may provide the technical capability for performing the backfill where appropriate.

Detailed batching, retries, progress tracking, idempotency, resource management, scheduling, and execution procedures belong in later System Design and PinkCurve Operations.

**Audit Status: Simplify — retain Data Backfill as a possible maintenance operation, but do not treat it as a major Data Architecture capability.**

---

# 71. Data Testing and QA — Revision Required

Data Testing should be part of PinkCurve's Quality Assurance process.

After data has been created, updated, migrated, transformed, loaded, or otherwise changed, appropriate Data Testing should be performed to verify that the resulting data meets PinkCurve's requirements.

The primary objective is to determine whether the data is:

- accurate;
- complete;
- valid;
- consistent;
- unique where required;
- correctly related;
- within expected ranges;
- available where required;
- free from unexpected missing values or corruption.

Conceptually:

    Data Created / Updated / Migrated
                ↓
          Data Testing / QA
                ↓
        Compare Against
        Expected Results
                ↓
          Pass / Fail
            /       \
         Pass       Fail
          ↓           ↓
       Accept      Investigate
       Data        and Correct

## Test Procedures

Good Data Testing requires documented test procedures.

A Data Test Procedure should identify, where appropriate:

    test_id

    test purpose

    data being tested

    source / data location

    expected result

    validation rules

    test method

    acceptance criteria

    actual result

    pass / fail status

    test time

    tester / automated test reference

    issue reference, if failed

The test procedure should make it possible to determine:

> What was tested?

> Why was it tested?

> What result was expected?

> What result was actually observed?

> Did the data pass the required quality criteria?

## Examples of Data Tests

Depending on the Data Domain, tests may include:

    Completeness Test
        → Are required records or fields missing?

    Accuracy Test
        → Does the stored value match the expected value?

    Validity Test
        → Does the data satisfy its defined rules?

    Consistency Test
        → Does related data agree across applicable records?

    Uniqueness Test
        → Are identifiers or other unique values duplicated?

    Relationship Test
        → Do referenced identifiers point to valid records?

    Range / Boundary Test
        → Are values within permitted limits?

    Reconciliation Test
        → Do independently related totals or records agree?

For example, Billing QA may verify:

    Billable Events
          ↓
    Invoice Items
          ↓
    Invoice Total

and determine whether:

- every Invoice Item is based on a valid Billable Event;
- pricing is correct;
- duplicate Billing Items do not exist;
- totals are calculated correctly.

Discovery Analytics QA may verify that calculated Metrics correspond correctly to the underlying eligible Discovery Events.

Offering Knowledge QA may test required Offering fields, Metadata relationships, completeness, and validity.

## Testing After Data Changes

Data Testing should be performed when appropriate after significant data changes such as:

- schema changes;
- Data Migration;
- Data Backfill;
- transformation changes;
- major data corrections;
- new Analytics calculations;
- new Billing calculations;
- changes affecting important Product Data Contracts.

The amount of testing should depend on the importance and risk of the data change.

Not every routine data update requires a separate manual QA process.

Automated validation and testing should be used where practical.

## QA Responsibility

Quality Assurance should define and execute appropriate Data Testing procedures in cooperation with the PinkCurve Product or Data Domain responsible for the data.

The owning Product or Data Domain defines the expected meaning and requirements of the data.

QA verifies that the resulting data satisfies those requirements.

Conceptually:

    Product / Data Owner
        ↓
    Defines Data Requirements
        ↓
    QA
        ↓
    Defines / Executes Test Procedures
        ↓
    Test Results
        ↓
    Accept or Identify Defects

Detailed QA organization, test execution processes, defect management, automation frameworks, testing environments, and release procedures belong in later System Design and PinkCurve Operations.

**Audit Status: Revision required — treat Data Testing primarily as a QA activity that verifies the accuracy, completeness, validity, consistency, relationships, and quality of PinkCurve data after significant data changes, supported by documented and repeatable test procedures.**

---

# 72. Test Data Separation — Important

Test data should be separated from PinkCurve production data.

Data created for development, testing, Quality Assurance, simulation, or experimentation should not unintentionally become production data or affect production results.

Test data should not incorrectly affect:

- Billing;
- Discovery Analytics;
- Trending;
- Buyer Intelligence;
- Seller Intelligence;
- Learning Engine;
- Trust & Safety;
- production AI behavior.

Conceptually:

    Development / Test / QA Data
                ↓
         Test Environment
                ↓
        Test and Validate

and:

        Production Data
                ↓
       Production Environment

Test data should not enter the Production Environment unless there is a specifically authorized and controlled reason.

When testing requires modification of important existing production data, the original data should be protected through the appropriate PinkCurve Platform or AI Platform backup and recovery capability before the update.

Conceptually:

    Original Production Data
            ↓
      Protect / Back Up
            ↓
        Apply Update
            ↓
          Validate
          /      \
       Pass      Fail
        ↓          ↓
     Continue    Recover
                Original Data

Detailed test environments, backup procedures, recovery procedures, test-data generation, and QA execution belong in later System Design and PinkCurve Operations.

**Audit Status: Revise — simplify Test Data Isolation into Test Data Separation and explicitly distinguish test-data protection from backup and recovery of production data during testing.**

---

# 73. Environment Separation — Strong

PinkCurve should maintain separation among:

- Development;
- Testing;
- Staging;
- Production.

Each environment should maintain appropriate separation of:

- data;
- configuration;
- credentials and secrets;
- services and resources;
- access permissions.

Production data should not be freely copied into Development, Testing, or Staging environments.

If production data is required for an authorized testing or troubleshooting purpose, its use should be controlled and protected according to PinkCurve's privacy, security, and Data Classification requirements.

Environment separation should primarily be provided and enforced by the **PinkCurve Platform** and, for AI-specific environments, the **AI Platform**.

Detailed environment configuration, deployment procedures, access mechanisms, and infrastructure implementation belong in later System Design and PinkCurve Operations.

**Audit Status: Strong — retain, with minor clarification of platform responsibility and protection of Production data.**

---

# 74. Physical Storage Strategy — Strong

PinkCurve correctly recognizes different storage needs:

    Relational
    Event / Analytics
    Media / Object
    Vector
    Flexible Structured Data

Storage technology should be selected according to the characteristics and requirements of the data.

Where practical, shared storage capabilities should be provided through the **PinkCurve Platform** or **AI Platform**, as appropriate.

The platform should avoid unnecessary infrastructure proliferation during early development.

A separate storage technology should not be introduced unless its requirements justify the additional complexity.

**Audit Status: Strong — no major revision required.**

---

# 75. PostgreSQL — Appropriate Early Foundation

PostgreSQL is an appropriate early data foundation for:

- accounts;
- Sellers;
- Buyers;
- Organizations;
- Offerings;
- Offering Knowledge;
- Metadata;
- Campaigns;
- reviews;
- ratings;
- recommendations;
- billing;
- support metadata;
- Trust state.

It may also support:

- early Analytics;
- JSONB for appropriate flexible structured data;
- initial vector retrieval.

PostgreSQL may support multiple PinkCurve Data Domains during early development without requiring a separate storage technology for each domain.

As PinkCurve grows, individual workloads may move to specialized storage technologies when justified by:

- scale;
- performance;
- access patterns;
- analytical requirements;
- reliability requirements;
- specialized capabilities.

The introduction of additional storage technologies should be driven by demonstrated requirements rather than premature infrastructure complexity.

**Audit Status: Strong — PostgreSQL is an appropriate early foundation; specialized storage should be introduced only when justified by actual requirements.**

---

# 76. JSONB — Appropriate Flexible Structure

JSONB can support flexible or variable structured data such as:

- specifications;
- FAQs;
- Brand voice;
- Offering-specific attributes;
- structured AI outputs;
- event payloads;
- Recommendation evidence.

JSONB is appropriate when the structure may vary among records or evolve over time.

However, JSONB should not replace deliberate modeling of important PinkCurve entities, identifiers, relationships, or frequently queried fields.

Important data used for:

- identification;
- relationships;
- filtering;
- retrieval;
- validation;
- indexing;
- Billing;
- Trust & Safety;

should be explicitly modeled where appropriate.

**Audit Status: Strong — JSONB provides useful flexibility but should not replace deliberate modeling of important PinkCurve data.**

---

# 77. Object Storage — Strong

Object storage is appropriate for:

- images;
- video;
- audio;
- documents;
- Creative media;
- model artifacts;
- dataset files.

Databases should generally store the associated:

- identifier;
- metadata;
- ownership or related entity reference;
- object-storage reference;
- status;

while Object Storage stores the actual file or media object.

The database record and stored object should remain reliably associated through a stable reference.

Detailed Object Storage technology, naming, replication, lifecycle management, backup, and delivery mechanisms belong in later System Design and PinkCurve Platform design.

**Audit Status: Strong — no major revision required.**

---

# 78. Event Storage Evolution — Appropriate

Early-stage events may remain in PostgreSQL.

As event volume, processing requirements, or analytical needs grow:

    Application
        ↓
    Event Collector
        ↓
    Event Stream
        ↓
    Raw Event Storage
        ↓
    Curated Analytics

may become appropriate.

The **PinkCurve Platform** should provide the shared event infrastructure when PinkCurve reaches the scale or operational requirements that justify it.

Individual products should define the events they produce and consume, but should not independently build unnecessary event infrastructure.

Technology should follow measured need.

PinkCurve should introduce specialized Event Streaming or Event Storage technologies only when demonstrated requirements such as volume, latency, throughput, reliability, or processing needs justify the additional complexity.

**Audit Status: Strong — retain the evolutionary approach and introduce specialized event infrastructure only when justified by measured requirements.**

---

# 79. Analytical Storage Evolution — Appropriate

A specialized analytical data store or warehouse, such as BigQuery, Snowflake, ClickHouse, or equivalent, should only be introduced when PinkCurve's analytical workload justifies it.

Such requirements may include:

- increasing data volume;
- complex analytical queries;
- analytical performance requirements;
- large-scale aggregation;
- separation of analytical workloads from operational workloads.

Early analytical workloads may continue using existing PinkCurve data infrastructure where it provides sufficient performance and capability.

Technology should follow measured need rather than anticipated scale.

Detailed analytical storage technology and architecture should be determined later through System Design and PinkCurve Platform design.

**Audit Status: Strong — introduce specialized analytical storage only when actual workload requirements justify it.**

---

# 80. Vector Storage — Strong

Vector storage may use:

- pgvector;
- managed vector databases;
- vector-capable search systems.

Vectors are derived representations used to support capabilities such as semantic retrieval and similarity search.

The underlying entity and its authoritative source data remain the Source of Truth.

When authoritative source data changes, the corresponding vector representation should be updated or replaced as appropriate.

Vector storage technology should be selected according to actual scale, retrieval performance, operational requirements, and cost.

PinkCurve may initially use pgvector where sufficient and introduce specialized vector storage only when requirements justify it.

Detailed vector storage technology and implementation belong in later System Design and AI Platform design.

**Audit Status: Strong — no major revision required.**

---

# 81. Data Format Strategy — Strong

Different formats fit different purposes:

    Relational
        → transactional structured data

    JSON
        → flexible structured data / API exchange

    Parquet
        → analytical / training / batch data

    Vector
        → semantic representation

No single format should be forced across PinkCurve.

---

# 82. Product-to-Product Data Flow — Major Revision Needed

Chapter 11 should show how important data and information move among PinkCurve products.

The existing infrastructure-oriented Data Flow is useful, but it does not sufficiently describe the logical information exchange among PinkCurve products.

Product-to-Product Data Flow should identify:

- producing product;
- information or data produced;
- consuming product;
- direction of exchange;
- important feedback flows;
- authoritative ownership of exchanged data.

The diagram should represent logical product relationships rather than physical APIs, databases, queues, or implementation technologies.

---

## Core Product Flow

A simplified PinkCurve product flow is:

                         Offering Knowledge
                                │
                ┌───────────────┼────────────────┐
                ↓               ↓                ↓
         Creative Studio    AI Discovery        AMN
                │               ↑                │
                │               │                │
                │        Buyer Intelligence      │
                │               ↑                │
                │               │                │
                └────────→ Buyer Experience ←────┘
                                │
                                ↓
                         Discovery Events
                                │
                 ┌──────────────┼──────────────┐
                 ↓              ↓              ↓
          Discovery       Buyer Intelligence  Learning
           Analytics                          Engine
                 │                              │
                 ↓                              ↓
          Seller Intelligence             Learning Outputs
                                                │
                                                ↓
                                         AI Platform
                                                │
                                                ↓
                                      Authorized Consuming
                                           Products

This diagram is intentionally simplified.

The complete Product-to-Product Data Flow should be developed after the full Product Blueprint audit so that all final product boundaries and interfaces are known.

---

## Buyer Discovery Flow

Buyer Experience should be represented explicitly because it coordinates the Buyer's interaction with PinkCurve products.

Conceptually:

    Buyer
      ↓
    Buyer Experience
      │
      ├──→ AMN
      │       ↓
      │   Navigation Results
      │
      ├──→ Buyer Intelligence
      │       ↓
      │   Buyer Signals
      │
      └──→ AI Discovery
              ↑
              │
       Offering Knowledge
              │
       Buyer Intelligence
              │
       other authorized inputs
              ↓
       Discovery Results
              ↓
       Buyer Experience
              ↓
            Buyer

Buyer Experience owns the Buyer-facing interaction.

AI Discovery owns the Discovery Result.

Buyer Intelligence owns Buyer Signals.

AMN owns Adaptive Metadata Navigation behavior and its associated navigation structures.

Offering Knowledge owns authoritative Offering Knowledge.

---

## Discovery Event Flow

Buyer activity produces Discovery Events.

Conceptually:

    Buyer Experience
           ↓
    Discovery Events
           │
     ┌─────┼─────────────┐
     ↓     ↓             ↓
 Discovery   Buyer      Learning
 Analytics Intelligence Engine

Different consuming products may use the same Discovery Events for different purposes.

For example:

    Discovery Analytics
        → measurement and Analytics

    Buyer Intelligence
        → Buyer Signals and inferred intelligence

    Learning Engine
        → learning and improvement

Consumption of an Event does not transfer ownership of that Event to the consuming product.

---

## Buyer Intelligence Feedback Flow

Buyer Intelligence is not merely a downstream destination for Buyer activity.

It also feeds Buyer-facing products.

Conceptually:

    Buyer Activity
         ↓
    Discovery Events
         ↓
    Buyer Intelligence
         ↓
    Buyer Signals
         ↓
    AI Discovery
         ↓
    Discovery Results
         ↓
    Buyer Experience
         ↓
    New Buyer Activity
         ↓
        ...

This creates an important feedback loop:

> Buyer activity improves Buyer Intelligence, which helps improve subsequent Discovery.

---

## Seller Intelligence Flow

Seller Intelligence should also be represented more completely.

Conceptually:

    Discovery Analytics
           ↓
    Metrics / Analytical Results
           ↓
    Seller Intelligence
           │
           ├── Seller Signals
           ├── Seller Insights
           ├── Seller Opportunities
           ├── Seller Recommendations
           ├── Seller Alerts
           ├── Seller Reports
           └── Seller Value Intelligence
                   ↓
                 Seller

Seller Intelligence may also consume authorized information from:

- Offering Knowledge;
- Creative Studio;
- Campaign data;
- Learning Engine;
- Billing;
- Trust & Safety;

where those inputs are required for a defined Seller Intelligence capability.

The detailed interfaces should be defined later.

---

## Learning Flow

Learning Engine should not be represented simply as:

    Learning Engine
        ↓
    Models
        ↓
    AI Platform

Chapter 08 defines broader Learning Outputs.

The flow should therefore be:

    Product Evidence / Events / Results
                ↓
          Learning Engine
                ↓
          Learning Outputs
                │
        ┌───────┴────────┐
        ↓                ↓
    Consuming       Purpose-Specific
     Products          Models
                           ↓
                      AI Platform
                           ↓
                    Model Serving
                           ↓
                  Consuming Products

Not every Learning Output becomes a Model.

A Learning Output may instead be:

- a learned value;
- parameter;
- score;
- rule;
- recommendation input;
- model reference;
- other governed learning result.

---

## Trust & Safety Flow

Trust & Safety should participate in Product-to-Product Data Flow where Trust state affects another product.

Conceptually:

    Seller / Buyer / Organization / Offering
                     ↓
               Trust & Safety
                     ↓
           Verification / Trust State
                     ↓
              Authorized Products

For example, AI Discovery should not treat an Offering as eligible merely because Offering Knowledge contains it if Trust & Safety has determined that the Offering is not approved for Discovery.

The exact enforcement interfaces belong in System Design.

---

## Billing Flow

Billing should also appear in the complete Product-to-Product Data Flow because it consumes qualified business events and produces financial records.

Conceptually:

    Discovery Event
          ↓
       Billing
          ↓
    Billing Qualification
          ↓
    Billable Event
          ↓
    Invoice Item
          ↓
       Invoice
          ↓
        Seller

Only events satisfying PinkCurve's Billing requirements should become Billable Events.

---

## Data Flow Does Not Change Data Ownership

Product-to-Product Data Flow represents information exchange.

It does not change the logical ownership established in #58.

For example:

    Buyer Intelligence
        ↓
    Buyer Signal
        ↓
    AI Discovery

means:

    Producer
        = Buyer Intelligence

    Data
        = Buyer Signal

    Consumer
        = AI Discovery

    Logical Owner
        = Buyer Intelligence

Similarly:

    Discovery Analytics
        ↓
    Analytical Result
        ↓
    Seller Intelligence

does not make Seller Intelligence the owner of the Analytical Result.

---

## Architectural Requirement

Chapter 11 should establish:

> **PinkCurve should explicitly represent the major logical flows of information among its products, including the producer, exchanged information, consumer, direction, and ownership of important data.**

The Product-to-Product Data Flow should remain independent of implementation technology.

It should answer:

    What product produces the data?

    What data is exchanged?

    What product consumes it?

    In which direction does the information flow?

    Who remains the logical owner?

Detailed:

    APIs
    event interfaces
    request / response schemas
    message formats
    endpoints
    service protocols
    infrastructure

belong in later System Design.

Because the PinkCurve Product Blueprint is still being audited and product boundaries are continuing to be refined, the final comprehensive Product-to-Product Data Flow diagram should be created after completion of the Blueprint audit.

**Audit Status: Major revision needed — expand the infrastructure-oriented Data Flow into explicit logical Product-to-Product Data Flow, including Buyer Experience, Buyer Intelligence feedback, Seller Intelligence, Learning Engine, Trust & Safety, Billing, data ownership, and major producer-consumer relationships.**

---

# 83. Data Architecture as Foundation for System Design — Strong; Interface Relationships Need Expansion

Chapter 11 should establish the data principles, ownership boundaries, identifiers, and logical information exchanges that later System Design will implement through APIs, events, services, storage systems, and other technical interfaces.

Data Architecture should define:

- what data object is exchanged;
- which product owns the data;
- which product produces it;
- which product consumes it;
- the important identifier;
- the applicable Product Data Contract;
- required context;
- freshness or validity where applicable;
- security and authorization requirements;
- whether the logical exchange is primarily request/response, event-based, or another interaction pattern.

Detailed technical interfaces belong in later System Design.

---

## Major Product Interface Relationships

Important future interfaces include, but are not limited to:

    Buyer Experience
        → Buyer Intelligence
        requests current Buyer Signals

    Buyer Intelligence
        → Buyer Experience / AI Discovery
        provides Buyer Signals

    Buyer Experience
        → AMN
        provides Buyer navigation requests / selections

    AMN
        → Buyer Experience
        provides Adaptive Metadata Navigation results

    Buyer Experience
        → AI Discovery
        requests Discovery Results

    AI Discovery
        → Buyer Experience
        provides Discovery Results

    AI Discovery
        → Buyer Intelligence
        requests applicable Buyer Signals

    Buyer Intelligence
        → AI Discovery
        provides Buyer Signals

    AI Discovery
        → Offering Knowledge
        requests authoritative Offering information

    Offering Knowledge
        → AI Discovery
        provides Structured Offering Knowledge

    AI Discovery
        → AI Platform
        requests technical AI / Model capabilities where required

    AI Platform
        → AI Discovery
        provides technical Model or AI-service results

    Creative Studio
        → Offering Knowledge
        requests Offering facts and knowledge

    Offering Knowledge
        → Creative Studio
        provides Structured Offering Knowledge

    Creative Studio
        → AI Platform
        requests AI generation or analysis capabilities where required

    AI Platform
        → Creative Studio
        provides technical AI results

    Discovery Events
        → Discovery Analytics
        provide Discovery activity evidence

    Discovery Events
        → Buyer Intelligence
        provide Buyer behavioral evidence

    Discovery Events
        → Learning Engine
        provide governed learning evidence where appropriate

    Discovery Analytics
        → Seller Intelligence
        provides Analytical Results and QOV-related results

    Offering Knowledge
        → Seller Intelligence
        provides Offering information where required

    Creative Studio / Campaign Data
        → Seller Intelligence
        provides Creative and Campaign context where required

    Learning Engine
        → Seller Intelligence
        provides Learning Outputs where applicable

    Seller Intelligence
        → Seller Experience
        provides Seller Signals, Insights, Opportunities,
        Recommendations, Alerts, Reports,
        and Seller Value Intelligence

    Learning Engine
        → AI Platform
        provides approved Models or Model references
        for registration / deployment where applicable

    AI Platform
        → Learning Engine
        provides technical Model execution,
        evaluation, or infrastructure capabilities where required

    Learning Engine
        → consuming PinkCurve products
        provides governed Learning Outputs

    Trust & Safety
        → AI Discovery
        provides appropriate Offering / Seller eligibility
        or Trust state required for Discovery

    Trust & Safety
        → Billing
        provides appropriate Trust decisions
        required for Billing Qualification

    Trust & Safety
        → Seller Experience / Buyer Experience
        provides appropriate Verification or Trust status

    Billing
        → Seller Experience
        provides Billing Account, Invoice,
        Invoice Item, balance, and payment-status information

    Seller Experience
        → Billing
        provides authorized Billing-related requests
        such as Invoice retrieval or dispute initiation

    Customer Support
        → Billing / Trust & Safety /
          Seller Intelligence / Buyer Intelligence
        retrieves authorized data required
        to resolve support cases

    PinkCurve Products
        → PinkCurve Platform
        use shared platform capabilities such as
        storage, databases, event infrastructure,
        Backup and Recovery, and operational services

    PinkCurve Products requiring AI
        → AI Platform
        use shared AI technical capabilities

---

## Direction Matters

The interface definitions should not use `↔` unless there is genuinely meaningful information flowing in both directions.

For example:

    AI Discovery
        → Buyer Intelligence
        Request Buyer Signals

    Buyer Intelligence
        → AI Discovery
        Return Buyer Signals

This is clearer than simply:

    AI Discovery ↔ Buyer Intelligence

because the arrows tell us what each product is doing.

Similarly:

    Discovery Analytics
        → Seller Intelligence
        Analytical Results

does not imply that Discovery Analytics and Seller Intelligence own the same data or perform interchangeable functions.

---

## Product Interface Does Not Transfer Ownership

The consuming product does not become the owner of the data it receives.

For example:

    Buyer Intelligence
        │
        │ owns
        ↓
    buyer_signal_id
        ↓
    AI Discovery
        │
        │ consumes
        ↓
    Discovery decision

and:

    Discovery Analytics
        │
        │ owns
        ↓
    analytic_result_id
        ↓
    Seller Intelligence
        │
        │ consumes
        ↓
    seller_signal_id / seller_insight_id

Each product remains authoritative for the independently meaningful data object it creates.

---

## Relationship to Product Data Contracts

Each important interface should eventually reference a Product Data Contract.

Conceptually:

    Producing Product
        ↓
    Authoritative Data Object
        ↓
    Product Data Contract
        ↓
    Consuming Product

For example:

    Buyer Intelligence
        ↓
    Buyer Signal
        ↓
    Buyer Signal Data Contract
        ↓
    AI Discovery

or:

    Discovery Analytics
        ↓
    Analytical Result
        ↓
    Analytics Result Data Contract
        ↓
    Seller Intelligence

Chapter 11 defines the logical contract requirements.

System Design later defines the actual technical interface.

---

## Relationship to API and Event Design

Some interfaces will likely become synchronous request/response interactions.

For example:

    AI Discovery
        ↓
    Buyer Intelligence

or:

    Creative Studio
        ↓
    Offering Knowledge

Other exchanges may be event-based.

For example:

    Discovery Event
        ├──→ Discovery Analytics
        ├──→ Buyer Intelligence
        └──→ Learning Engine

Chapter 11 should identify the logical data flow.

System Design should determine the final API, Event, Command, messaging, or other technical implementation.

---

## System Design Responsibility

Future System Design should use the Chapter 11 Data Architecture to define:

    API endpoints

    request / response schemas

    event schemas

    message formats

    service boundaries

    authentication

    authorization

    timeout behavior

    retries

    idempotency

    error handling

    service dependencies

    caching

    event delivery

    deployment topology

    performance requirements

System Design should not need to rediscover basic questions such as:

    Who owns Buyer Signals?

    What identifies an Analytical Result?

    What does Seller Intelligence consume?

    Who owns Trust Decisions?

    What is the Source of Truth for an Invoice?

Those questions should already be answered by Chapter 11.

---

## Architectural Requirement

Chapter 11 should establish:

> **Data Architecture defines the logical information boundaries and exchange requirements that System Design later implements technically.**

For every important future interface, PinkCurve should be able to identify:

    producer

    consumer

    authoritative data owner

    exchanged data object

    stable identifier

    direction of flow

    Product Data Contract

    context and validity

    privacy / security requirements

    expected interaction pattern

Detailed technical APIs and infrastructure should be defined later in System Design.

The final comprehensive PinkCurve Product Interface specification should be developed after completion of the Product Blueprint audit.

**Audit Status: Strong principle but interface relationships should be expanded and made directional before Chapter 11 is considered complete.**

---

# 84. Future Interface Requirements — Strong

Each future PinkCurve product interface should eventually specify, where applicable:

- purpose;
- caller;
- provider;
- input;
- output;
- identifiers;
- schema;
- schema version;
- authorization;
- privacy and data classification;
- freshness or validity;
- provenance where required;
- errors;
- observability;
- failure behavior.

Chapter 11 should establish the Data Contract foundation for these interfaces.

Detailed API endpoints, event definitions, protocols, timeout and retry behavior, infrastructure, and implementation belong in later System Design.

**Audit Status: Strong — no major revision required.**

---

# 85. Core Architectural Principle — Strong

The architectural principle established during Chapter 10 applies strongly:

> **PinkCurve products own product decisions and business behavior.**

Data Architecture provides:

- structures;
- identifiers;
- relationships;
- contracts;
- storage;
- necessary traceability;
- governance;
- protection;
- access.

It does not make product decisions.

The conceptual relationship is:

    Data Architecture
          ↓
    Reliable Information Foundation
          ↓
    Shared Platforms / Capabilities
          ↓
    PinkCurve Product
          ↓
    Product Decision
    and Business Behavior

Data Architecture determines how PinkCurve information is structured, identified, related, exchanged, stored, protected, and governed.

Shared Platforms and Capabilities provide the technical services required by PinkCurve products.

PinkCurve Products consume that information and those capabilities to make their own product decisions and implement their own business behavior.

For example:

    Buyer Intelligence
        ↓
    Buyer Signals
        ↓
    AI Discovery
        ↓
    Discovery Decision

Buyer Intelligence owns and provides Buyer Signals.

Data Architecture defines how those Signals are represented and exchanged.

AI Discovery determines how those Signals are used to produce a Discovery Result.

Similarly:

    AI Platform
        ↓
    Technical AI Result
        ↓
    Trust & Safety
        ↓
    Trust Decision

AI Platform provides the technical AI capability and result.

Data Architecture defines how that result is represented and exchanged.

Trust & Safety owns the Trust policy and makes the Trust Decision.

Therefore:

> **Data Architecture enables Product decisions; it does not own those decisions.**

**Audit Status: Strong — retain, with `lineage` replaced by `necessary traceability` to remain consistent with the revised Chapter 11 architecture.**

---

# 86. Major Strengths

Chapter 11 has several major strengths:

- Offering-centered architecture;
- logical model before physical storage;
- logically unified but physically flexible architecture;
- explicit identifiers for important data entities;
- explicit relationships among important data entities;
- clear logical Data Ownership;
- authoritative Source of Truth protection;
- Source / Derived / Learned data separation;
- historical Discovery Event preservation;
- first-class Metadata;
- provenance;
- necessary domain-specific traceability;
- Product Data Contracts and product-to-product data exchange;
- fit-storage-to-workload;
- privacy by design;
- Trust by design;
- Data Classification and Access Control;
- Data Quality and Data Observability;
- Data Testing and QA;
- controlled Data Migration;
- incremental infrastructure evolution;
- shared PinkCurve Platform responsibilities;
- shared AI Platform responsibilities where appropriate;
- Backup and Recovery;
- Test Data and Environment Separation.

These strengths should remain as Chapter 11 is revised.

---

# 87. Major Required Updates

The Chapter 11 audit identified the following principal updates.

## A. Data Ownership and Architectural Boundaries

1. Clarify Logical Data Ownership, Authoritative Source of Truth, and Physical Storage responsibility.

2. Explicitly state that logical Product ownership does not require separate physical databases.

3. Replace generic ownership labels such as:

       Product + Engineering
       Discovery / Analytics
       ML / Engineering

   with explicit PinkCurve Products or authoritative Data Domains.

4. Separate Logical Data Ownership from operational responsibility.

5. Clarify that consuming data does not transfer ownership to the consuming Product.

6. Clarify the ownership boundary between Learning Engine and AI Platform.

7. Clarify that AI Platform does not own all PinkCurve data it consumes or processes.

8. Clarify PinkCurve Platform responsibility for shared data infrastructure capabilities such as Backup and Recovery, migration support, environments, and shared storage infrastructure.

---

## B. Identifier and Relationship Strategy

9. Add a platform-wide identifier strategy for important PinkCurve entities and records.

10. Remove `provider_id` where `seller_id` already provides the required Seller identity.

11. Ensure important Data Domains have appropriate identifiers, including where applicable:

       metadata_id
       creative_id
       campaign_id
       event_id
       session_id
       feedback_id
       review_id
       rating_id
       analytic_id / analytic_result_id
       qov_id
       learning_output_id
       model_id
       model_version_id
       buyer_signal_id
       seller_signal_id
       seller_insight_id
       seller_opportunity_id
       seller_recommendation_id
       technical_risk_result_id
       billing_qualification_id
       billable_event_id
       invoice_item_id
       invoice_id

12. Strengthen explicit relationships among important identifiers so that PinkCurve can navigate related authoritative records without requiring a generalized lineage system.

---

## C. Offering, Metadata, Creative, and Campaign Data

13. Strengthen Offering retrieval by identifying the fields and keys intended for efficient retrieval rather than implying that every Offering field should be queried equally.

14. Strengthen Offering Knowledge retrieval and Source-of-Truth relationships.

15. Clarify Metadata identity, structure, and relationships.

16. Clarify Adaptive Metadata Navigation data boundaries and identification requirements.

17. Strengthen Creative Data identity and relationships.

18. Strengthen Campaign identity and Campaign Data relationships.

---

## D. Discovery, Analytics, and QOV

19. Strengthen Discovery Event identity and structure.

20. Strengthen Discovery Session identity.

21. Strengthen Buyer Feedback, Review, and Rating identities.

22. Expand Discovery Analytics Data beyond general metrics to explicitly represent:

       analytic definitions
       analytic executions where required
       analytic results
       metrics
       supporting evidence
       applicable dimensions / context
       time periods
       versions

23. Define the relationship between Discovery Events and Analytical Results without creating unnecessary generalized lineage infrastructure.

24. Strengthen QOV identity, definition, components, calculation context, versioning, and resulting QOV data.

25. Clarify Discovery Analytics ownership of Analytical Results, Discovery Metrics, and QOV.

---

## E. Learning Engine and AI Platform

26. Expand Learning Engine Data to represent Learning Outputs explicitly.

27. Define Learning Output structure, including where appropriate:

       learning_output_id
       output_type
       intended_consuming_product
       applicable_context
       learned_value / rule / parameter / score / model_reference
       confidence
       supporting_evidence
       provenance_reference
       model_or_rule_version
       evaluation_status
       validity
       governance_status
       approval_status

28. Clarify that Learning Outputs may be consumed by multiple authorized PinkCurve Products.

29. Strengthen Model Identity and Model Version representation.

30. Simplify Model Lineage requirements and retain only the model/version/provenance relationships required for governance, evaluation, debugging, and operation.

31. Consolidate duplicated AI Platform Data sections.

32. Expand AI Platform Data to cover its shared AI technical responsibilities without implying ownership of Product data.

33. Strengthen Embedding and Vector Data to include the authoritative source reference, source location/reference, source version, embedding identity/model/version, and technical metadata needed to associate the Vector with its source.

---

## F. Buyer Intelligence

34. Substantially expand Buyer Intelligence Data to represent the Buyer Intelligence Model defined in Chapter 24.

35. Represent:

       Explicit Preferences
       Session Intent
       Short-Term Interests
       Persistent Preferences
       Negative Preferences
       Contextual Signals
       Behavioral Signals
       Inferred Intelligence

36. Remove duplicate Buyer Signal sections where their content is already incorporated into the complete Buyer Intelligence model.

37. Define Buyer Signal lifecycle, including freshness, expiration, confidence, context, source, provenance, and privacy classification.

38. Distinguish Buyer information that is:

       explicit
       observed
       inferred

39. Extend Buyer Privacy requirements to derived and inferred Buyer Intelligence.

40. Apply purpose limitation, access control, appropriate lifetime, reset/deletion behavior, and privacy classification to inferred Buyer Intelligence.

---

## G. Seller Intelligence

41. Substantially expand Seller Intelligence Data to represent:

       Seller Signals
       Seller Insights
       Seller Opportunities
       Seller Recommendations
       Seller Alerts
       Seller Reports
       Seller Value Intelligence
       Recommendation Outcome Evidence

42. Remove duplicate Seller Intelligence logical-data sections where the concepts are already represented in the primary Seller Intelligence architecture.

43. Strengthen Seller Signal structure.

44. Explicitly connect Seller Intelligence objects through their identifiers:

       Evidence
           ↓
       Seller Signal
           ↓
       Seller Insight
           ↓
       Seller Opportunity
           ↓
       Seller Recommendation
           ↓
       Seller Action
           ↓
       Recommendation Outcome Evidence

45. Add a Seller Intelligence schema/entity relationship diagram so the complete structure can be understood visually.

46. Replace generalized Seller Intelligence lineage with explicit relationships among the authoritative Seller Intelligence records.

---

## H. Trust & Safety

47. Expand Trust & Safety Data beyond a simple list of entities.

48. Define important identifiers and relationships for:

       Seller Verification
       Buyer Verification
       Organization Verification
       Offering Verification
       Trust Signals
       Risk Scores
       Fraud Cases
       Abuse Reports
       Bot Signals
       Moderation Actions
       Security Events

49. Establish relationships between Verification records and applicable Trust Signals / evidence.

50. Strengthen Technical Risk Results so each result identifies the subject being evaluated, such as:

       seller_id
       buyer_id
       organization_id
       offering_id
       creative_id
       campaign_id

   or another applicable subject.

51. Preserve the boundary:

       AI / Technical Risk Analysis
               ↓
       Technical Risk Result
               ↓
       Trust & Safety
               ↓
       Policy / Trust Decision

52. Ensure technical AI results do not automatically become Trust policy decisions.

---

## I. Billing

53. Expand Billing Architecture beyond the high-level flow.

54. Define:

       billing_qualification_id
       billable_event_id
       invoice_item_id
       invoice_id

55. Identify which Discovery Event types may become candidates for Billing.

56. Require Billing Qualification before an Event becomes a Billable Event.

57. Define the relationship:

       Discovery Event
           ↓
       Billing Qualification
           ↓
       Billable Event
           ↓
       Invoice Item
           ↓
       Invoice

58. Define Invoice fields sufficiently to support Seller understanding and Finance Operations, including `invoice_date`.

59. Clarify that Billing owns Invoice generation while Finance Operations may operate, review, reconcile, and support Billing.

60. Ensure Sellers can determine what they were billed for and whether the underlying Billing Items were valid.

---

## J. Operational Data and Shared Platform Responsibilities

61. Clarify Operational Data and distinguish it from Product Analytics.

62. Associate detailed monitoring, alerting, incident handling, and operational procedures with PinkCurve Operations.

63. Clarify PinkCurve Platform responsibility for shared infrastructure and operational data capabilities.

64. Preserve the established distinction between PinkCurve Platform and AI Platform without redefining it unnecessarily in Chapter 11.

---

## K. Product Data Exchange and Contracts

65. Expand Product Interfaces and Data Exchange.

66. Define Product Data Contract principles, including where applicable:

       producer
       consumer
       data_owner
       identifier
       schema
       schema_version
       required_fields
       optional_fields
       freshness
       expiration
       provenance
       privacy_classification
       authorization
       confidence
       model_version
       source_version
       correlation / trace information where required
       compatibility expectations

67. Distinguish synchronous API exchange from asynchronous Event exchange.

68. Expand Source of Truth definitions across PinkCurve Data Domains.

69. Expand Product-to-Product Data Flow to show important logical exchanges among PinkCurve Products.

70. Show the direction and meaning of important Product interfaces rather than relying only on generic bidirectional arrows.

71. Position Chapter 11 as the Data Architecture foundation for future System Design.

72. Define the information each future interface must eventually specify, while leaving detailed APIs and technical implementation to System Design.

---

## L. Data Governance, Privacy, and Access

73. Revise the Data Ownership table using explicit PinkCurve Product and Data Domain ownership.

74. Strengthen purpose-based Access Control between Products.

75. Retain Data Classification:

       Public
       Internal
       Confidential
       Restricted

76. Preserve Buyer Privacy principles.

77. Extend privacy requirements to inferred Buyer Intelligence.

78. Preserve minimum-necessary Location precision.

79. Keep IP addresses and security data focused on security, fraud, bot detection, and abuse purposes rather than automatically treating them as long-term personalization data.

80. Keep Data Retention purpose-specific rather than defining one universal retention period.

---

## M. Deletion, Backup, Recovery, and Migration

81. Simplify Data Deletion.

82. Establish that deletion may be performed by the creator or an authorized PinkCurve administrator, subject to applicable retention requirements.

83. Recognize that a creator may be:

       Buyer
       Seller
       PinkCurve
       PinkCurve Product
       PinkCurve Capability

84. Clarify PinkCurve Platform responsibility for shared Backup and Recovery capabilities and AI Platform responsibility where AI-specific recovery applies.

85. Distinguish Recovery from Recomputation:

       Recovery
           → restore previous data

       Recomputation
           → produce a new result

86. Do not depend on recomputation as the general method for restoring lost historical data.

87. Define Data Migration around:

       data to migrate
       source
       destination
       protected copy / backup
       migration
       validation
       recovery / rollback if unsuccessful

88. Keep Data Backfill as a limited maintenance operation rather than a major Data Architecture capability.

---

## N. Data Quality, Testing, and Environments

89. Preserve Schema Strategy and Schema Evolution principles.

90. Preserve multi-level Data Validation.

91. Preserve Data Quality dimensions.

92. Preserve Data Observability and clarify the boundary with PinkCurve Operations.

93. Revise Data Testing as a Quality Assurance responsibility.

94. Require documented Data Test Procedures that define:

       what is tested
       expected result
       validation method
       acceptance criteria
       actual result
       pass / fail

95. Simplify Test Data Isolation into Test Data Separation.

96. Prevent Development, Test, and QA data from unintentionally affecting Production Analytics, Billing, Learning, Buyer Intelligence, Seller Intelligence, Trending, or other Production behavior.

97. Preserve Development, Testing, Staging, and Production Environment Separation.

---

## O. Physical Data Strategy

98. Preserve the fit-storage-to-workload principle.

99. Retain PostgreSQL as an appropriate early PinkCurve foundation.

100. Retain JSONB for appropriate flexible structured data without allowing it to replace deliberate modeling.

101. Retain Object Storage for media, documents, Model artifacts, and dataset files while databases maintain identifiers, metadata, and references.

102. Allow Event Storage to evolve from PostgreSQL to specialized Event infrastructure only when measured requirements justify it.

103. Introduce specialized Analytical Storage only when workload justifies it.

104. Retain Vector Storage as a derived representation while the underlying entity remains authoritative.

105. Preserve purpose-specific Data Formats rather than forcing one format across PinkCurve.

---

## P. Architectural Simplification

106. Remove or reduce generalized Data Lineage architecture.

107. Retain only necessary domain-specific traceability where there is a demonstrated business, operational, financial, Trust, debugging, governance, or legal requirement.

108. Avoid building generalized infrastructure for capabilities that can initially be handled through normal Product relationships and shared Platform services.

109. Keep Data Architecture focused on:

       structures
       identifiers
       relationships
       ownership
       contracts
       storage
       necessary traceability
       governance
       protection
       access

110. Preserve the principle:

> **PinkCurve products own product decisions and business behavior.**

Data Architecture provides the reliable information foundation but does not make Product decisions.

---

The final Chapter 11 revision should incorporate these changes while preserving the strengths identified in #86.

**Audit Status: Major revision required — Chapter 11 remains architecturally strong, but the completed audit has identified substantial updates to identifiers, ownership, Product data structures, Product interfaces, Buyer and Seller Intelligence, Analytics, Trust & Safety, Billing, privacy, Platform responsibilities, testing, migration, recovery, and architectural simplification.**

---

# 88. Revision Priority — Major Update Required

Chapter 11 contains many required revisions.

The revision should not be performed simply in the order in which the audit findings were discovered.

Instead, revisions should follow architectural dependencies:

    Foundation
        ↓
    Core Data Domains
        ↓
    Intelligence / Analytics / Trust / Billing
        ↓
    Product Data Exchange
        ↓
    Governance and Lifecycle
        ↓
    Physical Data Strategy
        ↓
    Future System Design

This allows later sections to rely on definitions established earlier and reduces unnecessary rewriting.

---

## Priority 1 — Core Data Architecture Foundation

These should be revised first because most other Chapter 11 sections depend on them.

### Data Ownership

Clarify:

- Logical Data Ownership;
- authoritative Source of Truth;
- Physical Storage responsibility;
- operational responsibility;
- producer vs consumer responsibility.

Replace generic ownership labels with explicit PinkCurve Products or Data Domains.

Explicitly state:

> Logical Product ownership does not require a separate physical database.

### Identifier Strategy

Establish the platform-wide identifier principles for important PinkCurve entities and records.

Important identifiers identified during the audit include, where applicable:

    buyer_id
    seller_id
    organization_id
    offering_id

    metadata_id
    creative_id
    campaign_id

    event_id
    session_id

    feedback_id
    review_id
    rating_id

    analytic_id
    analytic_result_id
    qov_id

    learning_output_id

    model_id
    model_version_id

    buyer_signal_id

    seller_signal_id
    seller_insight_id
    seller_opportunity_id
    seller_recommendation_id

    verification_id
    trust_signal_id
    technical_risk_result_id
    trust_decision_id

    billing_qualification_id
    billable_event_id
    invoice_item_id
    invoice_id

Remove unnecessary identifiers such as `provider_id` where `seller_id` already provides the required identity.

### Relationships

Explicitly define important relationships among PinkCurve data objects.

These relationships should provide necessary traceability without introducing a generalized Data Lineage system.

### Source of Truth

Expand the Source of Truth definitions across the major PinkCurve Data Domains.

### Schema and Data Contract Principles

Preserve and strengthen:

- Schema Strategy;
- Schema Evolution;
- Product Data Contracts;
- data validation;
- versioning.

These foundational concepts should be stable before revising the major Product data sections.

---

## Priority 2 — Core Product Data Domains

After the foundation is established, revise the principal Product data structures.

### Offering Knowledge

Strengthen:

- Offering identity;
- Offering retrieval keys;
- Offering Knowledge retrieval;
- authoritative Offering sources;
- source references;
- Offering relationships.

### Metadata and AMN

Clarify:

- Metadata identity;
- Metadata structure;
- Metadata relationships;
- AMN data boundaries;
- AMN-related identifiers.

### Creative Studio

Strengthen:

- Creative identity;
- Creative metadata;
- Creative Packages;
- Creative-to-Offering relationships;
- Creative media references.

### Campaign Data

Strengthen:

- Campaign identity;
- Campaign relationships;
- applicable Offering / Creative / Seller references.

### Discovery Data

Strengthen:

- Discovery Event identity;
- Discovery Event structure;
- Discovery Sessions;
- Buyer Feedback;
- Reviews;
- Ratings.

These Product data foundations should be established before revising the intelligence and analytical layers that consume them.

---

## Priority 3 — Analytics and Intelligence

These Products depend heavily on the Product data and identifiers established in Priorities 1 and 2.

### Discovery Analytics

Expand:

- analytic identity;
- analytic definitions;
- analytic results;
- Metrics;
- supporting Event relationships;
- analytical context;
- analytical versions.

### QOV

Strengthen:

- QOV identity;
- QOV definition;
- components;
- calculation context;
- applicable Seller / Offering / Campaign relationships;
- time period;
- version;
- resulting value.

### Buyer Intelligence

Represent the complete Buyer Intelligence model:

    Explicit Preferences
    Session Intent
    Short-Term Interests
    Persistent Preferences
    Negative Preferences
    Contextual Signals
    Behavioral Signals
    Inferred Intelligence

Define Buyer Signal identity, lifecycle, freshness, confidence, context, provenance, expiration, and privacy requirements.

### Seller Intelligence

Represent:

    Seller Signals
        ↓
    Seller Insights
        ↓
    Seller Opportunities
        ↓
    Seller Recommendations
        ↓
    Seller Actions
        ↓
    Recommendation Outcome Evidence

Also represent:

    Seller Alerts
    Seller Reports
    Seller Value Intelligence

Strengthen identifiers and relationships and include the Seller Intelligence entity/schema diagram identified during the audit.

### Learning Engine

Expand Learning Output representation and clarify:

- output identity;
- output type;
- intended consumer;
- applicable context;
- learned value / rule / parameter / score;
- confidence;
- evidence;
- evaluation;
- governance;
- approval;
- purpose-specific Models.

### AI Platform

Strengthen:

- Model Identity;
- Model Versions;
- Model Registry;
- deployments;
- prompts;
- evaluations;
- inference;
- Embeddings;
- Vector Data;
- AI technical results.

Clarify the boundary between Learning Engine and AI Platform.

Do not introduce unnecessary generalized Model Lineage.

---

## Priority 4 — Trust & Safety and Billing

These domains require particularly clear data relationships because they affect platform integrity and financial correctness.

### Trust & Safety

Expand:

- Seller Verification;
- Buyer Verification;
- Organization Verification;
- Offering Verification;
- Trust Signals;
- Technical Risk Results;
- Trust Evaluations;
- Trust Decisions;
- fraud;
- abuse;
- bot detection;
- moderation;
- security records.

Technical Risk Results must identify the entity being evaluated.

Preserve:

    Technical Analysis
        ↓
    Technical Risk Result
        ↓
    Trust & Safety
        ↓
    Trust Decision

AI technical results must not automatically become Trust policy.

### Billing

Strengthen:

    Discovery Event
        ↓
    Billing Qualification
        ↓
    Billable Event
        ↓
    Invoice Item
        ↓
    Invoice

Define:

- billable Event types;
- Billing Qualification;
- Billable Event identity;
- Invoice Item identity;
- Invoice identity;
- Invoice date;
- pricing references;
- Billing validity;
- Seller-facing Billing explanation;
- Billing ownership;
- Finance Operations responsibility.

Billing Items should already be validated before becoming Invoice Items.

---

## Priority 5 — Product-to-Product Data Exchange

Once the major Product data structures are stable, revise how those Products exchange information.

### Product Data Flow

Add logical Product-to-Product Data Flow showing:

    producer
        ↓
    data object
        ↓
    consumer

Include major relationships among:

- Buyer Experience;
- Seller Experience;
- Offering Knowledge;
- Creative Studio;
- AMN;
- AI Discovery;
- Discovery Analytics;
- Buyer Intelligence;
- Seller Intelligence;
- Learning Engine;
- AI Platform;
- Trust & Safety;
- Billing;
- Customer Support;
- PinkCurve Platform.

### API vs Event Exchange

Clarify:

    API
        → current state / requested capability

    Event
        → something happened

The final implementation decision belongs in System Design.

### Product Interface Requirements

Establish the future interface requirements identified in #84.

The complete Product Interface diagram should be finalized after the Product Blueprint audit is complete.

---

## Priority 6 — Privacy, Security, Governance, and Data Lifecycle

After the major Data Domains and flows are stable, align the cross-cutting controls.

### Access Control

Preserve:

- authentication;
- authorization;
- least privilege;
- purpose-based access;
- Seller-level isolation;
- service identity;
- administrative permissions;
- auditing.

### Data Classification

Preserve:

    Public
    Internal
    Confidential
    Restricted

### Buyer Privacy

Preserve the existing Buyer Privacy principles and extend them to inferred Buyer Intelligence.

Explicitly distinguish:

    Explicit
    Observed
    Inferred

Buyer information.

### Location and Security Data

Preserve:

- minimum-necessary Location precision;
- stronger protection for precise Location;
- purpose-limited IP-address use.

### Data Retention

Keep retention purpose-specific.

Do not establish one universal PinkCurve retention period.

### Data Deletion

Keep deletion simple.

Deletion should normally be performed by:

- the creator; or
- an authorized PinkCurve administrator;

subject to applicable retention requirements.

### Necessary Traceability

Do not build a generalized Data Lineage system.

Preserve only the relationships and domain-specific traceability required for important operational, financial, Trust, debugging, governance, or legal purposes.

---

## Priority 7 — Data Quality, Testing, Recovery, and Operations

### Data Quality

Preserve:

- Completeness;
- Accuracy;
- Consistency;
- Freshness;
- Uniqueness;
- Validity;
- Provenance;
- Integrity.

### Data Observability

Preserve Data Observability requirements while leaving detailed monitoring and incident response to PinkCurve Operations.

### Data Testing and QA

Revise Data Testing around QA responsibility.

Require documented test procedures defining:

    data being tested
    expected result
    test method
    acceptance criteria
    actual result
    pass / fail

### Test Data and Environment Separation

Preserve separation among:

    Development
    Testing
    Staging
    Production

Prevent Test data from unintentionally affecting Production behavior.

### Backup and Recovery

Clarify that shared Backup and Recovery are primarily provided by PinkCurve Platform and, where applicable, AI Platform.

### Recovery vs Recomputation

Preserve the distinction:

    Recovery
        → restore previous data

    Recomputation
        → generate a new result

PinkCurve should not depend on recomputation as its general recovery strategy.

### Data Migration

Define:

    data to migrate
    source
    destination
    protected original data
    migration
    validation
    recovery / rollback

### Data Backfill

Keep Backfill as a limited maintenance activity rather than a major architectural capability.

---

## Priority 8 — Physical Data Architecture

Physical technology decisions should follow the logical architecture rather than drive it.

Preserve:

### PostgreSQL

Appropriate early foundation for many PinkCurve Data Domains.

### JSONB

Appropriate for flexible structured data without replacing deliberate modeling.

### Object Storage

Appropriate for media, documents, Model artifacts, and dataset files.

### Event Storage

Begin simply and evolve only when measured requirements justify specialized infrastructure.

### Analytical Storage

Introduce specialized analytical systems only when workload justifies them.

### Vector Storage

Treat Vectors as derived representations while underlying entities remain authoritative.

### Data Formats

Use:

    Relational
    JSON
    Parquet
    Vector

according to purpose rather than forcing one format across PinkCurve.

Technology should follow measured need.

---

## Priority 9 — Defer to System Design and Operations

Chapter 11 should establish requirements and boundaries but should not prematurely specify implementation.

Defer detailed decisions such as:

- exact API endpoints;
- exact request / response payloads;
- complete physical database tables;
- exact physical schemas;
- database indexes;
- message queues and streaming technologies;
- cache technologies;
- service deployment boundaries;
- infrastructure topology;
- cloud-resource configuration;
- detailed backup schedules;
- migration execution procedures;
- operational monitoring implementation;
- alert routing;
- incident response procedures;
- detailed SLAs;
- exact RPO / RTO targets;
- deployment procedures;
- scaling configuration.

These should be defined later through:

    System Design
    PinkCurve Platform Design
    AI Platform Design
    PinkCurve Operations
    Product-specific implementation design

as appropriate.

---

## Revision Sequence

The recommended Chapter 11 revision sequence is therefore:

    1. Foundation
           ↓
    2. Core Product Data
           ↓
    3. Analytics / Intelligence / AI
           ↓
    4. Trust & Safety / Billing
           ↓
    5. Product Data Exchange
           ↓
    6. Privacy / Governance / Lifecycle
           ↓
    7. Quality / Testing / Recovery
           ↓
    8. Physical Data Architecture
           ↓
    9. System Design / Operations later

This sequence is based on architectural dependency rather than perceived importance.

The objective is to establish stable definitions first so that later Chapter 11 sections can build upon them without repeatedly redefining identifiers, ownership, relationships, and Data Contracts.

**Audit Status: Major revision required — update the revision priorities to reflect the completed Chapter 11 audit and organize implementation of the revisions according to architectural dependencies.**

---

# 89. Audit Classification Summary — Major Revision Required

Chapter 11 defines PinkCurve's shared Data Architecture.

Data Architecture is not itself a standalone PinkCurve Product.

Its purpose is to establish how PinkCurve data is:

- identified;
- structured;
- related;
- owned;
- exchanged;
- stored;
- protected;
- governed;
- validated;
- made available to PinkCurve Products and shared Platforms.

The Chapter 11 audit identifies the following architectural classifications.

---

## 1. PinkCurve Product

None.

**Data Architecture is not a standalone PinkCurve Product.**

It provides the shared information foundation used by PinkCurve Products, PinkCurve Platform, AI Platform, and authorized operational functions.

Data Architecture does not own Product decisions or business behavior.

---

## 2. Shared Foundational Architecture

The primary classification of Chapter 11 is:

    Data Architecture
        ↓
    Shared PinkCurve Information Foundation

Data Architecture establishes common principles for:

- identifiers;
- entities and structures;
- relationships;
- Logical Data Ownership;
- authoritative Sources of Truth;
- Product Data Contracts;
- Product-to-Product Data Exchange;
- schema and schema evolution;
- provenance;
- necessary traceability;
- Data Classification;
- access requirements;
- Data Quality;
- Data Validation;
- privacy-related data requirements;
- retention requirements;
- logical storage requirements.

These principles apply across PinkCurve without requiring every Product to use the same physical database or storage technology.

---

## 3. Major Product and Business Data Domains

Important PinkCurve Data Domains include:

### Identity and Account Data

- Buyer;
- Seller;
- Organization;
- account and identity information.

### Offering and Discovery Data

- Offering;
- Offering Knowledge;
- Metadata;
- AMN-related data;
- Creative;
- Campaign;
- Discovery Events;
- Discovery Sessions;
- Buyer Feedback;
- Reviews;
- Ratings.

### Analytics and Intelligence Data

- Discovery Analytics;
- Metrics;
- QOV;
- Buyer Intelligence;
- Buyer Signals;
- Seller Intelligence;
- Seller Signals;
- Seller Insights;
- Seller Opportunities;
- Seller Recommendations;
- Seller Alerts;
- Seller Reports;
- Seller Value Intelligence;
- Recommendation Outcome Evidence;
- Learning Outputs.

### Trust & Safety Data

- Verifications;
- Trust Signals;
- Technical Risk Results;
- Risk Scores;
- Trust Decisions;
- Fraud Cases;
- Abuse Reports;
- Bot Signals;
- Moderation Actions;
- Security Events.

### Billing Data

- Billing Qualifications;
- Billable Events;
- Invoice Items;
- Invoices;
- related financial records.

### Customer Support Data

- Support Cases;
- Support interactions;
- applicable support evidence and status.

Each Data Domain should have a clear logical owner and authoritative Source of Truth.

---

## 4. AI Technical Data Domain

AI Platform maintains AI-specific technical data required to provide shared AI capabilities.

This may include:

- Model Registry;
- Model Identity;
- Model Versions;
- Model Deployments;
- Model Endpoints;
- provider configurations;
- Prompt Registry;
- Prompt Versions;
- Evaluation Datasets;
- Evaluation Runs;
- Inference Logs;
- AI Service Usage;
- AI Cost Metrics;
- Embedding technical metadata;
- Vector Index metadata;
- AI Safety Results;
- AI Observability Events.

AI Platform ownership of this technical data does not imply ownership of the Product data processed by AI Platform.

For example:

    Offering Knowledge
        ↓
    AI Platform processing
        ↓
    AI technical result

does not transfer ownership of Offering Knowledge to AI Platform.

---

## 5. Shared PinkCurve Platform Data Capabilities

PinkCurve Platform should provide shared infrastructure capabilities where appropriate, including:

- relational data infrastructure;
- object storage infrastructure;
- shared Event infrastructure when required;
- analytical infrastructure when required;
- shared caching where required;
- Backup and Recovery;
- Data Migration support;
- environment separation;
- common operational infrastructure;
- shared data protection mechanisms.

Individual PinkCurve Products define their data requirements.

PinkCurve Platform provides common technical capabilities for satisfying those requirements.

Not every logical Data Domain requires independent physical infrastructure.

---

## 6. Shared AI Platform Data Capabilities

AI Platform should provide shared AI-specific technical capabilities where appropriate, including:

- Model management;
- Model serving;
- AI inference;
- Prompt management;
- Embedding generation;
- Vector capabilities;
- AI evaluation;
- AI safety evaluation;
- AI technical observability;
- AI usage and cost measurement;
- AI-specific recovery or migration support where required.

AI Platform provides technical AI capabilities.

PinkCurve Products remain responsible for their Product decisions and business behavior.

---

## 7. Data Governance Requirements

Important Data Governance requirements include:

- Logical Data Ownership;
- authoritative Source of Truth;
- Data Classification;
- authorization;
- least privilege;
- privacy;
- purpose limitation;
- retention;
- deletion authority;
- provenance;
- necessary domain-specific traceability;
- schema ownership;
- schema versioning;
- Product Data Contracts.

Generalized Data Lineage is not currently required.

Traceability should be introduced where a demonstrated Product, Billing, Trust, governance, debugging, operational, or legal requirement justifies it.

---

## 8. Data Quality and QA

Data quality requirements include:

- Completeness;
- Accuracy;
- Consistency;
- Freshness;
- Uniqueness;
- Validity;
- Provenance;
- Integrity.

Data Validation should occur at appropriate system boundaries.

Data Testing is primarily a **Quality Assurance responsibility**.

QA should use documented Data Test Procedures to verify important data after significant creation, update, migration, transformation, or other change.

Test procedures should identify:

    data being tested
    expected result
    validation method
    acceptance criteria
    actual result
    pass / fail

Test data should remain appropriately separated from Production data.

---

## 9. Data Lifecycle and Operational Activities

Certain activities affect PinkCurve data but should not be treated as independent Products or major Data Architecture capabilities.

These include:

### Retention

Determine how long data should remain according to purpose and applicable requirements.

### Deletion

Allow deletion by the creator or an authorized PinkCurve administrator, subject to applicable retention requirements.

### Backup and Recovery

Protect and restore required previous data through PinkCurve Platform or AI Platform capabilities as appropriate.

### Data Migration

Move identified data from a defined source to a defined destination with protection of the original data, validation, and recovery / rollback where required.

### Data Backfill

Perform limited maintenance processing of existing data when a real Product or data requirement requires it.

Backfill should not be treated as a major standalone PinkCurve architectural capability.

---

## 10. Product Data Exchange

Product-to-Product Data Exchange is a major Chapter 11 architectural responsibility.

For important exchanges, PinkCurve should identify:

    Producer
        ↓
    Data Object
        ↓
    Product Data Contract
        ↓
    Consumer

Important interface characteristics include:

- producer;
- consumer;
- Logical Data Owner;
- identifier;
- schema;
- schema version;
- required and optional data;
- context;
- freshness or validity;
- authorization;
- privacy classification;
- provenance where required;
- compatibility requirements.

Chapter 11 establishes these logical requirements.

Detailed APIs and Event implementations belong in later System Design.

---

## 11. API and Event Exchange

PinkCurve should distinguish logically between:

    API / Request-Response
        → request current information
          or perform a capability

and:

    Event
        → record or communicate
          that something happened

The appropriate implementation should be determined later through System Design.

---

## 12. Physical Storage Capabilities

PinkCurve may use different storage approaches according to workload.

These include:

    Relational Storage
        → transactional structured data

    JSONB
        → flexible structured data

    Object Storage
        → media, documents, datasets,
          and Model artifacts

    Event Storage
        → Event history and Event processing

    Analytical Storage
        → large-scale Analytics when required

    Vector Storage
        → semantic representations

    Cache
        → temporary performance optimization
          where required

Physical technology should follow measured requirements.

Logical Product ownership does not require separate physical storage.

---

## 13. Data Format Strategy

Different formats should be used according to purpose:

    Relational
        → transactional structured data

    JSON
        → flexible structured data
          and interface exchange

    Parquet
        → analytical, training,
          and batch data

    Vector
        → semantic representation

No single data format should be forced across PinkCurve.

---

## 14. Environment and Production Protection

PinkCurve should maintain separation among:

    Development
    Testing
    Staging
    Production

Production data should not be freely copied into lower environments.

Test data should not unintentionally affect:

- Production Analytics;
- Billing;
- Trending;
- Learning;
- Buyer Intelligence;
- Seller Intelligence;
- Trust & Safety;
- Production AI behavior.

Environment separation should primarily be supported by PinkCurve Platform and AI Platform where applicable.

---

## 15. Data Observability

Data Observability should identify important data problems such as:

- missing data;
- unexpected volume changes;
- schema failures;
- stale data;
- duplicates;
- broken relationships;
- invalid references;
- analytical discrepancies;
- Billing reconciliation failures;
- Signal freshness failures;
- version mismatches.

Chapter 11 defines what should be observable.

Detailed monitoring, alerting, incident handling, and operational response belong primarily in PinkCurve Operations and shared Platform implementation.

---

## 16. Core Design Requirements

The revised Chapter 11 should preserve the following core requirements:

- stable identifiers;
- explicit important relationships;
- clear Logical Data Ownership;
- authoritative Sources of Truth;
- Product Data Contracts;
- directional Product-to-Product Data Flow;
- schema and schema versioning;
- provenance;
- necessary traceability;
- privacy by design;
- Trust by design;
- least privilege;
- purpose-based access;
- Data Quality;
- Data Validation;
- QA and documented Data Testing;
- purpose-specific retention;
- controlled deletion;
- Backup and Recovery;
- controlled Data Migration;
- Test Data Separation;
- Environment Separation;
- logical ownership independent of physical storage;
- fit-storage-to-workload;
- incremental infrastructure evolution.

---

## 17. Architectural Responsibility Summary

The resulting responsibility model is:

    Data Architecture
        ↓
    Defines information structure,
    ownership, relationships,
    contracts and governance

    PinkCurve Platform
        ↓
    Provides shared application,
    data and infrastructure capabilities

    AI Platform
        ↓
    Provides shared AI
    technical capabilities

    PinkCurve Products
        ↓
    Own Product data where applicable,
    consume shared capabilities,
    and make Product decisions

    Quality Assurance
        ↓
    Verifies data and Product quality

    PinkCurve Operations
        ↓
    Operates, monitors and supports
    the production environment

This separation should remain clear throughout Chapter 11.

> **Data Architecture defines how PinkCurve information is organized and governed. Shared Platforms provide common technical capabilities. PinkCurve Products own Product decisions and business behavior.**

**Audit Status: Major revision required — reorganize the classification around Data Architecture, Product Data Domains, PinkCurve Platform, AI Platform, Product Data Exchange, Governance, QA, Lifecycle, Physical Storage, and Operations while removing generalized lineage and reducing Backfill from a major shared capability.**

---

# 90. Recommended Chapter 11 Updates — Major Revision Required

The completed audit identifies substantial updates required for Chapter 11.

The revised Chapter 11 should incorporate the following major changes while preserving the architectural strengths identified in #86.

---

## 1. Strengthen Data Architecture Scope and Responsibility

Clarify that Data Architecture is a shared foundational architecture rather than a standalone PinkCurve Product.

Data Architecture should define how PinkCurve information is:

- identified;
- structured;
- related;
- owned;
- exchanged;
- stored;
- protected;
- governed;
- validated.

PinkCurve Products remain responsible for Product decisions and business behavior.

---

## 2. Strengthen Data Ownership Definitions

Explicitly distinguish:

- Logical Product / Data Domain Ownership;
- authoritative Source of Truth;
- Physical Storage responsibility;
- operational responsibility;
- producer responsibility;
- consumer responsibility.

Explicitly state:

> Logical Product ownership does not require a separate physical database.

Consuming another Product's data does not transfer ownership of that data.

---

## 3. Add a Platform-Wide Identifier Strategy

Define stable identifiers for important PinkCurve entities, records, events, results, intelligence outputs, Trust records, and Billing records.

The strategy should cover identifiers such as:

    buyer_id
    seller_id
    organization_id
    offering_id

    metadata_id
    creative_id
    campaign_id

    session_id
    event_id

    feedback_id
    review_id
    rating_id

    analytic_id
    analytic_result_id
    qov_id

    learning_output_id

    model_id
    model_version_id

    buyer_signal_id

    seller_signal_id
    seller_insight_id
    seller_opportunity_id
    seller_recommendation_id

    verification_id
    trust_signal_id
    technical_risk_result_id
    trust_decision_id

    billing_qualification_id
    billable_event_id
    invoice_item_id
    invoice_id

Remove unnecessary or ambiguous identifiers where another established identifier already provides the required identity.

---

## 4. Strengthen Entity Relationships

Important PinkCurve records should contain sufficient identifiers and relationships to determine what they belong to and how they relate to other important records.

Relationships should support normal Product retrieval and necessary traceability without requiring a generalized Data Lineage architecture.

---

## 5. Strengthen Offering and Offering Knowledge Data

Clarify:

- Offering identity;
- Seller-to-Offering relationships;
- Offering retrieval;
- Offering Knowledge retrieval;
- Offering Knowledge sources;
- source references;
- source versions where required;
- authoritative Offering facts;
- derived Offering information.

The authoritative source should remain distinguishable from derived or AI-generated representations.

---

## 6. Strengthen Metadata and AMN Data

Treat Metadata as first-class PinkCurve data.

Clarify:

- `metadata_id`;
- Metadata type;
- Metadata value;
- applicable Offering / category relationships;
- source;
- status;
- version where required.

Represent the data requirements needed by Adaptive Metadata Navigation without prematurely defining its physical implementation.

---

## 7. Strengthen Creative and Campaign Data

Clarify identifiers and relationships for:

- Creative;
- Creative Packages;
- Creative media;
- Campaigns;
- Offering relationships;
- Seller relationships;
- media references;
- Creative status and versions where appropriate.

Object Storage should hold large Creative media while databases maintain identifiers, metadata, relationships, and storage references.

---

## 8. Strengthen Discovery Data

Explicitly represent important Discovery data including:

- Discovery Sessions;
- Discovery Events;
- Event types;
- Buyer actions;
- Offering references;
- Creative references;
- Campaign references where applicable;
- AMN interactions;
- searches;
- click-throughs;
- Feedback;
- Reviews;
- Ratings;
- contextual information where permitted.

Discovery Events should remain historical facts and should not automatically become Analytical, Learning, Trust, or Billing decisions.

---

## 9. Expand Discovery Analytics Data

Represent Analytics more completely, including where appropriate:

- analytic definitions;
- analytic identifiers;
- Analytical Results;
- Metrics;
- dimensions;
- time periods;
- supporting Discovery Events;
- calculation versions;
- applicable Seller / Offering / Campaign context.

Discovery Analytics should remain authoritative for the Analytical Results it creates.

---

## 10. Strengthen QOV Data and Ownership

Establish Discovery Analytics as authoritative for QOV definition and calculation.

Represent:

- `qov_id`;
- applicable entity/context;
- QOV components;
- calculation period;
- calculation version;
- resulting value;
- supporting Analytical Results where required.

---

## 11. Expand Learning Engine Data

Represent Learning Engine outputs explicitly.

A Learning Output may include:

    learning_output_id
    output_type
    intended_consuming_product
    applicable_context

    learned_value
    rule
    parameter
    score
    model_reference

    confidence / strength

    supporting_evidence
    provenance_reference

    model_or_rule_version

    evaluation_status
    creation_time
    validity_period

    governance_status
    approval_status

Not every Learning Output is a Model.

Learning Outputs may be consumed by multiple authorized PinkCurve Products.

---

## 12. Clarify Learning Engine and AI Platform Responsibilities

Learning Engine owns purpose-specific learning behavior and governed Learning Outputs.

AI Platform provides shared technical AI capabilities.

Where Learning Engine produces a Model intended for deployment, AI Platform may provide:

- Model registration;
- deployment;
- serving;
- technical evaluation;
- inference infrastructure;
- technical observability.

The boundary between the two should remain explicit.

---

## 13. Strengthen Model Identity and Versioning

Represent Models with sufficient identity to distinguish:

- Model;
- Model Version;
- purpose;
- owner;
- provider where applicable;
- deployment;
- evaluation;
- status;
- applicable Product use.

Do not depend on Model name alone as Model identity.

---

## 14. Simplify Model Lineage

Do not build a generalized Model Lineage architecture unless future requirements justify it.

Preserve the specific Model relationships, versions, provenance, evaluation references, and supporting evidence required for:

- governance;
- evaluation;
- debugging;
- operation;
- approval.

---

## 15. Expand and Consolidate AI Platform Data

Consolidate overlapping AI Platform sections.

Represent AI technical data such as:

- Model Registry;
- Model Versions;
- Model Deployments;
- Model Endpoints;
- provider configurations;
- Prompt Registry;
- Prompt Versions;
- Evaluation Datasets;
- Evaluation Runs;
- Inference Logs;
- AI Service Usage;
- AI Cost Metrics;
- Vector Index metadata;
- Embedding technical metadata;
- AI Safety Results;
- AI Observability Events.

AI Platform does not become the owner of Product data merely because it processes that data.

---

## 16. Strengthen Embedding and Vector Data

Embeddings and Vectors should identify their underlying authoritative source.

Where appropriate, represent:

    embedding_id
    entity_id
    entity_type

    source_reference
    source_location
    source_version

    embedding_model
    embedding_model_version

    embedding / vector reference

    created_at
    status

The Vector remains a derived representation.

The underlying entity remains authoritative.

---

## 17. Expand Buyer Intelligence Data

Represent the complete Buyer Intelligence model:

    Buyer Intelligence
        │
        ├── Explicit Preferences
        ├── Session Intent
        ├── Short-Term Interests
        ├── Persistent Preferences
        ├── Negative Preferences
        ├── Contextual Signals
        ├── Behavioral Signals
        └── Inferred Intelligence

Buyer Intelligence should create identifiable, structured, machine-consumable Buyer Signals.

---

## 18. Define Buyer Signal Lifecycle

Buyer Signals should support, where appropriate:

- identity;
- Buyer relationship;
- Signal category;
- Signal type;
- value;
- strength;
- confidence;
- source;
- context;
- provenance;
- observation time;
- creation time;
- freshness;
- expiration;
- privacy classification.

Different Buyer Signal categories may have different lifetimes.

---

## 19. Expand Seller Intelligence Data

Represent the full Seller Intelligence output model:

    Evidence
        ↓
    Seller Signal
        ↓
    Seller Insight
        ↓
    Seller Opportunity
        ↓
    Seller Recommendation
        ↓
    Seller Action
        ↓
    Recommendation Outcome Evidence

Also represent:

- Seller Alerts;
- Seller Reports;
- Seller Value Intelligence.

Each independently meaningful Seller Intelligence object should have an appropriate identifier and Seller relationship.

---

## 20. Strengthen Seller Signal and Seller Intelligence Relationships

Seller Signals should identify applicable:

- Seller;
- Offering;
- Creative;
- Campaign;
- evidence;
- source;
- context;
- confidence;
- severity / priority where applicable;
- Model or Learning reference where applicable;
- validity.

Add a logical Seller Intelligence schema/entity diagram showing the relationships among the major Seller Intelligence objects.

---

## 21. Expand Trust & Safety Data

Represent Trust & Safety data more completely, including:

- Seller Verifications;
- Buyer Verifications;
- Organization Verifications;
- Offering Verifications;
- Trust Signals;
- Technical Risk Results;
- Risk Scores;
- Trust Decisions;
- Fraud Cases;
- Abuse Reports;
- Bot Signals;
- Moderation Actions;
- Security Events.

Verification records should have clear relationships to applicable Trust Signals, evidence, and Trust decisions.

---

## 22. Strengthen Technical Risk Results

A Technical Risk Result must identify what was evaluated.

Where applicable, it should reference:

    seller_id
    buyer_id
    organization_id
    offering_id
    creative_id
    campaign_id

or another applicable entity identifier.

Preserve the boundary:

    Technical Analysis
        ↓
    Technical Risk Result
        ↓
    Trust & Safety
        ↓
    Policy Evaluation
        ↓
    Trust Decision

A technical AI result should not automatically become a Trust decision.

---

## 23. Expand Billing Data Architecture

Represent the Billing flow explicitly:

    Discovery Event
        ↓
    Billing Qualification
        ↓
    Billable Event
        ↓
    Invoice Item
        ↓
    Invoice

A raw Discovery Event should not automatically become a financial record.

---

## 24. Define Billing Event Qualification

Identify which Event types may be candidates for Billing.

Billing Qualification should determine whether an Event satisfies the applicable Billing rules, including appropriate validity, bot/fraud, duplication, pricing, and other required checks.

Only qualified Events should become Billable Events.

---

## 25. Strengthen Invoice Data

Invoices should contain sufficient information for Sellers and Finance Operations to understand the charge.

Represent, where appropriate:

- `invoice_id`;
- Seller;
- Invoice date;
- Billing period;
- Invoice Items;
- amounts;
- adjustments;
- taxes where applicable;
- total;
- status;
- payment information;
- applicable references.

Invoice Items should reference valid Billable Events.

---

## 26. Clarify Billing and Finance Operations Responsibilities

Billing owns Billing logic and Invoice generation.

Finance Operations may operate, monitor, reconcile, review, and support the Billing process.

The Seller should be able to determine what was billed and why.

---

## 27. Expand Source of Truth

Update the Source of Truth table across all major PinkCurve Data Domains, including:

- identity;
- Offerings;
- Offering Knowledge;
- Creative;
- Discovery Events;
- Analytics;
- QOV;
- Learning Outputs;
- AI technical state;
- Buyer Signals;
- Seller Intelligence;
- Trust;
- Billing;
- Customer Support.

---

## 28. Revise Data Ownership Table

Replace broad organizational labels with explicit PinkCurve Products or authoritative Data Domains.

The table should identify the logical owner rather than merely the team that may currently implement or operate the data.

---

## 29. Add Product-to-Product Data Flow

Complement infrastructure-oriented Data Flow with logical PinkCurve Product information flow.

For important exchanges identify:

    Producing Product
        ↓
    Data Object
        ↓
    Consuming Product

Direction should be explicit.

The complete Product Data Flow should be finalized after the Product Blueprint audit.

---

## 30. Strengthen Product Data Contracts

Important Product exchanges should eventually define, where applicable:

- producer;
- consumer;
- Data Owner;
- identifier;
- schema;
- schema version;
- required fields;
- optional fields;
- timestamps;
- freshness;
- expiration;
- provenance;
- privacy classification;
- authorization;
- confidence;
- Model Version;
- Source Version;
- correlation / trace information where required;
- compatibility expectations.

Detailed physical interfaces belong in System Design.

---

## 31. Distinguish API Exchange from Event Exchange

Preserve the conceptual distinction:

    API
        → requests current information
          or performs a capability

    Event
        → records or communicates
          that something happened

Chapter 11 defines the logical exchange.

System Design determines the implementation.

---

## 32. Expand Privacy to Inferred Buyer Intelligence

Privacy requirements should apply not only to Raw Buyer Events but also to derived and inferred Buyer Intelligence.

Distinguish:

    Explicit Buyer Information
    Observed Buyer Information
    Inferred Buyer Intelligence

Apply appropriate:

- privacy classification;
- purpose limitation;
- access control;
- retention;
- expiration;
- reset / deletion behavior.

---

## 33. Preserve Data Classification and Access Control

Retain:

    Public
    Internal
    Confidential
    Restricted

Access should continue to follow:

- authentication;
- authorization;
- least privilege;
- purpose-based access;
- Seller-level isolation;
- service identity;
- administrative permissions;
- auditing.

Products should not automatically receive complete access to another Product's Data Domain.

---

## 34. Preserve Purpose-Specific Retention

Different Data Domains may require different retention periods.

Retention should be determined by purpose rather than through one universal PinkCurve retention period.

---

## 35. Simplify Data Deletion

Data should normally be deleted only by:

- its creator; or
- an authorized PinkCurve administrator;

subject to applicable retention requirements.

The creator may be:

    Buyer
    Seller
    PinkCurve
    PinkCurve Product
    PinkCurve Capability

Detailed deletion implementation belongs later.

---

## 36. Replace Generalized Lineage with Necessary Traceability

Remove or substantially reduce generalized Data Lineage requirements.

PinkCurve should maintain necessary relationships and traceability only where justified by:

- Product operation;
- Billing;
- Trust & Safety;
- governance;
- debugging;
- Customer Support;
- legal requirements.

Do not build a generalized Lineage system merely because one is technically possible.

---

## 37. Clarify Backup and Recovery Responsibility

Backup and Recovery should primarily be provided through:

- PinkCurve Platform; or
- AI Platform for appropriate AI-specific data/infrastructure.

Products define their recovery requirements.

The shared Platform provides the recovery capability.

---

## 38. Distinguish Recovery from Recomputation

Preserve:

    Recovery
        → restores previous data

    Recomputation
        → produces a new result

PinkCurve should not rely on future recomputation as its general method for recovering previously stored data.

---

## 39. Define Data Migration Clearly

Data Migration should identify:

- data to migrate;
- source;
- destination;
- protected copy / backup of original data;
- migration procedure;
- validation;
- success criteria;
- recovery / rollback if unsuccessful.

Shared migration capability should primarily be provided by PinkCurve Platform or AI Platform as appropriate.

---

## 40. Reduce Data Backfill to a Maintenance Activity

Backfill should not be treated as a major standalone architectural capability.

Use it only when existing data needs to be processed to support a new real Product or data requirement.

Detailed Backfill execution belongs in Platform implementation and Operations.

---

## 41. Strengthen Data Testing and QA

Treat Data Testing primarily as a QA responsibility.

After significant data creation, update, migration, transformation, or other change, appropriate testing should verify:

- Accuracy;
- Completeness;
- Validity;
- Consistency;
- Uniqueness;
- relationships;
- expected results.

Good Data Test Procedures should document:

    what is tested
    expected result
    test method
    acceptance criteria
    actual result
    pass / fail

---

## 42. Clarify Test Data Separation

Development, Test, QA, and simulated data should not unintentionally affect Production:

- Analytics;
- Billing;
- Trending;
- Learning;
- Buyer Intelligence;
- Seller Intelligence;
- Trust & Safety;
- AI behavior.

---

## 43. Preserve Environment Separation

Maintain appropriate separation among:

    Development
    Testing
    Staging
    Production

Separation should include data, credentials, configuration, permissions, services, and resources where appropriate.

---

## 44. Strengthen Data Observability Boundaries

Chapter 11 should define important data conditions that need observation, including:

- missing Events;
- stale data;
- schema failures;
- duplicates;
- broken relationships;
- version mismatches;
- Signal freshness failures;
- analytical discrepancies;
- Billing reconciliation failures.

Detailed monitoring, alerting, incident response, and operational procedures belong in PinkCurve Operations and shared Platform implementation.

---

## 45. Preserve Physical Storage Strategy

Continue to fit storage to workload rather than forcing one technology across PinkCurve.

Recognize:

    Relational
    Flexible Structured
    Object
    Event / Analytics
    Vector

as different storage needs.

Avoid unnecessary infrastructure proliferation.

---

## 46. Retain PostgreSQL as an Early Foundation

PostgreSQL may support many early PinkCurve Data Domains, including:

- accounts;
- Buyers;
- Sellers;
- Organizations;
- Offerings;
- Offering Knowledge;
- Metadata;
- Campaigns;
- Reviews;
- Ratings;
- Recommendations;
- Billing;
- Support metadata;
- Trust state;
- early Analytics;
- JSONB;
- initial Vector retrieval.

Specialized technologies should be introduced only when requirements justify them.

---

## 47. Preserve Appropriate JSONB Use

Use JSONB for appropriate flexible structured data.

Do not use JSONB to hide important PinkCurve:

- identifiers;
- entities;
- relationships;
- frequently queried fields;
- important Billing or Trust data.

---

## 48. Preserve Object Storage Strategy

Use Object Storage for:

- images;
- video;
- audio;
- documents;
- Creative media;
- Model artifacts;
- dataset files.

Databases should generally maintain identifiers, metadata, relationships, and Object Storage references.

---

## 49. Preserve Incremental Event and Analytical Storage Evolution

Early Event and Analytics workloads may use PostgreSQL.

Introduce specialized:

- Event Streaming;
- Raw Event Storage;
- analytical warehouses;
- other large-scale analytical infrastructure;

only when measured workload requirements justify them.

---

## 50. Preserve Vector Storage Principles

Vector storage may use pgvector, managed Vector databases, or other Vector-capable systems as requirements evolve.

Vectors remain derived representations.

Underlying entities remain authoritative.

---

## 51. Preserve Data Format Strategy

Use formats according to purpose:

    Relational
        → transactional structured data

    JSON
        → flexible structured data / exchange

    Parquet
        → analytical / training / batch data

    Vector
        → semantic representation

No single format should be forced across PinkCurve.

---

## 52. Clarify PinkCurve Platform Responsibility

Where appropriate, PinkCurve Platform should provide shared technical capabilities such as:

- databases and shared storage infrastructure;
- Object Storage;
- Event infrastructure;
- analytical infrastructure;
- Backup and Recovery;
- Data Migration support;
- environment separation;
- common operational infrastructure.

Products should not independently rebuild shared Platform capabilities without a justified requirement.

---

## 53. Preserve AI Platform Responsibility

AI Platform should provide shared AI technical capabilities such as:

- Models;
- Model serving;
- inference;
- prompts;
- Embeddings;
- Vector capabilities;
- AI evaluation;
- AI safety;
- AI technical observability.

The established distinction between PinkCurve Platform and AI Platform should remain.

---

## 54. Position Chapter 11 as the Foundation for System Design

Chapter 11 should answer:

    What data exists?

    What identifies it?

    Who owns it?

    What is authoritative?

    How is it related?

    What Product produces it?

    What Product consumes it?

    What Data Contract governs the exchange?

    What privacy, security, quality,
    and lifecycle requirements apply?

Later System Design should answer:

    How is it technically implemented?

Detailed:

- APIs;
- endpoints;
- physical tables;
- exact schemas;
- Event technologies;
- queues;
- service boundaries;
- deployment topology;
- retry mechanisms;
- infrastructure configuration;
- detailed SLAs;

should remain outside Chapter 11 unless needed to establish an architectural requirement.

---

## 55. Preserve the Core Architectural Principle

The revised Chapter 11 should preserve:

> **PinkCurve Products own Product decisions and business behavior.**

Conceptually:

    Data Architecture
          ↓
    Reliable Information Foundation
          ↓
    PinkCurve Platform / AI Platform
          ↓
    PinkCurve Products
          ↓
    Product Decisions
    and Business Behavior

Data Architecture enables reliable Product behavior.

It does not make Product decisions.

---

## Recommended Use of This Section

This section should serve as the high-level revision scope for Chapter 11.

The related audit sections have complementary purposes:

    #87 Major Required Updates
        → detailed audit checklist

    #88 Recommended Revision Sequence
        → order in which revision work should proceed

    #89 Audit Classification Summary
        → architectural responsibility and classification

    #90 Recommended Chapter 11 Updates
        → consolidated scope of what the revised
          Chapter 11 should contain

Together, #87–#90 should guide the actual revision of `11-data-architecture.md`.

**Audit Status: Major revision required — replace the original limited update list with the consolidated Chapter 11 revision scope identified through the complete audit.**

---

# 91. Audit Assessment

**Architecture: STRONG FOUNDATION — MAJOR REVISION REQUIRED**

**Importance: CRITICAL**

**Revision Scope: SUBSTANTIAL**

Chapter 11 provides a strong architectural foundation for PinkCurve Data Architecture.

The audit confirms that its fundamental direction remains sound:

> **PinkCurve should maintain a logically unified, explicitly owned, trustworthy, and governable information architecture while allowing physical storage and implementation to evolve according to actual requirements.**

However, the detailed Product Blueprint audit identified substantial areas that must be strengthened before Chapter 11 should be considered complete.

The required work is primarily an expansion and clarification of the existing architecture rather than a replacement of its fundamental direction.

---

## Architectural Strengths Confirmed

The audit confirms major strengths including:

- Offering-centered architecture;
- logical architecture before physical implementation;
- logically unified but physically flexible data architecture;
- authoritative Source of Truth;
- Source / Derived / Learned separation;
- first-class Metadata;
- historical Discovery Event preservation;
- Buyer Feedback, Reviews, and Ratings;
- separation of Events, Analytics, Learning, and Product decisions;
- provenance;
- necessary domain-specific traceability;
- privacy by design;
- Trust by design;
- Data Classification;
- Access Control and least privilege;
- purpose-specific Data Retention;
- Schema Strategy and Schema Evolution;
- Data Validation;
- Data Quality;
- Data Observability;
- Data Testing and QA;
- Backup and Recovery;
- controlled Data Migration;
- Test Data Separation;
- Environment Separation;
- fit-storage-to-workload;
- incremental infrastructure evolution;
- PostgreSQL as an appropriate early foundation;
- flexible use of JSONB;
- Object Storage for large media and files;
- evolutionary Event and Analytical storage;
- Vector data as derived representation;
- purpose-specific Data Formats.

These architectural strengths should remain in the revised Chapter 11.

---

## Major Architectural Improvements Identified

The audit identified several areas requiring substantial improvement.

### Ownership and Authority

Chapter 11 needs clearer distinctions among:

- Logical Data Ownership;
- authoritative Source of Truth;
- Physical Storage responsibility;
- operational responsibility;
- producer responsibility;
- consumer responsibility.

Logical Product ownership should remain independent of physical database placement.

---

### Identifier and Relationship Architecture

Important PinkCurve entities and Product outputs require explicit, stable identifiers.

Relationships among those identifiers must be sufficiently defined so PinkCurve can reliably retrieve, associate, validate, and exchange related information.

This is one of the most important improvements identified by the audit.

---

### Product Data Domains

Several Product Data Domains require significant expansion, particularly:

- Offering Knowledge;
- Metadata and AMN;
- Creative and Campaign Data;
- Discovery Events and Sessions;
- Discovery Analytics;
- QOV;
- Learning Engine;
- AI Platform;
- Buyer Intelligence;
- Seller Intelligence;
- Trust & Safety;
- Billing.

These domains should identify their important data objects, identifiers, relationships, ownership, and authoritative sources.

---

### Buyer and Seller Intelligence

Buyer Intelligence and Seller Intelligence require substantially stronger representation.

Buyer Intelligence should represent the complete Buyer Intelligence model and Buyer Signal lifecycle.

Seller Intelligence should represent the relationship:

    Evidence
        ↓
    Seller Signal
        ↓
    Seller Insight
        ↓
    Seller Opportunity
        ↓
    Seller Recommendation
        ↓
    Seller Action
        ↓
    Recommendation Outcome Evidence

along with Seller Alerts, Reports, and Seller Value Intelligence.

---

### Learning Engine and AI Platform

Learning Engine should explicitly represent governed Learning Outputs rather than treating all learning as Models.

AI Platform should represent the technical data required for PinkCurve's shared AI foundation.

The responsibility boundary should remain clear:

    Learning Engine
        → learning behavior and Learning Outputs

    AI Platform
        → shared AI technical capabilities

Model Identity and Model Versioning should be strengthened.

Generalized Model Lineage should not be introduced unless a demonstrated future requirement justifies it.

---

### Trust & Safety

Trust & Safety requires stronger relationships among:

- Verifications;
- Trust Signals;
- Technical Risk Results;
- Risk Scores;
- Trust Decisions;
- Fraud and Abuse records;
- Bot Signals;
- Moderation Actions;
- Security Events.

Technical Risk Results must identify the entity being evaluated.

Technical AI results must remain distinct from Trust policy decisions.

---

### Billing

Billing requires stronger representation because of its financial importance.

The architecture should explicitly preserve:

    Discovery Event
        ↓
    Billing Qualification
        ↓
    Billable Event
        ↓
    Invoice Item
        ↓
    Invoice

Billing Event types, qualification, identifiers, Invoice structure, Invoice date, validity, and Seller-facing Billing explanation require clear representation.

Billing should generate valid financial records only after applicable qualification and validation.

---

### Product-to-Product Data Exchange

Chapter 11 should be expanded beyond infrastructure-oriented Data Flow.

It should establish logical Product-to-Product exchange:

    Producer
        ↓
    Data Object
        ↓
    Product Data Contract
        ↓
    Consumer

The architecture should identify direction, ownership, identifiers, schemas, authorization, privacy, freshness, and other applicable Data Contract requirements.

API exchange and Event exchange should remain conceptually distinct.

Detailed technical interfaces belong in later System Design.

---

### Privacy and Governance

Privacy requirements should explicitly extend to inferred Buyer Intelligence.

Chapter 11 should preserve:

- purpose limitation;
- Data Classification;
- least privilege;
- retention;
- deletion authority;
- minimum necessary Location precision;
- appropriate treatment of IP and security data.

Generalized Data Lineage should be replaced by necessary domain-specific traceability where a demonstrated requirement exists.

---

### Shared Platform Responsibilities

The audit clarified that several technical capabilities should not be independently implemented by every PinkCurve Product.

The **PinkCurve Platform** should provide shared infrastructure capabilities where appropriate, including:

- storage infrastructure;
- databases;
- Object Storage;
- Event infrastructure;
- analytical infrastructure;
- Backup and Recovery;
- Data Migration support;
- environment separation;
- common operational infrastructure.

The **AI Platform** should provide shared AI-specific technical capabilities.

Individual Products define their Product and data requirements while shared Platforms provide common technical capabilities.

---

### QA and Operations

Data Testing should be treated primarily as a Quality Assurance responsibility supported by documented test procedures.

PinkCurve Operations should own or coordinate detailed operational activities such as:

- production monitoring;
- alerting;
- incident handling;
- operational recovery procedures;
- operational execution.

Chapter 11 should establish the Data Architecture requirements without becoming an Operations manual.

---

## Architectural Simplification Identified by the Audit

The audit did not only identify missing architecture.

It also identified areas where PinkCurve should avoid unnecessary complexity.

In particular:

- do not build generalized Data Lineage without demonstrated need;
- do not treat Backfill as a major standalone capability;
- do not depend on recomputation as the recovery strategy for historical data;
- do not require separate physical databases for every logical Product;
- do not introduce specialized Event, Analytical, or Vector infrastructure prematurely;
- do not put detailed APIs into Data Architecture;
- do not duplicate shared PinkCurve Platform or AI Platform capabilities inside individual Products;
- do not allow flexible structures such as JSONB to replace deliberate modeling of important entities and relationships.

This simplification is an important result of the audit.

---

## Relationship to Future System Design

The revised Chapter 11 should provide sufficient information for future System Design to answer implementation questions without rediscovering fundamental Data Architecture decisions.

Chapter 11 should establish:

    What data exists?

    What identifies it?

    Who owns it?

    What is authoritative?

    How is it related?

    Who produces it?

    Who consumes it?

    How is it logically exchanged?

    What Data Contract applies?

    What privacy, security, quality,
    and lifecycle requirements apply?

System Design should later determine:

    How is it technically implemented?

This boundary should remain explicit.

---

## Overall Assessment

Chapter 11 should **not be discarded or redesigned from the beginning**.

Its fundamental architectural direction is strong.

However, the detailed audit has shown that the chapter requires a substantial revision before it accurately represents the complete PinkCurve architecture now defined across the Product Blueprint.

The revision should follow the roadmap established by:

    #87 Major Required Updates
        → comprehensive audit checklist

    #88 Recommended Revision Sequence
        → order of revision work

    #89 Audit Classification Summary
        → architectural responsibility map

    #90 Recommended Chapter 11 Updates
        → revision acceptance scope

Together, these sections provide the roadmap for completing the Chapter 11 revision.

---

## Final Audit Assessment

**Architecture:** STRONG FOUNDATION

**Importance:** CRITICAL

**Revision Requirement:** MAJOR

**Architectural Direction:** RETAIN

**Implementation Detail:** DEFER WHERE APPROPRIATE

**Primary Objective:** COMPLETE AND CLARIFY THE LOGICAL DATA ARCHITECTURE BEFORE DETAILED SYSTEM DESIGN

The Chapter 11 audit therefore concludes:

> **PinkCurve has a strong Data Architecture foundation, but Chapter 11 now requires a major structured revision to fully represent the identifiers, relationships, ownership, Product Data Domains, Product Data Contracts, governance, shared Platform responsibilities, and Product-to-Product information flows established by the completed Product Blueprint audit.**

The revised Chapter 11 should remain comprehensive enough to guide PinkCurve development while avoiding premature physical implementation and unnecessary architectural complexity.

---

# 92. Final Audit Conclusion

The Chapter 11 audit confirms that Data Architecture is one of the most important foundational architectures in the PinkCurve Product Blueprint.

The fundamental architectural direction is strong and should remain.

However, the audit also demonstrates that Chapter 11 now requires a major structured revision because the PinkCurve Product Blueprint has matured substantially since the chapter was originally written.

The revision should strengthen and complete the architecture without unnecessarily increasing implementation complexity.

---

## Core Architectural Direction

PinkCurve Data Architecture should remain:

> **Offering-centered, not Offering-only.**

> **Logically unified but physically flexible.**

> **Authoritative-Source preserving.**

> **Explicitly identified and related.**

> **Event-history preserving.**

> **Metadata-aware.**

> **Provenance-aware.**

> **Privacy-aware.**

> **Trust-aware.**

> **Quality-controlled and testable.**

> **Recoverable.**

> **Able to evolve as PinkCurve grows.**

No single database, storage technology, schema format, or infrastructure design should define the PinkCurve Data Architecture.

The logical architecture should remain stable while physical implementation is allowed to evolve according to demonstrated Product, scale, performance, reliability, security, and operational requirements.

---

## Why Chapter 11 Requires Major Revision

The need for revision is not primarily the result of weakness in the original architecture.

It is the result of the PinkCurve Product Blueprint becoming substantially more complete.

The audit has clarified:

- Product and Data Domain ownership;
- authoritative Sources of Truth;
- platform-wide identifier requirements;
- relationships among major data entities;
- Offering and Offering Knowledge retrieval;
- Metadata and AMN data;
- Creative and Campaign data;
- Discovery Events and Discovery Sessions;
- Buyer Feedback, Reviews, and Ratings;
- Discovery Analytics and QOV;
- Learning Outputs;
- Model Identity and Model Versioning;
- AI Platform technical data;
- Embeddings and Vector data;
- Buyer Intelligence and Buyer Signals;
- Seller Intelligence and its complete output chain;
- Trust & Safety data;
- Technical Risk Results;
- Billing Qualification and Billable Events;
- Invoice Items and Invoices;
- Product Data Contracts;
- Product-to-Product Data Flow;
- API and Event boundaries;
- privacy and governance;
- Data Quality and Data Observability;
- QA and Data Testing;
- Backup and Recovery;
- Data Migration;
- Test Data and Environment Separation;
- physical storage evolution;
- the boundary between Data Architecture and future System Design.

These decisions must now be incorporated into Chapter 11.

---

## Product and Platform Responsibilities

The audit establishes an important responsibility model:

    Data Architecture
        ↓
    Defines information structure,
    identity, relationships,
    ownership, contracts,
    governance and requirements

    PinkCurve Platform
        ↓
    Provides shared application,
    data and infrastructure capabilities

    AI Platform
        ↓
    Provides shared AI
    technical capabilities

    PinkCurve Products
        ↓
    Own Product data where applicable,
    consume shared information and capabilities,
    and make Product decisions

    Quality Assurance
        ↓
    Verifies Product and data quality

    PinkCurve Operations
        ↓
    Operates, monitors and supports
    the production environment

These responsibilities should remain distinct.

A shared Platform providing a technical capability does not automatically become the logical owner of the Product data using that capability.

---

## Product Ownership Remains Fundamental

The architectural principle established elsewhere in the Product Blueprint remains central:

> **PinkCurve Products own Product decisions and business behavior.**

For example:

    Buyer Intelligence
        ↓
    Buyer Signals
        ↓
    AI Discovery
        ↓
    Discovery Decision

Buyer Intelligence owns the Buyer Intelligence it produces.

AI Discovery decides how applicable Buyer Signals contribute to Discovery.

Similarly:

    AI Platform
        ↓
    Technical Risk Result
        ↓
    Trust & Safety
        ↓
    Trust Decision

AI Platform may provide technical analysis.

Trust & Safety owns the Trust policy and Trust Decision.

Data Architecture enables these relationships but does not make the Product decisions.

---

## Stable Identity and Explicit Relationships

One of the strongest conclusions of the audit is the importance of stable identifiers.

Every independently meaningful major PinkCurve entity or Product output should have an appropriate stable identity.

Examples include:

    offering_id
    metadata_id
    creative_id
    campaign_id
    event_id
    analytic_result_id
    qov_id
    learning_output_id
    model_id
    model_version_id
    buyer_signal_id
    seller_signal_id
    seller_insight_id
    seller_opportunity_id
    seller_recommendation_id
    technical_risk_result_id
    billable_event_id
    invoice_item_id
    invoice_id

Identifiers alone are not sufficient.

The important relationships among those identifiers must also be represented so PinkCurve can determine:

> What is this?

> Who or what does it belong to?

> What produced it?

> What does it relate to?

> What Product owns it?

> What authoritative data supports it?

> What other Product may consume it?

These relationships should be explicit where they provide real architectural or business value.

---

## Authoritative Data Must Remain Distinguishable

PinkCurve should always distinguish authoritative data from derived or learned representations.

Conceptually:

    Authoritative Source
            ↓
       Derived Data
            ↓
       Learned Data
            ↓
       Product Use

A Vector does not replace its underlying entity.

An AI-generated representation does not replace authoritative Offering Knowledge.

An Analytical Result does not replace the Discovery Events supporting the analysis.

A Technical Risk Result does not replace a Trust Decision.

A Buyer Signal does not replace the underlying Buyer activity from which it may have been inferred.

The Source of Truth for important PinkCurve data should remain explicit.

---

## Intelligence Architecture Has Matured

The audit substantially strengthens PinkCurve's intelligence architecture.

Buyer Intelligence now represents:

    Explicit Preferences
    Session Intent
    Short-Term Interests
    Persistent Preferences
    Negative Preferences
    Contextual Signals
    Behavioral Signals
    Inferred Intelligence

Seller Intelligence now represents:

    Evidence
        ↓
    Seller Signal
        ↓
    Seller Insight
        ↓
    Seller Opportunity
        ↓
    Seller Recommendation
        ↓
    Seller Action
        ↓
    Recommendation Outcome Evidence

along with:

    Seller Alerts
    Seller Reports
    Seller Value Intelligence

Learning Engine now produces broader governed **Learning Outputs**, which may include:

    learned values
    rules
    parameters
    scores
    model references
    purpose-specific Models
    other governed learning results

Not every Learning Output is a Model.

These structures should now be represented explicitly in Chapter 11.

---

## Trust & Safety and Billing Require Explicit Data Relationships

The audit confirms that Trust & Safety and Billing require particularly strong identification and relationships because their decisions have significant consequences.

For Trust & Safety:

    Subject
        ↓
    Verification / Evidence
        ↓
    Trust Signal / Technical Risk Result
        ↓
    Trust & Safety Evaluation
        ↓
    Trust Decision

The entity being evaluated must be identifiable.

For Billing:

    Discovery Event
        ↓
    Billing Qualification
        ↓
    Billable Event
        ↓
    Invoice Item
        ↓
    Invoice

A Discovery Event should not automatically become a financial record.

Billing should only use appropriately qualified and valid Billable Events.

The resulting Invoice should allow the Seller and PinkCurve Finance Operations to understand what was billed and why.

---

## Product-to-Product Data Exchange Is a Major Architectural Requirement

The audit confirms that Chapter 11 must describe more than physical movement of data.

It must establish logical Product-to-Product information exchange.

Conceptually:

    Producing Product
          ↓
    Authoritative Data Object
          ↓
    Product Data Contract
          ↓
    Consuming Product

Important exchanges should identify:

- producer;
- consumer;
- logical Data Owner;
- identifier;
- data structure;
- direction;
- applicable schema and version;
- authorization;
- privacy requirements;
- freshness or validity;
- provenance where required.

Chapter 11 establishes the logical foundation.

Detailed technical interfaces belong in later System Design.

---

## APIs and Events Serve Different Purposes

The audit preserves an important architectural distinction:

    API
        → asks for information
          or requests a capability

    Event
        → records or communicates
          that something happened

Both may be important to PinkCurve.

Chapter 11 should establish the logical data requirements without prematurely deciding every API, Event system, queue, protocol, or service implementation.

---

## Data Architecture Should Not Become Infrastructure Architecture

Another important conclusion of the audit is that Chapter 11 should define requirements without unnecessarily designing all underlying infrastructure.

The PinkCurve Platform should provide shared infrastructure capabilities where appropriate.

The AI Platform should provide shared AI technical capabilities where appropriate.

Chapter 11 should not require every Product to independently implement:

- databases;
- Object Storage;
- Event infrastructure;
- Backup and Recovery;
- Data Migration infrastructure;
- environment management;
- AI serving;
- Vector infrastructure;
- operational monitoring infrastructure.

Shared capabilities should remain shared where practical.

---

## Recovery, Migration, and Data Change

The audit clarified several previously overlapping concepts.

### Backup and Recovery

    Previous Data
        ↓
    Protected / Backed Up
        ↓
    Recovery when required

Recovery restores required previous data.

### Recomputation

    Existing Inputs
        ↓
    Processing
        ↓
    New Result

Recomputation creates a new result and should not be treated as the general method for restoring lost historical data.

### Data Migration

    Identified Data
        ↓
    Source
        ↓
    Protected Original Data
        ↓
    Migration
        ↓
    Destination
        ↓
    Validation
       /    \
    Pass    Fail
     ↓       ↓
 Complete  Recover /
           Roll Back

### Backfill

Backfill should remain a limited maintenance activity used only when an actual Product or data requirement requires existing data to receive newly introduced processing or values.

It should not become a major standalone architectural capability.

---

## Quality Must Be Verifiable

PinkCurve Data Architecture should support measurable Data Quality.

Important dimensions include:

- Completeness;
- Accuracy;
- Consistency;
- Freshness;
- Uniqueness;
- Validity;
- Provenance;
- Integrity.

Data Testing should primarily be performed through Quality Assurance using documented Test Procedures.

The procedures should make clear:

    What was tested?

    What result was expected?

    How was it tested?

    What result was observed?

    Did it pass?

Test data and Production data should remain appropriately separated.

---

## Privacy Applies to Derived Intelligence

Buyer privacy does not stop at Raw Buyer Events.

Conceptually:

    Buyer Activity
        ↓
    Buyer Intelligence
        ↓
    Inferred Buyer Signal

The inferred Signal may itself require:

- privacy classification;
- purpose limitation;
- access control;
- appropriate lifetime;
- expiration;
- reset / deletion behavior.

Derived intelligence does not automatically escape PinkCurve's privacy requirements.

---

## Necessary Traceability, Not Generalized Lineage

One of the important simplifications resulting from the audit is that PinkCurve should not build a generalized Data Lineage system merely because such a system is technically possible.

Instead:

> **PinkCurve should maintain the identifiers, relationships, provenance, and necessary domain-specific traceability required to operate the Product correctly and satisfy demonstrated business, Billing, Trust, governance, debugging, Customer Support, or legal requirements.**

Traceability should solve a real PinkCurve problem.

It should not become an architectural objective by itself.

---

## Physical Architecture Should Evolve With Need

PinkCurve should continue following:

> **Fit storage to workload.**

and:

> **Technology should follow measured need.**

PostgreSQL provides an appropriate early foundation.

JSONB may provide flexible structured storage.

Object Storage should hold appropriate media and large files.

Vector storage should support semantic representations.

Specialized Event infrastructure and Analytical Storage should be introduced only when actual requirements justify them.

PinkCurve should not build infrastructure for anticipated scale before that scale or requirement exists.

---

## Chapter 11 as the Foundation for System Design

The revised Chapter 11 should answer:

    What data exists?
          ↓
    What identifies it?
          ↓
    Who owns it?
          ↓
    What is authoritative?
          ↓
    How is it related?
          ↓
    Who produces it?
          ↓
    Who consumes it?
          ↓
    How is it logically exchanged?
          ↓
    What rules govern it?

Only then should later System Design answer:

    How will it be implemented?

The progression should therefore be:

    Product Architecture
            ↓
    Product Responsibilities
            ↓
    Data Architecture
            ↓
    Data Domains
            ↓
    Identifiers + Relationships
            ↓
    Ownership + Sources of Truth
            ↓
    Product Data Contracts
            ↓
    Product-to-Product Data Flow
            ↓
    System Design
            ↓
    Implementation
            ↓
    Quality Assurance
            ↓
    PinkCurve Operations

This creates a controlled path from Product definition to working production systems.

---

## Audit Roadmap

The final audit sections provide the roadmap for completing Chapter 11:

    #87 Major Required Updates
        ↓
    Comprehensive Audit Checklist

    #88 Recommended Revision Sequence
        ↓
    Work / Task Sequence

    #89 Audit Classification Summary
        ↓
    Responsibility and Architecture Map

    #90 Recommended Chapter 11 Updates
        ↓
    Revision Acceptance Checklist

    #91 Audit Assessment
        ↓
    Overall Architectural Assessment

    #92 Final Audit Conclusion
        ↓
    Final Direction for Chapter 11

These sections should be used together when the Chapter 11 revision begins.

---

## Final Conclusion

The Chapter 11 audit is complete.

The audit does **not** conclude that PinkCurve needs a fundamentally different Data Architecture.

It concludes that PinkCurve now understands its Data Architecture much more completely.

The core architecture remains strong.

The next task is to bring Chapter 11 into alignment with that understanding.

The revised Chapter 11 should be:

> **Complete enough to guide PinkCurve development.**

> **Precise enough to establish ownership, identity, relationships, and Data Contracts.**

> **Flexible enough to allow technology to evolve.**

> **Simple enough to avoid infrastructure that PinkCurve does not yet need.**

> **Strong enough to become the data foundation for future System Design and implementation.**

The governing architectural principles are:

> **PinkCurve Products own Product decisions and business behavior.**

> **Data Architecture defines how PinkCurve information is identified, structured, related, owned, exchanged, stored, governed, protected, validated, and retained.**

> **PinkCurve Platform provides shared application, data, and infrastructure capabilities.**

> **AI Platform provides shared AI technical capabilities.**

> **Logical Product ownership does not require separate physical databases.**

> **Authoritative Source of Truth must remain distinguishable from physical storage and derived representations.**

> **Every independently meaningful major PinkCurve entity and Product output should have appropriate stable identity and explicit important relationships.**

> **Product Data Contracts define the logical boundaries for information exchange.**

> **APIs and Events serve different architectural purposes.**

> **Derived and inferred information remains subject to appropriate provenance, privacy, governance, and quality requirements.**

> **PinkCurve should maintain necessary traceability rather than build generalized lineage without demonstrated need.**

> **Shared infrastructure should be introduced and expanded according to actual requirements rather than anticipated complexity.**

The Chapter 11 revision should now follow the task sequence and acceptance criteria established by this audit.

**Audit Result: STRONG FOUNDATIONAL ARCHITECTURE — MAJOR STRUCTURED REVISION REQUIRED.**

**Architectural Direction: RETAIN.**

**Next Step: REVISE CHAPTER 11 USING THE COMPLETED AUDIT ROADMAP BEFORE PROCEEDING TO DETAILED SYSTEM DESIGN.**

---

---

## Chapter 12 — Security, Privacy, and Trust Audit

### Audit Status

In Progress

### Audit Objective

Evaluate whether Chapter 12 provides sufficient architecture,
ownership, controls, lifecycle management, and production-readiness
requirements for Security, Privacy, and Trust across PinkCurve.

---

### Trust Findings

#### T1 — Buyer Registration Policy
Status: RESOLVED

Decision:
PinkCurve requires registered Buyers. Anonymous Buyer discovery
is not supported.

Registration does not imply strong identity verification or
personalization consent.

#### T2 — Seller Verification Baseline
Status: RESOLVED

Decision:
Seller baseline verification requires:
- verified email;
- verified direct mobile or landline phone;
- verified contact person.

Virtual/VoIP phone verification alone is insufficient.

...

#### T4 — Trust / Discovery / Offering Signal Separation
Status: RESOLVED

...

#### T5 — Trust Capability Ownership
Status: PROVISIONAL

Final resolution deferred until Security and Privacy architecture
audits are completed.

---

### Security Architecture Audit

#### S1–S7 — Identity and Access Security
Status: RESOLVED

[decisions]

#### S8–S15 — Data Security and Secrets Protection
Status: RESOLVED

[decisions]

#### S16–S25 — Infrastructure, API, and Service Security
Status: RESOLVED

[decisions]

#### S26–S38 — Monitoring, Incident Response, Resilience, and Recovery
Status: RESOLVED

[decisions]

#### S39–S53 — Secure Development and Production Release
Status: RESOLVED

[decisions]

#### Production Security Gate
Status: RESOLVED — REQUIRED FOR MVP

PinkCurve must not enter production until defined minimum
production security controls are implemented, tested, and
successfully pass the Production Security Gate.

#### S41A — Threat Modeling
Status: RESOLVED

#### S41B — Continuous Threat Monitoring
Status: RESOLVED — REQUIRED FOR MVP

#### S41C — Destination Integrity and Click-Through Protection
Status: RESOLVED — REQUIRED FOR MVP

[include URL change, versioning, redirect-chain validation,
current safety state, click-time gate, blocking rules, etc.]

---

### Privacy Architecture Audit

#### P1–P12 — Collection, Purpose, Classification, and Consent
Status: RESOLVED

[decisions]

#### P13–P26 — Retention, Deletion, Anonymization, and Derived Data
Status: RESOLVED

[decisions]

#### P27+ — External Providers and Data Sharing
Status: REVIEWED — SEE AUDIT #3

---

### Audit #3 — External Providers, AI Data Sharing, Third Parties, Cross-Border Processing, and Vendor Governance

Status: COMPLETE

#### A3.1 — External Provider Inventory, Classification, Ownership & Approval
Status: REVIEWED — MVP REQUIREMENTS IDENTIFIED

Key findings:
- Maintain a canonical External Provider Registry before production use.
- Provider approval is use-case-specific rather than company-wide.
- External disclosure is deny-by-default.
- Internal data access does not imply external data-sharing permission.
- Minimize data before it crosses a provider boundary.
- Centrally control provider credentials and audit external processing.
- Classify provider risk.
- Critical dependencies require provider isolation, kill switch, pre-approved failover, and degraded-mode behavior where practical.
- Provider changes trigger reassessment.
- Offboarding includes credential revocation and provider-held data disposition.
- Provider abstraction should prevent PinkCurve products from becoming tightly coupled to individual vendors.
- External human parties are governed as providers where applicable.

Architectural principle:

> Internal authority to access PinkCurve data does not grant authority to disclose it externally. External disclosure requires a separate explicit authorization decision.

#### A3.2 — AI / LLM External Data Sharing & Model-Provider Security
Status: REVIEWED — MVP REQUIREMENTS IDENTIFIED

Key findings:
- Do not transmit unrestricted PinkCurve objects to external AI systems.
- AI processing requires explicit data-sharing classification and use-case authorization.
- Raw Buyer Intelligence receives exceptional protection and is denied external transmission by default.
- Seller fraud, account-compromise, verification, URL-risk, and security intelligence remain internal by default.
- External AI providers must not train on or secondarily use PinkCurve data by default.
- Provider retention must be known and minimized.
- Prompts, RAG context, agent memory, tool results, embeddings, images, videos, and generated outputs are part of the AI data boundary.
- Sensitive/confidential RAG should use private retrieval and private generation whenever the retrieved information is not authorized to leave PinkCurve.
- A private vector store alone does not make a RAG flow private if retrieved context is sent to an external model.
- AI outputs are untrusted until validated.
- Agents cannot use tool access as an exfiltration bridge.
- Prompt injection cannot override external-sharing controls.
- Provider/model routing must respect data classification, use case, provider approval, processing location, retention, and security state.
- AI-provider isolation must be selective by provider/model/use case.
- AI operations require traceability without creating a surveillance database.
- Provider abstraction belongs behind the PinkCurve AI Platform / AI Security Gate.

Audit finding — AI Data identity:
PinkCurve currently lacks an explicit definition and identity model for data participating in AI processing. Future Data/System Design should evaluate stable concepts such as:
- `ai_data_id`;
- `ai_data_classification_id`;
- `ai_data_type_id`;
- `ai_operation_id`.

These are architectural design directions, not finalized schemas.

Architectural principle:

> No AI model or agent has authority to decide for itself what PinkCurve data may leave the PinkCurve trust boundary. That decision belongs to PinkCurve-controlled policy and infrastructure outside the model.

#### A3.3 — Third Parties, Subprocessors & Supply-Chain Security
Status: REVIEWED — MVP REQUIREMENTS IDENTIFIED

Key findings:
- Track material provider-to-subprocessor relationships.
- Provider approval does not automatically approve every downstream subprocessor.
- Material subprocessor changes trigger reassessment.
- Software packages, containers, SDKs, CI/CD actions, model runtimes, and other dependencies are part of the supply chain.
- Maintain dependency inventory; SBOM tooling is recommended.
- AI models are supply-chain dependencies and require identity, provenance, version, approval, evaluation, and permitted-use information.
- Downloaded/open models are not automatically trusted.
- External SDKs must not bypass the Provider Gateway or AI Security Gate.
- Hidden telemetry, tracing, crash reporting, and debugging channels must not leak protected information.
- CI/CD is a critical trust boundary.
- Prefer build-once/promote-trusted-artifact deployment.
- External human support access must be explicit, least-privilege, time-limited where appropriate, authenticated, logged, and revocable.
- Vendor and dependency compromise require defined incident paths.
- Concentration risk and shared failure domains must be considered when selecting backup providers.
- A simplified dependency graph should be available for important dependencies.

Architectural principle:

> No provider, subprocessor, SDK, software dependency, AI model, telemetry service, support engineer, or downstream system should silently expand PinkCurve's security or data-sharing boundary.

#### A3.4 — Cross-Border Processing, Data Residency & Jurisdiction Control
Status: REVIEWED — MINIMUM MVP IMPLEMENTATION REQUIRED

Key findings:
- Distinguish storage location, processing location, human-access location, backup location, and subprocessor location.
- PinkCurve needs a minimal canonical representation of jurisdiction, technical region, and approved processing location for MVP.
- Candidate identifiers include `jurisdiction_id`, `region_id`, and `processing_location_id`; exact schema is deferred.
- Protected data requires explicit residency/processing policy.
- Cross-border authorization must be evaluated before protected external transmission where applicable.
- Provider routing and failover must preserve jurisdiction/residency policy.
- Unknown or unregistered processing locations must not be used for protected external processing.
- Backups, replicas, snapshots, DR, logs, search indexes, vectors, analytics, and observability can create additional processing locations and must be governed.
- Human access from another jurisdiction can constitute cross-border processing.
- Buyer/Seller product location must remain separate from data-residency governance.
- Cross-border transfers require traceability.
- Deletion requirements propagate across applicable copies and regions.
- Embeddings and derived AI data inherit appropriate classification, lineage, residency, retention, and deletion requirements.
- Avoid unnecessary global replication.
- Jurisdiction/location changes trigger provider reassessment.
- MVP should preserve the ability to introduce stronger regional isolation later without building a comprehensive worldwide residency platform now.
- Critical location policy should be machine-enforceable rather than dependent solely on developer convention.

Architectural principle:

> Availability must never override data-residency or cross-border policy.

#### A3.5 — Vendor Lifecycle, Continuous Monitoring, Incident Response & Offboarding
Status: REVIEWED — MVP REQUIREMENTS IDENTIFIED

Key findings:
- Providers require explicit lifecycle states rather than a simple approved/not-approved flag.
- Provider-level status and provider-use-case status must remain separate.
- Every production provider needs an accountable PinkCurve owner.
- Initial approval requires minimum security/privacy/data-use evidence.
- Vendor review should be risk-based.
- Approval requires periodic reassessment and event-driven reassessment.
- Provider health includes operational, security, privacy, compliance, data-governance, and business dimensions.
- Critical technical dependencies require monitored failover where appropriate.
- Security-triggered failover isolates the affected provider before rerouting.
- Provider credentials require provisioning, monitoring, rotation, and revocation.
- Provider incidents must be correlatable with actual PinkCurve usage and affected data.
- Provider incidents require severity classification and defined response.
- Kill switches and failover must be tested.
- Backup providers require continuous governance and readiness.
- Failover should include appropriate cost/capacity controls without allowing cost to override security.
- Unused providers should be offboarded.
- Offboarding must close every access path and track provider-held data disposition.
- AI offboarding includes provider-hosted prompts, documents, media, datasets, fine-tuned assets, embeddings, caches, and stored outputs where applicable.
- Historical governance/audit evidence should survive provider offboarding according to retention requirements.
- Vendor-governance actions themselves must be auditable.
- Automated monitoring may restrict/escalate risk but must not silently expand trust.
- Protected external processing fails closed when required authorization cannot be established.

Emerging capability direction:

**Continuous Vendor Trust** should be treated as a PinkCurve governance/security capability rather than one-time vendor paperwork.

### Audit #3 Overall Principles

1. Internal access does not grant external-disclosure authority.
2. No AI model or agent decides for itself what PinkCurve data may leave the trust boundary.
3. Private AI means the complete processing path is private, not merely the model endpoint or vector database.
4. A provider can change; PinkCurve's security boundary does not.
5. Trust is continuously evaluated, and loss of trust leads to restriction, isolation, approved failover, or degraded operation rather than uncontrolled continuation.

---

### Audit #4 — Identity, Authentication, Authorization, Accounts & Access Control

Status: IN PROGRESS

Audit objective:

Establish how PinkCurve identifies human and machine actors, authenticates them, verifies important identity/organization relationships, authorizes actions, records accountability, protects privileged operations, and responds to identity compromise.

#### A4.1 — Canonical Identity Model, Relationships & Lifecycle
Status: REVIEWED THROUGH SELLER-REGISTRATION ACTOR VERIFICATION

##### A4.1-01 — Canonical Identity Service / Capability
Status: ACCEPTED — MVP REQUIRED

PinkCurve requires a canonical Identity layer with stable `identity_id`.

The Identity capability is the authoritative owner of canonical PinkCurve identities. For MVP it may be implemented as a backend/authentication module rather than a standalone microservice.

Domain products retain ownership of their domain identifiers:
- Identity capability → `identity_id`;
- Buyer capability → `buyer_id`;
- Seller capability → `seller_id`;
- Organization capability/domain → `organization_id`;
- Offering Knowledge → `offering_id`.

Credentials, email addresses, phone numbers, passwords, passkeys, OAuth identifiers, sessions, API keys, and external-provider identifiers do not replace the canonical PinkCurve identity.

##### A4.1-02 — Identity Types and Domain Relationships
Status: ACCEPTED — MVP REQUIRED

Canonical identity answers:

> Who or what is acting?

Initial identity types should remain intentionally small, such as HUMAN, SERVICE, AI_AGENT, and SYSTEM. Exact taxonomy is deferred.

Buyer and Seller should not be treated as fundamental identity types. They are domain contexts/relationships associated with identities.

##### A4.1-03 — Active Domain Context
Status: ACCEPTED — MVP REQUIRED WHERE MULTI-ROLE ACCESS EXISTS

One identity may operate in multiple contexts.

Example:
- the same human identity may have a Buyer relationship;
- may also be authorized for one or more Sellers;
- may hold different roles for different Sellers.

Authorization must evaluate the identity in the active domain context rather than assume that permission in one context grants permission everywhere.

##### A4.1-04 — Identity Lifecycle
Status: ACCEPTED — MVP REQUIRED

Identity lifecycle must support controlled states beyond exists/deleted. Candidate states include PENDING, ACTIVE, RESTRICTED, SUSPENDED, RECOVERY, DISABLED, and CLOSED.

Exact states are deferred to Identity/System Design.

Identity status must affect access decisions.

##### A4.1-05 — Identity Lifecycle vs. Domain Lifecycle
Status: ACCEPTED — MVP REQUIRED

Identity state and Seller/Organization/Buyer domain state remain separate.

A compromised human identity may be suspended while the Seller remains valid and other authorized Seller identities continue operating.

Likewise, suspension of a Seller for fraud does not automatically mean every human identity associated with that Seller is itself malicious.

##### A4.1-06 — Identity State Changes Are Auditable
Status: ACCEPTED — MVP REQUIRED

Identity status changes require traceability including the affected identity, old/new state, reason, acting identity/service, source, and time as appropriate.

Historical identity and security evidence should not be destroyed merely because access is disabled.

##### A4.1-07 — Identity Proofing, Verification Level & Trust Evidence
Status: REVIEWED — MVP REQUIRED

PinkCurve must distinguish:
- account/identity existence;
- authentication;
- verification of claims/relationships.

Verification evidence and level should be available to authorization where required.

##### A4.1-08 — Verification Attaches to the Correct Claim
Status: REVIEWED — MVP REQUIRED

Verification of one claim does not verify unrelated claims.

Examples:
- verified phone does not prove organization ownership;
- verified email does not prove business authority;
- verified organization does not prove that every associated employee has administrative authority.

##### A4.1-09 — Verified Attributes Are Not Freely Mutable
Status: REVIEWED — MVP REQUIRED

Changes to verified email, phone, recovery methods, business authority, privileged membership, and similar trusted claims require appropriate re-verification, risk controls, audit, and notification.

##### A4.1-10 — Verification Can Become Stale or Revoked
Status: REVIEWED — BASIC MVP CAPABILITY REQUIRED

PinkCurve must be able to require re-verification when important circumstances change.

##### A4.1-11 — Sensitive Authorization Requires Sufficient Verification
Status: REVIEWED — MVP REQUIRED

Sensitive actions may require the correct role, active identity, required verification level, sufficient authentication strength, and acceptable current risk.

##### A4.1-12 — Seller Registration Must Establish and Verify the Registering Actor
Status: ACCEPTED — MVP REQUIRED

PinkCurve must establish a canonical `identity_id` for the human initiating Seller registration and record that identity as the registration actor.

Seller approval must not rely solely on verifying that an Organization or Seller exists.

PinkCurve must verify, to the level required by policy:
1. who the registering actor is;
2. the Organization/Seller being represented;
3. the actor's authority to represent that Organization/Seller.

Candidate `seller_registration_id` and `initiated_by_identity_id` concepts should be evaluated during Data/System Design.

##### A4.1-13 — Identity, Organization, Authority, and Seller Approval Are Distinct
Status: ACCEPTED — MVP REQUIRED

The following must not be treated as interchangeable:

> Verified Person ≠ Verified Organization ≠ Verified Authority to Represent Organization ≠ Approved Seller.

A conceptual relationship is:

```text
HUMAN IDENTITY
identity_id = ID-1001
        |
        | authorized representative / Seller membership
        v
SELLER
seller_id = SELLER-200
        |
        | operated by / associated with
        v
ORGANIZATION
organization_id = ORG-100
        |
        +--> OFFERING-501
        +--> OFFERING-502
```

The exact Organization-to-Seller cardinality and Seller-membership
schema remain design decisions.

##### Actor Identity

Status: ACCEPTED CONCEPT

`actor_identity_id` is not a separate identity entity. It references the
canonical `identity_id` when recording who or what performed an action.

The actor must not self-declare the trusted `actor_identity_id`.
PinkCurve derives it from the authenticated execution context.

Example:

``` text
actor_identity_id = ID-1002
seller_id          = SELLER-200
organization_id    = ORG-100
resource_type      = OFFERING
resource_id        = OFFERING-501
action             = UPDATE_OFFERING
```

This answers: - WHO acted? - on behalf of WHICH Seller/context? -
affecting WHICH Organization/resource? - WHAT action occurred?

Human support staff, AI agents, internal services, and authorized
machine integrations should use the same canonical accountability
principle.

Candidate `seller_membership_id` may be useful to identify the explicit
relationship between an identity and a Seller. Exact schema is deferred.

#### A4.2 --- Registration, Authentication & Account Security

Status: REVIEWED THROUGH A4.2-14

##### A4.2-01 --- Registration Is a Controlled Security Workflow

Status: REVIEWED --- MVP REQUIRED

Buyer and Seller registration must establish trusted identity/account
relationships through controlled workflows rather than immediately
activating unrestricted accounts.

Seller registration requires stronger controls than ordinary Buyer
registration because Sellers can publish Offerings and direct Buyers to
external destinations.

##### A4.2-02 --- Registration Workflows Need Identity and State

Status: REVIEWED --- MVP REQUIRED

Important registration workflows should have stable identity/state, such
as candidate `buyer_registration_id` and `seller_registration_id`.

A registration request is not equivalent to an approved Seller.

##### A4.2-03 --- Authentication Credentials Remain Separate From Identity

Status: REVIEWED --- MVP REQUIRED

Credentials prove control of an identity; they do not become the
identity itself.

##### A4.2-04 --- Strong Authentication Architecture

Status: REVIEWED --- MVP REQUIRED

PinkCurve authentication architecture must support strong
authentication, verified contact mechanisms, MFA/step-up authentication,
and future phishing-resistant methods such as passkeys without
hard-coding identity around passwords.

##### A4.2-05 --- Password Protection

Status: REVIEWED --- MVP REQUIRED IF PASSWORDS ARE USED

Passwords must use established secure password-handling mechanisms and
must never appear in logs, analytics, AI prompts, support records, audit
payloads, or error messages.

##### A4.2-06 --- MFA for High-Risk Identities

Status: REVIEWED --- MVP REQUIRED

Strong MFA is required for appropriate privileged/high-risk human
identities, including Seller owners/admins and PinkCurve privileged
personnel.

##### A4.2-07 --- OTP Is Verification, Not Universal Trust

Status: REVIEWED --- MVP REQUIRED PRINCIPLE

OTP may prove control of an email/phone at a point in time. It does not
by itself prove business ownership, organization authority, absence of
compromise, or permanent trust.

##### A4.2-08 --- Login Abuse Protection

Status: REVIEWED --- MVP REQUIRED

Authentication must address password guessing, credential stuffing,
bots, OTP abuse, enumeration, distributed attempts, and related
credential attacks using proportionate rate limiting, risk evaluation,
challenges, monitoring, and restriction.

##### A4.2-09 --- Account Enumeration Resistance

Status: REVIEWED --- MVP REQUIRED

Login and recovery workflows should avoid unnecessary disclosure of
whether an account exists or what privileged role it holds.

##### A4.2-10 --- Controlled Sessions

Status: REVIEWED --- MVP REQUIRED

Successful authentication establishes a PinkCurve-controlled session
associated with the canonical identity, authentication method/strength,
lifecycle, and appropriate security/risk state.

##### A4.2-11 --- Authentication Strength Available to Authorization

Status: REVIEWED --- MVP REQUIRED

Authorization must be able to require stronger/recent authentication for
sensitive actions even when the current session is otherwise valid.

##### A4.2-12 --- New Device / Unusual Authentication as Risk Signals

Status: REVIEWED --- BASIC MVP CAPABILITY REQUIRED

New device, unusual location/context, rapid changes, repeated failures,
and sudden administrative behavior are risk signals rather than
automatic proof of fraud. They may trigger stronger authentication or
restrictions.

##### A4.2-13 --- Authentication Events Are Auditable

Status: REVIEWED --- MVP REQUIRED

Login, MFA, credential, recovery, session-revocation, and
suspicious-authentication events require security auditability without
logging credentials themselves.

##### A4.2-14 --- Authentication Security Connects to Seller Risk

Status: REVIEWED --- MVP REQUIRED

Identity security must feed Seller/account risk and sensitive-action
controls.

Example:

``` text
Suspicious Seller authentication
        ↓
Seller/account risk increases
        ↓
Destination URL change requested
        ↓
Step-up authentication
        +
URL reverification
        +
Seller risk evaluation
        ↓
New URL remains pending until approved
```

### Audit #4 Next Item

**A4.2-15 --- Account Recovery Must Not Become an Authentication
Bypass**

Next review should cover: - password reset; - lost phone/MFA device; -
changed/lost email; - Seller-owner recovery; - compromised-account
recovery; - support-assisted recovery; - recovery when all trusted
credentials are unavailable; - recovery auditability and notification; -
prevention of social-engineering bypass.

------------------------------------------------------------------------

### Remaining Chapter 12 / Security-Trust Audit Work

1.  Continue Audit #4 from A4.2-15.
2.  Complete authorization, privileged-action, machine/agent identity,
    session-security, and continuous-access portions of Audit #4.
3.  Resolve remaining Privacy architecture items not superseded by Audit
    #3.
4.  Finalize Trust capability ownership.
5.  Audit Trust Case / human-review architecture.
6.  Audit approval and discovery-eligibility gates.
7.  Perform final Chapter 12 consistency review.

### Chapter Revision Status

NOT STARTED

Do not revise Chapter 12 until the audit is complete.
