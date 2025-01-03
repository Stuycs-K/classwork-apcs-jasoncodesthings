public class MakeWords{
  public static void makeWords(int remainingLetters, String result, String alphabet){
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
    makeWords(Integer.parseInt(args[0]), "", args[1]);
  }
}
