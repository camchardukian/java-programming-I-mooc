
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.indexOf(team) > -1) {
                    gamesPlayed++;
                    String[] data = line.split(",");
                    int teamIndex = data[0].equals(team) ? 0 : 1;
                    int opponentIndex = teamIndex == 0 ? 1 : 0;
                    int teamScore = Integer.valueOf(data[teamIndex + 2]);
                    int opponentScore = Integer.valueOf(data[opponentIndex + 2]);
                    if (teamScore > opponentScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
