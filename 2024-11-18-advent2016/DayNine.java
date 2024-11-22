import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayNine{
  public static int decompresser(String filename){
    try{
      File file = new File(filename);
      Scanner data = new Scanner(file);
      String line;
      String full = "";
      String answer = "";

      while (data.hasNextLine()){
        line = data.nextLine();
        full += line;
      }
      System.out.println(full);

      data.close();
      return answer.length();
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }
  public static void main(String[]args){
    System.out.println(decompresser("inputDayNine.txt"));
  }
}
