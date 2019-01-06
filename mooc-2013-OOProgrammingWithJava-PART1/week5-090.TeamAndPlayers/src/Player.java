public class Player {

    private String name;
    private int numberOfGoals;

    public Player (String name) {
        this(name, 0);
    }

    public Player (String name, int numberOfGoals) {
        this.name = name;
        this.numberOfGoals = numberOfGoals;
    }

    public String getName() {
        return this.name;
    }

    public int goals () {
        return this.numberOfGoals;
    }

    public String toString() {
        return this.name + ", goals " + this.numberOfGoals;
    }
}
