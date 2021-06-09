package Factory.Simple;

import Factory.Simple.Pattern.Factory;
import Factory.Simple.Pattern.Product;

/**
 簡單工廠模式 Simple Factory Pattern
 產品會共用一個相同的父類別或介面
 按照不同輸入的參數回傳不同的物件
 */
public class SimpleFactoryPattern {
    public static void main(String[] args) {
        Product productA = Factory.getProduct("A");
        assert productA != null;
        System.out.println(productA.getName());

        Product productB = Factory.getProduct("B");
        assert productB != null;
        System.out.println(productB.getName());
    }
}
