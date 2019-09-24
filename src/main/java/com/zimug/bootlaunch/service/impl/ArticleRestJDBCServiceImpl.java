package com.zimug.bootlaunch.service.impl;

import com.zimug.bootlaunch.dao.ArticleJDBCDAO;
import com.zimug.bootlaunch.model.Article;
import com.zimug.bootlaunch.service.ArticleRestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class ArticleRestJDBCServiceImpl implements ArticleRestService {

    @Resource
    ArticleJDBCDAO articleJDBCDAO;

    @Resource
    JdbcTemplate primaryJdbcTemplate;

    @Resource
    JdbcTemplate secondaryJdbcTemplate;

    @Override
    @Transactional
    public Article saveArticle(Article article) {
        articleJDBCDAO.save(article,primaryJdbcTemplate);
        articleJDBCDAO.save(article,secondaryJdbcTemplate);
        //int a = 2/0；
        return article;
    }

    @Override
    public void deleteArticle(Long id){

        articleJDBCDAO.deleteById(id,primaryJdbcTemplate);
        articleJDBCDAO.deleteById(id,secondaryJdbcTemplate);
    }

    @Override
    public void updateArticle(Article article){

        articleJDBCDAO.updateById(article,primaryJdbcTemplate);
        articleJDBCDAO.updateById(article,secondaryJdbcTemplate);
    }

    @Override
    public Article getArticle(Long id){

        articleJDBCDAO.findById(id,secondaryJdbcTemplate);
        return articleJDBCDAO.findById(id,primaryJdbcTemplate);

    }

    @Override
    public List<Article> getAll(){
        articleJDBCDAO.findAll(secondaryJdbcTemplate);
        return articleJDBCDAO.findAll(primaryJdbcTemplate);
    }
}
