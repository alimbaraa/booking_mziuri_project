package com.example.demo.service;

import com.example.demo.model.Room;

import java.util.List;

public interface RoomDB {

    List<Room> getAllRooms(Integer hotelId);

    Room getRoom(Integer hotelId, Integer roomId);

    Room reserveRoom(Integer hotelId, Integer roomId);

    Room cancelReservation(Integer hotelId, Integer roomId);
}
