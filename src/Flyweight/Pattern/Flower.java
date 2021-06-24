package Flyweight.Pattern;

public class Flower extends Plant{
    @Override
    void showName(String name) {
        System.out.println("This flower is " + name);
    }
}
