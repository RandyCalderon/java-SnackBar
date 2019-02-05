package snackBar;

public class Snack {
  private static int maxId = 0;
  private int id;
  private String snackName;
  private int quantity;
  private double cost;
  private int vmId;

  public Snack(String snackName, int quantity, double cost, int vmId) {
    maxId++;
    id = maxId;
    
    this.snackName = snackName;
    this.quantity = quantity;
    this.cost = cost;
    this.vmId = vmId;
  }

  public void setSnackName(String snackName) {
    this.snackName = snackName;
  }

  public int getQuantity() {
    return quantity;
  }

  public void addQuantity(int quantity) {
    this.quantity += quantity;
  }

  public double totalCost(int amount) {
    return amount * cost;
  }

  public int buySnack(int quantity) {
    this.quantity -= quantity;
    return this.quantity;
  }

  @Override
  public String toString() {
    String rtnStr = quantity + " " + snackName + " at " + '$' + cost;

    return rtnStr;
  }
}