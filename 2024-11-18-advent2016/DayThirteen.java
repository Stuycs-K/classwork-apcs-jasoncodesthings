import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayThirteen{
  public static int numSteps(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int favnum = Integer.parseInt(input.nextLine());

      input.close()
      return -1;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }
  public static void main(String[]args){
    System.out.println(numSteps("inputDayThirteen.txt"));
  }
}
