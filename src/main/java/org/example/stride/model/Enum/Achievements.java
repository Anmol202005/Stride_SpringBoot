package org.example.stride.model.Enum;

public enum Achievements {
    // Beginner Achievements
    FIRST_WORKOUT("Completed your first workout!"),
    FIVE_WORKOUTS("Completed 5 workouts!"),
    TEN_WORKOUTS("Completed 10 workouts!"),
    FIRST_GOAL_MET("Achieved your first fitness goal!"),

    // Consistency and Streaks
    CONSISTENCY_CHAMP("Worked out for 7 consecutive days!"),
    CONSISTENCY_MASTER("Worked out for 30 consecutive days!"),
    MONTHLY_FITNESS_CHAMP("Logged workouts consistently for a month!"),
    YEARLY_FITNESS_CHAMP("Logged workouts consistently for a year!"),

    // Step Goals
    STEP_MASTER("Achieved 10,000 steps in a day!"),
    STEP_PRO("Achieved 50,000 steps in a week!"),
    STEP_LEGEND("Achieved 500,000 steps in a month!"),

    // Calorie Milestones
    CALORIE_BURNER("Burned 1,000 calories!"),
    CALORIE_WARRIOR("Burned 10,000 calories!"),
    CALORIE_LEGEND("Burned 100,000 calories!"),

    // Weight Management
    WEIGHT_LOSS_GOAL("Achieved your weight loss goal!"),
    MUSCLE_GAIN_GOAL("Achieved your muscle gain goal!"),
    BODY_COMPOSITION_GOAL("Improved your body fat percentage significantly!"),

    // Workout-Specific Achievements
    YOGA_BEGINNER("Completed 10 yoga sessions!"),
    CARDIO_KING("Logged 100 km of running, walking, or cycling!"),
    STRENGTH_TRAINER("Lifted a total of 10,000 kg in strength training!"),
    HIIT_HERO("Completed 50 HIIT sessions!"),
    ENDURANCE_CHAMP("Completed a marathon or equivalent endurance event!"),

    // Water Intake Goals
    HYDRATION_CHAMP("Met your water intake goal for 7 days!"),
    WATER_WARRIOR("Met your water intake goal for a month!"),
    WATER_LEGEND("Met your water intake goal for a year!"),

    // Diet and Nutrition
    HEALTHY_EATER("Logged your meals for 7 days!"),
    DIET_MASTER("Maintained a balanced diet for a month!"),
    MACRO_TRACKER("Successfully tracked your macros for a week!");


    private final String description;

    Achievements(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
