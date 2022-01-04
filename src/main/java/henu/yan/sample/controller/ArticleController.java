package henu.yan.sample.controller;

import henu.yan.sample.model.Article;
import henu.yan.sample.model.ArticlePage;
import henu.yan.sample.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

    @Autowired
    ArticleService articleService;


    @GetMapping("/api/article/time")
    public Page<Article> articlesByTime(
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "size", defaultValue = "24") Integer size){
        return articleService.queryArticleByTime(page, size);
    }

    @GetMapping("/api/article/page")
    public Page<ArticlePage> articlePagesByTime(
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "size", defaultValue = "24") Integer size){
        return articleService.queryArticlePage(page, size);
    }
    @GetMapping("/api/article/content")
    public Article articleContent(
            @RequestParam(value = "id") Integer id){
        return articleService.queryArticleContent(id);
    }

}
