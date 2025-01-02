//The largest fibonacci number that BOTH runs under 10 seconds and fits an int is 46.

public class Fibonacci{
  public static int fib(int n){
    if (n <= 1){
      return n;
    }
    else{
      return fib(n - 1) + fib(n - 2);
    }
  }

  public static void main(String[]args){
    System.out.println(fib(Integer.parseInt(args[0])));
  }
}
