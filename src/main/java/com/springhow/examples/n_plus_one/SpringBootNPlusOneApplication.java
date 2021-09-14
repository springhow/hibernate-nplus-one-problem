package com.springhow.examples.n_plus_one;

import com.springhow.examples.n_plus_one.entites.Comment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringBootNPlusOneApplication implements CommandLineRunner {
    public static final Logger logger = LoggerFactory.getLogger(SpringBootNPlusOneApplication.class);

    @Autowired
    CommentRepository commentRepository;


    public static void main(String[] args) {
        SpringApplication.run(SpringBootNPlusOneApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Finding all comment objects");
        List<Comment> comments = commentRepository.findAll();
        for (Comment comment : comments) {
            logger.info("Comment [{}] from Post [{}]",comment.getContent(), comment.getPost().getTitle());
        }

    }
}
