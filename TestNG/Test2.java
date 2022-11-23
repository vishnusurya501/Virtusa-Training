package TestNG;

import org.junit.Test;

public class Test2 
{
	private int value;
	
	public Test2(int a)
	{
	   System.out.println(" value is "+value);
	   this.value =value;
	}
	@Test
	public void testMethodOne()
	{
		int opvalue=value+1;
		System.out.println("Test method one "+opvalue);
	}
	@Test
	public void testMethodTwo()
	{
		int opvalue=value+2;
		System.out.println("Test method two "+opvalue);
	}

}
