
public class AdvancedAstrology {

    public static void printStars(int number) {
        System.out.println("*".repeat(number));
        // part 1 of the exercise
    }

    public static void printSpaces(int number) {
        System.out.print(" ".repeat(number));
        // part 1 of the exercise
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
        // part 2 of the exercise
    }

    public static void christmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            int starCount = i * 2 - 1;
            printSpaces(height - i);
            printStars(starCount);
        }
        int baseHeight = 2;
        for (int i = 0; i < baseHeight; i++) {
            printSpaces(height - 2);
            printStars(3);
        }

        // part 3 of the exercise
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
