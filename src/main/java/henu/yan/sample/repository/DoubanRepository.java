package henu.yan.sample.repository;

import henu.yan.sample.model.Douban;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

//实现RESTful跨域，RESTful跨域请求需要单独做处理
@CrossOrigin
public interface DoubanRepository extends JpaRepository<Douban, Integer> {

    /**
     * 查询douban表中id相同的豆瓣电影
     * @param id 要查询的电影id
     * @return  匹配到的电影
     */
    @RestResource(path = "id", rel = "id")
    Douban findByIdEquals(@Param("id") String id);

//    /**
//     * 查询douban表中name相同的豆瓣电影
//     * @param name 要查询的电影名
//     * @return  匹配到的电影
//     */
//    @RestResource(path = "name", rel = "name")
//    Douban findByNameEquals(@Param("name") String name);

    /**
     * 模糊查询符合name的电影名
     * @param name 电影关键字 模糊查询
     * @return  含有电影关键字的电影
     */
    @RestResource(path = "name", rel = "name")
    List<Douban> findByNameContaining(String name);


}
