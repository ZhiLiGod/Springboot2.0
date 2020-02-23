package com.springboot2.newfeature.config;

import com.springboot2.newfeature.model.User;
import com.springboot2.newfeature.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Collection;

@Configuration
public class RouterFunctionConfig {

  @Bean
  @Autowired
  public RouterFunction<ServerResponse> personFindAll(UserRepository userRepository) {
    // @formatter:off
    return RouterFunctions.route(RequestPredicates.GET("/find/all"),
        serverRequest -> {
          Collection<User> users = userRepository.findAll();
          Flux<User> userFlux = Flux.fromIterable(users);
          return ServerResponse.ok().body(userFlux, User.class);
        });
    // @formatter:on
  }

}
