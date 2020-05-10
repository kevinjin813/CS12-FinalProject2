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
}
