package com.fun.graphql.model;
public record Review (String reviewID, String userID, String title, String description, int rating, User user) { }
