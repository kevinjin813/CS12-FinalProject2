package main;

import java.util.Arrays;

public class Year {
	Month[] months=new Month[13];
	Year next;
	Year prev;
	int year;
	public Year(int year)
	{
		this.year=year;
	}
	public boolean contain(int x)
	{
		if(months[x].num!=0)
		{
			return true;
		}
		else
			return false;
	}
	public void receiveLetter(int month,String mail)
	{
		if(months[month]==null)
		{
			months[month]=new Month(month);
		}		
		months[month].takeIn(mail);
	}
	public String takeithLetter(int month,int x)
	{
		String result=months[month].takeOut(x);
		months[month].delete(x);
		return result;
	}
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
	public String count_message()
	{
		String result="";
		for(Month i:months)
		{	
			if(i!=null)
			result=result+"In "+i.month+" "+year+", you have received "+i.num+" emails.\n";
		}
		return result;
	}
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
