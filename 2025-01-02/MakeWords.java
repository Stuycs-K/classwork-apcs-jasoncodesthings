public class MakeWords{
  public static void makeWords(int remainingLetters, String result, String alphabet){
    //System.out.println(remainingLetters);
    for (int i = 0; i < alphabet.length(); i++){
      if (remainingLetters - 1 != 0){
        makeWords(remainingLetters - 1, result + alphabet.charAt(i), alphabet);
      }
      else{
        System.out.println(result + alphabet.charAt(i));
      }
    }
  }

  public static void main(String[]args){
    makeWords(3, "", "abc");
  }
}
