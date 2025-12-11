import java.io.*;
import java.util.*;

public final class FileOperator {
    private static File myFile;
    private static Scanner fileReader;
    public static void createFile(String filename) {
        try {
            myFile = new File(filename);
            fileReader = new Scanner(myFile);
        } catch(IOException e) {
            System.out.println("File does not exist");
        } finally {
            System.out.println("Continue");
        }
    };
    public static ArrayList<String> getStringData(String filename){
        createFile(filename);
        ArrayList<String> result = new ArrayList<>();
        while(fileReader.hasNextLine()) {
            result.add(fileReader.nextLine());
        }
        return result;
    };
    public static void main(String[] args) {
        System.out.println(FileOperator.getStringData("poem.txt"));
    }
}

