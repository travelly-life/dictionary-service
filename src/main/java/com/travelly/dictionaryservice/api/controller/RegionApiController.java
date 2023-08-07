package com.travelly.dictionaryservice.api.controller;

import com.travelly.dictionaryservice.api.dto.RegionDto;
import com.travelly.dictionaryservice.api.repository.CountryRepos;
import com.travelly.dictionaryservice.api.resource.GetListOfRegions;
import com.travelly.dictionaryservice.api.service.GetRegionService;
import com.travelly.dictionaryservice.api.util.UrlConstants;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping(UrlConstants.DICT_BASE_URL)
public class RegionApiController implements GetListOfRegions {

    private final CountryRepos countryRepos;
    private final GetRegionService getRegionService;

    @Override
    public ResponseEntity getRegions(Long countryId) {
        if (countryRepos.existsById(countryId)) {
            final List<RegionDto> listOfDto = getRegionService.getRegions(countryId);
            log.info("Correct request");
            return ResponseEntity.ok(listOfDto);
        } else {
            log.info("You enter bad id");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "You enter bad id");
        }
    }
}

