public class Counter {

    private int startingValue;
    private boolean check;
    private int currentValue;

    public Counter (int startingValue, boolean check){
        this.startingValue = startingValue;
        this.check = check;
        this.currentValue = startingValue;
        }

    public Counter (int startingValue) {
        this(startingValue, false);
    }

    public Counter (boolean check) {
        this(0, true);
    }

    public Counter () {
        this(0, false);
    }

    public int value() {
        return this.currentValue;
    }

    public void increase() {
        this.increase(1);
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.currentValue += increaseAmount;
        }
    }

    public void decrease() {
        decrease(1);
        }

    public void decrease(int decreaseAmount) {
        if (check && value() - decreaseAmount < 0) {
            this.currentValue = 0;
        }
        else if (check && value() <= 0) {
            this.currentValue = this.currentValue;
        }
        else if (decreaseAmount > 0){
            this.currentValue -= decreaseAmount;
        }
    }
}





