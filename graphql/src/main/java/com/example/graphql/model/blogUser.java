package com.example.graphql.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class blogUser {
    @Id
    private String id;
    private String name;
    private String email;
}
