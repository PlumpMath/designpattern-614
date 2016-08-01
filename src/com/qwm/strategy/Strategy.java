package com.qwm.strategy;

/**
 * @author: qiwenming
 * @date: 16/8/1 下午3:40
 * @className: Strategy
 * @description: 策略抽象类
 */
public interface Strategy {
    public void algorithmInterface();
}

//===================算法实现部分===============================
class ConcreteStrategyA implements Strategy{

    @Override
    public void algorithmInterface() {
        System.out.println("算法实现A---->普通用户登录");
    }
}

class ConcreteStrategyB implements Strategy{

    @Override
    public void algorithmInterface() {
        System.out.println("算法实现B---->vip用户登录");
    }
}

class ConcreteStrategyC implements Strategy{

    @Override
    public void algorithmInterface() {
        System.out.println("算法实现C----->vvip登录");
    }
}