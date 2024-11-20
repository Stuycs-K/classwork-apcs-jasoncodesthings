import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayFour{
  public static int sums(String filename){
    try{
      File file = new File(filename);
      Scanner data = new Scanner(file);
      String line;
      String name;
      String sectorID;
      String givenChecksum;
      String actualChecksum = "";
      String alphabet = "abcdefghijklmnopqrstuvwxyz";
      int[] frequencies = new int[26];
      int maxNum = -1;
      int maxIndex = -1;
      int answer = 0;

      while (data.hasNextLine()){
        line = data.nextLine();
        name = line.substring(0, line.lastIndexOf("-"));
        name = name.replace("-", "");
        sectorID = line.substring(line.lastIndexOf("-") + 1, line.indexOf("["));
        givenChecksum = line.substring(line.indexOf("[") + 1, line.indexOf("]"));

        for (int i = 0; i < name.length(); i++){
          for (int j = 0; j < alphabet.length(); j++){
            if (name.charAt(i) == alphabet.charAt(j)){
              frequencies[j]++;
            }
          }
        }

        for (int i = 0; i < 5; i++){
          for (int j = 0; j < 26; j++){
            if (frequencies[j] > maxNum){
              maxNum = frequencies[j];
              maxIndex = j;
            }
          }
          actualChecksum += alphabet.charAt(maxIndex);
          maxNum = -1;
          frequencies[maxIndex] = -1;
        }

        if (actualChecksum.equals(givenChecksum)){
          answer += Integer.parseInt(sectorID);
        }

        frequencies = new int[26];
        maxNum = -1;
        actualChecksum = "";
      }

    return answer;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static void main(String[]args){
    System.out.println(sums("inputDayFour.txt"));
  }
}
