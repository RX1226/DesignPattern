package Flyweight;

import Flyweight.Pattern.PlantManager;
import Flyweight.Pattern.StudentManager;

/**
 享元模式/蠅量級模式 Flyweight Pattern
 把需要量產的物件獨立出來只保留功能
 再用一個管理物件來記錄原本要產生物件的狀態
 在數量越多的時候越可以省下更多的空間
 */
public class FlyweightPattern {
    public static void main(String[] args) {
        //單純享元模式
        StudentManager manager = new StudentManager();
        manager.addStudent("001");
        manager.addStudent("002");
        manager.addStudent("003");
        manager.showAllStudent();

        //複合享元模式
        PlantManager plantManager = new PlantManager();
        plantManager.addPlant("flower", "rose");
        plantManager.addPlant("flower", "lily");
        plantManager.addPlant("tree", "pine");
        plantManager.showAllPlant();
    }
}
