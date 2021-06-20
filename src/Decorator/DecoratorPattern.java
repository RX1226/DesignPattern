package Decorator;

import Decorator.Pattern.BaseGradleCalculator;
import Decorator.Pattern.EasyCalculator;
import Decorator.Pattern.GradleCalculator;
import Decorator.Pattern.HardCalculator;

/**
 利用物件導向傳址的特性
 可以動態的針對類別的某個對象添加功能
 比繼承子類別更加的靈活
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        GradleCalculator calculator = new BaseGradleCalculator(60);
        System.out.println("Base Gradle = " + calculator.getGradle());

        calculator = new HardCalculator(calculator);
        System.out.println("Hard Gradle = " + calculator.getGradle());

        //會一直累加前面的操作
        calculator = new EasyCalculator(calculator);
        System.out.println("Easy Gradle = " + calculator.getGradle());
    }
}
