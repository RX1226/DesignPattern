package Iterator.Pattern;

import java.util.List;

public class ArrayListIterator implements Iterator{
    private List<Object> list;
    private int index = -1;
    public ArrayListIterator(List<Object> list){
        this.list = list;
    }
    @Override
    public Object first() {
        index = 0;
        return list.get(0);
    }

    @Override
    public Object last() {
        return list.get(list.size() - 1);
    }

    @Override
    public Object next() {
        return hasNext()?list.get(++index) : null;
    }

    @Override
    public Object previous() {
        return (index > 0) ? list.get(--index) : null;
    }

    @Override
    public boolean hasNext() {
        return (index < list.size() - 1);
    }

    @Override
    public Object currentItem() {
        return list.get(index);
    }
}
