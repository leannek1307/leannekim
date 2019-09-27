 /**
 * Customer class.
 */
package Bank;

import java.util.Scanner;

public class Customer {
	private String firstName, lastName, street, city, state, zip;
		
	
	/**
	 * constructor
	 * pre: none
	 * post: A Customer object has been created. 
	 * Customer data has been initialized with parameters.
	 */
	public Customer(String fName, String lName, String str, String c, String s, String z) {
            firstName = fName;
            lastName = lName;
            street = str;
            city = c;
            state = s;
            zip = z;
	}
        
        /**
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Account object has 
	 * been returned.
	 */
	public String toString() {
		String custString;
	
		custString = firstName + " " + lastName + "\n";
		custString += street + "\n";
		custString += city + ", " + state + "  " + zip + "\n";
	 	return(custString);
        }
        
        
        public void changeStreet(String street){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Street: ");
            this.street = input.nextLine();
        }

        public void changeCity(String city){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter City: ");
            this.city = input.nextLine();
        }
        
        public void changeState(String state){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter State: ");
            this.state = input.nextLine();
        }
        
        public void changeZip(String zip){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Zip code: ");
            this.zip = input.nextLine();
        }
	
	 
}
