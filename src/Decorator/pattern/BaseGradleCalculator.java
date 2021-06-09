package Decorator.pattern;
/**
 主要精神
 */
public class BaseGradleCalculator implements GradleCalculator{
    private int gradle;
    public BaseGradleCalculator(int gradle){
        this.gradle = gradle;
    }
    @Override
    public int getGradle() {
        return gradle;
    }
}
