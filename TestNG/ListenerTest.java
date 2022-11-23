package TestNG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerTest extends Base
{
	@Test
	public void app()
	{
		driver.get("https://www.amazon.com/");
		Assert.assertTrue(false);
	}

}