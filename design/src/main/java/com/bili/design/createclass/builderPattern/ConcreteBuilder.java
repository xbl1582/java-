package com.bili.design.createclass.builderPattern;

/**
 * <p>
 *  具体建造类
 * </p>
 * 类名：
 * 说明:
 *
 * @author xbl
 * @version V1.0.0
 * 日期: 2023/6/16/14:19/星期五
 */
public class ConcreteBuilder implements  Builder {
    private  Product product=new Product();

    @Override
    public void builderPart() {
        /**
         *产品内部逻辑结构
         */

    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
