import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D3P2{
  public static int mulCount(String filename){
    try{
      File file = new File(filename);
      Scanner data = new Scanner(file);
      String line;
      int answer = 0;
      boolean ignore = false;

      while (data.hasNextLine()){
        line = data.nextLine();
        int i = 0;
        boolean stop = false;
        while (i < line.length() - 3){
          if (i < line.length() - 7 && line.substring(i, i + 7).equals("don't()") || ignore){
            System.out.println(i + "hi");
            ignore = true;
            while (i < line.length() - 3 && !stop){
              if (!line.substring(i, i + 4).equals("do()")){
                i++;
              }
              else{
                stop = true;
                ignore = false;
                i += 4;
                //System.out.println(line.charAt(i));
              }
            }
            stop = false;
          }
          else{
            if (line.substring(i, i + 3).equals("mul")){
              if (isMul(line.substring(i, line.substring(i).indexOf(")") + 1 + i))){
                answer += Integer.parseInt(line.substring(i).substring(line.substring(i).indexOf("(") + 1, line.substring(i).indexOf(","))) *
                Integer.parseInt(line.substring(i).substring(line.substring(i).indexOf(",") + 1, line.substring(i).indexOf(")")));
                i += line.substring(i).indexOf(")") + 1;
              }
              else{
                i++;
              }
            }
            else{
              i++;
            }
          }
        }
      }

      data.close();
      return answer;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static boolean isMul(String str){
    if (str.charAt(3) == '(' && str.indexOf(",") != -1){
      for (int i = 3; i < str.length(); i++){
        if (str.charAt(i) != '(' && str.charAt(i) != ')' && str.charAt(i) != ',' && (str.charAt(i) < '0' || str.charAt(i) > '9')){
          return false;
        }
      }
      return true;
    }
    return false;
  }

  public static void main(String[]args){
    System.out.println(mulCount("inputD3.txt"));
  }
}
