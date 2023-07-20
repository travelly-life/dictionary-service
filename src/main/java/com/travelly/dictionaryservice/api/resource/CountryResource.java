package com.travelly.dictionaryservice.api.resource;

import com.travelly.dictionaryservice.api.dto.CountryResponseDto;
import com.travelly.dictionaryservice.api.dto.ExampleDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

@Tags(value = {
        @Tag(name = "Ресурс для стран",
                description = "Описание ресурса для стран")})

public interface CountryResource {
    @Operation(summary = "Получение списка стран")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Страны найдены",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = CountryResponseDto.class))
                    }),
            @ApiResponse(
                    responseCode = "404",
                    description = "Страны не найдены",
                    content = @Content)
    })
    ResponseEntity<List<CountryResponseDto>> getAllCountries();
}
