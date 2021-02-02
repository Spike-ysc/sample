package henu.yan.sample.service;

import henu.yan.sample.mapper.BookMapper;
import henu.yan.sample.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 调用mapper方法中对数据库操作的方法
 */
@Service
public class BookService {
    @Autowired
    BookMapper bookMapper;

    public int addBook(Book book){
        return bookMapper.addBook(book);
    }

    public int updateBook(Book book){
        return bookMapper.updateBookById(book);
    }

    public int deleteBookById(Integer id){
        return bookMapper.deleteBookById(id);
    }

    public Book getBookById(Integer id){
        return bookMapper.getBookById(id);
    }

    public List<Book> getAllBooks(){
        return bookMapper.getAllBooks();
    }
}
