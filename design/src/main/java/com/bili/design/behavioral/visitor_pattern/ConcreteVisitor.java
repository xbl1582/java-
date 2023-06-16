package com.bili.design.behavioral.visitor_pattern;

/**
 * <p>
 *  具有访问类
 * </p>
 * 类名：
 * 说明:
 *
 * @author xbl
 * @version V1.0.0
 * 日期: 2023/6/16/14:47/星期五
 */
public class ConcreteVisitor implements  Visitor{
    @Override
    public void visit(ConcreateElement concreateElement) {
        concreateElement.dosomething();
    }
    /**
     *     @Override
     *     public void visit(ConcreateElement2 concreateElement2) {
     *         concreateElement2.dosomething();
     *     }
     */
}
