# Discovery Engine

## Document Status

| Field                  | Value                                                                                                      |
| ---------------------- | ---------------------------------------------------------------------------------------------------------- |
| **Status**             | Draft                                                                                                      |
| **Version**            | 0.3                                                                                                        |
| **Owner**              | PinkCurve Product Team                                                                                     |
| **Last Reviewed**      | 2026-09-30                                                                                                 |
| **Related Components** | Offering Knowledge, Buyer Experience, Adaptive Metadata Navigation, Discovery Analytics, Learning Engine,  |
|                        | Trust & Safety, AI Platform, Creative Studio.                                                              |
---

## Overview

The Discovery Engine is PinkCurve's intelligent system for connecting buyers with offerings that may be relevant, useful, interesting,
 timely, or worth exploring.

Unlike traditional advertising systems that frequently prioritize advertiser spend, PinkCurve's Discovery Engine prioritizes **discovery quality**.

Its purpose is not simply to determine:

> Which offering is most likely to receive a click?

Instead, it asks:

> Which offerings are most likely to matter to this buyer in this context, and how can the buyer remain in control of what they discover next?

The Discovery Engine combines:

* Buyer intent
* Offering Knowledge
* Adaptive Metadata Navigation
* Context
* Location
* Trust signals
* Discovery history
* Buyer feedback
* New and trending activity
* Diversity
* Learning

to continuously produce meaningful discovery opportunities.

The Discovery Engine also supports **Real-Time Discovery** for
time-sensitive Offerings whose usefulness depends on being discovered
while they are still valid and available.

For these Offerings, relevance alone is insufficient. The Discovery
Engine must consider current validity, availability, freshness,
location where applicable, quantity or capacity where relevant, and
other Discovery-readiness conditions before presenting an Offering to
a Buyer.

Real-Time Discovery follows the same buyer-first discovery principles
as other PinkCurve discovery, but places additional importance on
speed, truth, locality, relevance, and freshness.

---

# Discovery Philosophy

PinkCurve exists to help buyers **discover what matters**.

Discovery should therefore be:

* Relevant
* Buyer-controlled
* Visual
* Simple
* Trustworthy
* Diverse
* Privacy-conscious
* Context-aware
* Continuously improving
* Resistant to manipulation

The Discovery Engine should not optimize solely for:

* Clicks
* Viewing time
* Engagement
* Seller spending
* Advertising volume

Those signals may be useful, but none should independently define discovery quality.

PinkCurve should optimize for **useful discovery**.

---

# Discovery vs. Search vs. Advertising

| Approach                       | Primary Driver                                                     | Buyer Experience                                           |
| ------------------------------ | ------------------------------------------------------------------ | ---------------------------------------------------------- |
| **Traditional Advertising**    | Advertiser spend and targeting                                     | Offerings are pushed toward audiences                      |
| **Search**                     | Buyer query                                                        | Buyer must know what to ask for                            |
| **Traditional Recommendation** | Predicted engagement                                               | System decides what may keep the user engaged              |
| **PinkCurve Discovery**        | Buyer intent + Offering Knowledge + adaptive navigation + learning | Buyer and system progressively discover relevance together |

PinkCurve combines the advantages of proactive recommendation and active exploration without requiring buyers to surrender control to an opaque feed.

---

# The Core Discovery Loop

PinkCurve discovery is not a one-time ranking operation.

It is an interactive loop.

```text
Buyer Context / Intent
        ↓
Candidate Offerings
        ↓
Relevant Offerings Presented
        ↓
Visual Discovery
        ↓
Adaptive Metadata
        ↓
Buyer Selection / Feedback / Exploration
        ↓
Updated Intent
        ↓
Updated Candidate Set
        ↓
More Relevant Discovery
        ↺
```

Every meaningful buyer action may improve the understanding of current intent.

This makes discovery an ongoing conversation between the buyer and the available Offering Knowledge.

---

# Buyer Intent

Buyer Intent represents what the buyer appears to want, need, explore, compare, or learn about at a particular moment.

Intent can be temporary and contextual.

A buyer who normally explores travel may currently be looking for:

* A nearby restaurant
* Running shoes
* A home service
* A local event
* A public resource

PinkCurve should therefore avoid assuming that long-term history always represents current intent.

---

## Explicit Intent

Explicit intent comes directly from buyer actions such as:

* Search queries
* Category selection
* Metadata selections
* Location selection
* Price preferences
* Saved preferences
* Positive feedback
* Negative feedback
* "Show me more like this"
* "Not interested"

Explicit intent should generally receive strong weight because it represents direct buyer control.

---

## Implicit Intent

Implicit intent may be inferred from behavior such as:

* Viewing patterns
* Exploration depth
* Repeat views
* Click-through behavior
* Metadata navigation
* Time spent meaningfully viewing content
* Repeated category interest
* Recent interaction sequence

Implicit signals should assist discovery rather than override clear explicit instructions.

---

## Contextual Intent

Context may include:

* Current location
* Time of day
* Day of week
* Season
* Device
* Current discovery session
* Availability
* Local events
* Temporal relevance

Context can alter what is useful even when a buyer's longer-term interests remain unchanged.

---

# Buyer Control

