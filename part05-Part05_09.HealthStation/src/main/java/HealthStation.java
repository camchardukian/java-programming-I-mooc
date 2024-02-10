
public class HealthStation {
    private int weighins;

    public int weigh(Person person) {
        weighins++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return weighins;
    }
}
