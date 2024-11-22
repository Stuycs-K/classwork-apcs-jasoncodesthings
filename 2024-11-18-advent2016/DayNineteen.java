import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class DayNineteen{
  public static int whiteElephant(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int numElves = Integer.parseInt(input.nextLine());
      ArrayList<Integer> elfID = new ArrayList<Integer>(numElves);
      ArrayList<Integer> giftList = new ArrayList<Integer>(numElves);
      int i = 0;
      for (int i = 1; i <= numElves; i++){
        elfID.add(i)
        giftList.add(1);
      }

      

      input.close();
      return -1;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static int monolopyCheck(int[] elfID, int[] giftList){
    for (int i = 0; i < elfID.length; i++){
      if (giftList[i] == elfID.length){
        return elfID[i];
      }
    }
    return -1;
  }

  public static void main(String[]args){
    System.out.println(whiteElephant("inputDayNineteen.txt"));
  }
}
