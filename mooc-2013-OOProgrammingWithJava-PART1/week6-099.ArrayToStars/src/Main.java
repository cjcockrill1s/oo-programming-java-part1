
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {

        for (int i = 0, j = array.length; i < j; i++) {
            printStar(array[i]);
        }
    }

    public static void printStar(int numberOfStars) {

        for (int i = 0; i < numberOfStars; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
