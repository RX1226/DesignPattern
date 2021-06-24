package Flyweight;

import Flyweight.Pattern.PlantManager;
import Flyweight.Pattern.StudentManager;

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
