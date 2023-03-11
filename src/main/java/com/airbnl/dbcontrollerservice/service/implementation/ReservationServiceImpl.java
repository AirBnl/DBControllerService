package com.airbnl.dbcontrollerservice.service.implementation;

import com.airbnl.dbcontrollerservice.model.Reservation;
import com.airbnl.dbcontrollerservice.repositories.ReservationRepository;
import com.airbnl.dbcontrollerservice.service.interfaces.IReservationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements IReservationService {
    private final ReservationRepository reservationRepository;

    public ReservationServiceImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public List<Reservation> getRoomReservationsByUserId(long userId) {
        return reservationRepository.findAllByUserId(userId);
    }

    @Override
    public Reservation makeReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }


    @Override
    public List<Reservation> getAllByHotelAndManagerId(long hotelId, long managerId) {
        return null;
    }

    @Override
    public Reservation getByReservationIdAndManagerId(long reservationId, long managerId) {
        return reservationRepository.getReservationById(reservationId);
    }
}
