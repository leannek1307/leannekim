/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bowling;

/**
 *
 * @author leannekim
 */
public class Bowler {
    private int score, try1, try2;
    private int pins;
    
    /**
     * constructor
     * pre: none
     * post: Bowler Object is created.
     */
    public Bowler (){
        score = 0;
    }
    
    /**
     * Determines how many pins are knocked down.
     * pre: none
     * post: number of pins knocked down
     */
    public void pins (){
        try1 = (int) (Math.random() * 11); //random numnber of pins to knock down
        pins = 10;
        
        if (try1 == pins){ //spare on the first turn, second turn is skipped
            pins -= try1;
            score += 20;
            System.out.println("Try 1: " + try1 + " pins knocked down.");
        }else{
            pins -= try1; //not a spare
            System.out.println("Try 1: " + try1 + " pins knocked down.");
            try2 = (int) (Math.random() * (pins + 1)); //turn 2
            
            if (try2 == pins){ //spare on the second turn
                pins -= try2;
                score += 15;
                System.out.println("Try 2: " + try2 + " pins knocked down.");
            }else{
                pins -= try2; //not a spare on the second turn
                score += (10 - pins); //score is based off the number of pins that were knocked down if spare didnt happen on either turn
                System.out.println("Try 2: " + try2 + " pins knocked down.");
            }
            
        }
    }
    
    /**
     * Returns score
     * pre: none
     * post: score is returned.
     * @return 
     */
    public int getScore (){
        return score;
    }
    
}
