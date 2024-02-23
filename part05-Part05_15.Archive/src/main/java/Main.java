
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Item newItem = new Item(name, identifier);
            Boolean shouldAddItem = true;
            for (Item existingItem : items) {
                if (existingItem.equals(newItem)) {
                    shouldAddItem = false;
                }
            }
            if (shouldAddItem) {
                items.add(newItem);
            }
        }
        System.out.println("==Items==");
        for (Item item : items) {
            System.out.println(item.getIdentifier() + ": " + item.getName());
        }
    }
}
