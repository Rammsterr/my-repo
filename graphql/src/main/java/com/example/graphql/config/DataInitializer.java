package com.example.graphql.config;

import com.example.graphql.model.Comment;
import com.example.graphql.model.Post;
import com.example.graphql.model.blogUser;
import com.example.graphql.repository.CommentRepository;
import com.example.graphql.repository.PostRepository;
import com.example.graphql.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final UserRepository userRepository;
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    public DataInitializer(UserRepository userRepository, PostRepository postRepository, CommentRepository commentRepository){
        this.userRepository = userRepository;
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    @Override
    public void run(String... args) {
        blogUser blogUser1 = new blogUser();
        blogUser1.setId("user1");
        blogUser1.setName("Erik Eriksson");
        blogUser1.setEmail("erik.eriksson@example.com");
        userRepository.save(blogUser1);

        blogUser blogUser2 = new blogUser();
        blogUser2.setId("user2");
        blogUser2.setName("Anna Andersson");
        blogUser2.setEmail("a.andersson@example.com");
        userRepository.save(blogUser2);

        Post post1 = new Post();
        post1.setId("post1");
        post1.setTitle("Min första GraphQL-post");
        post1.setContent("Här är innehållet i min post");
        post1.setAuthorId(blogUser1.getId());
        postRepository.save(post1);

        Post post2 = new Post();
        post2.setId("post2");
        post2.setTitle("GraphQL är svårt men intressant");
        post2.setContent("GraphQL är väldigt nytt för mig!");
        post2.setAuthorId(blogUser2.getId());
        postRepository.save(post2);

        Comment comment1 = new Comment();
        comment1.setId("comment1");
        comment1.setText("Bra inlägg!");
        comment1.setAuthorId(blogUser2.getId());
        comment1.setPostId(post1.getId());
        commentRepository.save(comment1);

        Comment comment2 = new Comment();
        comment2.setId("comment2");
        comment2.setText("Jag håller med!");
        comment2.setAuthorId(blogUser1.getId());
        comment2.setPostId(post2.getId());
        commentRepository.save(comment2);
    }
}
