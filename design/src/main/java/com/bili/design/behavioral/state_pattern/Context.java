package com.bili.design.behavioral.state_pattern;

/**
 * <p>
 * 角色
 * </p>
 * 类名：
 * 说明:
 *
 * @author xbl
 * @version V1.0.0
 * 日期: 2023/6/16/15:04/星期五
 */
public class Context {
    //定义状态
    public final static State STATE1=new Concretestate();

//    public final static State STATE2=new Concretestate2();
    //当前状态
    private State CurrentState;
    public State getCurrentState(){
        return  CurrentState;

    }
    //设置当前状态
    public void setCurrentState(State currentState){
        this.CurrentState=currentState;
        this.CurrentState.setContext(this);
    }
    //行为委托
    public void handle1(){
        this.CurrentState.handle1();
    }
    public  void handle2(){
        this.CurrentState.handle2();
    }

}
