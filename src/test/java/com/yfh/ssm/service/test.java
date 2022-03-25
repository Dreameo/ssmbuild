package com.yfh.ssm.service;

import com.yfh.ssm.service.impl.BookServiceImpl;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    @Test
    public void testService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = context.getBean("bookServiceImpl", BookServiceImpl.class);

        bookService.getAllBook();

    }
}
