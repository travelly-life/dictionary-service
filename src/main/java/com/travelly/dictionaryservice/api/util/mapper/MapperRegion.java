package com.travelly.dictionaryservice.api.util.mapper;

import com.travelly.dictionaryservice.api.dto.RegionDto;
import com.travelly.dictionaryservice.entity.Region;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface MapperRegion {
    MapperRegion INSTANCE = Mappers.getMapper(MapperRegion.class);

    RegionDto toDto(Region regionEntity);
}
