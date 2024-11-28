import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class DayThirteen{
  public static int numSteps(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int favnum = Integer.parseInt(input.nextLine());
      ArrayList<String> beenBefore = new ArrayList<String>();
      beenBefore.add(1 + "|" + 1);
      String answer = findPath(favnum, 1, 1, beenBefore, 0);
      System.out.println(checkDoor(favnum,2,1));
      System.out.println(checkDoor(favnum,2,0));
      System.out.println(checkDoor(favnum,1,0));

      input.close();
      return -1;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static String findPath(int favnum, int row, int column, ArrayList<String> beenBefore, int answer){
    String shortest = null;
    return "";
    //if ((row != 0) ||
  }

  public static boolean checkDoor(int input, int x, int y){
    int equation = x * x + 3 * x + 2 * x * y + y + y * y;
    String bin = Integer.toBinaryString(equation + input);
    int count = 0;
    for (int i = 0; i < bin.length(); i++){
      if (bin.charAt(i) == '1'){
        count++;
      }
    }
    return count % 2 == 0;
  }

  public static void main(String[]args){
    System.out.println(numSteps("inputDayThirteen.txt"));
  }
}
