
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account a = new Account("a", 100.00);
        Account b = new Account("b", 0.00);
        Account c = new Account("c", 0.00);

        transfer(a, b, 50.00);
        transfer(b, c, 25.00);
    }

    public static void transfer(Account from, Account to, double howMuch) {

        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}
