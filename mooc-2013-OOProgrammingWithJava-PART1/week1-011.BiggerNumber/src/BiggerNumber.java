
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        int a = Integer.parseInt(reader.nextLine());
        int b = Integer.parseInt(reader.nextLine());

        System.out.println("The bigger number of the two numbers given was: " + Math.max(a, b));
    }
}
