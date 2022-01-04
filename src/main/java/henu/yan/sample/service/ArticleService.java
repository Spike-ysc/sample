package henu.yan.sample.service;

import henu.yan.sample.model.Article;
import henu.yan.sample.model.ArticlePage;
import henu.yan.sample.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@CacheConfig(cacheNames = "article_cache")    //使用的Ehcache策略，定义在ehcache.xml中
@Service
public class ArticleService {

    @Autowired
    ArticleRepository articleRepository;


    @Cacheable  //缓存该方法
    public Page<Article> queryArticleByTime(Integer page, Integer size){
        return articleRepository.findAllByOrderByUpdateTimeDesc(PageRequest.of(page, size));
    }

    @Cacheable  //缓存该方法
    public Page<ArticlePage> queryArticlePage(Integer page, Integer size){
        return articleRepository.findAllArticle(
                PageRequest.of(page, size,Sort.by(Sort.Direction.DESC, "updateTime")));
    }
    @Cacheable  //缓存该方法
    public Article queryArticleContent(Integer id){
        return articleRepository.findContent(id);
    }
}
