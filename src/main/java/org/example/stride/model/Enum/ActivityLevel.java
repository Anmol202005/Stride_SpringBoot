package org.example.stride.model.Enum;

public enum ActivityLevel {
    SEDENTARY("Minimal activity, primarily sitting."),
    LIGHTLY_ACTIVE("Light exercise or sports 1–3 days a week."),
    MODERATELY_ACTIVE("Moderate exercise or sports 3–5 days a week."),
    VERY_ACTIVE("Hard exercise or sports 6–7 days a week."),
    SUPER_ACTIVE("Intense daily training or physically demanding job.");

    private final String description;

    ActivityLevel(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

