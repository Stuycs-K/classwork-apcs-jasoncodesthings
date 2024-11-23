import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class DayTwenty{
  public static int smallBlacklist(String filename){
    try{
      File file = new File(filename);
      Scanner ips = new Scanner(file);
      String line;
      ArrayList<String> ipsformat = new ArrayList<String>();
      double min = 0.0, max = 9.0;
      int ipindex = 0;
      while (ips.hasNextLine()){
        line = ips.nextLine();
        ipsformat.add(line);
      }
      String[][] minnmax = new String[ipsformat.size()][2];
      for (int i = 0; i < ipsformat.size(); i++){
        minnmax[i] = ipsformat.get(i).split("-");
        System.out.println(Double.parseDouble(minnmax[i][0]));
        System.out.println(Double.parseDouble(minnmax[i][1]));
      }

      

      ips.close();
      return -1;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }
  public static void main(String[]args){
    System.out.println(smallBlacklist("inputDayTwenty.txt"));
  }
}
