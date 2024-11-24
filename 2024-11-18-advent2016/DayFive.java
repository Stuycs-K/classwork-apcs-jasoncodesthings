import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DayFive{
  public static String password(String filename){
    try{
      File file = new File(filename);
      Scanner door = new Scanner(file);
      String line;
      String answer = "";

      while (door.hasNextLine()){
        line = door.nextLine();
        System.out.println(getMD5(line));
      }

      return answer;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return "";
    }
  }

  public static String getMD5(String doorID){
    try{
      MessageDigest md = MessageDigest.getInstance("MD5");
      byte[] bytes = md.digest(doorID.getBytes());

      String output = "";
      for (int i = 0; i < bytes.length; i++){
        String hex = Integer.toHexString(0xff & bytes[i]);
        if (hex.length() == 1) {
          output += '0';
        }
        output += hex;
      }

      return output;

    } catch (NoSuchAlgorithmException e) {
      throw new RuntimeException("MD5 nonexistent.");
    }
  }

  public static void main(String[]args){
    System.out.println(password("inputDayFive.txt"));
  }
}
