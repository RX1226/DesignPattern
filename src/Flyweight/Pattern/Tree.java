package Flyweight.Pattern;

public class Tree extends Plant{
    @Override
    void showName(String name) {
        System.out.println("This tree is " + name);
    }
}
