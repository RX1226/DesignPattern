package Strategy;

import Strategy.pattern.ChineseHello;
import Strategy.pattern.Person;

/**
 策略模式 StrategyPattern
 定義了原本物件內演算法的行為
 並將其封裝起來使得替換演算法內部分行為
 不會影響到使用演算法的程式
 */
public class StrategyPattern {
    public static void main(String[] args) {
        Person american = new Person();
        american.setSocialBehavior(new ChineseHello());
//        american.setSocialBehavior(new EnglishHello());
        american.sayHello();
    }
}
