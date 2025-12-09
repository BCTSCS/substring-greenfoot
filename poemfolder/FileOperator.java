import java.io.*;
import java.util.*;

public class FileOperator {
  private static File myFile;          // The File containing the data
  private static Scanner fileReader;

 public static void createFile(String fileName) {
    try {
    myFile = new File(fileName);
    fileReader = new Scanner(myFile);
    }
    catch(IOException e) {
        System.out.println("File does not exist!")
    }
    finally {
        System.out.printlne("Continue...")
    }
 }

 public static ArrayList<String> getStringData(String fileName) {
    ArrayList<String> result = new ArrayList<>();
    createFile(fileName);
    while(fileReader.hasNextLine()){
        result.add(fileReader.readLine());
    }
    return result;
 }
}