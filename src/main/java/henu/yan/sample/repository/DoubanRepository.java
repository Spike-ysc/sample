package henu.yan.sample.repository;

import henu.yan.sample.model.Douban;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

//实现RESTful跨域，RESTful跨域请求需要单独做处理
@CrossOrigin
public interface DoubanRepository extends PagingAndSortingRepository<Douban, Integer> {

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
     * @param p 分页
     * @return  含有电影关键字的电影
     */
    @RestResource(path = "name", rel = "name")
    List<Douban> findByNameContaining(String name, Pageable p);

    /**
     * 搜索包含某导演的所有电影，包含多个导演拍摄的电影
     * @param directors 导演名
     * @param p 分页
     * @return  包含该导演的所有电影
     */
    @RestResource(path = "directors", rel = "directors")
    List<Douban> findByDirectorsContaining(String directors, Pageable p);

    /**
     * 搜索包含某演员的所有电影，可能出现同名演员的情况
     * @param actors 演员名
     * @param p 分页
     * @return  包含该演员的所有电影
     */
    @RestResource(path = "actors", rel = "actors")
    List<Douban> findByActorsContaining(String actors, Pageable p);

    /**
     * 根据地区搜索电影
     * @param regions 地区名称
     * @param p 分页
     * @return 该地区的所有电影
     */
    @RestResource(path = "regions", rel = "regions")
    List<Douban> findAllByRegionsContaining(String regions, Pageable p);

    /**
     * 根据类型搜索电影
     * @param genres 电影类型
     * @param p 分页
     * @return  该类型的所有电影
     */
    @RestResource(path = "genres", rel = "genres")
    List<Douban> findAllByGenresContaining(String genres, Pageable p);

    /**
     * 根据标签搜索电影
     * @param tags  电影标签
     * @param p 分页
     * @return  该标签的所有电影
     */
    @RestResource(path = "tags", rel = "tags")
    List<Douban> findAllByTagsContaining(String tags, Pageable p);


}
