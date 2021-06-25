package Prototype.Pattern;

public class Prototype implements Cloneable{
    public shallow shallow = new shallow();
    public Deep deep = new Deep();

    public Prototype clone() throws CloneNotSupportedException{
        Prototype prototype = (Prototype)super.clone();
        prototype.deep = deep.clone(); // deep copy需要多添加
        return prototype;
    }
}
