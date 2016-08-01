package com.qwm.strategy;
/**
 * @author: qiwenming
 * @date: 16/8/1 下午3:38
 * @className: Client
 * @description: 客户
 */
public class Client {
   public static void main(String[] args){
       Context context;
       //选择算法------------
       //普通用户
       context = new Context(new ConcreteStrategyA());
       context.contextInterface();

       //vip
       context = new Context(new ConcreteStrategyB());
       context.contextInterface();

       //vvip
       context = new Context(new ConcreteStrategyC());
       context.contextInterface();
   }
}
