import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      String text = "This is a sample\nOf how to read\ntext!";

      // creates a Scanner object to read throug the String
      Scanner input = new Scanner(text);

      //you don't want a for loop here unless you know the size of the data set

      while(input.hasNext()){
        System.out.println(input.next());
      }

      Scanner sc1 = new Scanner("This is a bunch of words");
      System.out.println(sc1);

      Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2");
      int sumsc2 = 0;
      while (sc2.hasNext()){
        sumsc2 += sc2.nextDouble();
      }
      System.out.println(sumsc2);
    }
  }
