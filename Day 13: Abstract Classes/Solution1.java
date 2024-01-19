import java.util.*;

abstract class Book {
    String title;
    String author;
    int price;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    abstract void display();
}
class MyBook extends Book {

    MyBook(String title, String author, int price) {
        super(title, author, price);

    }

    @Override
    void display() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }

}

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Title : ");
        String title = scanner.nextLine();
        System.out.print("Author : ");
        String author = scanner.nextLine();
        System.out.print("Price : ");
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
