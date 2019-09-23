package com.zimug.bootlaunch.model;

import com.fasterxml.jackson.annotation.*;
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


@JsonPropertyOrder(value = {"content","title"})
public class Article {

    @JsonIgnore
    private long id;

    //@JsonProperty("auther")
    private String author;
    private String title;
    private String content;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    private List<Reader> reader;

}
