package com.gyull.board.service.api.naver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.gyull.board.domain.api.naver.SearchDetailReqDto;
import com.gyull.board.domain.api.naver.SearchReqDto;
import com.gyull.board.domain.api.naver.SearchResDto;

@Service
public class NaverBookService {
  Logger logger = LoggerFactory.getLogger(NaverBookService.class);
  //@Value("${naver.clientId}")
 // private String clientId;
 String clientId ="T8yxd0pneRcHfJf7103X";
  //@Value("${naver.clientId}")
 // private String clientSecret;
 String clientSecret = "sfgo17UQZN";

  private String DEFAULT_URL = "https://openapi.naver.com/v1/search/book.json";
  private String DETAIL_URL = "https://openapi.naver.com/v1/search/book_adv.json";

  /**
   * 
   */
  public SearchResDto search(SearchReqDto searchReqDto){
    RestTemplate restTemplate = new RestTemplate();
    HttpEntity<String> httpEntity = getHttpEntity();
    URI targetUrl = UriComponentsBuilder.fromUriString(DEFAULT_URL)
              .queryParam("query", searchReqDto.getQuery())
              .queryParam("start", searchReqDto.getStart())
              .queryParam("display", searchReqDto.getDisplay())
              .build()
              .encode(StandardCharsets.UTF_8)
              .toUri();

    return restTemplate.exchange(targetUrl, HttpMethod.GET, httpEntity, SearchResDto.class).getBody();
  }

  public SearchResDto searchDetail(SearchDetailReqDto searchDetailReqDto) {
    RestTemplate restTemplate = new RestTemplate();
    HttpEntity<String> httpEntity = getHttpEntity();
    URI targetUrl = UriComponentsBuilder.fromUriString(DETAIL_URL)
              .queryParam("query", searchDetailReqDto.getQuery())
              .queryParam("start", searchDetailReqDto.getStart())
              .queryParam("display", searchDetailReqDto.getDisplay())
              .queryParam("d_titl", searchDetailReqDto.getD_titl())
              .queryParam("d_isbn", searchDetailReqDto.getD_isbn())
              .build()
              .encode(StandardCharsets.UTF_8)
              .toUri();

    return restTemplate.exchange(targetUrl, HttpMethod.GET, httpEntity, SearchResDto.class).getBody();
  }

  private HttpEntity<String> getHttpEntity(){
    HttpHeaders httpHeaders = new HttpHeaders();
    httpHeaders.set("X-Naver-Client-Id", clientId);
    httpHeaders.set("X-Naver-Client-Secret", clientSecret);

    return new HttpEntity<>(httpHeaders);
  }
}
