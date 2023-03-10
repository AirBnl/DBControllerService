package com.airbnl.dbcontrollerservice.controller;

import com.airbnl.dbcontrollerservice.model.Country;
import com.airbnl.dbcontrollerservice.service.interfaces.ICountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("country")
public class CountryController {
    private final ICountryService countryService;

    public CountryController(ICountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/getAllCountries")
    List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }
}
