# Discovery Event Flow Diagram

## Overview

How discovery events are captured, processed, and used for analytics and learning.

## Event Flow

```mermaid
flowchart TB
    subgraph Sources["Event Sources"]
        FE[Frontend Events]
        BE[Backend Events]
        Third[Third-party Events]
    end

    subgraph Collection["Event Collection"]
        Collector[Event Collector]
        Validate[Validation]
        Enrich[Enrichment]
    end

    subgraph Processing["Event Processing"]
        Stream[Event Stream]
        Transform[Transformation]
        Aggregate[Aggregation]
    end

    subgraph Storage["Event Storage"]
        Raw[(Raw Events)]
        Processed[(Processed Events)]
        Metrics[(Metric Store)]
    end

    subgraph Usage["Event Usage"]
        Analytics[Analytics]
        Learning[Learning Engine]
        RealTime[Real-time Features]
    end

    FE --> Collector
    BE --> Collector
    Third -.-> Collector

    Collector --> Validate
    Validate --> Enrich
    Enrich --> Stream

    Stream --> Raw
    Stream --> Transform
    Transform --> Processed
    Transform --> Aggregate
    Aggregate --> Metrics

    Processed --> Analytics
    Processed --> Learning
    Stream --> RealTime
```

## Event Types

```mermaid
flowchart TB
    subgraph Funnel["Discovery Funnel Events"]
        Imp[impression]
        View[view]
        Engage[engage]
        Click[click_through]
    end

    subgraph Actions["User Action Events"]
        Save[save]
        Share[share]
        Hide[hide]
    end

    subgraph Meta["Meta Events"]
        Session[session_start]
        Search[search]
        Filter[filter]
    end

    Imp --> View
    View --> Engage
    Engage --> Click
```

## Event Structure

```mermaid
classDiagram
    class DiscoveryEvent {
        +uuid event_id
        +string event_type
        +timestamp timestamp
        +uuid product_id
        +uuid buyer_id
        +uuid session_id
        +string surface
        +integer position
        +object context
        +object metadata
    }

    class EventContext {
        +string device_type
        +string browser
        +string country
        +string referrer
        +object experiment_ids
    }

    class EventMetadata {
        +string sdk_version
        +timestamp client_time
        +timestamp server_time
        +boolean is_bot
    }

    DiscoveryEvent --> EventContext
    DiscoveryEvent --> EventMetadata
```

## Processing Pipeline

```mermaid
sequenceDiagram
    participant C as Client
    participant Col as Collector
    participant Val as Validator
    participant Enr as Enricher
    participant Str as Stream
    participant DB as Database

    C->>Col: Send event
    Col->>Val: Validate schema

    alt Invalid
        Val-->>Col: Reject
        Col-->>C: Error
    else Valid
        Val->>Enr: Enrich event
        Enr->>Enr: Add server timestamp
        Enr->>Enr: Add geo data
        Enr->>Enr: Bot detection
        Enr->>Str: Publish event
        Str->>DB: Store raw
        Str-->>Col: Ack
        Col-->>C: Success
    end
```

## Aggregation Levels

```mermaid
flowchart LR
    subgraph Raw["Raw Events"]
        Event[Individual Events]
    end

    subgraph Hourly["Hourly Aggregates"]
        HProduct[Per Product]
        HSeller[Per Seller]
        HSurface[Per Surface]
    end

    subgraph Daily["Daily Aggregates"]
        DProduct[Per Product]
        DSeller[Per Seller]
        DCategory[Per Category]
    end

    subgraph Monthly["Monthly Aggregates"]
        MProduct[Per Product]
        MSeller[Per Seller]
        MPlatform[Platform-wide]
    end

    Event --> HProduct
    Event --> HSeller
    Event --> HSurface

    HProduct --> DProduct
    HSeller --> DSeller
    HSurface --> DCategory

    DProduct --> MProduct
    DSeller --> MSeller
    DCategory --> MPlatform
```

## Bot Detection

```mermaid
flowchart TB
    subgraph Signals["Detection Signals"]
        Rate[Request Rate]
        Pattern[Access Pattern]
        UA[User Agent]
        Behavior[Behavior Analysis]
    end

    subgraph Check["Detection Logic"]
        Rules[Rule-based]
        ML[ML-based]
    end

    subgraph Action["Actions"]
        Flag[Flag as Bot]
        Block[Block]
        CAPTCHA[CAPTCHA]
        Pass[Allow]
    end

    Rate --> Rules
    Pattern --> Rules
    UA --> Rules
    Behavior --> ML

    Rules --> Flag
    Rules --> Block
    ML --> CAPTCHA
    Rules --> Pass
    ML --> Pass
```
