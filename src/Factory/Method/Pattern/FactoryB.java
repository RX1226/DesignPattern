package Factory.Method.Pattern;

import Factory.Simple.Pattern.Product;
import Factory.Simple.Pattern.ProductB;

public class FactoryB implements NewFactory{
    @Override
    public Product getProduct() {
        return new ProductB();
    }
}
