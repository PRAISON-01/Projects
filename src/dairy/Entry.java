package dairy;

public class Entry {
    private int ID;
    private String title;

    private String body;


    public Entry(int ID, String title, String body) {
        this.ID = ID;
        this.title = title;
        this.body = body;
    }

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
