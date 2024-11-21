import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DaySeven{
  public static int ipCheck(String filename){
    try{
      File file = new File(filename);
      Scanner signal = new Scanner(file);
      String line;

      return -1;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return "";
    }

    public static void main(String[]args){
      System.out.println(ipCheck(inputDaySeven.txt));
    }
  }
