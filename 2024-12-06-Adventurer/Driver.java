public class Driver{
  public static void main(String[]args){
    Adventurer p1 = new Warrior("Bob",99);
    System.out.println(p1);
    System.out.println(p1.getSpecialName());
    System.out.println(p1.getSpecial());
    System.out.println(p1.getSpecialMax());
    p1.setSpecial(50);
    System.out.println(p1.getSpecial());
  }
}
