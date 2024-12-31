package org.example.stride.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.stride.model.Enum.Achievements;
import org.example.stride.model.Enum.ActivityLevel;
import org.example.stride.model.Enum.Gender;
import org.example.stride.model.Enum.Goals;
import org.example.stride.model.Enum.WorkoutPreference;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class UserDetails {
    private String Username ;
    private String email;
    private Gender gender;
     private Integer age;
    private Integer height;
    private Integer weight;
    private Goals goals;
    private Integer BMI;
    private Integer calorieGoal;
    private Integer StepsGoal;
    private Integer waterIntakeGoal;
    private Achievements achievements;
    private WorkoutPreference workoutPreference;
    private ActivityLevel activityLevel;
    private Boolean changePassword;
}
