package Factory.Method.Pattern;

import Factory.Simple.Pattern.Product;
import Factory.Simple.Pattern.ProductA;

public class FactoryA implements NewFactory{
    @Override
    public Product getProduct() {
        return new ProductA();
    }
}
