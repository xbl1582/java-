package com.bili.design.createclass.builderPattern;

/**
 * <p>
 *  建造者
 * </p>
 * 类名：
 * 说明:
 *
 * @author xbl
 * @version V1.0.0
 * 日期: 2023/6/16/14:17/星期五
 */
public interface Builder {
    //设计产品不同部分，以获得不同的产品
    void builderPart();

    Product buildProduct();
}
