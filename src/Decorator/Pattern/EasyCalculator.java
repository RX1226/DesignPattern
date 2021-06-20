package Decorator.Pattern;

/**
 主要精神
 繼承之後override該方法
 然後追加功能
 */
public class EasyCalculator extends SuperGradleCalculator{
    public EasyCalculator(GradleCalculator gradleCalculator) {
        super(gradleCalculator);
    }

    @Override
    public int getGradle() {
        add100();
        return super.gradle;
    }

    private void add100(){
        System.out.print("加100分");
        super.gradle += 100;
    }
}
