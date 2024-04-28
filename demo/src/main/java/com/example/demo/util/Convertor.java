package com.example.demo.util;

import com.example.demo.dto.HotelDto;
import com.example.demo.model.Hotel;

public class Convertor {
    public HotelDto convertHotel(Hotel hotel){
        return HotelDto.builder()
                .name(hotel.getName())
                .rooms(hotel.getRooms())
                .build();
    }
}
