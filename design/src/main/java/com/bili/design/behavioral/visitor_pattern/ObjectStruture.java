package com.bili.design.behavioral.visitor_pattern;

/**
 * <p>
 *      结构对象
 * </p>
 * 类名：
 * 说明:
 *
 * @author xbl
 * @version V1.0.0
 * 日期: 2023/6/16/14:46/星期五
 */
public class ObjectStruture {
    //对象生成器，这里通过一个工厂方法模式模拟
    public static Element createElement(){
        //
        boolean condition=true;
        if(condition){
            return new ConcreateElement();

        }else{
//            return new ConcreateElement2();
            return new ConcreateElement();
        }
    }
}
