/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GreenReview;
import java.lang.Math;
/**
 *
 * @author leannekim
 */
public class Coin {
    private int faceUp;
    
    public Coin (){
        faceUp = 0;
    }
    
    public int showFace(){
        return faceUp;
    }
    
    public int flipCoin(){
        int result = (int)(2*Math.random());
        return result;
    }
    
    public static void main(String[] args) {
        Coin nickel = new Coin();
        
        nickel.flipCoin();
        if (nickel.flipCoin() == 0){
            System.out.println("Heads up!");
        } else {
            System.out.println("Tails up!");
        }
    }
}
