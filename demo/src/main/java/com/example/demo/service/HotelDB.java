package com.example.demo.service;

import com.example.demo.dto.HotelDto;
import com.example.demo.model.Hotel;
import com.example.demo.model.Room;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HotelDB {

    List<HotelDto> getAllHotels();

    HotelDto getHotel(Integer hotelId);

    HotelDto addHotel(String name, List<Room> rooms);

}
