package com.travelly.dictionaryservice.api.resources;

import com.travelly.dictionaryservice.api.dto.CountryResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Tags(value = {
        @Tag(name = "Получение списка стран",
                description = "Контроллер для вывода списка всех стран")})

public interface CountryResource {
    @Operation(summary = "Получение списка всех стран")
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
