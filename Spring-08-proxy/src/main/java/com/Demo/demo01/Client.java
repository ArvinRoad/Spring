package com.Demo.demo01;

public class Client {
    public static void main(String[] args) {
        //房东要租房子
        Host host = new Host();
        //代理，中介帮房东租房子
        Proxy proxy = new Proxy(host);
        //你直接找中介即可
        proxy.rent();
    }
}
