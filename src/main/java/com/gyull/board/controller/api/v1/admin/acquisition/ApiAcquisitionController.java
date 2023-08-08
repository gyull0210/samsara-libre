package com.gyull.board.controller.api.v1.admin.acquisition;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@Tag(name="도서대여", description="도서대여와 반납을 관리하는 API")
@RestController
@RequestMapping(value = "/api/v1/acquisition")
@RequiredArgsConstructor
public class ApiAcquisitionController {
  
}
