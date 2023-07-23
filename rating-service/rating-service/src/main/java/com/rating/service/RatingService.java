package com.rating.service;

import java.util.List;

import com.rating.entity.Rating;

public interface RatingService {

	// create

	public Rating createRating(Rating rating);

	// get All

	public List<Rating> getRatings();

	// get all by Id

	public List<Rating> getRatingByUserId(String userId);

	// get all by user

	public List<Rating> getRatingByHotelId(String hotelId);
}
