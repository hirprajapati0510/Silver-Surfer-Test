package com.testng.selenium.V1;


import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class login_paiment {

	@Test (enabled = true) 
	public void loggedin() throws Exception 
	{

	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	options.setAcceptInsecureCerts(true);

	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://paiment.webuildgreatsoftware.co.za/login");
	
	Thread.sleep(70000);
	//login
	WebElement username=driver.findElement(By.xpath("//input[@type='text']"));	
	username.sendKeys("hpraja157@ignitiongroup.co.za");
	WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("Password01");
	WebElement login=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section/div/div/div/div[2]/div/form/div[3]/button"));
	login.click();
	Thread.sleep(20000);
	WebElement Customers =driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[2]/button/div"));
	Customers.click();	
	Thread.sleep(20000);                               
	WebElement Accounts =driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[2]/div/div/div/div/div[1]"));
	Accounts.click();
	//driver.PageSource.Contains("Account Name");
//	String bodyText = driver.findElement(By.tagName("body")).getText();
//	Assert.assertTrue(bodyText.contains("Account Name"));
	//System.out.println("bodyText");
	Thread.sleep(50000);
	WebElement element = driver.findElement(By.className("mud-table-row"));
	if(element != null) {
	    System.out.println("Data Found");
	}
	WebElement profile = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/ul/li[2]"));
	profile.click();
	Thread.sleep(2000);
	WebElement signout = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/ul/li[2]/ul/li[2]/button"));
	signout.click();
	
	}
	
}
