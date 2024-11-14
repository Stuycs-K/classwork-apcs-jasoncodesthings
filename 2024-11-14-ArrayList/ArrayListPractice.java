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
  public static void replaceEmpty( ArrayList<String> original){
    for (int i = 0; i < original.size(); i++){
      if (original.get(i).equals("")){
        original.set(i, "Empty");
      }
    }
  }
  public static ArrayList<String> makeReversedList( ArrayList<String> original){
    //return a new ArrayList that is in the reversed order of the original.
    ArrayList<String>answer = new ArrayList<String>(original.size());
    for (int i = original.size() - 1; i >= 0; i--){
      answer.add(i, original.get(original.size() - i));
    }
    return answer;
  }
  //public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    //return a new ArrayList that has all values of a and b in alternating order that is:
    //a[0], b[0], a[1], b[1]...
    //If one list is longer than the other, just attach the remaining values to the end.
  //}
}
