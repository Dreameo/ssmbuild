package com.yfh.ssm.dao;

import com.yfh.ssm.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDAO {

    /**
     * 增加书本信息
     */
    int addBook(@Param("book") Book book);


    /**
     * 删除书本信息
     */
    int deleteBookById(@Param("bookId") Integer bookId);


    /**
     * 修改书本信息
     */
    int updateBook(@Param("book") Book book);


    /**
     * 根据id查询书本信息
     */
    Book getBookById(@Param("bookId") Integer bookId);


    /**
     * 查询所有书本信息
     */
    List<Book> getAllBook();
}
