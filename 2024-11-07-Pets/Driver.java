/*
When overriding the getName() method and calling it in the Bird class, it calls the getName() method from the superclass Animal and attaches the result with "The Mighty ".
*/
/*
Bird b2 = new Animal(...); produced an error because that line implies that Animal is the subclass, which it isn't. The methods called on this object would not work since it may not exist in the Bird class, or have different parameters.
*/
public class Driver {
  public static void main(String[] args) {
    Animal Bob = new Animal("meow", 2909, "Cthulu the Destroyer");
    Bob.speak();
    System.out.println("\n");
    Bird BobII = new Bird("woof", 2908, "Cthulu the Creator", 1, "green");
    BobII.speak();
    System.out.println("\n");

    Animal a1 = new Animal("roar", 10, "Pete");
    Bird b1 = new Bird("squak", 99, "Thomas", 66, "blue");
    //Bird b2 = new Animal("roar", 10, "Pete");
    Animal a2 = new Bird("bark", 99, "Andy", 67, "red");
    a1.speak();
    System.out.println("\n");
    b1.speak();
    System.out.println("\n");
    a2.speak();
  }
 }
