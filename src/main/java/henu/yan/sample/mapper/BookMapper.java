package henu.yan.sample.mapper;

import henu.yan.sample.model.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 数据库操作，该接口定义数据库方法的命名、输入和输出
 * 具体数据库操作代码在"同名.xml"文件中实现
 */
@Mapper
public interface BookMapper {
    int addBook(Book book); //增加一条记录
    int deleteBookById(Integer id); //删除id匹配的记录
    int updateBookById(Book book);  //更新id匹配的记录
    Book getBookById(Integer id);   //获取id匹配的记录
    List<Book> getAllBooks();   //获取所有的记录
}
