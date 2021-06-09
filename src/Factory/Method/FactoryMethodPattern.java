package Factory.Method;

import Factory.Method.Pattern.FactoryA;
import Factory.Method.Pattern.FactoryB;
import Factory.Simple.Pattern.Product;

/**
 工廠方法模式 Factory Method Pattern
 將不同產品由不同的工廠去產出
 解決了簡單工廠模式的耦合性
 */
public class FactoryMethodPattern {
    public static void main(String[] args) {
        Product productA = new FactoryA().getProduct();
        System.out.println(productA.getName());

        Product productB = new FactoryB().getProduct();
        System.out.println(productB.getName());
    }
}
