
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfInputs = 0;
        while (true) {
            System.out.println("Give a number:");
            int currentNumber = Integer.valueOf(scanner.nextLine());
            if (currentNumber == 0) {
                break;
            }
            numberOfInputs += 1;
        }
        System.out.println("Number of numbers: " + numberOfInputs);
    }
}
