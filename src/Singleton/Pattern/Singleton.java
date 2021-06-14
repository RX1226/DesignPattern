package Singleton.Pattern;

public class Singleton {
    private static Singleton instance = new Singleton(); //不拖延實體化

    //如果很常使用, 最好在使用時用簡單越好
    public static Singleton getInstance() {
        return instance;
    }
}
