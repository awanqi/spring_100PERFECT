package com.atguigu.test;

import com.atguigu.pojo.Book;
import com.atguigu.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;

@ContextConfiguration(locations = "classpath:Applicationcontext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class booktest {
    @Autowired
    BookService bookService;

    @Test
    public void saveBook() {
        bookService.saveBook(new Book(null,"hande ","呵呵哒", new BigDecimal(100000), 111111,1111));
    }

    @Test
    public void saeBook() {
        bookService.deleteBookById(19);
    }

}
