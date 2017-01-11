package shopping_basket;

public class Customer {

  String name;
  int funds;
  boolean hasLoyaltyCard;
  Basket basket;

  public Customer(String name, boolean hasLoyaltyCard){
    this.name = name;
    this.funds = 100;
    this.hasLoyaltyCard = hasLoyaltyCard;
    this.basket = new Basket();
  } 

  public String getName() {
    return this.name;
  }
}