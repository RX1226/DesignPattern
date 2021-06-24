package Bridge.Pattern;

public class PersonBlackHair extends Person{
    @Override
    String getHairColor() {
        return hairColor.getColor();
    }
}
