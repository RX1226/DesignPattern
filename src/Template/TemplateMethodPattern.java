package Template;

import Template.Pattern.FlowA;
import Template.Pattern.FlowB;

/**
 樣板方法模式 Template Method Pattern
 使用抽象父類別把重復的地方拉出來
 不同的地方使用抽象方法由子類別實踐
 */
public class TemplateMethodPattern {
    public static void main(String[] args) {
        new FlowA().flow();

        new FlowB().flow();
    }
}
