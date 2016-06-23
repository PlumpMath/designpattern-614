package com.qwm.facade;

/**
 * Created by qiwenming on 16/6/23.
 * 客户端
 */
public class Client {
    public static void main(String[] args){
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
