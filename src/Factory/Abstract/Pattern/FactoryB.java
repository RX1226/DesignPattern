package Factory.Abstract.Pattern;

public class FactoryB extends AbstractFactory{
    @Override
    public ProductA createProductA() {
        return new ProductA(20);
    }

    @Override
    public ProductB createProductB() {
        return new ProductB(30);
    }
}
