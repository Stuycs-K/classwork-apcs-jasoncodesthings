import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DaySeventeen{
  public static String door4x4(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      String line = input.nextLine();
      int row = 0, column = 0;
      System.out.println(line);
      String answer = findPath(line, row, column, "");

      input.close();
      return answer;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return "";
    }
  }

  public static String findPath(String ID, int row, int column, String answer){
    String hashed = getMD5(ID + answer).substring(0,4);
    System.out.println(" ");
    System.out.println(hashed);
    String direction = "UDLR";
    if (row == 3 && column == 3){
      System.out.println("hi");
      return answer;
    }

    if (hashed.charAt(0) >= 98 && row != 0){
      System.out.println("U");
      answer = findPath(ID, row - 1, column, answer + "U");
    }
    if (hashed.charAt(1) >= 98 && row != 3){
      System.out.println("D");
      answer = findPath(ID, row + 1, column, answer + "D");
    }
    if (hashed.charAt(2) >= 98 && column != 0){
      System.out.println("L");
      answer = findPath(ID, row, column - 1, answer + "L");
    }
    if (hashed.charAt(3) >= 98 && column != 3){
      System.out.println("R");
      answer = findPath(ID, row, column + 1, answer + "R");
    }
    return answer;
  }

  public static String getMD5(String doorID){
    try{
      MessageDigest md = MessageDigest.getInstance("MD5");
      byte[] bytes = md.digest(doorID.getBytes());

      StringBuilder output = new StringBuilder();
      for (int i = 0; i < bytes.length; i++){
        String hex = Integer.toHexString(0xff & bytes[i]);
        if (hex.length() == 1) {
          output.append('0');
        }
        output.append(hex);
      }

      return output.toString();

    } catch (NoSuchAlgorithmException e) {
      throw new RuntimeException("MD5 nonexistent.");
    }
  }

  public static void main(String[]args){
    System.out.println(door4x4("inputDaySeventeen.txt"));
  }
}
