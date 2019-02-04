package snackBar;

public class Main {
  
  public static void workWithData()
  {
  VendingM vm1 = new VendingM("Food");
  VendingM vm2 = new VendingM("Drink");
  Snack snack1 = new Snack("Doritos", 20, 2.25);
  
  System.out.println("****SnackBar Info ****");
  System.out.println(vm1.getName());
  System.out.println("----Snacks----");
  System.out.println(snack1);
  System.out.println(vm2.getName());
  }

  public static void main(String[] args) {
    workWithData();
  }
}