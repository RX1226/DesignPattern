package Builder.Pattern;

public interface Builder {
    Builder setName(String name);
    Builder setPages(int pages);
    Builder setTitle(String title);
    Book create();
}
