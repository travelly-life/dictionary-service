package com.travelly.dictionaryservice.api.service;

import com.travelly.dictionaryservice.api.dto.RegionDto;
import com.travelly.dictionaryservice.api.repository.RegionRepos;
import com.travelly.dictionaryservice.api.util.RegionMapper;
import com.travelly.dictionaryservice.entity.Region;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class GetRegionService {
    private final RegionMapper regionMapper;
    private final RegionRepos regionRepos;

    @Transactional
    public List<RegionDto> getRegions(Long countryId) {
        final List<Region> regionsEntity = regionRepos.findAllByCountryId(countryId);
        final List<RegionDto> regionsDto = regionMapper.convertListToDto(regionsEntity);
        return regionsDto;
    }
}