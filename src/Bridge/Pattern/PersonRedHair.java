package Bridge.Pattern;

public class PersonRedHair extends Person{
    @Override
    String getHairColor() {
        return hairColor.getColor();
    }
}
