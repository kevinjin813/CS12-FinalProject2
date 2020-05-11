package main;
/**
 * This class is the node class of the doublinked list, which store the years and arrange them in the correct order.
 */
import java.util.Arrays;

public class Year {
	Month[] months=new Month[13];
	Year next;
	Year prev;
	int year;
	/**
	 * Construct the year object
	 * @param year  the number of the year
	 */
	public Year(int year)
	{
		this.year=year;
	}
	/**
	 * Find out the x year
	 * @param x  the number of the year
	 * @return   the year object
	 */
	public boolean contain(int x)
	{
		if(months[x].num!=0)
		{
			return true;
		}
		else
			return false;
	}
	/**
	 * Take in the message and store them in the correct month.
	 * @param month  the number of month
	 * @param mail	 the message
	 */
	public void receiveLetter(int month,String mail)
	{
		if(months[month]==null)
		{
			months[month]=new Month(month);
		}		
		months[month].takeIn(mail);
	}
	/**
	 * Take out the ith letter
	 * @param month  the month of the letter	
	 * @param x   the x letter
	 * @return   the message
	 */
	public String takeithLetter(int month,int x)
	{
		String result=months[month].takeOut(x);
		months[month].delete(x);
		return result;
	}
	/**
	 * Take out all the letter in this month
	 * @param month  hte month of the letters
	 * @return   the messages stored
	 */
	public String takeAllLetter(int month)
	{
		String[] messages=months[month].takeAll();
		months[month].deleteAll();
		String result="";
		for(int i=0;i<=messages.length-1;i++)
		{
			result=result+messages[i];
		}
		return result;
	}
	/**
	 * Count how many message in this year
	 * @return  the number of messages in each month of the year
	 */
	public String count_message()
	{
		String result="";
		for(Month i:months)
		{	
			if(i!=null && i.num!=0)
			result=result+"In "+i.month+" "+year+", you have received "+i.num+" emails.\n";
		}
		return result;
	}
	/**
	 * Detect whether month y have letter
	 * @param y  month y	
	 * @return   have or not
	 */
	public boolean detect(int y)
	{
		if(months[y].num!=0)
		{
			return true;
		}
		else
			return false;
	}
}
