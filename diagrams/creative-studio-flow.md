# Creative Studio Flow Diagram

## Overview

The content generation pipeline from Product Knowledge to creative assets.

## Generation Pipeline

```mermaid
flowchart LR
    subgraph Input["Input"]
        PK[Product Knowledge]
        Params[Generation Parameters]
    end

    subgraph Generation["Creative Generation"]
        Brief[Brief Generation]
        Script[Script Generation]
        Story[Storyboard Generation]
        Video[Video Generation]
    end

    subgraph Output["Output"]
        Assets[Creative Assets]
        Meta[Metadata]
    end

    PK --> Brief
    Params --> Brief
    Brief --> Script
    Script --> Story
    Story -.-> Video

    Brief --> Assets
    Script --> Assets
    Story --> Assets
    Video -.-> Assets

    Assets --> Meta

    style Video stroke-dasharray: 5 5
```

*Note: Video Generation is planned functionality.*

## Campaign Structure

```mermaid
erDiagram
    CREATIVE_CAMPAIGN {
        uuid id PK
        uuid seller_id FK
        uuid product_id FK
        uuid knowledge_id FK
        varchar title
        text description
        integer video_duration
        varchar status
        timestamptz created_at
        timestamptz updated_at
    }

    CREATIVE_BRIEF {
        uuid id PK
        uuid seller_id FK
        uuid product_id FK
        uuid campaign_id FK
        jsonb brief_data
        jsonb product_analysis
        varchar status
        timestamptz created_at
        timestamptz updated_at
    }

    CREATIVE_SCRIPT {
        uuid id PK
        uuid seller_id FK
        uuid brief_id FK
        uuid campaign_id FK
        jsonb script_data
        varchar status
        timestamptz created_at
        timestamptz updated_at
    }

    CREATIVE_STORYBOARD {
        uuid id PK
        uuid seller_id FK
        uuid script_id FK
        uuid campaign_id FK
        jsonb storyboard_data
        varchar status
        timestamptz created_at
        timestamptz updated_at
    }

    CREATIVE_CAMPAIGN ||--o{ CREATIVE_BRIEF : contains
    CREATIVE_CAMPAIGN ||--o{ CREATIVE_SCRIPT : contains
    CREATIVE_CAMPAIGN ||--o{ CREATIVE_STORYBOARD : contains
    CREATIVE_BRIEF ||--o{ CREATIVE_SCRIPT : generates
    CREATIVE_SCRIPT ||--o{ CREATIVE_STORYBOARD : generates
```

## Generation Workflow

```mermaid
sequenceDiagram
    participant S as Seller
    participant UI as Creative UI
    participant API as API
    participant AI as AI Service
    participant DB as Database

    S->>UI: Create Campaign
    UI->>API: POST /campaigns
    API->>DB: Insert campaign
    DB-->>API: Campaign created
    API-->>UI: Campaign ID

    S->>UI: Generate Brief
    UI->>API: POST /briefs
    API->>DB: Get product knowledge
    DB-->>API: Knowledge data
    API->>AI: Generate brief
    AI-->>API: Brief content
    API->>DB: Store brief
    DB-->>API: Brief created
    API-->>UI: Brief for review

    S->>UI: Approve Brief
    S->>UI: Generate Script
    UI->>API: POST /scripts
    API->>AI: Generate script from brief
    AI-->>API: Script content
    API->>DB: Store script
    API-->>UI: Script for review

    S->>UI: Approve Script
    S->>UI: Generate Storyboard
    UI->>API: POST /storyboards
    API->>AI: Generate storyboard from script
    AI-->>API: Storyboard content
    API->>DB: Store storyboard
    API-->>UI: Storyboard for review
```

## Generation Parameters

```mermaid
flowchart TB
    subgraph Duration["Video Duration"]
        D15[15 seconds]
        D30[30 seconds]
        D60[60 seconds]
    end

    subgraph Tone["Tone Options"]
        Pro[Professional]
        Cas[Casual]
        Ene[Energetic]
        Sop[Sophisticated]
    end

    subgraph Focus["Audience Focus"]
        Seg1[Primary Segment]
        Seg2[Secondary Segment]
        Gen[General]
    end

    Duration --> Generator[Content Generator]
    Tone --> Generator
    Focus --> Generator
    Generator --> Content[Generated Content]
```

## Quality Controls

```mermaid
flowchart LR
    subgraph Pre["Pre-Generation"]
        Val[Knowledge Validation]
        Par[Parameter Validation]
    end

    subgraph Gen["Generation"]
        Prompt[Prompt Assembly]
        LLM[LLM Call]
        Parse[Response Parsing]
    end

    subgraph Post["Post-Generation"]
        Format[Format Check]
        Length[Length Check]
        Review[Human Review]
    end

    Val --> Prompt
    Par --> Prompt
    Prompt --> LLM
    LLM --> Parse
    Parse --> Format
    Format --> Length
    Length --> Review
```
