
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(scan.nextLine());
        int multiplier = 1;
        if (number < 0) {
            multiplier = -1;

        }
        if ((number * multiplier % 2) > 0) {
            System.out.println("Number " + number + " is odd.");
        } else {
            System.out.println("Number " + number + " is even.");
        }
    }
}
