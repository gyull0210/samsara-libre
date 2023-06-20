package com.gyull.board.domain.api.naver;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookItem {
    @JsonProperty("title")
    private String title; // 제목

    @JsonProperty("image")
    private String image;

    @JsonProperty("author")
    private String author; // 저자

    @JsonProperty("publisher")
    private String publisher; // 출판사

    @JsonProperty("pubdate")
    private String publicationDate; // 출간일

    @JsonProperty("isbn")
    private String ISBN; // ISBN 번호

    @JsonProperty("price")
    private String price;

    @JsonProperty("discount")
    private String discount;

    @JsonProperty("description")
    private String description;
}
