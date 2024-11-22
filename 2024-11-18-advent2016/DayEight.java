import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayEight{
  public static int pixelsOnScreen(String filename){
    try{
      File file = new File(filename);
      Scanner instructions = new Scanner(file);
      String line;
      boolean[][] screen = new boolean[6][7];
      int answer = 0;

      while (instructions.hasNextLine()){
        line = instructions.nextLine();
        if (line.substring(0,4).equals("rect")){
          rectangle(screen, Integer.parseInt(line.substring(line.indexOf(" ") + 1, line.indexOf("x"))), Integer.parseInt(line.substring(line.indexOf("x") + 1)));
        }
        else if (line.substring(0,8).equals("rotate c")){
          rotateColumn(screen, Integer.parseInt(line.substring(16, line.indexOf("b") - 1)), Integer.parseInt(line.substring(line.indexOf("y") + 2)));
        }
      }
      for (int i = 0; i < 6; i++){
        for (int j = 0; j < 7; j++){
          System.out.print(screen[i][j]);
        }
        System.out.println("");
      }

      return -1;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static void rectangle(boolean[][] screen, int A, int B){
    for (int i = 0; i < B; i++){
      for (int j = 0; j < A; j++){
        screen[i][j] = true;
      }
    }
  }

  public static void rotateColumn(boolean[][] screen, int A, int B){
    for (int i = 0; i < B; i++){
      boolean[] previous = new boolean[6];
      for (int j = 0; j < 6; j++){
        previous[j] = screen[j][A];
      }
      for (int k = 0; k < 6; k++){
        if (k == 0){
          screen[k][A] = previous[5];
        }
        else{
          screen[k][A] = previous[k - 1];
        }
      }
    }
  }

  public static void main(String[]args){
    System.out.println(pixelsOnScreen("inputDayEight.txt"));
  }
}
