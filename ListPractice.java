import java.util.ArrayList;

public class ListPractice {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("syntax");
        words.add("parser");
        words.add("token");
        words.add("lexical");

        System.out.println("=== Enhanced For Loop ===");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("\n=== Traditional For Loop (Uppercase + Index) ===");
        for (int i = 0; i < words.size(); i++) {
            System.out.println(i + ": " + words.get(i).toUpperCase());
        }

        System.out.println("\n=== Words with More Than 5 Letters ===");
        for (String word : words) {
            if (word.length() > 5) {
                System.out.println(word);
            }
        }
    }
}
