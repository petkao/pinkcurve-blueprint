# Adaptive Metadata Navigation

## Document Status

| Field | Value |
|-------|-------|
| **Status** | Draft |
| **Version** | 0.3 |
| **Owner** | PinkCurve Product Team |
| **Last Reviewed** | 2026-08-16 |
| **Related Components** | Buyer Experience, Offering Knowledge, Discovery Engine, Discovery Analytics, Learning Engine, Buyer Intelligence |

---

## Overview

Adaptive Metadata Navigation (AMN) is a core PinkCurve discovery
capability that helps Buyers navigate large and changing spaces of
Offerings through meaningful, contextually relevant metadata.

Traditional search assumes that a Buyer knows what to search for.

Traditional filtering often presents a predefined collection of
categories and attributes and asks the Buyer to determine which filters
matter.

PinkCurve takes a different approach.

AMN helps the Buyer understand:

- What kinds of Offerings are currently available
- Which characteristics meaningfully distinguish them
- Which directions are available for further discovery
- How the discovery space changes as the Buyer's intent becomes clearer

Rather than requiring the Buyer to understand the structure of the
catalog, PinkCurve uses Offering Knowledge and discovery context to
make that structure useful to the Buyer.

> **Metadata should illuminate choices, not create more work.**

---

# The Problem

Large discovery environments create a navigation problem.

A Buyer may begin with only a general idea:

- "I want something for my backyard."
- "Show me something interesting nearby."
- "I'm looking for a service for my home."
- "What is new?"
- "What deals are available?"
- "What is happening in my community?"
- "I don't know exactly what I want yet."

Conventional interfaces commonly respond with:

- Search boxes
- Long category trees
- Fixed filters
- Large result sets
- Sorting controls
- Pages of listings

These approaches can work when the Buyer already understands the
product space.

They become harder to use when the purpose is discovery.

The Buyer may not know:

- Which metadata exists
- Which attributes are meaningful
- Which categories contain useful Offerings
- Which terminology Sellers use
- Which filter will actually narrow the discovery space appropriately

The Buyer is therefore asked to understand the information architecture
before benefiting from it.

PinkCurve should reverse that relationship.

> **The platform should understand the discovery space so the Buyer
> does not have to.**

---

# Design Objective

AMN should help a Buyer move from:

**Curiosity → Direction → Refinement → Relevant Discovery**

without requiring a complex search or filtering process.

The Buyer remains in control of the direction.

PinkCurve assists by identifying useful navigation choices from the
current discovery context.

Conceptually:

Buyer Context
      ↓
Current Discovery Space
      ↓
Relevant Metadata Dimensions
      ↓
Meaningful Navigation Choices
      ↓
Buyer Selection / Interaction
      ↓
Updated Discovery Space
      ↓
Updated Navigation Choices
      ↺

The navigation therefore adapts as discovery progresses.

---

# What "Adaptive" Means

Adaptive does not mean PinkCurve silently decides what the Buyer wants.

It means the navigation presented to the Buyer can change according to
the current discovery context.

That context may eventually include appropriate combinations of:

- Current Offering set
- Buyer-entered intent
- Current navigation selections
- Category
- Geography
- Time
- Offering characteristics
- Availability
- Discovery mode
- Session interactions
- Explicit Buyer feedback
- Buyer Intelligence where permitted
- Trust requirements

Not every signal should be used in every situation.

AMN should expose the most useful discovery directions for the current
context while keeping the Buyer in control.

---

# What "Metadata" Means

Metadata in AMN is not limited to conventional catalog attributes.

It may represent any structured characteristic that meaningfully helps
the Buyer understand or navigate the discovery space.

Examples may include:

### Offering Characteristics
- Category
- Type
- Brand
- Price range
- Features
- Benefits
- Intended use
- Audience
- Availability

### Discovery Characteristics
- New
- Trending
- Popular in an appropriate context
- Deals
- Seasonal
- Nearby
- Brand Discovery

### Geographic Characteristics
- Distance
- City
- Neighborhood
- Service area
- Local availability

