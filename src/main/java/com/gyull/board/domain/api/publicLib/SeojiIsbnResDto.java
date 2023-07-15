package com.gyull.board.domain.api.publicLib;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import groovy.transform.ToString;
import lombok.Getter;

@Getter
@ToString
public class SeojiIsbnResDto {
  @JsonProperty("PAGE_NO")
  private Integer pageNo;
  @JsonProperty("TOTAL_COUNT")
  private Integer totalCount;
  @JsonProperty("docs")
  private List<SeojiInfo> seojiInfo;
  
}
