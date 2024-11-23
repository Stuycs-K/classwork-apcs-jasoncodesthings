import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayTwenty{
  public static int smallBlacklist(String filename){
    try{
      File file = new File(filename);
      Scanner ips = new Scanner(file);
      String line;

      ips.close();
      return -1
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }
  public static void main(String[]args){
    System.out.println(smallBlacklist("inputDayTwenty.txt"));
  }
}
