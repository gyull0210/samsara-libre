package com.gyull.board.controller.api.v1.auth;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
  
  @PostMapping("/login")
  public String login(){
    return "login";
  }
}
