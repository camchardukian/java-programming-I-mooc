import java.util.Scanner;
import java.util.ArrayList;

public class PointStatistics {
    private Scanner scanner;
    private ArrayList<Integer> pointsList;
    private ArrayList<Integer> passingGradesList;

    public PointStatistics(Scanner scanner) {
        this.scanner = scanner;
        this.pointsList = new ArrayList<>();
        this.passingGradesList = new ArrayList<>();
    }

    public void gatherData() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {

            int value = Integer.valueOf(scanner.nextLine());
            if (value >= 0 && value <= 100) {
                pointsList.add(value);
                if (value >= 50) {
                    passingGradesList.add(value);
                }
            } else if (value == -1) {
                break;
            }
        }
    }

    public void print() {
        System.out.println("Point average (all): " + getAverage());
        System.out.println("Point average (passing):" + getPassingGradeAverage());
        System.out.println("Pass percentage: " + getPassingPercentage());
        printGradeDistribution();
    }

    public String getAverage() {
        return "" + (double) pointsList.stream().reduce(0, (subtotal, element) -> subtotal + element)
                / pointsList.size();
    }

    public String getPassingGradeAverage() {
        if (passingGradesList.size() == 0) {
            return " -";
        }
        return " " + (double) passingGradesList.stream().reduce(0, (subtotal, element) -> subtotal + element)
                / passingGradesList.size();
    }

    public double getPassingPercentage() {
        return (double) 100 * passingGradesList.size() / pointsList.size();
    }

    public void printGradeDistribution() {
        String row0 = "0: " + "*".repeat(pointsList.size() - passingGradesList.size());
        String row1 = "1: ";
        String row2 = "2: ";
        String row3 = "3: ";
        String row4 = "4: ";
        String row5 = "5: ";
        for (int grade : passingGradesList) {
            if (grade >= 90) {
                row5 = row5 + "*";
            } else if (grade >= 80) {
                row4 = row4 + "*";
            } else if (grade >= 70) {
                row3 = row3 + "*";
            } else if (grade >= 60) {
                row2 = row2 + "*";
            } else if (grade >= 50) {
                row1 = row1 + "*";
            }
        }
        System.out.println(row5);
        System.out.println(row4);
        System.out.println(row3);
        System.out.println(row2);
        System.out.println(row1);
        System.out.println(row0);
    }

}
