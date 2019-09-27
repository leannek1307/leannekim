/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameOf21;

import java.util.Scanner;

/**
 *
 * @author leannekim
 */
public class GameOf21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cardInput;
        char gameInput = 'c';
        
        while (gameInput != 's'){
            Player player = new Player();
            Computer computer = new Computer();

            System.out.println("First card: " + player.generateCard1());
            System.out.println("Second card: " + player.generateCard2());

            System.out.println("Draw another card? 1 for YES, 2 for NO: ");
            cardInput = input.nextInt();

            if (cardInput == 1){    // will execute only when the user chooses to draw a third card
                System.out.println("Third card: " + player.generateCard3());
            }


            System.out.println("Computer drew: " + computer.generateCard1() + ", " + computer.generateCard2());
            System.out.println(player.winner(computer.total()));

            System.out.println("Press (S)top or (C)ontinue: "); // play one more time?
            gameInput = input.next().charAt(0);

            if (gameInput == 's'){
                return;
            }
        }
        
    
    }
}
