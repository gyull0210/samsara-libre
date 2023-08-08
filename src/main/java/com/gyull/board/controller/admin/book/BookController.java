package com.gyull.board.controller.admin.book;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
  
  @GetMapping("/admin/book/createBook")
  public String createBook(){

    return "admin/book/createBook";
  }

  @GetMapping("/admin/book/createBookTest")
  public String createBookTest(){

    return "admin/book/createBookTest";
  }

  @GetMapping("/admin/book/searchBook")
  public String searchBook(){

    return "admin/book/searchBook";
  }

  @GetMapping("/admin/book/searchBookTest")
  public String searchBookTest(){

    return "admin/book/searchBookTest";
  }
}
