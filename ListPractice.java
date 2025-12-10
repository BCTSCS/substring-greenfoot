
import java.util.ArrayList;

public class ListPractice {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("syntax");
        items.add("parser");
        items.add("token");
        items.add("lexical");
        
        for (String word : items) {
            System.out.println(word);
        }
        
        System.out.println();
        
        for (int i = 0; i < items.size(); i++) {
            System.out.println(i + ": " + items.get(i).toUpperCase());
        }
        
        System.out.println(); 
        
        for (String word : items) {
            if (word.length() > 5) {
                System.out.println(word);
            }
        }
    }
}
