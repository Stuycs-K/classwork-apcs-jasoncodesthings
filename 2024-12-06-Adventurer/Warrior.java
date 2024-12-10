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
    other.applyDamage(10);
    super.restoreSpecial(5);
    return this.getName() + " used attack! " + this.getName() + " sucked up " + other.getName() + "'s blood and also gained 5 strength!";
  }

  public String support(Adventurer other){
    if (other.getSpecial() + 5 <= other.getSpecialMax()){
      other.setSpecial(other.getSpecial() + 5);
    }
    return other.getName() + " was buffed with 5 strength.";
  }

  public String support(){
    super.restoreSpecial(20);
    if (this.getHP() + 7 > this.getmaxHP()){
      super.setHP(this.getmaxHP());
    }
    else{
      super.setHP(this.getHP() + 7);
    }
    return this.getName() + " was buffed with 20 strength and healed for 7 HP.";
  }

  public String specialAttack(Adventurer other){
    if (strength == 0){
      return this.getName() + " attemped to throw the axe, but they had no strength!";
    }
    other.applyDamage(strength);
    this.setSpecial(0);
    return this.getName() + " used all of their strength to throw the axe!";
  }
}
