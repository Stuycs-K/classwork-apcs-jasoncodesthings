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
      String hashed;
      StringBuilder answer = new StringBuilder();
      int i = 0;

      while (door.hasNextLine()){
        line = door.nextLine();
        while (answer.length() < 8){
          hashed = getMD5(line + i);
          if (hashed.substring(0,5).equals("00000")){
            answer.append(hashed.charAt(5));
          }
          i++;
        }
      }

      return answer.toString();
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return "";
    }
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
    System.out.println(password("inputDayFive.txt"));
  }
}
