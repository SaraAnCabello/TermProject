import java.util.Scanner;

public class FirstClass extends purchaseTicket {
	  {
	        for ( int count = 1; count <= 20; count++ )
	        {
	            if ( seating[count] == false )  // if false, then a seat is available for assignment
	            {
	                seating[count] = true;  // assign seat
	                System.out.printf("First Class. Seat# %d\n", count);
	                break;
	            }
	            else if ( seating[20] == true ) // If seating[20] is true then first class is fully booked
	            
	             if ( seating[40] == true) // If seating[40] is true then business is fully booked
	                  
	             if ( seating[60] == true) // If seating[60] is true then economy  is fully booked
		                {
	                    System.out.println("Sorry, flight fully booked.");
	                }
	            
	             else  // ask passenger if they would like an business ticket instead
	            	 {
	                    System.out.println("First Class is fully booked. Would you like Business? 1 for Yes 2 for No");
	                    int choice = input.nextInt();
	                    if ( choice == 1 )
	                    	 BusinessClass();
	                         start();
		                }
		            else // ask passenger if they would like an economy ticket instead
		                {
		                    System.out.println("Business Class is fully booked. Would you like Economy? 1 for Yes 2 for No");
	                    int choice = input.nextInt();
	                    	 if ( choice == 1 )
	                    		 EconomyClass();
	                    		start();
	                            
	                            
	                         }
	                         else
	                         {
	                            
	                             System.exit(0);
	                         }
	        }
	  }
}
	                     
	                 
	  