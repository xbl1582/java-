package com.bili.design.behavioral.state_pattern;

/**
 * <p>
 *  抽线状态角色
 * </p>
 * 类名：
 * 说明:
 *
 * @author xbl
 * @version V1.0.0
 * 日期: 2023/6/16/15:04/星期五
 */
public abstract class State {
    //定义一个环境角色，提供子类访问
    protected  Context context;
    //设置环境角色
     void setContext(Context _context){
        this.context=_context;
    }
    //行为1
    public abstract  void  handle1();
     //行为2
    public abstract  void handle2();

}