Buyer control is a defining architectural principle of PinkCurve discovery.

The system may proactively suggest offerings, but buyers should be able to redirect discovery quickly.

Buyer controls may include:

* Search
* Metadata navigation
* Category navigation
* Location adjustment
* Price or availability preferences
* Positive feedback
* Negative feedback
* Hide offering
* Hide seller
* Show similar offerings
* Reset or broaden discovery
* Explore another path

The Discovery Engine should interpret these actions as meaningful intent signals.

---

# Adaptive Metadata Navigation

Adaptive Metadata Navigation, or **AMN**, is a core discovery mechanism.

Traditional filtering systems often present a predefined set of filters regardless of what the buyer is currently exploring.

AMN instead determines which metadata dimensions are most useful based on:

* Current Offering Knowledge
* Available candidate offerings
* Buyer selections
* Buyer context
* Discovery path
* Category
* Location
* Learned usefulness of metadata

The metadata evolves as discovery becomes more focused.

---

## Example

A buyer begins with:

```text
Shoes
```

PinkCurve may present:

```text
Running | Walking | Casual | Hiking | Dress
```

The buyer selects:

```text
Running
```

The system may then present:

```text
Road | Trail | Racing | Everyday Training
```

After the buyer selects:

```text
Trail
```

the useful metadata may become:

```text
Waterproof | Terrain | Cushioning | Weight | Price | Nearby
```

The navigation therefore adapts to the current discovery state.

---

## AMN Discovery Loop

```text
Candidate Offerings
        ↓
Available Metadata
        ↓
Metadata Relevance Selection
        ↓
Buyer-Facing Metadata Choices
        ↓
Buyer Selection
        ↓
Intent Updated
        ↓
Candidate Offerings Updated
        ↓
Metadata Recomputed
        ↺
```

AMN allows buyers to progressively communicate intent without needing to formulate complex queries.

---

# Daily Discovery Feed

The Daily Discovery Feed is a major PinkCurve discovery surface.

PinkCurve should be useful even when a buyer does not arrive with a specific search request.

The feed may surface:

* New offerings
* Trending offerings
* Relevant offerings
* Local discoveries
* Promotions
* Discounts
* Brand-recognition offerings
* Seasonal opportunities
* Events
* Community bulletins
* Public resources
* Previously unexplored categories
* Real-Time and time-sensitive Offerings

The goal is to provide **fresh discovery**, not endless engagement.

Real-Time and time-sensitive discovery may appear in the Daily Discovery
Feed when it is relevant to the Buyer and remains Discovery Ready.

The feed should consider current availability, validity, freshness,
location where applicable, and remaining useful availability when
selecting such content.

Real-Time content should not receive automatic priority merely because
it is urgent or expires soon. It must still provide sufficient relevance
and potential value to the Buyer.

Buyer Experience may visually identify or organize Real-Time content so
that Buyers can quickly understand that the discovery is time-sensitive.

---

## Feed Principles

The feed should:

* Remain visually simple
* Avoid excessive repetition
* Introduce meaningful variety
* Reflect current buyer interests without trapping buyers inside them
* Include fresh and exploratory content
* Respect negative feedback
* Prioritize trustworthy offerings
* Make navigation easy
* Avoid manipulative engagement patterns

A buyer should be able to open PinkCurve and quickly see whether anything worthwhile has appeared since the previous visit.

---

# Discovery Modes

PinkCurve may support several discovery modes.

## Intent-Driven Discovery

The buyer provides an explicit need or interest.

Example:

```text
"I need waterproof trail-running shoes."
```

The Discovery Engine retrieves offerings relevant to that intent.

---

## Metadata-Guided Discovery

The buyer progressively narrows or redirects discovery using AMN.

This is particularly useful when the buyer knows roughly what they want but does not know the exact terminology or product.

---

## Passive Discovery

PinkCurve proactively surfaces potentially useful offerings through the Daily Discovery Feed.

The buyer does not need to initiate a search.

---

## Real-Time Discovery

Real-Time Discovery surfaces time-sensitive Offerings while they remain
useful, valid, and available.

It may operate through multiple Buyer experiences, including:

* Daily Discovery Feed
* Location-aware discovery
* Search
* Browse
* Intent-driven discovery
* Metadata-guided discovery

Real-Time Discovery is therefore not a separate discovery surface. It
is a Discovery Engine capability that can operate across applicable
surfaces.

Candidate selection should emphasize current Discovery readiness,
Buyer relevance, freshness, applicable location, and remaining useful
availability rather than simply whether an Offering was recently
published.

---

## Search

Keyword or natural-language queries can initiate discovery.

Search results may then transition naturally into metadata navigation.

```text
Search
   ↓
Initial Results
   ↓
Adaptive Metadata
   ↓
Progressive Discovery
```

Search is therefore one entry point into PinkCurve rather than the entire discovery experience.

---

## Browse

Buyers may explore:

* Categories
* Brands
* Locations
* Offering types
* Themes
* Trends

AMN can continue refining discovery inside a browse experience.

---

## Similar Discovery

From an existing offering, buyers may ask to explore:

* Similar offerings
* Alternatives
* Related offerings
* Nearby alternatives
* Different price ranges
* Different characteristics

