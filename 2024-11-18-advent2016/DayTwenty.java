import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class DayTwenty{
  public static double smallBlacklist(String filename){
    try{
      File file = new File(filename);
      Scanner ips = new Scanner(file);
      String line;
      ArrayList<String> ipsformat = new ArrayList<String>();
      double min = 0.0, max = 0.0;
      int ipindex = 0;
      while (ips.hasNextLine()){
        line = ips.nextLine();
        ipsformat.add(line);
      }
      String[][] temp = new String[ipsformat.size()][2];
      double[][] minnmax = new double[ipsformat.size()][2];
      for (int i = 0; i < ipsformat.size(); i++){
        temp[i] = ipsformat.get(i).split("-");
        minnmax[i] = new double[]{Double.parseDouble(temp[i][0]), Double.parseDouble(temp[i][1])};
      }

      while (ipindex < ipsformat.size()){
        if (min <= minnmax[ipindex][0] && minnmax[ipindex][0] <= max + 1 && max < minnmax[ipindex][1]){
          min = minnmax[ipindex][0];
          max = minnmax[ipindex][1];
          ipindex = 0;
        }
        else{
          ipindex++;
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println("h");
      }

      ips.close();
      return max + 1.0;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }
  public static void main(String[]args){
    System.out.println(smallBlacklist("inputDayTwenty.txt"));
  }
}
