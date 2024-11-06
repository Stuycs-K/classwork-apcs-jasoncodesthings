import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
  public static int countTrianglesA(String filename){
    try{
      File file = new File(filename);
      Scanner triangles = new Scanner(file);
      String str;
      String[] arr;
      int answer = 0;
      while(triangles.hasNextLine()){
        str = triangles.nextLine();
        arr = str.split(" ");
        if (isTriangle(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]))){
          answer++;
        }
      }
      triangles.close();
      return answer;

    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static boolean isTriangle(int s0, int s1, int s2){
    return s0 + s1 > s2 && s1 + s2 > s0 && s2 + s0 > s1;
  }

  public static int countTrianglesB(String filename){
    return 0;
  }

  public static void main(String[]args){
    System.out.println(countTrianglesA("inputTri.txt"));
  }
}
