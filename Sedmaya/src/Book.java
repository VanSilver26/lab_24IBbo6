public class Book {
    public String title;
    public String author;
    public int year;
    public Book(String title, String author, int year){
        this.title=title;
        this.author=author;
        this.year=year;
    }
    @Override
    public String toString() {
        return "Название: " + title + ", Автор: " + author + ", Год: " + year;
    }
}
