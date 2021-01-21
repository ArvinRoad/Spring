package com.Demo.demo02;

//真实对象
public class UserServiceImpl  implements UserService{
    public void add() {
        System.out.println("增加了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void update() {
        System.out.println("改正了一个用户");
    }

    public void query() {
        System.out.println("查找了一个用户");
    }
}
