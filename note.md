## 常用依赖

Spring Maven依赖
```xml
<!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>5.3.2</version>
</dependency>
```

配置依赖
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">
    
    

</beans>
```

junit依赖
```xml
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>
```

## 注解说明
- @Autowired : 自动装配，通过类型(byType)。名字

        如果@Autowired不能唯一自动装配上属性，则需要通过@Qualifier(value="ID")

- @Nullable : 字段标记的注解，说明这个字段可以为null

- @Resource : 自动装配，通过名字(byName)。类型

