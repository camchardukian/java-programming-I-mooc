import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int weight;

    public Suitcase(int weight) {
        items = new ArrayList<>();
        this.weight = weight;
    }

    public void addItem(Item item) {
        int currentWeight = 0;
        for (Item current : items) {
            currentWeight += current.getWeight();
        }
        if (currentWeight + item.getWeight() <= weight) {
            items.add(item);

        }
    }

    public String toString() {
        int currentWeight = 0;
        for (Item current : items) {
            currentWeight += current.getWeight();
        }
        int numberOfItems = items.size();
        String itemText = (numberOfItems == 0) ? "no items ("
                : (numberOfItems == 1) ? "1 item (" : (numberOfItems + " items (");
        return itemText + currentWeight + "kg)";
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (items.size() == 0) {
            return null;
        }
        Item heaviest = items.get(0);
        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
}
