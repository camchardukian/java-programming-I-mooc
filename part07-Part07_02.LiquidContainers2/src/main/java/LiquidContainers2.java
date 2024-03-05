
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = 0;
            if (parts.length == 2) {
                amount = Integer.valueOf(parts[1]);
            }
            if (command.equals("add")) {
                firstContainer.add(amount);
            } else if (command.equals("move")) {
                int availableLiquid = firstContainer.contains();
                if (availableLiquid >= amount) {
                    secondContainer.add(amount);
                } else {
                    secondContainer.add(availableLiquid);
                }
                firstContainer.remove(amount);
            } else if (command.equals("remove")) {
                secondContainer.remove(amount);
            } else if (command.equals("quit")) {
                break;
            }

        }
    }

}
