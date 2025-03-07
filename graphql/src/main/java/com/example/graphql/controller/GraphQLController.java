package com.example.graphql.controller;

import com.example.graphql.model.Comment;
import com.example.graphql.model.Post;
import com.example.graphql.model.blogUser;
import com.example.graphql.repository.CommentRepository;
import com.example.graphql.repository.PostRepository;
import com.example.graphql.repository.UserRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GraphQLController {

    private final UserRepository userRepository;
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    public GraphQLController(UserRepository userRepository, PostRepository postRepository, CommentRepository commentRepository) {
        this.userRepository = userRepository;
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }
    @QueryMapping
    public List<Post> posts(){
        return postRepository.findAll();
    }
    @QueryMapping
    public Post post (@Argument String id) {
        return postRepository.findById(id).orElse(null);
    }
    @SchemaMapping(typeName = "Post", field = "author")
    public blogUser author(Post post) {
        return userRepository.findById(post.getAuthorId()).orElse(null);
    }
    @SchemaMapping(typeName = "Post", field = "comments")
    public List<Comment> comments(Post post) {
        return commentRepository.findByPostId(post.getId());
    }
    @SchemaMapping(typeName = "Comment", field = "author")
    public blogUser commentAuthor(Comment comment) {
        return userRepository.findById(comment.getAuthorId()).orElse(null);
    }



}
