public class Driver{
  public static void main(String[]args){
    Adventurer p1 = new Warrior("Bob",99);
    Adventurer p2 = new Warrior("Boswer",990);
    System.out.println(p1);
    System.out.println(p1.getSpecialName());
    System.out.println(p1.getSpecial());
    System.out.println(p1.getSpecialMax());
    p1.setSpecial(50);
    System.out.println(p1.getSpecial());
    System.out.println(p1.attack(p2));
    System.out.println(p1.support(p2));
  }
}
