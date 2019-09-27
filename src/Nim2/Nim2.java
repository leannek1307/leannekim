/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim2;
import java.util.*;
/**
 *
 * @author leannekim
 */
public class Nim2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NimPlayer comp = new NimPlayer();
        int stonesLeft = (int)(Math.random()* 16) + 15;
        boolean turn = true; 

        
        while(stonesLeft > 0){
            if (turn){
                System.out.print("Enter number of stones to take: ");
                int userInput = input.nextInt();
                if(userInput == 1 || userInput == 2 || userInput == 3){
                    if (stonesLeft > userInput){
                        stonesLeft -= userInput;
                        turn = false;
                        
                        if (stonesLeft == 0){
                            System.out.println("Player 1 loses!");
                        }
                        System.out.println("You took " + userInput + " stones");
                        
                    } else {
                        System.out.println("Invalid input. Enter number that is less than or equal to the number of stones left.");
                    }
                } else {
                    System.out.println("Invalid input. You can only take 1, 2, or 3 stones.");
                }
            } else {
                turn = false;
                comp.updateStones(stonesLeft);
                
                stonesLeft -= comp.returnStones();// subtract that num from stonesLeft
                
                System.out.printf("Player 2 takes %d stones. \n", comp.returnStones());// return num of stones left
                
                if(stonesLeft == 0){
                    System.out.println("Player 2 loses!");
                    continue;
                }
            } System.out.println(stonesLeft + " stones left.");
        } input.close();
    }
}
