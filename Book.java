public class Book {
    private String title;
    private String author;

    public Book() {

    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title; 
    }
    public void setAuthor(String author) {
        this.author = author; 
    }
}
