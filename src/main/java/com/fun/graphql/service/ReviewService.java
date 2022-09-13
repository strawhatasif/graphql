package com.fun.graphql.service;

import com.fun.graphql.model.Review;
import com.fun.graphql.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public Review retrieveById(int id) {
        return reviewRepository.findById(id);
    }

    public List<Review> retrieveAllReviews() {
        return reviewRepository.findAll();
    }
}
