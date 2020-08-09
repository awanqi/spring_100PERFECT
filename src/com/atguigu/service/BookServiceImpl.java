package com.atguigu.service;

import com.atguigu.mapper.BookMapper;
import com.atguigu.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper bookMapper;
    @Override
    public void saveBook(Book book) {

        bookMapper.insertSelective(book);
    }

    @Override
    public void deleteBookById(Integer id) {
        bookMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateBookById(Book book) {
        bookMapper.updateByPrimaryKeySelective(book);
    }

    @Override
    public List<Book> queryAllBooks() {
        return   bookMapper.selectByExample(null);

    }

    @Override
    public Book queryBookById(Integer id) {

        return bookMapper.selectByPrimaryKey(id);
    }
}
