package Adapter;

import Adapter.Pattern.ClassAdapter;
import Adapter.Pattern.ObjectAdapter;
import Adapter.Pattern.Source;

/**
 配接器模式 Adapter Pattern
 用一個類別將兩個不同的類別或介面可以串接起來使用
 主要有兩種做法
 物件配接器模式 Object Adapter Pattern
 Adapter內實做來源的Object, 後改成目標去輸出
 類別配接器模式 Class Adapter Pattern
 Adapter繼承來源的class, 後改成目標去輸出
 */
public class AdapterPattern {
    public static void main(String[] args) {
        //Object Adapter
        Source source = new Source();
        ObjectAdapter objectAdapter = new ObjectAdapter(source);
        objectAdapter.request();

        //Class Adapter
        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter.request();
    }
}
