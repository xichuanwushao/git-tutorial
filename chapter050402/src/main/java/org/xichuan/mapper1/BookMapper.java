package org.xichuan.mapper1;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.xichuan.model.Book;

import java.util.List;

/**
 * Created by sang on 2018/7/16.
 */
@Mapper
@Repository
public interface BookMapper {
    List<Book> getAllBooks();
}
