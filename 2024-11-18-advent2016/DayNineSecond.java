import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayNineSecond{
  public static double decompresser(String filename){
    try{
      File file = new File(filename);
      Scanner data = new Scanner(file);
      String line;
      int i = 0;
      int subsequent;
      int repeat;
      String part;
      String full = "";
      double answer = 0;

      while (data.hasNextLine()){
        line = data.nextLine();
        full += line;
      }

      while (i < full.length()){
        if (full.charAt(i) == '('){
          subsequent = Integer.parseInt(full.substring(i).substring(1, full.substring(i).indexOf("x")));
          repeat = Integer.parseInt(full.substring(i).substring(full.substring(i).indexOf("x") + 1, full.substring(i).indexOf(")")));
          part = full.substring(i).substring(full.substring(i).indexOf(")") + 1, full.substring(i).indexOf(")") + 1 + subsequent);

          answer += (double)(expand(part) * repeat);
          i += full.substring(i).indexOf(")") + 1 + subsequent;
        }
        else{
          answer++;
          i++;
        }
      }

      data.close();
      return answer;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static double expand(String part){
    int j = 0, sub, rep;
    double partAnswer = 0;
    String part2;
    while (j < part.length()){
      if (part.charAt(j) == '('){
        sub = Integer.parseInt(part.substring(j).substring(1, part.substring(j).indexOf("x")));
        rep = Integer.parseInt(part.substring(j).substring(part.substring(j).indexOf("x") + 1, part.substring(j).indexOf(")")));
        part2 = part.substring(j).substring(part.substring(j).indexOf(")") + 1, part.substring(j).indexOf(")") + 1 + sub);

        partAnswer += (double)(expand(part2) * rep);
        j += part.substring(j).indexOf(")") + 1 + sub;
      }
      else{
        partAnswer++;
        j++;
      }
    }
    return partAnswer;
  }

  public static void main(String[]args){
    System.out.println(decompresser("inputDayNine.txt"));
  }
}
