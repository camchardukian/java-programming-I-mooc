import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Recipes {
    private List<String> recipeFileLines;
    private ArrayList<Recipe> recipes;

    public Recipes(String fileToRead) {
        this.recipes = new ArrayList<>();
        try {
            this.recipeFileLines = Files.readAllLines(Paths.get(fileToRead));
            String name = "";
            int time = 0;
            ArrayList<String> ingredients = new ArrayList<>();
            for (String line : recipeFileLines) {
                if (line.isEmpty()) {
                    Recipe recipe = new Recipe(name, time, ingredients);
                    this.recipes.add(recipe);
                    name = "";
                    time = 0;
                    ingredients = new ArrayList<>();
                } else if (name.equals("")) {
                    name = line;
                } else if (time == 0) {
                    time = Integer.valueOf(line);
                } else {
                    ingredients.add(line);
                }
            }
            if (!name.equals("")) {
                Recipe recipe = new Recipe(name, time, ingredients);
                this.recipes.add(recipe);
            }
        } catch (IOException e) {
            System.out.println("failllllll");
            e.printStackTrace();
        }
    }

    public String getRecipeSummary(Recipe recipe) {
        return recipe.getName() + ", cooking time: " + recipe.getTime();
    }

    public void listRecipes() {
        for (Recipe recipe : recipes) {
            System.out.println(getRecipeSummary(recipe));
        }
    }

    public void searchRecipeByName(String name) {
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(name)) {
                System.out.println(getRecipeSummary(recipe));
            }
        }
    }

    public void searchRecipeByCookingTime(int maxTime) {
        for (Recipe recipe : recipes) {
            if (recipe.getTime() <= maxTime) {
                System.out.println(getRecipeSummary(recipe));
            }
        }
    }

    public void searchRecipeByIngredient(String name) {
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(name)) {
                System.out.println(getRecipeSummary(recipe));
            }
        }
    }

}
