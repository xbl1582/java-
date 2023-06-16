package com.bili.design.behavioral.observer_pattern;

import java.util.Vector;

/**
 * <p>
 * 文件描述
 * </p>
 * 类名：
 * 说明:
 *
 * @author xbl
 * @version V1.0.0
 * 日期: 2023/6/16/15:44/星期五
 */
public abstract class Subject {
    //定义一个观察者数组
    private Vector<Observer> observerVector=new Vector<>();
    //增加一个观察者
    public void addObserver(Observer o){
        this.observerVector.add(o);
    }
    //删除一个观察者
    public void delObserver(Observer o){
        this.observerVector.remove(o);
    }
    //通知所有观察者
    public void notifyObservers(){
        for(Observer o:this.observerVector){
            o.update();
        }
    }

}
