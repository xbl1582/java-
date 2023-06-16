package com.bili.design.createclass.factory_function;

/**
 * <p>
 *  工厂实现类
 * </p>
 * 类名：
 * 说明:
 *
 * @author xbl
 * @version V1.0.0
 * 日期: 2023/6/16/14:05/星期五
 */
public class CreateCreater implements  Creater{
    @Override
    public Product FactoryMethod() {
        return new CreaterProduct();
    }
}
