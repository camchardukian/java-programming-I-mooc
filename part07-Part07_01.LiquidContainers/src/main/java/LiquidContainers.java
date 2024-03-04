
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = 0;
            if (parts.length == 2) {
                amount = Integer.valueOf(parts[1]);
            }
            if (command.equals("add")) {
                if (amount < 0) {
                    continue;
                }
                int sum = firstContainer + amount;
                if (sum > 100) {
                    firstContainer = 100;
                } else {
                    firstContainer = sum;
                }
            } else if (command.equals("move")) {
                if (amount <= 0 || firstContainer == 0) {
                    return;
                }
                int difference = firstContainer - amount;
                if (difference < 0) {
                    int sum = secondContainer + firstContainer;
                    secondContainer = sum;
                    firstContainer = 0;
                } else {
                    firstContainer = difference;
                    int sum = secondContainer + amount;
                    if (sum <= 100) {
                        secondContainer = sum;
                    } else {
                        secondContainer = 100;
                    }
                }
            } else if (command.equals("remove")) {
                if (amount <= 0) {
                    return;
                }
                int difference = secondContainer - amount;
                if (difference < 0) {
                    secondContainer = 0;
                } else {
                    secondContainer = difference;
                }
            } else if (command.equals("quit")) {
                break;
            }
        }
    }

}
