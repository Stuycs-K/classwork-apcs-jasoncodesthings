import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayNine{
  public static int decompresser(String filename){
    try{
      File file = new File(filename);
      Scanner data = new Scanner(file);
      String line;
      int i = 0;
      int subsequent;
      int repeat;
      String full = "";
      String answer = "";

      while (data.hasNextLine()){
        line = data.nextLine();
        full += line;
      }

      while (i < full.length()){
        if (full.charAt(i) == '('){
          subsequent = Integer.parseInt(full.substring(i).substring(1, full.substring(i).indexOf("x")));
          repeat = Integer.parseInt(full.substring(i).substring(full.substring(i).indexOf("x") + 1, full.substring(i).indexOf(")")));
          for (int j = 0; j < repeat; j++){
            answer += full.substring(i).substring(full.substring(i).indexOf(")") + 1, full.substring(i).indexOf(")") + 1 + subsequent);
          }
          i += full.substring(i).indexOf(")") + 1 + subsequent;
        }
        else{
          answer += full.charAt(i);
          i++;
        }
      }

      data.close();
      return answer.length();
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }
  public static void main(String[]args){
    System.out.println(decompresser("inputDayNine.txt"));
  }
}
