package com.bili.design.behavioral.observer_pattern;

/**
 * <p>
 * 文件描述
 * </p>
 * 类名：
 * 说明:
 *
 * @author xbl
 * @version V1.0.0
 * 日期: 2023/6/16/15:45/星期五
 */
public class Client {
    public static void main(String[] args) {
        //创建一个被观察者
        ConcreteSubject subject=new ConcreteSubject();
        //定义一个观察者
        Observer obs=new ConcreteObserver();
        //观察者观察被观察
        subject.addObserver(obs);
        subject.doSomething();
    }
}
