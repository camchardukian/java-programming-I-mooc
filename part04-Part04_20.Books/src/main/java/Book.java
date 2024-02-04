public class Book {
    private String title;
    private String pages;
    private String publicationYear;

    public Book(String title, String pages, String publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publicationYear;
    }
}
