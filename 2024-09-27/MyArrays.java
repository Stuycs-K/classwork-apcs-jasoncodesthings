public class MyArrays{
  public static String aryToString(int[] nums){
    String thingsInAry = "";
    if (nums.length == 0){
      return "[]";
    }
    for (int i = 0; i < nums.length - 1; i++){
      thingsInAry += nums[i] + ", ";
    }
    return "[" + thingsInAry + nums[nums.length - 1] + "]";
  }

  public static int[] returnCopy(int[]ary){
    int[] answer = new int[ary.length];
    if (ary.length == 0){
      return answer;
    }
    for (int i = 0; i < ary.length; i++){
      answer[i] = ary[i];
    }
    return answer;
  }

  public static void main(String[]args){
    int[] test = new int[]{1};
    System.out.println(aryToString(test));
    test = new int[]{1,2,3,4,5};
    System.out.println(aryToString(test));

    int[] old1 = new int[1];
    int[] old2 = new int[]{5,4,3,2,1};
    int[] new1 = returnCopy(old1);
    int[] new2 = returnCopy(old2);
    System.out.print("old1 is ");
    System.out.println(aryToString(old1));
    System.out.print("new1 is ");
    System.out.println(aryToString(new1));
    System.out.print("old2 is ");
    System.out.println(aryToString(old2));
    System.out.print("new2 is ");
    System.out.println(aryToString(new2));
    System.out.print("Same address for arrays 1 are ");
    System.out.println(old1 == new1);
    System.out.print("Same address for arrays 2 are ");
    System.out.println(old2 == new2);

    //int[] original = new int[]{11,22,33};
    //int[] add = new int[]{55,44,33,22,11};
    //System.out.println(concatArray(original, add));
    //original = new int[4];
    //add = new int[]{55,44,33,22,11};
    //System.out.println(concatArray(original, add));
    //original = new int[]{11,22,33};
    //add = new int[4];
    //System.out.println(concatArray(original, add));
  }
}
