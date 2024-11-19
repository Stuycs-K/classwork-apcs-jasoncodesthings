import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayFour{
  public static int sums(String filename){
    File file = new File(filename);
    Scanner data = new Scanner(file);
    String line;
    String name;
    int sectorID;
    String actualChecksum = "";
    int answer = 0;

    while (data.hasNextLine()){
      line = data.nextLine();
      name = line.substring(0, line.lastIndexOf("-"));
    }
  }

}
