
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int birthYearSum = 0;
        String longestName = "";
        int numberOfPeople = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] data = input.split(",");
            String currentName = data[0];
            int birthYear = Integer.valueOf(data[1]);
            if (currentName.length() > longestName.length()) {
                longestName = currentName;
            }
            birthYearSum += birthYear;
            numberOfPeople += 1;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ((double) birthYearSum / numberOfPeople));

    }
}
