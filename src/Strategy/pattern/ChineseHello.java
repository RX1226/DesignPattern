package Strategy.pattern;

public class ChineseHello implements SocialBehavior{
    @Override
    public void sayHello() {
        System.out.println("哈囉");
    }
}
