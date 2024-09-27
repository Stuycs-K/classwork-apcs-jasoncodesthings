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
  }
}
