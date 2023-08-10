package com.travelly.dictionaryservice.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Getter
@Setter
@Schema(description = "Объект для отображения списка регионов")
public class RegionDto {
    @NonNull
    @Schema(description = "Идентификатор региона")
    private Long id;
    @NonNull
    @Schema(description = "Название региона")
    private String name;

}
