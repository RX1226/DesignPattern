package Factory.Abstract;

import Factory.Abstract.Pattern.FactoryA;
import Factory.Abstract.Pattern.FactoryB;
import Factory.Abstract.Pattern.ProductA;
import Factory.Abstract.Pattern.ProductB;

/**
 抽象工廠模式 Factory Method Pattern
 每個產品會有一個父介面或抽象類別
 每個工廠可以去實做所有的產品
 */
public class AbstractFactoryPattern {
    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        ProductA productA = factoryA.createProductA();
        ProductB productB = factoryA.createProductB();
        System.out.println(productA.cost);
        System.out.println(productB.value);

        FactoryB factoryB = new FactoryB();
        productA = factoryB.createProductA();
        productB = factoryB.createProductB();
        System.out.println(productA.cost);
        System.out.println(productB.value);
    }
}