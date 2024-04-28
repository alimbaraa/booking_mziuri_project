package com.example.demo.dto;

import com.example.demo.model.Room;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Builder
@Data
@EqualsAndHashCode
@ToString
public class HotelDto {
    private final String name;
    private final List<Room> rooms;
}