---

# Offering Fit

Offering Fit represents how well an offering corresponds to current buyer intent and context.

Possible dimensions include:

* Semantic relevance
* Metadata compatibility
* Need or problem alignment
* Feature relevance
* Audience compatibility
* Location relevance
* Availability
* Freshness
* Remaining useful availability where applicable
* Price compatibility
* Temporal relevance
* Trust
* Buyer feedback history
* Learned usefulness

Offering Fit is not a permanent property of the offering.

The same offering may be highly relevant to one buyer and irrelevant to another—or relevant to the same buyer at a different time.

Offering Fit is evaluated only after applicable Discovery-readiness
requirements are satisfied.

For time-sensitive Offerings, remaining useful availability may affect
fit. An Offering that is still eligible but has limited time, quantity,
or capacity remaining may have different relevance depending on Buyer
location, context, and ability to act while the Offering remains
available.

However, urgency alone should not make an Offering relevant. A
time-sensitive Offering should still satisfy the same buyer-first
principle that Discovery exists to surface Offerings that may matter to
the Buyer.

---

# Discovery Signals

PinkCurve transforms internal knowledge into concise buyer-facing **Discovery Signals**.

Metadata and Discovery Signals serve different purposes.

**Metadata** helps buyers navigate and refine discovery.

**Discovery Signals** help buyers quickly understand why a particular offering may deserve attention.

---

## Examples

| Underlying Information          | Possible Discovery Signal     |
| ------------------------------- | ----------------------------- |
| Geographic distance             | 📍 Nearby — 0.8 miles         |
| Verified seller                 | ✓ Verified Provider           |
| Meaningful local trend          | 🔥 Popular Nearby             |
| Active promotion                | Limited-Time Offer            |
| Recently added offering         | New                           |
| Strong current-intent alignment | Matches What You're Exploring |
| Event timing                    | Happening This Weekend        |
| Community relevance             | Community Resource            |

Signals should be:

* Concise
* Understandable
* Truthful
* Visually lightweight
* Relevant to the buyer
* Supported by underlying data
* Available Now
* Ending Soon
* Limited Availability

PinkCurve should generally display only a small number of high-value signals at one time.

Time-sensitive Discovery Signals should communicate useful current
context without creating artificial urgency.

Signals such as **Available Now**, **Ending Soon**, or **Limited
Availability** should be shown only when supported by current Offering
Knowledge and applicable Discovery-readiness information.

These signals are explanatory presentation information. They should not
independently make an Offering eligible or relevant.

---

# Why Am I Seeing This?

Where practical, PinkCurve should help buyers understand why an offering appears.

Examples include:

* Because you selected "Waterproof"
* Popular near you
* New in a category you explore
* Similar to something you liked
* Available nearby
* Trending this week
* Sponsored discovery
* Available near you now
* Available for a limited time
* Currently available based on your location
* Matches your interests and is available now

This improves transparency without exposing internal ranking algorithms or technical scores.

For time-sensitive Discovery, explanations may include current context
such as availability, location, or validity period when that information
materially contributes to why the discovery is being shown.

Explanations should describe genuine Discovery reasoning and current
Offering information rather than create promotional pressure or
artificial urgency.

---

# Discovery Pipeline

The Discovery Engine may use a multi-stage pipeline.

```text
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
Presentation
       ↓
Buyer Interaction
       ↓
Re-ranking / Refinement
```

The exact algorithms may evolve, but the logical stages should remain distinct.

---

# Phase 1: Eligibility

Before ranking, PinkCurve determines which offerings are eligible for discovery.

Eligibility may consider:

* Offering status
* Seller status
* Trust verification
* Policy compliance
* Required approval status
* Required Offering Knowledge
* Validity period
* Current availability
* Quantity or capacity where applicable
* Expiration conditions
* Freshness of time-sensitive knowledge
* Geographic eligibility
* Campaign status
* Destination URL validity where applicable
* Other Offering-type-specific Discovery-readiness requirements

An offering that is ineligible should not enter normal discovery ranking.

Eligibility is evaluated from current **Discovery readiness**, not only
from whether the Offering exists or has previously been approved.

An Offering may therefore transition from Discovery Ready to Not
Discovery Ready without changing its descriptive Offering Knowledge.
For example, it may expire, become unavailable, exhaust applicable
quantity or capacity, be ended early by the Seller, require URL
reverification, or become restricted by a trust or policy condition.

These conditions should remove the Offering from active Discovery
before ranking rather than merely reducing its ranking score.

---

# Phase 2: Candidate Retrieval

Candidate retrieval reduces the full Offering corpus to a manageable set.

Retrieval methods may include:

* Metadata matching
* Category matching
* Semantic vector retrieval
* Keyword retrieval
* Location filtering
* Availability filtering
* Temporal filtering
* Learned associations
* Similar-offering retrieval

Multiple retrieval methods may operate in parallel.

```mermaid
flowchart LR
    A[Eligible Offerings] --> M[Metadata Retrieval]
    A --> V[Vector Retrieval]
    A --> K[Keyword Retrieval]
    A --> L[Location / Context Retrieval]

    M --> C[Candidate Pool]
    V --> C
    K --> C
    L --> C
```

