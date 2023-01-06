package com.gyull.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {

  @GetMapping("/")
  public String Home(){
    return "home";
  }
  
  @GetMapping("/login")
  public String Login(){
    return "login";
  }

  @GetMapping("/signup")
  public String SignUp(){
    return "signup";
  }

  @GetMapping("/admin/dashboard")
  public String dashboard(){
    return "admin/dashboard";
  }
}
