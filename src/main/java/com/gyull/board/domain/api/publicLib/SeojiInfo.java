package com.gyull.board.domain.api.publicLib;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * ISBN 서지정보 DTO
 * @param
 */
@Getter
@Setter
public class SeojiInfo {
  
  @JsonProperty("AUTHOR")
  private String author;
  @JsonProperty("BIB_YN")
  private String bibYn;
  @JsonProperty("BOOK_INTRODUCTION_URL")
  private String bookIntroductionUrl;
  @JsonProperty("BOOK_SIZE")
  private String bookSize;
  @JsonProperty("BOOK_SUMMARY_URL")
  private String bookSummaryUrl;
  @JsonProperty("BOOK_TB_CNT_URL")
  private String bookTbCntUrl;
  @JsonProperty("CIP_YN")
  private String cipYn;
  @JsonProperty("CONTROL_NO")
  private String controlNo;
  @JsonProperty("DDC")
  private String ddc;
  @JsonProperty("DEPOSIT_YN")
  private String depositYn;
  @JsonProperty("EA_ADD_CODE")
  private String eaAddCode;
  @JsonProperty("EA_ISBN")
  private String eaIsbn;
  @JsonProperty("EBOOK_YN")
  private String ebookYn;
  @JsonProperty("EDITION_STMT")
  private String editionStmt;
  @JsonProperty("FORM")
  private String form;
  @JsonProperty("FORM_DETAIL")
  private String formDetail;
  @JsonProperty("INPUT_DATE")
  private String inputDate;
  @JsonProperty("KDC")
  private String kdc;
  @JsonProperty("PAGE")
  private String page;
  @JsonProperty("PRE_PRICE")
  private String prePrice;
  @JsonProperty("PUBLISHER")
  private String publisher;
  @JsonProperty("PUBLISHER_URL")
  private String publisherUrl;
  @JsonProperty("PUBLISH_PREDATE")
  private String publishPreDate;
  @JsonProperty("REAL_PRICE")
  private String realPrice;
  @JsonProperty("REAL_PUBLISH_DATE")
  private String realPublishDate;
  @JsonProperty("RELATED_ISBN")
  private String relatedIsbn;
  @JsonProperty("SERIES_NO")
  private String seriesNo;
  @JsonProperty("SERIES_TITLE")
  private String seriesTitle;
  @JsonProperty("SET_ADD_CODE")
  private String setAddCode;
  @JsonProperty("SET_EXPRESSION")
  private String setExpression;
  @JsonProperty("SET_ISBN")
  private String setIsbn;
  @JsonProperty("SUBJECT")
  private String subject;
  @JsonProperty("TITLE")
  private String title;
  @JsonProperty("TITLE_URL")
  private String titleUrl;
  @JsonProperty("UPDATE_DATE")
  private String updateDate;
  @JsonProperty("VOL")
  private String vol;
}
