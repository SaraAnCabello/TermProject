import java.util.Scanner;

public class EconomyClass extends purchaseTicket {
	// assign an economy seat
  
    	        for ( int count = 41; count <= 60; count++ )
    	        {
    	            if ( seating[count] == false ) // if false, then a seat is available for assignment
    	            {
    	                seating[count] = true; // assign seat
    	                System.out.printf("Economy. Seat# %d\n", count);
    	                break;
    	            }
    	            else if ( seating[60] == true ) // If seating[60] is true then economy is fully booked
    	            {
    	            	if ( seating[40] == true) // If seating[40] is true then business class is fully booked
    	            	
    	            	if ( seating[20] == true) // If seating[20] is true then first class (and therefore whole flight) is fully booked
    	                {
    	                    System.out.println("Sorry, flight fully booked. Next flight is in 3 hours.");
    	                   
    	                }
    	                else // ask if passenger would like a first class ticket instead
    	                {
    	                    System.out.println("Economy is fully booked. Would you like Business Class? 1 for Yes 2 for No");
    	                    int choice = input.nextInt();
    	                    if ( choice == 1 )
    	                    {
    	                        BusinessClass();
    	                        start();
    	                    }
    	                    else {
    	                    System.out.println("Economy is fully booked. Would you like First Class? 1 for Yes 2 for No");
    	                    int choice = input.nextInt();
    	                    if ( choice == 1 )
    	                    {
    	                        FirstClass();
    	                        start();
    	                    }
    	                    else
    	                    
    	                        System.exit(0);
    	                    }
    	                }
    	            }
    	        }
    	        