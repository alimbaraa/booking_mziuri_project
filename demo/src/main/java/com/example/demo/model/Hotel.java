package com.example.demo.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Data
@EqualsAndHashCode
@ToString
public class Hotel {
    private final Integer id;
    private final String name;
    private final List<Room> rooms;
}
