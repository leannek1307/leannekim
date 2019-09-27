/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim2;
import java.lang.Math;
import java.util.*;
/**
 *
 * @author leannekim
 */
public class NimPlayer {
    private int stonesTaken;
    private Random rnd;
    
    /**
     * constructor
     * pre: none
     * post: NimPlayer Object is created.
     */
    public NimPlayer(){
        stonesTaken = (int)(Math.random() * 3 + 1);
    }
    
    /**
     * Return stonesTaken
     * pre: none
     * post: number of stones taken is returned.
     * @return 
     */
    public int returnStones(){
        return stonesTaken;
         
    }
    
    /**
     * computer takes stone, update number of stones
     * pre: max (stonesLeft value)
     * post: number of stones are updated.
     * @param max 
     */
    public void updateStones(int max){ // stonesLeft = max
        // maximum amount of stones that the computer can take is stonesLeft if max > 3.
        this.stonesTaken = (max > 3)? rnd.nextInt(3)+1 : rnd.nextInt(max)+1;
    }
    
    
}
