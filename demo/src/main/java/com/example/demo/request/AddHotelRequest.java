package com.example.demo.request;

import com.example.demo.model.Room;
import lombok.Data;

import java.util.List;

@Data
public class AddHotelRequest {
    private final String name;
    private final List<Room> rooms;
}
