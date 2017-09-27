package edu.cnm.deepdive.inheritance;

public class CanisLupusFamiliaris extends CanisLupus {
  
  private boolean goodBoy;

  public CanisLupusFamiliaris(String name, int weight, boolean goodBoy) {
    super(name, weight);
    this.goodBoy = goodBoy;
  }

  public CanisLupusFamiliaris(String name, int weight) {
    // invokes the constructor above, this refers to its own method name
    this(name, weight, true);
  }

  /**
   * @return the goodBoy
   */
  public boolean isGoodBoy() {
    return goodBoy;
  }

  /**
   * @param goodBoy the goodBoy to set
   */
  public void setGoodBoy(boolean goodBoy) {
    this.goodBoy = goodBoy;
  }

  /* (non-Javadoc)
   * @see edu.cnm.deepdive.inheritance.CanisLupus#speak()
   */
  @Override
  public void speak() {
   System.out.println(getName() + " : bark!"); 
  }

  /* (non-Javadoc)
   * @see edu.cnm.deepdive.inheritance.Canis#hunt()
   */
  @Override
  public void hunt() {
    System.out.println("Beg for food.");
//    super.hunt(); // What does this do? // I think this allows me to inherit the method
    // hunt() from a superclass that contains .hunt();
  }

}
