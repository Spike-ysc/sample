package henu.yan.sample.repository;

import henu.yan.sample.model.Article;
import henu.yan.sample.model.ArticlePage;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface ArticleRepository extends PagingAndSortingRepository<Article, Integer> {


    /**
     * 查询article表中id相同的文章
     * @param id 要查询的文章id
     * @return  匹配到的文章
     */
    @RestResource(path = "id", rel = "id")
    Article findByIdEquals(@Param("id") int id);

    @Query(value = "select a from article a where a.id = ?1")
    Article findContent(Integer id);

    /***
     * 按照文章更新时间返回文章列表
     * @param p 页数和每页数量
     * @return 文章列表
     */
    @RestResource(path = "time", rel = "time")
    Page<Article> findAllByOrderByUpdateTimeDesc(Pageable p);

    @Transactional
    @Query(value = "select new henu.yan.sample.model.ArticlePage(a.id, a.title, a.head, a.source, a.message, a.tags, a.author, a.updateTime) " +
            "from article a ")
    Page<ArticlePage> findAllArticle( Pageable p);


    /***
     * 根据分类和文章内容返回文章列表
     * @param tags 分类
     * @param p 页数和煤业数量
     * @return 文章列表
     */
    @RestResource(path = "tags", rel = "tags")
    Page<Article> findAllByTagsContainingOrderByUpdateTimeDesc(String tags, Pageable p);

}
