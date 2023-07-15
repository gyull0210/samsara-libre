package com.gyull.board.service.api.publicLib;

import java.net.URI;

import java.nio.charset.StandardCharsets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gyull.board.domain.api.publicLib.SeojiDetailReqDto;
import com.gyull.board.domain.api.publicLib.SeojiIsbnReqDto;
import com.gyull.board.domain.api.publicLib.SeojiIsbnResDto;
import com.gyull.board.domain.api.publicLib.SeojiResDto;

@Service
public class PublicBookService {
    Logger logger = LoggerFactory.getLogger(PublicBookService.class);
    String key="73ca3d1987bcb7cdcc7166b3fa0cb8a7ffe7e63721f323cad162f7a63de929aa";
    String searchUrl = "https://www.nl.go.kr/NL/search/openApi/search.do";
    String searchIsbnUrl = "https://www.nl.go.kr/seoji/SearchApi.do";
    String saseoUrl = "https://nl.go.kr/NL/search/openApi/saseoApi.do";

    public SeojiResDto search(SeojiDetailReqDto seojiDetailReqDto){
      RestTemplate restTemplate = new RestTemplate();

      URI targetUrl = UriComponentsBuilder.fromUriString(searchUrl)
              .queryParam("key", key)
              .queryParam("apiType", "json")
              .queryParam("detailSearch", seojiDetailReqDto.getDetailSearch())
              .queryParam("page_num", seojiDetailReqDto.getPageNum())
              .queryParam("pageSize", seojiDetailReqDto.getPageSize())
              .queryParam("srchTarget", seojiDetailReqDto.getSrchTarget())
              .queryParam("kwd", seojiDetailReqDto.getKwd())
              .queryParam("f1", seojiDetailReqDto.getF1())
              .queryParam("f2", seojiDetailReqDto.getF2())
              .queryParam("f3", seojiDetailReqDto.getF3())
              .queryParam("f4", seojiDetailReqDto.getF4())
              .queryParam("v1", seojiDetailReqDto.getF1())
              .queryParam("v2", seojiDetailReqDto.getF2())
              .queryParam("v3", seojiDetailReqDto.getF3())
              .queryParam("v4", seojiDetailReqDto.getV4())
              .queryParam("isbnOp", seojiDetailReqDto.getIsbnOp())
              .queryParam("isbnCode", seojiDetailReqDto.getIsbnCode())
              .queryParam("category", seojiDetailReqDto.getCategory())
              .queryParam("order", seojiDetailReqDto.getOrder())
              .queryParam("sort", seojiDetailReqDto.getSort())
              .build()
              .encode(StandardCharsets.UTF_8)
              .toUri();
    System.out.println(targetUrl);
    
    SeojiResDto seojiResDto  = new SeojiResDto();// 변수를 여기서 선언합니다.

    try {
        ResponseEntity<String> response = restTemplate.exchange(targetUrl, HttpMethod.GET, null, String.class);
        String responseBody = response.getBody();

        System.out.println("응답 코드: " + response.getStatusCodeValue());
        System.out.println(responseBody);

        ObjectMapper objectMapper = new ObjectMapper();
        seojiResDto = objectMapper.readValue(responseBody, SeojiResDto.class);

        return seojiResDto;

    } catch (Exception e) {
        e.printStackTrace();
    }

    return seojiResDto;
  }          

    public SeojiIsbnResDto searchIsbn(SeojiIsbnReqDto seojiIsbnReqDto) {

      RestTemplate restTemplate = new RestTemplate();

      URI targetUrl = UriComponentsBuilder.fromUriString(searchIsbnUrl)
                      .queryParam("cert_key", key)
                      .queryParam("result_style", "json")
                      .queryParam("page_no", seojiIsbnReqDto.getPageNo())
                      .queryParam("page_size", seojiIsbnReqDto.getPageSize())
                      .queryParam("isbn", seojiIsbnReqDto.getIsbn())
                      .queryParam("set_isbn", seojiIsbnReqDto.getSetIsbn())
                      .queryParam("ebook_yn", "")
                      .queryParam("title", seojiIsbnReqDto.getTitle())
                      .queryParam("start_publish_date", "")
                      .queryParam("end_publish_date", "")
                      .queryParam("cip_yn", "")
                      .queryParam("deposit_yn", "")
                      .queryParam("series_title", seojiIsbnReqDto.getSeriesTitle())
                      .queryParam("publisher", seojiIsbnReqDto.getPublisher())
                      .queryParam("author", seojiIsbnReqDto.getAuthor())
                      .queryParam("sort", "")
                      .queryParam("order_by", "")
                      .build()
                      .encode(StandardCharsets.UTF_8)
                      .toUri();

      return restTemplate.exchange(targetUrl, HttpMethod.GET, null, SeojiIsbnResDto.class).getBody();
    }

    public String searchRecommendBook(){

      RestTemplate restTemplate = new RestTemplate();

      URI targetUrl = UriComponentsBuilder.fromUriString(saseoUrl)
                      .queryParam("key", key)
                      .queryParam("startRowNumApi", 1)
                      .queryParam("endRowNumApi", "")
                      .queryParam("start_date", "")
                      .queryParam("end_date", "")
                      .queryParam("drCode", "")
                      .build()
                      .encode(StandardCharsets.UTF_8)
                      .toUri();
      return restTemplate.exchange(targetUrl, HttpMethod.GET, null, String.class).getBody();
    }
 }
