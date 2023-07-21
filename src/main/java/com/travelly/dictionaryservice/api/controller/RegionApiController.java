package com.travelly.dictionaryservice.api.controller;

import com.travelly.dictionaryservice.api.dto.RegionDto;
import com.travelly.dictionaryservice.api.resourse.GetListOfRegions;
import com.travelly.dictionaryservice.api.service.GetRegionService;
import com.travelly.dictionaryservice.api.util.UrlConstants;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping(UrlConstants.DIC_SERV_URL)
public class RegionApiController implements GetListOfRegions {

    private final GetRegionService getRegionService;

    @Override
    public ResponseEntity<?> getRegions(@PathVariable Long countryId) {
        List<RegionDto> listOfDto = getRegionService.getRegions(countryId);

        return ResponseEntity.ok(listOfDto);
    }
}
