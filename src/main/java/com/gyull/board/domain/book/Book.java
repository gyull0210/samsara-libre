package com.gyull.board.domain.book;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.ToString;

/*
 * @description
 * 책번호
 * 책제목
 * 작가명
 * 발행자
 * isbn번호
 * 도서코드
 * 도서분류
 * 관내도서비치구역
 * 출간일
 * 도서등록일
 * 동일 도서 갯수
 * 대여가능여부
 * 대여날짜
 * 반납날짜
 */
@Getter
@ToString
public class Book {
  
  private long book_idx;
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
  private String isBorrow;
  private LocalDateTime borrowDate;
  private LocalDateTime borrowEndDate;
  private String extra;
}
