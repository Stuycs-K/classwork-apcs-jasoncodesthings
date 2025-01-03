import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayFourSecond{
  public static String sums(String filename){
    try{
      File file = new File(filename);
      Scanner data = new Scanner(file);
      String line;
      String name;
      String sectorID;
      String alphabet = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
      String modify = "";

      while (data.hasNextLine()){
        line = data.nextLine();
        name = line.substring(0, line.lastIndexOf("-"));
        name = name.replace("-", " ");
        sectorID = line.substring(line.lastIndexOf("-") + 1, line.indexOf("["));

        for (int i = 0; i < name.length(); i++){
          if (name.charAt(i) == ' '){
            modify += ' ';
          }
          else{
            modify += alphabet.charAt(alphabet.indexOf(name.charAt(i)) + (Integer.parseInt(sectorID) % 26));
          }
        }
        name = modify;

        if (name.contains("north")){
          System.out.println("Original: " + line);
          System.out.println("Decrypted name: " + name);
        }

        modify = "";
      }

      data.close();
      return "";
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return "";
    }
  }

  public static void main(String[]args){
    System.out.println(sums("inputDayFour.txt"));
  }
}
