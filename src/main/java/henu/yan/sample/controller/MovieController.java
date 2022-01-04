package henu.yan.sample.controller;

import henu.yan.sample.model.Movie;
import henu.yan.sample.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Ehcache缓存测试类，重复获取数据只会执行一次
 * 更新数据后重新获取会更新
 */
@RestController
public class MovieController {
    @Autowired
    MovieService movieService;
    @GetMapping("/movie/test")
    public void movieTest(){
        movieService.getMovieById(1);
        movieService.getMovieById(1);
        movieService.deleteBookById(1);
        Movie movie = movieService.getMovieById(1);
        System.out.println("movie: "+movie.getName());
        Movie movie1 = new Movie();
        movie1.setName("一一");
        movie1.setDirector("杨德昌");
        movie1.setId(1);
        movieService.updateMovieById(movie1);
        Movie movie2 = movieService.getMovieById(1);
        System.out.println("movie2:"+movie2.getName());
    }

}
