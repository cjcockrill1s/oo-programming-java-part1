import java.util.ArrayList;

public class Bird {

    private String name;
    private String latinName;
    private ArrayList<Bird> observedBirds;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public void addBird(Bird birdToAdd) {
        this.observedBirds.add(birdToAdd);
    }

    public void observation() {
        this.observations++;
    }

    public void statistics() {
        for (Bird bird : this.observedBirds) {
            show();
        }
    }

    public void show() {
        System.out.println(this.name + " " + this.latinName + " : " + this.observations + " observations");
        System.out.println();
    }


}
