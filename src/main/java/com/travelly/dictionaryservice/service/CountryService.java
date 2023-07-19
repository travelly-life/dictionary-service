package com.travelly.dictionaryservice.service;

import com.travelly.dictionaryservice.entity.Country;
import com.travelly.dictionaryservice.repository.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CountryService {
    private final CountryRepository countryRepository;

    public List<Country> getAllCountries(){
        return countryRepository.findAll();
    }

}
