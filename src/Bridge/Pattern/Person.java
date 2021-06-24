package Bridge.Pattern;

public abstract class Person {
    protected Color hairColor;
    public void setHairColor(Color hairColor){
        this.hairColor = hairColor;
    }

    abstract String getHairColor();
}
