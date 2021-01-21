package com.Demo.config;

import com.Demo.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration  //代表这是一个配置类
@ComponentScan("com.Demo.pojo") //扫描包
@Import(dConfig2.class) //导入配置类
public class dConfig {

    @Bean   //Bean标签
    public User getUser(){  //BeanID属性
        return new User();  //返回class属性
    }
}
