
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        int result = 1;
        if (number != 0 && number != 1) {
            for (int i = 2; i <= number; i++) {
                result = result * i;
                System.out.println("rannn");
            }
        }
        System.out.println("Factorial: " + result);
    }
}
