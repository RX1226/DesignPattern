package Factory.Simple.Pattern;

public class Factory {
    public static Product getProduct(String type){
        switch (type){
            case "A": return new ProductA();
            case "B": return new ProductB();
            default: return null;
        }
    }
}
