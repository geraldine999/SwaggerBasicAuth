package com.example.swaggerbasicauth;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Controller")
@SecurityRequirement(name = "basicAuth")
public class Controller {

    //http://localhost:8080/swagger-ui/index.html#/

    @Operation(summary = "Secured operation")
    @GetMapping
    public String hello(){
        return "Hello";
    }
}
