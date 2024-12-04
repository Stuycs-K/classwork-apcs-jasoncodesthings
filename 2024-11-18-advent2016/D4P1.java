import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D4P1{
  public static int mulCount(String filename){
    try{
      File file = new File(filename);
      Scanner data = new Scanner(file);
      String line, total = data.nextLine();
      while (data.hasNextLine()){
        line = data.nextLine();
        total += ", " + line;
      }
      System.out.println(total);

      data.close();
      return -1;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static void main(String[]args){
    System.out.println(mulCount("inputD4.txt"));
  }
}
