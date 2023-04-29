package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
   System.out.println(dp.getPrice());
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addTakeaway();
    System.out.println(dp.getBill());

    Pizza p = new Pizza(false);
    p.addExtraCheese();
    p.addExtraToppings();
    System.out.println(p.getBill());
  }
}