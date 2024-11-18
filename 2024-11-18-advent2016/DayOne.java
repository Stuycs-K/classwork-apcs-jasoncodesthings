import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayOne{
  public static int distance(String filename){
    try{
      File file = new File(filename);
      Scanner instructions = new Scanner(file);
      String[] step = instructions.split(", ");
      String[] compass = new String[4]{"north", "east", "south", "west"};
      String heading = "north";
      int x = 0;
      int y = 0;
    }
  }
}
