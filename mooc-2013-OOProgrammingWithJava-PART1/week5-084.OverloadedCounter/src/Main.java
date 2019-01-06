public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter testing = new Counter(3, true);

        testing.decrease();
        System.out.println(testing.value());
        testing.decrease();
        System.out.println(testing.value());
        testing.decrease();
        System.out.println(testing.value());
        testing.decrease();
        System.out.println(testing.value());
        testing.decrease();
        System.out.println(testing.value());
    }
}
