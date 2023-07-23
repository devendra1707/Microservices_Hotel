package com.hotel.service;

import java.util.List;

import com.hotel.entity.Hotel;

public interface HotelService {

	// create

	Hotel create(Hotel hotel);

	// getAll

	List<Hotel> getAll();

	// get Single
	Hotel getHotel(String Id);

}
