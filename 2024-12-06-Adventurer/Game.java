import java.util.Scanner;

public class Game{
  public static void main(String[]args){
    Scanner userInput = new Scanner(System.in);
    // do the rest many times
    System.out.println("Enter username");
    //Read one line of user input
    String userName = userInput.nextLine();

    Adventurer player = new Warrior(userName, 100);
    Adventurer enemy = new CodeWarrior("Boswer", 1000, "c++");

    System.out.println(userName + " must defeat Boswer to save the Princess!");
    while (player.getHP() > 0 && enemy.getHP() > 0){
      System.out.println(player.getName() + ", " + player.getHP() + "/" + player.getmaxHP() + " HP, " + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName());
      System.out.println(enemy.getName() + ", " + enemy.getHP() + "/" + enemy.getmaxHP() + " HP, " + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName());

      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String action = userInput.nextLine();

      if (action.equals("a") || action.equals("attack")){
        System.out.println(player.attack(enemy));
      }
      player.setHP(0);
    }
  }
}
