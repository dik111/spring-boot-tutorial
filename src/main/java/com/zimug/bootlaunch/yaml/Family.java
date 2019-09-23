package com.zimug.bootlaunch.yaml;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * Desription:
 *
 * @ClassName Family
 * @Author Zhanyuwei
 * @Date 2019/9/23 21:00
 * @Version 1.0
 **/

@Data
@Component
@Validated
@ConfigurationProperties(prefix = "family")
public class Family {

    @Value("${family.family-name}")
    @NotNull
    private String family;

    private Father father;

    private Mother mother;

    private Child child;

}
