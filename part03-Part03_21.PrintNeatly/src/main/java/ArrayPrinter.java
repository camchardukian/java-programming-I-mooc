
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = { 5, 1, 3, 4, 2 };
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        String output = "";
        for (int i = 0; i < array.length - 1; i++) {
            output = output + array[i] + ", ";
        }
        System.out.println(output + array[array.length - 1]);
    }
}
