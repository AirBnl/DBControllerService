package com.airbnl.dbcontrollerservice.repositories;

import com.airbnl.dbcontrollerservice.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    List<Reservation> findAllByUserId(long userId);
}
