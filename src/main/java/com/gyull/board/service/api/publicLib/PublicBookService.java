package com.gyull.board.service.api.publicLib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.gyull.board.domain.api.publicLib.BookRequest;
import com.gyull.board.domain.api.publicLib.BookResponse;

//@Service
// public class PublicBookService {
//     String key="73ca3d1987bcb7cdcc7166b3fa0cb8a7ffe7e63721f323cad162f7a63de929aa";
//     String searchUrl = "https://www.nl.go.kr/NL/search/openApi/search.do";
//     String detailUrl = "https://www.nl.go.kr/NL/search/openApi/search.do?key="+key+"&detailSearch=true&isbnOp=isbn&isbnCode=8984993727";
//     String searchIsbnUrl = "https://www.nl.go.kr/seoji/SearchApi.do";



//     // public BookResponse search(BookRequest Bookreq){
//     //   RestTemplate restTemplate = new RestTemplate();
     
//     //   return restTemplate.exchange(targetUrl, HttpMethod.GET, httpEntity, BookResponse.class).getBody();
//     // }

//     // public BookResponse searchDetail(BookRequest Bookreq){

//     // }

//     // public BookResponse searchIsbn(){

//     // }

//     try {
//     // 1. URL을 만들기 위한 StringBuilder.
//     StringBuilder urlBuilder = new StringBuilder("https://www.nl.go.kr/NL/search/openApi/search.do");
//     // 2. 오픈 API의요청 규격에 맞는 파라미터 생성, 발급받은 인증키.
//     urlBuilder.append("?" + URLEncoder.encode("key","UTF-8") + "=" + URLEncoder.encode(key, "UTF-8"));
//     urlBuilder.append("&" + URLEncoder.encode("apiType","UTF-8") + "=" + URLEncoder.encode("JSON", "UTF-8"));
//     urlBuilder.append("&" + URLEncoder.encode("pageSize","UTF-8") + "=" + URLEncoder.encode(bookreq.getPageSize(), "UTF-8")); 
//     urlBuilder.append("&" + URLEncoder.encode("pageNum","UTF-8") + "=" + URLEncoder.encode(bookreq.getPageNum(), "UTF-8")); 
//     urlBuilder.append("&" + URLEncoder.encode("kwd","UTF-8") + "=" + URLEncoder.encode(bookreq.getKwd(), "UTF-8"));
//     urlBuilder.append("&" + URLEncoder.encode("srchType","UTF-8") + "=" + URLEncoder.encode(bookreq.getSrchTarget(), "UTF-8"));
//     urlBuilder.append("&" + URLEncoder.encode("detailSearch","UTF-8") + "=" + URLEncoder.encode(bookreq.getDetailSearch(), "UTF-8"));
//     urlBuilder.append("&" + URLEncoder.encode("f1","UTF-8") + "=" + URLEncoder.encode(bookreq.getF1(), "UTF-8")); 
//     urlBuilder.append("&" + URLEncoder.encode("v1", "UTF-8") + "=" + URLEncoder.encode(bookreq.getV1(), "UTF-8"));
//     urlBuilder.append("&" + URLEncoder.encode("f2","UTF-8") + "=" + URLEncoder.encode(bookreq.getF2(), "UTF-8")); 
//     urlBuilder.append("&" + URLEncoder.encode("v2", "UTF-8") + "=" + URLEncoder.encode(bookreq.getV2(), "UTF-8"));
//     urlBuilder.append("&" + URLEncoder.encode("f3","UTF-8") + "=" + URLEncoder.encode(bookreq.getF3(), "UTF-8")); 
//     urlBuilder.append("&" + URLEncoder.encode("v3", "UTF-8") + "=" + URLEncoder.encode(bookreq.getV3(), "UTF-8"));
//     urlBuilder.append("&" + URLEncoder.encode("category","UTF-8") + "=" + URLEncoder.encode(bookreq.getCategory(), "UTF-8"));
//     urlBuilder.append("&" + URLEncoder.encode("sort","UTF-8") + "=" + URLEncoder.encode(bookreq.getSort(), "UTF-8"));
//     urlBuilder.append("&" + URLEncoder.encode("order","UTF-8") + "=" + URLEncoder.encode(bookreq.getOrder(), "UTF-8"));
//     // 3. URL 객체 생성.
//     URL url = new URL(urlBuilder.toString());
//     // 4. 요청하고자 하는 URL과 통신하기 위한 Connection 객체 생성.
//     HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//     // 5. 통신을 위한 메소드 SET.
//     conn.setRequestMethod("GET");
//     // 6. 통신을 위한 Content-type SET. 
//     conn.setRequestProperty("Content-type", "application/json");
//     // 7. 통신 응답 코드 확인.
//     System.out.println("Response code: " + conn.getResponseCode());
//     // 8. 전달받은 데이터를 BufferedReader 객체로 저장.
//     BufferedReader rd;
//     if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
//         rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//     } else {
//         rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
//     }
//     // 9. 저장된 데이터를 라인별로 읽어 StringBuilder 객체로 저장.
//     StringBuilder sb = new StringBuilder();
//     String line;
//     while ((line = rd.readLine()) != null) {
//         sb.append(line);
//     }
//     // 10. 객체 해제.
//     rd.close();
//     conn.disconnect();
//     // 11. 전달받은 데이터 확인.
//     System.out.println(sb.toString());
//     // 1. 문자열 형태의 JSON을 파싱하기 위한 JSONParser 객체 생성.
//     JSONParser parser = new JSONParser();
//     // 2. 문자열을 JSON 형태로 JSONObject 객체에 저장. 	
//     JSONObject obj = (JSONObject)parser.parse(sb.toString());
//     // 3. 필요한 리스트 데이터 부분만 가져와 JSONArray로 저장.
//     JSONArray bookInfo = (JSONArray) obj.get("result");
//     // 4. model에 담아준다.
  
//   } catch(Exception e) {
//     e.printStackTrace();
//   } 
// }
