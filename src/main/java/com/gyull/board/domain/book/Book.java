package com.gyull.board.domain.book;

import java.time.LocalDateTime;

import com.gyull.board.domain.location.Location;

import lombok.Getter;
import lombok.ToString;

/*
 * @description
 * 책번호
 * 도서코드
 * 도서분류
 * 권차
 * 복본
 * 관내도서비치구역
 * 대여가능여부
 */
@Getter
@ToString
public class Book {
  
  private Integer bookIdx;
  private String book_num;
  private String book_title;
  private String author;
  private String publisher;
  private String isbn;
  private String bookcode;
  private String category;
  private String serialNum; 
  private String area;
  private LocalDateTime published_date;
  private LocalDateTime regDate;
  private String bookCount;
  private String bookState;
  private LocalDateTime borrowDate;
  private LocalDateTime borrowEndDate;
  private String extra;

  private Location location;
}
