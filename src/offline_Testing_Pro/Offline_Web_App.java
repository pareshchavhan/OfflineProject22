package offline_Testing_Pro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Offline_Web_App {
	ChromeDriver Offline;
	InternetExplorerDriver I;

    
   
	@BeforeTest
	@Parameters("name")
	public void browser(String Ch) {
System.out.println("in the browswr===1");
		/*System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		   Offline = new ChromeDriver();
		  Offline.get("file:///D:/Paresh/Seleniamsoft/other/Offline%20Website%20_%20new/index.html");
		  Offline.manage().window().maximize();
		 */



		if("chrome".equals(Ch))
		{
			System.out.println("in the browswr===11");
			
			System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
			Offline = new ChromeDriver();
			Offline.get("file:///F:/Paresh/Seleniamsoft/other/Offline%20Website%20_%20new/index.html");
		}
		 if("explorer".equals(Ch))
		{
			System.out.println("in the browswr===12");
			System.setProperty("webdriver.ie.driver", "Resources/IEDriverServer.exe");
			I =new InternetExplorerDriver();
			
			I.get("file:///F:/Paresh/Seleniamsoft/other/Offline%20Website%20_%20new/index.html");
			//I.get("D:\Paresh\Seleniamsoft\other\Offline Website _ new\index.html");
		}
		else
		{
			System.out.println("in the browswr=13");
			System.out.println("This is not available");	
		}

	}

	@Test
	public void f() {
		//register user
		System.out.println("in the browswr=111");
		
	
		Offline.findElementByXPath("//*[@ href='pages/examples/register.html']").click();  
		Offline.findElementByXPath("//*[@type='text' and @id='name']").sendKeys("sachin");
		Offline.findElementByXPath("//*[@ type='text' and @id='mobile']").sendKeys("9857468");
		Offline.findElementByXPath("//*[@type='text' and @id='email']").sendKeys("sachin@gmail.com");
		Offline.findElementByXPath("//*[@type='password']").sendKeys("sachin");
		Offline.findElementByXPath("//button[@type='submit']").click();
		//Alert alt = (Alert) Offline.switchTo();
		//String.alertText
		Offline.switchTo().alert().accept();

		//new user login     
		Offline.findElementByClassName("text-center").click();
		Offline.findElementByXPath("//*[@type='text' ]").sendKeys("kiran@gmail.com");
		Offline.findElementByXPath("//*[@type='password']").sendKeys("123456");
		Offline.findElementByXPath("//button[text()='Sign In']").click();
		// add user
		Offline.findElementByXPath("//a[@href='users.html']").click();
		Offline.findElementByXPath("//button[text()='Add User']").click();
		Offline.findElementByXPath("//input[@placeholder='Username']").sendKeys("paresh chavhan");
		Offline.findElementByXPath("//input[@placeholder='Mobile']").sendKeys("917537");
		Offline.findElementByXPath("//input[@placeholder='Email']").sendKeys("chavhan@gmail.com");
		Offline.findElementByXPath("//input[@value='Male']").click();
		Select drop = new Select(Offline.findElementByXPath("//select[@class='form-control']"));
		drop.selectByVisibleText("Maharashtra");


		//drop.selectByValue("Maharashtra");
		//drop.selectByIndex(4);

		Offline.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("paresh");
		Offline.findElement(By.xpath("//button[text()='Submit']")).click();
		Offline.switchTo().alert().accept();

		//for logout

		Offline.findElementByXPath("//a[text()='LOGOUT']").click();


	}


	@AfterTest
	public void afterClass() throws InterruptedException {
		System.out.println("in the browswr===14");
		Thread.sleep(5000);
		Offline.quit();
	}

}
