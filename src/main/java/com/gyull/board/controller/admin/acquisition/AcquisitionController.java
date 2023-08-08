package com.gyull.board.controller.admin.acquisition;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AcquisitionController {
  
  @GetMapping("/admin/acquisition/createBook")
  public String createBook(){

    return "admin/acquisition/createBook";
  }

  @GetMapping("/admin/acquisition/searchBook")
  public String searchBook(){

    return "admin/acquisition/searchBook";
  }
}
