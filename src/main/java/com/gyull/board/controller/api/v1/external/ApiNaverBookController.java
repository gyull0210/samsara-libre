package com.gyull.board.controller.api.v1.external;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gyull.board.domain.api.naver.SearchDetailReqDto;
import com.gyull.board.domain.api.naver.SearchReqDto;
import com.gyull.board.service.api.naver.NaverBookService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/api/naver")
@RequiredArgsConstructor
public class ApiNaverBookController {
	
	@Autowired
	NaverBookService naverBookService;
	
	@GetMapping("/search")
	public ResponseEntity<?> search(@RequestParam String title, @RequestParam Integer start){
	  
	  return new ResponseEntity<>(naverBookService.search(title, start), HttpStatus.OK);
	}

	// @GetMapping("/searchDetail")
	// public ResponseEntity<?> searchDetail(SearchDetailReqDto searhDetailReqDto){
	  
	//   return new ResponseEntity<>(naverBookService.searchDetail(searchDetailReqDto), HttpStatus.OK);
	// }
  
}
