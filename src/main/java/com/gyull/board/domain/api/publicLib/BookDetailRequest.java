package com.gyull.board.domain.api.publicLib;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookDetailRequest {
  private String srchTarget;
  private String kwd;
  private Integer pageNum;
  private Integer PageSize;
  private String systemType;
  private String category;
  private String sort;
  private String order;
  
  private String f1;
  private String f2;
  private String f3;
  private String f4;
  private String v1;
  private String v2;
  private String v3;
  private String v4;
}
