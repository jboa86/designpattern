package study.behavioral.templatemethod;

/**
 * To keep this Template Method Pattern example simple,
 * I've excluded all the other Topping methods that would 
 * actually be needed, so I can focus on one abstract method 
 * in this class.
 */
public abstract class AbstractTopping implements Topping
{
  private String name;

  public AbstractTopping()
  {
    // assume some magic happens here where we connect to a database
    // to get our name, unitWeight, and numberOfPieces
  }
 
  public String getName()
  {
    return this.name;
  }

  /**
   * For inventory control and ordering purposes, we need to know the 
   * number of pieces used, as well as the total weight of this topping
   * that was used. The formula here might vary according to the
   * topping type, pizza size, and any requests for "extra" or "double"
   * toppings.
   */
  public abstract float getWeightUsed();
}
