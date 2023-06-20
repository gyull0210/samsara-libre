package com.gyull.board.domain.api.naver;

import lombok.Builder;
import lombok.Data;

/**
 * query: 검색어
 * display: 검색결과 출력 건수
 * start: 검색 시작 위치
 * sort: 정렬 옵션 (sim: 유사도, date: 출간일)
 */
@Data
@Builder
public class SearchReqDto {
  private String query;
  private Integer display;
  private Integer start;
  private String sort;
}
