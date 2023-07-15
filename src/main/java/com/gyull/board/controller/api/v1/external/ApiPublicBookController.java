package com.gyull.board.controller.api.v1.external;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.gyull.board.domain.api.publicLib.SeojiDetailReqDto;
import com.gyull.board.domain.api.publicLib.SeojiIsbnReqDto;
import com.gyull.board.service.api.publicLib.PublicBookService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/api/publicLib")
@RequiredArgsConstructor
public class ApiPublicBookController {

  @Autowired
  PublicBookService publicBookService;

  @PostMapping("/search")
  public ResponseEntity<?> search(SeojiDetailReqDto seojiDetailReqDto){
	  
	  return new ResponseEntity<>(publicBookService.search(seojiDetailReqDto), HttpStatus.OK);
	}

  // @GetMapping("/detailSearch")
  // public ResponseEntity<?> searchDetail(BookRequest bookreq){
	  
	//   return new ResponseEntity<>(publicBookService.searchDetail(bookreq), HttpStatus.OK);
	// }

  @PostMapping("/searchIsbn")
  public ResponseEntity<?> searchIsbn(SeojiIsbnReqDto seojiIsbnReqDto) throws JsonMappingException, JsonProcessingException{
	  
	  return new ResponseEntity<>(publicBookService.searchIsbn(seojiIsbnReqDto), HttpStatus.OK);
	}
}
