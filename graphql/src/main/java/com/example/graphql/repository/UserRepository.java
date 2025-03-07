package com.example.graphql.repository;

import com.example.graphql.model.blogUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<blogUser, String> {

}
