package com.gyull.board.controller.admin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
  
  @GetMapping("/admin/dashboard")
  public String Dashboard(){

    return "admin/dashboard";
  }

  @GetMapping("/admin/book/createBook")
  public String createBook(){

    return "admin/book/createBook";
  }

  @GetMapping("/admin/book/searchBook")
  public String searchBook(){

    return "admin/book/searchBook";
  }

  @GetMapping("/admin/user/searchUser")
  public String searchUser(){

    return "admin/user/searchUser";
  }

  @GetMapping("/admin/user/createUser")
  public String createUser(){

    return "admin/user/createUser";
  }

  @GetMapping("/admin/borrow/searchBorrow")
  public String searchBorrow(){

    return "admin/borrow/searchBorrow";
  }

  @GetMapping("/admin/setting/defaultSetting")
  public String defaultSetting(){
    
    return "admin/setting/defaultSetting";
  }
}
