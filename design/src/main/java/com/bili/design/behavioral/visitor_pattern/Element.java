package com.bili.design.behavioral.visitor_pattern;

/**
 * <p>
 *  抽象元素
 * </p>
 * 类名：
 * 说明:
 *
 * @author xbl
 * @version V1.0.0
 * 日期: 2023/6/16/14:47/星期五
 */
public abstract class Element {
    //定义业务逻辑
    public abstract void dosomething();
    //允许谁来访问
    public abstract void accept(Visitor visitor);
}
