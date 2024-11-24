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
      String next = ".......";

      line = "." + line + ".";

      first.close()
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
