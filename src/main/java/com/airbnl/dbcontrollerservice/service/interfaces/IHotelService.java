package com.airbnl.dbcontrollerservice.service.interfaces;


import com.airbnl.dbcontrollerservice.model.Hotel;

import java.util.List;

public interface IHotelService {
    List<Hotel> getAllHotels();

    List<Hotel> getAllHotelsBasedOnTheCountry(long countryId);

    List<Hotel> getAllHotelsByManagerId(long managerId);
    Hotel save(Hotel hotel);
    Hotel getHotelByHotelIdAndManagerId(int hotelId, int managerId);
    Hotel update(Hotel hotel);
    Hotel deleteByIdAndManagerID(int hotelId, int managerId);

}