Candidate retrieval should preserve enough diversity so ranking can consider useful alternatives rather than only near-duplicates.

Candidate retrieval should operate on the current eligible Offering
population.

For time-sensitive and Real-Time Discovery, retrieval should use current
validity, availability, location, freshness, and other applicable
operational information rather than relying only on static Offering
attributes or the state that existed when the Offering was published.

Retrieval optimizations may reduce the candidate population efficiently,
but they must not reintroduce Offerings that have already failed
Discovery-readiness requirements.

---

# Phase 3: Feature and Context Construction

Candidate offerings are evaluated using available signals.

Possible features include:

### Buyer Signals

* Explicit intent
* Current metadata selections
* Recent interactions
* Positive feedback
* Negative feedback
* Historical preferences where permitted
* Validity status
* Quantity or capacity where applicable

For time-sensitive Offerings, operational signals should reflect the
current Offering state rather than only the state that existed when the
Offering was originally published.

These signals may affect ranking only after the Offering has passed
applicable Discovery-readiness requirements. A failed readiness
requirement should be handled by Eligibility rather than compensated for
by a ranking score.

### Offering Signals

* Offering metadata
* Features
* Benefits
* Category
* Price
* Availability
* Location
* Freshness
* Creative quality
* Trust status

### Context Signals

* Session context
* Time
* Location
* Discovery surface
* Current discovery path
* Feed versus active exploration

### Learned Signals

* Historical discovery usefulness
* Audience response patterns
* Metadata effectiveness
* Creative effectiveness
* Negative-feedback patterns

---

# Phase 4: Ranking

Ranking determines the ordering of candidate offerings.

PinkCurve should not define ranking as prediction of engagement alone.

A future ranking model may estimate a broader concept such as:

**Expected Discovery Value**

Possible contributors may include:

```text
Discovery Value
    =
Intent Relevance
+ Metadata Fit
+ Context Relevance
+ Trust
+ Quality
+ Freshness
+ Diversity Contribution
+ Learned Usefulness
- Negative Signals
```

This is conceptual rather than a final formula.

Weights and model architecture should be validated empirically.

---

# Ranking Objectives

A ranking system may consider multiple objectives simultaneously.

### Relevance

How closely does the offering match current buyer intent?

### Usefulness

Is the offering likely to provide meaningful value to the buyer?

### Trust

Is the seller and offering sufficiently trustworthy?

### Discovery Novelty

Would showing something new improve discovery?

### Operational Freshness

Operational Freshness represents whether time-sensitive Offering
Knowledge remains current enough to support Discovery.

It may include the freshness of:

* Availability
* Quantity or capacity
* Price or discount information
* Validity period
* Location-specific information
* Other time-sensitive Offering facts

Operational Freshness may act as an eligibility requirement where stale
information would make Discovery unreliable.

When an Offering remains eligible, freshness may also be used as a
ranking signal where more current information improves the usefulness
or reliability of Discovery.

Operational Freshness is therefore different from Discovery Novelty.

**Discovery Novelty asks whether showing something new improves the
Buyer experience. Operational Freshness asks whether the information
being used for Discovery is still current enough to trust.**

### Diversity

Does the result set expose meaningful alternatives?

### Exploration

Should the system introduce a potentially relevant offering outside established behavior?

### Buyer Feedback

Has the buyer indicated that similar content is unwanted?

### Seller Fairness

Is the system unnecessarily concentrating exposure among a small number of sellers?

No single objective should dominate without evidence that doing so improves overall discovery quality.

---

# Phase 5: Diversity and Quality Controls

The highest-scoring individual offerings may not produce the best overall result set.

For example, a ranking model might produce:

```text
1. Running Shoe — Seller A
2. Running Shoe — Seller A
3. Running Shoe — Seller A
4. Running Shoe — Seller A
5. Running Shoe — Seller A
```

PinkCurve may instead prefer:

```text
1. Running Shoe — Seller A
2. Trail Shoe — Seller B
3. Budget Alternative — Seller C
4. Nearby Option — Seller D
5. Premium Alternative — Seller E
```

when this produces a more useful discovery experience.

Diversity may consider:

* Sellers
* Brands
* Price ranges
* Attributes
* Creative styles
* Offering types
* Locations
* New versus established offerings

Diversity should not mean randomization. It should increase useful choice.

---

# Phase 6: Presentation

The Discovery Engine returns:

* Ranked offerings
* Appropriate creative
* Relevant metadata
* Discovery Signals
* Explanation information
* Navigation opportunities

The Buyer Experience determines how these elements appear visually.

The Discovery Engine should avoid sending unnecessary technical complexity to the interface.

### Discovery Classification

Each discovery media should have one primary **Discovery Classification**.

The classification identifies the primary purpose and discovery behavior
of that media and is established when the Seller creates or submits the
media to PinkCurve.

Examples may include:

* Real-Time Discovery
* Regular Offering
* Discount
* Promotion
* Brand Recognition
* Public Service
* Community Bulletin
* Other supported discovery types

The Seller may select the intended classification during submission, but
PinkCurve should verify that the classification is consistent with the
media, Offering Knowledge, Seller information, and applicable policies.

