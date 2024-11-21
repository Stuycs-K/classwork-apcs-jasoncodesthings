import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class DaySeven{
  public static int ipCheck(String filename){
    try{
      File file = new File(filename);
      Scanner addresses = new Scanner(file);
      String line;
      int answer = 0;
      //make an arraylists of the substrings and an arraylist of booleans, check if each boolean is true/false

      while (addresses.hasNextLine()){
        line = addresses.nextLine();
        ArrayList<String>sections = new ArrayList<String>();
        while (line.length() != 0){
          System.out.println(line);
          if ((sections.size() % 2 == 0) && (line.indexOf("]") != -1)){
            sections.add(line.substring(0, line.indexOf("[")));
            line = line.substring(line.indexOf("[") + 1);
          }
          else{
            if (line.indexOf("]") != -1){
              sections.add(line.substring(0, line.indexOf("]")));
              line = line.substring(line.indexOf("]") + 1);
            }
            else{
              sections.add(line);
              line = "";
            }
          }
          System.out.println(sections);
        }
      }
      addresses.close();
      return answer;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static boolean tlsCheck(String data){
    for (int i = 0; i < data.length() - 3; i++){
      if (data.charAt(i) == data.charAt(i + 3) && data.charAt(i + 1) == data.charAt(i + 2) && data.charAt(i) != data.charAt(i + 1)){
        return true;
      }
    }
    return false;
  }

  public static void main(String[]args){
    System.out.println(ipCheck("inputDaySeven.txt"));
  }
}
