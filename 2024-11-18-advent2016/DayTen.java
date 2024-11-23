import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class DayTen{
  public static String chipExchange(String filename){
    try{
      File file = new File(filename);
      Scanner instructions = new Scanner(file);
      String line;
      ArrayList<String> listInstructions = new ArrayList<String>();
      while (instructions.hasNextLine()){
        line = instructions.nextLine();
        listInstructions.add(line);
      }
      System.out.println(listInstructions);

      instructions.close();
      return "";
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return "";
    }
  }
  public static void main(String[]args){
    System.out.println(chipExchange("inputDayTen.txt"));
  }
}
