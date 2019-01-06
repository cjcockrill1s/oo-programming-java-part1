import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }



        public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1, j = array.length; i < j; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = array[0];
        int smallestIndex = 0;
        for (int i = 1, j = array.length; i < j; i++) {
            if (smallest > array[i]) {
                smallestIndex = i;
                smallest = array[smallestIndex];
            }
        }
        return smallestIndex;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int startingIndex) {
        int smallest = array[startingIndex];
        int result = startingIndex;
        for (int i = startingIndex, j = array.length; i < j; i++) {
            if (smallest > array[i]) {
                result = i;
                smallest = array[result];
            }
        }
        return result;
    }

    public static void swap(int[] array, int index1, int index2) {
        int firstValueToSwap = array[index1];
        int secondValueToSwap = array[index2];
        array[index1] = secondValueToSwap;
        array[index2] = firstValueToSwap;
    }

    public static void sort(int[] array) {
        for (int i = 0, j = array.length; i < j; i++) {
            int smallest = indexOfTheSmallestStartingFrom(array, i);
            System.out.println(Arrays.toString(array));
            swap(array, i, smallest);
        }
    }


}
