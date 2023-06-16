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
public class Invoker {
    private  Command command;
    //受气包，接收命令
    public void setCommand(Command _command){
        this.command=_command;
    }
    //执行命令
    public void action(){
        this.command.execute();
    }
}
