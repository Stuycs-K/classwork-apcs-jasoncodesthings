import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    System.out.println("Testing countZeros2D");
    int[][] test1 = new int[][]{{1, 2, 0}, {3, 0}, {0}, {100, 90, 0}};
    System.out.println("Expected 4 | Return: " + countZeros2D(test1));
    int[][] test2 = new int[][]{{0, 8, 0}, {0, 0}, {1}, {70, 80, 0}};
    System.out.println("Expected 5 | Return: " + countZeros2D(test2));
    int[][] test3 = new int[][]{{1, 2, 1}, {3, 2}, {2}, {100, 90, 101}};
    System.out.println("Expected 0 | Return: " + countZeros2D(test3));

    System.out.println("");;
    System.out.println("Testing htmlTable");
    int[][] test4 = new int[][]{{5}, {30, 9, 2}, {6, 7}};
    System.out.println("Expected <table><tr><td>5</td></tr><tr><td>30</td><td>9</td><td>2</td></tr><tr><td>6</td><td>7</td></tr></table> | Return: " + htmlTable(test4));
    int[][] test5 = new int[][]{{4, 3}, {99}};
    System.out.println("Expected <table><tr><td>4</td><td>3</td></tr><tr><td>99</td></tr></table> | Return: " + htmlTable(test5));
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()

  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
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

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
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

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int answer = 0;
    for (int i = 0; i < nums.length; i++){
      for (int j = 0; j < nums[i].length; j++){
        if (nums[i][j] == 0){
          answer++;
        }
      }
    }
    return answer;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int answer = 0;
    for (int i = 0; i < nums.length; i++){
      for (int j = 0; j < nums[i].length; j++){
        answer += nums[i][j];
      }
    }
    return answer;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
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
    return answer;
  }

  public static int[] copyindividual(int[] index){
    int[] individual = new int[index.length];
    for (int i = 0; i < index.length; i++){
      individual[i] = index[i];
    }
    return individual;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] answer = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums.length; i++){
      for (int j = 0; j < nums[i].length; j++){
        answer[j][i] = nums[i][j];
      }
    }
    return answer;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String answer = "<table>";
    for (int i = 0; i < nums.length; i++){
      answer += "<tr>";
      for (int j = 0; j < nums[i].length; j++){
        answer = answer + "<td>" + nums[i][j] + "</td>";
      }
      answer += "</tr>";
    }
    return answer + "</table>";
  }
}
