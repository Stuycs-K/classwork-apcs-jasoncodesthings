import java.util.ArrayList;

public class Driver{
  public static void main(String[]args){
    ArrayList<String>test = ArrayListPractice.createRandomArray(12);
    ArrayList<String>test1 = ArrayListPractice.createRandomArray(20);
    ArrayList<String>test2 = ArrayListPractice.createRandomArray(100);
    System.out.println(test);
    ArrayListPractice.replaceEmpty(test);
    System.out.println(test);
    System.out.println(test1);
    ArrayListPractice.replaceEmpty(test1);
    System.out.println(test1);
    System.out.println(test2);
    ArrayListPractice.replaceEmpty(test2);
    System.out.println(test2);

    ArrayList<String>test3 = ArrayListPractice.makeReversedList(test);
    ArrayList<String>test4 = ArrayListPractice.makeReversedList(test1);
    ArrayList<String>test5 = ArrayListPractice.makeReversedList(test2);
    System.out.println(test3);
    System.out.println(test4);
    System.out.println(test5);
  }
}
