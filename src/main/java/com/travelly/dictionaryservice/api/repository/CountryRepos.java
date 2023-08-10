package com.travelly.dictionaryservice.api.repository;

import com.travelly.dictionaryservice.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepos extends JpaRepository<Country, Long> {
    boolean existsById(Long id);

}
