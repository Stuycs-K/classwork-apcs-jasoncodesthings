import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class D9P2{
  public static long discChecksumAdvanced(String filename){
    try{
      File file = new File(filename);
      Scanner data = new Scanner(file);
      String line = data.nextLine();
      ArrayList<String> idMap = new ArrayList<String>();
      long answer = 0;
      int countID = 0;

      for (int i = 0; i < line.length(); i++){
        if (i % 2 == 0){
          for (int j = 0; j < line.charAt(i) - '0'; j++){
            idMap.add(Integer.toString(countID));
          }
          countID++;
        }
        else{
          for (int j = 0; j < line.charAt(i) - '0'; j++){
            idMap.add(".");
          }
        }
      }
      System.out.println(idMap);

      for (int i = idMap.size() - 1; i >= 0; i--){
        if (i == notNumIndexOf(idMap)){
          int start = i;
          while (idMap.get(start) == idMap.get(i)){
            start--;
          }
          System.out.println(start);
        }
      }

      for (int i = 0; i < idMap.size(); i++){
        if (!idMap.get(i).equals(".")){
          answer += i * Integer.parseInt(idMap.get(i));
        }
      }

      data.close();
      return answer;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static int notNumIndexOf(ArrayList<String> idMap){
    for (int i = idMap.size() - 1; i >= 0; i--){
      if (!idMap.get(i).equals(".")){
        return i;
      }
    }
    return -1;
  }

  public static void main(String[]args){
    System.out.println(discChecksumAdvanced("inputD9.txt"));
  }
}