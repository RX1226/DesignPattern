package Singleton;

import Singleton.Pattern.Singleton;
import Singleton.Pattern.ThreadSingleton;

/**
 單例模式 Singleton Pattern
 讓該類別的實體唯一存在
 在不同地方也是只能取到相同的實體
 */
public class SingletonPattern {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        ThreadSingleton threadSingleton = ThreadSingleton.getInstance();
    }
}
