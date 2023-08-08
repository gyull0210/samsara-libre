package com.gyull.board.controller.api.v1.admin.book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@Tag(name="장서관리", description="등록된 도서목록을 관리하는 API")
@RestController
@RequestMapping(value = "/api/v1/book")
@RequiredArgsConstructor
public class ApiBookController {

  @GetMapping("/read")
  public String read(){
    return null;
  }

  @PostMapping("/create")
  public String save(){
    return null;
  }

  @PostMapping("/modify")
  public String modify(){
    return null;
  }

  @PostMapping("/delete")
  public String delete(){
    return null;
  }
}
