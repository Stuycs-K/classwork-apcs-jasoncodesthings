import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DaySeven{
  public static int ipCheck(String filename){
    try{
      File file = new File(filename);
      Scanner addresses = new Scanner(file);
      String line;
      String left;
      String middle;
      String right;

      while (addresses.hasNextLine()){
        line = addresses.nextLine();
        left = line.substring(0, line.indexOf("["));
        middle = line.substring(line.indexOf("[") + 1, line.indexOf("]"));
        right = line.substring(line.indexOf("]") + 1);
        System.out.println(left);
        System.out.println(middle);
        System.out.println(right);
      }
      return 0;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return 0;
    }
  }

  public static void main(String[]args){
    System.out.println(ipCheck("inputDaySeven.txt"));
  }
}