The Discovery Classification belongs to the discovery media rather than
representing every characteristic of the underlying Offering.

For example, a Real-Time restaurant discovery may describe a discounted
meal, limited quantity, local availability, and an expiration time while
still having one primary Discovery Classification:

**Real-Time Discovery**

The other characteristics remain part of Offering Knowledge, promotion
information, metadata, or operational Discovery state as appropriate.

A single primary classification avoids ambiguous treatment of the same
discovery media and provides a consistent basis for:

* Discovery behavior
* Discovery media selection and presentation
* Buyer Experience organization and labeling
* Discovery Analytics
* Learning
* Applicable pricing and billing policy

The same Offering may have different discovery media with different
classifications. For example, a Seller may have a regular Offering video,
a Real-Time availability poster, and a separate discount promotion. Each
media asset is classified according to its own primary discovery purpose.

Discovery Classification may determine which pricing or billing policy
applies to the discovery media, but pricing must not determine organic
Discovery eligibility, relevance, or ranking.

**One discovery media → one primary Discovery Classification → one
applicable discovery and pricing policy.**
---

### Discovery Media Selection

After an Offering has been selected for Discovery, the Discovery Engine
should select the most appropriate **approved discovery media** for the
current discovery context.

Media selection may consider:

* Offering type
* Discovery mode
* Real-Time versus longer-lived Discovery
* Buyer context
* Device and presentation surface
* Current Offering Knowledge
* Media freshness
* Available approved creative assets
* Trust and provenance requirements

The Discovery Engine does not create the creative asset. Creative Studio
creates or manages the available creative assets, while the Discovery
Engine determines which approved asset is most appropriate to present
for a particular Discovery opportunity.

For example, a longer-lived Offering may use a richer image, video, or
story-oriented creative, while a Real-Time Offering may use a current
Seller-supplied photo, PinkCurve-generated poster, or feed card that
better represents its present availability.

The same Offering may therefore use different discovery media in
different contexts.

For time-sensitive Discovery, current factual representation should take
priority over richer creative that may no longer accurately represent
the Offering's present state.

**Offering selection determines what to show. Media selection determines
how to show it.**

---

# Continuous Re-Ranking

Discovery does not end after the initial list is presented.

The system may update ranking when the buyer:

* Selects metadata
* Hides an offering
* Gives negative feedback
* Gives positive feedback
* Opens an offering
* Changes location
* Searches
* Changes category
* Requests alternatives
* Resets discovery

This creates responsive discovery within the session.

### Operational State Changes

Continuous Discovery updates should also respond to changes in the
operational state of Offerings.

Relevant changes may include:

* Availability changes
* Quantity or capacity changes
* Validity-period changes
* Expiration
* Seller early termination
* Freshness changes
* Trust or verification changes
* Destination validity changes
* Other Discovery-readiness changes

When an operational change makes an Offering no longer Discovery Ready,
the Offering should be removed from active Discovery rather than waiting
for the next Buyer interaction or normal ranking cycle.

When the Offering remains eligible but its operational state changes,
the Discovery Engine may reevaluate its ranking and presentation using
the updated information.

This is especially important for Real-Time Discovery, where the
usefulness of an Offering may change quickly.

---

# Negative Feedback

Negative feedback is particularly important because buyers need a direct way to tell PinkCurve what they do not want.

Possible actions include:

* Not interested
* Show fewer like this
* Hide this offering
* Hide this seller
* Irrelevant
* Already seen too often
* Misleading
* Incorrect information
* Report offering

Different forms of negative feedback should have different meanings.

For example:

```text
Not Interested
    → Personal discovery signal

Misleading
    → Personal discovery signal + trust review candidate

Report Offering
    → Trust and Safety workflow
```

Negative feedback should be incorporated quickly into current and future discovery where appropriate.

---

# Positive Feedback

Positive feedback may include:

* Like
* Save
* Explore
* Show more like this
* Follow metadata path
* Visit destination
* Rate positively
* Return to offering

Positive feedback helps PinkCurve learn what is useful, but the system should avoid interpreting every click as approval.

---

# Exploration vs. Exploitation

A discovery system that only repeats known preferences can become narrow and repetitive.

PinkCurve therefore needs to balance:

### Exploitation

Show offerings strongly aligned with known interests.

### Exploration

Introduce potentially useful offerings outside existing patterns.

Exploration helps buyers discover things they did not already know to request.

The amount of exploration may depend on:

* Discovery surface
* Buyer behavior
* Session intent
* New inventory
* Feed freshness
* Buyer controls

---

# Cold Start

PinkCurve must work even when little or no buyer history exists.

For a new buyer, discovery may rely on:

* Current intent
* Location
* Selected categories
* AMN interactions
* Trending offerings
* New offerings
* Trusted offerings
* Diverse exploration
* Session behavior

This reduces dependence on long-term personal profiles.

AMN is especially valuable during cold start because buyers can communicate intent interactively.

---

# New Offering Cold Start

New offerings also lack interaction history.

PinkCurve should not disadvantage them simply because they have not yet accumulated engagement data.

New offering discovery may consider:

