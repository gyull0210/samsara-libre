package com.gyull.board.domain.api.publicLib;

import groovy.transform.ToString;
import lombok.Getter;
import lombok.Setter;

@Getter
@ToString
@Setter
public class SeojiIsbnReqDto {
  
  private Integer pageNo;
  private Integer pageSize;
  private String isbn;
  private String setIsbn;
  private String ebookyn;
  private String title;
  private String startPubDate;
  private String endPubDate;
  private String cipyn;
  private String deposityn;
  private String seriesTitle;
  private String publisher;
  private String author;
  private String sort;
  private String orderBy;
}
