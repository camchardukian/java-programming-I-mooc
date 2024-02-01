
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatestNumber = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] data = input.split(",");
            int currentNumber = Integer.valueOf(data[1]);
            if (currentNumber > greatestNumber) {
                greatestNumber = currentNumber;
            }
        }
        System.out.println("Age of the oldest: " + greatestNumber);
    }
}
