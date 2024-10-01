//1. Write both your names + emails at the top of the document as a comment.
//Jason Chan, jchan61@stuy.edu; Cody Cai, ccai60@stuy.edu

public class ArrayMethods {

  //2. Copy your arrToString method from before.
  /**Return a String that represets the array in the format:
  * "[2, 3, 4, 9]"
  * Note the comma+space between values, and between values
  */
  public static String arrToString(int[]ary){
    String answer = "[";
    for (int i = 0; i < ary.length; i++){
      answer += ary[i];
      if (i < ary.length-1) {
        answer += ", ";
      }
    }
    return answer + "]";
  }

  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
  public static String arrToString(int[][]ary){
    String answer = "[[";
    for (int i = 0; i < ary.length; i++) {
      for (int j = 0; j < ary[i].length; j++) {
        answer += ary[i][j];
        if (j < ary[i].length-1) {
          answer += ", ";
        }
      }
      if (i < ary.length-1) {
        answer += "], [";
      }
    }
    return answer + "]]";
  }

  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
    //use a nested loop to solve this
    int answer = 0;
    for (int i = 0; i < nums.length; i++){
      for (int j = 0; j < nums[i].length; j++){
        answer += nums[i][j];
      }
    }
    return answer;
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
  public static int[][] swapRC(int[][]nums){
    return new int[1][1];
  }

  public static void main (String[] args) {

    //testing arrToString(int[][]ary)
    int[][] ary1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("Expected: [[1, 2, 3], [4, 5, 6], [7, 8, 9]] | Return: " + arrToString(ary1));
    int[][] ary2 = {{1, 2}, {4, 5}, {7, 8}};
    System.out.println("Expected: [[1, 2], [4, 5], [7, 8]] | Return: " + arrToString(ary2));
    int[][] ary3 = {{}, {}, {}};
    System.out.println("Expected: [[], [], []] | Return: " + arrToString(ary3));
    int[][] ary4 = {{1, 2, 3, 4}, {5, 6}, {7, 8, 9, 10, 11}};
    System.out.println("Expected: [[1, 2, 3, 4], [5, 6], [7, 8, 9, 10, 11]] | Return: " + arrToString(ary4));
    int[][] ary5 = {{1, 2, 3}, {}, {7, 8, 9, 10}};
    System.out.println("Expected: [[1, 2, 3], [], [7, 8, 9, 10]] | Return: " + arrToString(ary5));

    //testing arr2DSum
    System.out.println("Expected: 45 | Return: " + arr2DSum(ary1));
    System.out.println("Expected: 27 | Return: " + arr2DSum(ary2));
    System.out.println("Expected: 0 | Return: " + arr2DSum(ary3));
    System.out.println("Expected: 66 | Return: " + arr2DSum(ary4));
    System.out.println("Expected: 40 | Return: " + arr2DSum(ary5));
  }

}
