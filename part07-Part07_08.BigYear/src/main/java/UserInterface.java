import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Birds birds;

    public UserInterface(Scanner scanner, Birds birds) {
        this.scanner = scanner;
        this.birds = birds;
    }

    public void start() {
        while (true) {
            System.out.println("?");
            String command = scanner.nextLine();
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                System.out.println("Name:");
                String name = scanner.nextLine();
                System.out.println("Name in Latin:");
                String latinName = scanner.nextLine();
                birds.addBird(name, latinName);
            } else if (command.equals("Observation")) {
                System.out.print("Bird?");
                String name = scanner.nextLine();
                birds.addObservation(name);
            } else if (command.equals("All")) {
                birds.printAllBirds();
            } else if (command.equals("One")) {
                System.out.print("Bird?");
                String name = scanner.nextLine();
                birds.printSearchedBird(name);
            }
        }
    }
}
