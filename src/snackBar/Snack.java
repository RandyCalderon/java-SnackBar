package snackBar;

public class Snack {
  private static int maxId = 0;
  private int id;
  private String snackName;
  private int quantity;
  private double cost;


  public Snack(String snackName, int quantity, double cost) {
    maxId++;
    id = maxId;
    
    this.snackName = snackName;
    this.quantity = quantity;
    this.cost = cost;
  }

  public void setSnackName(String snackName) {
    this.snackName = snackName;
  }

  public int getQuantity() {
    return quantity;
  }

  @Override
  public String toString() {
    String rtnStr = quantity + " " + snackName + " at " + '$' + cost;

    return rtnStr;
  }
}