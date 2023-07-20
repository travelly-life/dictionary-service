package com.travelly.dictionaryservice.service;

import com.travelly.dictionaryservice.api.config.CountryMapper;
import com.travelly.dictionaryservice.api.dto.CountryResponseDto;
import com.travelly.dictionaryservice.entity.Country;
import com.travelly.dictionaryservice.repository.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class CountryService {
    private final CountryRepository countryRepository;
    private final CountryMapper countryMapper;

    public List<Country> getAllCountries(){
        return countryRepository.findAll();
    }

    public List<CountryResponseDto> getAllCountriesDto(List<Country> countries){
        List<CountryResponseDto> countryResponseDtos= new ArrayList<>();
        for (Country country : countries) {
            countryResponseDtos.add(countryMapper.convertToCountryResponseDto(country));
        }
        return countryResponseDtos;
    }

}
