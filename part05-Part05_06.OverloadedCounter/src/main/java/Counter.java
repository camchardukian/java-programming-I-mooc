public class Counter {
    private int value;

    public Counter() {
        this(0);
    }

    public Counter(int startValue) {
        this.value = startValue;
    }

    public int value() {
        return value;
    }

    public void increase() {
        value = value + 1;
    }

    public void decrease() {
        value = value - 1;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            value = value + increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            value = value - decreaseBy;
        }
    }

}
