package com.example.demo.response;

import com.example.demo.model.Room;
import lombok.Data;

import java.util.List;

@Data
public class GetHotelResponse {
    private final String name;
    private final List<Room> rooms;
}
