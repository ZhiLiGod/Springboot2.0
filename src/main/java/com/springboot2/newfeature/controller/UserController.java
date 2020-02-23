package com.springboot2.newfeature.controller;

import com.springboot2.newfeature.model.User;
import com.springboot2.newfeature.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;

@RestController
@RequestMapping("/user")
public class UserController {

  private final UserRepository userRepository;

  @Autowired
  public UserController(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @PostMapping("person/{name}/save")
  @ResponseStatus(HttpStatus.OK)
  public User save(@PathVariable final String name) {
    User user = new User();
    user.setName(name);
    userRepository.save(user);

    return user;
  }

}
