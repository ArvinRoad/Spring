package com.Demo.mapper;

import com.Demo.pojo.User;

import java.util.List;

public interface UserMapper {
    //查询用户
    public List<User> selectUser();
}
