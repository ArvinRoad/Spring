package com.Demo.demo04;

import com.Demo.demo02.UserService;
import com.Demo.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();

        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //设置代理对象
        pih.setTarget(userService);

        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();

        proxy.delete();
    }
}
