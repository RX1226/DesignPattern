package Iterator.Pattern;

public interface Iteratorable {
    public void add(Object object);
    public void remove(Object object);
    Iterator createIterator();
}