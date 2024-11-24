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

      line = "." + line + ".";
      System.out.println(line);
      for (int i = 0; i < line.length(); i++){
        next.append(".");
      }

      for (int i = 0; i < 9; i++){
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
        System.out.println(line);
      }

      first.close();
      return -1;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static void main(String[]args){
    System.out.println(trapMap("inputDayEighteen.txt"));
  }
}
