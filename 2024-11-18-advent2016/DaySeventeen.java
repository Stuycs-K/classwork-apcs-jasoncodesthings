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
      String answer = findPath(line);

      input.close();
      return answer;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return "";
    }
  }

  public static String findPath(String ID){
    String hashed = getMD5(ID).substring(0,4);
    System.out.println(hashed);
    return "";
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
    System.out.println(door4x4("inputDayNineteen.txt"));
  }
}
