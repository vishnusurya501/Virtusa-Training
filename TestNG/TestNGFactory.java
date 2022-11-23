package TestNG;

import org.hamcrest.Factory;

public class TestNGFactory 
{
	@Factory
	public Object[] factoryMethod()
	{
		return new Object[] {new Test2(0), new Test2(1)};
	}
}
