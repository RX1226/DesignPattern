package Strategy.pattern;

public class Person {
    private SocialBehavior socialBehavior;

    public void sayHello(){
        if(socialBehavior != null){
            socialBehavior.sayHello();
        }
    }

    public void setSocialBehavior(SocialBehavior socialBehavior){
        this.socialBehavior = socialBehavior;
    }
}
