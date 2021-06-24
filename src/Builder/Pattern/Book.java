package Builder.Pattern;

public class Book {
    private String name;
    private int pages;
    private String title;

    Book(String name, int pages, String title) {
        this.name = name;
        this.pages = pages;
        this.title = title;
    }

    public void showInfo(){
        System.out.println("name = " + name);
        System.out.println("pages = " + pages);
        System.out.println("title = " + title);
    }
}