### Trust Characteristics
- Verification state
- Appropriate trust indicators
- Other Buyer-relevant confidence signals

### Community Characteristics
- Event
- Public service
- Community organization
- Local resource
- Bulletin
- Geographic relevance

Metadata should be extensible as PinkCurve expands into additional
Offering types.

---

# Metadata Is Navigation

A fundamental AMN principle is:

> **Metadata is not merely descriptive information. It can become a
> navigation interface.**

For example, a Buyer seeing a group of Offerings might be given
meaningful directions such as:

New | Nearby | Under $50 | Outdoor | Local Seller | Deals

Selecting one direction changes the relevant Offering space.

The next useful metadata choices may then be different.

For example:

Outdoor
   ↓
Furniture | Gardening | Cooking | Recreation
   ↓
Gardening
   ↓
Plants | Tools | Irrigation | Services
   ↓
Services
   ↓
Nearby | Installation | Maintenance | Design

This is different from displaying every possible filter simultaneously.

AMN progressively exposes useful choices as discovery develops.

---

# Progressive Disclosure

PinkCurve may know hundreds or thousands of metadata attributes.

The Buyer should not see hundreds or thousands of controls.

AMN should reveal only a manageable number of useful navigation choices
at a time.

Additional dimensions can appear as the discovery space becomes more
specific.

This supports the PinkCurve principle:

> **Show less, better.**

The purpose is not to hide useful information.

The purpose is to expose information when it becomes useful.

---

# Buyer Intent

AMN is one way Buyers can express intent.

Intent may begin explicitly:

> "I need something for my garden."

Or it may develop through navigation:

Garden
  ↓
Plants
  ↓
Fruit Trees
  ↓
Citrus
  ↓
Nearby

Each choice provides additional context.

PinkCurve can use that context to improve discovery without requiring
the Buyer to construct a detailed query.

Buyer Intent should remain contextual.

A Buyer interested in gardening today should not automatically be
treated as permanently interested in gardening.

---

# Buyer Control

AMN must remain Buyer-directed.

The Buyer should be able to:

- Select a navigation direction
- Ignore suggested metadata
- Move backward
- Change direction
- Remove a selection
- Start another discovery path
- Reset the current discovery context
- Express explicit interest or disinterest
- Explore outside previous preferences

PinkCurve should never make it difficult for a Buyer to escape an
incorrect assumption.

> **Adaptation should reduce effort, not reduce freedom.**

---

# Relationship to Offering Knowledge

Offering Knowledge provides much of the structured understanding AMN
requires.

Conceptually:

Offering
   ↓
Offering Knowledge
   ↓
Structured Characteristics
   ↓
Metadata Candidates
   ↓
AMN
   ↓
Buyer Navigation

This creates an important requirement:

Offering Knowledge should capture characteristics that are meaningful
for discovery, not merely information useful to Sellers or internal
systems.

AMN therefore becomes a consumer of Offering Knowledge and may also
identify knowledge gaps.

If an important navigation dimension cannot be generated because
Offering Knowledge is incomplete, that gap may eventually become useful
Seller Intelligence.

---

# Relationship to the Discovery Engine

AMN does not replace the Discovery Engine.

The two capabilities cooperate.

AMN helps determine the Buyer's current discovery direction.

The Discovery Engine retrieves and ranks Offerings appropriate to that
direction.

Conceptually:

Buyer
   ↓
AMN
   ↓
Discovery Context / Intent
   ↓
Discovery Engine
   ↓
Relevant Offerings
   ↓
Buyer Interaction
   ↺

The Discovery Engine may also provide information about the current
candidate space that helps AMN determine which metadata dimensions are
useful for further navigation.

---

# Relationship to Buyer Intelligence

Buyer Intelligence may assist AMN where appropriate and permitted.

For example, Buyer Intelligence may help determine which navigation
choices are likely to be useful based on:

- Explicit preferences
- Previous positive feedback
- Previous negative feedback
- Session context
- Relevant historical patterns

However:

