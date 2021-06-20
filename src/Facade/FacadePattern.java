package Facade;


import Facade.Pattern.FlowFacade;

/**
 表象模式 Facade Pattern
 只提供一個接口, 將一系列的接口包裝起來
 讓系統更方便使用
 */
public class FacadePattern {
    public static void main(String[] args) {
        FlowFacade flowFacade = new FlowFacade();
        flowFacade.todo();
    }
}
