import java.util.Scanner;

public class Game{
  public static void main(String[]args){
    Scanner userInput = new Scanner(System.in);
    // do the rest many times
    System.out.println("Enter username");
    //Read one line of user input
    String userName = userInput.nextLine();

    Adventurer player = new Warrior(userName, 25);
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
      else if (action.equals("sp") || action.equals("special")){
        System.out.println(player.specialAttack(enemy));
      }
      else if (action.equals("su") || action.equals("support")){
        System.out.println(player.support());
      }
      else if (action.equals("quit")){
        System.out.println("Program terminated.");
        break;
      }
      else{
        System.out.println("Invalid action. Try again.");
        continue;
      }
      System.out.println(player.getName() + ", " + player.getHP() + "/" + player.getmaxHP() + " HP, " + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName());
      System.out.println(enemy.getName() + ", " + enemy.getHP() + "/" + enemy.getmaxHP() + " HP, " + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName());
      System.out.println(" ");

      int enemyAction = (int) (Math.random() * 3);
      if (enemyAction == 0){
        System.out.println(enemy.attack(player));
      }
      else if (enemyAction == 1){
        System.out.println(enemy.specialAttack(player));
      }
      else{
        System.out.println(enemy.support());
      }
      System.out.println("\n");
    }
  }
}
