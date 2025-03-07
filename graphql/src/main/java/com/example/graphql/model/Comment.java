package com.example.graphql.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Comment {
    @Id
    private String id;
    private String text;
    private String authorId;
    private String postId;
}
