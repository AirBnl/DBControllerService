package com.airbnl.dbcontrollerservice.service.interfaces;


import com.airbnl.dbcontrollerservice.model.Reservation;

import java.util.List;

public interface IReservationService {

    List<Reservation> getRoomReservationsByUserId(long userId);

    Reservation makeReservation(Reservation reservation);
}
