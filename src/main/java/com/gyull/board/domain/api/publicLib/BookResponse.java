package com.gyull.board.domain.api.publicLib;

import java.util.List;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class BookResponse {
  private String category;
  private String kwd;
  private Integer pageNum;
  private Integer pageSize;
  private String sort;
  private Integer total;
  private List<BookInfo> bookInfo;
}
