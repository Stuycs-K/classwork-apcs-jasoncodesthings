import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayThirteen{
  public static int numSteps(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int favnum = Integer.parseInt(input.nextLine());
      String beenBefore = "";
      String answer = findPath(favnum, 1, 1, beenBefore, "");

      input.close();
      return answer.length();
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static String findPath(int favnum, int row, int column, String beenBefore, String answer){
    String shortest = null;
    if (column == 31 && row == 39){
      return answer;
    }

    if (row != 0 && checkDoor(favnum, column, row - 1) && !beenBefore.contains(column + "|" + (row - 1))){
      beenBefore += ", " + column + "|" + row;
      String add = findPath(favnum, row - 1, column, beenBefore, answer + "U");
      if (add != null && (shortest == null || add.length() < shortest.length())){
        shortest = add;
      }
    }
    if (checkDoor(favnum, column, row + 1) && !beenBefore.contains(column + "|" + (row + 1))){
      beenBefore += ", " + column + "|" + row;
      String add = findPath(favnum, row + 1, column, beenBefore, answer + "D");
      if (add != null && (shortest == null || add.length() < shortest.length())){
        shortest = add;
      }
    }
    if (column != 0 && checkDoor(favnum, column - 1, row) && !beenBefore.contains((column - 1) + "|" + row)){
      beenBefore += ", " + column + "|" + row;
      String add = findPath(favnum, row, column - 1, beenBefore, answer + "L");
      if (add != null && (shortest == null || add.length() < shortest.length())){
        shortest = add;
      }
    }
    if (checkDoor(favnum, column + 1, row) && !beenBefore.contains((column + 1) + "|" + row)){
      beenBefore += ", " + column + "|" + row;
      String add = findPath(favnum, row, column + 1, beenBefore, answer + "R");
      if (add != null && (shortest == null || add.length() < shortest.length())){
        shortest = add;
      }
    }

    return shortest;
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
    System.out.println(numSteps("inputDayThirteen.txt"));
  }
}
