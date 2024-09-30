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
  public static void main(String[]args){
    int[] test = new int[]{1};
    System.out.println(aryToString(test));

    int[] old1 = new int[];
    int[] old2 = new int[]{5,4,3,2,1};
    int[] new1 = returnCopy(old1);
    int[] new2 = returnCopy(old2);
    System.out.println("first old is " + old1 + "first new is " + new1 + "same address is " old1 == new1);
    System.out.println("second old is " + old2 + "second new is " + new2 + "same address is " old2 == new2);

    int[] original = new int[]{11,22,33};
    int[] add = new int[]{55,44,33,22,11};
    System.out.println(concatArray(original, add));
    original = new int[4];
    add = new int[]{55,44,33,22,11};
    System.out.println(concatArray(original, add));
    original = new int[]{11,22,33};
    add = new int[4];
    System.out.println(concatArray(original, add));
  }
}
