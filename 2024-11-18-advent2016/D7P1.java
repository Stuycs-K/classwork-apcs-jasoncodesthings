import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class D7P1{
  public static int calibrationCount(String filename){
    try{
      File file = new File(filename);
      Scanner data = new Scanner(file);
      String line;
      int answer = 0;

      while (data.hasNextLine()){
        line = data.nextLine();
        int given = Integer.parseInt(line.substring(0, line.indexOf(": ")));
        String[] convert = line.substring(line.indexOf(" ") + 1).split(" ");
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (String convNum : convert){
          nums.add(Integer.parseInt(convNum));
        }
        ArrayList<Integer> actualList = new ArrayList<Integer>();
        possibleResults(actualList, nums, 0, 0);
        if (actualList.contains(given)){
          answer++;
        }
      }

      data.close();
      return answer;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static void possibleResults(ArrayList<Integer> actualList, ArrayList<Integer> nums, int i, int current){
    if (i == nums.size()){
      actualList.add(current);
      System.out.println(actualList);
    }
    else{
      int value = nums.get(i);
      System.out.println(i + ", " + value);
      possibleResults(actualList, nums, i + 1, current + value);
      if (current != 0){
        possibleResults(actualList, nums, i + 1, current * value);
      }
      else{
        possibleResults(actualList, nums, i + 1, value);
      }
    }
  }

  public static void main(String[]args){
    System.out.println(calibrationCount("inputD7.txt"));
  }
}
