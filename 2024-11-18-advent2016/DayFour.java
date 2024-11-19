import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayFour{
  public static int sums(String filename){
    try{
      File file = new File(filename);
      Scanner data = new Scanner(file);
      String line;
      String name;
      String sectorID;
      String givenChecksum;
      String actualChecksum = "";
      int answer = 0;

      while (data.hasNextLine()){
        line = data.nextLine();
        name = line.substring(0, line.lastIndexOf("-"));
        sectorID = line.substring(line.lastIndexOf("-") + 1, line.indexOf("["));
        givenChecksum = line.substring(line.indexOf("[") + 1, line.indexOf("]"));
        System.out.println(line);
        System.out.println(name);
        System.out.println(sectorID);
        System.out.println(givenChecksum);
      }
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
    return 0;
  }

  public static void main(String[]args){
    System.out.println(sums("inputDayFour.txt"));
  }
}
