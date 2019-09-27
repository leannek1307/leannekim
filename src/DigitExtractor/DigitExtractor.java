/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DigitExtractor;

import java.util.Scanner;

/**
 *
 * @author leannekim
 */
public class DigitExtractor {
    private int whole = 0;
    private int ones = 0;
    private int tens = 0;
    private int hundreds = 0;
    
    
    /**
	 * constructor
	 * pre: input user typed in
	 * post: String DigitExtractor object created. Converts input to String, measure 
                 length of string. Assign values to variables for corresponding 
                 index number.
    */
    public DigitExtractor (int input){
        whole = input;
        String str = String.valueOf(input);
        if (str.length() == 1){
            ones = Integer.parseInt(str);
        } else if (str.length() == 2){
            tens = Integer.parseInt(str.substring(0, 1));
            ones = Integer.parseInt(str.substring(1, 2));
        } else if (str.length() == 3){
            hundreds = Integer.parseInt(str.substring(0, 1));
            tens = Integer.parseInt(str.substring(1, 2));
            ones = Integer.parseInt(str.substring(2, 3));
        }
    }
    
    /**
	 * Returns ones digit.
	 * pre: none
	 * post: Ones digit has been returned.
         * @return 
	 */
    public int getOnes(){
        return ones;
    }
    
    /**
	 * Returns ten's digit.
	 * pre: none
	 * post: Tens digit has been returned.
         * @return 
	 */
    public int getTens(){
        return tens;
    }
    
    /**
	 * Returns the hundreds digit.
	 * pre: none
	 * post: hundreds digit has been returned.
         * @return 
	 */
    public int getHundreds(){
        return hundreds;
    }
    
    /**
	 * Returns the whole number.
	 * pre: none
	 * post: Whole number has been returned.
         * @return 
	 */
    public int getWhole(){
        return whole;
    }
   
    public static void main(String[] args) {
    // num object that can return the ones digint, tens digit, hundreds digit, and whole number.
        DigitExtractor num;
        char choice;
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter an integer: ");
        num = new DigitExtractor(input.nextInt());

        // user choses output option. will escape loop if 'q' is entered.
        do{
            System.out.println("show (W)hole number. \nshow (O)nes place number. \nshow (T)ens place number. \nshow (H)undreds place number.\n(Q)uit");
            System.out.print("Enter your choice: ");
            choice = input.next().charAt(0);

            switch (choice) {
                case 'w':
                    System.out.println("The whole number is: " + num.getWhole());
                    break;
                case 'o':
                    System.out.println("The ones place digit is: " + num.getOnes());
                    break;
                case 't':
                    System.out.println("The tens place digit is: " + num.getTens());
                    break;
                case 'h':
                    System.out.println("The hundreds place digit is: " + num.getHundreds());
                    break;
                default:
                    break;
            }
        } while (choice != 'q');
    }
}
