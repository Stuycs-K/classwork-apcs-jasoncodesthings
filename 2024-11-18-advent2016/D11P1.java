import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class D11P1{
  public static int stoneCount(String filename){
    try{
      File file = new File(filename);
      Scanner data = new Scanner(file);
      String line = data.nextLine();
      String[] convert = line.split(" ");
      ArrayList<String> stones = new ArrayList<String>();

      for (String i : convert){
        stones.add(i);
      }

      System.out.println(stones);

      data.close();
      return -1;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }
  public static void main(String[]args){
    System.out.println(stoneCount("inputD11.txt"));
  }
}
