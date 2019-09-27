/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySavings;

/**
 *
 * @author leannekim
 */


public class PiggyBank {
    private double total, decrease;
    private int user;
    
    
    /**
     * constructor
     * pre: none
     * post: PiggyBank Object is created.
     */
    public PiggyBank(){
        total = 0;
        decrease = 0;
    }
    
    /**
     * value of the coins are added
     * pre: user
     * post: value is added to the total
     * @param user 
     */
    public void addCoin(int user){
        this.user = user;
        if (user == 2){
            total += 0.01;
        } else if (user == 3){
            total += 0.05;
        } else if (user == 4){
            total += 0.10;
        } else {
            total += 0.25;
        }
    }
    
    /**
     * decrease total by the decrease value
     * pre: decrease value
     * post: total amount is decreased.
     * @param decrease 
     */
    public void removeCoin(int decrease){
        this.decrease = decrease;
        total -= decrease;
    }
    
    /**
     * Returns total
     * pre: none
     * post: total is returned.
     * @return 
     */
    public double showTotal(){
        return total;
    }
}
