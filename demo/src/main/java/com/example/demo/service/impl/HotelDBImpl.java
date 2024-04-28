package com.example.demo.service.impl;

import com.example.demo.dto.HotelDto;
import com.example.demo.model.Hotel;
import com.example.demo.model.Room;
import com.example.demo.util.Convertor;
import com.example.demo.service.HotelDB;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class HotelDBImpl implements HotelDB {
    protected final Convertor convertor = new Convertor();
    protected Map<Integer, Hotel> hotelMap;
    Integer lastId = 0;

    public HotelDBImpl() {
        this.hotelMap = new HashMap<>();
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(0, false));
        rooms.add(new Room(1, false));
        hotelMap.put(0, new Hotel(0, "WereHotel", rooms));
    }

    @Override
    public List<HotelDto> getAllHotels() {
        return hotelMap.values().stream().map(convertor::convertHotel).toList();
    }

    @Override
    public HotelDto getHotel(Integer hotelId) {
        return convertor.convertHotel(hotelMap.get(hotelId));
    }

    @Override
    public HotelDto addHotel(String name, List<Room> rooms) {
        Hotel hotel = new Hotel(lastId++, name, rooms);
        hotelMap.put(hotel.getId(), hotel);
        return convertor.convertHotel(hotelMap.get(hotel.getId()));
    }
}
