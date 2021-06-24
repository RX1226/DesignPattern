package Builder;

import Builder.Pattern.Book;
import Builder.Pattern.BookBuilder;

/**
 * 建立者模式 Builder Pattern
 * 拆解每個元件的建造過程, 避免很長的建構子, 使建構上更靈活
 * 優點: 使用者建立元件不需要知道過程, 容易擴展, 產品表示和建造分離
 * 缺點: 內部太複雜時會不好維護, 不同產品需要有共通點, 限制了使用範圍
 */
public class BuilderPattern {
    public static void main(String[] args) {
        Book book = new BookBuilder().setName("Builder Book").setPages(100).create();
        book.showInfo();
    }
}
