package com.travelly.dictionaryservice.api.resource;

import com.travelly.dictionaryservice.api.util.UrlConstants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Tags(
        value = {
                @Tag(name = "Отзыв", description = "Ресурс для добавление отзыва к объявлению")
        }
)
@RequestMapping(UrlConstants.DIC_SERV_URL)
public interface GetListOfRegions {
    @GetMapping("/{countryId}/region")
    @Operation(summary = "Отображение списка регионов")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Запрос выполнен успешно",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = String.class))}),
            @ApiResponse(responseCode = "400", description = "Предоставлен неверный идентификатор",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Региона с таким идентификатором не найдено",
                    content = @Content)})
    ResponseEntity<?> getRegions(@PathVariable("countryId") Long countryId);
}