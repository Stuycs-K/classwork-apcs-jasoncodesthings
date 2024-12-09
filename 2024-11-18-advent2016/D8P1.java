import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class D8P1{
  public static int antinodeCount(String filename){
    try{
      File file = new File(filename);
      Scanner data = new Scanner(file);
      String line;
      ArrayList<StringBuilder> map = new ArrayList<StringBuilder>();

      while (data.hasNextLine()){
        line = data.nextLine();
        map.add(new StringBuilder(line));
      }

      for (int i = 0; i < map.size(); i++){
        for (int j = 0; j < map.get(0).length(); j++){
          if (map.get(i).charAt(j) != '.'){
            possibleNodes(map, map.get(i).charAt(j));
          }
        }
      }

      //find all types of frequency
      //for loop through each unique frequency and find the coords of each instance
      //then find all of the possible antinodes by using the inside of the distance formula and using a double nested for loop.
      //count the ones that are in bounds
      data.close();
      return -1;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static int possibleNodes(ArrayList<StringBuilder> map, char frequency){
    ArrayList<String> coords = new ArrayList<String>();
    for (int i = 0; i < map.size(); i++){
      for (int j = 0; j < map.get(0).length(); j++){
        if (map.get(i).charAt(j) == frequency){
          coords.add(i + "|" + j);
        }
      }
    }
    System.out.println(coords);
    //System.out.println(map);
    for (String replace : coords){
      map.get(Integer.parseInt(replace.substring(0, replace.indexOf("|")))).setCharAt(Integer.parseInt(replace.substring(replace.indexOf("|") + 1)), '.');
    }
    System.out.println(map);
    return -1;
  }

  public static void main(String[]args){
    System.out.println(antinodeCount("inputD8.txt"));
  }
}
