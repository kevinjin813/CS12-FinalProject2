package main;

import java.util.Scanner;


public class TimeEmail {
	public static void main(String[] args)
	{
		DLL timeLine=new DLL();
		
   System.out.println("Welcome to the timeemail system! You can read the message sent by yourself in the past,and also write a message to yourself that you can read in the future.");
   System.out.println("Once the email is read, it will automatically deleted by the system.");
   Scanner in = new Scanner(System.in);
   System.out.println("Do you want to read or write? Type in 1 for read and 2 for write.");//choose whether you want to read or write a email
   String read_or_write = in.nextLine();

   if (read_or_write.equals("1")) { //if you choose to read
    Scanner input = new Scanner(System.in);
    System.out.println("Which year is this year?");
    int year=input.nextInt();
    System.out.println("You could email that is receive in this year and before.");
    System.out.println(timeLine.haveMessage(year));
    System.out.println("Which year do you want to read?");
    int yearR=input.nextInt();
    System.out.println("Which month you want to read? ");
    int month = input.nextInt();  
    System.out.println("Do you want to read all of it or one specific message? Type in 1 for alll the message and 2 for a specific one. ");
    String specific = input.nextLine();
      if(specific.equals("1")){
    	  
      }
	   
      if (specific.equals("2")) {
       Scanner iinput = new Scanner(System.in);
       System.out.println("Which message do you want to read? Type in numbers ");
       Integer monthasd = iinput.nextInt();
   }
  }
    else if (read_or_write.equals("2")) {
     Scanner inn = new Scanner(System.in);
     System.out.println("Which year and month do you want to read in the future?");
     Integer year = inn.nextInt();
     Integer month = inn.nextInt();
     Scanner innn = new Scanner(System.in);
     System.out.println("What's your message?");
     String message = innn.nextLine();
     }
   }
}
