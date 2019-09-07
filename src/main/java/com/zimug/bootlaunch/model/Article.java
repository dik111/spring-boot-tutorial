package com.zimug.bootlaunch.model;

import com.zimug.bootlaunch.controller.test;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.List;

/**
 * Desription:
 *
 * @ClassName Article
 * @Author Zhanyuwei
 * @Date 2019/8/20 23:10
 * @Version 1.0
 **/

@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article {
    private long id;
    private String author;
    private String title;
    private String content;
    private Date createTime;
    private List<Reader> reader;

}
