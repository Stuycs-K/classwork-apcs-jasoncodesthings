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

      while (addresses.hasNextLine()){
        line = addresses.nextLine();
        ArrayList<String>sections = new ArrayList<String>();
        while (line.length() != 0){
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
        }

        if (tlsCheck(sections)){
          answer++;
        }
      }

      addresses.close();
      return answer;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static boolean tlsCheck(ArrayList<String> data){
    boolean inside = true;
    boolean outside = false;
    for (int i = 0; i < data.size(); i++){
      for (int j = 0; j < data.get(i).length() - 3; j++){
        if (data.get(i).charAt(j) == data.get(i).charAt(j + 3) && data.get(i).charAt(j + 1) == data.get(i).charAt(j + 2) && data.get(i).charAt(j) != data.get(i).charAt(j + 1)){
          if (i % 2 == 0){
            outside = true;
          }
          else{
            inside = false;
          }
        }
      }
    }
    return outside && inside;
  }

  public static void main(String[]args){
    System.out.println(ipCheck("inputDaySeven.txt"));
  }
}
