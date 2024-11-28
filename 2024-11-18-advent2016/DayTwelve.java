import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class DayTwelve{
  public static int finda(String filename){
    try{
      File file = new File(filename);
      Scanner instructions = new Scanner(file);
      ArrayList<String> lines = new ArrayList<String>();
      String listLetters = "abcd";
      int[] vals = new int[4];
      int i = 0;

      while (instructions.hasNextLine()){
        lines.add(instructions.nextLine());
      }

      while (i < lines.size()){
        if (lines.get(i).substring(0,3).equals("cpy")){
          if (lines.get(i).charAt(4) >= 'a'){
            vals[listLetters.indexOf(lines.get(i).charAt(lines.get(i).length() - 1))] = vals[listLetters.indexOf(lines.get(i).charAt(4))];
          }
          else{
            vals[listLetters.indexOf(lines.get(i).charAt(lines.get(i).length() - 1))] = Integer.parseInt(lines.get(i).substring(lines.get(i).indexOf(" ") + 1, lines.get(i).lastIndexOf(" ")));
          }
        }

        else if (lines.get(i).substring(0,3).equals("inc")){
          vals[listLetters.indexOf(lines.get(i).charAt(lines.get(i).length() - 1))]++;
        }
        else if (lines.get(i).substring(0,3).equals("dec")){
          vals[listLetters.indexOf(lines.get(i).charAt(lines.get(i).length() - 1))]--;
        }

        else{
          if (lines.get(i).charAt(4) >= 'a'){
            if (vals[listLetters.indexOf(lines.get(i).charAt(4))] != 0){
              i += Integer.parseInt(lines.get(i).substring(lines.get(i).lastIndexOf(" ") + 1)) - 1;
            }
          }
          else{
            if (Integer.parseInt(lines.get(i).substring(lines.get(i).indexOf(" ") + 1, lines.get(i).lastIndexOf(" "))) != 0){
              i += Integer.parseInt(lines.get(i).substring(lines.get(i).lastIndexOf(" ") + 1)) - 1;
            }
          }
        }
        i++;
      }

      instructions.close();
      return vals[0];
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }
  public static void main(String[]args){
    System.out.println(finda("inputDayTwelve.txt"));
  }
}
