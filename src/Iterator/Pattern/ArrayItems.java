package Iterator.Pattern;

public class ArrayItems implements Iteratorable{
    private Object[] items = new Object[10];
    private int index;

    @Override
    public void add(Object object) {
        if(index < items.length)
        items[index++] = object;
    }

    @Override
    public void remove(Object object) {
        for(int i = 0; i < items.length; i++){
            if(items[i].equals(object)){
                int last = items.length - 1;
                if (last - i >= 0) System.arraycopy(items, i + 1, items, i, last - i);
                items[last] = 0;
            }
        }
        index = 0;
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIterator(items);
    }
}
