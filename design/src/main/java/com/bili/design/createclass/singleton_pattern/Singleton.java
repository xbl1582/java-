package com.bili.design.createclass.singleton_pattern;

/**
 * <p>
 *  单例模式
 * </p>
 * 类名：
 * 说明:
 *
 * @author xbl
 * @version V1.0.0
 * 日期: 2023/6/16/14:13/星期五
 */
public class Singleton {
    private static  Singleton singleton=null;
    //私有化构造方法
    private Singleton(){

    }
    //提供访问接口
    public static  Singleton getSingleton(){
        if(singleton==null){
            singleton=new Singleton();
            return singleton;
        }else{
            return singleton;
        }
    }

}
