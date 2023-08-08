package com.travelly.dictionaryservice.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data

@AllArgsConstructor
@Schema(description = "Объект для получения стран")
public class CountryResponseDto {
    @Schema(example = "10", description = "Уникальный идентификатор страны")
    private Long id;

    @NotEmpty(message = "country.dto.validate.countryName.isEmpty")
    @Schema(example = "Название", description = "Название страны")
    private String name;
}