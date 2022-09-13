package com.fun.graphql.controller;

import com.fun.graphql.model.Review;
import com.fun.graphql.service.ReviewService;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    public Review retrieveById(int id) {
        return reviewService.retrieveById(id);
    }

    @SchemaMapping(typeName = "Query",value = "allReviews")
    public List<Review> retrieveAllReviews() {
        return reviewService.retrieveAllReviews();
    }
}
