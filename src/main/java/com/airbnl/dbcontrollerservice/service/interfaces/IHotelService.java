package com.airbnl.dbcontrollerservice.service.interfaces;


import com.airbnl.dbcontrollerservice.model.Hotel;

import java.util.List;

public interface IHotelService {
    List<Hotel> getAllHotels();

    List<Hotel> getAllHotelsBasedOnTheCountry(long countryId);
}
