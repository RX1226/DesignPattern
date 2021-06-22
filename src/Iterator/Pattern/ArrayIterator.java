package Iterator.Pattern;

import java.util.List;

public class ArrayIterator implements Iterator{
    private Object[] list;
    private int index = -1;
    public ArrayIterator(Object[] list){
        this.list = list;
    }
    @Override
    public Object first() {
        index = 0;
        return list[0];
    }

    @Override
    public Object last() {
        return list[list.length - 1];
    }

    @Override
    public Object next() {
        return (list != null && index < list.length - 1) ? list[++index] : null;
    }

    @Override
    public Object previous() {
        return (list != null && index > 0) ? list[--index] : null;
    }

    @Override
    public boolean hasNext() {
        return !(list == null || index >= list.length) && list[index + 1] != null;
    }

    @Override
    public Object currentItem() {
        return list[index];
    }
}
