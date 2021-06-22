package Iterator.Pattern;

public interface Iterator {
    Object first();
    Object last();
    Object next();
    Object previous();
    boolean hasNext();
    Object currentItem();
}
