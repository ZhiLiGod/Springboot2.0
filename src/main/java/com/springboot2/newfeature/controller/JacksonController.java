package com.springboot2.newfeature.controller;

import com.springboot2.newfeature.dto.People;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/jackson")
public class JacksonController {

  @GetMapping
  public People jackson() throws Exception {
    // @formatter:off
    return People.builder().address("address")
        .age(20)
        .registerDate(LocalDateTime.now())
        .name("test_name").build();
    // @formatter:on
  }

}
