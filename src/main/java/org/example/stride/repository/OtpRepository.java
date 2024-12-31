package org.example.stride.repository;

import java.util.UUID;

import org.example.stride.model.OTP;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OtpRepository extends JpaRepository<OTP, UUID> {
 Boolean existsByEmailAndOtp(String email, String otp);
 OTP findByEmail(String email);
}
