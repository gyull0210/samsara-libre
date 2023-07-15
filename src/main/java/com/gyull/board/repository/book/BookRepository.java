package com.gyull.board.repository.book;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface BookRepository {
  public String search();
  public String searchDetail();
  public String modify(); 
  public void delete(); 
}
