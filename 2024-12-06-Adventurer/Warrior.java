public class Warrior extends Adventurer{
  private int stamina;

  public Warrior(String name, int hp){
    super(name,hp);
    this.stamina = 100;
  }

  public String getSpecialName(){return "";}
  public int getSpecial(){return -1;}
  public void setSpecial(int n){}
  public int getSpecialMax(){return -1;}
  @Override
  public String attack(Adventurer other){
    System.out.println("hwer");
    return "";
  }
  public String support(Adventurer other){
    System.out.println("hi");
    return "";
  }
  public String support(){
    System.out.println("i");
    return "";
  }
  public String specialAttack(Adventurer other){
    System.out.println("e");
    return "";
  }
}
