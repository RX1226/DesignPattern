package Composite.Safe.Parrern;

public class Leaf implements Component {
    private String name;
    public Leaf(String name){
        this.name = name;
    }

    @Override
    public void printStruct(String struct) {
        System.out.println(struct + "-" + name);
    }
}
