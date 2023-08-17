package com.gyull.board.domain.circulation;

import java.time.LocalDateTime;

import lombok.Getter;

@Getter
public class Circulation {
  private Integer circ_idx;
  private Integer circ_borrow_limit;
  private LocalDateTime circ_borrow_date;
}
