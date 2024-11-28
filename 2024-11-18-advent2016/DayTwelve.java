import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayTwelve{
  public static int finda(String filename){
    try{
      File file = new File(filename);
      Scanner instructions = new Scanner(file);
      String line;
      int[] vals = new int[4];

      while (instructions.hasNextLine()){
        line = instructions.nextLine();
        
      }

      instructions.close();
      return vals[0];
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }
  public static void main(String[]args){
    System.out.println(finda("inputDayTwelve.txt"));
  }
}
