package com.travelly.dictionaryservice.api.repository;

import com.travelly.dictionaryservice.entity.Region;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionRepos extends JpaRepository<Region, Long> {
    List<Region> findAllByCountryId(Long countryId);
}
