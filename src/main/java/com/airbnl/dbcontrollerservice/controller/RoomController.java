package com.airbnl.dbcontrollerservice.controller;

import com.airbnl.dbcontrollerservice.model.Room;
import com.airbnl.dbcontrollerservice.service.interfaces.IRoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {
    private final IRoomService roomService;

    public RoomController(IRoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/getRoomsByHotelId")
    List<Room> getRoomsByHotelId(@RequestParam("hotelId") long hotelId) {
        return roomService.getRoomsByHotelId(hotelId);
    }

    @GetMapping("/getRoomsByCountryAndRoomTypeIds")
    List<Room> getRoomsByCountryAndRoomTypeIds(@RequestParam("countryId") int countryId, @RequestParam("roomTypeId") int roomTypeId) {
        return roomService.getRoomsByCountryAndRoomTypeIds(countryId, roomTypeId);
    }
}
