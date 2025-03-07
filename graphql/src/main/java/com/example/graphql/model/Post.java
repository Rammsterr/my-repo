package com.example.graphql.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Post {
    @Id
    private String id;
    private String title;
    private String content;
    private String authorId;
}
