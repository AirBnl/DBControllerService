package com.airbnl.dbcontrollerservice.service.interfaces;


import com.airbnl.dbcontrollerservice.model.Room;

import java.util.List;

public interface IRoomService {
    List<Room> getRoomsByHotelId(long hotelId);

    List<Room> getRoomsByCountryAndRoomTypeIds(int countryId, int roomTypeId);
    public Room save(Room room);
    Room getById(long roomId);
}
