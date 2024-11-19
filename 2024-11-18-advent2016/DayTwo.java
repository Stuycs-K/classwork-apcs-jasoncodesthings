import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayTwo{
  public static String bathcode(String filename){
    try{
      File file = new File(filename);
      Scanner instructions = new Scanner(file);
      String line;
      String[][] keypad = new String[][]{{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
      String position = "5";
      String answer = "";

      while (instructions.hasNextLine()){
        line = instructions.nextLine();
        System.out.println(line);
      }
      return "";
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return "";
    }
  }
  public static void main(String[]args){
    System.out.println(bathcode("inputDayTwo.txt"));
  }
}
