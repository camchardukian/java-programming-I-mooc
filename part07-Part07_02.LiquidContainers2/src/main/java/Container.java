public class Container {
    private int liquid;

    public Container() {
        liquid = 0;
    }

    public int contains() {
        return liquid;
    }

    public void add(int amount) {
        if (amount > 0) {
            int sum = liquid + amount;
            if (sum < 100) {
                liquid = sum;
            } else {
                liquid = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            int difference = liquid - amount;
            if (difference <= 0) {
                liquid = 0;
            } else {
                liquid = difference;
            }
        }
    }

    public String toString() {
        return liquid + "/100";
    }

}
