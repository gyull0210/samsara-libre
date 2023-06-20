package com.gyull.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/explore")
public class ExploreController {
  
  @GetMapping("/search")
  public String Search(){
    return "explore/search";
  }


  @GetMapping("/search_detail")
  public String SearchDetail(){
    return "explore/search_detail";
  }
}
