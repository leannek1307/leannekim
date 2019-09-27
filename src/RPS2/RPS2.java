package RPS2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leannekim
 */
/*
 * RPS2.java from Chapter 7
 * Chapter 7 Case Study
 * Lawrenceville Press
 * August 21, 2011
 */

 import java.util.Scanner;

 /**
 * Computer plays Rock Paper Scissors against one player.
 */
 public class RPS2 {

	public static void main(String[] args) {
		RPSGame rps = new RPSGame();
		RPSPlayer rpsOpponent = new RPSPlayer();
		int rounds;
		int playerThrow;
                String name = "";
		Scanner input = new Scanner(System.in);

		/* play RPS */
		rpsOpponent.assignName(name);
                System.out.print("How many rounds?: ");
		rounds = input.nextInt();
		for (int i = 0; i < rounds; i++) {
                        System.out.print("Enter your throw (ROCK=1, PAPER=2, SCISSORS=3): ");
			playerThrow = input.nextInt();
                        
                        while (playerThrow == 1 || playerThrow == 2 || playerThrow == 3){
                        rpsOpponent.makeThrow(playerThrow);

			rps.makeCompThrow();
			rps.announceWinner(rpsOpponent.getThrow(), rpsOpponent.getName());
                        }
		}
		rps.bigWinner(rpsOpponent.getName());
                        
	}
}