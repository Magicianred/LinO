package linO;

public class Lino {

    private final long id;
    private final String content;

    public Lino(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
