package com.bili.design.behavioral.visitor_pattern;

/**
 * <p>
 *    场景类
 * </p>
 * 类名：
 * 说明:
 *
 * @author xbl
 * @version V1.0.0
 * 日期: 2023/6/16/14:46/星期五
 */
public class Client {
    public static void main(String[] args) {
        Element element=ObjectStruture.createElement();
        element.accept(new ConcreteVisitor());
    }
}
