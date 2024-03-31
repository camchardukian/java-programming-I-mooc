import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read:");
        String fileToRead = scanner.nextLine();
        Recipes recipes = new Recipes(fileToRead);
        UserInterface ui = new UserInterface(scanner, recipes);
        ui.start();
    }

}
