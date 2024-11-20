import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayTwoSecond{
  public static String bathcode(String filename){
    try{
      File file = new File(filename);
      Scanner instructions = new Scanner(file);
      String line;
      String[][] keypad = new String[][]{{"1"}, {"2", "3", "4"}, {"5", "6", "7", "8", "9"}, {"A", "B", "C"}, {"D"}};
      int row = 2;
      int column = 0;
      String answer = "";

      while (instructions.hasNextLine()){
        line = instructions.nextLine();
        for (int i = 0; i < line.length(); i++){
          if (line.charAt(i) == 'U'){
            if ((row > 2) || (row == 2 && column != 0 && column != 4) || (row == 1 && column == 2)){
              row--;
            }
          }
          else if (line.charAt(i) == 'D'){
            if ((row < 2) || (row == 2 && column != 0 && column != 4) || (row == 3 && column == 2)){
              row++;
            }
          }
          else if (line.charAt(i) == 'L'){
            if ((column > 2) || (column == 2 && row != 0 && row != 4) || (column == 1 && row == 2)){
              column--;
            }
          }
          else if (line.charAt(i) == 'R'){
            if ((column < 2) || (column == 2 && row != 0 && row != 4) || (column == 3 && row == 2)){
              column++;
            }
          }
        }
        if (row == 0 || row == 4){
          answer += keypad[row][0];
        }
        else if (row == 1 || row == 3){
          answer += keypad[row][column - 1];
        }
        else{
          answer += keypad[row][column];
        }
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