> **Buyer Intelligence may assist navigation; it should not take
> navigation away from the Buyer.**

AMN should remain useful even when little or no persistent Buyer
Intelligence exists.

This is particularly important for new or anonymous Buyers.

---

# Relationship to Discovery Analytics

AMN interactions create valuable discovery signals.

Potential events include:

- Metadata option shown
- Metadata option selected
- Metadata option removed
- Navigation path changed
- Navigation reset
- Discovery branch abandoned
- Offering explored after navigation
- Positive feedback after navigation
- Negative feedback after navigation
- QOV following navigation

Discovery Analytics should capture these interactions in a structured
form where appropriate.

The purpose is not merely to measure clicks.

The purpose is to understand whether navigation is helping Buyers reach
meaningful discovery.

---

# Relationship to the Learning Engine

AMN should improve through learning.

Validated navigation behavior may help PinkCurve understand:

- Which metadata dimensions are useful
- Which choices confuse Buyers
- Which paths lead to meaningful discovery
- Which metadata combinations improve discovery
- Which choices create dead ends
- Which navigation patterns vary by context

Conceptually:

AMN Interaction
      ↓
Discovery Analytics
      ↓
Validated Signals
      ↓
Learning Engine
      ↓
Improved Navigation Intelligence
      ↓
AMN
      ↺

Invalid traffic, bots, manipulation, or suspicious activity should not
silently teach AMN the wrong behavior.

---

# Relationship to Daily Discovery

AMN is not limited to intentional shopping.

A Buyer opening PinkCurve's Daily Discovery experience may see
Offerings from multiple discovery modes.

Examples:

New | Trending | Nearby | Deals | Brands | Events | Community

Selecting one of these directions may activate a more focused discovery
space.

AMN therefore helps connect passive discovery with active exploration.

A Buyer can begin with curiosity and progressively develop intent.

---

# Relationship to Brand Discovery

Brand Discovery may participate in AMN where it is genuinely relevant
to the current discovery context.

For example:

Running
   ↓
Shoes | Clothing | Accessories | Events | Brands

A Buyer who chooses Brands may intentionally explore Brand Offerings.

Brand participation may also occur elsewhere in discovery according to
PinkCurve's Brand Discovery rules.

Seller payment should not cause AMN to present an irrelevant metadata
direction merely because the Seller paid more.

> **Payment may establish campaign eligibility. Relevance determines
> discovery usefulness.**

---

# Relationship to Trust

AMN should not expose Buyers to Offerings merely because their metadata
matches the current navigation path.

Trust requirements remain applicable.

Conceptually:

AMN Context
     ↓
Candidate Offerings
     ↓
Trust / Eligibility
     ↓
Discovery Ranking
     ↓
Buyer Presentation

Trust-related metadata may also become useful navigation information
where appropriate.

Examples could include verified Seller or other clearly defined trust
signals.

PinkCurve should avoid presenting trust indicators that imply
guarantees the platform cannot make.

---

# Anonymous Buyers

AMN should provide useful discovery even when a Buyer is anonymous.

Anonymous discovery may use appropriate session-level information such
as:

- Current navigation path
- Current explicit intent
- Session interactions
- Coarse location where appropriate and permitted
- Current discovery context

Persistent personalization should not be assumed.

Anonymous traffic should also be subject to bot, abuse, and invalid-
traffic protections.

PinkCurve may later determine that certain high-impact actions require
registration or verification.

Those decisions belong to Buyer Experience, Security/Trust, and Open
Decisions rather than AMN itself.

---

# Visual and Mobile Design

AMN must support PinkCurve's visual-first and mobile-first principles.

Metadata navigation should not become a large traditional filter panel
that obscures the Offering.

Possible interface representations may include:

- Compact metadata chips
- Contextual navigation choices
- Expandable navigation
- Visual metadata indicators
- Lightweight overlays
- Gesture-supported navigation
- Other future interaction patterns

The Blueprint does not prescribe one permanent interface.

The design requirement is:

> **Navigation must remain understandable without overwhelming the
> visual discovery experience.**

---

