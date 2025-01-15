import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    public void addBook(Book book){
        books.add(book);
        System.out.println("Книга "+ book.title+ " добавлена в библиотеку. ");
    }
    public void removeBook(String title){
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).title.equals(title)) {
                books.remove(i);
                System.out.println("Книга " + title + " удалена из библиотеки.");
                return;
            }
        }
        System.out.println("Книга " + title + " не найдена в библиотеке.");
    }
    public ArrayList<Book> findBookByAuthor(String author){
        ArrayList<Book> result = new ArrayList<>();
        for (Book book: books){
            if (book.author.equals(author)){
                result.add(book);
            }
        }
    return result;
    }
    public void printAllBooks() {
        if (books.isEmpty()) {
            System.out.println("Библиотека пуста.");
        } else {
            System.out.println("Список всех книг в библиотеке:");
            for (Book book : books) {
                System.out.println(book.toString());
            }
        }
    }
}