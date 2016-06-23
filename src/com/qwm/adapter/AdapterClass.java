package com.qwm.adapter;

/**
 * Created by qiwenming on 16/6/24.
 * 类Adapter模式
 */

class Adaptee2{
    public void specificRequest(){
        System.out.println("class Adapter Pattern 特殊请求");
    }
}

/**
 * 客户希望的接口
 */
interface Target2{
    void request();
}

/**
 * 适配器类: 这里是和对象适配器最大的区别, 类适配器采用的是多重继承
 */
class Adapter2 extends Adaptee2 implements Target2{
    @Override
    public void request() {
        specificRequest();
    }
}

class Client2{
    public static void main(String[] args){
        Target2 target2 = new Adapter2();
        target2.request();
    }
}