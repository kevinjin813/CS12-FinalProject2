package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.*;
public class DLLTest {
	@Test
	void test()
	{
		DLL timeLine=new DLL();
		timeLine.insert(2024, 11, "I am here for you");
		
		timeLine.insert(2024, 11, "I love you");
		//assertEquals("I love you",timeLine.delete(2024, 11, 1));
		timeLine.insert(2027, 9, "Where are you");
		assertEquals("Message 1 to you is: I am here for you\nMessage 2 to you is: I love you\n",timeLine.deleteAll(2024, 11));
	}
}
