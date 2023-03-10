package com.airbnl.dbcontrollerservice.repositories;

import com.airbnl.dbcontrollerservice.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {
    @Override
    List<Room> findAll();

    List<Room> findAllByHotelId(long hotelId);

    List<Room> findAllByTypeId(long roomTypeId);
}
