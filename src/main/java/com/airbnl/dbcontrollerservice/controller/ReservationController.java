package com.airbnl.dbcontrollerservice.controller;

import com.airbnl.dbcontrollerservice.model.Reservation;
import com.airbnl.dbcontrollerservice.service.interfaces.IReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Reservation")
public class ReservationController {
    private final IReservationService reservationService;

    public ReservationController(IReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/getRoomReservationsByUserId")
    public List<Reservation> getRoomReservationsByUserId(@RequestParam("userId") long userId) {
        return reservationService.getRoomReservationsByUserId(userId);
    }

    @PostMapping("/save")
    public Reservation makeReservation(@RequestBody Reservation reservation) {
        return reservationService.makeReservation(reservation);
    }


    @GetMapping("/byHotelIdAndManagerID")
    public List<Reservation> getAllByHotelAndManagerId(@RequestParam("hotelId") int hotelId, @RequestParam("managerId") int managerId) {
        return reservationService.getAllByHotelAndManagerId(hotelId, managerId);
    }

    @GetMapping("/reservationIdAndManagerId")
    public Reservation getByReservationIdAndManagerId(@RequestParam("reservationId") int reservationId, @RequestParam("managerId") int managerId) {
        return reservationService.getByReservationIdAndManagerId(reservationId, managerId);
    }
}
