
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatestNumber = 0;
        String oldestPerson = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] data = input.split(",");
            int currentNumber = Integer.valueOf(data[1]);
            if (currentNumber > greatestNumber) {
                greatestNumber = currentNumber;
                oldestPerson = data[0];
            }
        }
        System.out.println("Name of the oldest: " + oldestPerson);

    }
}
