package main;

public class DLL {
	Year head;
	Year tail;
	int num;
	
	public DLL()
	{
		head=null;
		tail=head;
		num=0;
	}
	public Year contain(int x)
	{
		Year temp=new Year(x);
		Year curr=head;
		while(curr!=null && curr.year!=x)
		{
			curr=curr.next;
		}
		if(curr!=temp)
		{
			return null;
		}
		else
		{
			return curr;
		}
		
	}
	
	public void insert(int x,int y,String message)
	{
		Year temp=new Year(x);
		Year curr=head;
		if(head==null)
		{
			head=temp;
		}
		
		if(contain(x)!=null)
		{
			curr=contain(x);
			curr.receiveLetter(y, message);			
		}
		if(contain(x)==null)
		{
			while(curr!=null && curr.year<x)
			{
				curr=curr.next;
			}
			temp.next=curr.next;
			curr.next.prev=temp;
			curr.next=temp;
			temp.prev=curr;
		}
	}
	public void delete(int x,int y,int i)
	{
		Year curr=contain(x);
		curr.takeithLetter(y, i);
		
	}
}