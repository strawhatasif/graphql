package com.fun.graphql.repository;

import com.fun.graphql.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReviewRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    String query = "select * from reviews where review_id=?";
    String retrieveAllQuery = "select * from reviews";

    public Review findById(int id) {
        return jdbcTemplate.queryForObject(query, new ReviewRowMapper(), id);
    }

    public List<Review> findAll() {
        return jdbcTemplate.query(retrieveAllQuery, new ReviewRowMapper());
    }
}
