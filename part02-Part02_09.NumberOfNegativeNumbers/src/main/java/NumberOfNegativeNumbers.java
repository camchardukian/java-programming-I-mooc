
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfInputs = 0;
        while (true) {
            System.out.println("Give a number:");
            int currentNumber = Integer.valueOf(scanner.nextLine());
            if (currentNumber == 0) {
                break;
            } else if (currentNumber < 0) {
                numberOfInputs += 1;
            }
        }
        System.out.println("Number of negative numbers: " + numberOfInputs);
    }
}
