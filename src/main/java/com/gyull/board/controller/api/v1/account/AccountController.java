package com.gyull.board.controller.api.v1.account;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @apiNote 회원가입 및 계정찾기 API
 */
@RestController
@RequestMapping("/account")
public class AccountController {
  
  @PostMapping("/signUp")
  public String signUp(){
    return "/signUp";
  }

  @PostMapping("/search")
  public String search(){
    return "/search";
  }
}
