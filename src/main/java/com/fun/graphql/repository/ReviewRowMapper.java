package com.fun.graphql.repository;

import com.fun.graphql.model.Review;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ReviewRowMapper implements RowMapper<Review> {
    @Override
    public Review mapRow(ResultSet rs, int rowNum) throws SQLException {
        var review = new Review();
        review.setReviewID(rs.getString("review_id"));
        review.setUserID(rs.getString("user_id"));
        review.setTitle( rs.getString("title"));
        review.setDescription(rs.getString("description"));
        review.setRating(rs.getInt("rating"));

        return review;
    }
}
