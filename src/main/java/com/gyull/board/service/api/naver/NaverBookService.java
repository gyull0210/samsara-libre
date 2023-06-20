package com.gyull.board.service.api.naver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;

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

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class NaverBookService {
  
  //@Value("${naver.clientId}")
 // private String clientId;
 String clientId ="T8yxd0pneRcHfJf7103X";
  //@Value("${naver.clientId}")
 // private String clientSecret;
 String clientSecret = "sfgo17UQZN";

  private String DEFAULT_URL = "https://openapi.naver.com/v1/search/book.json";
  private String DETAIL_URL = "https://openapi.naver.com/v1/search/book_adv.xml";

  /**
   * 
   */
  public SearchResDto search(String keyword, int start){
    RestTemplate restTemplate = new RestTemplate();
    HttpEntity<String> httpEntity = getHttpEntity();
    URI targetUrl = UriComponentsBuilder.fromUriString(DEFAULT_URL)
              .queryParam("query", keyword)
              .queryParam("start", start)
              .build()
              .encode(StandardCharsets.UTF_8)
              .toUri();

    return restTemplate.exchange(targetUrl, HttpMethod.GET, httpEntity, SearchResDto.class).getBody();
  }

  public SearchResDto searchDetail(SearchDetailReqDto searchDetailReqDto) throws MalformedURLException{
    RestTemplate restTemplate = new RestTemplate();
    HttpEntity<String> httpEntity = getHttpEntity();
    StringBuilder urlBuilder = new StringBuilder(DETAIL_URL);
    
    URL targetUrl = new URL(urlBuilder.toString());
    return null;
  }

  private HttpEntity<String> getHttpEntity(){
    HttpHeaders httpHeaders = new HttpHeaders();
    httpHeaders.set("X-Naver-Client-Id", clientId);
    httpHeaders.set("X-Naver-Client-Secret", clientSecret);

    return new HttpEntity<>(httpHeaders);
  }
}
