import java.util.ArrayList;

class Book{
    public String name,author;
    public Book(String name,String author){
        this.name = name;
        this.author = author;
    }
}
class Library1{
    public ArrayList<Book> books;
    public Library1(ArrayList<Book> books){
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("This book has been added");
        this.books.add(book);
    }
    public void returnBook(Book b){
        System.out.println("This book has been returned");
        this.books.add(b);
    }
    public void issueBook(Book issue,String issued_to){
        System.out.println("This book has been issued " +issued_to);
        this.books.remove(issue);
    }
}
public class Lecture113 {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 =(new Book("Algorithm","CLRS"));
        bk.add(b1);
        Book b2 = (new Book("Algorithm2","CLRS2"));
        bk.add(b2);
        Book b3 = (new Book("Algorithm3","CLRS3"));
        bk.add(b3);
     Library1 l = new Library1(bk);
     l.addBook(new Book("algorithm4","Clr4"));
        System.out.println(l.books);
        l.issueBook(b3,"Ayush");
        System.out.println(l.books);
    }
}
