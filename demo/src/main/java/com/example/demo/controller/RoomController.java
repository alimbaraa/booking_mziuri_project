package com.example.demo.controller;

import com.example.demo.model.Room;
import com.example.demo.service.DataManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {
    DataManager manager = new DataManager();

    @ResponseBody
    @GetMapping("/{id}")
    public List<Room> getEveryRoom(@PathVariable("id") Integer hotelId){
        return manager.getAllRooms(hotelId);
    }

    @ResponseBody
    @GetMapping
    public Room getRoom(@RequestParam("hotelId") Integer hotelId, @RequestParam("roomId") Integer roomId){
        return manager.getRoom(hotelId, roomId);
    }


    @ResponseBody
    @PutMapping("/reserve")
    public Room reserveRoom(@RequestParam("hotelId") Integer hotelId, @RequestParam("roomId") Integer roomId){
        return manager.reserveRoom(hotelId, roomId);
    }

    @ResponseBody
    @PutMapping("/cancel")
    public Room cancelReservation(@RequestParam("hotelId") Integer hotelId, @RequestParam("roomId") Integer roomId){
        return manager.cancelReservation(hotelId, roomId);
    }
}
