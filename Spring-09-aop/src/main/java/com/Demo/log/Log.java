package com.Demo.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

//前置日志
public class Log implements MethodBeforeAdvice {
    //method:要执行的目标对象方法
    //objects:参数
    //target:目标对象
    public void before(Method method, Object[] args, Object target) throws Throwable {
        //目标对象.getClass().getName()~意思就是输出声明类+的+什么方法+被执行了
        System.out.println(target.getClass().getName()+"的"+method.getName()+"被执行了");

    }
}
