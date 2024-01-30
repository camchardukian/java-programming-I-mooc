
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        double value = Double.valueOf(scan.nextLine());
        String taxLabel = "Tax: ";
        if (value < 5000) {
            System.out.println("No tax!");
        } else if (value <= 25_000) {
            System.out.println(taxLabel + (100 + (value - 5000) * 0.08));
        } else if (value <= 55_000) {
            System.out.println(taxLabel + (1_700 + (value - 25_000) * 0.10));
        } else if (value <= 200_000) {
            System.out.println(taxLabel + (4_700 + (value - 55_000) * 0.12));
        } else if (value <= 1_000_000) {
            System.out.println(taxLabel + (22_100 + (value - 200_000) * 0.15));
        } else {
            System.out.println(taxLabel + (142_100 + (value - 1_000_000) * 0.17));
        }

    }
}
