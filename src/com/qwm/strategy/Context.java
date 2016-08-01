package com.qwm.strategy;
/**
 * @author: qiwenming
 * @date: 16/8/1 下午3:38
 * @className: Context
 * @description: 上下文
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.algorithmInterface();
    }
}
