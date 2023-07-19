package com.travelly.dictionaryservice.api.config;

import com.travelly.dictionaryservice.api.dto.CountryResponseDto;
import com.travelly.dictionaryservice.entity.Country;

public class CountryMapper {
    public CountryResponseDto convertToCountryResponseDto(Country country) {
        return new CountryResponseDto(country.getId(), country.getName());
    }
}
