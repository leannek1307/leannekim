/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiceRollGame;

import java.util.Scanner;

/**
 *
 * @author leannekim
 */
public class DiceRollGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Die DRPlayer = new Die();

        int risk = 1;
        int loHi;
        
        // call points
        System.out.print("You have " + DRPlayer.points + " points.");
        
        while (risk != -1){
            // user type risk
            System.out.print("\nHow many points do you want to risk? (-1 to quit): ");
            risk = input.nextInt();

            // low or high
            System.out.print("Make a call (0 for low, 1 for high): ");
            loHi = input.nextInt();

            // send risk and loHi to output method in Die class
            DRPlayer.roll();
            DRPlayer.output(risk, loHi);

            // outputs die1 + die2
            System.out.println("You rolled: " + DRPlayer.getRoll());

            // call points
            System.out.println("You now have " + DRPlayer.points() + " points.");

        }
    }
}