* Offering Knowledge quality
* Metadata relevance
* Seller verification
* Creative quality
* Current buyer intent
* Controlled exploration opportunities

This allows new sellers and offerings a meaningful opportunity to be discovered.

---

# Personalization

Personalization should be progressive rather than all-or-nothing.

Possible levels include:

| Level                       | Information Used            | Example                           |
| --------------------------- | --------------------------- | --------------------------------- |
| **Contextual**              | Current session and context | Current metadata selections       |
| **Session**                 | Recent interactions         | Adjust results during this visit  |
| **Preference**              | Saved buyer preferences     | Preferred categories or locations |
| **Behavioral**              | Historical interactions     | Longer-term discovery patterns    |
| **Individual Intelligence** | Multiple permitted signals  | Personalized discovery model      |

PinkCurve should prefer the least intrusive level of personalization that provides useful discovery.

---

# Privacy and Personalization

Discovery must follow PinkCurve privacy principles.

Potential requirements include:

* Data minimization
* Clear explanations
* Appropriate consent
* User control over stored preferences
* Ability to reset discovery history
* Limited retention where appropriate
* Protection against unnecessary sensitive inference

Personalization should improve discovery without turning PinkCurve into a surveillance platform.

See: [Security, Privacy, and Trust](12-security-privacy-and-trust.md)

---

# Location-Aware Discovery

Location can be highly valuable for:

* Local services
* Restaurants
* Events
* Community resources
* Public services
* Local inventory
* Promotions

Location-aware discovery may use levels such as:

* Country
* Region
* City
* Approximate local area
* Precise location when voluntarily enabled and necessary

The system should use the minimum geographic precision required for the discovery task.

Location should remain a relevance signal—not a requirement for every offering.

---

# Time-Aware Discovery

Some offerings have strong temporal relevance.

Examples include:

* Promotions
* Events
* Seasonal offerings
* Limited availability
* Community announcements
* New offerings
* Trending items

The engine should account for:

* Start time
* Expiration
* Event timing
* Recency
* Seasonal relevance
* Current availability
* Quantity or capacity where applicable
* Seller early termination
* Hard real-world availability deadlines
* Freshness of time-sensitive Offering Knowledge

Expired promotions and events should not continue to appear as active discoveries.

For Real-Time Discovery, temporal relevance may determine eligibility
rather than merely ranking priority.

An Offering should stop participating in active Discovery when its
applicable validity period ends, it becomes unavailable, applicable
quantity or capacity is exhausted, the Seller ends it early, or another
time-sensitive Discovery-readiness condition is no longer satisfied.

The Discovery Engine should therefore reevaluate time-sensitive
eligibility as operational Offering state changes rather than assuming
that eligibility established at publication remains valid for the
Offering's lifetime.

---

# Trending

Trending can make the Daily Discovery Feed more interesting, but trend status must be meaningful.

Trending should not simply mean:

> Most clicked.

Possible trend signals may include:

* Rapid increase in qualified interest
* Meaningful local activity
* Rising discovery across multiple buyers
* Positive feedback
* New relevance within a category

Trend calculation should include protections against:

* Bot traffic
* Seller manipulation
* Coordinated activity
* Small-sample distortion

---

# New Offerings

New offerings deserve controlled exposure so buyers can discover recent additions.

The Discovery Engine may reserve some discovery capacity for new offerings while maintaining:

* Relevance
* Trust requirements
* Quality thresholds
* Diversity

Newness should help an offering receive an opportunity to be evaluated, not guarantee permanent ranking advantage.

---

# Promotions and Discounts

Promotions may be surfaced when relevant.

Promotion ranking should consider:

* Buyer intent
* Actual promotion value
* Expiration
* Availability
* Location
* Trust

A discount should not automatically outrank a more relevant non-discounted offering.

---

# Brand Recognition Discovery

Brand Recognition is a distinct discovery objective.

A seller may want buyers to become familiar with:

* Brand identity
* Services
* Expertise
* Location
* Value proposition

Brand-recognition campaigns may be relevant even when the buyer is not ready to purchase immediately.

However, paid brand-recognition discovery must remain clearly distinguishable from organic relevance where necessary.

PinkCurve should measure brand-recognition effectiveness separately from transaction-oriented discovery.

---

# Commercial and Non-Commercial Discovery

PinkCurve's discovery architecture should support both commercial and future public/community offerings.

The same basic engine may retrieve:

* Products
* Commercial services
* Events
* Promotions
* Community resources
* Public services

However, ranking objectives may differ by Offering type.

For example, a public emergency resource should not be ranked using the same commercial logic as a retail product.

Offering type and discovery context must therefore influence ranking policy.

---

# Sponsored Discovery

PinkCurve may support paid discovery opportunities as part of its business model.

However:

* Sponsorship must not silently become relevance
* Paid placement should be identifiable
* Trust and eligibility rules still apply
* Spending should not override fundamental relevance or safety
* Buyer experience should remain useful

PinkCurve must avoid becoming a conventional pay-to-win advertising marketplace.

---

# Fairness and Seller Opportunity

Discovery should not unnecessarily concentrate exposure among sellers with the largest budgets, longest history, or most accumulated data.

Potential fairness considerations include:

