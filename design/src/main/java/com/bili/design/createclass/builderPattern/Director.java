package com.bili.design.createclass.builderPattern;

/**
 * <p>
 *  调用者
 *
 * </p>
 * 类名：
 * 说明:
 *
 * @author xbl
 * @version V1.0.0
 * 日期: 2023/6/16/14:18/星期五
 */
public class Director {
    private  Builder builder=new ConcreteBuilder();
    //构建不同的产品
    public Product getAProduct(){
        builder.builderPart();
        /**
         * 设置不同的零件，产生不同的产品
         */
        return builder.buildProduct();
    }
}
