package com.kov.testing.service;

import com.kov.testing.model.User;
import com.kov.testing.repo.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {

    private UserRepository userRepository;


    public Optional<User> findByEmail(String email) {
            if (email == null || email.isEmpty()) {
                return Optional.empty();
            }
            return userRepository.findByMail(email);
    }

}
