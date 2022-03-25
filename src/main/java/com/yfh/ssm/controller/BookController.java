package com.yfh.ssm.controller;

import com.yfh.ssm.pojo.Book;
import com.yfh.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/") // 进入首页
    public String index() {

        return "index";
    }

    /**
     * 去添加页面,不携带任何数据 /toAdd
     * 可以使用mvc-handler
     */

    /**
     * 添加操作
     */
    @RequestMapping("/addBook")
    public String addBook(String bookName, String bookCounts, String detail) {
        Book book = new Book(0, bookName, bookCounts, detail);
        int count = bookService.addBook(book);

        if (count > 0) {
            System.out.println("添加书本信息成功!");
            return "redirect:/book/allBook";
        }
        return "error";
    }

    /**
     * 根据id删除书本信息
     */
    @RequestMapping("/del/{bookId}")
    public String deleteBookById(@PathVariable("bookId") Integer bookId) {
        int count = bookService.deleteBookById(bookId);
        if (count > 0) {
            System.out.println("删除成功");
            return "redirect:/book/allBook";
        }
        return "error";
    }

    /**
     * 去修改界面
     */
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Integer bookId, Model model) {
        Book book = bookService.getBookById(bookId);
        model.addAttribute("book", book);
        return "book/update";
    }


    /**
     * 更新书本信息
     */

    @RequestMapping("/updateBook")
    public String updateBook(Integer bookId, String bookName, String bookCounts, String detail) {
        Book book = new Book(bookId, bookName, bookCounts, detail);
        int count = bookService.updateBook(book);
        if (count > 0) {
            System.out.println("更新书本成功！");
            return "redirect:/book/allBook";
        }
        return "error";
    }


    /**
     * 查看所有书本页面
     */
    @RequestMapping("/allBook")
    public String allBook(Model model) {
        List<Book> allBook = bookService.getAllBook();
        model.addAttribute("books", allBook);
        return "book/list";
    }

    /**
     * 测试是否页面跳转
     *
     * @return
     */
    @RequestMapping("/test") // 测试链接是否可以跳转
    public String test() {
        System.out.println("表现层：查询所有书本信息...");
        List<Book> allBook = bookService.getAllBook();
        allBook.forEach(System.out::println);
        return "success";
    }

}
