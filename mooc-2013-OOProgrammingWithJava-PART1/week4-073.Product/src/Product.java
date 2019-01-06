public class Product {
    private int amount;
    private double price;
    private String name;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.amount = amountAtStart;
        this.price = priceAtStart;
        this.name = nameAtStart;
    }


    public void printProduct() {
        System.out.println(this.name + ", " + this.price + ", " + this.amount);
    }
}
