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
		if(month>12 || month<0)
		{
			throw new Exception();
		}
		months[month].takeIn(mail);
	}
}
