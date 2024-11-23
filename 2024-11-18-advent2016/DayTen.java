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
      ArrayList<Integer> listBots = new ArrayList<Integer>();
      ArrayList<Integer> chip1 = new ArrayList<Integer>();
      ArrayList<Integer> chip2 = new ArrayList<Integer>();
      int value;
      int botID;
      while (instructions.hasNextLine()){
        line = instructions.nextLine();
        listInstructions.add(line);
      }
      System.out.println(listInstructions);

      for (int i = 0; i < listInstructions.size(); i++){
        String step = listInstructions.get(i);
        if (step.substring(0,5).equals("value")){
          value = Integer.parseInt(step.substring(step.indexOf(" ") + 1, step.indexOf("g") - 1));
          botID = Integer.parseInt(step.substring(step.indexOf("bot") + 4));
          System.out.println(value + ", " + botID);
        }
      }

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
