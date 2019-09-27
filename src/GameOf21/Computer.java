/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameOf21;

/**
 *
 * @author leannekim
 */
public class Computer {
    private int cCard1;
    private int cCard2;  
    private int cCard3;
    private int cPoints;
    
    /**
     * constructor
     * pre: none
     * none: Computer Object is created.
     */
    public Computer(){
        cCard1 = 0;
        cCard2 = 0;
        cCard3 = 0;
        cPoints = 0;
    }
    
    /**
     * Return value of card1 of computer
     * pre: none
     * post: cCard1 is returned.
     * @return 
     */
    public int generateCard1() {
        cCard1 = (int)(Math.random() * 13 + 1);
        return cCard1;
    }

    /**
     * Return value of card2 of computer
     * pre: none
     * post: cCard2 is returned.
     * @return 
     */
    public int generateCard2() {
        cCard2 = (int)(Math.random() * 13 + 1);
        return cCard2;
    }

    /**
     * Return value of card3 of computer
     * pre: none
     * post: cCard3 is returned.
     * @return 
     */
    public int generateCard3() {
        cCard3 = (int)(Math.random() * 13 + 1);
        return cCard3;
    }
    
    /**
     * Determines how many points will be added, returns final points of computer.
     * pre: none
     * post: cPoints is returned.
     * @return 
     */
    public int total(){
        if (cCard1 >= 11 && cCard1 <= 13 ||
            cCard2 >= 11 && cCard2 <= 13 ||
            cCard3 >= 11 && cCard3 <= 13){
            cPoints += 10;
        } else if (cCard1 >= 2 && cCard1 <= 10){
            cPoints += cCard1;
        } else if (cCard2 >= 2 && cCard2 <= 10){
            cPoints += cCard2;
        } else if (cCard3 >= 2 && cCard3 <= 10){
            cPoints += cCard3;
        } else if (cCard1 == 1 || cCard2 == 1 || cCard3 == 1){
            int num = (int)(Math.random() * 2 + 1);
            if (num == 1){
                cPoints += 1;
            } else if (num == 2){
                cPoints += 11;
            }
        }
        return cPoints;
    }
    
}
