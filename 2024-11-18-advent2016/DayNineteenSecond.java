import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class DayNineteenSecond{
  public static int whiteElephantAcross(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int numElves = Integer.parseInt(input.nextLine());
      int split = 1; //this marks when answer starts to increment by 2
      int answer = 0;

      for (int i = 1; i <= numElves; i++){
        if (answer + 2 > i){
          split = answer;
          answer = 1;
        }
        else if (answer < split){
          answer++;
        }
        else{
          answer += 2;
        }
      }

      input.close();
      return answer;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static void main(String[]args){
    System.out.println(whiteElephantAcross("inputDayNineteen.txt"));
  }
}
