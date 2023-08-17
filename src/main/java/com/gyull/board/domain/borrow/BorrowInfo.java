package com.gyull.board.domain.borrow;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class BorrowInfo {
  private Integer borrowIdx;
  private Integer bookIdx;
  private LocalDateTime returnDate;
  private LocalDateTime dueDate;
  private Boolean returnYn;
}
