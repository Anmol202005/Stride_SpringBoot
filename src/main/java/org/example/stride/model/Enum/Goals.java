package org.example.stride.model.Enum;

public enum Goals {
    WEIGHT_LOSS("Focus on losing weight through calorie deficit and cardio"),
    MUSCLE_GAIN("Build muscle mass through strength training and proper nutrition"),
    ENDURANCE("Improve stamina and cardiovascular endurance"),
    FLEXIBILITY("Enhance mobility and flexibility through stretching and yoga"),
    MAINTENANCE("Maintain current fitness level and overall health");

    private final String description;

    Goals(String description) {
        this.description = description;
    }


    public String getDescription() {
        return description;
    }
}

