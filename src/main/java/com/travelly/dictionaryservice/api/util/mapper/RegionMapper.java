//package com.travelly.dictionaryservice.api.util.mapper;
//
//import com.travelly.dictionaryservice.api.dto.RegionDto;
//import com.travelly.dictionaryservice.entity.Region;
//import org.modelmapper.ModelMapper;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class RegionMapper {
//
//    private final ModelMapper modelMapper = new ModelMapper();
//
//    public RegionDto convertToDto(Region regionEntity) {
//        return modelMapper.map(regionEntity, RegionDto.class);
//    }
//
//    public List<RegionDto> convertListToDto(List<Region> regionList) {
//        final List<RegionDto> resListDto = new ArrayList<>();
//        for (final Region regionOneList : regionList) {
//            resListDto.add(convertToDto(regionOneList));
//        }
//        return resListDto;
//    }
//}