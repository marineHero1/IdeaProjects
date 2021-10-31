package com.yuan.demo01;

public class Proxy implements Rent {

    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        signContact();
    }

    public void seeHouse(){
        System.out.println("看房子");
    }
    public void signContact(){
        System.out.println("签订合同");
    }
}
