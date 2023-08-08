package com.gyull.board.controller.admin.setting;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SettingController {

  @GetMapping("/admin/setting/defaultSetting")
  public String defaultSetting(){
    
    return "admin/setting/defaultSetting";
  }

}
