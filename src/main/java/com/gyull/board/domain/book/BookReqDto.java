package com.gyull.board.domain.book;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class BookReqDto {
  
  private String title;
  private String isbn;
  private String author;
  private String publisher;
  private String place;
  private String bookNum;
  private String start;
  private String end;
  private String startDate;
  private String endDate;
}