* Opportunity for new sellers
* Opportunity for new offerings
* Seller diversity
* Brand diversity
* Prevention of monopolized result sets
* Appropriate exploration

Fairness does not mean equal exposure regardless of quality or relevance.

The objective is **fair opportunity to compete for relevant discovery**.

---

# Trust and Safety Integration

Trust operates before and during discovery.

Signals may include:

* Seller verification
* Buyer verification where relevant
* Offering verification
* Destination URL validation
* Fraud signals
* Abuse history
* Policy compliance
* Suspicious activity
* Bot detection

An offering may be:

* Eligible
* Restricted
* Temporarily suspended
* Removed

based on trust status.

High relevance should never override a serious trust or safety problem.

---

# Discovery Architecture

```mermaid
flowchart TB

    subgraph Inputs["Discovery Inputs"]
        BI[Buyer Intent]
        AM[Adaptive Metadata]
        OK[Offering Knowledge]
        CT[Context]
        FB[Buyer Feedback]
        TS[Trust Signals]
    end

    subgraph Engine["Discovery Engine"]
        EL[Eligibility]
        RT[Retrieval]
        RK[Ranking]
        DV[Diversity / Quality]
        DC[Discovery Classification]
        PS[Presentation Selection]
    end

    subgraph Experience["Buyer Experience"]
        CR[Creative]
        MD[Metadata Navigation]
        DS[Discovery Signals]
    end

    subgraph Learning["Feedback Loop"]
        DA[Discovery Analytics]
        LE[Learning Engine]
    end

    BI --> EL
    OK --> EL
    TS --> EL

    EL --> RT
    AM --> RT
    CT --> RT

    RT --> RK
    BI --> RK
    FB --> RK
    CT --> RK

    RK --> DV
    DV --> DC
    DC --> PS

    PS --> CR
    PS --> MD
    PS --> DS

    CR --> DA
    MD --> DA
    DS --> DA

    DA --> LE
    LE --> RT
    LE --> RK
```

Discovery Classification and Presentation Selection are separate
responsibilities within the Discovery Engine.

Each approved discovery media has one primary Discovery Classification
established during submission and verified by PinkCurve. The
classification identifies the primary discovery purpose of that media,
such as Real-Time Discovery, Regular Offering, Discount, Brand
Recognition, Public Service, or Community Bulletin.

Presentation Selection uses the verified Discovery Classification
together with Buyer context, Offering state, available approved media,
and the presentation surface to determine how the selected discovery
should be presented.

This preserves clear ownership:

* **Creative Studio** creates and manages discovery media.
* **Discovery Classification** identifies the primary discovery purpose
  of each media asset.
* **Discovery Engine** determines eligibility, retrieval, ranking,
  classification-aware presentation selection, and which approved media
  to present.
* **Buyer Experience** organizes and renders discoveries for Buyers.
* **Business Model and billing capabilities** use the verified Discovery
  Classification to determine the applicable pricing or billing policy.

Pricing and billing policy must not influence organic Discovery
eligibility, relevance, or ranking.

---

# Discovery Events

The engine should emit structured events that allow PinkCurve to understand what happened during discovery.

Examples include:

* Offering presented
* Creative viewed
* Metadata displayed
* Metadata selected
* Offering opened
* Destination clicked
* Positive feedback
* Negative feedback
* Offering hidden
* Seller hidden
* Search performed
* Discovery reset
* Report submitted

Events should contain enough context for analysis without collecting unnecessary personal information.

See: [Discovery Analytics](07-discovery-analytics.md)

---

# Learning Integration

The Learning Engine uses discovery outcomes to improve:

* Retrieval
* Ranking
* Metadata selection
* Creative selection
* Buyer intent interpretation
* Trending detection
* Exploration strategy
* Seller insights

Learning must be evaluated carefully because incorrect optimization can degrade the buyer experience.

For example, optimizing purely for watch time could reward sensational creative rather than useful discovery.

See: [Learning Engine](08-learning-engine.md)

### Human and Automated Discovery Signals

Discovery learning signals should distinguish verified human Buyer
activity from automated or non-human traffic.

Traffic identified as bots, crawlers, unauthorized automation, or other
non-human activity should not be treated as normal Buyer behavior for
personalization, ranking, intent learning, popularity, trending, or
other human-oriented learning models.

If PinkCurve later supports authorized delegated Buyer agents, their
activity should be identified separately from direct human Buyer
activity so that PinkCurve can determine explicitly which agent signals
are appropriate for each learning purpose.

The Discovery Engine and Learning Engine should therefore preserve actor
type and trust context with discovery events rather than assuming that
every interaction represents human Buyer preference.

---

# Discovery Evaluation

PinkCurve should evaluate discovery using multiple metrics.

Potential dimensions include:

* Relevance
* Exploration
* Buyer satisfaction
* Negative-feedback rate
* Click-through where meaningful
* Destination engagement
* Diversity
* Trust
* New offering discovery
* Repeat usefulness
* Seller value
* Brand-recognition effectiveness

No single metric should become the sole optimization target.

The experimental Discovery Score may combine selected dimensions.

See: [Discovery Analytics](07-discovery-analytics.md)

---

