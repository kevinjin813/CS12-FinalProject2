package main;

import java.util.ArrayList;

public class Month {
	ArrayList<String> message=new ArrayList<String>();
	String month;
	int num;
	public Month(int month)
	{
		num=0;
	}
	public void takeIn(String message)
	{
		num=num++;
		this.message.add(num, message);
	}
	public String takeOut(int x)
	{
		String result="Message "+x+" to you is: "+message.get(x);
		return result;
	}
	public String[] takeAll()
	{
		String[] result=new String[num];
		int k=1;
		for(String i:message)
		{
		   result[k-1]="Message "+k+" to you is: "+i+"\n";
		}
		return result;
	}
	public void delete(int x)
	{
		message.remove(x);
		num--;
	}
	public void deleteAll()
	{
		message.clear();
		num=0;
	}
}
