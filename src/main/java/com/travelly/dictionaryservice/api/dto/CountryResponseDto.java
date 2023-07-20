package com.travelly.dictionaryservice.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Schema(description = "Объект для получения стран")
public class CountryResponseDto {
    @Schema(example = "123e4567-e89b-12d3-a456-426614174000", description = "Уникальный идентификатор")
    private Long id;

    @NotEmpty(message = "country.dto.validate.countryName.isEmpty")
    @Size(min = 2, max = 20, message = "country.dto.validate.nameNumber.size")
    @Schema(example = "Название", description = "Название страны")
    private String name;
}