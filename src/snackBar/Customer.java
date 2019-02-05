package snackBar;

public class Customer {
  private static int maxId = 0;
  private int id;
  private String name;
  private double budget;

  public Customer(String name, double budget) {
    maxId++;
    id = maxId;

    this.name = name;
    this.budget = budget;
  }

  public void addCash(double budget) {
    this.budget += budget;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void buy(double purchase) {
    budget -= purchase;
  }

  public double getCash() {
    return budget;
  }

  @Override
  public String toString() {
    String rtnStr = name + " with " + budget;
    return rtnStr;
  }
}