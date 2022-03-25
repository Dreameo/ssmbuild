package com.yfh.ssm.controller;

import com.yfh.ssm.pojo.Book;
import com.yfh.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/index") // 进入首页
    public String index() {

        return "index";
    }

    @RequestMapping("/test") // 测试链接是否可以跳转
    public String test() {
        System.out.println("表现层：查询所有书本信息...");
        List<Book> allBook = bookService.getAllBook();
        allBook.forEach(System.out::println);
        return "success";
    }

}
