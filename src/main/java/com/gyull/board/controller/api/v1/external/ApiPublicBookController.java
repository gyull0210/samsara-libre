package com.gyull.board.controller.api.v1.external;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.gyull.board.service.api.publicLib.PublicBookService;
import com.gyull.board.domain.api.publicLib.BookRequest;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/api/publicLib")
@RequiredArgsConstructor
public class ApiPublicBookController {

  //@Autowired
  //PublicBookService publicBookService;

  // @GetMapping("/search")
  // public ResponseEntity<?> search(BookRequest bookreq){
	  
	//   return new ResponseEntity<>(publicBookService.searchDetail(bookreq), HttpStatus.OK);
	// }

  // @GetMapping("/detailSearch")
  // public ResponseEntity<?> searchDetail(BookRequest bookreq){
	  
	//   return new ResponseEntity<>(publicBookService.searchDetail(bookreq), HttpStatus.OK);
	// }

  // @GetMapping("/searchIsbn")
  // public ResponseEntity<?> searchIsbn(BookRequest bookreq){
	  
	//   return new ResponseEntity<>(publicBookService.searchDetail(bookreq), HttpStatus.OK);
	// }
}
