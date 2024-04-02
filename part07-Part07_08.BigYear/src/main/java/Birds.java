import java.util.ArrayList;

public class Birds {
    private ArrayList<Bird> birds;

    public Birds() {
        this.birds = new ArrayList<>();
    }

    public void addBird(String name, String latinName) {
        this.birds.add(new Bird(name, latinName, 0));
    }

    public void printSearchedBird(String name) {
        for (Bird bird : birds) {
            if (name.equals(bird.getName())) {
                System.out.println(formatBirdInfo(bird));
                break;
            }
        }
    }

    public String formatBirdInfo(Bird bird) {
        return bird.getName() + " (" + bird.getLatinName() + "): " + bird.getObservations();
    }

    public void printAllBirds() {
        for (Bird bird : birds) {
            System.out.println(formatBirdInfo(bird));
        }
    }

    public void addObservation(String name) {
        for (Bird bird : birds) {
            if (name.equals(bird.getName())) {
                bird.incrementObservations();
                return;
            }
        }
        System.out.println("Not a bird!");
    }
}
