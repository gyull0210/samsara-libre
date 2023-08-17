package com.gyull.board.controller.admin.setting;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SettingController {

  @GetMapping("/admin/setting/defaultSetting")
  public String defaultSetting(){
    
    return "admin/setting/defaultSetting";
  }

  @GetMapping("/admin/setting/book")
  public String book(){
    
    return "admin/setting/book";
  }

  @GetMapping("/admin/setting/user")
  public String user(){

    return "admin/setting/user";
  }

  @GetMapping("/admin/setting/circulation")
  public String culculation(){

    return "admin/setting/circulation";
  }

}
