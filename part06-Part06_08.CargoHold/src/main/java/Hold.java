import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private int currentWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
        currentWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (currentWeight + suitcase.totalWeight() > maxWeight) {
            return;
        }
        suitcases.add(suitcase);
        currentWeight += suitcase.totalWeight();
    }

    public String toString() {
        return suitcases.size() + " suitcases " + "(" + currentWeight + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
}
