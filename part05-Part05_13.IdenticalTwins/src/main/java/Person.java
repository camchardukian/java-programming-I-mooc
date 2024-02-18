
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Person)) {
            return false;
        }
        Person comparedPerson = (Person) compared;
        SimpleDate comparedSimpleDate = (SimpleDate) comparedPerson.birthday;
        if (this.name.equals(comparedPerson.name) && this.birthday.getDay() == comparedSimpleDate.getDay() &&
                this.birthday.getMonth() == comparedSimpleDate.getMonth() &&
                this.birthday.getYear() == comparedSimpleDate.getYear()
                && this.height == comparedPerson.height
                && this.weight == comparedPerson.weight) {
            return true;
        }
        return false;
    }
}
