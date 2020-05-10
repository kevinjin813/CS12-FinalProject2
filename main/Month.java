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
