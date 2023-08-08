package com.travelly.dictionaryservice.api.resources;

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

import java.util.UUID;

/**
 * ЭТО ПРИМЕР, ТУТ НИЧЕГО НЕ ТРОГАТЬ!
 * НУЖНО ОЗНАКОМИТЬСЯ И ПО АНАЛОГИИ НАПИСАТЬ СВОЮ РЕАЛИЗАЦИЮ В ЭТОЙ ЖЕ ДИРЕКТОРИИ
 */

@Tags(value = {
        @Tag(name = "Пример ресурса",
                description = "Пример описания ресурса")})
public interface ExampleResource {

    @Operation(summary = "Получение счета по идентификатору")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Счет найден",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = ExampleDto.class))
                    }),
            @ApiResponse(
                    responseCode = "400",
                    description = "Предоставлен неверный идентификатор",
                    content = @Content
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Счет по заданному идентификатору не найден",
                    content = @Content)
    })
    ExampleDto getExampleById(@Parameter(description = "Идентификатор счета для поиска") @NotNull UUID uuid);

    @Operation(summary = "Создание счета")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Счет создан",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = ExampleDto.class))}
            )
    })
    ExampleDto createExample(ExampleDto exampleDto);
}