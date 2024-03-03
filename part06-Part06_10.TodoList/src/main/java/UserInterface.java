import java.util.Scanner;

public class UserInterface {
    private TodoList todos;
    private Scanner scanner;

    public UserInterface(TodoList todos, Scanner scanner) {
        this.todos = todos;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                this.add();
            } else if (command.equals("list")) {
                this.list();
            } else if (command.equals("remove")) {
                this.remove();
            }
        }
    }

    public void add() {
        System.out.println("To add:");
        String toAdd = scanner.nextLine();
        todos.add(toAdd);
    }

    public void list() {
        todos.print();
    }

    public void remove() {
        System.out.println("Which one is removed?");
        int index = Integer.parseInt(scanner.nextLine());
        todos.remove(index);
    }
}