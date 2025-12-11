import java.io.*;
import java.util.*;
public class FileOperator {
    private static file myFile;
    private static Scanner fileReader;

    public static void createFile(String filename) throws IOException {
        myFile = new File(filename);
        fileReader = new Scanner(myFile);
        
    public ArrayList<String> getStringData(String filename){
        createFile(filename);
        ArrayList<String> result = new ArrayList<>();
        while(fileReader.hasNextLine()){
            result.add(fileReader.nextLine());
        }
        return result;
    }
    }
    public static void main(String[] args) throws IOException {
        String filename = "poem";
        ArrayList<String> lines = FileOperator.getStringData(filename);
        Poem myPoem = new Poem("My Poem", lines);
        System.out.println(myPoem);
    }
}
