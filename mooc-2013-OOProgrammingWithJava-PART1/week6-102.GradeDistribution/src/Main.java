import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);



        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        getScores(reader);
    }

    public static void getScores(Scanner reader) {
        int validScores = 0;
        int totalScores = 0;
        ScoreAllocater trackedScores = new ScoreAllocater();

        while (true) {
            int a = Integer.parseInt(reader.nextLine());

            if (a == -1) {
                break;
            }
            if (trackedScores.isValidScore(a)) {
                trackedScores.allocateScore(a);
            }
        }
        trackedScores.printScores();
        System.out.println("Acceptance percentage: " + trackedScores.acceptanceRate());
    }

}




