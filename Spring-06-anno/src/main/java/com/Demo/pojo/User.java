package com.Demo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component等价于在applicationContext.xml中写入<bean id="user" class="com.Demo.pojo.User/>">
@Component
public class User {

    @Value("Arvin")
    public String name;

    public void setName(String name) {
        this.name = name;
    }
}
