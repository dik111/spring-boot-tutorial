package com.zimug.bootlaunch.controller;

        import com.zimug.bootlaunch.model.Article;
        import lombok.extern.java.Log;
        import lombok.extern.slf4j.Slf4j;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Article hello(String name) {

        Article article = new Article();

        article.setAuthor("字母哥");

        Article article1 = Article.builder().id(10l).author("莫言").build();

        log.info("测试一下"+article1);

        return article1;
    }
}