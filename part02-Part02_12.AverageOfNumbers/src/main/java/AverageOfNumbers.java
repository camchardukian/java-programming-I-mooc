
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfNumbers = 0;
        int sumOfNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int currentNumber = Integer.valueOf(scanner.nextLine());
            if (currentNumber == 0) {
                break;
            }
            numberOfNumbers += 1;
            sumOfNumbers += currentNumber;
        }
        System.out.println("Average of the numbers: " + ((double) sumOfNumbers / numberOfNumbers));
    }
}
