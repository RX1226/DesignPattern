package Factory.Abstract.Pattern;

public class FactoryA extends AbstractFactory{
    @Override
    public ProductA createProductA() {
        return new ProductA(10);
    }

    @Override
    public ProductB createProductB() {
        return new ProductB(15);
    }
}
