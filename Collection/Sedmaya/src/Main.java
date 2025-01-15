import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Мастер и Маргарита", "Михаил Булгаков", 1966));
        library.addBook(new Book("Война и мир", "Лев Толстой", 1869));
        library.addBook(new Book("Анна Каренина", "Лев Толстой", 1877));
        library.addBook(new Book("Преступление и наказание", "Федор Достоевский", 1866));

        library.printAllBooks();

        library.removeBook("Война и мир");

        library.removeBook("Капитал");

        ArrayList<Book> tolstoyBooks = library.findBookByAuthor("Лев Толстой");
        System.out.println("Книги автора Лев Толстой:");
        for (Book book : tolstoyBooks) {
            System.out.println(book.toString());
        }

        library.printAllBooks();
    }
}
