package snackbar;

public class Snack
{
  private static int maxId = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineID;

  public Snack(String name, int quantity, double cost, int vendingMachineID)
  {
    maxId++;
    id = maxId;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingMachineID = vendingMachineID;
  }
  
  public void setName(String name)
  {
    this.name = name; 
  }

  public int getQuantity()
  {
    return this.quantity;
  }

  public void add(int add)
  {
    this.quantity += add;
  }

  public void vend(int buy)
  {
    this.quantity -= buy;
  }

  public double cost(int quantity)
  {
    return this.cost * quantity;
  }
}
