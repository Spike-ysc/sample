package henu.yan.sample.repository;

import henu.yan.sample.model.AnimationMovie;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface AnimationMovieRepository extends PagingAndSortingRepository<AnimationMovie, Integer> {
    //    /**
//     * 查询douban表中name相同的豆瓣电影
//     * @param name 要查询的电影名
//     * @return  匹配到的电影
//     */
//    @RestResource(path = "name", rel = "name")
//    Douban findByNameEquals(@Param("name") String name);

    /**
     * 查询android_movie表中studio相同的动画电影
     * @param studio 要查询的工作室名
     * @return 匹配到的电影
     */
    @RestResource(path = "studio", rel = "studio")
    List<AnimationMovie> findAllByStudioEqualsOrderBySorting(@Param("studio") String studio);
}
