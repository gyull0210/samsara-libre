package com.gyull.board.domain.api.publicLib;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

//

@Getter
@Setter
public class BookInfo {
    @JsonProperty("titleInfo")
    private String titleInfo;
    @JsonProperty("typeName")
    private String typeName;
    @JsonProperty("placeInfo")
    private String placeInfo;
    @JsonProperty("authorInfo")
    private String authorInfo;
    @JsonProperty("pubInfo")
    private String pubInfo;
    @JsonProperty("menuName")
    private String menuName;
    @JsonProperty("mediaName")
    private String mediaName;
    @JsonProperty("manageName")
    private String manageName;
    @JsonProperty("pubYearInfo")
    private String pubYearInfo;
    @JsonProperty("controlNo")
    private String controlNo;
    @JsonProperty("docYn")
    private String docYn;
    @JsonProperty("orgLink")
    private String orgLink;
    @JsonProperty("id")
    private String id;
    // @JsonProperty("placeCode")
    // private String placeCode;
    @JsonProperty("typeCode")
    private String typeCode;
    @JsonProperty("licYn")
    private String licYn;
    @JsonProperty("licText")
    private String licText;
    @JsonProperty("regDate")
    private String regDate;
    @JsonProperty("imageUrl")
    private String imageUrl;
    @JsonProperty("detailLink")
    private String detailLink;
    @JsonProperty("isbn")
    private String isbn;
    @JsonProperty("callNo")
    private String callNo;
    @JsonProperty("kdcCode1s")
    private String kdcCode1s;
    @JsonProperty("kdcName1s")
    private String kdcName1s;
    @JsonProperty("classNo")
    private String classNo;
    @JsonProperty("typeOfRes")
    private String typeOfRes;
}
