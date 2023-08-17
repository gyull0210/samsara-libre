package com.gyull.board.domain.role;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Permission {
  private Integer permitIdx;
  private Integer boardIdx;
  private Boolean noticeYn;
  private Boolean createYn;
  private Boolean readYn;
  private Boolean modifyYn;
  private Boolean deleteYn; 
}
