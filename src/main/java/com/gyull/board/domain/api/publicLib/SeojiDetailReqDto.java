package com.gyull.board.domain.api.publicLib;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//

@ToString
@Getter
@Setter
public class SeojiDetailReqDto {
  private String srchTarget;
  private String kwd;
  private Integer pageNum;
  private Integer pageSize;
  private String systemType;
  private String category;
  private String sort;
  private String order;
  private String detailSearch;
  private String isbnOp;
  private String isbnCode;

  private String f1;
  private String f2;
  private String f3;
  private String f4;
  private String v1;
  private String v2;
  private String v3;
  private String v4;

  private String and1;
  private String and2;
  private String and3;
}
