package Builder.Pattern;

public class BookBuilder implements Builder{
    private String name;
    private int pages;
    private String title;

    @Override
    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Builder setPages(int pages) {
        this.pages = pages;
        return this;
    }

    @Override
    public Builder setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public Book create() {
        return new Book(name, pages, title);
    }
}
