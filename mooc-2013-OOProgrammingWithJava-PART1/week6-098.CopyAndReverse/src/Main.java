import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = reverseCopy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));
    }

    public static int[] copy(int[] array) {
        int[] copiedArray = new int[array.length];

        for (int i = 0, j = array.length; i < j; i++) {
            copiedArray[i] = array[i];
        }

        return copiedArray;
    }

    public static int[] reverseCopy(int[] array) {
        int[] reversedArray = new int[array.length];

        for (int i = 0, j = array.length - 1; i <= j; i++) {
            reversedArray[i] = array[j - i];
        }

        return reversedArray;

    }
}
