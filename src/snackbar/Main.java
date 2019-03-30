package snackbar;

public class Main
{
  private static void runProgram()
  {
    Customer c1 = new Customer("Jane", 45.25);
    Customer c2 = new Customer("Bob", 33.14);

    VendingMachine foodVend = new VendingMachine("Food");
    VendingMachine drinkVend = new VendingMachine("Drink");
    VendingMachine officeVend = new VendingMachine("Office");

    Snack s1 = new Snack("Chips\n", 36, 1.75, foodVend.getId());
    Snack s2 = new Snack("Chocolate Bar", 36, 1.0, foodVend.getId());
    Snack s3 = new Snack("Pretzel", 30, 2.0, foodVend.getId());
    Snack s4 = new Snack("Soda", 24, 2.5, drinkVend.getId());
    Snack s5 = new Snack("Water", 20, 2.75, drinkVend.getId());

    c1.buy(s4.cost(3));
    s4.vend(3);
    System.out.printf("Customer 1 cash on hand: $%s\n", c1.getCash());
    System.out.printf("Snack 4 remaining: %s\n", s4.getQuantity());

    c1.buy(s3.cost(1));
    s3.vend(1);
    System.out.printf("Customer 1 cash on hand: $%s\n", c1.getCash());
    System.out.printf("Snack 3 remaining: %s\n", s3.getQuantity());

    c2.buy(s4.cost(2));
    s4.vend(2);
    System.out.printf("Customer 2 cash on hand: $%s\n", c2.getCash());
    System.out.printf("Snack 4 remaining: %s\n", s4.getQuantity());
    
    c1.addCash(10.0);
    System.out.printf("Customer 1 cash on hand: $%s\n", c1.getCash());

    c1.buy(s2.cost(1));
    s2.vend(1);
    System.out.printf("Customer 1 cash on hand: $%s\n", c1.getCash());
    System.out.printf("Snack 2 remaining: %s\n", s2.getQuantity());

    s3.add(12);
    System.out.printf("Snack 3 remaining: %s\n", s3.getQuantity());

    c2.buy(s3.cost(3));
    s3.vend(3);
    System.out.printf("Customer 2 cash on hand: $%s\n", c2.getCash());
    System.out.printf("Snack 3 remaining: %s\n", s3.getQuantity());

    



  }
  public static void main(String [] args)
  {
    runProgram();
  }

}
