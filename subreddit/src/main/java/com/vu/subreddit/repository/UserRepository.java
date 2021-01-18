package com.vu.subreddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import com.vu.subreddit.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
