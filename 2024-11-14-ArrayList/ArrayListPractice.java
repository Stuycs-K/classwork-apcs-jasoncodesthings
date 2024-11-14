import java.util.ArrayList;

public class ArrayListPractice{
  public static ArrayList<String>createRandomArray(int size){
    ArrayList<String>answer = new ArrayList<String>(size);
    for (int i = 0; i < size; i++){
      String value = "";
      int rando = (int)(11 * Math.random());
      if (rando != 0){
        value+= rando;
      }
      answer.add(i, value);
    }
    return answer;
  }
}
