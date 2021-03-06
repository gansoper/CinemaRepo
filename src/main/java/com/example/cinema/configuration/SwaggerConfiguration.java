package com.example.cinema.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author <a href="mailto:andrew.guselnikov@test.com">Andrew Guselnikov</a>
 */
@Configuration
public class SwaggerConfiguration implements WebMvcConfigurer {
    @Bean
    public Docket APIs() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(metadata())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.cinema.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo metadata() {
        return new ApiInfoBuilder()
                .title("REST API for the CINEMA project")
                .description("Test REST API demonstrating base abilities of the backend")
                .version("0.0.1")
                .build();
    }
}
