package com.fun.graphql.repository;

import com.fun.graphql.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    final String query = "select * from users";

    public List<User> retrieveAllUsers() {
        return jdbcTemplate.query(query, new UserRowMapper());
    }
}
