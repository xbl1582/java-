package com.bili.design.behavioral.state_pattern;

/**
 * <p>
 *  场景
 * </p>
 * 类名：
 * 说明:
 *
 * @author xbl
 * @version V1.0.0
 * 日期: 2023/6/16/15:15/星期五
 */
public class Client {
    public static void main(String[] args) {
        //定义环境角色
        Context context=new Context();
        //初始化状态
        context.setCurrentState(new Concretestate());
        //行为执行
        context.handle1();
        context.handle2();
    }
}
