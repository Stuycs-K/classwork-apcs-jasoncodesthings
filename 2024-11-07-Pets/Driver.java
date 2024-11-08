//When overriding the getName() method and calling it in the Bird class, it calls the getName() method from the superclass Animal and attaches the result with "The Mighty ".



public class Driver {
  public static void main(String[] args) {
    Animal Bob = new Animal("meow", 2909, "Cthulu the Destroyer");
    Bob.speak();
    Bird BobII = new Bird("woof", 2908, "Cthulu the Creator", 1, "green");
    BobII.speak();
  }
 }
