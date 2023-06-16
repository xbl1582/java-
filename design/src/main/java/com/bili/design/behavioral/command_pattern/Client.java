package com.bili.design.behavioral.command_pattern;

/**
 * <p>
 * 文件描述
 * </p>
 * 类名：
 * 说明:
 *
 * @author xbl
 * @version V1.0.0
 * 日期: 2023/6/16/15:20/星期五
 */
public class Client {
    public static void main(String[] args) {
        //首先声明调用者Invoker
        Invoker invoker=new Invoker();
        //接收者
        Receiver receiver =new ConcreteReciver1();
        //定义一个发送接收者的命令
        Command command=new ConcreteCommand(receiver);
        //把命令交给调用者去执行
        invoker.setCommand(command);
        invoker.action();
    }
}
