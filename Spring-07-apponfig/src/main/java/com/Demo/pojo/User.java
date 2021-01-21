package com.Demo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Spring容器接管该类
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("Arvin")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
