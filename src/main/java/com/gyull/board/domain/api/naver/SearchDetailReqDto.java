package com.gyull.board.domain.api.naver;

import lombok.Builder;
import lombok.Data;

/**
 * query: 검색어
 * display: 검색결과 출력 건수
 * start: 검색 시작 위치
 * sort: 정렬 옵션 (sim: 유사도, date: 출간일)
 * d_titl: 제목
 * d_isbn: ISBN
 */
@Data
@Builder
public class SearchDetailReqDto {
  private String query;
  private Integer display;
  private Integer start;
  private String sort;
  private String d_titl;
  private String d_isbn;
}
