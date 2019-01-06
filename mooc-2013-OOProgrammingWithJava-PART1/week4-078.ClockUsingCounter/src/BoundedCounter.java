public class BoundedCounter {

    private int counter;
    private int upperBound;

    public BoundedCounter(int upperBound) {
        this.counter = 0;
        this.upperBound = upperBound;
    }

    public void next() {
        this.counter++;
        if (this.counter > upperBound) {
            this.counter = 0;
        }
    }

    public void setValue(int counter) {
        if (counter > 0 && counter <= this.upperBound) {
            this.counter = counter;
        }
    }

    public int getValue() {
        return this.counter;
    }

    public String toString() {
        return "" + String.format("%02d", this.counter);
    }
}
