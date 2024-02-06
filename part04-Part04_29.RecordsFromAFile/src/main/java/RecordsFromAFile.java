
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String[] data = fileScanner.nextLine().split(",");
                String name = data[0];
                int age = Integer.valueOf(data[1]);
                String yearOrYears = age != 1 ? " years" : " year";
                System.out.println(name + ", age: " + age + yearOrYears);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
