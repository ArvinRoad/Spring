package com.Demo.service;

import com.Demo.dao.UserDao;
import com.Demo.dao.UserDaoImpl;
import com.Demo.dao.UserDaoMysqlImpl;
import com.Demo.dao.UserOracleImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
