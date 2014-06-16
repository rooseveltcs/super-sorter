/*
* ShoppingCart.java
* Assignment: Project 8 - Shopping Cart
* Purpose: This assignment will allow you to review defining Java classes and the use of an ArrayList. 
* You are to write a set of supporting classes for a simple shopping program.
* @version 4/7/2014
* @author Nate Spencer
*/

// A class which creates a shopping cart of empty item orders
import java.util.*;

public class ShoppingCart{ 
   ArrayList<ItemOrder> orderList; 
   private boolean value = false;
   // creates a shopping list for item orders
   public ShoppingCart(){
      orderList = new ArrayList<ItemOrder>();
   }
   // adds an item order to the shopping cart
   public void add(ItemOrder orderOfItem){
     // Item test = orderOfItem.getItem();
      for (int i = 0; i < orderList.size(); i++){
          //System.out.println(test + " " + orderList.get(i).getItem()); 
         if (orderOfItem.getItem() == orderList.get(i).getItem()){ 
             //System.out.println("removing" + i);
            orderList.remove(i);
            //break;
            i--;
         }
      }
      orderList.add(orderOfItem);
   }
   // sets if there will be a discount 
   public void setDiscount(boolean value) {
      this.value = value;
   }
   // gets the total price of the current item orders
   public double getTotal(){
      double priceTotal = 0.0;
      for (int i = 0; i < orderList.size(); i++){
         // ItemOrder order = orderList.get(i);
//          priceTotal += order.getPrice();
         priceTotal += orderList.get(i).getPrice();
      }
      if(value){
         return priceTotal * .9 ;
      }else{
      
      return priceTotal;
      }
   }
}
// The price total works with 1's as quantities and bulk prices, but continuously doubles everything else