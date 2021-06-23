package Composite.Safe;

import Composite.Safe.Parrern.Composite;
import Composite.Safe.Parrern.Leaf;

/**
 合成模式 Composite Pattern
 以樹狀結構來處理資料
 以節點的方式來看待資料Component
 但是有分成下方無物件的Leaf
 與下放有子物件的Composite角色
 安全式合成模式
 管理聚集的方式只存在composite之中
 使用者不會因為呼叫Leaf而去控制聚集
 優點是不會發生使用錯誤
 缺點是不夠透明
 */
public class SafeCompositePattern {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        Composite node1 = new Composite("node1");
        Composite node2 = new Composite("node2");
        Leaf leaf1_1 = new Leaf("leaf1-1");
        Leaf leaf1_2 = new Leaf("leaf1-2");
        Leaf leaf2_1 = new Leaf("leaf2-1");
        Leaf leaf2_2 = new Leaf("leaf2-2");
        Leaf leaf2_3 = new Leaf("leaf2-3");
        root.addChild(node1);
        root.addChild(node2);
        node1.addChild(leaf1_1);
        node1.addChild(leaf1_2);
        node2.addChild(leaf2_1);
        node2.addChild(leaf2_2);
        node2.addChild(leaf2_3);
        root.printStruct("");
    }
}
