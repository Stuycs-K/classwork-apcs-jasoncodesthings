import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayNineSecond{
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
      String part = "";

      while (data.hasNextLine()){
        line = data.nextLine();
        full += line;
      }

      while (i < full.length()){
        if (full.charAt(i) == '('){
          subsequent = Integer.parseInt(full.substring(i).substring(1, full.substring(i).indexOf("x")));
          repeat = Integer.parseInt(full.substring(i).substring(full.substring(i).indexOf("x") + 1, full.substring(i).indexOf(")")));

          answer += expand(full.substring(i).substring(full.substring(i).indexOf(")") + 1, full.substring(i).indexOf(")") + 1 + subsequent), repeat);
          i += full.substring(i).indexOf(")") + 1 + subsequent;
        }
        else{
          answer += "1";
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

  public static String expand(String part, int repeat){
    String str = "";
    String add = "";
    int addj = 0;
    int sub;
    int rep;
    String part2;
    int j = 0;

    for (int i = 0; i < repeat; i++){
      str += part;
    }

    while(j < str.length()){
      if (str.charAt(j) == '('){
        sub = Integer.parseInt(str.substring(j + 1, str.indexOf("x")));
        rep = Integer.parseInt(str.substring(str.indexOf("x") + 1, str.indexOf(")")));
        part2 = str.substring(str.indexOf(")") + 1, str.indexOf(")") + 1 + sub);
        for (int i = 0; i < rep; i++){
          add += part2;
          addj++;
        }

        if (j == 0){
          str = add + str.substring(str.indexOf(")") + 1 + sub);
        }
        else{
          str = str.substring(0, j) + add + str.substring(str.indexOf(")") + 1 + sub);
        }
        System.out.println(str);
        add = "";
        j += addj * part2.length();
        System.out.println(j);
        System.out.println("length: " + str.length());
      }
      else{
        j++;
      }
    }

    return "";
  }

  public static void main(String[]args){
    System.out.println(decompresser("inputDayNine.txt"));
  }
}
