/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adder;

/**
 *
 * @author leannekim
 */
public class Points {
    int points;
    
    /**
     * constructor
     * pre: none
     * post: Points Object is created.
     */
    public Points(){
        points = 0;
    }
    
    /**
     * if player gets it on the first try, adds 5 points
     * pre: none
     * post: 5 points are added.
     */
    public void first(){
        points += 5;
    }
    
    /**
     * if player gets it on the second try, adds 3 points
     * pre: none
     * post: 3 points are added.
     */
    public void second(){
        points += 3;
    }
    
    /**
     * if player gets it on the third try, adds 1 points
     * pre: none
     * post: 1 point1 is added.
     */
    public void third(){
        points += 1;
    }
    
    /**
     * Return total points.
     * pre: none
     * post: total points are returned.
     * @return 
     */
    public int getPoints(){
        return points;
    }
}
