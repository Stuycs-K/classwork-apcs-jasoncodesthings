import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class D9P1{
  public static int discChecksum(String filename){
    try{
      File file = new File(filename);
      Scanner data = new Scanner(file);
      String line;
      int answer = 0;

      //Make the line the entire input and make an ArrayList<String> containing the disc's data with ID number ("num" and "."). Do the swapping and calculate the checksum. 

      data.close();
      return answer;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static void main(String[]args){
    System.out.println(discChecksum("inputD9.txt"));
  }
}
