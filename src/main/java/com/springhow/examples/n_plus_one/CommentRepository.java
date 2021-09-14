package com.springhow.examples.n_plus_one;

import com.springhow.examples.n_plus_one.entites.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

    @Query("select c from Comment c join fetch c.post")
    List<Comment> findAll();

}
