import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayOne{
  public static int distance(String filename){
    try{
      File file = new File(filename);
      Scanner readFile = new Scanner(file);
      String instructions = "";

      while (readFile.hasNext()){
        instructions += readFile.next();
      }

      String[] steps = instructions.split(",");
      int heading = 0; //this follows this array: {"north", "east", "south", "west"}.
      int x = 0;
      int y = 0;
      for (int i = 0; i < steps.length; i++){
        char turn = steps[i].charAt(0);
        if (turn == 'L'){
          heading--;
          if (heading == -1){
            heading = 3;
          }
        }
        else{
          heading++;
          if (heading == 4){
            heading = 0;
          }
        }

        if (heading == 0){
          y += Integer.parseInt(steps[i].substring(1));
        }
        else if (heading == 1){
          x += Integer.parseInt(steps[i].substring(1));
        }
        else if (heading == 2){
          y -= Integer.parseInt(steps[i].substring(1));
        }
        else{
          x -= Integer.parseInt(steps[i].substring(1));
        }
      }

      readFile.close();
      return Math.abs(x) + Math.abs(y);

    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static void main(String[]args){
    System.out.println(distance("inputDayOne.txt"));
  }
}
