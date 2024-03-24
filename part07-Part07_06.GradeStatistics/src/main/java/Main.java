import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PointStatistics pointStatistics = new PointStatistics(scanner);
        pointStatistics.gatherData();
        pointStatistics.print();

    }
}
