package com.bili.design.behavioral.visitor_pattern;

/**
 * <p>
 * 文件描述
 * </p>
 * 类名：
 * 说明:
 *
 * @author xbl
 * @version V1.0.0
 * 日期: 2023/6/16/14:46/星期五
 */
public interface Visitor {
    //可以访问哪些对象
    void visit(ConcreateElement concreateElement);
//    可以访问哪些对象
//    void visit(ConcreateElement2 concreateElement2);
}
