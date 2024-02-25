import java.util.ArrayList;

public class Stack {
    private ArrayList<String> values;

    public Stack() {
        this.values = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (this.values.size() == 0) {
            return true;
        }
        return false;
    }

    public void add(String value) {
        values.add(value);
    }

    public ArrayList<String> values() {
        return values;
    }

    public String take() {
        int topIndex = values.size() - 1;
        String topValue = values.get(topIndex);
        values.remove(topIndex);
        return topValue;
    }
}
