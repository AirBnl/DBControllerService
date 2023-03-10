package com.airbnl.dbcontrollerservice.service.implementation;

import com.airbnl.dbcontrollerservice.model.Country;
import com.airbnl.dbcontrollerservice.model.Hotel;
import com.airbnl.dbcontrollerservice.repositories.HotelRepository;
import com.airbnl.dbcontrollerservice.service.interfaces.IHotelService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements IHotelService {
    private final HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public List<Hotel> getAllHotelsBasedOnTheCountry(long countryId) {
        return hotelRepository.getHotelByCountryId(countryId);
    }
}
