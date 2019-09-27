/*
 * Bowling
 * Alishba Malik
 */
package Bowling;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alishbamalik
 */
public class Bowling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numOfBowlers, frames = 0;
        Scanner input = new Scanner(System.in);
        ArrayList<Bowler> players =  new ArrayList<Bowler>(); //arraylist is used because the number of players is unknown
        
        System.out.print("How many bowlers are playing? ");
        numOfBowlers = input.nextInt();
        
        while (frames != 10){
            frames += 1;
            
            for (int i = 0; i < numOfBowlers; i++){ //for loop for each player
                Bowler b = new Bowler (); //a new bowler is made
                players.add(b);
                
                System.out.println("\nPlayer " + i + "'s turn.");
                
                players.get(i).pins();
                
                System.out.println("Player " + i + "'s score is: " + players.get(i).getScore());
            }
            
        }
        
    }
    
}
