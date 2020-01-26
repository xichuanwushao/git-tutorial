package org.xichuan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xichuan.model.Book;
import org.xichuan.service.BookService;

import javax.validation.constraints.Max;
import java.util.List;
@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @GetMapping("/bookOps")
    public void bookOps(){
        Book b1 = new Book();
        b1.setName("西厢记");
        b1.setAuthor("王实甫");
        int i1 = bookService.addBook(b1);
        System.out.println("addBook>>>"+i1);

        Book b2 = new Book();
        b2.setName("朝花夕拾");
        b2.setAuthor("鲁迅");
        int i2 = bookService.updateBook(b2);
        System.out.println("updateBook>>>"+i2);


        Book b3 =bookService.getBookById(1);
        System.out.println("getBookById>>>"+b3);

        int delete4 = bookService.deleteBookById(2);
        System.out.println("deleteBookById>>>"+delete4);

        List<Book> allBooks5 = bookService.getAllBooks();
        System.out.println("getAllBooks>>>"+allBooks5);
    }
}
