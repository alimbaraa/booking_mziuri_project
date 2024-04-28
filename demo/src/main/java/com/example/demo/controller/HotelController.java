package com.example.demo.controller;

import com.example.demo.dto.HotelDto;
import com.example.demo.request.AddHotelRequest;
import com.example.demo.service.DataManager;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    DataManager manager = new DataManager();

    @GetMapping("/")
    public ModelAndView homePage(){
        return new ModelAndView("forward:/index.html");
    }

    @ResponseBody
    @GetMapping("/all")
    public List<HotelDto> getEveryHotel(){
        return manager.getAllHotels();
    }

    @ResponseBody
    @GetMapping("/{id}")
    public HotelDto getHotel(@PathVariable("id") Integer hotelId){
        return manager.getHotel(hotelId);
    }

    @ResponseBody
    @PostMapping("/add")
    public HotelDto addHotel(@RequestBody AddHotelRequest request){
        return manager.addHotel(request.getName(), request.getRooms());
    }

}
