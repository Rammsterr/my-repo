package se.dsve;


import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    //Konstruktor som initierar listan
    public Library() {
        books = new ArrayList<>();
    }
    //Metod för att lägga till en bok i biblan
    public void addBook(Book book) {
        books.add(book);
    }
    //Metod för att lista alla böcker i biblan
    public void listBooks(){
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }

    public class Book {
        private String title;

        public Book(String title) {
            this.title = title;
        }
        public String getTitle() {
            return title;
        }
    }
}
