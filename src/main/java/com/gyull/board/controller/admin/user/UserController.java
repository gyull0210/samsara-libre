package com.gyull.board.controller.admin.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
  
  @GetMapping("/admin/user/searchUser")
  public String searchUser(){

    return "admin/user/searchUser";
  }

  @GetMapping("/admin/user/createUser")
  public String createUser(){

    return "admin/user/createUser";
  }

}
