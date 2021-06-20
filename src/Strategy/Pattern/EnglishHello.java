package Strategy.Pattern;

public class EnglishHello implements SocialBehavior{
    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}