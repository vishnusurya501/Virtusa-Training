package TestNG;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends screenshotTestNG implements ITestListener
{
	public void onTestStart(ITestResult result)
	{
		System.out.println("test case is starting");
	}
	public void onTestSuccess(ITestResult result)
	{
		
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("test failed - screenshot");
		try {
			getscreenshot();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult result)
	{
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	public void onStart(ITestResult result)
	{
		
	}
	public void onFinish(ITestResult result)
	{
		
	}
}
