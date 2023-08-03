package com.travelly.dictionaryservice.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Schema(description = "Объект для отображения списка регионов")
public class RegionDto {
    @NonNull
    @Schema(description = "Идентификатор региона")
    private Long id;
    @NonNull
    @Schema(description = "Название региона")
    private String name;

}
