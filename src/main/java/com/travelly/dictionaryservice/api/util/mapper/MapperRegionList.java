package com.travelly.dictionaryservice.api.util.mapper;

import com.travelly.dictionaryservice.api.dto.RegionDto;
import com.travelly.dictionaryservice.entity.Region;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapperRegionList {
    List<RegionDto> toListDto(List<Region> regionList);
}
