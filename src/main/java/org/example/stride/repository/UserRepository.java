package org.example.stride.repository;

import java.util.Optional;
import java.util.UUID;

import org.example.stride.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, UUID>{
    public Optional<User> findByEmail(String email);

}
