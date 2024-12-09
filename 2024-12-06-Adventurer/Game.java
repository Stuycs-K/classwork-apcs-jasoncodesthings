//import java.io.File;
//import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game{
  public static void main(String[]args){
    Adventurer player = new Warrior("Mario", 100);
    Adventurer enemy = new CodeWarrior("Boswer", 1000);
    Scanner userInput = new Scanner(System.in);

    System.out.println(player.getName() + ", " + player.getHP() + "/" + player.getmaxHP() + " HP, " + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName());
  }
}
