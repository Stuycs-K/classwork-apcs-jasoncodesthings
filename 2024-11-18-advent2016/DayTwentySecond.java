import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class DayTwentySecond{
  public static double smallBlacklist(String filename){
    try{
      File file = new File(filename);
      Scanner ips = new Scanner(file);
      String line;
      ArrayList<String> ipsformat = new ArrayList<String>();
      double min = 0.0, max = 0.0, min2 = 0.0, max2 = 0.0;
      int ipindex = 0;
      int answer = 0;
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
      }


      double[] range = new double[]{max + 1.0, max + 1.0};
      double[] actualMax = new double[]{0,0};
      double[] nextRange = new double[]{0,0};
      for (int i = 0; i < minnmax.length; i++){
        if (minnmax[i][1] > actualMax[1]){
          actualMax = minnmax[i];
        }
      }

      nextRange = actualMax;
      while(range[1] < actualMax[1]){
        for (int i = 0; i < minnmax.length; i++){
          if (minnmax[i][0] < range[1] && range[1] < minnmax[i][1]){
            range = minnmax[i];
            nextRange = actualMax;
            i = 0;
          }
          if (minnmax[i][0] > range[1] && minnmax[i][0] < nextRange[0]){
            nextRange = minnmax[i];
            i = 0;
          }
        }
        if (range[1] < actualMax[1]){
          answer += (nextRange[0] - range[1]) - 1;
          range = nextRange;
          nextRange = actualMax;
        }
      }

      ips.close();
      return answer + 1;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }
  public static void main(String[]args){
    System.out.println(smallBlacklist("inputDayTwenty.txt"));
  }
}
