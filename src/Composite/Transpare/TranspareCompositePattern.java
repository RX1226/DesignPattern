package Composite.Transpare;

import Composite.Transpare.Parrern.Component;
import Composite.Transpare.Parrern.Composite;
import Composite.Transpare.Parrern.Leaf;

/**
 合成模式 Composite Pattern
 以樹狀結構來處理資料
 以節點的方式來看待資料Component
 但是有分成下方無物件的Leaf
 與下放有子物件的Composite角色
 透明式合成模式
 透明合成模式則是讓所有的Leaf也繼承相同Component功能
 讓客戶在使用時不用區分是leaf或是component
 */
public class TranspareCompositePattern {
    public static void main(String[] args) {
        Component root = new Composite("root");
        Component node1 = new Composite("node1");
        Component node2 = new Composite("node2");
        Component leaf1_1 = new Leaf("leaf1-1");
        Component leaf1_2 = new Leaf("leaf1-2");
        Component leaf2_1 = new Leaf("leaf2-1");
        Component leaf2_2 = new Leaf("leaf2-2");
        Component leaf2_3 = new Leaf("leaf2-3");
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
