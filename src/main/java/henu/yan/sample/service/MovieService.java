package henu.yan.sample.service;

import henu.yan.sample.model.Movie;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

/**
 * Ehcache缓存方法测试
 */
@Repository
@CacheConfig(cacheNames = "movie_cache")    //使用的Ehcache策略，定义在ehcache.xml中
public class MovieService {
    @Cacheable  //缓存该方法
    public Movie getMovieById(Integer id){
        System.out.println("getMovieById");
        Movie movie = new Movie();
        movie.setId(id);
        movie.setName("卧虎藏龙");
        movie.setDirector("李安");
        return movie;
    }

    @CachePut(key = "#movie.id")
    public Movie updateMovieById(Movie movie){
        System.out.println("updateMovieById");
        movie.setName("饮食男女");
        return movie;
    }
    @CacheEvict(key = "#id")
    public void deleteBookById(Integer id){
        System.out.println("deleteBookById");
    }
}
