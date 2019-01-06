import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList

        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.println("Type a word: ");
            String userWordEntered = reader.nextLine();
            if (userWordEntered.length() == 0) {
                System.out.println("You entered the following words: ");
                Collections.reverse(words);
                for (String word : words) {
                    System.out.println(word);
                }
                break;
            }
            words.add(userWordEntered);
        }
    }
}
