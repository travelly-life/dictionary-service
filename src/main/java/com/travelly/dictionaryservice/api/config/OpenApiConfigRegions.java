package com.travelly.dictionaryservice.api.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Dictionary-service",
                description = "Справочник", version = "1.0.1",
                contact = @Contact(
                        name = "Kirill Yunitsyn"
                )
        )
)
public class OpenApiConfigRegions {
}
