package main;
/**
 * This class is the main program that ask user what they want to do.
 */
import java.util.Scanner;


public class TimeEmail {
	public static void main(String[] args)
	{
	   DLL timeLine=new DLL();
	   Boolean quit=false;
	   System.out.println("Welcome to the timeemail system! You can read the message sent by yourself in the past,and also write a message to yourself that you can read in the future.");
	   System.out.println("Once the email is read, it will automatically deleted by the system.");
	   while(quit!=true)
	   {
		   Scanner in = new Scanner(System.in);
		   System.out.println("Do you want to read or write? Type in 1 for read and 2 for write.");//choose whether you want to read or write a email
		   System.out.println("If you want to quit the program, please type quit.");
		   String read_or_write = in.next();
		   if(read_or_write.equals("quit"))
		   {
			   quit=true;
			   continue;
		   }
		   if (read_or_write.equals("1")) { //if you choose to read
		    Scanner input = new Scanner(System.in);
		    System.out.println("Which year is this year?");
		    System.out.println("You could read email that is receive in this year and before.");
		    int year=input.nextInt();	    
		    System.out.println(timeLine.haveMessage(year));
		    if(timeLine.haveMessage(year).equals("There's no message yet, please write some message to yourself."))
		    	continue;
		    else
		    {
		    	System.out.println("Which year do you want to read?");
			    int yearR=input.nextInt();
			    System.out.println("Which month you want to read? ");
			    int month = input.nextInt();  
			    System.out.println("Do you want to read all of it or one specific message? Type in 1 for all the message and 2 for a specific one. ");
			    int specific = input.nextInt();
			    if(timeLine.detect(yearR, month)==true)
			    {
			    	if(specific==1 ){
				    	  System.out.println(timeLine.deleteAll(yearR, month));
				      }
					   
				      if (specific==2 ) {
				       System.out.println("Which message do you want to read? Type in numbers ");
				       int i = input.nextInt();
				       System.out.println(timeLine.delete(yearR, month, i));
				   }
			    }
				  else
				  {
					  System.out.println("There's no message at that time. Please write some message to yourself.");
				}
		    
		    
		    }
		   
		      
		  }
		    else if (read_or_write.equals("2")) {// if you choose to write
		     Scanner inn = new Scanner(System.in);
		     System.out.println("Which year and month do you want to read in the future?");
		     int year = inn.nextInt();
		     int month = inn.nextInt();
		     inn.nextLine();
		     System.out.println("What's your message?");
		     String message = inn.nextLine();
		     timeLine.insert(year, month, message);
		     System.out.println("Your message is recieved.\n");
		     }
		   }
	   System.out.println("Thanks for using our system!");
	   }
}
  

