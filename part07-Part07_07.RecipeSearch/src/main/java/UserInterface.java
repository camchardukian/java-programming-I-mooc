import java.util.Scanner;

public class UserInterface {
    private Recipes recipes;
    private Scanner scanner;

    public UserInterface(Scanner scanner, Recipes recipes) {
        this.scanner = scanner;
        this.recipes = recipes;
    }

    public void start() {
        printCommands();
        while (true) {
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                recipes.listRecipes();
            } else if (command.equals("find name")) {
                System.out.print("Searched word:");
                String word = scanner.nextLine();
                recipes.searchRecipeByName(word);
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                recipes.searchRecipeByCookingTime(maxTime);
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient:");
                String ingredient = scanner.nextLine();
                recipes.searchRecipeByIngredient(ingredient);
            }
        }
    }

    public void printCommands() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }

}
