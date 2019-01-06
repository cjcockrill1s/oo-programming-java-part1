
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sum(array));
    }

    public static int sum(int[] numbers) {
        int result = 0;

        for (int i = 0, j = numbers.length; i < j; i++) {
            result += numbers[i];
        }
        return result;
    }
}
