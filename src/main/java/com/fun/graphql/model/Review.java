package com.fun.graphql.model;

import lombok.Data;

@Data
public class Review {
    public String reviewID;
    public String userID;
    public String title;
    public String description;
    public int rating;
}
