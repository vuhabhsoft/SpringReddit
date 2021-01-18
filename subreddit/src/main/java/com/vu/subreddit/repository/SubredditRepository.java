package com.vu.subreddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import com.vu.subreddit.model.Subreddit;

public interface SubredditRepository extends JpaRepository<Subreddit, Long> {
    Optional<Subreddit> findByName(String subredditName);
}
