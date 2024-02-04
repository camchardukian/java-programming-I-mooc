
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String firstName = scanner.nextLine();
            if (firstName.equals("")) {
                break;
            }
            String lastName = scanner.nextLine();
            if (lastName.equals("")) {
                break;
            }

            String id = scanner.nextLine();
            if (id.equals("")) {
                break;
            }
            PersonalInformation newInfo = new PersonalInformation(firstName, lastName, id);
            infoCollection.add(newInfo);
        }
        for (PersonalInformation person : infoCollection) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }

    }
}
