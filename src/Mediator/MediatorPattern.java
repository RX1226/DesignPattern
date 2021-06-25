package Mediator;

import Mediator.Pattern.Mediator;
import Mediator.Pattern.MessagerA;
import Mediator.Pattern.MessagerB;

/**
 中介者模式 Mediator Pattern
 將原本互相溝通的物件
 改由透過中介者或管理者來溝通
 優點: 物件彼此鬆綁, 簡化維護
 缺點: 如果要處理的邏輯或使用過多的東西, 會使中介者變得複雜
 */
public class MediatorPattern {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        MessagerA messagerA = new MessagerA(mediator);
        MessagerB messagerB = new MessagerB(mediator);
        mediator.addUser("A", messagerA);
        mediator.addUser("B", messagerB);
        messagerA.send("B", "How are you?");
        messagerB.send("A", "I am fine, thank you.");
    }
}
