public class StringUtils {

    public static boolean included(String word, String searched) {
        word = word.toLowerCase().trim();
        searched = searched.toLowerCase().trim();
        return (word.contains(searched));

    }
}
