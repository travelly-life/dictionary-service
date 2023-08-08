package com.travelly.dictionaryservice.controller;

import com.travelly.dictionaryservice.api.dto.CountryResponseDto;
import com.travelly.dictionaryservice.api.resources.CountryResource;
import com.travelly.dictionaryservice.service.CountryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

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

    @GetMapping("")
    @Override
    public ResponseEntity<List<CountryResponseDto>> getAllCountries() {
        final List<CountryResponseDto> countryResponseDtos = countryService.getAllCountriesDto(countryService.getAllCountries());
        if (!countryResponseDtos.isEmpty()) {
            log.info("get all countries");
            return ResponseEntity.ok(countryResponseDtos);
        } else {
            log.info("There are no countries");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
