package Prototype.Pattern;

public class Deep implements Cloneable{
    public String name;

    public Deep clone() throws CloneNotSupportedException{
        return (Deep) super.clone();
    }
}
