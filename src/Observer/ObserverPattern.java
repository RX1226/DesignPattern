package Observer;

import Observer.pattern.Soldier;
import Observer.pattern.SoldierLeader;

/**
 觀察者模式 ObserverPattern
 定義了物件一對多的關係
 被觀察的目標發生狀態改變時
 其他觀察者都會收到通知
 */
public class ObserverPattern {
    public static void main(String[] args) {
        SoldierLeader leader = new SoldierLeader();
        Soldier s01 = new Soldier(1);
        Soldier s02 = new Soldier(2);

        leader.subscribe(s01);
        leader.subscribe(s02);
        leader.notifyObserver();

        leader.unsubscribe(s01);
        leader.unsubscribe(s02);
        leader.notifyObserver();
    }
}
