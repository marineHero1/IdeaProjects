package com.yuan.demo01;

public class Client {
    public static void main(String[] args) {
        //真实角色，房东想要租房子
        Host host = new Host();
        //代理角色，中介帮助房东租房子，同时还有一些附属操作
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
