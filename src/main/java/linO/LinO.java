package linO;

public class LinO {

    private final long id;
    private final String content;

    public LinO(long id, String content) {
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
