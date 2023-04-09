import java.io.Serializable;

public class Book implements Serializable {
    private String name;
    private String authorName;
    private String text;

    public Book(String name, String authorName, String text) {
        this.name = name;
        this.authorName = authorName;
        this.text = text;
    }

    public String getName() {
        return name;
    }
}
