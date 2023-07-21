package com.travelly.dictionaryservice.api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Dictionary-service",
                description = "Аренда жилья за границей", version = "1.0.1",
                contact = @Contact(
                        name = "Yunitsin Kirill"
                )
        )
)
public class OpenApiConfig {

}