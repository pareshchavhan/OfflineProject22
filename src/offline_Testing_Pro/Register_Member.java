package offline_Testing_Pro;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register_Member {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hi Login Register");

		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		ChromeDriver Reg = new ChromeDriver();

		//************This is for new user*****************\\
		Reg.get("file:///D:/Paresh/Seleniamsoft/other/Offline%20Website%20_%20new/index.html");
		Reg.manage().window().maximize();

       Reg.findElementByXPath("//*[@ href='pages/examples/register.html']").click();
       Reg.findElement(By.id("name")).sendKeys("Paresh");
       Reg.findElementByXPath("//*[@ type='text' and @id='mobile']").sendKeys("9822619535");
       Reg.findElementByXPath("//*[@ name='email' and @id='email' and @placeholder='Email']").sendKeys("pareshnnit@gmail.com");
       //Reg.findElementByXPath("//*[@ type='text' and @id='name']").sendKeys("chavha");
       Reg.findElementByXPath("//*[@ type='password']").sendKeys("chavhanp");
       Reg.findElementByXPath("//button[text()='Sign In']").click();
       //Reg.close();


		//***************************End of User Register****************\\


		//*************This is for Login*****************\\
		
		/*
		Reg.get("file:///D:/Paresh/Seleniamsoft/other/Offline%20Website%20_%20new/index.html");
        Reg.manage().window().maximize();
        
        Reg.findElementByXPath("//*[@type='text' ]").sendKeys("pareshnit@gmail.com");
        Reg.findElementByXPath("//*[@type='password']").sendKeys("chavhanp");
        Reg.findElementByXPath("//button[text()='Sign In']").click();
         */



		//*************This is End of Login**************\\
		
		//*****************This is add new user****************\\
		
		Reg.get("file:///D:/Paresh/Seleniamsoft/other/Offline%20Website%20_%20new/pages/examples/dashboard.html");
		Reg.findElementByXPath("//a[@href='users.html']").click();
		Reg.findElementByXPath("//button[text()='Add User']").click();
		Reg.findElementByXPath("//input[@placeholder='Username']").sendKeys("paresh chavhan");
		Reg.findElementByXPath("//input[@placeholder='Mobile']").sendKeys("917537");
		Reg.findElementByXPath("//input[@placeholder='Email']").sendKeys("chavhan@gmail.com");
		Reg.findElementByXPath("//input[@value='Male']").click();
		
		Select drop = new Select(Reg.findElementByXPath("//select[@class='form-control']"));
		drop.selectByVisibleText("Maharashtra");
		//drop.selectByValue("Maharashtra");
		//drop.selectByIndex(4);
		Reg.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("paresh");
		Reg.findElement(By.xpath("//button[text()='Submit']")).click();
		Reg.manage().window().maximize();
		//****************This is end of add new user**************\\
		Thread.sleep(5000);
		//Reg.quit();

	}

}
