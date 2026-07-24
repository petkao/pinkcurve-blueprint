# Learning Engine Flow Diagram

## Overview

How the Learning Engine processes signals to improve discovery and generate insights.

## Learning Flow

```mermaid
flowchart TB
    subgraph Input["Signal Input"]
        Events[Discovery Events]
        Feedback[Explicit Feedback]
        Outcomes[Outcome Data]
    end

    subgraph Process["Signal Processing"]
        Aggregate[Aggregation]
        Features[Feature Engineering]
        Labels[Label Generation]
    end

    subgraph Train["Model Training"]
        Split[Train/Val Split]
        Train[Training]
        Eval[Evaluation]
    end

    subgraph Deploy["Model Deployment"]
        Registry[Model Registry]
        Serve[Model Serving]
        Monitor[Monitoring]
    end

    subgraph Apply["Application"]
        Ranking[Discovery Ranking]
        Recs[Recommendations]
        Insights[Seller Insights]
    end

    Events --> Aggregate
    Feedback --> Aggregate
    Outcomes --> Aggregate

    Aggregate --> Features
    Features --> Labels
    Labels --> Split

    Split --> Train
    Train --> Eval
    Eval --> Registry

    Registry --> Serve
    Serve --> Monitor

    Serve --> Ranking
    Serve --> Recs
    Serve --> Insights
```

## Signal Processing

```mermaid
flowchart LR
    subgraph Raw["Raw Signals"]
        Imp[Impressions]
        Clicks[Clicks]
        Time[Time on Page]
        Actions[User Actions]
    end

    subgraph Derived["Derived Features"]
        CTR[Click-through Rate]
        EngRate[Engagement Rate]
        QPVRate[QPV Rate]
        Affinity[User-Product Affinity]
    end

    subgraph Labels["Training Labels"]
        Positive[Positive: Engagement]
        Negative[Negative: Skip/Bounce]
        Weight[Confidence Weight]
    end

    Imp --> CTR
    Clicks --> CTR
    Clicks --> EngRate
    Time --> EngRate
    Actions --> QPVRate

    CTR --> Positive
    EngRate --> Positive
    Imp --> Negative
    Time --> Weight
```

## Feedback Loops

```mermaid
flowchart TB
    subgraph Fast["Fast Loop (Real-time)"]
        Session[Session Signals]
        Adjust[Quick Adjustments]
        Boost[Result Boosting]
    end

    subgraph Medium["Medium Loop (Daily)"]
        DailyAgg[Daily Aggregates]
        FeatureUp[Feature Updates]
        ScoreUp[Score Updates]
    end

    subgraph Slow["Slow Loop (Weekly)"]
        FullData[Full Data]
        Retrain[Model Retraining]
        Deploy[Deployment]
    end

    Session --> Adjust
    Adjust --> Boost
    Boost --> Session

    DailyAgg --> FeatureUp
    FeatureUp --> ScoreUp
    ScoreUp --> DailyAgg

    FullData --> Retrain
    Retrain --> Deploy
    Deploy --> FullData
```

## Model Pipeline

```mermaid
sequenceDiagram
    participant Data as Data Pipeline
    participant Train as Training
    participant Eval as Evaluation
    participant Reg as Registry
    participant Serve as Serving
    participant Prod as Production

    Data->>Train: Training data
    Train->>Train: Train model
    Train->>Eval: Model artifact
    Eval->>Eval: Run evaluation

    alt Metrics pass
        Eval->>Reg: Register model
        Reg->>Serve: Deploy to staging
        Serve->>Serve: Shadow mode
        Note over Serve: Compare with production

        alt Outperforms production
            Serve->>Prod: Gradual rollout
            Prod-->>Serve: Monitoring feedback
        else Underperforms
            Serve->>Reg: Mark as rejected
        end
    else Metrics fail
        Eval->>Train: Feedback for improvement
    end
```

## Learning Objectives

```mermaid
flowchart TB
    subgraph Ranking["Improve Ranking"]
        PredEng[Predict Engagement]
        OptRel[Optimize Relevance]
    end

    subgraph Content["Optimize Content"]
        TestVar[Test Variations]
        PickBest[Select Best]
    end

    subgraph Knowledge["Enrich Knowledge"]
        InferFeat[Infer Features]
        IdentAud[Identify Audiences]
    end

    subgraph Insights["Generate Insights"]
        Patterns[Find Patterns]
        Recs[Recommendations]
    end

    Events([Discovery Events]) --> Ranking
    Events --> Content
    Events --> Knowledge
    Events --> Insights
```

## Cold Start Handling

```mermaid
flowchart TB
    subgraph NewProduct["New Product"]
        PKFeatures[Product Knowledge Features]
        CategoryPrior[Category Prior]
        ExploreExploit[Explore-Exploit]
    end

    subgraph NewBuyer["New Buyer"]
        Popular[Popular Products]
        QuickInfer[Quick Preference Inference]
        Progressive[Progressive Personalization]
    end

    subgraph NewFeature["New Feature"]
        ABTest[A/B Test]
        Rollout[Gradual Rollout]
        Fallback[Fallback Behavior]
    end
```
