package com.airbnl.dbcontrollerservice.service.implementation;

import com.airbnl.dbcontrollerservice.model.Room;
import com.airbnl.dbcontrollerservice.repositories.RoomRepository;
import com.airbnl.dbcontrollerservice.service.interfaces.IRoomService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements IRoomService {
    private final RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public List<Room> getRoomsByHotelId(long hotelId) {
        return roomRepository.findAllByHotelId(hotelId);
    }

    @Override
    public List<Room> getRoomsByCountryAndRoomTypeIds(int countryId, int roomTypeId) {
        return roomRepository.findAllByTypeId(roomTypeId);
    }
}
