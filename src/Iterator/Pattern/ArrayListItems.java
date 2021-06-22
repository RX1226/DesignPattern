package Iterator.Pattern;

import java.util.ArrayList;
import java.util.List;

public class ArrayListItems implements Iteratorable{
    private List<Object> items = new ArrayList<>();

    @Override
    public void add(Object object) {
        items.add(object);
    }

    @Override
    public void remove(Object object) {
        items.remove(object);
    }

    @Override
    public Iterator createIterator() {
        return new ArrayListIterator(items);
    }
}
