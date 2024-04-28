package com.example.demo.service.impl;

import com.example.demo.model.Room;
import com.example.demo.service.RoomDB;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RoomDBImpl extends HotelDBImpl implements RoomDB{

    public RoomDBImpl(){
        hotelMap = super.getHotelMap();
    }

    @Override
    public List<Room> getAllRooms(Integer hotelId) {
        return hotelMap.get(hotelId).getRooms();
    }
    @Override
    public Room getRoom(Integer hotelId, Integer roomId) {
        return hotelMap.get(hotelId).getRooms().get(roomId);
    }

    @Override
    public Room reserveRoom(Integer hotelId, Integer roomId) {
        hotelMap.get(hotelId).getRooms().get(roomId).setReserved(true);
        return hotelMap.get(hotelId).getRooms().get(roomId);
    }

    @Override
    public Room cancelReservation(Integer hotelId, Integer roomId) {
        hotelMap.get(hotelId).getRooms().get(roomId).setReserved(false);
        return hotelMap.get(hotelId).getRooms().get(roomId);
    }
}
