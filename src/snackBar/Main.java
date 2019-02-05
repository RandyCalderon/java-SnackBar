package snackBar;

public class Main {
  
  public static void workWithData()
  {
  VendingM vm1 = new VendingM("Food");
  VendingM vm2 = new VendingM("Drink");
  VendingM vm3 = new VendingM("Office");
  Snack snack1 = new Snack("Doritos", 20, 2.25,);
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
}

  public static void main(String[] args) {
    workWithData();
  }
}