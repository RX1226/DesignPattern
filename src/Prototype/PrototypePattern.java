package Prototype;

import Prototype.Pattern.Prototype;

/**
 * 原型/雛形模式 Prototype Pattern
 * 透過複製的方式來建立物件, 而不是建立新物件
 * 可以降低系統負擔
 * 如果被複製的物件上有物件, 需要一併建立新物件時
 * 就要用深層複製才可以連物件本體一起複製
 * 優點: 隱藏實例創造的過程, 並可以讓複製物件更快更省時
 * 缺點: 有些程式語言已經有對應的語法可以達到相同效果
 * 被複製的物件每個都需要時作clone方法
 */
public class PrototypePattern {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype a = new Prototype();
        a.shallow.name = "本體shallow";
        a.deep.name = "本體deep";
        Prototype b = a.clone();
        b.shallow.name = "複製體shallow";
        b.deep.name = "複製體deep";
        System.out.println("a shallow = " + a.shallow.name);
        System.out.println("b shallow = " + b.shallow.name);
        System.out.println("a deep = " + a.deep.name);
        System.out.println("b deep = " + b.deep.name);
    }
}
