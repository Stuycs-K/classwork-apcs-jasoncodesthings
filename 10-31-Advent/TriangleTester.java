import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
  public static int countTrianglesA(String filename){
    try{
      File file = new File(filename);
      Scanner triangles = new Scanner(file);
      Scanner line;
      int[] arr = new int[3];
      int answer = 0;
      while(triangles.hasNextLine()){
        line = new Scanner(triangles.nextLine());
        for (int i = 0; i < 3; i++){
          if (line.hasNext()){
            arr[i] = line.nextInt();
            //System.out.println(arr[i]);
          }
        }
        if (isTriangle(arr[0], arr[1], arr[2])){
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
    try{
      File file = new File(filename);
      Scanner triangles = new Scanner(file);
      Scanner line;
      int[][] arr = new int[3][3];
      int answer = 0;
      while(triangles.hasNextLine()){
        for (int i = 0; i < 3; i++){
          line = new Scanner(triangles.nextLine());
          for (int j = 0; j < 3; j++){
            if (line.hasNext()){
              arr[i][j] = line.nextInt();
            }
          }
        }

        for (int i = 0; i < 3; i++){
          if (isTriangle(arr[0][i], arr[1][i], arr[2][i])){
            answer++;
          }
        }
      }
      triangles.close();
      return answer;

    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static void main(String[]args){
    System.out.println(countTrianglesA("inputTri.txt"));
    System.out.println(countTrianglesB("inputTri.txt"));
  }
}
