package com.gyull.board.domain.member;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Address {
  private Integer addressIdx;
  private Integer memberIdx;
  private Integer postcode;
  private String address;
  private String detailAddress;
  private String extraAddress;
}
