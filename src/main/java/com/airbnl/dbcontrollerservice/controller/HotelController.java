package com.airbnl.dbcontrollerservice.controller;

import com.airbnl.dbcontrollerservice.model.Hotel;
import com.airbnl.dbcontrollerservice.service.interfaces.IHotelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {
    private final IHotelService hotelService;

    public HotelController(IHotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/getAllHotels")
    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }

    @GetMapping("/getAllHotelsBasedOnTheCountry")
    public List<Hotel> getAllHotelsBasedOnTheCountry(@RequestParam("countryId") long countryId) {
        return hotelService.getAllHotelsBasedOnTheCountry(countryId);
    }

    @PostMapping("/save")
    public Hotel save(@RequestBody Hotel hotel) {
        return hotelService.save(hotel);
    }

    @GetMapping("/ByManagerID")
    public List<Hotel> getAllByManagerID(@RequestParam("managerId") int managerId) {
        return hotelService.getAllHotelsByManagerId(managerId);
    }

    @GetMapping("/byHotelIdAndManagerID")
    public Hotel getByHotelIdAndManagerId(@RequestParam("hotelId") int hotelId, @RequestParam("managerId") int managerId) {
        return hotelService.getHotelByHotelIdAndManagerId(hotelId, managerId);
    }

    @PutMapping("/update")
    public Hotel update(@RequestBody Hotel hotel) {
        return hotelService.update(hotel);
    }

    @DeleteMapping("/delete")
    public Hotel deleteByIdAndManagerID(@RequestParam("hotelId") int hotelId, @RequestParam("managerId") int managerId) {
        return hotelService.deleteByIdAndManagerID(hotelId, managerId);
    }
}
