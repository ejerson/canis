package edu.cnm.deepdive.inheritance;

public class CallOfTheWild {

  private CallOfTheWild() {
    // prevents anybody from creating an instance of this class
  }
  public static void main(String[] args) {
    // Canis refers to set of methods that are available to me
    // new CanisLupus refers to which method I'm using for which type of dog.
     Canis dogA = new CanisLupus("Buck", 175);
     Canis dogB = new CanisLupusFamiliaris("Fido", 75);
     dogA.hunt(); // Canis.hunt()
     dogB.hunt(); // Beg for food.
     
     // object casting
     ((CanisLupus) dogA).speak(); 
     ((CanisLupus) dogB).speak();
  }

}
