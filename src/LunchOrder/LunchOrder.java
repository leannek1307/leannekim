/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LunchOrder;

import java.util.Scanner;
import java.text.NumberFormat;
/**
 *
 * @author leannekim
 */
public class LunchOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        double total = 0;
        
        System.out.print("Enter number of hamburgers: ");
        double hamburgerTotal = input.nextInt();
        Food hamburger = new Food ("Hamburger",1.85, 9, 33, 1, hamburgerTotal);
        System.out.print(hamburger + "\n");
        
        System.out.print("Enter number of salads: ");
        double saladTotal = input.nextInt();
        Food salad = new Food("Salad", 2.00, 1, 11, 5, saladTotal);
        total += salad.getPrice();
        System.out.println(salad + "\n");
        
        System.out.print("Enter number of fries: ");
        double friesTotal = input.nextInt();
        Food fries = new Food ("Fries", 1.30, 11, 36, 4, friesTotal);
        total += fries.getPrice();
        System.out.println(fries + "\n");
        
        System.out.print("Enter number of soda: ");
        double sodaTotal = input.nextInt();
        Food soda = new Food ("Soda", 0.95, 0, 38, 0, sodaTotal);
        total += soda.getPrice();
        System.out.println(soda + "\n");
        
        System.out.print("Your total comes to: " + money.format(total));
        
    }
}
