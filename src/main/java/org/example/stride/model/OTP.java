package org.example.stride.model;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="otp")
public class OTP {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private transient UUID otpId;
    private String OTP;
    private String Email;
    private LocalDateTime Created;
}
