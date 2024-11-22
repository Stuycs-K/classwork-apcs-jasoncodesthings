import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayNineteen{
  public static int whiteElephant(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int numElves = Integer.parseInt(input.nextLine());
      int exp = 0;

      while (Math.pow(2, exp) < numElves){
        exp++;
      }
      exp--;

      return 2 * (numElves - (int)Math.pow(2, exp)) + 1;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static void main(String[]args){
    System.out.println(whiteElephant("inputDayNineteen.txt"));
  }
}
