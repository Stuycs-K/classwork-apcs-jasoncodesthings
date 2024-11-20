import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class DayOneSecond{
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
      ArrayList<Integer>xtracker = new ArrayList<Integer>();
      ArrayList<Integer>ytracker = new ArrayList<Integer>();
      xtracker.add(Integer.valueOf(0));
      ytracker.add(Integer.valueOf(0));
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
          for (int j = 1; j <= Integer.parseInt(steps[i].substring(1)); j++){
            for (int k = 0; k < xtracker.size(); k++){
              if (xtracker.get(k) == x && ytracker.get(k) == y + j){
                return Math.abs(x) + Math.abs(y + j);
              }
            }
            xtracker.add(Integer.valueOf(x));
            ytracker.add(Integer.valueOf(y + j));
          }
          y += Integer.parseInt(steps[i].substring(1));
        }
        else if (heading == 1){
          for (int j = 1; j <= Integer.parseInt(steps[i].substring(1)); j++){
            for (int k = 0; k < xtracker.size(); k++){
              if (xtracker.get(k) == x + j && ytracker.get(k) == y){
                return Math.abs(x + j) + Math.abs(y);
              }
            }
            xtracker.add(Integer.valueOf(x + j));
            ytracker.add(Integer.valueOf(y));
          }
          x += Integer.parseInt(steps[i].substring(1));
        }
        else if (heading == 2){
          for (int j = 1; j <= Integer.parseInt(steps[i].substring(1)); j++){
            for (int k = 0; k < xtracker.size(); k++){
              if (xtracker.get(k) == x && ytracker.get(k) == y - j){
                return Math.abs(x) + Math.abs(y - j);
              }
            }
            xtracker.add(Integer.valueOf(x));
            ytracker.add(Integer.valueOf(y - j));
          }
          y -= Integer.parseInt(steps[i].substring(1));
        }
        else{
          for (int j = 1; j <= Integer.parseInt(steps[i].substring(1)); j++){
            for (int k = 0; k < xtracker.size(); k++){
              if (xtracker.get(k) == x - j && ytracker.get(k) == y){
                return Math.abs(x - j) + Math.abs(y);
              }
            }
            xtracker.add(Integer.valueOf(x - j));
            ytracker.add(Integer.valueOf(y));
          }
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
