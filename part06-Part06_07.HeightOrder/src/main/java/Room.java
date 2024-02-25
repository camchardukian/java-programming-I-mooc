import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;

    public Room() {
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        people.add(person);
    }

    public boolean isEmpty() {
        return people.size() == 0;
    }

    public ArrayList<Person> getPersons() {
        return people;
    }

    public Person shortest() {
        if (isEmpty()) {
            return null;
        }
        Person shortestPerson = people.get(0);
        for (Person person : people) {
            if (person.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = person;
            }
        }
        return shortestPerson;
    }

    public Person take() {
        Person shortestPerson = shortest();
        people.remove(shortestPerson);
        return shortestPerson;
    }
}
