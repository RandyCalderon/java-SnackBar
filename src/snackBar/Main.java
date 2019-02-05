package snackBar;

public class Main {
  
  public static void workWithData()
  {
  VendingM vm1 = new VendingM("Food");
  VendingM vm2 = new VendingM("Drink");
  VendingM vm3 = new VendingM("Office");
  Snack snack1 = new Snack("Chips", 36, 1.75, vm1.getId());
  Snack snack2 = new Snack("Chocolate Bar", 36, 1.00, vm1.getId());
  Snack snack3 = new Snack("Pretzel", 30, 2.00, vm1.getId());
  Snack snack4 = new Snack("Soda", 24, 2.50, vm2.getId());
  Snack snack5 = new Snack("Water", 20, 2.75, vm2.getId());
  Customer c1 = new Customer("Jane", 45.25);
  Customer c2 = new Customer("Bob", 33.14);
  
  System.out.println("****Instantiate 2 customer****");
  System.out.println(c1);
  System.out.println(c2);
  System.out.println("****Instantiate 3 Vending Machines");
  System.out.println(vm1.getName());
  System.out.println(vm2.getName());
  System.out.println(vm3.getName());  
  System.out.println("****Instantiate 5 snacks"); 
  System.out.println(snack1);
  System.out.println(snack2);
  System.out.println(snack3);
  System.out.println(snack4);
  System.out.println(snack5);
  System.out.println("Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.");
  c1.buy(snack4.totalCost(3));
  System.out.println(c1.getCash());
  System.out.println(snack4.buySnack(3));
  System.out.println("Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.");
  c1.buy(snack3.totalCost(1));
  System.out.println(c1.getCash());
  System.out.println(snack3.buySnack(1));
  System.out.println("Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.");
  c2.buy(snack4.totalCost(2));
  System.out.println(c2.getCash());
  System.out.println(snack4.buySnack(2));
  System.out.println("Customer 1 finds $10. Print Customer 1 Cash on Hand.");
  c2.addCash(10.0);
  System.out.println(c2.getCash());
  System.out.println("Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.");
  c1.buy(snack2.totalCost(1));
  System.out.println(c1.getCash());
  System.out.println(snack2.buySnack(1));
  snack3.addQuantity(12);
  System.out.println(snack3.getQuantity());
  c2.buy(snack3.totalCost(3));
  System.out.println(c2.getCash());
  System.out.println(snack3.buySnack(3));
}

  public static void main(String[] args) {
    workWithData();
  }
}