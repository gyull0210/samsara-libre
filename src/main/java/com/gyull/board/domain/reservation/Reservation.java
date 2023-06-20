package com.gyull.board.domain.reservation;

import lombok.Getter;
import lombok.ToString;


/*
 * @description
 * 예약 테이블
 * 예약번호
 * 예약장소
 * 예약장소번호
 * 예약날짜
 * 예약시간
 * 이용종료날짜
 * 예약만료여부
 * 예약취소여부
 */
@Getter
@ToString
public class Reservation {
  
  private long rs_idx;
}
