public class Reformatory {

    private int weightCounted = 0;

    public int weight(Person person) {
        // return the weight of the person
        this.weightCounted++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(weight(person) + 1);
    }

    public int totalWeightsMeasured () {
        return this.weightCounted;
    }
}
