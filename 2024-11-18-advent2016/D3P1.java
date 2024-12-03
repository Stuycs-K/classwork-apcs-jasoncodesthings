import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D3P1{
  public static int mulCount(String filename){
    try{
      File file = new File(filename);
      Scanner data = new Scanner(file);
      String line;

      System.out.println(isMul("mul(4*"));
      System.out.println(isMul("mul(6,9!"));
      System.out.println(isMul("mul ( 2 , 4 )"));
      System.out.println(isMul("mul(2,4)"));
      System.out.println(isMul("mul(5,5)"));

      data.close();
      return -1;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static boolean isMul(String str){
    for (int i = 3; i < str.length(); i++){
      if (str.charAt(i) != '(' && str.charAt(i) != ')' && str.charAt(i) != ',' && (str.charAt(i) < '0' || str.charAt(i) > '9')){
        return false;
      }
    }
    return true;
  }

  public static void main(String[]args){
    System.out.println(mulCount("inputD3.txt"));
  }
}
