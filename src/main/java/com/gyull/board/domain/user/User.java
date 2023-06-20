package com.gyull.board.domain.user;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class User {
  
  private long user_idx;
  private String user_email;
  private String user_pw;
  private String user_name;
  private String phoneNum;
  private String user_address;
  private LocalDateTime user_regDate;
  private LocalDateTime user_updateDate;
  private LocalDateTime user_recentDate;

  private int checkoutCount;

  private String ip;
  private String roleCode;
  private String user_disabled;
  private String user_withdraw;
  private String freezed;

}
