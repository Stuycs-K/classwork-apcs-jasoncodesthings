import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class DayThirteenSecond{
  public static int numStepsin50(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int favnum = Integer.parseInt(input.nextLine());
      String beenBefore = "";
      ArrayList<String> totalTracker = new ArrayList<String>();
      String answer = findPath(favnum, 1, 1, beenBefore, "", totalTracker, 0);
      System.out.println(totalTracker);

      input.close();
      return totalTracker.size();
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static String findPath(int favnum, int row, int column, String beenBefore, String answer, ArrayList<String> totalTracker, int steps){
    if (!totalTracker.contains(column + "|" + row)){
      totalTracker.add(column + "|" + row);
    }
    if (steps == 56){
      return "";
    }

    if (row != 0 && checkDoor(favnum, column, row - 1) && !beenBefore.contains(column + "|" + (row - 1))){
      beenBefore += ", " + column + "|" + row;
      String add = findPath(favnum, row - 1, column, beenBefore, answer + "U", totalTracker, steps + 1);
    }
    if (checkDoor(favnum, column, row + 1) && !beenBefore.contains(column + "|" + (row + 1))){
      beenBefore += ", " + column + "|" + row;
      String add = findPath(favnum, row + 1, column, beenBefore, answer + "D", totalTracker, steps + 1);
    }
    if (column != 0 && checkDoor(favnum, column - 1, row) && !beenBefore.contains((column - 1) + "|" + row)){
      beenBefore += ", " + column + "|" + row;
      String add = findPath(favnum, row, column - 1, beenBefore, answer + "L", totalTracker, steps + 1);
    }
    if (checkDoor(favnum, column + 1, row) && !beenBefore.contains((column + 1) + "|" + row)){
      beenBefore += ", " + column + "|" + row;
      String add = findPath(favnum, row, column + 1, beenBefore, answer + "R", totalTracker, steps + 1);
    }

    return "";
  }

  public static boolean checkDoor(int favnum, int x, int y){
    int equation = x * x + 3 * x + 2 * x * y + y + y * y;
    String bin = Integer.toBinaryString(equation + favnum);
    int count = 0;
    for (int i = 0; i < bin.length(); i++){
      if (bin.charAt(i) == '1'){
        count++;
      }
    }
    return count % 2 == 0;
  }

  public static void main(String[]args){
    System.out.println(numStepsin50("inputDayThirteen.txt"));
  }
}
