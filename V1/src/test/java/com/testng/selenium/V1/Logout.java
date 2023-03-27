package com.testng.selenium.V1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
	
	WebDriver driver;
	By Profile = By.xpath("//*[@id=\"logOutUser\"]");
	By logout = By.xpath("//*[@id=\"wrapper\"]/table/tbody/tr[1]/td/div/nav/ul/li/ul/li[3]/a");
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public Logout(WebDriver driver) 
	{
          this.driver = driver;
	}
	
	public void clickLogout() throws InterruptedException
	{
		driver.findElement(Profile).click();
		driver.findElement(logout).click();
	}
	
	
}
