package henu.yan.sample.controller;

import henu.yan.sample.model.Book;
import henu.yan.sample.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    //用于测试返回Gson内容
    @GetMapping("/book")
    public Book book(){
        Book book = new Book();
        book.setAuthor("曹雪芹");
        book.setName("红楼梦");
        return book;
    }

    /**
     * 跨域请求测试
     * @param name 书名
     * @return  receive：+书名
     */
    @PostMapping("/book")
    public String addBook(String name){
        return  "receive: "+name;
    }

    /**
     * MyBatis数据库访问测试
     * 访问/bookOps会在数据库中依次执行增加一条记录，删除一条记录，读取一条记录和读取所有记录的操作
     * 不返回任何数据
     */
    @GetMapping("/bookOps")
    public void bookOps(){
        Book b1 = new Book();
        b1.setName("红楼梦");
        b1.setAuthor("曹雪芹");
        int i = bookService.addBook(b1);
        System.out.println("addBook>>>"+i);
        int d = bookService.deleteBookById(3);
        System.out.println("deleteBookById>>>"+d);
        Book book = bookService.getBookById(1);
        System.out.println("getBookById>>>"+book.getName());
        List<Book> books = bookService.getAllBooks();
        System.out.println("getBookById>>>"+books.toString());
    }
}
