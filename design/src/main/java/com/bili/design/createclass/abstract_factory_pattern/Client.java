package com.bili.design.createclass.abstract_factory_pattern;

/**
 * <p>
 *  用户类
 * </p>
 * 类名：
 * 说明:
 *
 * @author xbl
 * @version V1.0.0
 * 日期: 2023/6/16/13:58/星期五
 */
public class Client {
    AbstractFactory abstractFactory=new CreateFactory();
    AbstractProduct abstractProduct =new CreateProduct();
}
