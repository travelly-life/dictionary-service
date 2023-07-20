package com.travelly.dictionaryservice.api.controller;

import com.travelly.dictionaryservice.api.dto.CountryResponseDto;
import com.travelly.dictionaryservice.api.resource.CountryResource;
import com.travelly.dictionaryservice.service.CountryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("dictionary/country")
public class CountryRestController implements CountryResource {

    private final CountryService countryService;

    @Autowired
    public CountryRestController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/")
    @Override
    public List<CountryResponseDto> getAllCountries() {
        log.info("get all countries");
        return countryService.getAllCountriesDto(countryService.getAllCountries());
    }
}
