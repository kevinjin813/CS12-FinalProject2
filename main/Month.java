package main;

import java.util.ArrayList;

public class Month {
	ArrayList<String> message=new ArrayList<String>();
	String month;
	int num;
	public Month(int month)
	{
		num=0;
		if(month==1)
			this.month="January";
		if(month==2)
			this.month="February";
		if(month==3)
			this.month="March";
		if(month==4)
			this.month="April";
		if(month==5)
			this.month="May";
		if(month==6)
			this.month="June";
		if(month==7)
			this.month="July";
		if(month==8)
			this.month="August";
		if(month==9)
			this.month="September";
		if(month=10)
			this.month="October";
		if(month==11)
			this.month="November";
		if(month==12)
			this.month="December";
		
		
	}
	public void takeIn(String message)
	{
		num++;
		this.message.add(message);
	}
	public String takeOut(int x)
	{
		String result="Message "+x+" to you is: "+message.get(x-1);
		return result;
	}
	public String[] takeAll()
	{
		String[] result=new String[num];
		int k=1;
		for(String i:message)
		{
		   result[k-1]="Message "+k+" to you is: "+i+"\n";
		   k++;
		}
		return result;
	}
	public void delete(int x)
	{
		message.remove(x-1);
		num--;
	}
	public void deleteAll()
	{
		message.clear();
		num=0;
	}
}
