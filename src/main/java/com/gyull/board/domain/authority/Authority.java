package com.gyull.board.domain.authority;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Authority {
  
  private int idx;
  private String roleCode;
  private String group;
  private String create;
  private String read;
  private String update;
  private String delete;
}
