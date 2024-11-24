import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayEighteen{
  public static int trapMap(String filename){
    try{
      File file = new File(filename);
      Scanner first = new Scanner(file);
      String line;
      line = first.nextLine();
      StringBuilder next = new StringBuilder();
      int answer = 0;

      line = "." + line + ".";
      for (int i = 0; i < line.length(); i++){
        next.append(".");
      }
      for (int i = 1; i < line.length() - 1; i++){
        if (line.charAt(i) == '.'){
          answer++;
        }
      }

      for (int i = 0; i < 399999; i++){
        for (int j = 1; j < line.length() - 1; j++){
          if ((line.charAt(j - 1) == '^' && line.charAt(j) == '^' && line.charAt(j + 1) == '.') ||
          (line.charAt(j - 1) == '.' && line.charAt(j) == '^' && line.charAt(j + 1) == '^') ||
          (line.charAt(j - 1) == '^' && line.charAt(j) == '.' && line.charAt(j + 1) == '.') ||
          (line.charAt(j - 1) == '.' && line.charAt(j) == '.' && line.charAt(j + 1) == '^')){
            next.setCharAt(j, '^');
          }
        }
        line = next.toString();
        next = new StringBuilder();
        for (int k = 0; k < line.length(); k++){
          next.append(".");
        }
        for (int l = 1; l < line.length() - 1; l++){
          if (line.charAt(l) == '.'){
            answer++;
          }
        }
      }

      first.close();
      return answer;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static void main(String[]args){
    System.out.println(trapMap("inputDayEighteen.txt"));
  }
}