# Discovery Score

The Discovery Score is a PinkCurve experimental metric intended to represent discovery effectiveness.

It may eventually incorporate measures such as:

* Relevance
* Buyer exploration
* Positive signals
* Negative signals
* Destination engagement
* Trust
* Discovery diversity

The exact definition should be validated using real platform behavior.

The Discovery Score is not an industry standard and should not be treated as proven until tested.

---

# Current Status

## Implemented

* Offering Knowledge foundation
* Initial embedding-generation capabilities through the AI Platform

## In Development

* Offering embeddings
* Discovery architecture
* Metadata model
* Buyer Experience integration

## Planned

* Candidate retrieval
* Vector retrieval
* Keyword and metadata retrieval
* Adaptive Metadata Navigation
* Initial ranking logic
* Discovery feed
* Search
* Browse
* Location-aware discovery
* New and trending discovery
* Negative-feedback integration
* Diversity controls
* Trust eligibility integration
* Learning-based ranking
* Discovery explanation signals
* Real-Time Discovery
* Dynamic Discovery-readiness evaluation
* Operational freshness and validity handling
* Operational state-triggered withdrawal and re-ranking
* Discovery Classification
* Classification-aware Presentation Selection
* Real-Time and time-sensitive discovery media selection

---

# Initial MVP Approach

PinkCurve should avoid building a complex machine-learning ranking system before sufficient discovery data exists.

An initial MVP may use:

```text
Eligibility Rules
      ↓
Metadata / Keyword / Vector Retrieval
      ↓
Rule-Based or Weighted Ranking
      ↓
Diversity Rules
      ↓
Buyer Feedback
      ↓
Analytics
```

This allows PinkCurve to collect real discovery data before training sophisticated ranking models.

As data grows, learned ranking can gradually replace or augment heuristic rules.

The architecture should therefore support increasing intelligence without requiring it at launch.

### Real-Time Discovery in the MVP

Real-Time Discovery should use the same core MVP Discovery Engine
pipeline rather than requiring a separate discovery system.

Real-Time Offerings should pass through:

**Discovery Readiness → Candidate Retrieval → Feature Construction →
Ranking → Discovery Classification and Media Selection → Presentation**

The primary differences are the stronger dependence on current validity,
availability, freshness, location where applicable, quantity or capacity
where relevant, and other time-sensitive operational state.

This allows PinkCurve to support Real-Time Discovery in the MVP while
reusing the same core discovery architecture used for longer-lived
Offerings.

More specialized Real-Time retrieval or ranking models may be introduced
later if observed Buyer and Seller behavior demonstrates that they are
needed.

---

# Open Questions

See [Open Decisions](19-open-decisions.md) for decisions including:

* Initial ranking strategy
* Vector database selection
* AMN metadata selection strategy
* Personalization defaults
* Buyer history retention
* Exploration rate
* Ranking fairness rules
* New offering exposure
* Trending calculation
* Sponsored discovery policy
* Discovery Score definition

---

# Design Principles

### Buyer Intent Comes First

Seller spending should not silently override what the buyer is trying to discover.

### Buyer Control Must Be Visible

Buyers should have easy mechanisms for changing the direction of discovery.

### Metadata Is Interactive

Metadata is not only an internal ranking feature. Through AMN, it becomes part of the buyer's discovery conversation.

### Discovery Is Iterative

Each interaction can refine the current discovery state.

### Relevance Is Not Engagement

Clicks and viewing time are evidence—not the ultimate objective.

### Negative Feedback Matters

Signals about what buyers do not want are essential for useful discovery.

### New Offerings Need Opportunity

Historical engagement should not permanently favor established offerings.

### Diversity Improves Discovery

Useful alternatives should remain visible.

### Trust Overrides Relevance

Unsafe or fraudulent offerings should not be discoverable simply because they match intent.

### Learning Must Remain Accountable

Algorithmic improvement should be measured against buyer usefulness, trust, and seller value.

### Keep the Surface Simple

The underlying intelligence may be complex, but the Buyer Experience should remain visual and understandable.

### Current Truth Before Ranking

Discovery relevance cannot compensate for an Offering that is no longer
valid, available, trustworthy, or otherwise Discovery Ready.

For time-sensitive and Real-Time Discovery, PinkCurve should evaluate
current operational truth before ranking and presentation.

An Offering that fails an applicable Discovery-readiness requirement
should leave active Discovery rather than simply receive a lower ranking
score.

**Current truth comes before relevance.**

---

# Related Documents

* [Product Architecture](03-product-architecture.md)
* [Offering Knowledge](04-offering-knowledge.md)
* [Creative Studio](05-creative-studio.md)
* [Discovery Analytics](07-discovery-analytics.md)
* [Learning Engine](08-learning-engine.md)
* [Seller Intelligence](09-seller-intelligence.md)
* [AI Platform](10-ai-platform.md)
* [Data Architecture](11-data-architecture.md)
* [Security, Privacy, and Trust](12-security-privacy-and-trust.md)
* [Buyer Experience](20-buyer-experience.md)
* [Open Decisions](19-open-decisions.md)
* [Discovery Event Flow Diagram](../diagrams/discovery-event-flow.md)
