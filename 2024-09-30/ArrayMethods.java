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
    int[][] answer = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums.length; i++){
      for (int j = 0; j < nums[i].length; j++){
        answer[j][i] = nums[i][j];
      }
    }
    return answer;
  }

  //3. Modify a given 2D array of integer as follows:
//Replace all the negative values:
//-When the row number is the same as the column number replace
//that negative with the value 1
//-All other negatives replace with 0
public static void replaceNegative(int[][] vals) {
  for (int i = 0; i < vals.length; i++) {
    for (int j = 0; j < vals[i].length; j++) {
      if (vals[i][j] < 0 && i == j) {
        vals[i][j] = 1;
      }
      if (vals[i][j] < 0) {
        vals[i][j] = 0;
      }
    }
  }
}

//4. Make a copy of the given 2d array.
//When testing : make sure that changing the original does NOT change the copy.
//DO NOT use any built in methods that "copy" an array.
//You SHOULD write a helper method for this.
//If you don't see a good way to do that, you should stop and look at prior methods.
public static int[][] copy(int[][] nums){
  int[][] answer = new int[nums.length][];
  for (int i = 0; i < nums.length; i++){
    answer[i] = copyindividual(nums[i]);
  }
  return answer;//placeholder so it compiles
}

public static int[] copyindividual(int[] index){
  int[] individual = new int[index.length];
  for (int i = 0; i < index.length; i++){
    individual[i] = index[i];
  }
  return individual;
}

  public static void main (String[] args) {

    System.out.println("Testing arrToString(int[][]ary)");
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

    System.out.println("");
    System.out.println("Testing arr2DSum");
    System.out.println("Expected: 45 | Return: " + arr2DSum(ary1));
    System.out.println("Expected: 27 | Return: " + arr2DSum(ary2));
    System.out.println("Expected: 0 | Return: " + arr2DSum(ary3));
    System.out.println("Expected: 66 | Return: " + arr2DSum(ary4));
    System.out.println("Expected: 40 | Return: " + arr2DSum(ary5));

    System.out.println("");
    System.out.println("Testing swapRC");
    System.out.println("Expected: [[1, 4, 7], [2, 5, 8]] | Return: " + arrToString(swapRC(ary2)));
    int[][] ary6 = {{20, 19, 18, 17}, {16, 15, 14, 13}, {12, 11, 10, 9}, {8, 7, 6, 5}, {4, 3, 2, 1}};
    System.out.println("Expected: [[20, 16, 12, 8, 4], [19, 15, 11, 7, 3], [18, 14, 10, 6, 2], [17, 13, 9, 5, 1]] | Return: " + arrToString(swapRC(ary6)));
    int[][] ary7 = {{1}, {2}, {3}, {4}};
    System.out.println("Expected: [[1, 2, 3, 4]] | Return: " + arrToString(swapRC(ary7)));
    int[][] ary8 = {{1, 2, 3, 4}};
    System.out.println("Expected: [[1], [2], [3], [4]] | Return: " + arrToString(swapRC(ary8)));

    System.out.println("");
    System.out.println("Testing replaceNegative");
    int[][] ary9 = {{-17, -5, 14}, {2, 67, -4}};
    replaceNegative(ary9);
    System.out.println("Expected: [[1, 0, 14], [2, 67, 0]] | Return: " + arrToString(ary9));
    int[][] ary10 = {{17, 5, 14}, {2, 67, 0}, {9, 99, -999}};
    replaceNegative(ary10);
    System.out.println("Expected: [[17, 5, 14], [2, 67, 0], [9, 99, 1]] | Return: " + arrToString(ary10));
    int[][] ary11 = {{-17, -5, -14}, {-2, -67, -4}};
    replaceNegative(ary11);
    System.out.println("Expected: [[1, 0, 0], [0, 1, 0]] | Return: " + arrToString(ary11));
    int[][] ary12 = {{-1, 0, 1}, {0, -1, 0}, {1, 0, -1}, {-1, 1, 0, -1}};
    replaceNegative(ary12);
    System.out.println("Expected: [[1, 0, 1], [0, 1, 0], [1, 0, 1], [0, 1, 0, 1]] | Return: " + arrToString(ary12));

    System.out.println("");
    System.out.println("Testing copy");
    int[][] ary13 = {{-6, 39, 99}, {100, 101, 102, 103}};
    int[][] ary13copy = copy(ary13);
    System.out.println("Expected: [[-6, 39, 99], [100, 101, 102, 103]] | Return: " + arrToString(ary13copy));
    ary13copy[1][2] = 9;
    System.out.println("Changed the copy so that arr13copy[1][2] is now 9 instead of 102.");
    System.out.println("Original: expected [[-6, 39, 99], [100, 101, 102, 103]] | Return: " + arrToString(ary13));
    System.out.println("Copy: expected [-6, 39, 99], [100, 101, 9, 103]] | Return: " + arrToString(ary13copy));
  }

}
