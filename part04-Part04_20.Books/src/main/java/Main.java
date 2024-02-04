import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();
            if (title.equals("")) {
                break;
            }
            System.out.println("Pages:");
            String pages = scanner.nextLine();
            System.out.println("Publication year:");
            String publicationYear = scanner.nextLine();
            Book bookToAdd = new Book(title, pages, publicationYear);
            books.add(bookToAdd);
        }
        System.out.println("What information will be printed?");
        String userResponse = scanner.nextLine();
        for (Book book : books) {
            if (userResponse.equals("everything")) {
                System.out.println(book.toString());
            } else {
                System.out.println(book.getTitle());
            }
        }
    }
}
