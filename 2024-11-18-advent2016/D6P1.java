import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class D6P1{
  public static int stepTrack(String filename){
    try{
      File file = new File(filename);
      Scanner data = new Scanner(file);
      String line;
      ArrayList<String> map = new ArrayList<String>();

      while (data.hasNextLine()){
        line = data.nextLine();
        map.add(line);
      }
      System.out.println(map);

      data.close();
      return -1;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }
  public static void main(String[]args){
    System.out.println(stepTrack("inputD6.txt"));
  }
}
