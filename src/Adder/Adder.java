/*
 * Adder
 * Leanne Kim
 */
package Adder;

import java.util.Scanner;

/**
 *
 * @author leannekim
 */
public class Adder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int answer = 0, tries = 0;
        int total, num1, num2;
        Scanner input = new Scanner(System.in);
        Points points = new Points();
        
        do {
            // randomly generate two numbers
            num1 = (int) (Math.random() * 21 + 0); 
            num2 = (int) (Math.random() * 21 + 0);
            total = (num1 + num2); 
            
            System.out.print(num1 + " + " + num2 + " = ");
            answer = input.nextInt();
            
            if (answer == 999){ // answer to enter to exit the program
                System.out.println("Your score is: " + points.getPoints());
                return;
            }else if(answer == total){ 
                points.first();
            }else{
                System.out.print("Wrong answer. Enter another answer: "); 
                answer = input.nextInt();
                
                if (answer == total){ 
                    points.second();
                }else {
                    System.out.print("Wrong answer. Enter another answer: "); 
                    answer = input.nextInt();
                    
                    if (answer == total){ 
                        points.third();
                    }else {
                        System.out.println("Wrong answer. The correct answer is: " + total); 
                    }
                }
            }
            
        }while (answer != 999);
 
    }
    
}
