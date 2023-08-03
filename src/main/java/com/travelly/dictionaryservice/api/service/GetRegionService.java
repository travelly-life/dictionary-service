package com.travelly.dictionaryservice.api.service;

import com.travelly.dictionaryservice.api.dto.RegionDto;
import com.travelly.dictionaryservice.api.repository.RegionRepos;
import com.travelly.dictionaryservice.api.util.mapper.MapperRegion;
import com.travelly.dictionaryservice.api.util.mapper.MapperRegionList;
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
public class GetRegionService implements MapperRegion, MapperRegionList {
//    private final RegionMapper regionMapper;
    private final RegionRepos regionRepos;
    private final List<RegionDto> resListDto = new ArrayList<>();


    @Transactional
    public List<RegionDto> getRegions(Long countryId) {

        final List<Region> regionsEntity = regionRepos.findAllByCountryId(countryId);
        log.info("regionsEntity value is: {}", regionsEntity );
        final List<RegionDto> regionsDto = toListDto(regionsEntity);
        log.info("regionsDto value is: {}", regionsDto );
//        log.info("List of regions was found and convert to DTO");
        return regionsDto;
    }

    @Override
    public RegionDto toDto(Region regionEntity) {
        RegionDto regionDto = new RegionDto();
        return regionDto;
    }

    @Override
    public List<RegionDto> toListDto(List<Region> regionList) {
        for (final Region regionOneList : regionList) {
            resListDto.add(toDto(regionOneList));
        }
        return resListDto;
    }
}