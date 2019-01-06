
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the points [0-60]: ");
        int a = Integer.parseInt(reader.nextLine());

        if (a <= 29 && a > 0) {
            System.out.println("Grade: failed");
        }
        else if (a <= 34 && a > 29) {
            System.out.println("Grade: 1");
        }
        else if (a <= 39 && a > 34) {
            System.out.println("Grade: 2");
        }
        else if (a <= 44 && a > 39) {
            System.out.println("Grade: 3");
        }
        else if (a <= 49 && a > 34) {
            System.out.println("Grade: 4");
        }
        else {
            System.out.println("Grade: 5");
        }
    }
}
