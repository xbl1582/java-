package com.bili.design.behavioral.visitor_pattern;

/**
 * <p>
 *  具体元素
 * </p>
 * 类名：
 * 说明:
 *
 * @author xbl
 * @version V1.0.0
 * 日期: 2023/6/16/14:47/星期五
 */
public class ConcreateElement extends  Element{
    //完善业务逻辑
    @Override
    public void dosomething() {
        //业务处理
    }
    //允许那个访问
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
