/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LunchOrder;
import java.lang.String;
/**
 *
 * @author leannekim
 */


public class Food {
    String item;
    private double price, total;
    private double fat, carb, fiber;
    private double foodTotal, totalCost = 0;
    
    /**
     * constructor
     * pre: item, price, fat, carb, fiber, foodTotal
     * post: Food Object is created.
     * @param item
     * @param price
     * @param fat
     * @param carb
     * @param fiber
     * @param foodTotal 
     */
    public Food(String item, double price, double fat, double carb, double fiber, double foodTotal){
        this.item = item;
        this.price = price;
        this.fat = fat;
        this.carb = carb;
        this.fiber = fiber;
        this.foodTotal = foodTotal;
    }
    
    /**
     * Return food price
     * pre: price, foodTotal
     * post: Price of food is returned.
     * @return 
     */
    public double getPrice(){
        return price * foodTotal;
    }
    
    /**
     * Prints total cost statement
     * pre: none
     * post: priceString is returned
     * @return 
     */
    public String setPrice(){
        String priceString;
        priceString = "Your order comes to: " + totalCost;
        return (priceString);
    }
    
    /**
     * toString 
     * Returns orderString
     * pre: none
     * post: orderString is returned.
     * @return 
     */
    public String toString(){
        String orderString;
        orderString = "Each " + item + " has " + fat + "g of fat, " + carb +"g of carbs, " + fiber + "g of fiber.";
        return(orderString);
    }
}
