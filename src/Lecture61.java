// Exercise 4 solution from Lec51 Mini project of Java Class library...
class Library{
    String[] books;
    int no_of_books;
    Library(){     //Constructor
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBooks(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book);
    }
    void issueBook(String book){
        for(int i=0;i<this.books.length;i++){
            if (this.books[i].equals(book)) {
                System.out.println("The book has been issued");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("The Book doesnt exist");
    }
    void returnBook (String book){
        addBooks(book);
    }
    void showAvailablebooks(){
        System.out.println("Available books are: ");
        for(String book : this.books){
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }
}
public class Lecture61 {
    public static void main(String[] args) {
        // You have  to implement a library using java class library
        // Methods: addBook , issueBook , returnBook , showAvailableBook
        // Properties: Array to store the available books,Array to store the issued books
        Library L = new Library();
        L.addBooks("The Game");
        L.addBooks("C++");
        L.addBooks("The Imitation");
        L.issueBook("The Game");
        L.returnBook("The Game");
        L.showAvailablebooks();
    }
}
