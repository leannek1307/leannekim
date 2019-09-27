/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySavings;

import java.util.Scanner;

/**
 *
 * @author leannekim
 */
public class MySavings {
    // include PiggyBank object that can add coins to the piggy bank, remove coins, and return the total amount in the bank.
    public static void main(String[] args) {
        int action = 1;
        int decrease;
        PiggyBank user = new PiggyBank();
        Scanner input = new Scanner(System.in);

        
        while (action != 0) {
        
        System.out.println("\n1. Show total in bank.");
        System.out.println("2. Add a penny.");
        System.out.println("3. Add a nickel.");
        System.out.println("4. Add a dime.");
        System.out.println("5. Add a quarter.");
        System.out.println("6. Take money out of bank.");
        System.out.println("Enter 0 to quit");
        
        
        System.out.print("Enter your choice: ");
        action = input.nextInt();
        
            switch (action) {
                case 1:
                    System.out.print("Total: " + user.showTotal());
                    break;
                case 6:
                    System.out.print("Enter amount to take out: ");
                    decrease = input.nextInt();
                    user.removeCoin(decrease);
                    System.out.print("Total: " + user.showTotal());
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    user.addCoin(action);
                    break;
                case 0:
                    System.out.println("Final total: " + user.showTotal());
                    return;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        
        }
        
    }
}
