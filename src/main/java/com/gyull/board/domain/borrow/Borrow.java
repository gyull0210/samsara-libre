package com.gyull.board.domain.borrow;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.ToString;

/*
 * @description
 * 대여 테이블
 * 대여번호
 * 대여한 책 제목
 * 대여날짜시작 - 종료
 * 연체일수
 * 대여만료여부
 * 반납여부
 */
@Getter
@ToString
public class Borrow {
  private long brrIdx;
  private String userId;
  private String bookId;
  private LocalDateTime borrowStart;
  private LocalDateTime borrowEnd;
  private int overdueCount;
  private String checkIn;
  private LocalDateTime checkIndDate;
}
