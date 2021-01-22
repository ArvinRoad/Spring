package com.Demo.demo04;

import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//万能的代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //代理一个接口
    private Object target;
    public void setTarget(Object target) {
        this.target = target;
    }

    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    //处理代理实例，返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //通过反射来输出日志
        log(method.getName());
        Object result = method.invoke(target,args);
        return result;
    }

    public void log(String msg){
        System.out.println("[BeBug] 执行了"+msg+"方法");
    }
}