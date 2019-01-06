
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here.

        while (true) {
            System.out.print("Type a floating point number: ");
            double a = Double.parseDouble(reader.nextLine());
            double minTemp = -30.0;
            double maxTemp = 40.0;
            if (a > minTemp && a < maxTemp) {
                Graph.addNumber(a);
            }
        }

        // Graph is used as follows:
        // Graph.addNumber(7);
        // double value = 13.5;
        // Graph.addNumber(value);
        // value = 3;
        // Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}
