package com.bili.design.createclass.abstract_factory_pattern;

/**
 * <p>
 * 具体实现工厂
 * </p>
 * 类名：
 * 说明:
 *
 * @author xbl
 * @version V1.0.0
 * 日期: 2023/6/16/13:59/星期五
 */
public class CreateFactory extends  AbstractFactory {



    @Override
    public AbstractProduct createProduct() {
        return new CreateProduct();
    }
}
