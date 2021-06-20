package Decorator.Pattern;
/**
 主要精神
 */
public abstract class SuperGradleCalculator implements GradleCalculator{
    private GradleCalculator gradleCalculator;
    int gradle;

    SuperGradleCalculator(GradleCalculator gradleCalculator){
        this.gradleCalculator = gradleCalculator;
        this.gradle = gradleCalculator.getGradle();
    }
    @Override
    public int getGradle() {
        gradleCalculator.getGradle();
        return gradle;
    }
}
