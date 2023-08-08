package com.gyull.board.controller.admin.borrow;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BorrowController {
  
  @GetMapping("/admin/borrow/searchBorrow")
  public String searchBorrow(){

    return "admin/borrow/searchBorrow";
  }
}
