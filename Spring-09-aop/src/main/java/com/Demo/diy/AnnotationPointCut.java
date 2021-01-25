package com.Demo.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//通过注解实现AOP

//@Aspect 通过注解标注切面（标注这个类是一个切面）
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.Demo.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("------ 方法执行前 ------");
    }

    @After("execution(* com.Demo.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("------ 方法执行后 ------");
    }

    //在环绕增强中，我们可以指定一个参数。代表我们要获取处理切入的点：(连接点：与切入点匹配的执行点)
    @Around("execution(* com.Demo.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        //获得签名,就是这个类的信息
        Signature signature = jp.getSignature();
        System.out.println("signature："+signature);
        //执行方法 (设置一个异常。这个方法可以想象成是一个过滤器)
        Object proceed = jp.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);
    }
}
