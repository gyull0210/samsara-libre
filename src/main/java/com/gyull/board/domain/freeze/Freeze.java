package com.gyull.board.domain.freeze;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Freeze {
  private long id;
  private String userId;
  private LocalDateTime startDate;
  private LocalDateTime endDate;
  private String reason;
  private LocalDateTime regDate;
}
