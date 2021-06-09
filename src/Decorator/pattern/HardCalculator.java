package Decorator.pattern;

/**
 主要精神
 繼承之後override該方法
 然後追加功能
 */
public class HardCalculator extends SuperGradleCalculator{
    public HardCalculator(GradleCalculator gradleCalculator) {
        super(gradleCalculator);
    }

    @Override
    public int getGradle() {
        addTen();
        return super.gradle;
    }

    private void addTen(){
        System.out.print("加10分");
        super.gradle += 10;
    }
}
