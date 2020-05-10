package main;

public class Year {
	Month[] months=new Month[12];
	Year next;
	Year prev;
	int year;
	public Year(int year)
	{
		this.year=year;
	}
	
	public void receiveLetter(int month,String mail)
	{
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
		return messages.toString();
	}
}
