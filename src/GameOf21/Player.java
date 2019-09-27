/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameOf21;
import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author leannekim
 */
public final class Player {
    private int card1;
    private int card2;  
    private int card3;
    private int points;
    
    /**
     * constructor
     * pre: none
     * post: Player Object is created.
     */
    public Player(){
        card1 = 0;
        card2 = 0;
        card3 = 0;
        points = 0;
    }
    
    /**
     * Return value of card1 of player
     * pre: none
     * post: card1 is returned.
     * @return 
     */
    public int generateCard1() {
        card1 = (int)(Math.random() * 13 + 1);
        return card1;
    }

    /**
     * Return value of card2 of player
     * pre: none
     * post: card2 is returned.
     * @return 
     */
    public int generateCard2() {
        card2 = (int)(Math.random() * 13 + 1);
        return card2;
    }

    /**
     * Return value of card3 of player
     * pre: none
     * post: card3 is returned.
     * @return 
     */
    public int generateCard3() {
        card3 = (int)(Math.random() * 13 + 1);
        return card3;
    }
    
    /**
     * Determines how many points will be added, returns final points of player
     * pre: none
     * post: points of player are returned.
     * @return 
     */
    public int total(){
        if (card1 >= 11 && card1 <= 13 ||
            card2 >= 11 && card2 <= 13 ||
            card3 >= 11 && card3 <= 13){
            points += 10;
        } else if (card1 >= 2 && card1 <= 10){
            points += card1;
        } else if (card2 >= 2 && card2 <= 10){
            points += card2;
        } else if (card3 >= 2 && card3 <= 10){
            points += card3;
        } else if (card1 == 1 || card2 == 1 || card3 == 1){
            int num = (int)(Math.random() * 2 + 1);
            if (num == 1){
                points += 1;
            } else if (num == 2){
                points += 11;
            }
        }
        return points;
    }
    
    /**
     * Determines winner of the game
     * pre: cTotal (computer's total points)
     * post: String winner is returned.
     * @param cTotal
     * @return 
     */
    public String winner (int cTotal){
        String winner = "no one wins";
        int cDiff, pDiff;
        
        this.cTotal = cTotal;
        this.points = total();
        
        if (cTotal > 21 || pTotal == 21){
            winner = "You won!";
        } else if (pTotal > 21 || cTotal == 21) {
            winner = "It's a tie!";
        } else if (cTotal == pTotal){
            winner = "It's a tie!";
        } else if (pTotal < 21 && cTotal < 21){
            cDiff = 21 - cTotal;
            pDiff = 21 - pTotal;
            
            if (cDiff > pDiff){
                winner = "You won!";
            }else if (pDiff > cDiff) {}
                winner = "Computer won";
            
        }    return winner;

    }
    
}
