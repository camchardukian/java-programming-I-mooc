
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPositiveNumbers = 0;
        int sumOfPositiveNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int currentNumber = Integer.valueOf(scanner.nextLine());
            if (currentNumber == 0) {
                break;
            } else if (currentNumber > 0) {
                numberOfPositiveNumbers += 1;
                sumOfPositiveNumbers += currentNumber;
            }
        }
        if (numberOfPositiveNumbers > 0) {
            System.out.println("Average of the numbers: " + ((double) sumOfPositiveNumbers / numberOfPositiveNumbers));
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
