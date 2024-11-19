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
      int row = 1;
      int column = 1;
      String answer = "";

      while (instructions.hasNextLine()){
        line = instructions.nextLine();
        for (int i = 0; i < line.length(); i++){
          if (line.charAt(i) == 'U'){
            if (row != 0){
              row--;
            }
          }
          else if (line.charAt(i) == 'D'){
            if (row != 2){
              row++;
            }
          }
          else if (line.charAt(i) == 'L'){
            if (column != 0){
              column--;
            }
          }
          else if (line.charAt(i) == 'R'){
            if (column != 2){
              column++;
            }
          }
        }
        answer += keypad[row][column];
      }

      instructions.close();
      return answer;

    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return "";
    }
  }
  public static void main(String[]args){
    System.out.println(bathcode("inputDayTwo.txt"));
  }
}
