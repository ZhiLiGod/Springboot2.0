package com.springboot2.newfeature.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.text.SimpleDateFormat;

@Configuration
public class JacksonConfiguration {

  @Bean
  public Jackson2ObjectMapperBuilder getObjectMapper() {
    Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
    builder.dateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
    return builder;
  }

}
