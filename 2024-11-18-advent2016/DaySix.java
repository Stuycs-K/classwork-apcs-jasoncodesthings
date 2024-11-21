import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class DaySix{
  public static String message(String filename){
    try{
      File file = new File(filename);
      Scanner signal = new Scanner(file);
      String line;
      String alphabet = "abcdefghijklmnopqrstuvwxyz";
      String answer = "";

      //Each line of my input is 8 characters long, so I am making 8 ArrayLists.
      ArrayList<String> col0 = new ArrayList<String>();
      ArrayList<String> col1 = new ArrayList<String>();
      ArrayList<String> col2 = new ArrayList<String>();
      ArrayList<String> col3 = new ArrayList<String>();
      ArrayList<String> col4 = new ArrayList<String>();
      ArrayList<String> col5 = new ArrayList<String>();
      ArrayList<String> col6 = new ArrayList<String>();
      ArrayList<String> col7 = new ArrayList<String>();

      while (signal.hasNextLine()){
        line = signal.nextLine();
        col0.add(line.substring(0,1));
        col1.add(line.substring(1,2));
        col2.add(line.substring(2,3));
        col3.add(line.substring(3,4));
        col4.add(line.substring(4,5));
        col5.add(line.substring(5,6));
        col6.add(line.substring(6,7));
        col7.add(line.substring(7));
      }

      answer = answer + mostCommon(col0) + mostCommon(col1) + mostCommon(col2) + mostCommon(col3) + mostCommon(col4) + mostCommon(col5) + mostCommon(col6) + mostCommon(col7);
      return answer;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return "";
    }
  }

  public static char mostCommon(ArrayList<String> column){
    //System.out.println(column);
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    int[] frequencies = new int[26];
    int maxNum = -1;
    int maxIndex = -1;

    for (int i = 0; i < column.size(); i++){
      for (int j = 0; j < alphabet.length(); j++){
        if (column.get(i).equals(alphabet.substring(j, j + 1))){
          frequencies[j]++;
        }
      }
    }

    for (int i = 0; i < 26; i++){
      if (frequencies[i] > maxNum){
        maxNum = frequencies[i];
        maxIndex = i;
      }
    }
    return alphabet.charAt(maxIndex);
  }

  public static void main(String[]args){
    System.out.println(message("inputDaySix.txt"));
  }
}
