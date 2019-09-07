package com.zimug.bootlaunch.controller;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Desription:
 *
 * @ClassName test
 * @Author Zhanyuwei
 * @Date 2019/8/21 20:16
 * @Version 1.0
 **/

@NoArgsConstructor
@Data
public class test {


    /**
     * id : 1
     * author : zimug
     * title : 手摸手教你开发spring boot
     * content : c
     * createTime :
     * reader : [{"name":"zimug","age":18},{"name":"kobe","age":37}]
     */

    private int id;
    private String author;
    private String title;
    private String content;
    private String createTime;
    private List<ReaderBean> reader;

    @NoArgsConstructor
    @Data
    public static class ReaderBean {
        /**
         * name : zimug
         * age : 18
         */

        private String name;
        private int age;
    }
}
