import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class D5P1{
  public static int asd(String filename){
    try{
      File file = new File(filename);
      Scanner data = new Scanner(file);
      String line;
      ArrayList<Integer> before = new ArrayList<Integer>();
      ArrayList<Integer> after = new ArrayList<Integer>();

      while (data.hasNextLine()){
        line = data.nextLine();
        if (line.contains("|")){
          before.add(Integer.parseInt(line.substring(0, line.indexOf("|"))));
          after.add(Integer.parseInt(line.substring(line.indexOf("|") + 1)));
        }
      }
      System.out.println(before);
      System.out.println(after);

      data.close();
      return -1;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }
  public static void main(String[]args){
    System.out.println(asd("inputD5.txt"));
  }
}
