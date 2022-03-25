package com.yfh.ssm.service;

import com.yfh.ssm.pojo.Book;

import java.util.List;

public interface BookService {
    /**
     * 增加书本信息
     */
    int addBook(Book book);


    /**
     * 删除书本信息
     */
    int deleteBookById(Integer bookId);


    /**
     * 修改书本信息
     */
    int updateBook(Book book);


    /**
     * 根据id查询书本信息
     */
    Book getBookById(Integer bookId);


    /**
     * 查询所有书本信息
     */
    List<Book> getAllBook();
}
