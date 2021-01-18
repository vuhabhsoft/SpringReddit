package com.vu.subreddit.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.vu.subreddit.model.Post;
import com.vu.subreddit.model.Subreddit;
import com.vu.subreddit.model.User;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}