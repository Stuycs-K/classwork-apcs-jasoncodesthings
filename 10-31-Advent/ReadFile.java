//1 you need all three imports.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

  public static void main(String[] args) {
    //2 Opening a file requires a try/catch
    /*
    try {
      File file = new File("ReadFile.java");//1
      Scanner input = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      while(input.hasNext()){
        System.out.println(input.nextLine());
      }


    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return; //you can return from a void function just don't put a value.
    }
    input.close();


    try {
      File file = new File("ReadFile.java");//1
      Scanner input = new Scanner(file);
      int index = 0;
      while(input.hasNextLine()){
        if (index % 2 == 0){
          System.out.println(input.nextLine());
          index++;
        }
        else{
          input.nextLine();
          System.out.println(" ");
          index++;
        }
      }
      input.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return;
  }
*/

  try {
    File file = new File("ReadFile.java");//1
    Scanner input = new Scanner(file);
    String str;
    while(input.hasNextLine()){
      str = input.nextLine();
      if (str.contains("{")){
        System.out.println(str);
      }
    }
    input.close();//releases the file from your program

  } catch (FileNotFoundException ex) {
    //File not found what should you do?
    System.out.println("File not found");
    return;
}
}
}
