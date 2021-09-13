import java.util.Scanner;
 
public class Wifi_Diagnosis 									//declare class for assignment 
{

	public static void main(String[] args) 
	{
		Scanner connectivity = new Scanner(System.in); 						//Declare scanner to read string userChoice
	
	String userChoice;   													//Declare strings
	String connectionMessage = "Are you able to connect to the internet? (Y / N):";
	
	System.out.println ("If you have a problem with internet connectivity,\nThis WiFi dianosis might work");
	System.out.println ("First step: Reboot your computer.");
	System.out.println (connectionMessage); 
	
	userChoice = connectivity.nextLine();									//Read userChoice
	
	if (userChoice.equals ("yes") || userChoice.equals ("y") )				// if  userChoice is yes or y
 		{
	 System.out.println ("Rebooting your computer seemed to work\n");
 		}
 	
 		else 																// else start step 2
 		{
 			System.out.println ("Second step: Reboot your router\n");
 			System.out.println (connectionMessage);
 			userChoice = connectivity.nextLine();							//read userChoice
 		
 			if (userChoice.equals ("yes") || userChoice.equals ("y") )		// if  userChoice is yes or y
 			{
 				System.out.println ("Rebooting your router seemed to work.");
 			}	
 			else 															//Else statement to start step 3 
 			{
 				System.out.println("Third step: Make sure the cables to your router are plugged in firmly and \nyour router is getting power\n");
 				System.out.println(connectionMessage);
 				userChoice = connectivity.nextLine();						//read userChoice//read userChoice
 				if (userChoice.equals ("yes") || userChoice.equals ("y") )	// if  userChoice is yes or y
 						{
 					System.out.println("Verifiyng your router connectivity seemed to work");
 						}
 				else														//Else statement to start step 4
 				{
 					System.out.println ("Fourth step: Move your computer closer to your router\n");
 					System.out.println (connectionMessage);					
 					userChoice = connectivity.nextLine();					//read userChoice
 					if (userChoice.equals ("yes") || userChoice.equals ("y") )		// if  userChoice is yes or y
 					{
 						System.out.println ("Moving your computer seemed to work\n");
 					}
 					else 
 					{
 						System.out.println ("Fifth step:Contect your ISP\nMake sure your ISP is hooked up to your router");
 					}
 				}															//End open else statements to complete full if-else statement
 			
 			
 			
 			}
 		}
	
	}
	
	
	
	
	
	
	
}
