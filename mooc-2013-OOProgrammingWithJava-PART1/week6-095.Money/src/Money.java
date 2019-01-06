
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        Money addedMoney = new Money(this.euros + added.euros(), this.cents + added.cents());

        return addedMoney;
    }

    public boolean less(Money compared) {
        if (this.euros == compared.euros()) {
            return this.cents < compared.cents();
        }
        return this.euros < compared.euros();
    }

    public Money minus(Money decremented) {
        int lessCents = this.cents - decremented.cents();
        int lessEuros = this.euros - decremented.euros();

        if (lessCents < 0) {
            lessCents += 100;
            lessEuros -= 1;
        }

        if (lessEuros < 0) {
            lessCents = 0;
            lessEuros = 0;
        }
        Money lessMoney = new Money(lessEuros, lessCents);

        return lessMoney;
    }
}
