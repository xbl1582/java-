package com.bili.design.behavioral.state_pattern;

/**
 * <p>
 *  具体状态角色
 * </p>
 * 类名：
 * 说明:
 *
 * @author xbl
 * @version V1.0.0
 * 日期: 2023/6/16/15:05/星期五
 */
public class Concretestate  extends  State{
    @Override
    public void handle1() {
        //设置当前状态为state2
        super.context.setCurrentState(Context.STATE1);

        //过渡到state2状态由context实现
        super.context.handle2();

    }

    @Override
    public void handle2() {
        //本状态下处理的逻辑
    }
}
