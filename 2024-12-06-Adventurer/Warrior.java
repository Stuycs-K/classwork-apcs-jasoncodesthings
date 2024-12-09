public class Warrior extends Adventurer{
  private int strength;
  private int full;

  public Warrior(String name, int hp){
    super(name,hp);
    this.strength = 100;
    this.full = 100;
  }

  public String getSpecialName(){
    return "Throwing Axe";
  }
  public int getSpecial(){
    return strength;
  }
  public void setSpecial(int n){
    strength = n;
  }
  public int getSpecialMax(){
    return full;
  }

  @Override
  public String attack(Adventurer other){
    other.applyDamage(99);
    super.restoreSpecial(5);
    return this.getName() + " used attack!";
  }
  public String support(Adventurer other){
    if (other.getSpecial() + 5 <= other.getSpecialMax()){
      other.setSpecial(other.getSpecial() + 5);
    }
    return other.getName() + " was buffed with 5 strength.";
  }
  public String support(){
    return "";
  }
  public String specialAttack(Adventurer other){
    return "";
  }
}
