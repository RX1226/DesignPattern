package Singleton.Pattern;

public class ThreadSingleton {
    private volatile static ThreadSingleton instance;

    public static ThreadSingleton getInstance() {
        if(instance == null){
            synchronized (Singleton.class){
                //double checked locking 技巧
                //只有第一次才會同步, 來提升效能
                if(instance == null){
                    instance = new ThreadSingleton();
                }
            }
        }
        return instance;
    }
}
