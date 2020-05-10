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
		while(curr!=null && curr.year!=temp.year)
		{
			curr=curr.next;
		}
		if(curr==null)
		{
			return null;
		}
		else if(curr.year!=x)
		{
			return null;
		}
		else
		{
			return curr;
		}
		
	}
	public boolean have(int x)
	{
		if(contain(x)==null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public void insert(int x,int y,String message)
	{
		Year temp=new Year(x);
		Year curr=head;
		if(head==null)
		{
			head=temp;
			tail=temp;
		}
		if(head.year>x)
		{
			temp.next=curr.next;
			temp.prev=curr.prev;
			curr.prev=temp;
			head=temp;
		}
		if(contain(x)!=null)
		{
			curr=contain(x);
			curr.receiveLetter(y, message);			
		}
		if(contain(x)==null)
		{
			while(curr.next!=null && curr.year<x)
			{
				curr=curr.next;
			}
			temp.next=curr.next;
			if(curr.next==null)
			{
				curr.next=temp;
				temp.prev=curr;
				tail=temp;
			}
			else
			{
				curr.next.prev=temp;
				curr.next=temp;
				temp.prev=curr;
			}
			temp.receiveLetter(y, message);	
		}
		
	}
	public String delete(int x,int y,int i)
	{
		Year curr=contain(x);
		String result=curr.takeithLetter(y, i);
		return result;
	}
	public String deleteAll(int x,int y)
	{
		Year curr=contain(x);
		String result=curr.takeAllLetter(y);
		return result;
	}
}
