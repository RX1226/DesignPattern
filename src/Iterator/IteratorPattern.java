package Iterator;

import Iterator.Pattern.ArrayItems;
import Iterator.Pattern.ArrayListItems;
import Iterator.Pattern.Iterator;

/**
 疊代器模式 Iterator Pattern
 可以依序取得物件集合內的元素
 而不用將其實踐方法暴露出來
 也可用在整合不同聚合提供不同遍歷方式
 */
public class IteratorPattern {
    public static void main(String[] args) {
        //Array items
        ArrayListItems arrayListItems = new ArrayListItems();
        arrayListItems.add("1");
        arrayListItems.add("2");
        arrayListItems.add("3");
        Iterator arrayListItemsIterator = arrayListItems.createIterator();
        while (arrayListItemsIterator.hasNext()){
            System.out.println(arrayListItemsIterator.next());
        }

        ArrayItems arrayItems = new ArrayItems();
        arrayItems.add("4");
        arrayItems.add("5");
        arrayItems.add("6");
        Iterator arrayItemsIterator = arrayItems.createIterator();
        while (arrayItemsIterator.hasNext()){
            System.out.println(arrayItemsIterator.next());
        }
    }
}
