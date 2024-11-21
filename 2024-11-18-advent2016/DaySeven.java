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
        System.out.println(tlsCheck(left));
        System.out.println(tlsCheck(middle));
        System.out.println(tlsCheck(right));
        System.out.println("");
      }
      return 0;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return 0;
    }
  }

  public static boolean tlsCheck(String data){
    for (int i = 0; i < data.length() - 3; i++){
      if (data.charAt(i) == data.charAt(i + 3) && data.charAt(i + 1) == data.charAt(i + 2) && data.charAt(i) != data.charAt(i + 1)){
        return true;
      }
    }
    return false;
  }

  public static void main(String[]args){
    System.out.println(ipCheck("inputDaySeven.txt"));
  }
}
