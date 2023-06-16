package com.bili.design.createclass.prototype_pattern;

/**
 * <p>
 *  原型拷贝
 * </p>
 * 类名：
 * 说明:
 *
 * @author xbl
 * @version V1.0.0
 * 日期: 2023/6/16/14:32/星期五
 */
public class ConcretePrototype  implements  Prototype{
    @Override
    public Prototype clone() {
        Prototype prototype=null;
        try{
            prototype= (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
