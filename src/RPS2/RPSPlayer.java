/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPS2;
import java.util.Scanner;
/**
 *
 * @author leannekim
 */
/**
 * models the player in a game of RPS
 */
public class RPSPlayer {
	private int playerThrow;           //ROCK = 1, PAPER = 2, SCISSORS = 3
        private final String playerName;
        Scanner input = new Scanner(System.in);
	
        /**
	 * constructor
	 * pre: none
	 * post: RPSPlayer object created. The player is given a default throw.
	 */
        
	public RPSPlayer() {
		playerThrow = 1;	//default throw
                System.out.print("Enter your name: ");
                playerName = input.nextLine();
	}
	

	/**
	 * Sets the player's throw.
	 * pre: newThrow is the integer 1, 2, or 3.
	 * post: Player's throw has been made.
	 */
	 public void makeThrow(int newThrow){
                playerThrow = newThrow;
            } 

	 
	

	/**
	 * Returns the player's throw.
	 * pre: none
	 * post: Player's throw has been returned.
         * @return 
	 */
	 public int getThrow() {
	 	return(playerThrow);
	 }
	
         public String assignName(String name){
             name = playerName;   
             return(playerName);
         }
         
         public String getName(){
             return(playerName);
         }
}
