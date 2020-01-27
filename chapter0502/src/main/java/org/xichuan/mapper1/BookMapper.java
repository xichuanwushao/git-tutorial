package org.xichuan.mapper1;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.xichuan.model.Book;

import java.util.List;

/**
 * Created by sang on 2018/7/15.
 */
@Mapper
@Repository//为了解决idea报错，所以加了@Repository
public interface BookMapper {
    int addBook(Book book);
    int deleteBookById(Integer id);
    int updateBookById(Book book);
    Book getBookById(Integer id);
    List<Book> getAllBooks();
}
