import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class D8P1{
  public static int antinodeCount(String filename){
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
      //find all types of frequency
      //for loop through each unique frequency and find the coords of each instance
      //then find all of the possible antinodes by using the inside of the distance formula and using a double nested for loop.
      //count the ones that are in bounds
      data.close();
      return -1;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }
  public static void main(String[]args){
    System.out.println(antinodeCount("inputD8.txt"));
  }
}
