package com.gyull.board.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
  
  @Bean
  OpenAPI openApi(){

    Info info = new Info()
                .version("v1.0.0")
                .title("삼사라 도서관리시스템")
                .description("");

    return new OpenAPI().info(info);
  }
}
