import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
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




    //new test cases for arrToString(int[]), countZeros2D, and htmlTable
    System.out.println("");
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

    System.out.println("");;
    System.out.println("Testing arrToString(int[])");
    int[] test6 = new int[]{};
    System.out.println("Expected [] | Return: " + arrToString(test6) + " Match: " + Arrays.toString(test6).equals(arrToString(test6)));
    int[] test7 = new int[]{10, 5, 9, 33};
    System.out.println("Expected [10, 5, 9, 33] | Return: " + arrToString(test7) + " Match: " + Arrays.toString(test7).equals(arrToString(test7)));
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
