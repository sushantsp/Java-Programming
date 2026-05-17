
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();
            
            if (bookName.equals("")) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());

            books.add(new Book(bookName, age));
        }

        Comparator<Book> comparator = Comparator
                                        .comparing(Book::getAge)
                                        .thenComparing(Book::getName);

        Collections.sort(books, comparator);

        System.out.println(books.size() + " books in total.\n\nBooks:");

        for (Book book : books) {
            System.out.println(book);
        }
    }

}
