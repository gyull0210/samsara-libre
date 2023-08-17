package com.gyull.board.domain.ledger;

import java.time.LocalDateTime;

import groovy.transform.ToString;
import lombok.Getter;

@Getter
@ToString
public class Ledger {
  private Integer ledgerIdx;
  private Integer ledgerNo;
  private String ledgerYear;
  private LocalDateTime createdAt;
  private LocalDateTime modifiedAt;
}
