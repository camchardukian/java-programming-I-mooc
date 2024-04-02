
public class Bird {
    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName, int observations) {
        this.name = name;
        this.latinName = latinName;
        this.observations = observations;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public String getObservations() {
        return observations + (observations == 1 ? " observation" : " observations");
    }

    public void incrementObservations() {
        observations++;
    }

}
