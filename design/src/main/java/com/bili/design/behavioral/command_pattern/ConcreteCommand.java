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
 * 日期: 2023/6/16/15:19/星期五
 */
public class ConcreteCommand extends Command {
    //对哪个Receiver类进行命令处理
    private  Receiver receiver;
    //构造函数传递接收者
    public ConcreteCommand(Receiver _receiver){
        this.receiver=_receiver;
    }
    //必须实现一个命令
    public  void execute(){
        //业务处理
        this.receiver.doSomething();
    }

}
