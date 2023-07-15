package com.gyull.board.domain.api.publicLib;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SeojiResDto {
  @JsonProperty("category")
  private String category;
  @JsonProperty("kwd")
  private String kwd;
  @JsonProperty("pageNum")
  private Integer pageNum;
  @JsonProperty("pageSize")
  private Integer pageSize;
  @JsonProperty("result")
  private List<BookInfo> bookInfo;
  @JsonProperty("sort")
  private String sort;
  @JsonProperty("total")
  private Integer total;
  
}
