package com.qwm.adapter;

/**
 * Created by qiwenming on 16/6/24.
 * 对象Adapter模式
 */

/**
 * 原有的类
 */
class Adaptee{
    public void specificRequest(){
        System.out.println("特殊请求---");
    }
}

/**
 * 客户希望的接口
 */
interface Target{
    void request();
}

/**
 * 适配器
 */
class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}

/**
 * 客户端
 */
class Client{
    public static void main(String[] args){
        Target target = new Adapter();
        target.request();
    }
}