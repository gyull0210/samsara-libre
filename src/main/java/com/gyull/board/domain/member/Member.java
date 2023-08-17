package com.gyull.board.domain.member;

import java.time.LocalDateTime;

import com.gyull.board.domain.circulation.Circulation;
import com.gyull.board.domain.role.RoleGroup;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Member {
  
  private long memberIdx;
  private String memEmail;
  private String memPw;
  private String name;
  private String phone;
  private String imageUrl;
  
  private LocalDateTime createdAt;
  private LocalDateTime modifiedAt;
  private LocalDateTime recentAt;

  private int overdueCount;

  private String ip;

  private Boolean withdraw_yn;

  private Address address;
  private RoleGroup roleGroup;
  private Circulation circulation;
}
