package org.example.stride.model.Enum;

public enum WorkoutPreference {
    CARDIO("Aerobic exercises like running, cycling, and swimming."),
    STRENGTH_TRAINING("Weightlifting and resistance exercises."),
    YOGA("Flexibility, mindfulness, and balance exercises."),
    ENDURANCE("Long-distance activities like running or cycling."),
    FLEXIBILITY("Stretching or mobility-focused exercises.");

    private final String description;

    WorkoutPreference(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
