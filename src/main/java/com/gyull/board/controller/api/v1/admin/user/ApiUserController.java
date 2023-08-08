package com.gyull.board.controller.api.v1.admin.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/api/v1/user")
@RequiredArgsConstructor
public class ApiUserController {
  
  @GetMapping("/")
  public String read(){
    return null;
  }
}
