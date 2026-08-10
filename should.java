# Buyer Experience — Visual Discovery and Metadata Navigation

## Document Status

| Field | Value |
|-------|-------|
| **Status** | Draft |
| **Version** | 0.1 |
| **Owner** | PinkCurve Product Team |
| **Last Reviewed** | 2026-08-09 |
| **Related Components** | All platform components |

### Visual First

PinkCurve is designed primarily for mobile and small-screen experiences. Buyers should not need to read long product descriptions, advertisements, or lists of offerings to discover something useful.

Offerings are presented primarily through **graphics, images, short videos, and visual stories**.

The intended buyer experience is simple:

**Open PinkCurve → See → Swipe → Discover → Explore**

A buyer should be able to understand and navigate PinkCurve within seconds, without first learning how PinkCurve works.

PinkCurve's underlying technology may be sophisticated, but the buyer experience must remain simple and intuitive.

### Discovery, Not Searching Through Listings

As PinkCurve grows, hundreds or thousands of offerings may be available at any moment.

PinkCurve should help buyers quickly discover offerings that may be relevant to them instead of requiring them to search through large catalogs.

Examples of discovery paths may include:

* For You
* Nearby
* New
* Trending
* Deals
* Categories
* Trusted or verified sellers

The objective is not to show buyers everything. The objective is to help each buyer quickly reach offerings worth seeing.

### Metadata Without Clutter

Rich metadata is essential to PinkCurve.

Metadata helps PinkCurve understand, retrieve, rank, organize, filter, and recommend offerings. It may include product category, location, price, seller information, trust signals, availability, discounts, trends, buyer relevance, campaign information, and many other attributes.

However, buyers should not be required to see all of this information.

PinkCurve follows a simple principle:

**Rich metadata underneath. Minimal metadata on screen.**

Metadata should be exposed progressively.

**Level 1 — Immediately Visible**

Only a few high-value visual signals should appear with an offering, such as:

`Nearby` · `Deal` · `New` · `Verified`

These should be compact and should never substantially obstruct the graphic or video.

**Level 2 — Available on Demand**

Additional information can be displayed when the buyer taps or expands the offering, including price, distance, seller information, offer details, expiration, category, and why the offering may be relevant.

**Level 3 — PinkCurve Intelligence**

Detailed metadata used by PinkCurve's retrieval, ranking, personalization, trust, fraud detection, and learning systems remains primarily behind the scenes.

### Metadata Is Also Navigation

Metadata is not merely information about an offering. It can become part of PinkCurve's navigation system.

For example:

* Tap **Nearby** → discover nearby offerings.
* Tap **Deals** → discover current deals.
* Tap **New** → discover new offerings.
* Tap a **Category** → continue discovering within that category.
* Tap a trust indicator → understand why PinkCurve considers the seller or offering trustworthy.

This allows buyers to navigate naturally while viewing visual content instead of repeatedly leaving the experience to configure filters or search forms.

### Trust Is Part of Discovery

PinkCurve should help buyers discover useful offerings while also working to reduce their exposure to suspicious sellers, misleading offers, scams, and other potentially harmful activity.

Trust information should be communicated visually wherever possible rather than through lengthy policies.

PinkCurve should not promise that an offering or seller is completely risk-free. Instead, PinkCurve should provide meaningful trust signals, verification information, warnings, and other protections that help buyers make better-informed decisions.

### Core Buyer Promise

PinkCurve helps buyers quickly discover products, services, deals, and useful offerings through visual stories while working to keep discovery relevant, efficient, and trustworthy.

## First-Time Buyer Experience

A first-time visitor should understand the purpose of PinkCurve through the experience itself rather than through an explanation.

Within the first few seconds, the buyer should understand:

**PinkCurve helps me discover offerings that may be worth my attention.**

The buyer should not be required to:

* Read an explanation of PinkCurve
* Understand how PinkCurve's AI works
* Create a detailed search query
* Configure complicated filters
* Understand the seller advertising system
* Learn a new navigation model before seeing useful content

The experience should demonstrate PinkCurve's value immediately.

A simplified first-time journey is:

**Open → See an Offering → Swipe → Discover → Explore**

The first screen should therefore prioritize an actual visual offering rather than introductory text, menus, or platform explanations.

A short visual message may establish context, but the offering itself should remain the center of the experience.

---

## The Offering as the Primary Experience

Each offering should be treated as a visual discovery object rather than a traditional product listing.

The graphic, image, short video, or visual story occupies most of the available display area.

Supporting information should be positioned around or over the visual only when it adds immediate value and does not interfere with the offering.

A conceptual mobile experience may contain:

```text
┌─────────────────────────────┐
│ For You   Nearby   Deals    │
│                             │
│                             │
│                             │
│       VISUAL OFFERING       │
│       IMAGE / VIDEO         │
│                             │
│                             │
│                             │
│  Nearby   Deal   Verified   │
│                             │
│  ♡   Share       Explore →  │
└─────────────────────────────┘
             ↑
           Swipe
```

This is a conceptual model rather than a fixed UI specification. Actual layouts should be tested with buyers and optimized for different screen sizes.

The central principle remains:

**The offering receives the buyer's attention. The interface should not compete with it.**

---

## Fast Visual Navigation

