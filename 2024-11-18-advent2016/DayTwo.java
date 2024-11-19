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
      int x = 1;
      int y = 1;
      String answer = "";

      while (instructions.hasNextLine()){
        line = instructions.nextLine();
        for (int i = 0; i < line.length(); i++){
          if (line.charAt(i) == 'U'){
            if (y != 2){
              y++;
            }
          }
          else if (line.charAt(i) == 'D'){
            if (y != 0){
              y--;
            }
          }
          else if (line.charAt(i) == 'L'){
            if (x != 0){
              x--;
            }
          }
          else if (line.charAt(i) == 'R'){
            if (x != 2){
              x++;
            }
          }
          System.out.println(x + ", " + y);
        }
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
