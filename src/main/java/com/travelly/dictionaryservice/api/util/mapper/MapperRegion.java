package com.travelly.dictionaryservice.api.util.mapper;

import com.travelly.dictionaryservice.api.dto.RegionDto;
import com.travelly.dictionaryservice.entity.Region;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperRegion {
    RegionDto toDto(Region regionEntity);
}
