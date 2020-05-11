package main;
/**
 * This class construct a doublinked list to store the year and arrange them in correct order.
 */
public class DLL {
	Year head;
	Year tail;
	int num;
	/**
	 * Construct the list
	 */
	public DLL()
	{
		head=null;
		tail=head;
		num=0;
	}
	/**
	 * Find out the x year
	 * @param x	the number of year
	 * @return  the year object
	 */
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
	/**
	 * Determine whether have this year
	 * @param x   the year
	 * @return   have or not
	 */
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
	/**
	 * Insert message to year x, month y
	 * @param x year
	 * @param y month
	 * @param message message to store
	 */
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
	/**
	 * Take out the ith message in year x month y and delete it
	 * @param x  year
	 * @param y  month
	 * @param i  the ith 
	 * @return
	 */
	public String delete(int x,int y,int i)
	{
		Year curr=contain(x);
		String result=curr.takeithLetter(y, i);
		return result;
	}
	/**
	 * Take out all message in year x month y and delete it
	 * @param x year
	 * @param y month
	 * @return  the messages
	 */
	public String deleteAll(int x,int y)
	{
		Year curr=contain(x);
		String result=curr.takeAllLetter(y);
		return result;
	}
	/**
	 * Find out how many message this year have
	 * @param x  the year
	 * @return   how many message each month of this year have
	 */
	public String haveMessage(int x)
	{
		if(head==null)
			return "There's no message yet, please write some message to yourself.";
		String result="";
		Year curr=head;
		result=result+curr.count_message();
		while(curr.next!=null && curr.next.year<=x)
		{
			curr=curr.next;
			result=result+curr.count_message();
		}
		return result;
	}
	/**
	 * Detect whether year x month y has message
	 * @param x year
	 * @param y month
	 * @return have or not
	 */
	public boolean detect(int x,int y)
	{
		if(!have(x))
		{
			return false;
		}
		else
		{
			return contain(x).detect(y);
		}
	}
}
