import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D3P1{
  public static int actualMul(String filename){
    try{
      File file = new File(filename);
      Scanner data = new Scanner(file);
      String line;

      

      data.close();
      return answer;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }


  public static void main(String[]args){
    System.out.println(totalDistance("inputD3.txt"));
  }
}
