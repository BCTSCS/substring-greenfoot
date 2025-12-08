import java.util.*;

public class ListPractice {
    public ListPractice() {

    }
    public static void main(String[] args) throws Exception {
// step 1
        ArrayList<String> strings = new ArrayList<>();
        strings.add("syntax");
        strings.add("parser");
        strings.add("token");
        strings.add("lexical");
// step 2
        for (Object thing : strings) {
            System.out.println(thing);
        }
// step 3
        for (int i=0; i<strings.size(); i++) {
            System.out.println(strings.get(i).toUpperCase() + " "+i);
        }
// step 4
        for (int i=0; i<strings.size(); i++) {
            if (strings.get(i).length() > 5) {
                System.out.println(strings.get(i));
            }            
        }
    }

}