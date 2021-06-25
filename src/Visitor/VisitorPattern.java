package Visitor;

import Visitor.Pattern.*;

/**
 * 訪問者/參觀者模式 Visitor Pattern
 * 處理事情的物件固定但要處理的東西
 * 常常會變化操作程序則適合使用
 * 優點: 加入新操作容易, 且無須改變結構本身
 * 缺點: 結構上互相綁定相依, 要修改時困難
 */
public class VisitorPattern {
    public static void main(String[] args) {
        Handler handler = new Handler();
        //添加功能
        handler.addFunction(new FunctionA());
        handler.addFunction(new FunctionB());
        //添加拜訪者執行所有添加功能
        handler.runFunction(new VistorA());
        handler.runFunction(new VistorB());
    }
}
