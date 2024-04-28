package com.example.demo.service;

import com.example.demo.dto.HotelDto;
import com.example.demo.model.Room;
import com.example.demo.service.impl.RoomDBImpl;

import java.util.List;


public class DataManager extends RoomDBImpl {//used not to have direct connection between db manager and controller

    @Override
    public List<HotelDto> getAllHotels() {
        return super.getAllHotels();
    }

    @Override
    public HotelDto getHotel(Integer hotelId) {
        return super.getHotel(hotelId);
    }

    @Override
    public HotelDto addHotel(String name, List<Room> rooms) {
        return super.addHotel(name, rooms);
    }

    @Override
    public List<Room> getAllRooms(Integer hotelId) {
        return super.getAllRooms(hotelId);
    }

    @Override
    public Room getRoom(Integer hotelId, Integer roomId) {
        return super.getRoom(hotelId, roomId);
    }

    @Override
    public Room reserveRoom(Integer hotelId, Integer roomId) {
        return super.reserveRoom(hotelId, roomId);
    }

    @Override
    public Room cancelReservation(Integer hotelId, Integer roomId) {
        return super.cancelReservation(hotelId, roomId);
    }
}