PinkCurve should allow buyers to move rapidly through offerings.

The primary interaction model should favor simple gestures and actions:

* **Swipe** — Move to another offering
* **Tap metadata** — Explore related offerings
* **Tap Explore** — Learn more from the seller
* **Tap trust information** — Understand available seller or offering trust signals
* **Save** — Return to an interesting offering later
* **Not Interested** — Reduce similar offerings and help PinkCurve improve future discovery.
* **Share** — Share an offering when appropriate

Buyers should be able to continue discovering without repeatedly returning to menus or search screens.

Navigation should feel continuous.

---

## Discovery Paths

PinkCurve can provide several simple discovery paths while its ranking and retrieval systems handle greater complexity underneath.

Examples include:

**For You** — Offerings selected using available relevance signals.

**Nearby** — Offerings with useful geographic relevance to the buyer.

**New** — Recently available offerings.

**Trending** — Offerings receiving meaningful current interest.

**Deals** — Discounts, promotions, or other time-sensitive opportunities.

**Categories** — Buyer-directed exploration of particular interests.

**Buyer-directed discovery** — Buyers can actively redirect PinkCurve toward what they want to explore rather than relying entirely on recommendations.

These paths should remain understandable without requiring buyers to understand the algorithms behind them.

As PinkCurve learns which navigation patterns are genuinely useful, discovery paths can evolve.

---

## Progressive Disclosure

PinkCurve should not attempt to display everything it knows about an offering at once.

Information should appear according to buyer need.

### Immediate

Information necessary for rapid discovery may appear directly with the visual:

`Nearby` · `Deal` · `New` · `Verified`

The exact signals will depend on the offering.

### Interested

When the buyer shows interest, PinkCurve can reveal additional information:

* Price or price range
* Seller
* Location or distance
* Category
* Offer conditions
* Availability
* Promotion expiration
* Additional trust information

### Exploring

When the buyer wants to investigate further, PinkCurve can provide a clear path to the seller's product or service destination.

PinkCurve facilitates discovery. The seller remains responsible for the transaction unless the platform's business model explicitly changes in the future.

---

## Trust Signals Without False Guarantees

Trust should be visible but should not overwhelm the discovery experience.

Potential trust indicators may include seller verification, location information, seller history, offering validation, suspicious-activity warnings, or other signals developed by PinkCurve's trust systems.

Trust indicators must have clearly defined meanings.

For example, a **Verified** indicator should communicate exactly what PinkCurve verified. It should never imply that PinkCurve guarantees the seller, product, service, transaction, or outcome unless such a guarantee actually exists.

When PinkCurve detects meaningful risk, buyer protection should take priority over uninterrupted discovery.

Trust therefore operates at two levels:

**Visible trust signals** help buyers make informed decisions.

**Behind-the-scenes protections** help PinkCurve detect and respond to suspicious behavior before it reaches buyers.

See [Security, Privacy, and Trust](12-security-privacy-and-trust.md).

---

## Discovery Intelligence Behind the Experience

The simplicity of the buyer interface should not limit the intelligence underneath it.

PinkCurve may use rich product knowledge, metadata, buyer interaction signals, location relevance, contextual information, ranking models, learning systems, and trust signals to determine which offerings to retrieve and how to organize them.

These capabilities should primarily operate behind the experience.

The buyer does not need to know:

* Which retrieval system selected an offering
* Which ranking model scored it
* Which AI model analyzed the product
* Which metadata attributes were evaluated
* Which learning pipeline improved the ranking

The buyer needs to experience the result:

**Something potentially useful appeared quickly and was easy to understand.**

See [Product Knowledge](04-product-knowledge.md), [Discovery Engine](06-discovery-engine.md), and [Learning Engine](08-learning-engine.md).

---

## Buyer Experience Success Test

PinkCurve should periodically test the experience with people who have never used the platform.

A simple test is:

1. Give the person PinkCurve without explaining it.
2. Allow them to use it for several seconds.
3. Ask: **"What do you think PinkCurve helps you do?"**

A successful experience should produce answers reasonably close to:

> "It helps me discover products, services, deals, or other things that might interest me."

If users instead ask what they are supposed to do, cannot identify PinkCurve's purpose, or believe they must understand the platform before using it, the buyer experience needs improvement.

PinkCurve should explain itself primarily through use.

---

## Buyer Experience North Star

As PinkCurve evolves, buyer-experience decisions should return to one question:

**Does this help the buyer discover something worthwhile more quickly, easily, and confidently?**

If additional metadata, controls, AI features, advertising mechanisms, or interface elements do not improve that outcome, they should not be allowed to complicate the buyer experience.


### Product Design Principles

**Visual First**
Buyers discover through graphics, video, and visual stories rather than text-heavy listings.

**Metadata Without Clutter**
PinkCurve can maintain rich metadata while displaying only what the buyer needs at that moment.

**Discovery Before Complexity**
The buyer does not need to understand PinkCurve's AI, ranking systems, agents, advertising infrastructure, or seller tools.

**Trust by Design**
Trust and buyer protection are integrated into discovery rather than treated as separate features.

**Sophisticated Underneath. Simple on the Surface.**
PinkCurve's intelligence belongs behind the experience. The buyer should simply feel that PinkCurve helps them find worthwhile things quickly.