# AMN and Discovery Diversity

Efficient navigation should not create excessive narrowing.

If every Buyer action causes PinkCurve to remove all unexpected
Offerings, discovery can become repetitive.

AMN should therefore work with the Discovery Engine to preserve
appropriate:

- Diversity
- Novelty
- Exploration
- Serendipity

The objective is not merely to narrow.

The objective is to help the Buyer discover better.

---

# AMN Success Criteria

AMN is successful when it helps Buyers reach meaningful discovery with
less effort.

Potential measures include:

- Time or interactions required to reach useful Offerings
- Metadata navigation usage
- Navigation abandonment
- Navigation reset/change-direction rate
- Positive feedback following navigation
- Negative feedback following navigation
- Save/Explore behavior
- QOV following navigation
- Repeat use of AMN
- Buyer-reported navigation usefulness
- Discovery diversity
- Trust outcomes

Exact metrics are defined in Success Metrics and Discovery Analytics.

---

# Architectural Flow

The high-level AMN relationship is:

Offering Knowledge
        ↓
Structured Metadata
        ↓
Current Discovery Space
        ↓
Buyer Intent / Context
        ↓
Adaptive Metadata Navigation
        ↓
Buyer Navigation Choice
        ↓
Discovery Engine
        ↓
Relevant Offerings
        ↓
Buyer Interaction
        ↓
Discovery Analytics
        ↓
Learning Engine
        ↓
Buyer Intelligence / Navigation Intelligence
        ↺

Trust, privacy, and invalid-traffic protection apply throughout this
flow.

---

# Architectural Boundaries

AMN is responsible for:

- Identifying meaningful navigation dimensions
- Presenting contextually useful metadata choices
- Maintaining navigation context
- Translating Buyer navigation into discovery context
- Supporting progressive refinement
- Generating structured navigation signals

AMN is not solely responsible for:

- Offering retrieval
- Final Offering ranking
- Persistent Buyer profiles
- Fraud detection
- Seller verification
- Pricing
- Campaign billing
- Creative generation
- Transaction processing

Those responsibilities belong to other PinkCurve capabilities.

---

# Implementation Independence

This document defines the product and architectural role of Adaptive
Metadata Navigation.

It intentionally does not prescribe:

- A specific metadata-selection algorithm
- A specific ranking formula
- Model architecture
- Weighting methods
- Training methods
- Feature-engineering methods
- Internal scoring mechanisms
- Exact UI implementation
- Infrastructure technology

Those choices may evolve independently as PinkCurve learns.

The enduring requirement is the behavior:

> **Help Buyers understand and navigate the current discovery space
> through useful metadata while preserving Buyer control and visual
> simplicity.**

---

# Open Questions

Questions that require later validation include:

- How many metadata choices should normally appear at once?
- Which AMN capabilities belong in the MVP?
- How should metadata usefulness be measured?
- How should AMN balance refinement with discovery diversity?
- Which navigation signals may become persistent Buyer Intelligence?
- Which AMN interactions require Buyer registration?
- How should AMN operate across commercial and Community Discovery?
- How should AMN handle sparse Offering Knowledge?
- What latency is acceptable for adaptive navigation?
- Which implementation mechanisms should remain proprietary?

Material unresolved decisions should be tracked in
[Open Decisions](19-open-decisions.md).

---

## Related Documents

- [Vision and Mission](01-vision-and-mission.md)
- [Design Principles](02-design-principles.md)
- [Product Architecture](03-product-architecture.md)
- [Offering Knowledge](04-offering-knowledge.md)
- [Discovery Engine](06-discovery-engine.md)
- [Discovery Analytics](07-discovery-analytics.md)
- [Learning Engine](08-learning-engine.md)
- [Security, Privacy, and Trust](12-security-privacy-and-trust.md)
- [Success Metrics](14-success-metrics.md)
- [Buyer Experience](20-buyer-experience.md)
- [PinkCurve Philosophy](21-pinkcurve-philosophy.md)
- [Buyer Intelligence](24-buyer-intelligence.md)