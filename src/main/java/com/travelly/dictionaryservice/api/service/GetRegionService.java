package com.travelly.dictionaryservice.api.service;

import com.travelly.dictionaryservice.api.dto.RegionDto;
import com.travelly.dictionaryservice.api.repository.RegionRepos;
import com.travelly.dictionaryservice.api.util.mapper.MapperRegion;
import com.travelly.dictionaryservice.entity.Region;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class GetRegionService {

    private final RegionRepos regionRepos;
    private final MapperRegion mapperRegion;

    @Transactional
    public List<RegionDto> getRegions(Long countryId) {
        final List<Region> regionsEntity = regionRepos.findAllByCountryId(countryId);
        log.info("regionsEntity value is: {}", regionsEntity);
        return toListDto(regionsEntity);
    }

    public List<RegionDto> toListDto(List<Region> regionList) {
        final List<RegionDto> resListDto = new ArrayList<>();
        regionList.forEach(region -> {
            final RegionDto regionDto = mapperRegion.toDto(region);
            log.info("regionDto value is: {}", regionDto);
            resListDto.add(regionDto);
        });
        log.info("resListDto value is: {}", resListDto);
        return resListDto;
    }
}