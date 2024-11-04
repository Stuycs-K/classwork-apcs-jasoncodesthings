import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
  public static int countTrianglesA(String filename){
    File file = new File(filename);
    Scanner triangles = new Scanner(file);
    String str;
    String[] arr;
    int answer = 0;

    try{
      while(triangles.hasNextLine()){
        str = triangles.nextLine();
        arr = str.split(" ");
        if (Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) > Integer.parseInt(arr[2]) || Integer.parseInt(arr[1]) + Integer.parseInt(arr[2]) > Integer.parseInt(arr[0]) || Integer.parseInt(arr[2]) + Integer.parseInt(arr[0]) > Integer.parseInt(arr[1])){
          answer++;
        }
      }
      triangles.close();

    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
    return answer;
  }

  public static void main(String[]args){
    System.out.println(countTrianglesA("inputTri.txt"));
  }
}
