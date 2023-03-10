package com.airbnl.dbcontrollerservice.controller;

import com.airbnl.dbcontrollerservice.model.Hotel;
import com.airbnl.dbcontrollerservice.service.interfaces.IHotelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {
    private final IHotelService hotelService;

    public HotelController(IHotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/getAllHotels")
    List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }

    @GetMapping("/getAllHotelsBasedOnTheCountry")
    List<Hotel> getAllHotelsBasedOnTheCountry(@RequestParam("countryId") long countryId) {
        return hotelService.getAllHotelsBasedOnTheCountry(countryId);
    }
}
