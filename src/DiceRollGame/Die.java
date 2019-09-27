/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiceRollGame;

/**
 *
 * @author leannekim
 */
public class Die {
   private int die1;
   private int die2;
   public int points; 
   
   /**
    * constructor
    * pre: none
    * post: Die object is created. Member variables are initialized.
    */
   public Die(){
       die1 = 0;
       die2 = 0;
       points = 1000;
   }
    
   /**
    * Rolls dice. Random.
    * pre: none
    * post: die1 and die2 are assigned a random roll.
    */
    public void roll(){
        die1 = 1 + (int)(Math.random() * 6);
        die2 = 1 + (int)(Math.random() * 6);
    }
    
    /**
     * Returns sum of die1 and die2
     * pre: none
     * post: sum of die1 and die2 has been returned.
     * @return 
     */
    public int getRoll(){
        return die1 + die2;
    }
    
    /**
     * Guess = output? modify points
     * pre: risk, loHi
     * post: points are added or taken away.
     * @param risk
     * @param loHi 
     */
    public void output(int risk, int loHi){
        int sum = die1 + die2;
        if (loHi == 1 && sum >= 2 && sum <= 6 ||
            loHi == 1 && sum == 7 ||
            loHi == 0 && sum >= 8 && sum <= 12){
            points += risk * 2;
        } else if (loHi == 1 && sum >= 8 && sum <= 12 ||
                   loHi == 0 && sum >= 2 && sum <= 6 ||
                   loHi == 0 && sum == 7){
            points -= risk;
        }
    }
    
    /**
     * Returns total points.
     * pre: none
     * post: total points has been returned.
     * @return 
     */
    public int points(){
        return points;
    }
}
