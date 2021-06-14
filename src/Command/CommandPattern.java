package Command;

import Command.Pattern.*;

/**
 * 將不同的指令物件化
 * 透過中間人傳遞給讓執行者
 * 執行者按照指示去執行本能能做的動作
 */

public class CommandPattern {
    public static void main(String[] args) {
        //建立執行者
        Reciever receiver1 = new Reciever();
        Reciever receiver2 = new Reciever();
        //建立命令並指派給誰
        Command command1 = new WorkCommand(receiver1);
        Command command2 = new RestCommand(receiver2);
        //Invoker只要負責將命令轉達並讓接手者執行就好
        Invoker invoker = new Invoker();
        invoker.setCommand(command1);
        invoker.setCommand(command2);
        invoker.executeCommand();
    }
}
