package com.atguigu.service;

import com.atguigu.pojo.Book;

import java.util.List;

public interface BookService {

    public void saveBook(Book book);

    public void deleteBookById(Integer id);

    public void updateBookById(Book book);

    public List<Book> queryAllBooks();

    public Book queryBookById(Integer id);

}
