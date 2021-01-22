package com.Demo.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

//后置日志
public class AfterLog implements AfterReturningAdvice {
    //这个和Log.java调用的一样，只是多了一个返回值。returnValue;返回值
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了"+method.getName()+"方法，返回结果为："+returnValue);
    }
}
