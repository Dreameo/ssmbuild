package com.yfh.ssm.service.impl;

import com.yfh.ssm.dao.BookDAO;
import com.yfh.ssm.pojo.Book;
import com.yfh.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDAO bookDAO;

    @Override
    public int addBook(Book book) {
        return 0;
    }

    @Override
    public int deleteBookById(Integer bookId) {
        return 0;
    }

    @Override
    public int updateBook(Book book) {
        return 0;
    }

    @Override
    public Book getBookById(Integer bookId) {
        return null;
    }

    @Override
    public List<Book> getAllBook() {
        System.out.println("业务层：查询所有书本信息...");
        return bookDAO.getAllBook();
    }
}
