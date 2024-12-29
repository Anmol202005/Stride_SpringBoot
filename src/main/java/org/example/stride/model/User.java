package org.example.stride.model;


import java.util.Collection;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.stride.model.Enum.Achievements;
import org.example.stride.model.Enum.ActivityLevel;
import org.example.stride.model.Enum.Gender;
import org.example.stride.model.Enum.Goals;
import org.example.stride.model.Enum.WorkoutPreference;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private transient UUID userId;
    private String UserName ;
//    private String LastName;
    private String email;
    private String password;
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

      @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("USER"));
    }


    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;  // Assuming email is the username
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}


