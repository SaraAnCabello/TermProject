import java.util.Scanner;

public class purchaseTicket {

	String firstName = "";
	String lastName = "";
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
	
	

 public static void main(String args[]) {

		 System.out.println("please select '1' for 1st Class/n '2' for Bussiness Class/n '3' for Economy Class/n");
		 Scanner input = new Scanner(System.in);

		 int classChoice = input.nextInt().;

switch(classChoice) {

case 1: FirstClass();
break;
case 2: BusinessClass();
break;
case 3:EconomyClass();
break;
}


	 }
*/