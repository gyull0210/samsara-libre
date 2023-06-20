package com.gyull.board.domain.api.naver;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchResDto {
    @JsonProperty("lastBuildDate")
    private String lastBuildDate; // 검색 결과 생성 시간

    @JsonProperty("total")
    private int total; // 검색 결과 총 개수

    @JsonProperty("items")
    private List<BookItem> items; // 검색 결과 도서 목록
}
