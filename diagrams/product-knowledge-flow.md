# Product Knowledge Flow Diagram

## Overview

How product knowledge is captured, enriched, and used throughout the platform.

## Knowledge Flow

```mermaid
flowchart TB
    subgraph Capture["Knowledge Capture"]
        Manual[Manual Entry]
        Import[Data Import]
        Extract[AI Extraction]
    end

    subgraph Process["Knowledge Processing"]
        Validate[Validation]
        Enrich[Enrichment]
        Score[Completeness Scoring]
    end

    subgraph Store["Knowledge Storage"]
        PKTable[(product_knowledge)]
        Embed[Embedding Generation]
        VecStore[(Vector Store)]
    end

    subgraph Use["Knowledge Usage"]
        Creative[Creative Studio]
        Discovery[Discovery Engine]
        Intelligence[Seller Intelligence]
    end

    %% Capture flows
    Manual --> Validate
    Import --> Validate
    Extract --> Validate

    %% Processing flows
    Validate --> Enrich
    Enrich --> Score
    Score --> PKTable

    %% Storage flows
    PKTable --> Embed
    Embed --> VecStore

    %% Usage flows
    PKTable --> Creative
    VecStore --> Discovery
    PKTable --> Intelligence
```

## Capture Methods

### Manual Entry
```mermaid
sequenceDiagram
    participant S as Seller
    participant UI as Knowledge UI
    participant API as API
    participant DB as Database

    S->>UI: Enter product details
    UI->>UI: Client validation
    UI->>API: Submit knowledge
    API->>API: Server validation
    API->>DB: Store knowledge
    DB-->>API: Confirm
    API-->>UI: Success + score
    UI-->>S: Show completeness
```

### AI Extraction (Planned)
```mermaid
sequenceDiagram
    participant S as Seller
    participant UI as UI
    participant AI as AI Service
    participant API as API

    S->>UI: Provide product URL
    UI->>AI: Extract knowledge
    AI->>AI: Analyze page
    AI-->>UI: Suggested knowledge
    UI-->>S: Review suggestions
    S->>UI: Approve/edit
    UI->>API: Save knowledge
```

## Knowledge Entity Structure

```mermaid
erDiagram
    PRODUCT_KNOWLEDGE {
        uuid id PK
        uuid seller_id FK
        uuid product_id FK
        varchar product_name
        text product_description
        text product_url
        numeric price_amount
        char currency_code
        jsonb key_features
        jsonb key_benefits
        jsonb target_audiences
        jsonb unique_selling_points
        jsonb differentiators
        jsonb brand_voice
        jsonb competitive_landscape
        jsonb faqs
        jsonb specifications
        jsonb keywords
        varchar source
        integer completeness_score
        integer version
        varchar status
        timestamptz created_at
        timestamptz updated_at
    }

    SELLER ||--o{ PRODUCT_KNOWLEDGE : owns
    PRODUCT ||--o| PRODUCT_KNOWLEDGE : describes
```

## Completeness Scoring

```mermaid
flowchart LR
    subgraph Factors["Scoring Factors"]
        Required[Required Fields]
        Rich[Rich Knowledge]
        Audience[Audience Clarity]
        Context[Context Depth]
    end

    subgraph Calc["Calculation"]
        Weight[Apply Weights]
        Normalize[Normalize 0-100]
    end

    subgraph Output["Output"]
        Score[Completeness Score]
        Level[Quality Level]
    end

    Required --> Weight
    Rich --> Weight
    Audience --> Weight
    Context --> Weight
    Weight --> Normalize
    Normalize --> Score
    Score --> Level
```

| Score Range | Level | Capability |
|-------------|-------|------------|
| 0-25 | Minimal | Basic listing only |
| 26-50 | Basic | Simple matching |
| 51-75 | Good | Effective discovery |
| 76-100 | Comprehensive | Optimal matching |
