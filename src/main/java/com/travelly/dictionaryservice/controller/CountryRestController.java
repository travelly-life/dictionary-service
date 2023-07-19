package com.travelly.dictionaryservice.controller;

import com.travelly.dictionaryservice.api.dto.CountryResponseDto;
import com.travelly.dictionaryservice.api.resource.CountryResource;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@AllArgsConstructor
@RestController
@RequestMapping("dictionary/country")
public class CountryRestController implements CountryResource {

    @GetMapping("/")
    @Override
    public CountryResponseDto getAllCountries() {

        return null;
    }
}
