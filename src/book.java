public class book extends products {

    private String authorName;
    private String publisher;

    public book(int id, String name, String price, int stock,String authorName,String publisher) {
        super(id, name, price, stock);
        this.authorName=authorName;
        this.publisher=publisher;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
