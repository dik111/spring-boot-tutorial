package com.zimug.bootlaunch.yaml;

import lombok.Data;

import java.util.List;

/**
 * Desription:
 *
 * @ClassName Child
 * @Author Zhanyuwei
 * @Date 2019/9/23 21:03
 * @Version 1.0
 **/
@Data
public class Child {

    private String name;

    private Integer age;

    private List<Friend> friends;
}
