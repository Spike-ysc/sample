package henu.yan.sample.repository;

import henu.yan.sample.model.Comic;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

/**
 * 快速创建的RESTful程序，默认提供增删改查方法
 * 可根据语法自定义查询，适用于快速搭建api，提供基本的数据库操作
 */
//此方法可屏蔽RESTful自带的增删改查方法，，具体数据库操作全由用户自定义
//@RepositoryRestResource(exported = false)
//实现RESTful跨域，RESTful跨域请求需要单独做处理
@CrossOrigin
public interface ComicRepository extends JpaRepository<Comic, Integer> {

    /**
     * 查询comic表中作者名含有关键词的所有comic
     * Contains为sql语句中的like
     * @param author 作者关键词
     * @return 所有作者名称中含有作者关键词的comic
     */
    @RestResource(path = "author", rel = "author")
    List<Comic> findByAuthorContains(@Param("author") String author);

    /**
     * 查询comic表中name相同的comic
     * @param name 要查询的漫画书名
     * @return  匹配到的comic
     */
    @RestResource(path = "name", rel = "name")
    Comic findByNameEquals(@Param("name") String name);

    /**
     * 根据id删除指定comic
     * @param id 要查询的id
     *  此方法使用@RestResource(exported = false)已经屏蔽掉，用户无法访问该方法
     */
    @Override
    @RestResource(exported = false)
    void deleteById(Integer id);
}
