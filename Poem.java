import java.util.*;
import java.io.*;

public class Poem {
    private String title;
    private ArrayList<String> lines;
    
    public Poem(String title, ArrayList<String> lines){
        this.title = title;
        this.lines = lines;
    }

    public String getTitle(){
        return title;
    }
    public ArrayList<String> getLines(){
        return lines;
    } 

    public String toString() {


    }

    
}
