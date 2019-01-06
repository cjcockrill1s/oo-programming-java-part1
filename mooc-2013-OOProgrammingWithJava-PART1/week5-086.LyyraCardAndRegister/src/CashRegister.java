import com.sun.org.apache.bcel.internal.generic.GotoInstruction;

public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private final double ECONOMICAL;
    private final double GOURMET;

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000.00;
        this.ECONOMICAL = 2.50;
        this.GOURMET = 4.00;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        if (cashGiven >= ECONOMICAL) {
            this.cashInRegister += ECONOMICAL;
            this.economicalSold++;
            return cashGiven - ECONOMICAL;
        }

        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        if (cashGiven >= GOURMET) {
            this.cashInRegister += GOURMET;
            this.gourmetSold++;
            return cashGiven - GOURMET;
        }

        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if (card.balance() >= ECONOMICAL) {
            this.economicalSold++;
            card.pay(ECONOMICAL);
            return true;
        }

        return false;
    }

    public boolean payGourmet(LyyraCard card){
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if (card.balance() >= GOURMET) {
            this.gourmetSold++;
            card.pay(GOURMET);
            return true;
        }

        return false;
    }

    public void loadMoneyToCard(LyyraCard card, double amount) {
        if (amount > 0) {
            card.loadMoney(amount);
            this.cashInRegister += amount;
        }
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
