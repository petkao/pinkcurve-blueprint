# Platform Architecture Diagram

## Overview

High-level architecture showing the main components of PinkCurve and their interactions.

## Architecture Diagram

```mermaid
flowchart TB
    subgraph Sellers["Seller Layer"]
        SellerUI[Seller Portal]
        SellerAPI[Seller API]
    end

    subgraph Knowledge["Knowledge Layer"]
        PKS[Product Knowledge Service]
        PKStore[(Knowledge Store)]
    end

    subgraph Creative["Creative Layer"]
        CS[Creative Studio]
        GenAI[Generation AI]
        CStore[(Creative Store)]
    end

    subgraph Discovery["Discovery Layer"]
        DE[Discovery Engine]
        Embed[Embedding Service]
        VecDB[(Vector Store)]
    end

    subgraph Analytics["Analytics Layer"]
        Events[Event Collector]
        Analytics[Analytics Service]
        EventStore[(Event Store)]
    end

    subgraph Learning["Learning Layer"]
        LE[Learning Engine]
        Models[Model Service]
        SI[Seller Intelligence]
    end

    subgraph Buyers["Buyer Layer"]
        BuyerUI[Discovery UI]
        BuyerAPI[Discovery API]
    end

    subgraph Data["Data Layer"]
        PG[(PostgreSQL)]
        Cache[(Cache)]
    end

    %% Seller flows
    SellerUI --> SellerAPI
    SellerAPI --> PKS
    SellerAPI --> CS
    PKS --> PKStore

    %% Knowledge to Creative
    PKS --> CS
    CS --> GenAI
    CS --> CStore

    %% Creative to Discovery
    CStore --> DE
    PKS --> Embed
    Embed --> VecDB

    %% Discovery flows
    BuyerUI --> BuyerAPI
    BuyerAPI --> DE
    DE --> VecDB

    %% Analytics flows
    BuyerAPI --> Events
    Events --> EventStore
    EventStore --> Analytics

    %% Learning flows
    Analytics --> LE
    LE --> Models
    Models --> DE
    LE --> SI
    SI --> SellerAPI

    %% Data layer
    PKStore --> PG
    CStore --> PG
    EventStore --> PG
```

## Component Descriptions

| Component | Description | Status |
|-----------|-------------|--------|
| Seller Portal | Web UI for sellers | Implemented |
| Seller API | Backend for seller operations | Implemented |
| Product Knowledge Service | Manage product knowledge | Implementing |
| Creative Studio | Generate creative content | Implemented |
| Generation AI | LLM for content generation | Implemented |
| Discovery Engine | Match buyers with products | Planned |
| Embedding Service | Generate embeddings | Planned |
| Event Collector | Capture discovery events | Planned |
| Analytics Service | Process analytics | Planned |
| Learning Engine | Learn from signals | Planned |
| Seller Intelligence | Insights for sellers | Planned |
| Discovery UI | Buyer discovery experience | Planned |

## Data Flows

1. **Seller → Knowledge → Creative:** Sellers input product knowledge, which feeds creative generation
2. **Creative → Discovery:** Generated content surfaces in discovery
3. **Discovery → Analytics:** Buyer interactions generate events
4. **Analytics → Learning → Discovery:** Learning improves discovery
5. **Learning → Intelligence → Seller:** Insights flow back to sellers
