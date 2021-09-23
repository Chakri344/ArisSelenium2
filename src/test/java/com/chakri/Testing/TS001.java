package com.chakri.Testing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS001 
{
	
	public WebDriver myD;
	
	@Test
	public void TS001() throws InterruptedException
	{
		System.out.println("Opening Browser");
		 System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		myD=new ChromeDriver();
		myD.get("https://www.amazon.in/");
		String vTitle=myD.getTitle();
		System.out.println("The Title is "+vTitle);
		Thread.sleep(5000);
		myD.close();
	}
		
	@BeforeTest
	public void openBrowser()
	{
	System.out.println("Before Test");
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		System.out.println("After Test");	
	}
	

}