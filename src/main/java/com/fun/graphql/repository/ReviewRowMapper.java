package com.fun.graphql.repository;

import com.fun.graphql.model.Review;
import com.fun.graphql.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ReviewRowMapper implements RowMapper<Review> {
    @Override
    public Review mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Review(
                rs.getString("review_id"),
                rs.getString("user_id"),
                rs.getString("title"),
                rs.getString("description"),
                rs.getInt("rating"),
                new User(
                        rs.getString("user_id"),
                        rs.getString("user_name"),
                        rs.getString("first_name")));
    }
}
