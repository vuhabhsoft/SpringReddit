package com.vu.subreddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.vu.subreddit.model.Comment;
import com.vu.subreddit.model.Post;
import com.vu.subreddit.model.User;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
