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
    for (int i = 0; i < original.size(); i++){
      answer.add(original.get(original.size() - 1 - i));
    }
    return answer;
  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    //return a new ArrayList that has all values of a and b in alternating order that is:
    //a[0], b[0], a[1], b[1]...
    //If one list is longer than the other, just attach the remaining values to the end.
    ArrayList<String>answer = new ArrayList<String>(a.size() + b.size());
    int i = 0;
    while (i < a.size() && i < b.size()){
      answer.add(a.get(i));
      answer.add(b.get(i));
      i++;
    }
    if (i < a.size()){
      for (int j = i; j < a.size(); j++){
        answer.add(a.get(j));
      }
    }
    if (i < b.size()){
      for (int j = i; j < b.size(); j++){
        answer.add(b.get(j));
      }
    }
    return answer;
  }
}
